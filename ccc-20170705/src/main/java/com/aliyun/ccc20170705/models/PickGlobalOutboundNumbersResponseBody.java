// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class PickGlobalOutboundNumbersResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("DialNumberPairs")
    public PickGlobalOutboundNumbersResponseBodyDialNumberPairs dialNumberPairs;

    public static PickGlobalOutboundNumbersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PickGlobalOutboundNumbersResponseBody self = new PickGlobalOutboundNumbersResponseBody();
        return TeaModel.build(map, self);
    }

    public PickGlobalOutboundNumbersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PickGlobalOutboundNumbersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PickGlobalOutboundNumbersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public PickGlobalOutboundNumbersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PickGlobalOutboundNumbersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PickGlobalOutboundNumbersResponseBody setDialNumberPairs(PickGlobalOutboundNumbersResponseBodyDialNumberPairs dialNumberPairs) {
        this.dialNumberPairs = dialNumberPairs;
        return this;
    }
    public PickGlobalOutboundNumbersResponseBodyDialNumberPairs getDialNumberPairs() {
        return this.dialNumberPairs;
    }

    public static class PickGlobalOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCaller extends TeaModel {
        @NameInMap("Number")
        public String number;

        @NameInMap("City")
        public String city;

        @NameInMap("Province")
        public String province;

        public static PickGlobalOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCaller build(java.util.Map<String, ?> map) throws Exception {
            PickGlobalOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCaller self = new PickGlobalOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCaller();
            return TeaModel.build(map, self);
        }

        public PickGlobalOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCaller setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public PickGlobalOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCaller setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public PickGlobalOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCaller setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

    public static class PickGlobalOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCallee extends TeaModel {
        @NameInMap("Number")
        public String number;

        @NameInMap("City")
        public String city;

        @NameInMap("Province")
        public String province;

        public static PickGlobalOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCallee build(java.util.Map<String, ?> map) throws Exception {
            PickGlobalOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCallee self = new PickGlobalOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCallee();
            return TeaModel.build(map, self);
        }

        public PickGlobalOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCallee setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public PickGlobalOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCallee setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public PickGlobalOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCallee setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

    public static class PickGlobalOutboundNumbersResponseBodyDialNumberPairsDialNumberPair extends TeaModel {
        @NameInMap("Caller")
        public PickGlobalOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCaller caller;

        @NameInMap("Callee")
        public PickGlobalOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCallee callee;

        public static PickGlobalOutboundNumbersResponseBodyDialNumberPairsDialNumberPair build(java.util.Map<String, ?> map) throws Exception {
            PickGlobalOutboundNumbersResponseBodyDialNumberPairsDialNumberPair self = new PickGlobalOutboundNumbersResponseBodyDialNumberPairsDialNumberPair();
            return TeaModel.build(map, self);
        }

        public PickGlobalOutboundNumbersResponseBodyDialNumberPairsDialNumberPair setCaller(PickGlobalOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCaller caller) {
            this.caller = caller;
            return this;
        }
        public PickGlobalOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCaller getCaller() {
            return this.caller;
        }

        public PickGlobalOutboundNumbersResponseBodyDialNumberPairsDialNumberPair setCallee(PickGlobalOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCallee callee) {
            this.callee = callee;
            return this;
        }
        public PickGlobalOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCallee getCallee() {
            return this.callee;
        }

    }

    public static class PickGlobalOutboundNumbersResponseBodyDialNumberPairs extends TeaModel {
        @NameInMap("DialNumberPair")
        public java.util.List<PickGlobalOutboundNumbersResponseBodyDialNumberPairsDialNumberPair> dialNumberPair;

        public static PickGlobalOutboundNumbersResponseBodyDialNumberPairs build(java.util.Map<String, ?> map) throws Exception {
            PickGlobalOutboundNumbersResponseBodyDialNumberPairs self = new PickGlobalOutboundNumbersResponseBodyDialNumberPairs();
            return TeaModel.build(map, self);
        }

        public PickGlobalOutboundNumbersResponseBodyDialNumberPairs setDialNumberPair(java.util.List<PickGlobalOutboundNumbersResponseBodyDialNumberPairsDialNumberPair> dialNumberPair) {
            this.dialNumberPair = dialNumberPair;
            return this;
        }
        public java.util.List<PickGlobalOutboundNumbersResponseBodyDialNumberPairsDialNumberPair> getDialNumberPair() {
            return this.dialNumberPair;
        }

    }

}
