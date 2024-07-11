// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateUploadOSSFileJobShrinkRequest extends TeaModel {
    /**
     * <p>The name of the file.</p>
     * <blockquote>
     * <p>The file name must end with .txt or .sql. For example, the file name can be text.txt.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test.sql</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The purpose of the file upload task. Valid values:</p>
     * <ul>
     * <li><strong>datacorrect</strong>: The file is uploaded to change data.</li>
     * <li><strong>order_info_attachment</strong>: The file is uploaded as an attachment in a ticket.</li>
     * <li><strong>big-file</strong>: The file is uploaded to import multiple data records at a time.</li>
     * <li><strong>sqlreview</strong>: The file is uploaded for SQL review.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>datacorrect</p>
     */
    @NameInMap("FileSource")
    public String fileSource;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p>To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the &quot;View information about the current tenant&quot; section of the <a href="https://help.aliyun.com/document_detail/181330.html">Manage DMS tenants</a> topic.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The information about the OSS file to be uploaded.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UploadTarget")
    public String uploadTargetShrink;

    public static CreateUploadOSSFileJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadOSSFileJobShrinkRequest self = new CreateUploadOSSFileJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateUploadOSSFileJobShrinkRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateUploadOSSFileJobShrinkRequest setFileSource(String fileSource) {
        this.fileSource = fileSource;
        return this;
    }
    public String getFileSource() {
        return this.fileSource;
    }

    public CreateUploadOSSFileJobShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public CreateUploadOSSFileJobShrinkRequest setUploadTargetShrink(String uploadTargetShrink) {
        this.uploadTargetShrink = uploadTargetShrink;
        return this;
    }
    public String getUploadTargetShrink() {
        return this.uploadTargetShrink;
    }

}
