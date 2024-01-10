// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class StartPTDetectionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public StartPTDetectionResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static StartPTDetectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartPTDetectionResponseBody self = new StartPTDetectionResponseBody();
        return TeaModel.build(map, self);
    }

    public StartPTDetectionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StartPTDetectionResponseBody setData(StartPTDetectionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StartPTDetectionResponseBodyData getData() {
        return this.data;
    }

    public StartPTDetectionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public StartPTDetectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartPTDetectionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class StartPTDetectionResponseBodyData extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("InputData")
        public String inputData;

        @NameInMap("Status")
        public String status;

        @NameInMap("Success")
        public Boolean success;

        public static StartPTDetectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StartPTDetectionResponseBodyData self = new StartPTDetectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StartPTDetectionResponseBodyData setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public StartPTDetectionResponseBodyData setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public StartPTDetectionResponseBodyData setInputData(String inputData) {
            this.inputData = inputData;
            return this;
        }
        public String getInputData() {
            return this.inputData;
        }

        public StartPTDetectionResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public StartPTDetectionResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
