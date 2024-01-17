// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetRunningTasksResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<GetRunningTasksResponseBodyResult> result;

    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    @NameInMap("vendorType")
    public String vendorType;

    public static GetRunningTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRunningTasksResponseBody self = new GetRunningTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRunningTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRunningTasksResponseBody setResult(java.util.List<GetRunningTasksResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetRunningTasksResponseBodyResult> getResult() {
        return this.result;
    }

    public GetRunningTasksResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetRunningTasksResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class GetRunningTasksResponseBodyResult extends TeaModel {
        @NameInMap("ActiveTimeGMT")
        public String activeTimeGMT;

        @NameInMap("ActivityId")
        public String activityId;

        @NameInMap("ActualActionerId")
        public String actualActionerId;

        @NameInMap("CreateTimeGMT")
        public String createTimeGMT;

        @NameInMap("FinishTimeGMT")
        public String finishTimeGMT;

        @NameInMap("OriginatorId")
        public String originatorId;

        @NameInMap("ProcessInstanceId")
        public String processInstanceId;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("Title")
        public String title;

        @NameInMap("TitleInEnglish")
        public String titleInEnglish;

        public static GetRunningTasksResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetRunningTasksResponseBodyResult self = new GetRunningTasksResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetRunningTasksResponseBodyResult setActiveTimeGMT(String activeTimeGMT) {
            this.activeTimeGMT = activeTimeGMT;
            return this;
        }
        public String getActiveTimeGMT() {
            return this.activeTimeGMT;
        }

        public GetRunningTasksResponseBodyResult setActivityId(String activityId) {
            this.activityId = activityId;
            return this;
        }
        public String getActivityId() {
            return this.activityId;
        }

        public GetRunningTasksResponseBodyResult setActualActionerId(String actualActionerId) {
            this.actualActionerId = actualActionerId;
            return this;
        }
        public String getActualActionerId() {
            return this.actualActionerId;
        }

        public GetRunningTasksResponseBodyResult setCreateTimeGMT(String createTimeGMT) {
            this.createTimeGMT = createTimeGMT;
            return this;
        }
        public String getCreateTimeGMT() {
            return this.createTimeGMT;
        }

        public GetRunningTasksResponseBodyResult setFinishTimeGMT(String finishTimeGMT) {
            this.finishTimeGMT = finishTimeGMT;
            return this;
        }
        public String getFinishTimeGMT() {
            return this.finishTimeGMT;
        }

        public GetRunningTasksResponseBodyResult setOriginatorId(String originatorId) {
            this.originatorId = originatorId;
            return this;
        }
        public String getOriginatorId() {
            return this.originatorId;
        }

        public GetRunningTasksResponseBodyResult setProcessInstanceId(String processInstanceId) {
            this.processInstanceId = processInstanceId;
            return this;
        }
        public String getProcessInstanceId() {
            return this.processInstanceId;
        }

        public GetRunningTasksResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetRunningTasksResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetRunningTasksResponseBodyResult setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public GetRunningTasksResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetRunningTasksResponseBodyResult setTitleInEnglish(String titleInEnglish) {
            this.titleInEnglish = titleInEnglish;
            return this;
        }
        public String getTitleInEnglish() {
            return this.titleInEnglish;
        }

    }

}
