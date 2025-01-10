// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class InitializeVccResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Content")
    public InitializeVccResponseBodyContent content;

    /**
     * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
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
     * <p>E30DA7CB-03D0-51EB-8F18-856B99987E18</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static InitializeVccResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitializeVccResponseBody self = new InitializeVccResponseBody();
        return TeaModel.build(map, self);
    }

    public InitializeVccResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public InitializeVccResponseBody setContent(InitializeVccResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public InitializeVccResponseBodyContent getContent() {
        return this.content;
    }

    public InitializeVccResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InitializeVccResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InitializeVccResponseBodyContent extends TeaModel {
        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E30DA7CB-03D0-51EB-8F18-856B99987E18</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>Linked Role of Lingjun Connection Instance (AliyunServiceRoleForEfloVcc)</p>
         * 
         * <strong>example:</strong>
         * <p>CloudConnectionOperationRole</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        public static InitializeVccResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            InitializeVccResponseBodyContent self = new InitializeVccResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public InitializeVccResponseBodyContent setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public InitializeVccResponseBodyContent setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

}
