// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antirisk20221128.models;

import com.aliyun.tea.*;

public class GetRealTimeRiskInfoResponseBody extends TeaModel {
    @NameInMap("Msg")
    public String msg;

    @NameInMap("code")
    public Long code;

    @NameInMap("data")
    public GetRealTimeRiskInfoResponseBodyData data;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static GetRealTimeRiskInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRealTimeRiskInfoResponseBody self = new GetRealTimeRiskInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRealTimeRiskInfoResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetRealTimeRiskInfoResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetRealTimeRiskInfoResponseBody setData(GetRealTimeRiskInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRealTimeRiskInfoResponseBodyData getData() {
        return this.data;
    }

    public GetRealTimeRiskInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRealTimeRiskInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRealTimeRiskInfoResponseBodyData extends TeaModel {
        @NameInMap("appChannel")
        public String appChannel;

        @NameInMap("fakeDevice")
        public String fakeDevice;

        @NameInMap("idfa")
        public String idfa;

        @NameInMap("oaid")
        public String oaid;

        @NameInMap("proxyDevice")
        public String proxyDevice;

        @NameInMap("riskLevel")
        public String riskLevel;

        @NameInMap("riskScore")
        public String riskScore;

        @NameInMap("zid")
        public String zid;

        public static GetRealTimeRiskInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRealTimeRiskInfoResponseBodyData self = new GetRealTimeRiskInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRealTimeRiskInfoResponseBodyData setAppChannel(String appChannel) {
            this.appChannel = appChannel;
            return this;
        }
        public String getAppChannel() {
            return this.appChannel;
        }

        public GetRealTimeRiskInfoResponseBodyData setFakeDevice(String fakeDevice) {
            this.fakeDevice = fakeDevice;
            return this;
        }
        public String getFakeDevice() {
            return this.fakeDevice;
        }

        public GetRealTimeRiskInfoResponseBodyData setIdfa(String idfa) {
            this.idfa = idfa;
            return this;
        }
        public String getIdfa() {
            return this.idfa;
        }

        public GetRealTimeRiskInfoResponseBodyData setOaid(String oaid) {
            this.oaid = oaid;
            return this;
        }
        public String getOaid() {
            return this.oaid;
        }

        public GetRealTimeRiskInfoResponseBodyData setProxyDevice(String proxyDevice) {
            this.proxyDevice = proxyDevice;
            return this;
        }
        public String getProxyDevice() {
            return this.proxyDevice;
        }

        public GetRealTimeRiskInfoResponseBodyData setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public GetRealTimeRiskInfoResponseBodyData setRiskScore(String riskScore) {
            this.riskScore = riskScore;
            return this;
        }
        public String getRiskScore() {
            return this.riskScore;
        }

        public GetRealTimeRiskInfoResponseBodyData setZid(String zid) {
            this.zid = zid;
            return this;
        }
        public String getZid() {
            return this.zid;
        }

    }

}
