// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetProcessDefinitionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FORM-EF6Y4xxx</p>
     */
    @NameInMap("formUuid")
    public String formUuid;

    @NameInMap("originator")
    public GetProcessDefinitionResponseBodyOriginator originator;

    /**
     * <strong>example:</strong>
     * <p>agree</p>
     */
    @NameInMap("outResult")
    public String outResult;

    @NameInMap("owners")
    public java.util.List<GetProcessDefinitionResponseBodyOwners> owners;

    /**
     * <strong>example:</strong>
     * <p>proc-123</p>
     */
    @NameInMap("processId")
    public String processId;

    /**
     * <strong>example:</strong>
     * <p>f30233fb-72e1-4xxx</p>
     */
    @NameInMap("processInstanceId")
    public String processInstanceId;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("status")
    public String status;

    @NameInMap("tasks")
    public java.util.List<GetProcessDefinitionResponseBodyTasks> tasks;

    /**
     * <strong>example:</strong>
     * <p>李四发起的请购单</p>
     */
    @NameInMap("title")
    public String title;

    @NameInMap("variables")
    public java.util.Map<String, ?> variables;

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

    public static GetProcessDefinitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProcessDefinitionResponseBody self = new GetProcessDefinitionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProcessDefinitionResponseBody setFormUuid(String formUuid) {
        this.formUuid = formUuid;
        return this;
    }
    public String getFormUuid() {
        return this.formUuid;
    }

    public GetProcessDefinitionResponseBody setOriginator(GetProcessDefinitionResponseBodyOriginator originator) {
        this.originator = originator;
        return this;
    }
    public GetProcessDefinitionResponseBodyOriginator getOriginator() {
        return this.originator;
    }

    public GetProcessDefinitionResponseBody setOutResult(String outResult) {
        this.outResult = outResult;
        return this;
    }
    public String getOutResult() {
        return this.outResult;
    }

    public GetProcessDefinitionResponseBody setOwners(java.util.List<GetProcessDefinitionResponseBodyOwners> owners) {
        this.owners = owners;
        return this;
    }
    public java.util.List<GetProcessDefinitionResponseBodyOwners> getOwners() {
        return this.owners;
    }

    public GetProcessDefinitionResponseBody setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public GetProcessDefinitionResponseBody setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }
    public String getProcessInstanceId() {
        return this.processInstanceId;
    }

    public GetProcessDefinitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProcessDefinitionResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetProcessDefinitionResponseBody setTasks(java.util.List<GetProcessDefinitionResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<GetProcessDefinitionResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public GetProcessDefinitionResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public GetProcessDefinitionResponseBody setVariables(java.util.Map<String, ?> variables) {
        this.variables = variables;
        return this;
    }
    public java.util.Map<String, ?> getVariables() {
        return this.variables;
    }

    public GetProcessDefinitionResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetProcessDefinitionResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class GetProcessDefinitionResponseBodyOriginatorMasterDataDepartments extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>开发部</p>
         */
        @NameInMap("DeptName")
        public String deptName;

        /**
         * <strong>example:</strong>
         * <p>development department</p>
         */
        @NameInMap("DeptNameInEnglish")
        public String deptNameInEnglish;

        /**
         * <strong>example:</strong>
         * <p>develop-A</p>
         */
        @NameInMap("DeptNo")
        public String deptNo;

        /**
         * <strong>example:</strong>
         * <p>总部-开发部</p>
         */
        @NameInMap("DeptPath")
        public String deptPath;

        /**
         * <strong>example:</strong>
         * <p>xxafafaf</p>
         */
        @NameInMap("HumanSourceGroupOrderNumber")
        public String humanSourceGroupOrderNumber;

        /**
         * <strong>example:</strong>
         * <p>123311221</p>
         */
        @NameInMap("HumanSourceGroupWorkNo")
        public String humanSourceGroupWorkNo;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>1732245789</p>
         */
        @NameInMap("MasterWorkNo")
        public String masterWorkNo;

        public static GetProcessDefinitionResponseBodyOriginatorMasterDataDepartments build(java.util.Map<String, ?> map) throws Exception {
            GetProcessDefinitionResponseBodyOriginatorMasterDataDepartments self = new GetProcessDefinitionResponseBodyOriginatorMasterDataDepartments();
            return TeaModel.build(map, self);
        }

        public GetProcessDefinitionResponseBodyOriginatorMasterDataDepartments setDeptName(String deptName) {
            this.deptName = deptName;
            return this;
        }
        public String getDeptName() {
            return this.deptName;
        }

        public GetProcessDefinitionResponseBodyOriginatorMasterDataDepartments setDeptNameInEnglish(String deptNameInEnglish) {
            this.deptNameInEnglish = deptNameInEnglish;
            return this;
        }
        public String getDeptNameInEnglish() {
            return this.deptNameInEnglish;
        }

        public GetProcessDefinitionResponseBodyOriginatorMasterDataDepartments setDeptNo(String deptNo) {
            this.deptNo = deptNo;
            return this;
        }
        public String getDeptNo() {
            return this.deptNo;
        }

        public GetProcessDefinitionResponseBodyOriginatorMasterDataDepartments setDeptPath(String deptPath) {
            this.deptPath = deptPath;
            return this;
        }
        public String getDeptPath() {
            return this.deptPath;
        }

        public GetProcessDefinitionResponseBodyOriginatorMasterDataDepartments setHumanSourceGroupOrderNumber(String humanSourceGroupOrderNumber) {
            this.humanSourceGroupOrderNumber = humanSourceGroupOrderNumber;
            return this;
        }
        public String getHumanSourceGroupOrderNumber() {
            return this.humanSourceGroupOrderNumber;
        }

        public GetProcessDefinitionResponseBodyOriginatorMasterDataDepartments setHumanSourceGroupWorkNo(String humanSourceGroupWorkNo) {
            this.humanSourceGroupWorkNo = humanSourceGroupWorkNo;
            return this;
        }
        public String getHumanSourceGroupWorkNo() {
            return this.humanSourceGroupWorkNo;
        }

        public GetProcessDefinitionResponseBodyOriginatorMasterDataDepartments setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetProcessDefinitionResponseBodyOriginatorMasterDataDepartments setMasterWorkNo(String masterWorkNo) {
            this.masterWorkNo = masterWorkNo;
            return this;
        }
        public String getMasterWorkNo() {
            return this.masterWorkNo;
        }

    }

    public static class GetProcessDefinitionResponseBodyOriginator extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>开发部成立于2000年</p>
         */
        @NameInMap("DepartmentDescription")
        public String departmentDescription;

        /**
         * <strong>example:</strong>
         * <p>ZhangSan</p>
         */
        @NameInMap("DisplayEnName")
        public String displayEnName;

        /**
         * <strong>example:</strong>
         * <p>测试应用</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("MasterDataDepartments")
        public java.util.List<GetProcessDefinitionResponseBodyOriginatorMasterDataDepartments> masterDataDepartments;

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
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

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

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("UserInfo")
        public String userInfo;

        public static GetProcessDefinitionResponseBodyOriginator build(java.util.Map<String, ?> map) throws Exception {
            GetProcessDefinitionResponseBodyOriginator self = new GetProcessDefinitionResponseBodyOriginator();
            return TeaModel.build(map, self);
        }

        public GetProcessDefinitionResponseBodyOriginator setDepartmentDescription(String departmentDescription) {
            this.departmentDescription = departmentDescription;
            return this;
        }
        public String getDepartmentDescription() {
            return this.departmentDescription;
        }

        public GetProcessDefinitionResponseBodyOriginator setDisplayEnName(String displayEnName) {
            this.displayEnName = displayEnName;
            return this;
        }
        public String getDisplayEnName() {
            return this.displayEnName;
        }

        public GetProcessDefinitionResponseBodyOriginator setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetProcessDefinitionResponseBodyOriginator setMasterDataDepartments(java.util.List<GetProcessDefinitionResponseBodyOriginatorMasterDataDepartments> masterDataDepartments) {
            this.masterDataDepartments = masterDataDepartments;
            return this;
        }
        public java.util.List<GetProcessDefinitionResponseBodyOriginatorMasterDataDepartments> getMasterDataDepartments() {
            return this.masterDataDepartments;
        }

        public GetProcessDefinitionResponseBodyOriginator setOrderNumber(String orderNumber) {
            this.orderNumber = orderNumber;
            return this;
        }
        public String getOrderNumber() {
            return this.orderNumber;
        }

        public GetProcessDefinitionResponseBodyOriginator setPersonalPhoto(String personalPhoto) {
            this.personalPhoto = personalPhoto;
            return this;
        }
        public String getPersonalPhoto() {
            return this.personalPhoto;
        }

        public GetProcessDefinitionResponseBodyOriginator setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetProcessDefinitionResponseBodyOriginator setTbWang(String tbWang) {
            this.tbWang = tbWang;
            return this;
        }
        public String getTbWang() {
            return this.tbWang;
        }

        public GetProcessDefinitionResponseBodyOriginator setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetProcessDefinitionResponseBodyOriginator setUserInfo(String userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public String getUserInfo() {
            return this.userInfo;
        }

    }

    public static class GetProcessDefinitionResponseBodyOwnersMasterDataDepartments extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>开发部</p>
         */
        @NameInMap("DeptName")
        public String deptName;

        /**
         * <strong>example:</strong>
         * <p>development department</p>
         */
        @NameInMap("DeptNameInEnglish")
        public String deptNameInEnglish;

        /**
         * <strong>example:</strong>
         * <p>develop-A</p>
         */
        @NameInMap("DeptNo")
        public String deptNo;

        /**
         * <strong>example:</strong>
         * <p>总部-开发部</p>
         */
        @NameInMap("DeptPath")
        public String deptPath;

        /**
         * <strong>example:</strong>
         * <p>xxafafaf</p>
         */
        @NameInMap("HumanSourceGroupOrderNumber")
        public String humanSourceGroupOrderNumber;

        /**
         * <strong>example:</strong>
         * <p>123311221</p>
         */
        @NameInMap("HumanSourceGroupWorkNo")
        public String humanSourceGroupWorkNo;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>1732245789</p>
         */
        @NameInMap("MasterWorkNo")
        public String masterWorkNo;

        public static GetProcessDefinitionResponseBodyOwnersMasterDataDepartments build(java.util.Map<String, ?> map) throws Exception {
            GetProcessDefinitionResponseBodyOwnersMasterDataDepartments self = new GetProcessDefinitionResponseBodyOwnersMasterDataDepartments();
            return TeaModel.build(map, self);
        }

        public GetProcessDefinitionResponseBodyOwnersMasterDataDepartments setDeptName(String deptName) {
            this.deptName = deptName;
            return this;
        }
        public String getDeptName() {
            return this.deptName;
        }

        public GetProcessDefinitionResponseBodyOwnersMasterDataDepartments setDeptNameInEnglish(String deptNameInEnglish) {
            this.deptNameInEnglish = deptNameInEnglish;
            return this;
        }
        public String getDeptNameInEnglish() {
            return this.deptNameInEnglish;
        }

        public GetProcessDefinitionResponseBodyOwnersMasterDataDepartments setDeptNo(String deptNo) {
            this.deptNo = deptNo;
            return this;
        }
        public String getDeptNo() {
            return this.deptNo;
        }

        public GetProcessDefinitionResponseBodyOwnersMasterDataDepartments setDeptPath(String deptPath) {
            this.deptPath = deptPath;
            return this;
        }
        public String getDeptPath() {
            return this.deptPath;
        }

        public GetProcessDefinitionResponseBodyOwnersMasterDataDepartments setHumanSourceGroupOrderNumber(String humanSourceGroupOrderNumber) {
            this.humanSourceGroupOrderNumber = humanSourceGroupOrderNumber;
            return this;
        }
        public String getHumanSourceGroupOrderNumber() {
            return this.humanSourceGroupOrderNumber;
        }

        public GetProcessDefinitionResponseBodyOwnersMasterDataDepartments setHumanSourceGroupWorkNo(String humanSourceGroupWorkNo) {
            this.humanSourceGroupWorkNo = humanSourceGroupWorkNo;
            return this;
        }
        public String getHumanSourceGroupWorkNo() {
            return this.humanSourceGroupWorkNo;
        }

        public GetProcessDefinitionResponseBodyOwnersMasterDataDepartments setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetProcessDefinitionResponseBodyOwnersMasterDataDepartments setMasterWorkNo(String masterWorkNo) {
            this.masterWorkNo = masterWorkNo;
            return this;
        }
        public String getMasterWorkNo() {
            return this.masterWorkNo;
        }

    }

    public static class GetProcessDefinitionResponseBodyOwners extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>开发部成立于2000年</p>
         */
        @NameInMap("DepartmentDescription")
        public String departmentDescription;

        /**
         * <strong>example:</strong>
         * <p>ZhangSan</p>
         */
        @NameInMap("DisplayEnName")
        public String displayEnName;

        /**
         * <strong>example:</strong>
         * <p>测试应用</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("MasterDataDepartments")
        public java.util.List<GetProcessDefinitionResponseBodyOwnersMasterDataDepartments> masterDataDepartments;

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
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

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

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("UserInfo")
        public String userInfo;

        public static GetProcessDefinitionResponseBodyOwners build(java.util.Map<String, ?> map) throws Exception {
            GetProcessDefinitionResponseBodyOwners self = new GetProcessDefinitionResponseBodyOwners();
            return TeaModel.build(map, self);
        }

        public GetProcessDefinitionResponseBodyOwners setDepartmentDescription(String departmentDescription) {
            this.departmentDescription = departmentDescription;
            return this;
        }
        public String getDepartmentDescription() {
            return this.departmentDescription;
        }

        public GetProcessDefinitionResponseBodyOwners setDisplayEnName(String displayEnName) {
            this.displayEnName = displayEnName;
            return this;
        }
        public String getDisplayEnName() {
            return this.displayEnName;
        }

        public GetProcessDefinitionResponseBodyOwners setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetProcessDefinitionResponseBodyOwners setMasterDataDepartments(java.util.List<GetProcessDefinitionResponseBodyOwnersMasterDataDepartments> masterDataDepartments) {
            this.masterDataDepartments = masterDataDepartments;
            return this;
        }
        public java.util.List<GetProcessDefinitionResponseBodyOwnersMasterDataDepartments> getMasterDataDepartments() {
            return this.masterDataDepartments;
        }

        public GetProcessDefinitionResponseBodyOwners setOrderNumber(String orderNumber) {
            this.orderNumber = orderNumber;
            return this;
        }
        public String getOrderNumber() {
            return this.orderNumber;
        }

        public GetProcessDefinitionResponseBodyOwners setPersonalPhoto(String personalPhoto) {
            this.personalPhoto = personalPhoto;
            return this;
        }
        public String getPersonalPhoto() {
            return this.personalPhoto;
        }

        public GetProcessDefinitionResponseBodyOwners setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetProcessDefinitionResponseBodyOwners setTbWang(String tbWang) {
            this.tbWang = tbWang;
            return this;
        }
        public String getTbWang() {
            return this.tbWang;
        }

        public GetProcessDefinitionResponseBodyOwners setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetProcessDefinitionResponseBodyOwners setUserInfo(String userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public String getUserInfo() {
            return this.userInfo;
        }

    }

    public static class GetProcessDefinitionResponseBodyTasksActivity extends TeaModel {
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
        @NameInMap("ActivityNameInEnglish")
        public String activityNameInEnglish;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("Id")
        public Long id;

        public static GetProcessDefinitionResponseBodyTasksActivity build(java.util.Map<String, ?> map) throws Exception {
            GetProcessDefinitionResponseBodyTasksActivity self = new GetProcessDefinitionResponseBodyTasksActivity();
            return TeaModel.build(map, self);
        }

        public GetProcessDefinitionResponseBodyTasksActivity setActivityId(String activityId) {
            this.activityId = activityId;
            return this;
        }
        public String getActivityId() {
            return this.activityId;
        }

        public GetProcessDefinitionResponseBodyTasksActivity setActivityInstanceStatus(String activityInstanceStatus) {
            this.activityInstanceStatus = activityInstanceStatus;
            return this;
        }
        public String getActivityInstanceStatus() {
            return this.activityInstanceStatus;
        }

        public GetProcessDefinitionResponseBodyTasksActivity setActivityName(String activityName) {
            this.activityName = activityName;
            return this;
        }
        public String getActivityName() {
            return this.activityName;
        }

        public GetProcessDefinitionResponseBodyTasksActivity setActivityNameInEnglish(String activityNameInEnglish) {
            this.activityNameInEnglish = activityNameInEnglish;
            return this;
        }
        public String getActivityNameInEnglish() {
            return this.activityNameInEnglish;
        }

        public GetProcessDefinitionResponseBodyTasksActivity setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class GetProcessDefinitionResponseBodyTasks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>manager123</p>
         */
        @NameInMap("ActionerId")
        public String actionerId;

        @NameInMap("Activity")
        public GetProcessDefinitionResponseBodyTasksActivity activity;

        /**
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>792</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        public static GetProcessDefinitionResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            GetProcessDefinitionResponseBodyTasks self = new GetProcessDefinitionResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public GetProcessDefinitionResponseBodyTasks setActionerId(String actionerId) {
            this.actionerId = actionerId;
            return this;
        }
        public String getActionerId() {
            return this.actionerId;
        }

        public GetProcessDefinitionResponseBodyTasks setActivity(GetProcessDefinitionResponseBodyTasksActivity activity) {
            this.activity = activity;
            return this;
        }
        public GetProcessDefinitionResponseBodyTasksActivity getActivity() {
            return this.activity;
        }

        public GetProcessDefinitionResponseBodyTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetProcessDefinitionResponseBodyTasks setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
