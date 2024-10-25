// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RevokeMemberProjectRolesShrinkRequest extends TeaModel {
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

    public static RevokeMemberProjectRolesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeMemberProjectRolesShrinkRequest self = new RevokeMemberProjectRolesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RevokeMemberProjectRolesShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public RevokeMemberProjectRolesShrinkRequest setRoleCodesShrink(String roleCodesShrink) {
        this.roleCodesShrink = roleCodesShrink;
        return this;
    }
    public String getRoleCodesShrink() {
        return this.roleCodesShrink;
    }

    public RevokeMemberProjectRolesShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
