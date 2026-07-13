// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class QueryFeaturesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryFeaturesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
        @NameInMap("Description")
        public String description;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("FeatureCode")
        public String featureCode;

        @NameInMap("Supported")
        public Boolean supported;

        @NameInMap("UnsupportedReason")
        public String unsupportedReason;

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
        @NameInMap("Features")
        public java.util.List<QueryFeaturesResponseBodyDataFeatures> features;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ResourceName")
        public String resourceName;

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
