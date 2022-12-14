// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antirisk20221128.models;

import com.aliyun.tea.*;

public class GetZidTagByAtokenResponseBody extends TeaModel {
    @NameInMap("Msg")
    public String msg;

    // code
    @NameInMap("code")
    public Long code;

    @NameInMap("data")
    public GetZidTagByAtokenResponseBodyData data;

    @NameInMap("requestId")
    public String requestId;

    // success
    @NameInMap("success")
    public Boolean success;

    public static GetZidTagByAtokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetZidTagByAtokenResponseBody self = new GetZidTagByAtokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetZidTagByAtokenResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetZidTagByAtokenResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetZidTagByAtokenResponseBody setData(GetZidTagByAtokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetZidTagByAtokenResponseBodyData getData() {
        return this.data;
    }

    public GetZidTagByAtokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetZidTagByAtokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetZidTagByAtokenResponseBodyData extends TeaModel {
        // aHook
        @NameInMap("aHook")
        public String aHook;

        @NameInMap("debug")
        public String debug;

        @NameInMap("doubleOpen")
        public String doubleOpen;

        // javaHook
        @NameInMap("javaHook")
        public String javaHook;

        @NameInMap("nativeHook")
        public String nativeHook;

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

        public static GetZidTagByAtokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetZidTagByAtokenResponseBodyData self = new GetZidTagByAtokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetZidTagByAtokenResponseBodyData setAHook(String aHook) {
            this.aHook = aHook;
            return this;
        }
        public String getAHook() {
            return this.aHook;
        }

        public GetZidTagByAtokenResponseBodyData setDebug(String debug) {
            this.debug = debug;
            return this;
        }
        public String getDebug() {
            return this.debug;
        }

        public GetZidTagByAtokenResponseBodyData setDoubleOpen(String doubleOpen) {
            this.doubleOpen = doubleOpen;
            return this;
        }
        public String getDoubleOpen() {
            return this.doubleOpen;
        }

        public GetZidTagByAtokenResponseBodyData setJavaHook(String javaHook) {
            this.javaHook = javaHook;
            return this;
        }
        public String getJavaHook() {
            return this.javaHook;
        }

        public GetZidTagByAtokenResponseBodyData setNativeHook(String nativeHook) {
            this.nativeHook = nativeHook;
            return this;
        }
        public String getNativeHook() {
            return this.nativeHook;
        }

        public GetZidTagByAtokenResponseBodyData setRoot(String root) {
            this.root = root;
            return this;
        }
        public String getRoot() {
            return this.root;
        }

        public GetZidTagByAtokenResponseBodyData setSimulator(String simulator) {
            this.simulator = simulator;
            return this;
        }
        public String getSimulator() {
            return this.simulator;
        }

        public GetZidTagByAtokenResponseBodyData setVpnProxy(String vpnProxy) {
            this.vpnProxy = vpnProxy;
            return this;
        }
        public String getVpnProxy() {
            return this.vpnProxy;
        }

        public GetZidTagByAtokenResponseBodyData setWifiProxy(String wifiProxy) {
            this.wifiProxy = wifiProxy;
            return this;
        }
        public String getWifiProxy() {
            return this.wifiProxy;
        }

        public GetZidTagByAtokenResponseBodyData setZid(String zid) {
            this.zid = zid;
            return this;
        }
        public String getZid() {
            return this.zid;
        }

    }

}
