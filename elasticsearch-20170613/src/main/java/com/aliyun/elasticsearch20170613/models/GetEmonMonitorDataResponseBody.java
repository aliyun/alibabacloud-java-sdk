// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetEmonMonitorDataResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>2D184B55-FA51-43F7-A1EF-E68A0545****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<GetEmonMonitorDataResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetEmonMonitorDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEmonMonitorDataResponseBody self = new GetEmonMonitorDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEmonMonitorDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEmonMonitorDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEmonMonitorDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEmonMonitorDataResponseBody setResult(java.util.List<GetEmonMonitorDataResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetEmonMonitorDataResponseBodyResult> getResult() {
        return this.result;
    }

    public GetEmonMonitorDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetEmonMonitorDataResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{ &quot;1586249280&quot;: 465.1980465119913, &quot;1586249300&quot;: 213.45243650423305 }</p>
         */
        @NameInMap("dps")
        public java.util.Map<String, ?> dps;

        /**
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("integrity")
        public Float integrity;

        /**
         * <strong>example:</strong>
         * <p>1522127381471</p>
         */
        @NameInMap("messageWatermark")
        public Long messageWatermark;

        /**
         * <strong>example:</strong>
         * <p>elasticbuild.elasticsearch.source.total_doc_count</p>
         */
        @NameInMap("metric")
        public String metric;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("summary")
        public Float summary;

        /**
         * <strong>example:</strong>
         * <p>{&quot;taskName&quot;:&quot;et-xxx&quot;,&quot;userId&quot;:&quot;123456&quot;}</p>
         */
        @NameInMap("tags")
        public java.util.Map<String, ?> tags;

        public static GetEmonMonitorDataResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetEmonMonitorDataResponseBodyResult self = new GetEmonMonitorDataResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetEmonMonitorDataResponseBodyResult setDps(java.util.Map<String, ?> dps) {
            this.dps = dps;
            return this;
        }
        public java.util.Map<String, ?> getDps() {
            return this.dps;
        }

        public GetEmonMonitorDataResponseBodyResult setIntegrity(Float integrity) {
            this.integrity = integrity;
            return this;
        }
        public Float getIntegrity() {
            return this.integrity;
        }

        public GetEmonMonitorDataResponseBodyResult setMessageWatermark(Long messageWatermark) {
            this.messageWatermark = messageWatermark;
            return this;
        }
        public Long getMessageWatermark() {
            return this.messageWatermark;
        }

        public GetEmonMonitorDataResponseBodyResult setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public GetEmonMonitorDataResponseBodyResult setSummary(Float summary) {
            this.summary = summary;
            return this;
        }
        public Float getSummary() {
            return this.summary;
        }

        public GetEmonMonitorDataResponseBodyResult setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

    }

}
