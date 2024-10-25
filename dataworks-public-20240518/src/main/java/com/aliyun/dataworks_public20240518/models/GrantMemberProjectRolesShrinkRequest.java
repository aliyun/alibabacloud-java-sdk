// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GrantMemberProjectRolesShrinkRequest extends TeaModel {
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
    public String roleCodesShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123422344899</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static GrantMemberProjectRolesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantMemberProjectRolesShrinkRequest self = new GrantMemberProjectRolesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GrantMemberProjectRolesShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GrantMemberProjectRolesShrinkRequest setRoleCodesShrink(String roleCodesShrink) {
        this.roleCodesShrink = roleCodesShrink;
        return this;
    }
    public String getRoleCodesShrink() {
        return this.roleCodesShrink;
    }

    public GrantMemberProjectRolesShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
