// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRumExceptionStackResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetRumExceptionStackResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Internal error. Please try again. Contact the DingTalk service account if the issue                              persists after multiple retries.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B6A00968-82A8-4F14-9D1B-B53827DB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetRumExceptionStackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRumExceptionStackResponseBody self = new GetRumExceptionStackResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRumExceptionStackResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRumExceptionStackResponseBody setData(GetRumExceptionStackResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRumExceptionStackResponseBodyData getData() {
        return this.data;
    }

    public GetRumExceptionStackResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetRumExceptionStackResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRumExceptionStackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRumExceptionStackResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetRumExceptionStackResponseBodyData extends TeaModel {
        @NameInMap("Lines")
        public java.util.List<String> lines;

        /**
         * <strong>example:</strong>
         * <p>16643</p>
         */
        @NameInMap("ThreadId")
        public String threadId;

        public static GetRumExceptionStackResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRumExceptionStackResponseBodyData self = new GetRumExceptionStackResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRumExceptionStackResponseBodyData setLines(java.util.List<String> lines) {
            this.lines = lines;
            return this;
        }
        public java.util.List<String> getLines() {
            return this.lines;
        }

        public GetRumExceptionStackResponseBodyData setThreadId(String threadId) {
            this.threadId = threadId;
            return this;
        }
        public String getThreadId() {
            return this.threadId;
        }

    }

}
