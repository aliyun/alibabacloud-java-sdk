// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class PickOutboundNumbersResponseBody extends TeaModel {
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
    public PickOutboundNumbersResponseBodyDialNumberPairs dialNumberPairs;

    public static PickOutboundNumbersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PickOutboundNumbersResponseBody self = new PickOutboundNumbersResponseBody();
        return TeaModel.build(map, self);
    }

    public PickOutboundNumbersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PickOutboundNumbersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PickOutboundNumbersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public PickOutboundNumbersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PickOutboundNumbersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PickOutboundNumbersResponseBody setDialNumberPairs(PickOutboundNumbersResponseBodyDialNumberPairs dialNumberPairs) {
        this.dialNumberPairs = dialNumberPairs;
        return this;
    }
    public PickOutboundNumbersResponseBodyDialNumberPairs getDialNumberPairs() {
        return this.dialNumberPairs;
    }

    public static class PickOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCaller extends TeaModel {
        @NameInMap("Number")
        public String number;

        @NameInMap("City")
        public String city;

        @NameInMap("Province")
        public String province;

        public static PickOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCaller build(java.util.Map<String, ?> map) throws Exception {
            PickOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCaller self = new PickOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCaller();
            return TeaModel.build(map, self);
        }

        public PickOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCaller setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public PickOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCaller setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public PickOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCaller setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

    public static class PickOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCallee extends TeaModel {
        @NameInMap("Number")
        public String number;

        @NameInMap("City")
        public String city;

        @NameInMap("Province")
        public String province;

        public static PickOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCallee build(java.util.Map<String, ?> map) throws Exception {
            PickOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCallee self = new PickOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCallee();
            return TeaModel.build(map, self);
        }

        public PickOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCallee setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public PickOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCallee setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public PickOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCallee setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

    public static class PickOutboundNumbersResponseBodyDialNumberPairsDialNumberPair extends TeaModel {
        @NameInMap("Caller")
        public PickOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCaller caller;

        @NameInMap("Callee")
        public PickOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCallee callee;

        public static PickOutboundNumbersResponseBodyDialNumberPairsDialNumberPair build(java.util.Map<String, ?> map) throws Exception {
            PickOutboundNumbersResponseBodyDialNumberPairsDialNumberPair self = new PickOutboundNumbersResponseBodyDialNumberPairsDialNumberPair();
            return TeaModel.build(map, self);
        }

        public PickOutboundNumbersResponseBodyDialNumberPairsDialNumberPair setCaller(PickOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCaller caller) {
            this.caller = caller;
            return this;
        }
        public PickOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCaller getCaller() {
            return this.caller;
        }

        public PickOutboundNumbersResponseBodyDialNumberPairsDialNumberPair setCallee(PickOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCallee callee) {
            this.callee = callee;
            return this;
        }
        public PickOutboundNumbersResponseBodyDialNumberPairsDialNumberPairCallee getCallee() {
            return this.callee;
        }

    }

    public static class PickOutboundNumbersResponseBodyDialNumberPairs extends TeaModel {
        @NameInMap("DialNumberPair")
        public java.util.List<PickOutboundNumbersResponseBodyDialNumberPairsDialNumberPair> dialNumberPair;

        public static PickOutboundNumbersResponseBodyDialNumberPairs build(java.util.Map<String, ?> map) throws Exception {
            PickOutboundNumbersResponseBodyDialNumberPairs self = new PickOutboundNumbersResponseBodyDialNumberPairs();
            return TeaModel.build(map, self);
        }

        public PickOutboundNumbersResponseBodyDialNumberPairs setDialNumberPair(java.util.List<PickOutboundNumbersResponseBodyDialNumberPairsDialNumberPair> dialNumberPair) {
            this.dialNumberPair = dialNumberPair;
            return this;
        }
        public java.util.List<PickOutboundNumbersResponseBodyDialNumberPairsDialNumberPair> getDialNumberPair() {
            return this.dialNumberPair;
        }

    }

}
