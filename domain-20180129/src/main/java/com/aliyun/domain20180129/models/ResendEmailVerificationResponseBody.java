// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class ResendEmailVerificationResponseBody extends TeaModel {
    @NameInMap("FailList")
    public java.util.List<ResendEmailVerificationResponseBodyFailList> failList;

    /**
     * <strong>example:</strong>
     * <p>0EA54E99-DB48-4CE3-A099-6ED8E451B8AC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessList")
    public java.util.List<ResendEmailVerificationResponseBodySuccessList> successList;

    public static ResendEmailVerificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResendEmailVerificationResponseBody self = new ResendEmailVerificationResponseBody();
        return TeaModel.build(map, self);
    }

    public ResendEmailVerificationResponseBody setFailList(java.util.List<ResendEmailVerificationResponseBodyFailList> failList) {
        this.failList = failList;
        return this;
    }
    public java.util.List<ResendEmailVerificationResponseBodyFailList> getFailList() {
        return this.failList;
    }

    public ResendEmailVerificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResendEmailVerificationResponseBody setSuccessList(java.util.List<ResendEmailVerificationResponseBodySuccessList> successList) {
        this.successList = successList;
        return this;
    }
    public java.util.List<ResendEmailVerificationResponseBodySuccessList> getSuccessList() {
        return this.successList;
    }

    public static class ResendEmailVerificationResponseBodyFailList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SendTokenQuotaExceeded</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:test1@aliyun.com">test1@aliyun.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>The maximum number of attempts allowed to send the email verification link is exceeded.</p>
         */
        @NameInMap("Message")
        public String message;

        public static ResendEmailVerificationResponseBodyFailList build(java.util.Map<String, ?> map) throws Exception {
            ResendEmailVerificationResponseBodyFailList self = new ResendEmailVerificationResponseBodyFailList();
            return TeaModel.build(map, self);
        }

        public ResendEmailVerificationResponseBodyFailList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ResendEmailVerificationResponseBodyFailList setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ResendEmailVerificationResponseBodyFailList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class ResendEmailVerificationResponseBodySuccessList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:test2@aliyun.com">test2@aliyun.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Message")
        public String message;

        public static ResendEmailVerificationResponseBodySuccessList build(java.util.Map<String, ?> map) throws Exception {
            ResendEmailVerificationResponseBodySuccessList self = new ResendEmailVerificationResponseBodySuccessList();
            return TeaModel.build(map, self);
        }

        public ResendEmailVerificationResponseBodySuccessList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ResendEmailVerificationResponseBodySuccessList setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ResendEmailVerificationResponseBodySuccessList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
