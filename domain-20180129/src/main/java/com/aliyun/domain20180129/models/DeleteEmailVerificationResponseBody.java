// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class DeleteEmailVerificationResponseBody extends TeaModel {
    /**
     * <p>List of email addresses for which deletion failed.</p>
     */
    @NameInMap("FailList")
    public java.util.List<DeleteEmailVerificationResponseBodyFailList> failList;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7A3D0E4A-0D4B-4BD0-90D7-A61DF8DD26AE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>List of successfully deleted email addresses.</p>
     */
    @NameInMap("SuccessList")
    public java.util.List<DeleteEmailVerificationResponseBodySuccessList> successList;

    public static DeleteEmailVerificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEmailVerificationResponseBody self = new DeleteEmailVerificationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEmailVerificationResponseBody setFailList(java.util.List<DeleteEmailVerificationResponseBodyFailList> failList) {
        this.failList = failList;
        return this;
    }
    public java.util.List<DeleteEmailVerificationResponseBodyFailList> getFailList() {
        return this.failList;
    }

    public DeleteEmailVerificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteEmailVerificationResponseBody setSuccessList(java.util.List<DeleteEmailVerificationResponseBodySuccessList> successList) {
        this.successList = successList;
        return this;
    }
    public java.util.List<DeleteEmailVerificationResponseBodySuccessList> getSuccessList() {
        return this.successList;
    }

    public static class DeleteEmailVerificationResponseBodyFailList extends TeaModel {
        /**
         * <p>Returned code.</p>
         * 
         * <strong>example:</strong>
         * <p>ParameterIllegall</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>Email address for which deletion failed.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test1@aliyun.com">test1@aliyun.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>Message returned upon failure to delete the email address.</p>
         * 
         * <strong>example:</strong>
         * <p>Parameter error</p>
         */
        @NameInMap("Message")
        public String message;

        public static DeleteEmailVerificationResponseBodyFailList build(java.util.Map<String, ?> map) throws Exception {
            DeleteEmailVerificationResponseBodyFailList self = new DeleteEmailVerificationResponseBodyFailList();
            return TeaModel.build(map, self);
        }

        public DeleteEmailVerificationResponseBodyFailList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DeleteEmailVerificationResponseBodyFailList setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public DeleteEmailVerificationResponseBodyFailList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class DeleteEmailVerificationResponseBodySuccessList extends TeaModel {
        /**
         * <p>Returned code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>Email address that was successfully deleted.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test2@aliyun.com">test2@aliyun.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>Message returned upon successful deletion of the email address.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Message")
        public String message;

        public static DeleteEmailVerificationResponseBodySuccessList build(java.util.Map<String, ?> map) throws Exception {
            DeleteEmailVerificationResponseBodySuccessList self = new DeleteEmailVerificationResponseBodySuccessList();
            return TeaModel.build(map, self);
        }

        public DeleteEmailVerificationResponseBodySuccessList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DeleteEmailVerificationResponseBodySuccessList setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public DeleteEmailVerificationResponseBodySuccessList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
