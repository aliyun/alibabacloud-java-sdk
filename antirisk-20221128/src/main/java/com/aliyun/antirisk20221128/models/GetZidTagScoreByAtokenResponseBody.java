// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antirisk20221128.models;

import com.aliyun.tea.*;

public class GetZidTagScoreByAtokenResponseBody extends TeaModel {
    /**
     * <p>code</p>
     */
    @NameInMap("Code")
    public Long code;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("data")
    public GetZidTagScoreByAtokenResponseBodyData data;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>success</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetZidTagScoreByAtokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetZidTagScoreByAtokenResponseBody self = new GetZidTagScoreByAtokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetZidTagScoreByAtokenResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetZidTagScoreByAtokenResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetZidTagScoreByAtokenResponseBody setData(GetZidTagScoreByAtokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetZidTagScoreByAtokenResponseBodyData getData() {
        return this.data;
    }

    public GetZidTagScoreByAtokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetZidTagScoreByAtokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetZidTagScoreByAtokenResponseBodyData extends TeaModel {
        /**
         * <p>aHook</p>
         */
        @NameInMap("aHook")
        public String aHook;

        @NameInMap("debug")
        public String debug;

        @NameInMap("doubleOpen")
        public String doubleOpen;

        /**
         * <p>javaHook</p>
         */
        @NameInMap("javaHook")
        public String javaHook;

        @NameInMap("nativeHook")
        public String nativeHook;

        @NameInMap("riskLevel")
        public String riskLevel;

        @NameInMap("riskScore")
        public String riskScore;

        @NameInMap("root")
        public String root;

        @NameInMap("simulator")
        public String simulator;

        @NameInMap("vpnProxy")
        public String vpnProxy;

        @NameInMap("wifiProxy")
        public String wifiProxy;

        @NameInMap("zid")
        public String zid;

        public static GetZidTagScoreByAtokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetZidTagScoreByAtokenResponseBodyData self = new GetZidTagScoreByAtokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetZidTagScoreByAtokenResponseBodyData setAHook(String aHook) {
            this.aHook = aHook;
            return this;
        }
        public String getAHook() {
            return this.aHook;
        }

        public GetZidTagScoreByAtokenResponseBodyData setDebug(String debug) {
            this.debug = debug;
            return this;
        }
        public String getDebug() {
            return this.debug;
        }

        public GetZidTagScoreByAtokenResponseBodyData setDoubleOpen(String doubleOpen) {
            this.doubleOpen = doubleOpen;
            return this;
        }
        public String getDoubleOpen() {
            return this.doubleOpen;
        }

        public GetZidTagScoreByAtokenResponseBodyData setJavaHook(String javaHook) {
            this.javaHook = javaHook;
            return this;
        }
        public String getJavaHook() {
            return this.javaHook;
        }

        public GetZidTagScoreByAtokenResponseBodyData setNativeHook(String nativeHook) {
            this.nativeHook = nativeHook;
            return this;
        }
        public String getNativeHook() {
            return this.nativeHook;
        }

        public GetZidTagScoreByAtokenResponseBodyData setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public GetZidTagScoreByAtokenResponseBodyData setRiskScore(String riskScore) {
            this.riskScore = riskScore;
            return this;
        }
        public String getRiskScore() {
            return this.riskScore;
        }

        public GetZidTagScoreByAtokenResponseBodyData setRoot(String root) {
            this.root = root;
            return this;
        }
        public String getRoot() {
            return this.root;
        }

        public GetZidTagScoreByAtokenResponseBodyData setSimulator(String simulator) {
            this.simulator = simulator;
            return this;
        }
        public String getSimulator() {
            return this.simulator;
        }

        public GetZidTagScoreByAtokenResponseBodyData setVpnProxy(String vpnProxy) {
            this.vpnProxy = vpnProxy;
            return this;
        }
        public String getVpnProxy() {
            return this.vpnProxy;
        }

        public GetZidTagScoreByAtokenResponseBodyData setWifiProxy(String wifiProxy) {
            this.wifiProxy = wifiProxy;
            return this;
        }
        public String getWifiProxy() {
            return this.wifiProxy;
        }

        public GetZidTagScoreByAtokenResponseBodyData setZid(String zid) {
            this.zid = zid;
            return this;
        }
        public String getZid() {
            return this.zid;
        }

    }

}
