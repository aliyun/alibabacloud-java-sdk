// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class DeleteAclAuthorizationRequest extends TeaModel {
    @NameInMap("AclOperation")
    public String aclOperation;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PatternType")
    public String patternType;

    @NameInMap("ResourceName")
    public String resourceName;

    @NameInMap("ResourceType")
    public String resourceType;

    public static DeleteAclAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAclAuthorizationRequest self = new DeleteAclAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAclAuthorizationRequest setAclOperation(String aclOperation) {
        this.aclOperation = aclOperation;
        return this;
    }
    public String getAclOperation() {
        return this.aclOperation;
    }

    public DeleteAclAuthorizationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteAclAuthorizationRequest setPatternType(String patternType) {
        this.patternType = patternType;
        return this;
    }
    public String getPatternType() {
        return this.patternType;
    }

    public DeleteAclAuthorizationRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public DeleteAclAuthorizationRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
