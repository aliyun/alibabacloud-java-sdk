// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class ResetUserPasswordResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Data")
    public ResetUserPasswordResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>req-reset-password-001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ResetUserPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetUserPasswordResponseBody self = new ResetUserPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetUserPasswordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ResetUserPasswordResponseBody setData(ResetUserPasswordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ResetUserPasswordResponseBodyData getData() {
        return this.data;
    }

    public ResetUserPasswordResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ResetUserPasswordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ResetUserPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResetUserPasswordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ResetUserPasswordResponseBodyData extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agentteams-test-001</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-user</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The password after the reset.</p>
         * 
         * <strong>example:</strong>
         * <p>NewP@ssw0rd456</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The user principal identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>sub-xxx</p>
         */
        @NameInMap("Subject")
        public String subject;

        /**
         * <p>The user pool ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pool-xxx</p>
         */
        @NameInMap("UserPoolId")
        public String userPoolId;

        public static ResetUserPasswordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ResetUserPasswordResponseBodyData self = new ResetUserPasswordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ResetUserPasswordResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ResetUserPasswordResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ResetUserPasswordResponseBodyData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ResetUserPasswordResponseBodyData setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public ResetUserPasswordResponseBodyData setUserPoolId(String userPoolId) {
            this.userPoolId = userPoolId;
            return this;
        }
        public String getUserPoolId() {
            return this.userPoolId;
        }

    }

}
