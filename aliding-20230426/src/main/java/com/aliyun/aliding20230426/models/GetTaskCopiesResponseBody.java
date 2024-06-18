// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetTaskCopiesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[{}]</p>
     */
    @NameInMap("data")
    public java.util.List<GetTaskCopiesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

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

    public static GetTaskCopiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskCopiesResponseBody self = new GetTaskCopiesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskCopiesResponseBody setData(java.util.List<GetTaskCopiesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetTaskCopiesResponseBodyData> getData() {
        return this.data;
    }

    public GetTaskCopiesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetTaskCopiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskCopiesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public GetTaskCopiesResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetTaskCopiesResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class GetTaskCopiesResponseBodyDataCurrentActivityInstances extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>act-xxaanfaf</p>
         */
        @NameInMap("ActivityId")
        public String activityId;

        /**
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("ActivityInstanceStatus")
        public String activityInstanceStatus;

        /**
         * <strong>example:</strong>
         * <p>act-12345</p>
         */
        @NameInMap("ActivityName")
        public String activityName;

        /**
         * <strong>example:</strong>
         * <p>redirect task</p>
         */
        @NameInMap("ActivityNameInEnglish")
        public String activityNameInEnglish;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("Id")
        public Long id;

        public static GetTaskCopiesResponseBodyDataCurrentActivityInstances build(java.util.Map<String, ?> map) throws Exception {
            GetTaskCopiesResponseBodyDataCurrentActivityInstances self = new GetTaskCopiesResponseBodyDataCurrentActivityInstances();
            return TeaModel.build(map, self);
        }

        public GetTaskCopiesResponseBodyDataCurrentActivityInstances setActivityId(String activityId) {
            this.activityId = activityId;
            return this;
        }
        public String getActivityId() {
            return this.activityId;
        }

        public GetTaskCopiesResponseBodyDataCurrentActivityInstances setActivityInstanceStatus(String activityInstanceStatus) {
            this.activityInstanceStatus = activityInstanceStatus;
            return this;
        }
        public String getActivityInstanceStatus() {
            return this.activityInstanceStatus;
        }

        public GetTaskCopiesResponseBodyDataCurrentActivityInstances setActivityName(String activityName) {
            this.activityName = activityName;
            return this;
        }
        public String getActivityName() {
            return this.activityName;
        }

        public GetTaskCopiesResponseBodyDataCurrentActivityInstances setActivityNameInEnglish(String activityNameInEnglish) {
            this.activityNameInEnglish = activityNameInEnglish;
            return this;
        }
        public String getActivityNameInEnglish() {
            return this.activityNameInEnglish;
        }

        public GetTaskCopiesResponseBodyDataCurrentActivityInstances setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class GetTaskCopiesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[ &quot;actxxx&quot; ]</p>
         */
        @NameInMap("ActionExecutorId")
        public java.util.List<String> actionExecutorId;

        /**
         * <strong>example:</strong>
         * <p>[ &quot;name&quot; ]</p>
         */
        @NameInMap("ActionExecutorName")
        public java.util.List<String> actionExecutorName;

        /**
         * <strong>example:</strong>
         * <p>APP_XCxxx</p>
         */
        @NameInMap("AppType")
        public String appType;

        /**
         * <strong>example:</strong>
         * <p>g02fbs08xxx</p>
         */
        @NameInMap("CarbonActivityId")
        public String carbonActivityId;

        /**
         * <strong>example:</strong>
         * <p>2020-01-01</p>
         */
        @NameInMap("CreateTimeGMT")
        public String createTimeGMT;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("CurrentActivityInstances")
        public java.util.List<GetTaskCopiesResponseBodyDataCurrentActivityInstances> currentActivityInstances;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("DataMap")
        public java.util.Map<String, ?> dataMap;

        /**
         * <strong>example:</strong>
         * <p>edit</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <strong>example:</strong>
         * <p>2020-01-01</p>
         */
        @NameInMap("FinishTimeGMT")
        public String finishTimeGMT;

        /**
         * <strong>example:</strong>
         * <p>formxxxx</p>
         */
        @NameInMap("FormInstanceId")
        public String formInstanceId;

        /**
         * <strong>example:</strong>
         * <p>uuid</p>
         */
        @NameInMap("FormUuid")
        public String formUuid;

        /**
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("InstanceValue")
        public String instanceValue;

        /**
         * <strong>example:</strong>
         * <p>2020-01-01</p>
         */
        @NameInMap("ModifiedTimeGMT")
        public String modifiedTimeGMT;

        /**
         * <strong>example:</strong>
         * <p>guyagsd</p>
         */
        @NameInMap("OriginatorAvatar")
        public String originatorAvatar;

        /**
         * <strong>example:</strong>
         * <p>guyagsd</p>
         */
        @NameInMap("OriginatorDisplayName")
        public String originatorDisplayName;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("OriginatorId")
        public String originatorId;

        /**
         * <strong>example:</strong>
         * <p>同意</p>
         */
        @NameInMap("ProcessApprovedResult")
        public String processApprovedResult;

        /**
         * <strong>example:</strong>
         * <p>同意</p>
         */
        @NameInMap("ProcessApprovedResultText")
        public String processApprovedResultText;

        /**
         * <strong>example:</strong>
         * <p>code</p>
         */
        @NameInMap("ProcessCode")
        public String processCode;

        /**
         * <strong>example:</strong>
         * <p>processxxxx</p>
         */
        @NameInMap("ProcessId")
        public Long processId;

        /**
         * <strong>example:</strong>
         * <p>instancexxxx</p>
         */
        @NameInMap("ProcessInstanceId")
        public String processInstanceId;

        /**
         * <strong>example:</strong>
         * <p>同意</p>
         */
        @NameInMap("ProcessInstanceStatus")
        public String processInstanceStatus;

        /**
         * <strong>example:</strong>
         * <p>同意</p>
         */
        @NameInMap("ProcessInstanceStatusText")
        public String processInstanceStatusText;

        /**
         * <strong>example:</strong>
         * <p>名称</p>
         */
        @NameInMap("ProcessName")
        public String processName;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        /**
         * <strong>example:</strong>
         * <p>标题</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Version")
        public Long version;

        public static GetTaskCopiesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTaskCopiesResponseBodyData self = new GetTaskCopiesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTaskCopiesResponseBodyData setActionExecutorId(java.util.List<String> actionExecutorId) {
            this.actionExecutorId = actionExecutorId;
            return this;
        }
        public java.util.List<String> getActionExecutorId() {
            return this.actionExecutorId;
        }

        public GetTaskCopiesResponseBodyData setActionExecutorName(java.util.List<String> actionExecutorName) {
            this.actionExecutorName = actionExecutorName;
            return this;
        }
        public java.util.List<String> getActionExecutorName() {
            return this.actionExecutorName;
        }

        public GetTaskCopiesResponseBodyData setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public GetTaskCopiesResponseBodyData setCarbonActivityId(String carbonActivityId) {
            this.carbonActivityId = carbonActivityId;
            return this;
        }
        public String getCarbonActivityId() {
            return this.carbonActivityId;
        }

        public GetTaskCopiesResponseBodyData setCreateTimeGMT(String createTimeGMT) {
            this.createTimeGMT = createTimeGMT;
            return this;
        }
        public String getCreateTimeGMT() {
            return this.createTimeGMT;
        }

        public GetTaskCopiesResponseBodyData setCurrentActivityInstances(java.util.List<GetTaskCopiesResponseBodyDataCurrentActivityInstances> currentActivityInstances) {
            this.currentActivityInstances = currentActivityInstances;
            return this;
        }
        public java.util.List<GetTaskCopiesResponseBodyDataCurrentActivityInstances> getCurrentActivityInstances() {
            return this.currentActivityInstances;
        }

        public GetTaskCopiesResponseBodyData setDataMap(java.util.Map<String, ?> dataMap) {
            this.dataMap = dataMap;
            return this;
        }
        public java.util.Map<String, ?> getDataMap() {
            return this.dataMap;
        }

        public GetTaskCopiesResponseBodyData setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetTaskCopiesResponseBodyData setFinishTimeGMT(String finishTimeGMT) {
            this.finishTimeGMT = finishTimeGMT;
            return this;
        }
        public String getFinishTimeGMT() {
            return this.finishTimeGMT;
        }

        public GetTaskCopiesResponseBodyData setFormInstanceId(String formInstanceId) {
            this.formInstanceId = formInstanceId;
            return this;
        }
        public String getFormInstanceId() {
            return this.formInstanceId;
        }

        public GetTaskCopiesResponseBodyData setFormUuid(String formUuid) {
            this.formUuid = formUuid;
            return this;
        }
        public String getFormUuid() {
            return this.formUuid;
        }

        public GetTaskCopiesResponseBodyData setInstanceValue(String instanceValue) {
            this.instanceValue = instanceValue;
            return this;
        }
        public String getInstanceValue() {
            return this.instanceValue;
        }

        public GetTaskCopiesResponseBodyData setModifiedTimeGMT(String modifiedTimeGMT) {
            this.modifiedTimeGMT = modifiedTimeGMT;
            return this;
        }
        public String getModifiedTimeGMT() {
            return this.modifiedTimeGMT;
        }

        public GetTaskCopiesResponseBodyData setOriginatorAvatar(String originatorAvatar) {
            this.originatorAvatar = originatorAvatar;
            return this;
        }
        public String getOriginatorAvatar() {
            return this.originatorAvatar;
        }

        public GetTaskCopiesResponseBodyData setOriginatorDisplayName(String originatorDisplayName) {
            this.originatorDisplayName = originatorDisplayName;
            return this;
        }
        public String getOriginatorDisplayName() {
            return this.originatorDisplayName;
        }

        public GetTaskCopiesResponseBodyData setOriginatorId(String originatorId) {
            this.originatorId = originatorId;
            return this;
        }
        public String getOriginatorId() {
            return this.originatorId;
        }

        public GetTaskCopiesResponseBodyData setProcessApprovedResult(String processApprovedResult) {
            this.processApprovedResult = processApprovedResult;
            return this;
        }
        public String getProcessApprovedResult() {
            return this.processApprovedResult;
        }

        public GetTaskCopiesResponseBodyData setProcessApprovedResultText(String processApprovedResultText) {
            this.processApprovedResultText = processApprovedResultText;
            return this;
        }
        public String getProcessApprovedResultText() {
            return this.processApprovedResultText;
        }

        public GetTaskCopiesResponseBodyData setProcessCode(String processCode) {
            this.processCode = processCode;
            return this;
        }
        public String getProcessCode() {
            return this.processCode;
        }

        public GetTaskCopiesResponseBodyData setProcessId(Long processId) {
            this.processId = processId;
            return this;
        }
        public Long getProcessId() {
            return this.processId;
        }

        public GetTaskCopiesResponseBodyData setProcessInstanceId(String processInstanceId) {
            this.processInstanceId = processInstanceId;
            return this;
        }
        public String getProcessInstanceId() {
            return this.processInstanceId;
        }

        public GetTaskCopiesResponseBodyData setProcessInstanceStatus(String processInstanceStatus) {
            this.processInstanceStatus = processInstanceStatus;
            return this;
        }
        public String getProcessInstanceStatus() {
            return this.processInstanceStatus;
        }

        public GetTaskCopiesResponseBodyData setProcessInstanceStatusText(String processInstanceStatusText) {
            this.processInstanceStatusText = processInstanceStatusText;
            return this;
        }
        public String getProcessInstanceStatusText() {
            return this.processInstanceStatusText;
        }

        public GetTaskCopiesResponseBodyData setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

        public GetTaskCopiesResponseBodyData setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public GetTaskCopiesResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetTaskCopiesResponseBodyData setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
