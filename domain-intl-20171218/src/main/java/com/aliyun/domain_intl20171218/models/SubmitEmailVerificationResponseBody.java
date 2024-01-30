// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SubmitEmailVerificationResponseBody extends TeaModel {
    @NameInMap("ExistList")
    public java.util.List<SubmitEmailVerificationResponseBodyExistList> existList;

    @NameInMap("FailList")
    public java.util.List<SubmitEmailVerificationResponseBodyFailList> failList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessList")
    public java.util.List<SubmitEmailVerificationResponseBodySuccessList> successList;

    public static SubmitEmailVerificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitEmailVerificationResponseBody self = new SubmitEmailVerificationResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitEmailVerificationResponseBody setExistList(java.util.List<SubmitEmailVerificationResponseBodyExistList> existList) {
        this.existList = existList;
        return this;
    }
    public java.util.List<SubmitEmailVerificationResponseBodyExistList> getExistList() {
        return this.existList;
    }

    public SubmitEmailVerificationResponseBody setFailList(java.util.List<SubmitEmailVerificationResponseBodyFailList> failList) {
        this.failList = failList;
        return this;
    }
    public java.util.List<SubmitEmailVerificationResponseBodyFailList> getFailList() {
        return this.failList;
    }

    public SubmitEmailVerificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitEmailVerificationResponseBody setSuccessList(java.util.List<SubmitEmailVerificationResponseBodySuccessList> successList) {
        this.successList = successList;
        return this;
    }
    public java.util.List<SubmitEmailVerificationResponseBodySuccessList> getSuccessList() {
        return this.successList;
    }

    public static class SubmitEmailVerificationResponseBodyExistList extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Email")
        public String email;

        @NameInMap("Message")
        public String message;

        public static SubmitEmailVerificationResponseBodyExistList build(java.util.Map<String, ?> map) throws Exception {
            SubmitEmailVerificationResponseBodyExistList self = new SubmitEmailVerificationResponseBodyExistList();
            return TeaModel.build(map, self);
        }

        public SubmitEmailVerificationResponseBodyExistList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SubmitEmailVerificationResponseBodyExistList setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public SubmitEmailVerificationResponseBodyExistList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class SubmitEmailVerificationResponseBodyFailList extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Email")
        public String email;

        @NameInMap("Message")
        public String message;

        public static SubmitEmailVerificationResponseBodyFailList build(java.util.Map<String, ?> map) throws Exception {
            SubmitEmailVerificationResponseBodyFailList self = new SubmitEmailVerificationResponseBodyFailList();
            return TeaModel.build(map, self);
        }

        public SubmitEmailVerificationResponseBodyFailList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SubmitEmailVerificationResponseBodyFailList setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public SubmitEmailVerificationResponseBodyFailList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class SubmitEmailVerificationResponseBodySuccessList extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Email")
        public String email;

        @NameInMap("Message")
        public String message;

        public static SubmitEmailVerificationResponseBodySuccessList build(java.util.Map<String, ?> map) throws Exception {
            SubmitEmailVerificationResponseBodySuccessList self = new SubmitEmailVerificationResponseBodySuccessList();
            return TeaModel.build(map, self);
        }

        public SubmitEmailVerificationResponseBodySuccessList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SubmitEmailVerificationResponseBodySuccessList setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public SubmitEmailVerificationResponseBodySuccessList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
