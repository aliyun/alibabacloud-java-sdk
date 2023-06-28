// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetAsyncTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAsyncTaskResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetAsyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncTaskResponseBody self = new GetAsyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAsyncTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAsyncTaskResponseBody setData(GetAsyncTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAsyncTaskResponseBodyData getData() {
        return this.data;
    }

    public GetAsyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAsyncTaskResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetAsyncTaskResponseBodyData extends TeaModel {
        @NameInMap("AsyncTaskId")
        public String asyncTaskId;

        @NameInMap("ConsumedProcess")
        public String consumedProcess;

        @NameInMap("ErrCode")
        public Long errCode;

        @NameInMap("Message")
        public String message;

        @NameInMap("Status")
        public String status;

        @NameInMap("TotalProcess")
        public Long totalProcess;

        @NameInMap("Url")
        public String url;

        public static GetAsyncTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAsyncTaskResponseBodyData self = new GetAsyncTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAsyncTaskResponseBodyData setAsyncTaskId(String asyncTaskId) {
            this.asyncTaskId = asyncTaskId;
            return this;
        }
        public String getAsyncTaskId() {
            return this.asyncTaskId;
        }

        public GetAsyncTaskResponseBodyData setConsumedProcess(String consumedProcess) {
            this.consumedProcess = consumedProcess;
            return this;
        }
        public String getConsumedProcess() {
            return this.consumedProcess;
        }

        public GetAsyncTaskResponseBodyData setErrCode(Long errCode) {
            this.errCode = errCode;
            return this;
        }
        public Long getErrCode() {
            return this.errCode;
        }

        public GetAsyncTaskResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetAsyncTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAsyncTaskResponseBodyData setTotalProcess(Long totalProcess) {
            this.totalProcess = totalProcess;
            return this;
        }
        public Long getTotalProcess() {
            return this.totalProcess;
        }

        public GetAsyncTaskResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
