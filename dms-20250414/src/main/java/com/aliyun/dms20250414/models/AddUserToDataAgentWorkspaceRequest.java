// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AddUserToDataAgentWorkspaceRequest extends TeaModel {
    /**
     * <p>The current DMS unit.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DMSUnit")
    public String DMSUnit;

    /**
     * <p>The Alibaba Cloud UID of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>20282*****7591</p>
     */
    @NameInMap("MemberId")
    public String memberId;

    /**
     * <p>The name of the user\&quot;s role in the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20923*****7291</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static AddUserToDataAgentWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserToDataAgentWorkspaceRequest self = new AddUserToDataAgentWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public AddUserToDataAgentWorkspaceRequest setDMSUnit(String DMSUnit) {
        this.DMSUnit = DMSUnit;
        return this;
    }
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    public AddUserToDataAgentWorkspaceRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public AddUserToDataAgentWorkspaceRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public AddUserToDataAgentWorkspaceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
