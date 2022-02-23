// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class ModifyAclAuthorizationRequest extends TeaModel {
    @NameInMap("AclOperations")
    public String aclOperations;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PatternType")
    public String patternType;

    @NameInMap("PermissionType")
    public String permissionType;

    @NameInMap("ResourceName")
    public String resourceName;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("UserName")
    public String userName;

    public static ModifyAclAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAclAuthorizationRequest self = new ModifyAclAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAclAuthorizationRequest setAclOperations(String aclOperations) {
        this.aclOperations = aclOperations;
        return this;
    }
    public String getAclOperations() {
        return this.aclOperations;
    }

    public ModifyAclAuthorizationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyAclAuthorizationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyAclAuthorizationRequest setPatternType(String patternType) {
        this.patternType = patternType;
        return this;
    }
    public String getPatternType() {
        return this.patternType;
    }

    public ModifyAclAuthorizationRequest setPermissionType(String permissionType) {
        this.permissionType = permissionType;
        return this;
    }
    public String getPermissionType() {
        return this.permissionType;
    }

    public ModifyAclAuthorizationRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public ModifyAclAuthorizationRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ModifyAclAuthorizationRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
