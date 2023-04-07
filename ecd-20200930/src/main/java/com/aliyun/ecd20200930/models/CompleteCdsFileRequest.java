// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CompleteCdsFileRequest extends TeaModel {
    @NameInMap("CdsId")
    public String cdsId;

    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("FileId")
    public String fileId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UploadId")
    public String uploadId;

    public static CompleteCdsFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CompleteCdsFileRequest self = new CompleteCdsFileRequest();
        return TeaModel.build(map, self);
    }

    public CompleteCdsFileRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public CompleteCdsFileRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public CompleteCdsFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public CompleteCdsFileRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CompleteCdsFileRequest setUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public String getUploadId() {
        return this.uploadId;
    }

}
