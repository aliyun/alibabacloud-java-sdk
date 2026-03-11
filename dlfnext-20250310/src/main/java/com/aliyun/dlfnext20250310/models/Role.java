// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class Role extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1744970111419</p>
     */
    @NameInMap("createdAt")
    public Long createdAt;

    /**
     * <strong>example:</strong>
     * <p>acs:ram::[accountId]:root</p>
     */
    @NameInMap("createdBy")
    public String createdBy;

    /**
     * <strong>example:</strong>
     * <p>role_description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>role_display_name</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isPredefined")
    public String isPredefined;

    /**
     * <strong>example:</strong>
     * <p>role_name</p>
     */
    @NameInMap("roleName")
    public String roleName;

    /**
     * <strong>example:</strong>
     * <p>acs:dlf::[accountId]:role/role_name</p>
     */
    @NameInMap("rolePrincipal")
    public String rolePrincipal;

    /**
     * <strong>example:</strong>
     * <p>1744970111419</p>
     */
    @NameInMap("updatedAt")
    public Long updatedAt;

    /**
     * <strong>example:</strong>
     * <p>acs:ram::[accountId]:root</p>
     */
    @NameInMap("updatedBy")
    public String updatedBy;

    @NameInMap("users")
    public java.util.List<User> users;

    public static Role build(java.util.Map<String, ?> map) throws Exception {
        Role self = new Role();
        return TeaModel.build(map, self);
    }

    public Role setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public Role setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public Role setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Role setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public Role setIsPredefined(String isPredefined) {
        this.isPredefined = isPredefined;
        return this;
    }
    public String getIsPredefined() {
        return this.isPredefined;
    }

    public Role setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public Role setRolePrincipal(String rolePrincipal) {
        this.rolePrincipal = rolePrincipal;
        return this;
    }
    public String getRolePrincipal() {
        return this.rolePrincipal;
    }

    public Role setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public Role setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public Role setUsers(java.util.List<User> users) {
        this.users = users;
        return this;
    }
    public java.util.List<User> getUsers() {
        return this.users;
    }

}
