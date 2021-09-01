// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ExecuteNodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Model")
    public ExecuteNodeResponseBodyModel model;

    public static ExecuteNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteNodeResponseBody self = new ExecuteNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteNodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ExecuteNodeResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public ExecuteNodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExecuteNodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExecuteNodeResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public ExecuteNodeResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ExecuteNodeResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public ExecuteNodeResponseBody setModel(ExecuteNodeResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public ExecuteNodeResponseBodyModel getModel() {
        return this.model;
    }

    public static class ExecuteNodeResponseBodyModel extends TeaModel {
        @NameInMap("ResponseData")
        public java.util.Map<String, ?> responseData;

        @NameInMap("ProcessInstanceId")
        public String processInstanceId;

        public static ExecuteNodeResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ExecuteNodeResponseBodyModel self = new ExecuteNodeResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ExecuteNodeResponseBodyModel setResponseData(java.util.Map<String, ?> responseData) {
            this.responseData = responseData;
            return this;
        }
        public java.util.Map<String, ?> getResponseData() {
            return this.responseData;
        }

        public ExecuteNodeResponseBodyModel setProcessInstanceId(String processInstanceId) {
            this.processInstanceId = processInstanceId;
            return this;
        }
        public String getProcessInstanceId() {
            return this.processInstanceId;
        }

    }

}
