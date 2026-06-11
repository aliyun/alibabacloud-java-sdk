// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class OperateCustomAgentResponseBody extends TeaModel {
    /**
     * <p>Return struct</p>
     */
    @NameInMap("Data")
    public OperateCustomAgentResponseBodyData data;

    /**
     * <p>Error code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Error message returned when the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Specified parameter Tid is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Is the request successful? Return values are as follows:</p>
     * <ul>
     * <li><p>True: The request is successful.</p>
     * </li>
     * <li><p>False: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static OperateCustomAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateCustomAgentResponseBody self = new OperateCustomAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateCustomAgentResponseBody setData(OperateCustomAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OperateCustomAgentResponseBodyData getData() {
        return this.data;
    }

    public OperateCustomAgentResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public OperateCustomAgentResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public OperateCustomAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OperateCustomAgentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class OperateCustomAgentResponseBodyData extends TeaModel {
        /**
         * <p>Custom Agent ID</p>
         * 
         * <strong>example:</strong>
         * <p>ca-4y3ca4khkcu**********ysf</p>
         */
        @NameInMap("CustomAgentId")
        public String customAgentId;

        /**
         * <p>Operation message</p>
         * 
         * <strong>example:</strong>
         * <p>Custom agent successfully released</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Is the operation successful?</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static OperateCustomAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OperateCustomAgentResponseBodyData self = new OperateCustomAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OperateCustomAgentResponseBodyData setCustomAgentId(String customAgentId) {
            this.customAgentId = customAgentId;
            return this;
        }
        public String getCustomAgentId() {
            return this.customAgentId;
        }

        public OperateCustomAgentResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public OperateCustomAgentResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
