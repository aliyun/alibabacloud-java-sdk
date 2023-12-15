// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class ProcessAliMeCallbackOfStagingResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ProcessAliMeCallbackOfStagingResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ProcessAliMeCallbackOfStagingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ProcessAliMeCallbackOfStagingResponseBody self = new ProcessAliMeCallbackOfStagingResponseBody();
        return TeaModel.build(map, self);
    }

    public ProcessAliMeCallbackOfStagingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ProcessAliMeCallbackOfStagingResponseBody setData(ProcessAliMeCallbackOfStagingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ProcessAliMeCallbackOfStagingResponseBodyData getData() {
        return this.data;
    }

    public ProcessAliMeCallbackOfStagingResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ProcessAliMeCallbackOfStagingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ProcessAliMeCallbackOfStagingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ProcessAliMeCallbackOfStagingResponseBodyData extends TeaModel {
        @NameInMap("Result")
        public String result;

        public static ProcessAliMeCallbackOfStagingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ProcessAliMeCallbackOfStagingResponseBodyData self = new ProcessAliMeCallbackOfStagingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ProcessAliMeCallbackOfStagingResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

    }

}
