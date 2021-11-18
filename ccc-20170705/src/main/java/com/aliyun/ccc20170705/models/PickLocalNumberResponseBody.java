// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class PickLocalNumberResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public PickLocalNumberResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PickLocalNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PickLocalNumberResponseBody self = new PickLocalNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public PickLocalNumberResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PickLocalNumberResponseBody setData(PickLocalNumberResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PickLocalNumberResponseBodyData getData() {
        return this.data;
    }

    public PickLocalNumberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PickLocalNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PickLocalNumberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PickLocalNumberResponseBodyDataCallee extends TeaModel {
        @NameInMap("City")
        public String city;

        @NameInMap("Number")
        public String number;

        @NameInMap("Province")
        public String province;

        public static PickLocalNumberResponseBodyDataCallee build(java.util.Map<String, ?> map) throws Exception {
            PickLocalNumberResponseBodyDataCallee self = new PickLocalNumberResponseBodyDataCallee();
            return TeaModel.build(map, self);
        }

        public PickLocalNumberResponseBodyDataCallee setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public PickLocalNumberResponseBodyDataCallee setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public PickLocalNumberResponseBodyDataCallee setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

    public static class PickLocalNumberResponseBodyDataCaller extends TeaModel {
        @NameInMap("City")
        public String city;

        @NameInMap("Number")
        public String number;

        @NameInMap("Province")
        public String province;

        public static PickLocalNumberResponseBodyDataCaller build(java.util.Map<String, ?> map) throws Exception {
            PickLocalNumberResponseBodyDataCaller self = new PickLocalNumberResponseBodyDataCaller();
            return TeaModel.build(map, self);
        }

        public PickLocalNumberResponseBodyDataCaller setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public PickLocalNumberResponseBodyDataCaller setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public PickLocalNumberResponseBodyDataCaller setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

    public static class PickLocalNumberResponseBodyData extends TeaModel {
        @NameInMap("Callee")
        public PickLocalNumberResponseBodyDataCallee callee;

        @NameInMap("Caller")
        public PickLocalNumberResponseBodyDataCaller caller;

        public static PickLocalNumberResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PickLocalNumberResponseBodyData self = new PickLocalNumberResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PickLocalNumberResponseBodyData setCallee(PickLocalNumberResponseBodyDataCallee callee) {
            this.callee = callee;
            return this;
        }
        public PickLocalNumberResponseBodyDataCallee getCallee() {
            return this.callee;
        }

        public PickLocalNumberResponseBodyData setCaller(PickLocalNumberResponseBodyDataCaller caller) {
            this.caller = caller;
            return this;
        }
        public PickLocalNumberResponseBodyDataCaller getCaller() {
            return this.caller;
        }

    }

}
