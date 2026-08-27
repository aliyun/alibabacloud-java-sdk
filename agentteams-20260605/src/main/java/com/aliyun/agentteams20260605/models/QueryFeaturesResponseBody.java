// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class QueryFeaturesResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The queried feature information.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Data")
    public QueryFeaturesResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryFeaturesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFeaturesResponseBody self = new QueryFeaturesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFeaturesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryFeaturesResponseBody setData(QueryFeaturesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryFeaturesResponseBodyData getData() {
        return this.data;
    }

    public QueryFeaturesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryFeaturesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryFeaturesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFeaturesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryFeaturesResponseBodyDataFeatures extends TeaModel {
        /**
         * <p>The feature description.</p>
         * 
         * <strong>example:</strong>
         * <p>Supports mounting an OSS bucket to an Agent container.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The feature display name.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS Mount.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The feature code.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS_MOUNT</p>
         */
        @NameInMap("FeatureCode")
        public String featureCode;

        /**
         * <p>Indicates whether the feature is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Supported")
        public Boolean supported;

        /**
         * <p>The detailed reason why the feature is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>The current base version does not support this feature.</p>
         */
        @NameInMap("UnsupportedReason")
        public String unsupportedReason;

        /**
         * <p>The reason code for why the feature is not supported. Valid values:</p>
         * <ul>
         * <li>BASE_VERSION_UNSUPPORTED: The base version does not support this feature.</li>
         * <li>WORKER_VERSION_UNSUPPORTED: The worker version does not support this feature.</li>
         * <li>FEATURE_DISABLED: The feature is disabled.</li>
         * <li>FEATURE_DEPRECATED: The feature is deprecated.</li>
         * <li>OVERRIDDEN_DENY: The feature is denied by an override.</li>
         * <li>CUSTOM_RULE_UNSUPPORTED: A custom rule does not support this feature.</li>
         * <li>VERSION_METADATA_MISSING: The version metadata is missing.</li>
         * <li>RULE_NOT_MATCHED: No rule is matched.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BASE_VERSION_UNSUPPORTED</p>
         */
        @NameInMap("UnsupportedReasonCode")
        public String unsupportedReasonCode;

        public static QueryFeaturesResponseBodyDataFeatures build(java.util.Map<String, ?> map) throws Exception {
            QueryFeaturesResponseBodyDataFeatures self = new QueryFeaturesResponseBodyDataFeatures();
            return TeaModel.build(map, self);
        }

        public QueryFeaturesResponseBodyDataFeatures setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryFeaturesResponseBodyDataFeatures setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public QueryFeaturesResponseBodyDataFeatures setFeatureCode(String featureCode) {
            this.featureCode = featureCode;
            return this;
        }
        public String getFeatureCode() {
            return this.featureCode;
        }

        public QueryFeaturesResponseBodyDataFeatures setSupported(Boolean supported) {
            this.supported = supported;
            return this;
        }
        public Boolean getSupported() {
            return this.supported;
        }

        public QueryFeaturesResponseBodyDataFeatures setUnsupportedReason(String unsupportedReason) {
            this.unsupportedReason = unsupportedReason;
            return this;
        }
        public String getUnsupportedReason() {
            return this.unsupportedReason;
        }

        public QueryFeaturesResponseBodyDataFeatures setUnsupportedReasonCode(String unsupportedReasonCode) {
            this.unsupportedReasonCode = unsupportedReasonCode;
            return this;
        }
        public String getUnsupportedReasonCode() {
            return this.unsupportedReasonCode;
        }

    }

    public static class QueryFeaturesResponseBodyData extends TeaModel {
        /**
         * <p>The list of features.</p>
         * 
         * <strong>example:</strong>
         * <p>[...]</p>
         */
        @NameInMap("Features")
        public java.util.List<QueryFeaturesResponseBodyDataFeatures> features;

        /**
         * <p>The AgentTeams instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>at-xxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The target resource name. Required for <code>WORKER</code>, <code>TEAM</code>, and <code>HUMAN</code>. Not required for <code>INSTANCE</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The query target type. Valid values:</p>
         * <ul>
         * <li>INSTANCE: instance level</li>
         * <li>WORKER: worker level</li>
         * <li>TEAM: team level</li>
         * <li>HUMAN: human level</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INSTANCE</p>
         */
        @NameInMap("TargetScope")
        public String targetScope;

        public static QueryFeaturesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryFeaturesResponseBodyData self = new QueryFeaturesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryFeaturesResponseBodyData setFeatures(java.util.List<QueryFeaturesResponseBodyDataFeatures> features) {
            this.features = features;
            return this;
        }
        public java.util.List<QueryFeaturesResponseBodyDataFeatures> getFeatures() {
            return this.features;
        }

        public QueryFeaturesResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryFeaturesResponseBodyData setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public QueryFeaturesResponseBodyData setTargetScope(String targetScope) {
            this.targetScope = targetScope;
            return this;
        }
        public String getTargetScope() {
            return this.targetScope;
        }

    }

}
