// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBody self = new EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBody();
        return TeaModel.build(map, self);
    }

    public EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBody setData(java.util.List<EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBodyData> getData() {
        return this.data;
    }

    public EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBodyData extends TeaModel {
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

        @NameInMap("EcId")
        public String ecId;

        @NameInMap("LeId")
        public String leId;

        @NameInMap("LeLicenseNo")
        public String leLicenseNo;

        @NameInMap("LeName")
        public String leName;

        @NameInMap("Message")
        public String message;

        @NameInMap("NbId")
        public String nbId;

        @NameInMap("OperatedAliyunId")
        public String operatedAliyunId;

        @NameInMap("OperatedPk")
        public String operatedPk;

        @NameInMap("Success")
        public String success;

        @NameInMap("TimeoutTime")
        public Long timeoutTime;

        @NameInMap("TodoId")
        public String todoId;

        @NameInMap("TodoType")
        public String todoType;

        public static EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBodyData self = new EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBodyData setApplicantAliyunId(String applicantAliyunId) {
            this.applicantAliyunId = applicantAliyunId;
            return this;
        }
        public String getApplicantAliyunId() {
            return this.applicantAliyunId;
        }

        public EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBodyData setApplicantPk(String applicantPk) {
            this.applicantPk = applicantPk;
            return this;
        }
        public String getApplicantPk() {
            return this.applicantPk;
        }

        public EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBodyData setApplyRemark(String applyRemark) {
            this.applyRemark = applyRemark;
            return this;
        }
        public String getApplyRemark() {
            return this.applyRemark;
        }

        public EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBodyData setApplyTime(Long applyTime) {
            this.applyTime = applyTime;
            return this;
        }
        public Long getApplyTime() {
            return this.applyTime;
        }

        public EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBodyData setAuditorAliyunId(String auditorAliyunId) {
            this.auditorAliyunId = auditorAliyunId;
            return this;
        }
        public String getAuditorAliyunId() {
            return this.auditorAliyunId;
        }

        public EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBodyData setAuditorPk(String auditorPk) {
            this.auditorPk = auditorPk;
            return this;
        }
        public String getAuditorPk() {
            return this.auditorPk;
        }

        public EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBodyData setEcId(String ecId) {
            this.ecId = ecId;
            return this;
        }
        public String getEcId() {
            return this.ecId;
        }

        public EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBodyData setLeId(String leId) {
            this.leId = leId;
            return this;
        }
        public String getLeId() {
            return this.leId;
        }

        public EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBodyData setLeLicenseNo(String leLicenseNo) {
            this.leLicenseNo = leLicenseNo;
            return this;
        }
        public String getLeLicenseNo() {
            return this.leLicenseNo;
        }

        public EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBodyData setLeName(String leName) {
            this.leName = leName;
            return this;
        }
        public String getLeName() {
            return this.leName;
        }

        public EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBodyData setNbId(String nbId) {
            this.nbId = nbId;
            return this;
        }
        public String getNbId() {
            return this.nbId;
        }

        public EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBodyData setOperatedAliyunId(String operatedAliyunId) {
            this.operatedAliyunId = operatedAliyunId;
            return this;
        }
        public String getOperatedAliyunId() {
            return this.operatedAliyunId;
        }

        public EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBodyData setOperatedPk(String operatedPk) {
            this.operatedPk = operatedPk;
            return this;
        }
        public String getOperatedPk() {
            return this.operatedPk;
        }

        public EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBodyData setSuccess(String success) {
            this.success = success;
            return this;
        }
        public String getSuccess() {
            return this.success;
        }

        public EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBodyData setTimeoutTime(Long timeoutTime) {
            this.timeoutTime = timeoutTime;
            return this;
        }
        public Long getTimeoutTime() {
            return this.timeoutTime;
        }

        public EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBodyData setTodoId(String todoId) {
            this.todoId = todoId;
            return this;
        }
        public String getTodoId() {
            return this.todoId;
        }

        public EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBodyData setTodoType(String todoType) {
            this.todoType = todoType;
            return this;
        }
        public String getTodoType() {
            return this.todoType;
        }

    }

}
