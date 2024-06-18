// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetRunningTasksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>[{}]</p>
     */
    @NameInMap("result")
    public java.util.List<GetRunningTasksResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    /**
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>2020-01-01</p>
         */
        @NameInMap("ActiveTimeGMT")
        public String activeTimeGMT;

        /**
         * <strong>example:</strong>
         * <p>act-xxaanfaf</p>
         */
        @NameInMap("ActivityId")
        public String activityId;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ActualActionerId")
        public String actualActionerId;

        /**
         * <strong>example:</strong>
         * <p>2020-01-01</p>
         */
        @NameInMap("CreateTimeGMT")
        public String createTimeGMT;

        /**
         * <strong>example:</strong>
         * <p>2020-01-01</p>
         */
        @NameInMap("FinishTimeGMT")
        public String finishTimeGMT;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("OriginatorId")
        public String originatorId;

        /**
         * <strong>example:</strong>
         * <p>instancexxxx</p>
         */
        @NameInMap("ProcessInstanceId")
        public String processInstanceId;

        /**
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>taskId</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>append task</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <strong>example:</strong>
         * <p>标题</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>title</p>
         */
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
