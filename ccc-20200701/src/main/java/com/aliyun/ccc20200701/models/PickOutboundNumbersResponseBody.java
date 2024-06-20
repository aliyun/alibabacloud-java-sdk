// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class PickOutboundNumbersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<PickOutboundNumbersResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EEEE671A-3E24-4A04-81E6-6C4F5B39DF75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PickOutboundNumbersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PickOutboundNumbersResponseBody self = new PickOutboundNumbersResponseBody();
        return TeaModel.build(map, self);
    }

    public PickOutboundNumbersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PickOutboundNumbersResponseBody setData(java.util.List<PickOutboundNumbersResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PickOutboundNumbersResponseBodyData> getData() {
        return this.data;
    }

    public PickOutboundNumbersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public static class PickOutboundNumbersResponseBodyDataCallee extends TeaModel {
        @NameInMap("City")
        public String city;

        /**
         * <strong>example:</strong>
         * <p>1388888****</p>
         */
        @NameInMap("Number")
        public String number;

        @NameInMap("Province")
        public String province;

        public static PickOutboundNumbersResponseBodyDataCallee build(java.util.Map<String, ?> map) throws Exception {
            PickOutboundNumbersResponseBodyDataCallee self = new PickOutboundNumbersResponseBodyDataCallee();
            return TeaModel.build(map, self);
        }

        public PickOutboundNumbersResponseBodyDataCallee setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public PickOutboundNumbersResponseBodyDataCallee setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public PickOutboundNumbersResponseBodyDataCallee setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

    public static class PickOutboundNumbersResponseBodyDataCaller extends TeaModel {
        @NameInMap("City")
        public String city;

        /**
         * <strong>example:</strong>
         * <p>0108989****</p>
         */
        @NameInMap("Number")
        public String number;

        @NameInMap("Province")
        public String province;

        public static PickOutboundNumbersResponseBodyDataCaller build(java.util.Map<String, ?> map) throws Exception {
            PickOutboundNumbersResponseBodyDataCaller self = new PickOutboundNumbersResponseBodyDataCaller();
            return TeaModel.build(map, self);
        }

        public PickOutboundNumbersResponseBodyDataCaller setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public PickOutboundNumbersResponseBodyDataCaller setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public PickOutboundNumbersResponseBodyDataCaller setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

    public static class PickOutboundNumbersResponseBodyData extends TeaModel {
        @NameInMap("Callee")
        public PickOutboundNumbersResponseBodyDataCallee callee;

        @NameInMap("Caller")
        public PickOutboundNumbersResponseBodyDataCaller caller;

        public static PickOutboundNumbersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PickOutboundNumbersResponseBodyData self = new PickOutboundNumbersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PickOutboundNumbersResponseBodyData setCallee(PickOutboundNumbersResponseBodyDataCallee callee) {
            this.callee = callee;
            return this;
        }
        public PickOutboundNumbersResponseBodyDataCallee getCallee() {
            return this.callee;
        }

        public PickOutboundNumbersResponseBodyData setCaller(PickOutboundNumbersResponseBodyDataCaller caller) {
            this.caller = caller;
            return this;
        }
        public PickOutboundNumbersResponseBodyDataCaller getCaller() {
            return this.caller;
        }

    }

}
