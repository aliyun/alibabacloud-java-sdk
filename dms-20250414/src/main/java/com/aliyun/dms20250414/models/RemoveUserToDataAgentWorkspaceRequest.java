// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class RemoveUserToDataAgentWorkspaceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DMSUnit")
    public String DMSUnit;

    /**
     * <strong>example:</strong>
     * <p>21482*****7584</p>
     */
    @NameInMap("MemberId")
    public String memberId;

    /**
     * <strong>example:</strong>
     * <p>20923*****7291</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RemoveUserToDataAgentWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserToDataAgentWorkspaceRequest self = new RemoveUserToDataAgentWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public RemoveUserToDataAgentWorkspaceRequest setDMSUnit(String DMSUnit) {
        this.DMSUnit = DMSUnit;
        return this;
    }
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    public RemoveUserToDataAgentWorkspaceRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public RemoveUserToDataAgentWorkspaceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
