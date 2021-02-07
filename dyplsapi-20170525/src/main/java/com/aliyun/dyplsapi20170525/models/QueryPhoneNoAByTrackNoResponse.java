// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QueryPhoneNoAByTrackNoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Module")
    @Validation(required = true)
    public QueryPhoneNoAByTrackNoResponseModule module;

    public static QueryPhoneNoAByTrackNoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPhoneNoAByTrackNoResponse self = new QueryPhoneNoAByTrackNoResponse();
        return TeaModel.build(map, self);
    }

    public QueryPhoneNoAByTrackNoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPhoneNoAByTrackNoResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPhoneNoAByTrackNoResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryPhoneNoAByTrackNoResponse setModule(QueryPhoneNoAByTrackNoResponseModule module) {
        this.module = module;
        return this;
    }
    public QueryPhoneNoAByTrackNoResponseModule getModule() {
        return this.module;
    }

    public static class QueryPhoneNoAByTrackNoResponseModulePhoneNoAInfo extends TeaModel {
        @NameInMap("PhoneNoA")
        @Validation(required = true)
        public String phoneNoA;

        @NameInMap("PhoneNoX")
        @Validation(required = true)
        public String phoneNoX;

        public static QueryPhoneNoAByTrackNoResponseModulePhoneNoAInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryPhoneNoAByTrackNoResponseModulePhoneNoAInfo self = new QueryPhoneNoAByTrackNoResponseModulePhoneNoAInfo();
            return TeaModel.build(map, self);
        }

        public QueryPhoneNoAByTrackNoResponseModulePhoneNoAInfo setPhoneNoA(String phoneNoA) {
            this.phoneNoA = phoneNoA;
            return this;
        }
        public String getPhoneNoA() {
            return this.phoneNoA;
        }

        public QueryPhoneNoAByTrackNoResponseModulePhoneNoAInfo setPhoneNoX(String phoneNoX) {
            this.phoneNoX = phoneNoX;
            return this;
        }
        public String getPhoneNoX() {
            return this.phoneNoX;
        }

    }

    public static class QueryPhoneNoAByTrackNoResponseModule extends TeaModel {
        @NameInMap("phoneNoAInfo")
        @Validation(required = true)
        public java.util.List<QueryPhoneNoAByTrackNoResponseModulePhoneNoAInfo> phoneNoAInfo;

        public static QueryPhoneNoAByTrackNoResponseModule build(java.util.Map<String, ?> map) throws Exception {
            QueryPhoneNoAByTrackNoResponseModule self = new QueryPhoneNoAByTrackNoResponseModule();
            return TeaModel.build(map, self);
        }

        public QueryPhoneNoAByTrackNoResponseModule setPhoneNoAInfo(java.util.List<QueryPhoneNoAByTrackNoResponseModulePhoneNoAInfo> phoneNoAInfo) {
            this.phoneNoAInfo = phoneNoAInfo;
            return this;
        }
        public java.util.List<QueryPhoneNoAByTrackNoResponseModulePhoneNoAInfo> getPhoneNoAInfo() {
            return this.phoneNoAInfo;
        }

    }

}
