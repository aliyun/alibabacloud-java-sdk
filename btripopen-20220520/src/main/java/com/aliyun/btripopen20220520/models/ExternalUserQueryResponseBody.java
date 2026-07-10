// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ExternalUserQueryResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public ExternalUserQueryResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static ExternalUserQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExternalUserQueryResponseBody self = new ExternalUserQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public ExternalUserQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExternalUserQueryResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ExternalUserQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExternalUserQueryResponseBody setModule(ExternalUserQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public ExternalUserQueryResponseBodyModule getModule() {
        return this.module;
    }

    public ExternalUserQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExternalUserQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ExternalUserQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ExternalUserQueryResponseBodyModule extends TeaModel {
        @NameInMap("birthday")
        public String birthday;

        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("email")
        public String email;

        @NameInMap("external_user_id")
        public String externalUserId;

        @NameInMap("phone")
        public String phone;

        @NameInMap("real_name")
        public String realName;

        @NameInMap("real_name_en")
        public String realNameEn;

        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_nick")
        public String userNick;

        @NameInMap("user_type")
        public Integer userType;

        public static ExternalUserQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            ExternalUserQueryResponseBodyModule self = new ExternalUserQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public ExternalUserQueryResponseBodyModule setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }
        public String getBirthday() {
            return this.birthday;
        }

        public ExternalUserQueryResponseBodyModule setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ExternalUserQueryResponseBodyModule setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ExternalUserQueryResponseBodyModule setExternalUserId(String externalUserId) {
            this.externalUserId = externalUserId;
            return this;
        }
        public String getExternalUserId() {
            return this.externalUserId;
        }

        public ExternalUserQueryResponseBodyModule setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public ExternalUserQueryResponseBodyModule setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public ExternalUserQueryResponseBodyModule setRealNameEn(String realNameEn) {
            this.realNameEn = realNameEn;
            return this;
        }
        public String getRealNameEn() {
            return this.realNameEn;
        }

        public ExternalUserQueryResponseBodyModule setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ExternalUserQueryResponseBodyModule setUserNick(String userNick) {
            this.userNick = userNick;
            return this;
        }
        public String getUserNick() {
            return this.userNick;
        }

        public ExternalUserQueryResponseBodyModule setUserType(Integer userType) {
            this.userType = userType;
            return this;
        }
        public Integer getUserType() {
            return this.userType;
        }

    }

}
