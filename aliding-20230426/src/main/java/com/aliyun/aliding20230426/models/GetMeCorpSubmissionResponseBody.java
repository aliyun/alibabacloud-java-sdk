// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetMeCorpSubmissionResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<GetMeCorpSubmissionResponseBodyData> data;

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
        /**
         * <strong>example:</strong>
         * <p>某研究部</p>
         */
        @NameInMap("BuName")
        public String buName;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:abc@alimail.com">abc@alimail.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>正式</p>
         */
        @NameInMap("EmployeeType")
        public String employeeType;

        /**
         * <strong>example:</strong>
         * <p>official</p>
         */
        @NameInMap("EmployeeTypeInformation")
        public String employeeTypeInformation;

        /**
         * <strong>example:</strong>
         * <p>123311221</p>
         */
        @NameInMap("HumanResourceGroupWorkNumber")
        public String humanResourceGroupWorkNumber;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsSystemAdmin")
        public Boolean isSystemAdmin;

        /**
         * <strong>example:</strong>
         * <p>P7</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <strong>example:</strong>
         * <p>请购单</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>与心</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <strong>example:</strong>
         * <p>o-YDJKINSxxx</p>
         */
        @NameInMap("OrderNumber")
        public String orderNumber;

        /**
         * <strong>example:</strong>
         * <p><a href="https://abc.com/a.png">https://abc.com/a.png</a></p>
         */
        @NameInMap("PersonalPhoto")
        public String personalPhoto;

        /**
         * <strong>example:</strong>
         * <p><a href="https://oss/zhangsan.png">https://oss/zhangsan.png</a></p>
         */
        @NameInMap("PersonalPhotoUrl")
        public String personalPhotoUrl;

        /**
         * <strong>example:</strong>
         * <p>XIAOHONG</p>
         */
        @NameInMap("PinyinNameAll")
        public String pinyinNameAll;

        /**
         * <strong>example:</strong>
         * <p>xiaohong</p>
         */
        @NameInMap("PinyinNickName")
        public String pinyinNickName;

        /**
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>manager123</p>
         */
        @NameInMap("SuperUserId")
        public String superUserId;

        /**
         * <strong>example:</strong>
         * <p>wang123</p>
         */
        @NameInMap("TbWang")
        public String tbWang;

        /**
         * <strong>example:</strong>
         * <p>manager123</p>
         */
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
         * <p>activity-124</p>
         */
        @NameInMap("ActivityName")
        public String activityName;

        /**
         * <strong>example:</strong>
         * <p>redirect task</p>
         */
        @NameInMap("ActivityNameEn")
        public String activityNameEn;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>APP_PBKT0xxx</p>
         */
        @NameInMap("AppType")
        public String appType;

        /**
         * <strong>example:</strong>
         * <p>2021-01-01</p>
         */
        @NameInMap("CreateTimeGMT")
        public String createTimeGMT;

        @NameInMap("CurrentActivityInstances")
        public java.util.List<GetMeCorpSubmissionResponseBodyDataCurrentActivityInstances> currentActivityInstances;

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
         * <p>2021-01-01</p>
         */
        @NameInMap("FinishTimeGMT")
        public String finishTimeGMT;

        /**
         * <strong>example:</strong>
         * <p>FINST-NJYJxxx</p>
         */
        @NameInMap("FormInstanceId")
        public String formInstanceId;

        /**
         * <strong>example:</strong>
         * <p>FORM-EF6xxx</p>
         */
        @NameInMap("FormUuid")
        public String formUuid;

        /**
         * <strong>example:</strong>
         * <p>符合宜搭表单实例格式的json数据</p>
         */
        @NameInMap("InstanceValue")
        public String instanceValue;

        /**
         * <strong>example:</strong>
         * <p>2021-01-01</p>
         */
        @NameInMap("ModifiedTimeGMT")
        public String modifiedTimeGMT;

        /**
         * <strong>example:</strong>
         * <p>zhangsan@mediaId</p>
         */
        @NameInMap("OriginatorAvatar")
        public String originatorAvatar;

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("OriginatorDisplayName")
        public String originatorDisplayName;

        /**
         * <strong>example:</strong>
         * <p>manager123</p>
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
         * <p>通过</p>
         */
        @NameInMap("ProcessApprovedResultText")
        public String processApprovedResultText;

        /**
         * <strong>example:</strong>
         * <p>TPROC--X1Gxxx</p>
         */
        @NameInMap("ProcessCode")
        public String processCode;

        /**
         * <strong>example:</strong>
         * <p>52330</p>
         */
        @NameInMap("ProcessId")
        public Long processId;

        /**
         * <strong>example:</strong>
         * <p>f30233fb-72e1-xxx</p>
         */
        @NameInMap("ProcessInstanceId")
        public String processInstanceId;

        /**
         * <strong>example:</strong>
         * <p>finished</p>
         */
        @NameInMap("ProcessInstanceStatus")
        public String processInstanceStatus;

        /**
         * <strong>example:</strong>
         * <p>已同意</p>
         */
        @NameInMap("ProcessInstanceStatusText")
        public String processInstanceStatusText;

        /**
         * <strong>example:</strong>
         * <p>小红的单子</p>
         */
        @NameInMap("ProcessName")
        public String processName;

        /**
         * <strong>example:</strong>
         * <p>小红发起的请购单</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
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
