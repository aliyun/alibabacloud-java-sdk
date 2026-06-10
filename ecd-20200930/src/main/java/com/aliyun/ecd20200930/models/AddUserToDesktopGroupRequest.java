// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AddUserToDesktopGroupRequest extends TeaModel {
    /**
     * <p>A client token that ensures the idempotence of a request. Generate a unique value for this parameter from your client. The token can contain only ASCII characters and must be no more than 64 characters long. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the shared cloud desktop to which to add an authorized user.</p>
     * 
     * <strong>example:</strong>
     * <p>dg-2i8qxpv6t1a03****</p>
     */
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    /**
     * <p>A list of shared cloud desktop group IDs.</p>
     */
    @NameInMap("DesktopGroupIds")
    public java.util.List<String> desktopGroupIds;

    /**
     * <p>A list of users to authorize.</p>
     */
    @NameInMap("EndUserIds")
    public java.util.List<String> endUserIds;

    @NameInMap("OrgId")
    public String orgId;

    /**
     * <p>The region ID. Call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to obtain a list of regions where WUYING Workspace is available.</p>
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

    public static AddUserToDesktopGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserToDesktopGroupRequest self = new AddUserToDesktopGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddUserToDesktopGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddUserToDesktopGroupRequest setDesktopGroupId(String desktopGroupId) {
        this.desktopGroupId = desktopGroupId;
        return this;
    }
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    public AddUserToDesktopGroupRequest setDesktopGroupIds(java.util.List<String> desktopGroupIds) {
        this.desktopGroupIds = desktopGroupIds;
        return this;
    }
    public java.util.List<String> getDesktopGroupIds() {
        return this.desktopGroupIds;
    }

    public AddUserToDesktopGroupRequest setEndUserIds(java.util.List<String> endUserIds) {
        this.endUserIds = endUserIds;
        return this;
    }
    public java.util.List<String> getEndUserIds() {
        return this.endUserIds;
    }

    public AddUserToDesktopGroupRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public AddUserToDesktopGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddUserToDesktopGroupRequest setSimpleUserGroupId(String simpleUserGroupId) {
        this.simpleUserGroupId = simpleUserGroupId;
        return this;
    }
    public String getSimpleUserGroupId() {
        return this.simpleUserGroupId;
    }

    public AddUserToDesktopGroupRequest setUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
        return this;
    }
    public String getUserGroupName() {
        return this.userGroupName;
    }

    public AddUserToDesktopGroupRequest setUserOuPath(String userOuPath) {
        this.userOuPath = userOuPath;
        return this;
    }
    public String getUserOuPath() {
        return this.userOuPath;
    }

}
