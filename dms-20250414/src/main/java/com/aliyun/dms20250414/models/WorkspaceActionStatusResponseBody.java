// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class WorkspaceActionStatusResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public WorkspaceActionStatusResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidTid</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message that is returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>This record is being collected, please wait for a moment.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static WorkspaceActionStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        WorkspaceActionStatusResponseBody self = new WorkspaceActionStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public WorkspaceActionStatusResponseBody setData(WorkspaceActionStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public WorkspaceActionStatusResponseBodyData getData() {
        return this.data;
    }

    public WorkspaceActionStatusResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public WorkspaceActionStatusResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public WorkspaceActionStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public WorkspaceActionStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public WorkspaceActionStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class WorkspaceActionStatusResponseBodyData extends TeaModel {
        /**
         * <p>The error message if the task fails.</p>
         * 
         * <strong>example:</strong>
         * <p>action failed</p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <p>The time when the task ended.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-13T14:30:20.582182728+08:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The time when the task started.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-13T14:30:20.582182728+08:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the asynchronous task. Valid values: SUCCESS, ERROR, TIMEOUT, and CANCEL.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;phase\&quot;: \&quot;Created\&quot;, \&quot;latestExecError\&quot;: {\&quot;message\&quot;: \&quot;\&quot;, \&quot;code\&quot;: \&quot;\&quot;, \&quot;requestId\&quot;: \&quot;\&quot;, \&quot;extraInfo\&quot;: \&quot;\&quot;, \&quot;title\&quot;: \&quot;\&quot;}}</p>
         */
        @NameInMap("Status")
        public String status;

        public static WorkspaceActionStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            WorkspaceActionStatusResponseBodyData self = new WorkspaceActionStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public WorkspaceActionStatusResponseBodyData setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public WorkspaceActionStatusResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public WorkspaceActionStatusResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public WorkspaceActionStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
