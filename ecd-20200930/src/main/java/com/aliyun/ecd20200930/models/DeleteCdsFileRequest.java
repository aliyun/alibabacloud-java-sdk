// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteCdsFileRequest extends TeaModel {
    @NameInMap("CdsId")
    public String cdsId;

    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("FileId")
    public String fileId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteCdsFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCdsFileRequest self = new DeleteCdsFileRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCdsFileRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public DeleteCdsFileRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public DeleteCdsFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public DeleteCdsFileRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
