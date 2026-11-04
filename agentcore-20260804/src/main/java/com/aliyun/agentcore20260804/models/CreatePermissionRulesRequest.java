// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreatePermissionRulesRequest extends TeaModel {
    /**
     * <p>The request body for creating permission rules.</p>
     */
    @NameInMap("body")
    public CreatePermissionRulesRequestBody body;

    /**
     * <p>The client token.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreatePermissionRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePermissionRulesRequest self = new CreatePermissionRulesRequest();
        return TeaModel.build(map, self);
    }

    public CreatePermissionRulesRequest setBody(CreatePermissionRulesRequestBody body) {
        this.body = body;
        return this;
    }
    public CreatePermissionRulesRequestBody getBody() {
        return this.body;
    }

    public CreatePermissionRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreatePermissionRulesRequestBodyRules extends TeaModel {
        /**
         * <p>The authorization effect.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ALLOW</p>
         */
        @NameInMap("effect")
        public String effect;

        /**
         * <p>The rule enforcement mode.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ENFORCE</p>
         */
        @NameInMap("enforcementMode")
        public String enforcementMode;

        /**
         * <p>The principal ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456</p>
         */
        @NameInMap("principalId")
        public String principalId;

        /**
         * <p>The principal type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("principalType")
        public String principalType;

        /**
         * <p>The resource ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-1234567890</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <p>The resource type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AGENT</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <p>The rule source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AgentCore</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The target scope.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SPECIFIED</p>
         */
        @NameInMap("targetScope")
        public String targetScope;

        /**
         * <p>The list of targets for the rule.</p>
         */
        @NameInMap("targets")
        public java.util.List<String> targets;

        public static CreatePermissionRulesRequestBodyRules build(java.util.Map<String, ?> map) throws Exception {
            CreatePermissionRulesRequestBodyRules self = new CreatePermissionRulesRequestBodyRules();
            return TeaModel.build(map, self);
        }

        public CreatePermissionRulesRequestBodyRules setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public CreatePermissionRulesRequestBodyRules setEnforcementMode(String enforcementMode) {
            this.enforcementMode = enforcementMode;
            return this;
        }
        public String getEnforcementMode() {
            return this.enforcementMode;
        }

        public CreatePermissionRulesRequestBodyRules setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public CreatePermissionRulesRequestBodyRules setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

        public CreatePermissionRulesRequestBodyRules setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public CreatePermissionRulesRequestBodyRules setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public CreatePermissionRulesRequestBodyRules setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public CreatePermissionRulesRequestBodyRules setTargetScope(String targetScope) {
            this.targetScope = targetScope;
            return this;
        }
        public String getTargetScope() {
            return this.targetScope;
        }

        public CreatePermissionRulesRequestBodyRules setTargets(java.util.List<String> targets) {
            this.targets = targets;
            return this;
        }
        public java.util.List<String> getTargets() {
            return this.targets;
        }

    }

    public static class CreatePermissionRulesRequestBody extends TeaModel {
        /**
         * <p>The list of permission rules to be created.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("rules")
        public java.util.List<CreatePermissionRulesRequestBodyRules> rules;

        public static CreatePermissionRulesRequestBody build(java.util.Map<String, ?> map) throws Exception {
            CreatePermissionRulesRequestBody self = new CreatePermissionRulesRequestBody();
            return TeaModel.build(map, self);
        }

        public CreatePermissionRulesRequestBody setRules(java.util.List<CreatePermissionRulesRequestBodyRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<CreatePermissionRulesRequestBodyRules> getRules() {
            return this.rules;
        }

    }

}
