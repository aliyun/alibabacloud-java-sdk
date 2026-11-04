// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreatePermissionRulesResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The creation result.</p>
     */
    @NameInMap("data")
    public CreatePermissionRulesResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request processing result message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1a2b3c4d-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreatePermissionRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePermissionRulesResponseBody self = new CreatePermissionRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePermissionRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreatePermissionRulesResponseBody setData(CreatePermissionRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreatePermissionRulesResponseBodyData getData() {
        return this.data;
    }

    public CreatePermissionRulesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreatePermissionRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePermissionRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePermissionRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreatePermissionRulesResponseBodyDataRules extends TeaModel {
        /**
         * <p>The creation time in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The authorization effect.</p>
         * 
         * <strong>example:</strong>
         * <p>ALLOW</p>
         */
        @NameInMap("effect")
        public String effect;

        /**
         * <p>The rule enforcement mode.</p>
         * 
         * <strong>example:</strong>
         * <p>ENFORCE</p>
         */
        @NameInMap("enforcementMode")
        public String enforcementMode;

        /**
         * <p>The permission rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pr-1234567890</p>
         */
        @NameInMap("permissionRuleId")
        public String permissionRuleId;

        /**
         * <p>The principal ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456</p>
         */
        @NameInMap("principalId")
        public String principalId;

        /**
         * <p>The principal name.</p>
         * 
         * <strong>example:</strong>
         * <p>example-user</p>
         */
        @NameInMap("principalName")
        public String principalName;

        /**
         * <p>The principal type.</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("principalType")
        public String principalType;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-1234567890</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>AGENT</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <p>The rule source.</p>
         * 
         * <strong>example:</strong>
         * <p>AgentCore</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The details of the rule source.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenAPI</p>
         */
        @NameInMap("sourceDetail")
        public String sourceDetail;

        /**
         * <p>The target scope.</p>
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

        /**
         * <p>The update time in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        public static CreatePermissionRulesResponseBodyDataRules build(java.util.Map<String, ?> map) throws Exception {
            CreatePermissionRulesResponseBodyDataRules self = new CreatePermissionRulesResponseBodyDataRules();
            return TeaModel.build(map, self);
        }

        public CreatePermissionRulesResponseBodyDataRules setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreatePermissionRulesResponseBodyDataRules setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public CreatePermissionRulesResponseBodyDataRules setEnforcementMode(String enforcementMode) {
            this.enforcementMode = enforcementMode;
            return this;
        }
        public String getEnforcementMode() {
            return this.enforcementMode;
        }

        public CreatePermissionRulesResponseBodyDataRules setPermissionRuleId(String permissionRuleId) {
            this.permissionRuleId = permissionRuleId;
            return this;
        }
        public String getPermissionRuleId() {
            return this.permissionRuleId;
        }

        public CreatePermissionRulesResponseBodyDataRules setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public CreatePermissionRulesResponseBodyDataRules setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public CreatePermissionRulesResponseBodyDataRules setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

        public CreatePermissionRulesResponseBodyDataRules setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public CreatePermissionRulesResponseBodyDataRules setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public CreatePermissionRulesResponseBodyDataRules setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public CreatePermissionRulesResponseBodyDataRules setSourceDetail(String sourceDetail) {
            this.sourceDetail = sourceDetail;
            return this;
        }
        public String getSourceDetail() {
            return this.sourceDetail;
        }

        public CreatePermissionRulesResponseBodyDataRules setTargetScope(String targetScope) {
            this.targetScope = targetScope;
            return this;
        }
        public String getTargetScope() {
            return this.targetScope;
        }

        public CreatePermissionRulesResponseBodyDataRules setTargets(java.util.List<String> targets) {
            this.targets = targets;
            return this;
        }
        public java.util.List<String> getTargets() {
            return this.targets;
        }

        public CreatePermissionRulesResponseBodyDataRules setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

    public static class CreatePermissionRulesResponseBodyData extends TeaModel {
        /**
         * <p>The list of created permission rules.</p>
         */
        @NameInMap("rules")
        public java.util.List<CreatePermissionRulesResponseBodyDataRules> rules;

        public static CreatePermissionRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreatePermissionRulesResponseBodyData self = new CreatePermissionRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreatePermissionRulesResponseBodyData setRules(java.util.List<CreatePermissionRulesResponseBodyDataRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<CreatePermissionRulesResponseBodyDataRules> getRules() {
            return this.rules;
        }

    }

}
