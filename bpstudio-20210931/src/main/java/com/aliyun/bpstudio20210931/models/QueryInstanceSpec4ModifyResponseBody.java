// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class QueryInstanceSpec4ModifyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;PolicyType&quot;: &quot;&quot;,
     *     &quot;AuthPrincipalOwnerId&quot;: &quot;&quot;,
     *     &quot;EncodedDiagnosticMessage&quot;: &quot;&quot;,
     *     &quot;AuthPrincipalType&quot;: &quot;&quot;,
     *     &quot;AuthPrincipalDisplayName&quot;: &quot;&quot;,
     *     &quot;NoPermissionType&quot;: &quot;&quot;,
     *     &quot;AuthAction&quot;: &quot;&quot;
     *   }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryInstanceSpec4ModifyResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>847C9D0A-BABD-589C-8A9C-6464409EDED9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryInstanceSpec4ModifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceSpec4ModifyResponseBody self = new QueryInstanceSpec4ModifyResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryInstanceSpec4ModifyResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryInstanceSpec4ModifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryInstanceSpec4ModifyResponseBody setData(QueryInstanceSpec4ModifyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryInstanceSpec4ModifyResponseBodyData getData() {
        return this.data;
    }

    public QueryInstanceSpec4ModifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryInstanceSpec4ModifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryInstanceSpec4ModifyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryInstanceSpec4ModifyResponseBodyDataOptionalValues extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Max")
        public Double max;

        @NameInMap("Min")
        public Double min;

        @NameInMap("Step")
        public Double step;

        @NameInMap("Value")
        public String value;

        public static QueryInstanceSpec4ModifyResponseBodyDataOptionalValues build(java.util.Map<String, ?> map) throws Exception {
            QueryInstanceSpec4ModifyResponseBodyDataOptionalValues self = new QueryInstanceSpec4ModifyResponseBodyDataOptionalValues();
            return TeaModel.build(map, self);
        }

        public QueryInstanceSpec4ModifyResponseBodyDataOptionalValues setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryInstanceSpec4ModifyResponseBodyDataOptionalValues setMax(Double max) {
            this.max = max;
            return this;
        }
        public Double getMax() {
            return this.max;
        }

        public QueryInstanceSpec4ModifyResponseBodyDataOptionalValues setMin(Double min) {
            this.min = min;
            return this;
        }
        public Double getMin() {
            return this.min;
        }

        public QueryInstanceSpec4ModifyResponseBodyDataOptionalValues setStep(Double step) {
            this.step = step;
            return this;
        }
        public Double getStep() {
            return this.step;
        }

        public QueryInstanceSpec4ModifyResponseBodyDataOptionalValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryInstanceSpec4ModifyResponseBodyData extends TeaModel {
        @NameInMap("OptionalValues")
        public java.util.List<QueryInstanceSpec4ModifyResponseBodyDataOptionalValues> optionalValues;

        public static QueryInstanceSpec4ModifyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryInstanceSpec4ModifyResponseBodyData self = new QueryInstanceSpec4ModifyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryInstanceSpec4ModifyResponseBodyData setOptionalValues(java.util.List<QueryInstanceSpec4ModifyResponseBodyDataOptionalValues> optionalValues) {
            this.optionalValues = optionalValues;
            return this;
        }
        public java.util.List<QueryInstanceSpec4ModifyResponseBodyDataOptionalValues> getOptionalValues() {
            return this.optionalValues;
        }

    }

}
