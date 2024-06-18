// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetOperationRecordsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<GetOperationRecordsResponseBodyResult> result;

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

    public static GetOperationRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOperationRecordsResponseBody self = new GetOperationRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOperationRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOperationRecordsResponseBody setResult(java.util.List<GetOperationRecordsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetOperationRecordsResponseBodyResult> getResult() {
        return this.result;
    }

    public GetOperationRecordsResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetOperationRecordsResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class GetOperationRecordsResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>return</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <strong>example:</strong>
         * <p>同意</p>
         */
        @NameInMap("ActionExit")
        public String actionExit;

        /**
         * <strong>example:</strong>
         * <p>2021-02-01</p>
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
         * <p>12345</p>
         */
        @NameInMap("DataId")
        public Long dataId;

        /**
         * <strong>example:</strong>
         * <p><a href="https://oss.com/Signature.pdf">https://oss.com/Signature.pdf</a></p>
         */
        @NameInMap("DigitalSign")
        public String digitalSign;

        /**
         * <strong>example:</strong>
         * <p><a href="https://oss.com/a.pdf">https://oss.com/a.pdf</a></p>
         */
        @NameInMap("Files")
        public String files;

        /**
         * <strong>example:</strong>
         * <p>2021-01-01</p>
         */
        @NameInMap("OperateTimeGMT")
        public String operateTimeGMT;

        /**
         * <strong>example:</strong>
         * <p>remove</p>
         */
        @NameInMap("OperateType")
        public String operateType;

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("OperatorDisplayName")
        public String operatorDisplayName;

        /**
         * <strong>example:</strong>
         * <p>李四</p>
         */
        @NameInMap("OperatorName")
        public String operatorName;

        /**
         * <strong>example:</strong>
         * <p>无冬</p>
         */
        @NameInMap("OperatorNickName")
        public String operatorNickName;

        /**
         * <strong>example:</strong>
         * <p><a href="https://oss.com/a.jpeg">https://oss.com/a.jpeg</a></p>
         */
        @NameInMap("OperatorPhotoUrl")
        public String operatorPhotoUrl;

        /**
         * <strong>example:</strong>
         * <p>良好</p>
         */
        @NameInMap("OperatorStatus")
        public String operatorStatus;

        /**
         * <strong>example:</strong>
         * <p>manager123</p>
         */
        @NameInMap("OperatorUserId")
        public String operatorUserId;

        /**
         * <strong>example:</strong>
         * <p>f30233fb-72e1-4af4-8cb8-c7e0ea9ee530</p>
         */
        @NameInMap("ProcessInstanceId")
        public String processInstanceId;

        /**
         * <strong>example:</strong>
         * <p>确认同意</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <strong>example:</strong>
         * <p>请购类型</p>
         */
        @NameInMap("ShowName")
        public String showName;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <strong>example:</strong>
         * <p>同步</p>
         */
        @NameInMap("TaskExecuteType")
        public String taskExecuteType;

        /**
         * <strong>example:</strong>
         * <p>2021-01-01</p>
         */
        @NameInMap("TaskHoldTimeGMT")
        public Long taskHoldTimeGMT;

        /**
         * <strong>example:</strong>
         * <p>task-123</p>
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
         * <p>i18n</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetOperationRecordsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetOperationRecordsResponseBodyResult self = new GetOperationRecordsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetOperationRecordsResponseBodyResult setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetOperationRecordsResponseBodyResult setActionExit(String actionExit) {
            this.actionExit = actionExit;
            return this;
        }
        public String getActionExit() {
            return this.actionExit;
        }

        public GetOperationRecordsResponseBodyResult setActiveTimeGMT(String activeTimeGMT) {
            this.activeTimeGMT = activeTimeGMT;
            return this;
        }
        public String getActiveTimeGMT() {
            return this.activeTimeGMT;
        }

        public GetOperationRecordsResponseBodyResult setActivityId(String activityId) {
            this.activityId = activityId;
            return this;
        }
        public String getActivityId() {
            return this.activityId;
        }

        public GetOperationRecordsResponseBodyResult setDataId(Long dataId) {
            this.dataId = dataId;
            return this;
        }
        public Long getDataId() {
            return this.dataId;
        }

        public GetOperationRecordsResponseBodyResult setDigitalSign(String digitalSign) {
            this.digitalSign = digitalSign;
            return this;
        }
        public String getDigitalSign() {
            return this.digitalSign;
        }

        public GetOperationRecordsResponseBodyResult setFiles(String files) {
            this.files = files;
            return this;
        }
        public String getFiles() {
            return this.files;
        }

        public GetOperationRecordsResponseBodyResult setOperateTimeGMT(String operateTimeGMT) {
            this.operateTimeGMT = operateTimeGMT;
            return this;
        }
        public String getOperateTimeGMT() {
            return this.operateTimeGMT;
        }

        public GetOperationRecordsResponseBodyResult setOperateType(String operateType) {
            this.operateType = operateType;
            return this;
        }
        public String getOperateType() {
            return this.operateType;
        }

        public GetOperationRecordsResponseBodyResult setOperatorDisplayName(String operatorDisplayName) {
            this.operatorDisplayName = operatorDisplayName;
            return this;
        }
        public String getOperatorDisplayName() {
            return this.operatorDisplayName;
        }

        public GetOperationRecordsResponseBodyResult setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public GetOperationRecordsResponseBodyResult setOperatorNickName(String operatorNickName) {
            this.operatorNickName = operatorNickName;
            return this;
        }
        public String getOperatorNickName() {
            return this.operatorNickName;
        }

        public GetOperationRecordsResponseBodyResult setOperatorPhotoUrl(String operatorPhotoUrl) {
            this.operatorPhotoUrl = operatorPhotoUrl;
            return this;
        }
        public String getOperatorPhotoUrl() {
            return this.operatorPhotoUrl;
        }

        public GetOperationRecordsResponseBodyResult setOperatorStatus(String operatorStatus) {
            this.operatorStatus = operatorStatus;
            return this;
        }
        public String getOperatorStatus() {
            return this.operatorStatus;
        }

        public GetOperationRecordsResponseBodyResult setOperatorUserId(String operatorUserId) {
            this.operatorUserId = operatorUserId;
            return this;
        }
        public String getOperatorUserId() {
            return this.operatorUserId;
        }

        public GetOperationRecordsResponseBodyResult setProcessInstanceId(String processInstanceId) {
            this.processInstanceId = processInstanceId;
            return this;
        }
        public String getProcessInstanceId() {
            return this.processInstanceId;
        }

        public GetOperationRecordsResponseBodyResult setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetOperationRecordsResponseBodyResult setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public GetOperationRecordsResponseBodyResult setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public GetOperationRecordsResponseBodyResult setTaskExecuteType(String taskExecuteType) {
            this.taskExecuteType = taskExecuteType;
            return this;
        }
        public String getTaskExecuteType() {
            return this.taskExecuteType;
        }

        public GetOperationRecordsResponseBodyResult setTaskHoldTimeGMT(Long taskHoldTimeGMT) {
            this.taskHoldTimeGMT = taskHoldTimeGMT;
            return this;
        }
        public Long getTaskHoldTimeGMT() {
            return this.taskHoldTimeGMT;
        }

        public GetOperationRecordsResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetOperationRecordsResponseBodyResult setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public GetOperationRecordsResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
