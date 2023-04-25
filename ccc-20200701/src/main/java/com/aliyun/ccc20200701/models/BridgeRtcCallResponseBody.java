// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class BridgeRtcCallResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public BridgeRtcCallResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    @NameInMap("RequestId")
    public String requestId;

    public static BridgeRtcCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BridgeRtcCallResponseBody self = new BridgeRtcCallResponseBody();
        return TeaModel.build(map, self);
    }

    public BridgeRtcCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BridgeRtcCallResponseBody setData(BridgeRtcCallResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BridgeRtcCallResponseBodyData getData() {
        return this.data;
    }

    public BridgeRtcCallResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public BridgeRtcCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BridgeRtcCallResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public BridgeRtcCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BridgeRtcCallResponseBodyData extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("TokenInfo")
        public String tokenInfo;

        public static BridgeRtcCallResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BridgeRtcCallResponseBodyData self = new BridgeRtcCallResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BridgeRtcCallResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public BridgeRtcCallResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public BridgeRtcCallResponseBodyData setTokenInfo(String tokenInfo) {
            this.tokenInfo = tokenInfo;
            return this;
        }
        public String getTokenInfo() {
            return this.tokenInfo;
        }

    }

}
