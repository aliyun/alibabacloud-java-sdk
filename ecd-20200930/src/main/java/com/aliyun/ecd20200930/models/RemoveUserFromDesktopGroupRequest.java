// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RemoveUserFromDesktopGroupRequest extends TeaModel {
    /**
     * <p>The ID of the shared cloud desktop from which you revoke the user’s permission.</p>
     * 
     * <strong>example:</strong>
     * <p>dg-2i8qxpv6t1a03****</p>
     */
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    /**
     * <p>A list of shared desktop group IDs.</p>
     */
    @NameInMap("DesktopGroupIds")
    public java.util.List<String> desktopGroupIds;

    /**
     * <p>The list of authorized users to remove.</p>
     */
    @NameInMap("EndUserIds")
    public java.util.List<String> endUserIds;

    @NameInMap("OrgId")
    public String orgId;

    /**
     * <p>The region ID. Call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to get a list of regions where WUYING Workspace is available.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SimpleUserGroupId")
    public String simpleUserGroupId;

    @NameInMap("UserGroupName")
    public String userGroupName;

    @NameInMap("UserOuPath")
    public String userOuPath;

    public static RemoveUserFromDesktopGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserFromDesktopGroupRequest self = new RemoveUserFromDesktopGroupRequest();
        return TeaModel.build(map, self);
    }

    public RemoveUserFromDesktopGroupRequest setDesktopGroupId(String desktopGroupId) {
        this.desktopGroupId = desktopGroupId;
        return this;
    }
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    public RemoveUserFromDesktopGroupRequest setDesktopGroupIds(java.util.List<String> desktopGroupIds) {
        this.desktopGroupIds = desktopGroupIds;
        return this;
    }
    public java.util.List<String> getDesktopGroupIds() {
        return this.desktopGroupIds;
    }

    public RemoveUserFromDesktopGroupRequest setEndUserIds(java.util.List<String> endUserIds) {
        this.endUserIds = endUserIds;
        return this;
    }
    public java.util.List<String> getEndUserIds() {
        return this.endUserIds;
    }

    public RemoveUserFromDesktopGroupRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public RemoveUserFromDesktopGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RemoveUserFromDesktopGroupRequest setSimpleUserGroupId(String simpleUserGroupId) {
        this.simpleUserGroupId = simpleUserGroupId;
        return this;
    }
    public String getSimpleUserGroupId() {
        return this.simpleUserGroupId;
    }

    public RemoveUserFromDesktopGroupRequest setUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
        return this;
    }
    public String getUserGroupName() {
        return this.userGroupName;
    }

    public RemoveUserFromDesktopGroupRequest setUserOuPath(String userOuPath) {
        this.userOuPath = userOuPath;
        return this;
    }
    public String getUserOuPath() {
        return this.userOuPath;
    }

}
