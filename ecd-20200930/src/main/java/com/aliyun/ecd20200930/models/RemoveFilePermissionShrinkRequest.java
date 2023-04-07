// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RemoveFilePermissionShrinkRequest extends TeaModel {
    @NameInMap("CdsId")
    public String cdsId;

    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("FileId")
    public String fileId;

    @NameInMap("MemberList")
    public String memberListShrink;

    @NameInMap("RegionId")
    public String regionId;

    public static RemoveFilePermissionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveFilePermissionShrinkRequest self = new RemoveFilePermissionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoveFilePermissionShrinkRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public RemoveFilePermissionShrinkRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public RemoveFilePermissionShrinkRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public RemoveFilePermissionShrinkRequest setMemberListShrink(String memberListShrink) {
        this.memberListShrink = memberListShrink;
        return this;
    }
    public String getMemberListShrink() {
        return this.memberListShrink;
    }

    public RemoveFilePermissionShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
