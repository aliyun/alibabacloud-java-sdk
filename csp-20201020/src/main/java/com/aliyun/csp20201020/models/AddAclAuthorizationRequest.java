// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class AddAclAuthorizationRequest extends TeaModel {
    @NameInMap("AclOperation")
    public String aclOperation;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("PatternType")
    public String patternType;

    @NameInMap("ResourceName")
    public String resourceName;

    @NameInMap("ResourceType")
    public String resourceType;

    public static AddAclAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAclAuthorizationRequest self = new AddAclAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public AddAclAuthorizationRequest setAclOperation(String aclOperation) {
        this.aclOperation = aclOperation;
        return this;
    }
    public String getAclOperation() {
        return this.aclOperation;
    }

    public AddAclAuthorizationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddAclAuthorizationRequest setPatternType(String patternType) {
        this.patternType = patternType;
        return this;
    }
    public String getPatternType() {
        return this.patternType;
    }

    public AddAclAuthorizationRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public AddAclAuthorizationRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
