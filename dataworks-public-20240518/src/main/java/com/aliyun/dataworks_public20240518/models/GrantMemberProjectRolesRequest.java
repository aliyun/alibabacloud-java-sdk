// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GrantMemberProjectRolesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>105149</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RoleCodes")
    public java.util.List<String> roleCodes;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123422344899</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static GrantMemberProjectRolesRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantMemberProjectRolesRequest self = new GrantMemberProjectRolesRequest();
        return TeaModel.build(map, self);
    }

    public GrantMemberProjectRolesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GrantMemberProjectRolesRequest setRoleCodes(java.util.List<String> roleCodes) {
        this.roleCodes = roleCodes;
        return this;
    }
    public java.util.List<String> getRoleCodes() {
        return this.roleCodes;
    }

    public GrantMemberProjectRolesRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
