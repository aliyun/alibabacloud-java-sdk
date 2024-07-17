// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class Role extends TeaModel {
    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>显示名称，允许中文</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("IsPredefined")
    public Integer isPredefined;

    @NameInMap("Name")
    public String name;

    @NameInMap("PrincipalArn")
    public String principalArn;

    @NameInMap("UpdateTime")
    public Long updateTime;

    @NameInMap("Users")
    public java.util.List<Principal> users;

    public static Role build(java.util.Map<String, ?> map) throws Exception {
        Role self = new Role();
        return TeaModel.build(map, self);
    }

    public Role setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
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

    public Role setIsPredefined(Integer isPredefined) {
        this.isPredefined = isPredefined;
        return this;
    }
    public Integer getIsPredefined() {
        return this.isPredefined;
    }

    public Role setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Role setPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
        return this;
    }
    public String getPrincipalArn() {
        return this.principalArn;
    }

    public Role setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public Role setUsers(java.util.List<Principal> users) {
        this.users = users;
        return this;
    }
    public java.util.List<Principal> getUsers() {
        return this.users;
    }

}
