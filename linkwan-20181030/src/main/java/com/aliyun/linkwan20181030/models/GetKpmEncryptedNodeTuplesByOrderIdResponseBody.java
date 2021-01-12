// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkwan20181030.models;

import com.aliyun.tea.*;

public class GetKpmEncryptedNodeTuplesByOrderIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("EncryptedNodeTuples")
    public GetKpmEncryptedNodeTuplesByOrderIdResponseBodyEncryptedNodeTuples encryptedNodeTuples;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("EncryptedSessionZmk")
    public String encryptedSessionZmk;

    public static GetKpmEncryptedNodeTuplesByOrderIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKpmEncryptedNodeTuplesByOrderIdResponseBody self = new GetKpmEncryptedNodeTuplesByOrderIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKpmEncryptedNodeTuplesByOrderIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetKpmEncryptedNodeTuplesByOrderIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetKpmEncryptedNodeTuplesByOrderIdResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetKpmEncryptedNodeTuplesByOrderIdResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetKpmEncryptedNodeTuplesByOrderIdResponseBody setEncryptedNodeTuples(GetKpmEncryptedNodeTuplesByOrderIdResponseBodyEncryptedNodeTuples encryptedNodeTuples) {
        this.encryptedNodeTuples = encryptedNodeTuples;
        return this;
    }
    public GetKpmEncryptedNodeTuplesByOrderIdResponseBodyEncryptedNodeTuples getEncryptedNodeTuples() {
        return this.encryptedNodeTuples;
    }

    public GetKpmEncryptedNodeTuplesByOrderIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetKpmEncryptedNodeTuplesByOrderIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetKpmEncryptedNodeTuplesByOrderIdResponseBody setEncryptedSessionZmk(String encryptedSessionZmk) {
        this.encryptedSessionZmk = encryptedSessionZmk;
        return this;
    }
    public String getEncryptedSessionZmk() {
        return this.encryptedSessionZmk;
    }

    public static class GetKpmEncryptedNodeTuplesByOrderIdResponseBodyEncryptedNodeTuplesEncryptedNodeTuple extends TeaModel {
        @NameInMap("AppKeyKcv")
        public String appKeyKcv;

        @NameInMap("DevEui")
        public String devEui;

        @NameInMap("EncryptedNwkKey")
        public String encryptedNwkKey;

        @NameInMap("NwkKeyKcv")
        public String nwkKeyKcv;

        @NameInMap("EncryptedGenAppKey")
        public String encryptedGenAppKey;

        @NameInMap("PinCode")
        public String pinCode;

        @NameInMap("GenAppKeyKcv")
        public String genAppKeyKcv;

        @NameInMap("LoraVersion")
        public String loraVersion;

        @NameInMap("EncryptedAppKey")
        public String encryptedAppKey;

        public static GetKpmEncryptedNodeTuplesByOrderIdResponseBodyEncryptedNodeTuplesEncryptedNodeTuple build(java.util.Map<String, ?> map) throws Exception {
            GetKpmEncryptedNodeTuplesByOrderIdResponseBodyEncryptedNodeTuplesEncryptedNodeTuple self = new GetKpmEncryptedNodeTuplesByOrderIdResponseBodyEncryptedNodeTuplesEncryptedNodeTuple();
            return TeaModel.build(map, self);
        }

        public GetKpmEncryptedNodeTuplesByOrderIdResponseBodyEncryptedNodeTuplesEncryptedNodeTuple setAppKeyKcv(String appKeyKcv) {
            this.appKeyKcv = appKeyKcv;
            return this;
        }
        public String getAppKeyKcv() {
            return this.appKeyKcv;
        }

        public GetKpmEncryptedNodeTuplesByOrderIdResponseBodyEncryptedNodeTuplesEncryptedNodeTuple setDevEui(String devEui) {
            this.devEui = devEui;
            return this;
        }
        public String getDevEui() {
            return this.devEui;
        }

        public GetKpmEncryptedNodeTuplesByOrderIdResponseBodyEncryptedNodeTuplesEncryptedNodeTuple setEncryptedNwkKey(String encryptedNwkKey) {
            this.encryptedNwkKey = encryptedNwkKey;
            return this;
        }
        public String getEncryptedNwkKey() {
            return this.encryptedNwkKey;
        }

        public GetKpmEncryptedNodeTuplesByOrderIdResponseBodyEncryptedNodeTuplesEncryptedNodeTuple setNwkKeyKcv(String nwkKeyKcv) {
            this.nwkKeyKcv = nwkKeyKcv;
            return this;
        }
        public String getNwkKeyKcv() {
            return this.nwkKeyKcv;
        }

        public GetKpmEncryptedNodeTuplesByOrderIdResponseBodyEncryptedNodeTuplesEncryptedNodeTuple setEncryptedGenAppKey(String encryptedGenAppKey) {
            this.encryptedGenAppKey = encryptedGenAppKey;
            return this;
        }
        public String getEncryptedGenAppKey() {
            return this.encryptedGenAppKey;
        }

        public GetKpmEncryptedNodeTuplesByOrderIdResponseBodyEncryptedNodeTuplesEncryptedNodeTuple setPinCode(String pinCode) {
            this.pinCode = pinCode;
            return this;
        }
        public String getPinCode() {
            return this.pinCode;
        }

        public GetKpmEncryptedNodeTuplesByOrderIdResponseBodyEncryptedNodeTuplesEncryptedNodeTuple setGenAppKeyKcv(String genAppKeyKcv) {
            this.genAppKeyKcv = genAppKeyKcv;
            return this;
        }
        public String getGenAppKeyKcv() {
            return this.genAppKeyKcv;
        }

        public GetKpmEncryptedNodeTuplesByOrderIdResponseBodyEncryptedNodeTuplesEncryptedNodeTuple setLoraVersion(String loraVersion) {
            this.loraVersion = loraVersion;
            return this;
        }
        public String getLoraVersion() {
            return this.loraVersion;
        }

        public GetKpmEncryptedNodeTuplesByOrderIdResponseBodyEncryptedNodeTuplesEncryptedNodeTuple setEncryptedAppKey(String encryptedAppKey) {
            this.encryptedAppKey = encryptedAppKey;
            return this;
        }
        public String getEncryptedAppKey() {
            return this.encryptedAppKey;
        }

    }

    public static class GetKpmEncryptedNodeTuplesByOrderIdResponseBodyEncryptedNodeTuples extends TeaModel {
        @NameInMap("EncryptedNodeTuple")
        public java.util.List<GetKpmEncryptedNodeTuplesByOrderIdResponseBodyEncryptedNodeTuplesEncryptedNodeTuple> encryptedNodeTuple;

        public static GetKpmEncryptedNodeTuplesByOrderIdResponseBodyEncryptedNodeTuples build(java.util.Map<String, ?> map) throws Exception {
            GetKpmEncryptedNodeTuplesByOrderIdResponseBodyEncryptedNodeTuples self = new GetKpmEncryptedNodeTuplesByOrderIdResponseBodyEncryptedNodeTuples();
            return TeaModel.build(map, self);
        }

        public GetKpmEncryptedNodeTuplesByOrderIdResponseBodyEncryptedNodeTuples setEncryptedNodeTuple(java.util.List<GetKpmEncryptedNodeTuplesByOrderIdResponseBodyEncryptedNodeTuplesEncryptedNodeTuple> encryptedNodeTuple) {
            this.encryptedNodeTuple = encryptedNodeTuple;
            return this;
        }
        public java.util.List<GetKpmEncryptedNodeTuplesByOrderIdResponseBodyEncryptedNodeTuplesEncryptedNodeTuple> getEncryptedNodeTuple() {
            return this.encryptedNodeTuple;
        }

    }

}
