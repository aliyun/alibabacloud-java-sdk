// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ExternalUserQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public ExternalUserQueryResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>407543AF-2BD9-5890-BD92-9D1AB7218B27</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     * 
     * <strong>example:</strong>
     * <p>210e847f16611516748613869de4f6</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>2000-01-02</p>
         */
        @NameInMap("birthday")
        public String birthday;

        /**
         * <strong>example:</strong>
         * <p>btrip123456</p>
         */
        @NameInMap("corp_id")
        public String corpId;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:zhangsan@alibaba-inc.com">zhangsan@alibaba-inc.com</a></p>
         */
        @NameInMap("email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>000001</p>
         */
        @NameInMap("external_user_id")
        public String externalUserId;

        /**
         * <strong>example:</strong>
         * <p>13438009765</p>
         */
        @NameInMap("phone")
        public String phone;

        @NameInMap("real_name")
        public String realName;

        /**
         * <strong>example:</strong>
         * <p>zhang/san</p>
         */
        @NameInMap("real_name_en")
        public String realNameEn;

        /**
         * <strong>example:</strong>
         * <p>e1$12345678</p>
         */
        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_nick")
        public String userNick;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
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
