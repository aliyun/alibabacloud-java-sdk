// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QueryPhoneNoAByTrackNoResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Module")
    public QueryPhoneNoAByTrackNoResponseBodyModule module;

    @NameInMap("Code")
    public String code;

    public static QueryPhoneNoAByTrackNoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPhoneNoAByTrackNoResponseBody self = new QueryPhoneNoAByTrackNoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPhoneNoAByTrackNoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryPhoneNoAByTrackNoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPhoneNoAByTrackNoResponseBody setModule(QueryPhoneNoAByTrackNoResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public QueryPhoneNoAByTrackNoResponseBodyModule getModule() {
        return this.module;
    }

    public QueryPhoneNoAByTrackNoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class QueryPhoneNoAByTrackNoResponseBodyModulePhoneNoAInfo extends TeaModel {
        @NameInMap("PhoneNoX")
        public String phoneNoX;

        @NameInMap("PhoneNoA")
        public String phoneNoA;

        public static QueryPhoneNoAByTrackNoResponseBodyModulePhoneNoAInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryPhoneNoAByTrackNoResponseBodyModulePhoneNoAInfo self = new QueryPhoneNoAByTrackNoResponseBodyModulePhoneNoAInfo();
            return TeaModel.build(map, self);
        }

        public QueryPhoneNoAByTrackNoResponseBodyModulePhoneNoAInfo setPhoneNoX(String phoneNoX) {
            this.phoneNoX = phoneNoX;
            return this;
        }
        public String getPhoneNoX() {
            return this.phoneNoX;
        }

        public QueryPhoneNoAByTrackNoResponseBodyModulePhoneNoAInfo setPhoneNoA(String phoneNoA) {
            this.phoneNoA = phoneNoA;
            return this;
        }
        public String getPhoneNoA() {
            return this.phoneNoA;
        }

    }

    public static class QueryPhoneNoAByTrackNoResponseBodyModule extends TeaModel {
        @NameInMap("phoneNoAInfo")
        public java.util.List<QueryPhoneNoAByTrackNoResponseBodyModulePhoneNoAInfo> phoneNoAInfo;

        public static QueryPhoneNoAByTrackNoResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            QueryPhoneNoAByTrackNoResponseBodyModule self = new QueryPhoneNoAByTrackNoResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public QueryPhoneNoAByTrackNoResponseBodyModule setPhoneNoAInfo(java.util.List<QueryPhoneNoAByTrackNoResponseBodyModulePhoneNoAInfo> phoneNoAInfo) {
            this.phoneNoAInfo = phoneNoAInfo;
            return this;
        }
        public java.util.List<QueryPhoneNoAByTrackNoResponseBodyModulePhoneNoAInfo> getPhoneNoAInfo() {
            return this.phoneNoAInfo;
        }

    }

}
