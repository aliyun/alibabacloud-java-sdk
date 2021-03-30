// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateUploadFileJobRequest extends TeaModel {
    @NameInMap("FileSource")
    public String fileSource;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("UploadURL")
    public String uploadURL;

    @NameInMap("Tid")
    public Long tid;

    public static CreateUploadFileJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadFileJobRequest self = new CreateUploadFileJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateUploadFileJobRequest setFileSource(String fileSource) {
        this.fileSource = fileSource;
        return this;
    }
    public String getFileSource() {
        return this.fileSource;
    }

    public CreateUploadFileJobRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateUploadFileJobRequest setUploadURL(String uploadURL) {
        this.uploadURL = uploadURL;
        return this;
    }
    public String getUploadURL() {
        return this.uploadURL;
    }

    public CreateUploadFileJobRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
