// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QueryPhoneNoAByTrackNoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Module")
    public java.util.List<QueryPhoneNoAByTrackNoResponseBodyModule> module;

    public static QueryPhoneNoAByTrackNoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPhoneNoAByTrackNoResponseBody self = new QueryPhoneNoAByTrackNoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPhoneNoAByTrackNoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
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

    public QueryPhoneNoAByTrackNoResponseBody setModule(java.util.List<QueryPhoneNoAByTrackNoResponseBodyModule> module) {
        this.module = module;
        return this;
    }
    public java.util.List<QueryPhoneNoAByTrackNoResponseBodyModule> getModule() {
        return this.module;
    }

    public static class QueryPhoneNoAByTrackNoResponseBodyModule extends TeaModel {
        @NameInMap("Extension")
        public String extension;

        @NameInMap("PhoneNoX")
        public String phoneNoX;

        @NameInMap("PhoneNoA")
        public String phoneNoA;

        public static QueryPhoneNoAByTrackNoResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            QueryPhoneNoAByTrackNoResponseBodyModule self = new QueryPhoneNoAByTrackNoResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public QueryPhoneNoAByTrackNoResponseBodyModule setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public QueryPhoneNoAByTrackNoResponseBodyModule setPhoneNoX(String phoneNoX) {
            this.phoneNoX = phoneNoX;
            return this;
        }
        public String getPhoneNoX() {
            return this.phoneNoX;
        }

        public QueryPhoneNoAByTrackNoResponseBodyModule setPhoneNoA(String phoneNoA) {
            this.phoneNoA = phoneNoA;
            return this;
        }
        public String getPhoneNoA() {
            return this.phoneNoA;
        }

    }

}
