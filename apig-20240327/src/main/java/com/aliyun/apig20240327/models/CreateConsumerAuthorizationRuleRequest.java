// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateConsumerAuthorizationRuleRequest extends TeaModel {
    /**
     * <p>The list of resource authorization information.</p>
     */
    @NameInMap("authorizationResourceInfos")
    public java.util.List<AuthorizationResourceInfo> authorizationResourceInfos;

    /**
     * <p>The expiry mode. Valid values: LongTerm and ShortTerm.</p>
     * 
     * <strong>example:</strong>
     * <p>LongTerm</p>
     */
    @NameInMap("expireMode")
    public String expireMode;

    /**
     * <p>The expiration time.</p>
     * 
     * <strong>example:</strong>
     * <p>1750852089975</p>
     */
    @NameInMap("expireTimestamp")
    public Long expireTimestamp;

    /**
     * <p>The type of the parent resource.</p>
     * 
     * <strong>example:</strong>
     * <p>API</p>
     */
    @NameInMap("parentResourceType")
    public String parentResourceType;

    /**
     * <p>The resource type,</p>
     * 
     * <strong>example:</strong>
     * <p>API</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    public static CreateConsumerAuthorizationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConsumerAuthorizationRuleRequest self = new CreateConsumerAuthorizationRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateConsumerAuthorizationRuleRequest setAuthorizationResourceInfos(java.util.List<AuthorizationResourceInfo> authorizationResourceInfos) {
        this.authorizationResourceInfos = authorizationResourceInfos;
        return this;
    }
    public java.util.List<AuthorizationResourceInfo> getAuthorizationResourceInfos() {
        return this.authorizationResourceInfos;
    }

    public CreateConsumerAuthorizationRuleRequest setExpireMode(String expireMode) {
        this.expireMode = expireMode;
        return this;
    }
    public String getExpireMode() {
        return this.expireMode;
    }

    public CreateConsumerAuthorizationRuleRequest setExpireTimestamp(Long expireTimestamp) {
        this.expireTimestamp = expireTimestamp;
        return this;
    }
    public Long getExpireTimestamp() {
        return this.expireTimestamp;
    }

    public CreateConsumerAuthorizationRuleRequest setParentResourceType(String parentResourceType) {
        this.parentResourceType = parentResourceType;
        return this;
    }
    public String getParentResourceType() {
        return this.parentResourceType;
    }

    public CreateConsumerAuthorizationRuleRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
