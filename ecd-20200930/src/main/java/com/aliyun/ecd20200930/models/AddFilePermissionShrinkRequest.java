// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AddFilePermissionShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the cloud disk whose folder you want to share.</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>The ID of the end user who uses the cloud disk of the folder.</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The ID of the file.</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <p>The members who are granted the folder permissions.</p>
     */
    @NameInMap("MemberList")
    public String memberListShrink;

    /**
     * <p>The region ID of the folder. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AddFilePermissionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFilePermissionShrinkRequest self = new AddFilePermissionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddFilePermissionShrinkRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public AddFilePermissionShrinkRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public AddFilePermissionShrinkRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public AddFilePermissionShrinkRequest setMemberListShrink(String memberListShrink) {
        this.memberListShrink = memberListShrink;
        return this;
    }
    public String getMemberListShrink() {
        return this.memberListShrink;
    }

    public AddFilePermissionShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
