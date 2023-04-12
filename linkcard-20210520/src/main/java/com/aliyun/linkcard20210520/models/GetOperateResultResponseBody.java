// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class GetOperateResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetOperateResultResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("LocalizedMessage")
    public String localizedMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetOperateResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOperateResultResponseBody self = new GetOperateResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOperateResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOperateResultResponseBody setData(GetOperateResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOperateResultResponseBodyData getData() {
        return this.data;
    }

    public GetOperateResultResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetOperateResultResponseBody setLocalizedMessage(String localizedMessage) {
        this.localizedMessage = localizedMessage;
        return this;
    }
    public String getLocalizedMessage() {
        return this.localizedMessage;
    }

    public GetOperateResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOperateResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOperateResultResponseBodyData extends TeaModel {
        @NameInMap("ExecuteResult")
        public String executeResult;

        @NameInMap("OperateType")
        public String operateType;

        @NameInMap("Result")
        public Boolean result;

        @NameInMap("Status")
        public String status;

        public static GetOperateResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOperateResultResponseBodyData self = new GetOperateResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOperateResultResponseBodyData setExecuteResult(String executeResult) {
            this.executeResult = executeResult;
            return this;
        }
        public String getExecuteResult() {
            return this.executeResult;
        }

        public GetOperateResultResponseBodyData setOperateType(String operateType) {
            this.operateType = operateType;
            return this;
        }
        public String getOperateType() {
            return this.operateType;
        }

        public GetOperateResultResponseBodyData setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

        public GetOperateResultResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
