// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ExecuteNodeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("SubCode")
    @Validation(required = true)
    public String subCode;

    @NameInMap("SubMessage")
    @Validation(required = true)
    public String subMessage;

    @NameInMap("LogsId")
    @Validation(required = true)
    public String logsId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("Model")
    @Validation(required = true)
    public ExecuteNodeResponseModel model;

    public static ExecuteNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteNodeResponse self = new ExecuteNodeResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteNodeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteNodeResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExecuteNodeResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExecuteNodeResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public ExecuteNodeResponse setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public ExecuteNodeResponse setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public ExecuteNodeResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ExecuteNodeResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ExecuteNodeResponse setModel(ExecuteNodeResponseModel model) {
        this.model = model;
        return this;
    }
    public ExecuteNodeResponseModel getModel() {
        return this.model;
    }

    public static class ExecuteNodeResponseModel extends TeaModel {
        @NameInMap("ProcessInstanceId")
        @Validation(required = true)
        public String processInstanceId;

        @NameInMap("ResponseData")
        @Validation(required = true)
        public java.util.Map<String, ?> responseData;

        public static ExecuteNodeResponseModel build(java.util.Map<String, ?> map) throws Exception {
            ExecuteNodeResponseModel self = new ExecuteNodeResponseModel();
            return TeaModel.build(map, self);
        }

        public ExecuteNodeResponseModel setProcessInstanceId(String processInstanceId) {
            this.processInstanceId = processInstanceId;
            return this;
        }
        public String getProcessInstanceId() {
            return this.processInstanceId;
        }

        public ExecuteNodeResponseModel setResponseData(java.util.Map<String, ?> responseData) {
            this.responseData = responseData;
            return this;
        }
        public java.util.Map<String, ?> getResponseData() {
            return this.responseData;
        }

    }

}
