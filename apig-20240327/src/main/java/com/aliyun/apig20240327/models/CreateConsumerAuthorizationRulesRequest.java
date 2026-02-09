// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateConsumerAuthorizationRulesRequest extends TeaModel {
    /**
     * <p>The consumer authentication rules to be created.</p>
     */
    @NameInMap("authorizationRules")
    public java.util.List<CreateConsumerAuthorizationRulesRequestAuthorizationRules> authorizationRules;

    public static CreateConsumerAuthorizationRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConsumerAuthorizationRulesRequest self = new CreateConsumerAuthorizationRulesRequest();
        return TeaModel.build(map, self);
    }

    public CreateConsumerAuthorizationRulesRequest setAuthorizationRules(java.util.List<CreateConsumerAuthorizationRulesRequestAuthorizationRules> authorizationRules) {
        this.authorizationRules = authorizationRules;
        return this;
    }
    public java.util.List<CreateConsumerAuthorizationRulesRequestAuthorizationRules> getAuthorizationRules() {
        return this.authorizationRules;
    }

    public static class CreateConsumerAuthorizationRulesRequestAuthorizationRulesResourceIdentifier extends TeaModel {
        /**
         * <p>The environment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>env-cti17hem1hktoruj98ug</p>
         */
        @NameInMap("environmentId")
        public String environmentId;

        /**
         * <p>Parent resource ID</p>
         * 
         * <strong>example:</strong>
         * <p>api-******</p>
         */
        @NameInMap("parentResourceId")
        public String parentResourceId;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-li942gy8p03</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <p>List of resources</p>
         */
        @NameInMap("resources")
        public java.util.List<String> resources;

        public static CreateConsumerAuthorizationRulesRequestAuthorizationRulesResourceIdentifier build(java.util.Map<String, ?> map) throws Exception {
            CreateConsumerAuthorizationRulesRequestAuthorizationRulesResourceIdentifier self = new CreateConsumerAuthorizationRulesRequestAuthorizationRulesResourceIdentifier();
            return TeaModel.build(map, self);
        }

        public CreateConsumerAuthorizationRulesRequestAuthorizationRulesResourceIdentifier setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public CreateConsumerAuthorizationRulesRequestAuthorizationRulesResourceIdentifier setParentResourceId(String parentResourceId) {
            this.parentResourceId = parentResourceId;
            return this;
        }
        public String getParentResourceId() {
            return this.parentResourceId;
        }

        public CreateConsumerAuthorizationRulesRequestAuthorizationRulesResourceIdentifier setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public CreateConsumerAuthorizationRulesRequestAuthorizationRulesResourceIdentifier setResources(java.util.List<String> resources) {
            this.resources = resources;
            return this;
        }
        public java.util.List<String> getResources() {
            return this.resources;
        }

    }

    public static class CreateConsumerAuthorizationRulesRequestAuthorizationRules extends TeaModel {
        /**
         * <p>The consumer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-cu08olem1hkokaut34i0</p>
         */
        @NameInMap("consumerId")
        public String consumerId;

        /**
         * <p>The expiration mode. Valid values: LongTerm and ShortTerm.</p>
         * 
         * <strong>example:</strong>
         * <p>LongTerm</p>
         */
        @NameInMap("expireMode")
        public String expireMode;

        /**
         * <p>The expiration timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>174116222x</p>
         */
        @NameInMap("expireTimestamp")
        public Long expireTimestamp;

        /**
         * <p>The resource identifier, which is provided to non-standard code sources for space reuse.</p>
         */
        @NameInMap("resourceIdentifier")
        public CreateConsumerAuthorizationRulesRequestAuthorizationRulesResourceIdentifier resourceIdentifier;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>HttpApiRoute</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        public static CreateConsumerAuthorizationRulesRequestAuthorizationRules build(java.util.Map<String, ?> map) throws Exception {
            CreateConsumerAuthorizationRulesRequestAuthorizationRules self = new CreateConsumerAuthorizationRulesRequestAuthorizationRules();
            return TeaModel.build(map, self);
        }

        public CreateConsumerAuthorizationRulesRequestAuthorizationRules setConsumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }
        public String getConsumerId() {
            return this.consumerId;
        }

        public CreateConsumerAuthorizationRulesRequestAuthorizationRules setExpireMode(String expireMode) {
            this.expireMode = expireMode;
            return this;
        }
        public String getExpireMode() {
            return this.expireMode;
        }

        public CreateConsumerAuthorizationRulesRequestAuthorizationRules setExpireTimestamp(Long expireTimestamp) {
            this.expireTimestamp = expireTimestamp;
            return this;
        }
        public Long getExpireTimestamp() {
            return this.expireTimestamp;
        }

        public CreateConsumerAuthorizationRulesRequestAuthorizationRules setResourceIdentifier(CreateConsumerAuthorizationRulesRequestAuthorizationRulesResourceIdentifier resourceIdentifier) {
            this.resourceIdentifier = resourceIdentifier;
            return this;
        }
        public CreateConsumerAuthorizationRulesRequestAuthorizationRulesResourceIdentifier getResourceIdentifier() {
            return this.resourceIdentifier;
        }

        public CreateConsumerAuthorizationRulesRequestAuthorizationRules setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
