// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetEmonMonitorDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<GetEmonMonitorDataResponseBodyResult> result;

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
        @NameInMap("integrity")
        public Float integrity;

        @NameInMap("summary")
        public Float summary;

        @NameInMap("messageWatermark")
        public Long messageWatermark;

        @NameInMap("dps")
        public java.util.Map<String, ?> dps;

        @NameInMap("tags")
        public java.util.Map<String, ?> tags;

        @NameInMap("metric")
        public String metric;

        public static GetEmonMonitorDataResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetEmonMonitorDataResponseBodyResult self = new GetEmonMonitorDataResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetEmonMonitorDataResponseBodyResult setIntegrity(Float integrity) {
            this.integrity = integrity;
            return this;
        }
        public Float getIntegrity() {
            return this.integrity;
        }

        public GetEmonMonitorDataResponseBodyResult setSummary(Float summary) {
            this.summary = summary;
            return this;
        }
        public Float getSummary() {
            return this.summary;
        }

        public GetEmonMonitorDataResponseBodyResult setMessageWatermark(Long messageWatermark) {
            this.messageWatermark = messageWatermark;
            return this;
        }
        public Long getMessageWatermark() {
            return this.messageWatermark;
        }

        public GetEmonMonitorDataResponseBodyResult setDps(java.util.Map<String, ?> dps) {
            this.dps = dps;
            return this;
        }
        public java.util.Map<String, ?> getDps() {
            return this.dps;
        }

        public GetEmonMonitorDataResponseBodyResult setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public GetEmonMonitorDataResponseBodyResult setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

    }

}
