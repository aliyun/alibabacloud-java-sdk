// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateUploadOSSFileJobShrinkRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileSource")
    public String fileSource;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Tid")
    public Long tid;

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

    public CreateUploadOSSFileJobShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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
