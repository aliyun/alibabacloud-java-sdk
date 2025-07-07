// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseTodoQueryAccountTodoListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public EnterpriseTodoQueryAccountTodoListResponseBodyData data;

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

    public static EnterpriseTodoQueryAccountTodoListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseTodoQueryAccountTodoListResponseBody self = new EnterpriseTodoQueryAccountTodoListResponseBody();
        return TeaModel.build(map, self);
    }

    public EnterpriseTodoQueryAccountTodoListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnterpriseTodoQueryAccountTodoListResponseBody setData(EnterpriseTodoQueryAccountTodoListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EnterpriseTodoQueryAccountTodoListResponseBodyData getData() {
        return this.data;
    }

    public EnterpriseTodoQueryAccountTodoListResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public EnterpriseTodoQueryAccountTodoListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnterpriseTodoQueryAccountTodoListResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public EnterpriseTodoQueryAccountTodoListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnterpriseTodoQueryAccountTodoListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListFromLeManagerList extends TeaModel {
        @NameInMap("AliyunId")
        public String aliyunId;

        @NameInMap("Pk")
        public String pk;

        @NameInMap("PkEncoded")
        public String pkEncoded;

        @NameInMap("Role")
        public String role;

        public static EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListFromLeManagerList build(java.util.Map<String, ?> map) throws Exception {
            EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListFromLeManagerList self = new EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListFromLeManagerList();
            return TeaModel.build(map, self);
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListFromLeManagerList setAliyunId(String aliyunId) {
            this.aliyunId = aliyunId;
            return this;
        }
        public String getAliyunId() {
            return this.aliyunId;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListFromLeManagerList setPk(String pk) {
            this.pk = pk;
            return this;
        }
        public String getPk() {
            return this.pk;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListFromLeManagerList setPkEncoded(String pkEncoded) {
            this.pkEncoded = pkEncoded;
            return this;
        }
        public String getPkEncoded() {
            return this.pkEncoded;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListFromLeManagerList setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListFromLe extends TeaModel {
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
        public java.util.List<EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListFromLeManagerList> managerList;

        @NameInMap("NbId")
        public String nbId;

        @NameInMap("SubjectName")
        public String subjectName;

        @NameInMap("SubjectType")
        public String subjectType;

        public static EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListFromLe build(java.util.Map<String, ?> map) throws Exception {
            EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListFromLe self = new EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListFromLe();
            return TeaModel.build(map, self);
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListFromLe setEcId(String ecId) {
            this.ecId = ecId;
            return this;
        }
        public String getEcId() {
            return this.ecId;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListFromLe setLeId(String leId) {
            this.leId = leId;
            return this;
        }
        public String getLeId() {
            return this.leId;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListFromLe setLicenseNumber(String licenseNumber) {
            this.licenseNumber = licenseNumber;
            return this;
        }
        public String getLicenseNumber() {
            return this.licenseNumber;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListFromLe setManageableAccountCount(Long manageableAccountCount) {
            this.manageableAccountCount = manageableAccountCount;
            return this;
        }
        public Long getManageableAccountCount() {
            return this.manageableAccountCount;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListFromLe setManagedAccountCount(Long managedAccountCount) {
            this.managedAccountCount = managedAccountCount;
            return this;
        }
        public Long getManagedAccountCount() {
            return this.managedAccountCount;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListFromLe setManagerList(java.util.List<EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListFromLeManagerList> managerList) {
            this.managerList = managerList;
            return this;
        }
        public java.util.List<EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListFromLeManagerList> getManagerList() {
            return this.managerList;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListFromLe setNbId(String nbId) {
            this.nbId = nbId;
            return this;
        }
        public String getNbId() {
            return this.nbId;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListFromLe setSubjectName(String subjectName) {
            this.subjectName = subjectName;
            return this;
        }
        public String getSubjectName() {
            return this.subjectName;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListFromLe setSubjectType(String subjectType) {
            this.subjectType = subjectType;
            return this;
        }
        public String getSubjectType() {
            return this.subjectType;
        }

    }

    public static class EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListProcessList extends TeaModel {
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

        public static EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListProcessList build(java.util.Map<String, ?> map) throws Exception {
            EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListProcessList self = new EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListProcessList();
            return TeaModel.build(map, self);
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListProcessList setAliyunId(String aliyunId) {
            this.aliyunId = aliyunId;
            return this;
        }
        public String getAliyunId() {
            return this.aliyunId;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListProcessList setAuditTime(Long auditTime) {
            this.auditTime = auditTime;
            return this;
        }
        public Long getAuditTime() {
            return this.auditTime;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListProcessList setEcId(String ecId) {
            this.ecId = ecId;
            return this;
        }
        public String getEcId() {
            return this.ecId;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListProcessList setLeId(String leId) {
            this.leId = leId;
            return this;
        }
        public String getLeId() {
            return this.leId;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListProcessList setNbId(String nbId) {
            this.nbId = nbId;
            return this;
        }
        public String getNbId() {
            return this.nbId;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListProcessList setPk(String pk) {
            this.pk = pk;
            return this;
        }
        public String getPk() {
            return this.pk;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListProcessList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListProcessList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListToLeManagerList extends TeaModel {
        @NameInMap("AliyunId")
        public String aliyunId;

        @NameInMap("Pk")
        public String pk;

        @NameInMap("PkEncoded")
        public String pkEncoded;

        @NameInMap("Role")
        public String role;

        public static EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListToLeManagerList build(java.util.Map<String, ?> map) throws Exception {
            EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListToLeManagerList self = new EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListToLeManagerList();
            return TeaModel.build(map, self);
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListToLeManagerList setAliyunId(String aliyunId) {
            this.aliyunId = aliyunId;
            return this;
        }
        public String getAliyunId() {
            return this.aliyunId;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListToLeManagerList setPk(String pk) {
            this.pk = pk;
            return this;
        }
        public String getPk() {
            return this.pk;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListToLeManagerList setPkEncoded(String pkEncoded) {
            this.pkEncoded = pkEncoded;
            return this;
        }
        public String getPkEncoded() {
            return this.pkEncoded;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListToLeManagerList setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListToLe extends TeaModel {
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
        public java.util.List<EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListToLeManagerList> managerList;

        @NameInMap("NbId")
        public String nbId;

        @NameInMap("SubjectName")
        public String subjectName;

        @NameInMap("SubjectType")
        public String subjectType;

        public static EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListToLe build(java.util.Map<String, ?> map) throws Exception {
            EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListToLe self = new EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListToLe();
            return TeaModel.build(map, self);
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListToLe setEcId(String ecId) {
            this.ecId = ecId;
            return this;
        }
        public String getEcId() {
            return this.ecId;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListToLe setLeId(String leId) {
            this.leId = leId;
            return this;
        }
        public String getLeId() {
            return this.leId;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListToLe setLicenseNumber(String licenseNumber) {
            this.licenseNumber = licenseNumber;
            return this;
        }
        public String getLicenseNumber() {
            return this.licenseNumber;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListToLe setManageableAccountCount(Long manageableAccountCount) {
            this.manageableAccountCount = manageableAccountCount;
            return this;
        }
        public Long getManageableAccountCount() {
            return this.manageableAccountCount;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListToLe setManagedAccountCount(Long managedAccountCount) {
            this.managedAccountCount = managedAccountCount;
            return this;
        }
        public Long getManagedAccountCount() {
            return this.managedAccountCount;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListToLe setManagerList(java.util.List<EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListToLeManagerList> managerList) {
            this.managerList = managerList;
            return this;
        }
        public java.util.List<EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListToLeManagerList> getManagerList() {
            return this.managerList;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListToLe setNbId(String nbId) {
            this.nbId = nbId;
            return this;
        }
        public String getNbId() {
            return this.nbId;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListToLe setSubjectName(String subjectName) {
            this.subjectName = subjectName;
            return this;
        }
        public String getSubjectName() {
            return this.subjectName;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListToLe setSubjectType(String subjectType) {
            this.subjectType = subjectType;
            return this;
        }
        public String getSubjectType() {
            return this.subjectType;
        }

    }

    public static class EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoList extends TeaModel {
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
        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListFromLe fromLe;

        @NameInMap("Pk")
        public String pk;

        @NameInMap("ProcessList")
        public java.util.List<EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListProcessList> processList;

        @NameInMap("Status")
        public String status;

        @NameInMap("TimeoutTime")
        public Long timeoutTime;

        @NameInMap("ToLe")
        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListToLe toLe;

        @NameInMap("ToLeAudit")
        public Boolean toLeAudit;

        @NameInMap("TodoId")
        public String todoId;

        @NameInMap("TodoType")
        public String todoType;

        @NameInMap("TodoView")
        public String todoView;

        public static EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoList build(java.util.Map<String, ?> map) throws Exception {
            EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoList self = new EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoList();
            return TeaModel.build(map, self);
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoList setAliyunId(String aliyunId) {
            this.aliyunId = aliyunId;
            return this;
        }
        public String getAliyunId() {
            return this.aliyunId;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoList setApplicantAliyunId(String applicantAliyunId) {
            this.applicantAliyunId = applicantAliyunId;
            return this;
        }
        public String getApplicantAliyunId() {
            return this.applicantAliyunId;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoList setApplicantPk(String applicantPk) {
            this.applicantPk = applicantPk;
            return this;
        }
        public String getApplicantPk() {
            return this.applicantPk;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoList setApplyRemark(String applyRemark) {
            this.applyRemark = applyRemark;
            return this;
        }
        public String getApplyRemark() {
            return this.applyRemark;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoList setApplyTime(Long applyTime) {
            this.applyTime = applyTime;
            return this;
        }
        public Long getApplyTime() {
            return this.applyTime;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoList setAuditorAliyunId(String auditorAliyunId) {
            this.auditorAliyunId = auditorAliyunId;
            return this;
        }
        public String getAuditorAliyunId() {
            return this.auditorAliyunId;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoList setAuditorPk(String auditorPk) {
            this.auditorPk = auditorPk;
            return this;
        }
        public String getAuditorPk() {
            return this.auditorPk;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoList setAuditorStatus(String auditorStatus) {
            this.auditorStatus = auditorStatus;
            return this;
        }
        public String getAuditorStatus() {
            return this.auditorStatus;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoList setCanceledTime(Long canceledTime) {
            this.canceledTime = canceledTime;
            return this;
        }
        public Long getCanceledTime() {
            return this.canceledTime;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoList setClosed(Boolean closed) {
            this.closed = closed;
            return this;
        }
        public Boolean getClosed() {
            return this.closed;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoList setCurrAuditor(Boolean currAuditor) {
            this.currAuditor = currAuditor;
            return this;
        }
        public Boolean getCurrAuditor() {
            return this.currAuditor;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoList setFromLe(EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListFromLe fromLe) {
            this.fromLe = fromLe;
            return this;
        }
        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListFromLe getFromLe() {
            return this.fromLe;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoList setPk(String pk) {
            this.pk = pk;
            return this;
        }
        public String getPk() {
            return this.pk;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoList setProcessList(java.util.List<EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListProcessList> processList) {
            this.processList = processList;
            return this;
        }
        public java.util.List<EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListProcessList> getProcessList() {
            return this.processList;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoList setTimeoutTime(Long timeoutTime) {
            this.timeoutTime = timeoutTime;
            return this;
        }
        public Long getTimeoutTime() {
            return this.timeoutTime;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoList setToLe(EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListToLe toLe) {
            this.toLe = toLe;
            return this;
        }
        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoListToLe getToLe() {
            return this.toLe;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoList setToLeAudit(Boolean toLeAudit) {
            this.toLeAudit = toLeAudit;
            return this;
        }
        public Boolean getToLeAudit() {
            return this.toLeAudit;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoList setTodoId(String todoId) {
            this.todoId = todoId;
            return this;
        }
        public String getTodoId() {
            return this.todoId;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoList setTodoType(String todoType) {
            this.todoType = todoType;
            return this;
        }
        public String getTodoType() {
            return this.todoType;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoList setTodoView(String todoView) {
            this.todoView = todoView;
            return this;
        }
        public String getTodoView() {
            return this.todoView;
        }

    }

    public static class EnterpriseTodoQueryAccountTodoListResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("TodoList")
        public java.util.List<EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoList> todoList;

        public static EnterpriseTodoQueryAccountTodoListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EnterpriseTodoQueryAccountTodoListResponseBodyData self = new EnterpriseTodoQueryAccountTodoListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public EnterpriseTodoQueryAccountTodoListResponseBodyData setTodoList(java.util.List<EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoList> todoList) {
            this.todoList = todoList;
            return this;
        }
        public java.util.List<EnterpriseTodoQueryAccountTodoListResponseBodyDataTodoList> getTodoList() {
            return this.todoList;
        }

    }

}
