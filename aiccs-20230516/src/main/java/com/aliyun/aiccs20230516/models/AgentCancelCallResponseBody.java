// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class AgentCancelCallResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public AgentCancelCallResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("Timestamp")
    public Long timestamp;

    public static AgentCancelCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AgentCancelCallResponseBody self = new AgentCancelCallResponseBody();
        return TeaModel.build(map, self);
    }

    public AgentCancelCallResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public AgentCancelCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AgentCancelCallResponseBody setModel(AgentCancelCallResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public AgentCancelCallResponseBodyModel getModel() {
        return this.model;
    }

    public AgentCancelCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AgentCancelCallResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public AgentCancelCallResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static class AgentCancelCallResponseBodyModel extends TeaModel {
        /**
         * <p>错误手机列表</p>
         */
        @NameInMap("UnHandleNumbers")
        public java.util.List<String> unHandleNumbers;

        public static AgentCancelCallResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            AgentCancelCallResponseBodyModel self = new AgentCancelCallResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public AgentCancelCallResponseBodyModel setUnHandleNumbers(java.util.List<String> unHandleNumbers) {
            this.unHandleNumbers = unHandleNumbers;
            return this;
        }
        public java.util.List<String> getUnHandleNumbers() {
            return this.unHandleNumbers;
        }

    }

}
