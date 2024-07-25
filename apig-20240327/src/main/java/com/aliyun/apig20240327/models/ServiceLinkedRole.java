// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ServiceLinkedRole extends TeaModel {
    @NameInMap("arn")
    public String arn;

    @NameInMap("assumeRolePolicyDocument")
    public String assumeRolePolicyDocument;

    @NameInMap("createDate")
    public String createDate;

    @NameInMap("description")
    public String description;

    @NameInMap("isServiceLinkedRole")
    public Boolean isServiceLinkedRole;

    @NameInMap("roleId")
    public String roleId;

    @NameInMap("roleName")
    public String roleName;

    @NameInMap("rolePrincipalName")
    public String rolePrincipalName;

    public static ServiceLinkedRole build(java.util.Map<String, ?> map) throws Exception {
        ServiceLinkedRole self = new ServiceLinkedRole();
        return TeaModel.build(map, self);
    }

    public ServiceLinkedRole setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public ServiceLinkedRole setAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
        this.assumeRolePolicyDocument = assumeRolePolicyDocument;
        return this;
    }
    public String getAssumeRolePolicyDocument() {
        return this.assumeRolePolicyDocument;
    }

    public ServiceLinkedRole setCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }
    public String getCreateDate() {
        return this.createDate;
    }

    public ServiceLinkedRole setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ServiceLinkedRole setIsServiceLinkedRole(Boolean isServiceLinkedRole) {
        this.isServiceLinkedRole = isServiceLinkedRole;
        return this;
    }
    public Boolean getIsServiceLinkedRole() {
        return this.isServiceLinkedRole;
    }

    public ServiceLinkedRole setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

    public ServiceLinkedRole setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public ServiceLinkedRole setRolePrincipalName(String rolePrincipalName) {
        this.rolePrincipalName = rolePrincipalName;
        return this;
    }
    public String getRolePrincipalName() {
        return this.rolePrincipalName;
    }

}
