// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseTodoQueryAccountTodoListByApplicantResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyData data;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Message")
    public String message;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static EnterpriseTodoQueryAccountTodoListByApplicantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseTodoQueryAccountTodoListByApplicantResponseBody self = new EnterpriseTodoQueryAccountTodoListByApplicantResponseBody();
        return TeaModel.build(map, self);
    }

    public EnterpriseTodoQueryAccountTodoListByApplicantResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnterpriseTodoQueryAccountTodoListByApplicantResponseBody setData(EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyData getData() {
        return this.data;
    }

    public EnterpriseTodoQueryAccountTodoListByApplicantResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public EnterpriseTodoQueryAccountTodoListByApplicantResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnterpriseTodoQueryAccountTodoListByApplicantResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public EnterpriseTodoQueryAccountTodoListByApplicantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnterpriseTodoQueryAccountTodoListByApplicantResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListFromLeManagerList extends TeaModel {
        @NameInMap("AliyunId")
        public String aliyunId;

        @NameInMap("Pk")
        public String pk;

        @NameInMap("PkEncoded")
        public String pkEncoded;

        @NameInMap("Role")
        public String role;

        public static EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListFromLeManagerList build(java.util.Map<String, ?> map) throws Exception {
            EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListFromLeManagerList self = new EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListFromLeManagerList();
            return TeaModel.build(map, self);
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListFromLeManagerList setAliyunId(String aliyunId) {
            this.aliyunId = aliyunId;
            return this;
        }
        public String getAliyunId() {
            return this.aliyunId;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListFromLeManagerList setPk(String pk) {
            this.pk = pk;
            return this;
        }
        public String getPk() {
            return this.pk;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListFromLeManagerList setPkEncoded(String pkEncoded) {
            this.pkEncoded = pkEncoded;
            return this;
        }
        public String getPkEncoded() {
            return this.pkEncoded;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListFromLeManagerList setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListFromLe extends TeaModel {
        @NameInMap("EcId")
        public String ecId;

        @NameInMap("LeId")
        public String leId;

        @NameInMap("LicenseNumber")
        public String licenseNumber;

        @NameInMap("ManageableAccountCount")
        public Long manageableAccountCount;

        @NameInMap("ManagedAccountCount")
        public Long managedAccountCount;

        @NameInMap("ManagerList")
        public java.util.List<EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListFromLeManagerList> managerList;

        @NameInMap("NbId")
        public String nbId;

        @NameInMap("SubjectName")
        public String subjectName;

        @NameInMap("SubjectType")
        public String subjectType;

        public static EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListFromLe build(java.util.Map<String, ?> map) throws Exception {
            EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListFromLe self = new EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListFromLe();
            return TeaModel.build(map, self);
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListFromLe setEcId(String ecId) {
            this.ecId = ecId;
            return this;
        }
        public String getEcId() {
            return this.ecId;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListFromLe setLeId(String leId) {
            this.leId = leId;
            return this;
        }
        public String getLeId() {
            return this.leId;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListFromLe setLicenseNumber(String licenseNumber) {
            this.licenseNumber = licenseNumber;
            return this;
        }
        public String getLicenseNumber() {
            return this.licenseNumber;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListFromLe setManageableAccountCount(Long manageableAccountCount) {
            this.manageableAccountCount = manageableAccountCount;
            return this;
        }
        public Long getManageableAccountCount() {
            return this.manageableAccountCount;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListFromLe setManagedAccountCount(Long managedAccountCount) {
            this.managedAccountCount = managedAccountCount;
            return this;
        }
        public Long getManagedAccountCount() {
            return this.managedAccountCount;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListFromLe setManagerList(java.util.List<EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListFromLeManagerList> managerList) {
            this.managerList = managerList;
            return this;
        }
        public java.util.List<EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListFromLeManagerList> getManagerList() {
            return this.managerList;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListFromLe setNbId(String nbId) {
            this.nbId = nbId;
            return this;
        }
        public String getNbId() {
            return this.nbId;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListFromLe setSubjectName(String subjectName) {
            this.subjectName = subjectName;
            return this;
        }
        public String getSubjectName() {
            return this.subjectName;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListFromLe setSubjectType(String subjectType) {
            this.subjectType = subjectType;
            return this;
        }
        public String getSubjectType() {
            return this.subjectType;
        }

    }

    public static class EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListProcessList extends TeaModel {
        @NameInMap("AliyunId")
        public String aliyunId;

        @NameInMap("AuditTime")
        public Long auditTime;

        @NameInMap("EcId")
        public String ecId;

        @NameInMap("LeId")
        public String leId;

        @NameInMap("NbId")
        public String nbId;

        @NameInMap("Pk")
        public String pk;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Status")
        public String status;

        public static EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListProcessList build(java.util.Map<String, ?> map) throws Exception {
            EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListProcessList self = new EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListProcessList();
            return TeaModel.build(map, self);
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListProcessList setAliyunId(String aliyunId) {
            this.aliyunId = aliyunId;
            return this;
        }
        public String getAliyunId() {
            return this.aliyunId;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListProcessList setAuditTime(Long auditTime) {
            this.auditTime = auditTime;
            return this;
        }
        public Long getAuditTime() {
            return this.auditTime;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListProcessList setEcId(String ecId) {
            this.ecId = ecId;
            return this;
        }
        public String getEcId() {
            return this.ecId;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListProcessList setLeId(String leId) {
            this.leId = leId;
            return this;
        }
        public String getLeId() {
            return this.leId;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListProcessList setNbId(String nbId) {
            this.nbId = nbId;
            return this;
        }
        public String getNbId() {
            return this.nbId;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListProcessList setPk(String pk) {
            this.pk = pk;
            return this;
        }
        public String getPk() {
            return this.pk;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListProcessList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListProcessList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListToLeManagerList extends TeaModel {
        @NameInMap("AliyunId")
        public String aliyunId;

        @NameInMap("Pk")
        public String pk;

        @NameInMap("PkEncoded")
        public String pkEncoded;

        @NameInMap("Role")
        public String role;

        public static EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListToLeManagerList build(java.util.Map<String, ?> map) throws Exception {
            EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListToLeManagerList self = new EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListToLeManagerList();
            return TeaModel.build(map, self);
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListToLeManagerList setAliyunId(String aliyunId) {
            this.aliyunId = aliyunId;
            return this;
        }
        public String getAliyunId() {
            return this.aliyunId;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListToLeManagerList setPk(String pk) {
            this.pk = pk;
            return this;
        }
        public String getPk() {
            return this.pk;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListToLeManagerList setPkEncoded(String pkEncoded) {
            this.pkEncoded = pkEncoded;
            return this;
        }
        public String getPkEncoded() {
            return this.pkEncoded;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListToLeManagerList setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListToLe extends TeaModel {
        @NameInMap("EcId")
        public String ecId;

        @NameInMap("LeId")
        public String leId;

        @NameInMap("LicenseNumber")
        public String licenseNumber;

        @NameInMap("ManageableAccountCount")
        public Long manageableAccountCount;

        @NameInMap("ManagedAccountCount")
        public Long managedAccountCount;

        @NameInMap("ManagerList")
        public java.util.List<EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListToLeManagerList> managerList;

        @NameInMap("NbId")
        public String nbId;

        @NameInMap("SubjectName")
        public String subjectName;

        @NameInMap("SubjectType")
        public String subjectType;

        public static EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListToLe build(java.util.Map<String, ?> map) throws Exception {
            EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListToLe self = new EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListToLe();
            return TeaModel.build(map, self);
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListToLe setEcId(String ecId) {
            this.ecId = ecId;
            return this;
        }
        public String getEcId() {
            return this.ecId;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListToLe setLeId(String leId) {
            this.leId = leId;
            return this;
        }
        public String getLeId() {
            return this.leId;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListToLe setLicenseNumber(String licenseNumber) {
            this.licenseNumber = licenseNumber;
            return this;
        }
        public String getLicenseNumber() {
            return this.licenseNumber;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListToLe setManageableAccountCount(Long manageableAccountCount) {
            this.manageableAccountCount = manageableAccountCount;
            return this;
        }
        public Long getManageableAccountCount() {
            return this.manageableAccountCount;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListToLe setManagedAccountCount(Long managedAccountCount) {
            this.managedAccountCount = managedAccountCount;
            return this;
        }
        public Long getManagedAccountCount() {
            return this.managedAccountCount;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListToLe setManagerList(java.util.List<EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListToLeManagerList> managerList) {
            this.managerList = managerList;
            return this;
        }
        public java.util.List<EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListToLeManagerList> getManagerList() {
            return this.managerList;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListToLe setNbId(String nbId) {
            this.nbId = nbId;
            return this;
        }
        public String getNbId() {
            return this.nbId;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListToLe setSubjectName(String subjectName) {
            this.subjectName = subjectName;
            return this;
        }
        public String getSubjectName() {
            return this.subjectName;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListToLe setSubjectType(String subjectType) {
            this.subjectType = subjectType;
            return this;
        }
        public String getSubjectType() {
            return this.subjectType;
        }

    }

    public static class EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoList extends TeaModel {
        @NameInMap("AliyunId")
        public String aliyunId;

        @NameInMap("ApplicantAliyunId")
        public String applicantAliyunId;

        @NameInMap("ApplicantPk")
        public String applicantPk;

        @NameInMap("ApplyRemark")
        public String applyRemark;

        @NameInMap("ApplyTime")
        public Long applyTime;

        @NameInMap("AuditorAliyunId")
        public String auditorAliyunId;

        @NameInMap("AuditorPk")
        public String auditorPk;

        @NameInMap("AuditorStatus")
        public String auditorStatus;

        @NameInMap("CanceledTime")
        public Long canceledTime;

        @NameInMap("Closed")
        public Boolean closed;

        @NameInMap("CurrAuditor")
        public Boolean currAuditor;

        @NameInMap("FromLe")
        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListFromLe fromLe;

        @NameInMap("Pk")
        public String pk;

        @NameInMap("ProcessList")
        public java.util.List<EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListProcessList> processList;

        @NameInMap("Status")
        public String status;

        @NameInMap("TimeoutTime")
        public Long timeoutTime;

        @NameInMap("ToLe")
        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListToLe toLe;

        @NameInMap("ToLeAudit")
        public Boolean toLeAudit;

        @NameInMap("TodoId")
        public String todoId;

        @NameInMap("TodoType")
        public String todoType;

        @NameInMap("TodoView")
        public String todoView;

        public static EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoList build(java.util.Map<String, ?> map) throws Exception {
            EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoList self = new EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoList();
            return TeaModel.build(map, self);
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoList setAliyunId(String aliyunId) {
            this.aliyunId = aliyunId;
            return this;
        }
        public String getAliyunId() {
            return this.aliyunId;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoList setApplicantAliyunId(String applicantAliyunId) {
            this.applicantAliyunId = applicantAliyunId;
            return this;
        }
        public String getApplicantAliyunId() {
            return this.applicantAliyunId;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoList setApplicantPk(String applicantPk) {
            this.applicantPk = applicantPk;
            return this;
        }
        public String getApplicantPk() {
            return this.applicantPk;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoList setApplyRemark(String applyRemark) {
            this.applyRemark = applyRemark;
            return this;
        }
        public String getApplyRemark() {
            return this.applyRemark;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoList setApplyTime(Long applyTime) {
            this.applyTime = applyTime;
            return this;
        }
        public Long getApplyTime() {
            return this.applyTime;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoList setAuditorAliyunId(String auditorAliyunId) {
            this.auditorAliyunId = auditorAliyunId;
            return this;
        }
        public String getAuditorAliyunId() {
            return this.auditorAliyunId;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoList setAuditorPk(String auditorPk) {
            this.auditorPk = auditorPk;
            return this;
        }
        public String getAuditorPk() {
            return this.auditorPk;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoList setAuditorStatus(String auditorStatus) {
            this.auditorStatus = auditorStatus;
            return this;
        }
        public String getAuditorStatus() {
            return this.auditorStatus;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoList setCanceledTime(Long canceledTime) {
            this.canceledTime = canceledTime;
            return this;
        }
        public Long getCanceledTime() {
            return this.canceledTime;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoList setClosed(Boolean closed) {
            this.closed = closed;
            return this;
        }
        public Boolean getClosed() {
            return this.closed;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoList setCurrAuditor(Boolean currAuditor) {
            this.currAuditor = currAuditor;
            return this;
        }
        public Boolean getCurrAuditor() {
            return this.currAuditor;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoList setFromLe(EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListFromLe fromLe) {
            this.fromLe = fromLe;
            return this;
        }
        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListFromLe getFromLe() {
            return this.fromLe;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoList setPk(String pk) {
            this.pk = pk;
            return this;
        }
        public String getPk() {
            return this.pk;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoList setProcessList(java.util.List<EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListProcessList> processList) {
            this.processList = processList;
            return this;
        }
        public java.util.List<EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListProcessList> getProcessList() {
            return this.processList;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoList setTimeoutTime(Long timeoutTime) {
            this.timeoutTime = timeoutTime;
            return this;
        }
        public Long getTimeoutTime() {
            return this.timeoutTime;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoList setToLe(EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListToLe toLe) {
            this.toLe = toLe;
            return this;
        }
        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoListToLe getToLe() {
            return this.toLe;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoList setToLeAudit(Boolean toLeAudit) {
            this.toLeAudit = toLeAudit;
            return this;
        }
        public Boolean getToLeAudit() {
            return this.toLeAudit;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoList setTodoId(String todoId) {
            this.todoId = todoId;
            return this;
        }
        public String getTodoId() {
            return this.todoId;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoList setTodoType(String todoType) {
            this.todoType = todoType;
            return this;
        }
        public String getTodoType() {
            return this.todoType;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoList setTodoView(String todoView) {
            this.todoView = todoView;
            return this;
        }
        public String getTodoView() {
            return this.todoView;
        }

    }

    public static class EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("TodoList")
        public java.util.List<EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoList> todoList;

        public static EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyData self = new EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyData setTodoList(java.util.List<EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoList> todoList) {
            this.todoList = todoList;
            return this;
        }
        public java.util.List<EnterpriseTodoQueryAccountTodoListByApplicantResponseBodyDataTodoList> getTodoList() {
            return this.todoList;
        }

    }

}
