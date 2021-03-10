// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateUploadOSSFileJobShrinkRequest extends TeaModel {
    @NameInMap("FileSource")
    public String fileSource;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("UploadType")
    public String uploadType;

    @NameInMap("UploadTarget")
    public String uploadTargetShrink;

    @NameInMap("Tid")
    public Long tid;

    public static CreateUploadOSSFileJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadOSSFileJobShrinkRequest self = new CreateUploadOSSFileJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateUploadOSSFileJobShrinkRequest setFileSource(String fileSource) {
        this.fileSource = fileSource;
        return this;
    }
    public String getFileSource() {
        return this.fileSource;
    }

    public CreateUploadOSSFileJobShrinkRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateUploadOSSFileJobShrinkRequest setUploadType(String uploadType) {
        this.uploadType = uploadType;
        return this;
    }
    public String getUploadType() {
        return this.uploadType;
    }

    public CreateUploadOSSFileJobShrinkRequest setUploadTargetShrink(String uploadTargetShrink) {
        this.uploadTargetShrink = uploadTargetShrink;
        return this;
    }
    public String getUploadTargetShrink() {
        return this.uploadTargetShrink;
    }

    public CreateUploadOSSFileJobShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
