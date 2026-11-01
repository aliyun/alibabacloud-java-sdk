// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListPermissionRulesResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The list of permission rules.</p>
     */
    @NameInMap("items")
    public java.util.List<ListPermissionRulesResponseBodyItems> items;

    /**
     * <p>The maximum number of entries returned in the current request.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The request processing result message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The next page token.</p>
     * 
     * <strong>example:</strong>
     * <p>token-example</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

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

    /**
     * <p>The total number of rules that meet the specified conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListPermissionRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPermissionRulesResponseBody self = new ListPermissionRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPermissionRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPermissionRulesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListPermissionRulesResponseBody setItems(java.util.List<ListPermissionRulesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListPermissionRulesResponseBodyItems> getItems() {
        return this.items;
    }

    public ListPermissionRulesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPermissionRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPermissionRulesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPermissionRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPermissionRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListPermissionRulesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListPermissionRulesResponseBodyItems extends TeaModel {
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
         * <p>The rule source details.</p>
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
         * <p>The list of rule targets.</p>
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

        public static ListPermissionRulesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListPermissionRulesResponseBodyItems self = new ListPermissionRulesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListPermissionRulesResponseBodyItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListPermissionRulesResponseBodyItems setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public ListPermissionRulesResponseBodyItems setEnforcementMode(String enforcementMode) {
            this.enforcementMode = enforcementMode;
            return this;
        }
        public String getEnforcementMode() {
            return this.enforcementMode;
        }

        public ListPermissionRulesResponseBodyItems setPermissionRuleId(String permissionRuleId) {
            this.permissionRuleId = permissionRuleId;
            return this;
        }
        public String getPermissionRuleId() {
            return this.permissionRuleId;
        }

        public ListPermissionRulesResponseBodyItems setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public ListPermissionRulesResponseBodyItems setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public ListPermissionRulesResponseBodyItems setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

        public ListPermissionRulesResponseBodyItems setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListPermissionRulesResponseBodyItems setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListPermissionRulesResponseBodyItems setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListPermissionRulesResponseBodyItems setSourceDetail(String sourceDetail) {
            this.sourceDetail = sourceDetail;
            return this;
        }
        public String getSourceDetail() {
            return this.sourceDetail;
        }

        public ListPermissionRulesResponseBodyItems setTargetScope(String targetScope) {
            this.targetScope = targetScope;
            return this;
        }
        public String getTargetScope() {
            return this.targetScope;
        }

        public ListPermissionRulesResponseBodyItems setTargets(java.util.List<String> targets) {
            this.targets = targets;
            return this;
        }
        public java.util.List<String> getTargets() {
            return this.targets;
        }

        public ListPermissionRulesResponseBodyItems setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
