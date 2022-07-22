// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class BatchCreateInstantSiteMonitorResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<BatchCreateInstantSiteMonitorResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("TaskId")
        public String taskId;

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
