// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class ListAclAuthorizationRequest extends TeaModel {
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

    public static ListAclAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAclAuthorizationRequest self = new ListAclAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public ListAclAuthorizationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListAclAuthorizationRequest setPatternType(String patternType) {
        this.patternType = patternType;
        return this;
    }
    public String getPatternType() {
        return this.patternType;
    }

    public ListAclAuthorizationRequest setPermissionType(String permissionType) {
        this.permissionType = permissionType;
        return this;
    }
    public String getPermissionType() {
        return this.permissionType;
    }

    public ListAclAuthorizationRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public ListAclAuthorizationRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListAclAuthorizationRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
