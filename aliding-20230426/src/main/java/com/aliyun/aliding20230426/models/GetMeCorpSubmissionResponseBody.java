// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetMeCorpSubmissionResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<GetMeCorpSubmissionResponseBodyData> data;

    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalCount")
    public Long totalCount;

    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    @NameInMap("vendorType")
    public String vendorType;

    public static GetMeCorpSubmissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMeCorpSubmissionResponseBody self = new GetMeCorpSubmissionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMeCorpSubmissionResponseBody setData(java.util.List<GetMeCorpSubmissionResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetMeCorpSubmissionResponseBodyData> getData() {
        return this.data;
    }

    public GetMeCorpSubmissionResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetMeCorpSubmissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMeCorpSubmissionResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public GetMeCorpSubmissionResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetMeCorpSubmissionResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class GetMeCorpSubmissionResponseBodyDataActioner extends TeaModel {
        @NameInMap("BuName")
        public String buName;

        @NameInMap("Email")
        public String email;

        @NameInMap("EmployeeType")
        public String employeeType;

        @NameInMap("EmployeeTypeInformation")
        public String employeeTypeInformation;

        @NameInMap("HumanResourceGroupWorkNumber")
        public String humanResourceGroupWorkNumber;

        @NameInMap("IsSystemAdmin")
        public Boolean isSystemAdmin;

        @NameInMap("Level")
        public String level;

        @NameInMap("Name")
        public String name;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("OrderNumber")
        public String orderNumber;

        @NameInMap("PersonalPhoto")
        public String personalPhoto;

        @NameInMap("PersonalPhotoUrl")
        public String personalPhotoUrl;

        @NameInMap("PinyinNameAll")
        public String pinyinNameAll;

        @NameInMap("PinyinNickName")
        public String pinyinNickName;

        @NameInMap("State")
        public String state;

        @NameInMap("SuperUserId")
        public String superUserId;

        @NameInMap("TbWang")
        public String tbWang;

        @NameInMap("UserId")
        public String userId;

        public static GetMeCorpSubmissionResponseBodyDataActioner build(java.util.Map<String, ?> map) throws Exception {
            GetMeCorpSubmissionResponseBodyDataActioner self = new GetMeCorpSubmissionResponseBodyDataActioner();
            return TeaModel.build(map, self);
        }

        public GetMeCorpSubmissionResponseBodyDataActioner setBuName(String buName) {
            this.buName = buName;
            return this;
        }
        public String getBuName() {
            return this.buName;
        }

        public GetMeCorpSubmissionResponseBodyDataActioner setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetMeCorpSubmissionResponseBodyDataActioner setEmployeeType(String employeeType) {
            this.employeeType = employeeType;
            return this;
        }
        public String getEmployeeType() {
            return this.employeeType;
        }

        public GetMeCorpSubmissionResponseBodyDataActioner setEmployeeTypeInformation(String employeeTypeInformation) {
            this.employeeTypeInformation = employeeTypeInformation;
            return this;
        }
        public String getEmployeeTypeInformation() {
            return this.employeeTypeInformation;
        }

        public GetMeCorpSubmissionResponseBodyDataActioner setHumanResourceGroupWorkNumber(String humanResourceGroupWorkNumber) {
            this.humanResourceGroupWorkNumber = humanResourceGroupWorkNumber;
            return this;
        }
        public String getHumanResourceGroupWorkNumber() {
            return this.humanResourceGroupWorkNumber;
        }

        public GetMeCorpSubmissionResponseBodyDataActioner setIsSystemAdmin(Boolean isSystemAdmin) {
            this.isSystemAdmin = isSystemAdmin;
            return this;
        }
        public Boolean getIsSystemAdmin() {
            return this.isSystemAdmin;
        }

        public GetMeCorpSubmissionResponseBodyDataActioner setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetMeCorpSubmissionResponseBodyDataActioner setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMeCorpSubmissionResponseBodyDataActioner setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetMeCorpSubmissionResponseBodyDataActioner setOrderNumber(String orderNumber) {
            this.orderNumber = orderNumber;
            return this;
        }
        public String getOrderNumber() {
            return this.orderNumber;
        }

        public GetMeCorpSubmissionResponseBodyDataActioner setPersonalPhoto(String personalPhoto) {
            this.personalPhoto = personalPhoto;
            return this;
        }
        public String getPersonalPhoto() {
            return this.personalPhoto;
        }

        public GetMeCorpSubmissionResponseBodyDataActioner setPersonalPhotoUrl(String personalPhotoUrl) {
            this.personalPhotoUrl = personalPhotoUrl;
            return this;
        }
        public String getPersonalPhotoUrl() {
            return this.personalPhotoUrl;
        }

        public GetMeCorpSubmissionResponseBodyDataActioner setPinyinNameAll(String pinyinNameAll) {
            this.pinyinNameAll = pinyinNameAll;
            return this;
        }
        public String getPinyinNameAll() {
            return this.pinyinNameAll;
        }

        public GetMeCorpSubmissionResponseBodyDataActioner setPinyinNickName(String pinyinNickName) {
            this.pinyinNickName = pinyinNickName;
            return this;
        }
        public String getPinyinNickName() {
            return this.pinyinNickName;
        }

        public GetMeCorpSubmissionResponseBodyDataActioner setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetMeCorpSubmissionResponseBodyDataActioner setSuperUserId(String superUserId) {
            this.superUserId = superUserId;
            return this;
        }
        public String getSuperUserId() {
            return this.superUserId;
        }

        public GetMeCorpSubmissionResponseBodyDataActioner setTbWang(String tbWang) {
            this.tbWang = tbWang;
            return this;
        }
        public String getTbWang() {
            return this.tbWang;
        }

        public GetMeCorpSubmissionResponseBodyDataActioner setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetMeCorpSubmissionResponseBodyDataCurrentActivityInstances extends TeaModel {
        @NameInMap("ActivityId")
        public String activityId;

        @NameInMap("ActivityInstanceStatus")
        public String activityInstanceStatus;

        @NameInMap("ActivityName")
        public String activityName;

        @NameInMap("ActivityNameEn")
        public String activityNameEn;

        @NameInMap("Id")
        public Long id;

        public static GetMeCorpSubmissionResponseBodyDataCurrentActivityInstances build(java.util.Map<String, ?> map) throws Exception {
            GetMeCorpSubmissionResponseBodyDataCurrentActivityInstances self = new GetMeCorpSubmissionResponseBodyDataCurrentActivityInstances();
            return TeaModel.build(map, self);
        }

        public GetMeCorpSubmissionResponseBodyDataCurrentActivityInstances setActivityId(String activityId) {
            this.activityId = activityId;
            return this;
        }
        public String getActivityId() {
            return this.activityId;
        }

        public GetMeCorpSubmissionResponseBodyDataCurrentActivityInstances setActivityInstanceStatus(String activityInstanceStatus) {
            this.activityInstanceStatus = activityInstanceStatus;
            return this;
        }
        public String getActivityInstanceStatus() {
            return this.activityInstanceStatus;
        }

        public GetMeCorpSubmissionResponseBodyDataCurrentActivityInstances setActivityName(String activityName) {
            this.activityName = activityName;
            return this;
        }
        public String getActivityName() {
            return this.activityName;
        }

        public GetMeCorpSubmissionResponseBodyDataCurrentActivityInstances setActivityNameEn(String activityNameEn) {
            this.activityNameEn = activityNameEn;
            return this;
        }
        public String getActivityNameEn() {
            return this.activityNameEn;
        }

        public GetMeCorpSubmissionResponseBodyDataCurrentActivityInstances setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class GetMeCorpSubmissionResponseBodyData extends TeaModel {
        @NameInMap("Actioner")
        public java.util.List<GetMeCorpSubmissionResponseBodyDataActioner> actioner;

        @NameInMap("ActionerId")
        public java.util.List<String> actionerId;

        @NameInMap("ActionerName")
        public java.util.List<String> actionerName;

        @NameInMap("AppType")
        public String appType;

        @NameInMap("CreateTimeGMT")
        public String createTimeGMT;

        @NameInMap("CurrentActivityInstances")
        public java.util.List<GetMeCorpSubmissionResponseBodyDataCurrentActivityInstances> currentActivityInstances;

        @NameInMap("DataMap")
        public java.util.Map<String, ?> dataMap;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("FinishTimeGMT")
        public String finishTimeGMT;

        @NameInMap("FormInstanceId")
        public String formInstanceId;

        @NameInMap("FormUuid")
        public String formUuid;

        @NameInMap("InstanceValue")
        public String instanceValue;

        @NameInMap("ModifiedTimeGMT")
        public String modifiedTimeGMT;

        @NameInMap("OriginatorAvatar")
        public String originatorAvatar;

        @NameInMap("OriginatorDisplayName")
        public String originatorDisplayName;

        @NameInMap("OriginatorId")
        public String originatorId;

        @NameInMap("ProcessApprovedResult")
        public String processApprovedResult;

        @NameInMap("ProcessApprovedResultText")
        public String processApprovedResultText;

        @NameInMap("ProcessCode")
        public String processCode;

        @NameInMap("ProcessId")
        public Long processId;

        @NameInMap("ProcessInstanceId")
        public String processInstanceId;

        @NameInMap("ProcessInstanceStatus")
        public String processInstanceStatus;

        @NameInMap("ProcessInstanceStatusText")
        public String processInstanceStatusText;

        @NameInMap("ProcessName")
        public String processName;

        @NameInMap("Title")
        public String title;

        @NameInMap("Version")
        public Long version;

        public static GetMeCorpSubmissionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMeCorpSubmissionResponseBodyData self = new GetMeCorpSubmissionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMeCorpSubmissionResponseBodyData setActioner(java.util.List<GetMeCorpSubmissionResponseBodyDataActioner> actioner) {
            this.actioner = actioner;
            return this;
        }
        public java.util.List<GetMeCorpSubmissionResponseBodyDataActioner> getActioner() {
            return this.actioner;
        }

        public GetMeCorpSubmissionResponseBodyData setActionerId(java.util.List<String> actionerId) {
            this.actionerId = actionerId;
            return this;
        }
        public java.util.List<String> getActionerId() {
            return this.actionerId;
        }

        public GetMeCorpSubmissionResponseBodyData setActionerName(java.util.List<String> actionerName) {
            this.actionerName = actionerName;
            return this;
        }
        public java.util.List<String> getActionerName() {
            return this.actionerName;
        }

        public GetMeCorpSubmissionResponseBodyData setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public GetMeCorpSubmissionResponseBodyData setCreateTimeGMT(String createTimeGMT) {
            this.createTimeGMT = createTimeGMT;
            return this;
        }
        public String getCreateTimeGMT() {
            return this.createTimeGMT;
        }

        public GetMeCorpSubmissionResponseBodyData setCurrentActivityInstances(java.util.List<GetMeCorpSubmissionResponseBodyDataCurrentActivityInstances> currentActivityInstances) {
            this.currentActivityInstances = currentActivityInstances;
            return this;
        }
        public java.util.List<GetMeCorpSubmissionResponseBodyDataCurrentActivityInstances> getCurrentActivityInstances() {
            return this.currentActivityInstances;
        }

        public GetMeCorpSubmissionResponseBodyData setDataMap(java.util.Map<String, ?> dataMap) {
            this.dataMap = dataMap;
            return this;
        }
        public java.util.Map<String, ?> getDataMap() {
            return this.dataMap;
        }

        public GetMeCorpSubmissionResponseBodyData setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetMeCorpSubmissionResponseBodyData setFinishTimeGMT(String finishTimeGMT) {
            this.finishTimeGMT = finishTimeGMT;
            return this;
        }
        public String getFinishTimeGMT() {
            return this.finishTimeGMT;
        }

        public GetMeCorpSubmissionResponseBodyData setFormInstanceId(String formInstanceId) {
            this.formInstanceId = formInstanceId;
            return this;
        }
        public String getFormInstanceId() {
            return this.formInstanceId;
        }

        public GetMeCorpSubmissionResponseBodyData setFormUuid(String formUuid) {
            this.formUuid = formUuid;
            return this;
        }
        public String getFormUuid() {
            return this.formUuid;
        }

        public GetMeCorpSubmissionResponseBodyData setInstanceValue(String instanceValue) {
            this.instanceValue = instanceValue;
            return this;
        }
        public String getInstanceValue() {
            return this.instanceValue;
        }

        public GetMeCorpSubmissionResponseBodyData setModifiedTimeGMT(String modifiedTimeGMT) {
            this.modifiedTimeGMT = modifiedTimeGMT;
            return this;
        }
        public String getModifiedTimeGMT() {
            return this.modifiedTimeGMT;
        }

        public GetMeCorpSubmissionResponseBodyData setOriginatorAvatar(String originatorAvatar) {
            this.originatorAvatar = originatorAvatar;
            return this;
        }
        public String getOriginatorAvatar() {
            return this.originatorAvatar;
        }

        public GetMeCorpSubmissionResponseBodyData setOriginatorDisplayName(String originatorDisplayName) {
            this.originatorDisplayName = originatorDisplayName;
            return this;
        }
        public String getOriginatorDisplayName() {
            return this.originatorDisplayName;
        }

        public GetMeCorpSubmissionResponseBodyData setOriginatorId(String originatorId) {
            this.originatorId = originatorId;
            return this;
        }
        public String getOriginatorId() {
            return this.originatorId;
        }

        public GetMeCorpSubmissionResponseBodyData setProcessApprovedResult(String processApprovedResult) {
            this.processApprovedResult = processApprovedResult;
            return this;
        }
        public String getProcessApprovedResult() {
            return this.processApprovedResult;
        }

        public GetMeCorpSubmissionResponseBodyData setProcessApprovedResultText(String processApprovedResultText) {
            this.processApprovedResultText = processApprovedResultText;
            return this;
        }
        public String getProcessApprovedResultText() {
            return this.processApprovedResultText;
        }

        public GetMeCorpSubmissionResponseBodyData setProcessCode(String processCode) {
            this.processCode = processCode;
            return this;
        }
        public String getProcessCode() {
            return this.processCode;
        }

        public GetMeCorpSubmissionResponseBodyData setProcessId(Long processId) {
            this.processId = processId;
            return this;
        }
        public Long getProcessId() {
            return this.processId;
        }

        public GetMeCorpSubmissionResponseBodyData setProcessInstanceId(String processInstanceId) {
            this.processInstanceId = processInstanceId;
            return this;
        }
        public String getProcessInstanceId() {
            return this.processInstanceId;
        }

        public GetMeCorpSubmissionResponseBodyData setProcessInstanceStatus(String processInstanceStatus) {
            this.processInstanceStatus = processInstanceStatus;
            return this;
        }
        public String getProcessInstanceStatus() {
            return this.processInstanceStatus;
        }

        public GetMeCorpSubmissionResponseBodyData setProcessInstanceStatusText(String processInstanceStatusText) {
            this.processInstanceStatusText = processInstanceStatusText;
            return this;
        }
        public String getProcessInstanceStatusText() {
            return this.processInstanceStatusText;
        }

        public GetMeCorpSubmissionResponseBodyData setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

        public GetMeCorpSubmissionResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetMeCorpSubmissionResponseBodyData setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
