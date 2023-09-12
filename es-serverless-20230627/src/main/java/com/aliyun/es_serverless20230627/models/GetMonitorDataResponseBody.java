// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class GetMonitorDataResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<GetMonitorDataResponseBodyResult> result;

    @NameInMap("success")
    public Boolean success;

    public static GetMonitorDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMonitorDataResponseBody self = new GetMonitorDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMonitorDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMonitorDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMonitorDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMonitorDataResponseBody setResult(java.util.List<GetMonitorDataResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetMonitorDataResponseBodyResult> getResult() {
        return this.result;
    }

    public GetMonitorDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMonitorDataResponseBodyResult extends TeaModel {
        @NameInMap("dps")
        public java.util.Map<String, ?> dps;

        @NameInMap("integrity")
        public Float integrity;

        @NameInMap("messageWatermark")
        public Long messageWatermark;

        @NameInMap("metric")
        public String metric;

        @NameInMap("summary")
        public Float summary;

        @NameInMap("tags")
        public java.util.Map<String, ?> tags;

        public static GetMonitorDataResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetMonitorDataResponseBodyResult self = new GetMonitorDataResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetMonitorDataResponseBodyResult setDps(java.util.Map<String, ?> dps) {
            this.dps = dps;
            return this;
        }
        public java.util.Map<String, ?> getDps() {
            return this.dps;
        }

        public GetMonitorDataResponseBodyResult setIntegrity(Float integrity) {
            this.integrity = integrity;
            return this;
        }
        public Float getIntegrity() {
            return this.integrity;
        }

        public GetMonitorDataResponseBodyResult setMessageWatermark(Long messageWatermark) {
            this.messageWatermark = messageWatermark;
            return this;
        }
        public Long getMessageWatermark() {
            return this.messageWatermark;
        }

        public GetMonitorDataResponseBodyResult setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public GetMonitorDataResponseBodyResult setSummary(Float summary) {
            this.summary = summary;
            return this;
        }
        public Float getSummary() {
            return this.summary;
        }

        public GetMonitorDataResponseBodyResult setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

    }

}
