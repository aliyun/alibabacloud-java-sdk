// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class MoveCdsFileRequest extends TeaModel {
    @NameInMap("CdsId")
    public String cdsId;

    @NameInMap("ConflictPolicy")
    public String conflictPolicy;

    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("FileId")
    public String fileId;

    @NameInMap("ParentFolderId")
    public String parentFolderId;

    @NameInMap("RegionId")
    public String regionId;

    public static MoveCdsFileRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveCdsFileRequest self = new MoveCdsFileRequest();
        return TeaModel.build(map, self);
    }

    public MoveCdsFileRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public MoveCdsFileRequest setConflictPolicy(String conflictPolicy) {
        this.conflictPolicy = conflictPolicy;
        return this;
    }
    public String getConflictPolicy() {
        return this.conflictPolicy;
    }

    public MoveCdsFileRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public MoveCdsFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public MoveCdsFileRequest setParentFolderId(String parentFolderId) {
        this.parentFolderId = parentFolderId;
        return this;
    }
    public String getParentFolderId() {
        return this.parentFolderId;
    }

    public MoveCdsFileRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
