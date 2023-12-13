// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class BatchCreateInstantSiteMonitorResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call was successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about the site monitoring task.</p>
     */
    @NameInMap("Data")
    public java.util.List<BatchCreateInstantSiteMonitorResponseBodyData> data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   true: The call was successful.</p>
     * <p>*   false: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static BatchCreateInstantSiteMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateInstantSiteMonitorResponseBody self = new BatchCreateInstantSiteMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchCreateInstantSiteMonitorResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchCreateInstantSiteMonitorResponseBody setData(java.util.List<BatchCreateInstantSiteMonitorResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<BatchCreateInstantSiteMonitorResponseBodyData> getData() {
        return this.data;
    }

    public BatchCreateInstantSiteMonitorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchCreateInstantSiteMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchCreateInstantSiteMonitorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchCreateInstantSiteMonitorResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the site monitoring task.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The name of the site monitoring task.</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        public static BatchCreateInstantSiteMonitorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateInstantSiteMonitorResponseBodyData self = new BatchCreateInstantSiteMonitorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchCreateInstantSiteMonitorResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public BatchCreateInstantSiteMonitorResponseBodyData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

}
