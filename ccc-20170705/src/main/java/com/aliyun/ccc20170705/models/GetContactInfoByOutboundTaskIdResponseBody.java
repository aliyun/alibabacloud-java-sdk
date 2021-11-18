// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetContactInfoByOutboundTaskIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ContactIdentity")
    public GetContactInfoByOutboundTaskIdResponseBodyContactIdentity contactIdentity;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetContactInfoByOutboundTaskIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetContactInfoByOutboundTaskIdResponseBody self = new GetContactInfoByOutboundTaskIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetContactInfoByOutboundTaskIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetContactInfoByOutboundTaskIdResponseBody setContactIdentity(GetContactInfoByOutboundTaskIdResponseBodyContactIdentity contactIdentity) {
        this.contactIdentity = contactIdentity;
        return this;
    }
    public GetContactInfoByOutboundTaskIdResponseBodyContactIdentity getContactIdentity() {
        return this.contactIdentity;
    }

    public GetContactInfoByOutboundTaskIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetContactInfoByOutboundTaskIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetContactInfoByOutboundTaskIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetContactInfoByOutboundTaskIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetContactInfoByOutboundTaskIdResponseBodyContactIdentity extends TeaModel {
        @NameInMap("Caller")
        public String caller;

        @NameInMap("ContactReferrnceId")
        public String contactReferrnceId;

        @NameInMap("JobGroupId")
        public String jobGroupId;

        @NameInMap("UserPhone")
        public String userPhone;

        public static GetContactInfoByOutboundTaskIdResponseBodyContactIdentity build(java.util.Map<String, ?> map) throws Exception {
            GetContactInfoByOutboundTaskIdResponseBodyContactIdentity self = new GetContactInfoByOutboundTaskIdResponseBodyContactIdentity();
            return TeaModel.build(map, self);
        }

        public GetContactInfoByOutboundTaskIdResponseBodyContactIdentity setCaller(String caller) {
            this.caller = caller;
            return this;
        }
        public String getCaller() {
            return this.caller;
        }

        public GetContactInfoByOutboundTaskIdResponseBodyContactIdentity setContactReferrnceId(String contactReferrnceId) {
            this.contactReferrnceId = contactReferrnceId;
            return this;
        }
        public String getContactReferrnceId() {
            return this.contactReferrnceId;
        }

        public GetContactInfoByOutboundTaskIdResponseBodyContactIdentity setJobGroupId(String jobGroupId) {
            this.jobGroupId = jobGroupId;
            return this;
        }
        public String getJobGroupId() {
            return this.jobGroupId;
        }

        public GetContactInfoByOutboundTaskIdResponseBodyContactIdentity setUserPhone(String userPhone) {
            this.userPhone = userPhone;
            return this;
        }
        public String getUserPhone() {
            return this.userPhone;
        }

    }

}
