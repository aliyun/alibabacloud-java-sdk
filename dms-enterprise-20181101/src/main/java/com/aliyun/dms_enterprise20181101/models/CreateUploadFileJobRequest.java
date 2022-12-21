// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateUploadFileJobRequest extends TeaModel {
    // The name of the attachment file.
    // 
    // >  The file name must end with .txt or .sql. For example, the file name can be test.txt or test.sql.
    @NameInMap("FileName")
    public String fileName;

    // The purpose of the attachment file. Valid values:
    // 
    // *   **datacorrect**: The file is uploaded to change data.
    // *   **order_info_attachment**: The file is uploaded as an attachment in a ticket.
    // *   **big-file**: The file is uploaded to import multiple data records at a time.
    // *   **sqlreview**: The file is uploaded for SQL review.
    @NameInMap("FileSource")
    public String fileSource;

    // The ID of the tenant.
    // 
    // >  You can call the [GetUserActiveTenant](~~198073~~) operation to query the tenant ID.
    @NameInMap("Tid")
    public Long tid;

    // The URL of the attachment file. The URL must be an HTTP URL or an HTTPS URL.
    // 
    // >  You can upload the attachment file to an Object Storage Service (OSS) bucket and obtain the URL of the file in the OSS console. For more information, see [Share objects](~~195674~~).
    @NameInMap("UploadURL")
    public String uploadURL;

    public static CreateUploadFileJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadFileJobRequest self = new CreateUploadFileJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateUploadFileJobRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateUploadFileJobRequest setFileSource(String fileSource) {
        this.fileSource = fileSource;
        return this;
    }
    public String getFileSource() {
        return this.fileSource;
    }

    public CreateUploadFileJobRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public CreateUploadFileJobRequest setUploadURL(String uploadURL) {
        this.uploadURL = uploadURL;
        return this;
    }
    public String getUploadURL() {
        return this.uploadURL;
    }

}
