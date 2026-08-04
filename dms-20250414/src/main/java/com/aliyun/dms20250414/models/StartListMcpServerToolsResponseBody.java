// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class StartListMcpServerToolsResponseBody extends TeaModel {
    /**
     * <p>The result of the asynchronous detection startup. Only StartTimestamp may be returned if the resources are still being provisioned.</p>
     */
    @NameInMap("Data")
    public StartListMcpServerToolsResponseBodyData data;

    /**
     * <p>The return code. The value success is returned if the request was successful. An error code is returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if a system-level request failure occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>agent status=wait_resource_running</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID, which is used to locate this call.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     */
    @NameInMap("Success")
    public Boolean success;

    public static StartListMcpServerToolsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartListMcpServerToolsResponseBody self = new StartListMcpServerToolsResponseBody();
        return TeaModel.build(map, self);
    }

    public StartListMcpServerToolsResponseBody setData(StartListMcpServerToolsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StartListMcpServerToolsResponseBodyData getData() {
        return this.data;
    }

    public StartListMcpServerToolsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public StartListMcpServerToolsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public StartListMcpServerToolsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartListMcpServerToolsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class StartListMcpServerToolsResponseBodyData extends TeaModel {
        /**
         * <p>The temporary session ID for this detection. After the startup succeeds, use this value to call GetListMcpServerToolsResult to poll for the result.</p>
         * 
         * <strong>example:</strong>
         * <p>1vw***6wr</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <p>The UNIX timestamp at which the server started the detection, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1785819600000</p>
         */
        @NameInMap("StartTimestamp")
        public String startTimestamp;

        public static StartListMcpServerToolsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StartListMcpServerToolsResponseBodyData self = new StartListMcpServerToolsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StartListMcpServerToolsResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public StartListMcpServerToolsResponseBodyData setStartTimestamp(String startTimestamp) {
            this.startTimestamp = startTimestamp;
            return this;
        }
        public String getStartTimestamp() {
            return this.startTimestamp;
        }

    }

}
