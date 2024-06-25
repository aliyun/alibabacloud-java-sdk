// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class AgentRecoverCallResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public AgentRecoverCallResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>8EFC6D10-307B-1ECA-A8C6-7CBDF776AAD2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>坐席标签</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <strong>example:</strong>
     * <p>1683440860035</p>
     */
    @NameInMap("Timestamp")
    public Long timestamp;

    public static AgentRecoverCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AgentRecoverCallResponseBody self = new AgentRecoverCallResponseBody();
        return TeaModel.build(map, self);
    }

    public AgentRecoverCallResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public AgentRecoverCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AgentRecoverCallResponseBody setModel(AgentRecoverCallResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public AgentRecoverCallResponseBodyModel getModel() {
        return this.model;
    }

    public AgentRecoverCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AgentRecoverCallResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public AgentRecoverCallResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static class AgentRecoverCallResponseBodyModel extends TeaModel {
        /**
         * <p>错误手机列表</p>
         */
        @NameInMap("UnHandleNumbers")
        public java.util.List<String> unHandleNumbers;

        public static AgentRecoverCallResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            AgentRecoverCallResponseBodyModel self = new AgentRecoverCallResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public AgentRecoverCallResponseBodyModel setUnHandleNumbers(java.util.List<String> unHandleNumbers) {
            this.unHandleNumbers = unHandleNumbers;
            return this;
        }
        public java.util.List<String> getUnHandleNumbers() {
            return this.unHandleNumbers;
        }

    }

}
