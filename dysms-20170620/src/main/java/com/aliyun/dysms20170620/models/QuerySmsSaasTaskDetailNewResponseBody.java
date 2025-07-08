// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsSaasTaskDetailNewResponseBody extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("DetailDownloadUrl")
    public String detailDownloadUrl;

    @NameInMap("DetailDownloadUrlForSuccess")
    public String detailDownloadUrlForSuccess;

    @NameInMap("ExtParams")
    public String extParams;

    @NameInMap("FailCount")
    public Integer failCount;

    @NameInMap("FireTime")
    public String fireTime;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("IsDeleted")
    public Boolean isDeleted;

    @NameInMap("IsPermitOrder")
    public Boolean isPermitOrder;

    @NameInMap("IsPermitOrderForSuccess")
    public Boolean isPermitOrderForSuccess;

    @NameInMap("OssFilePath")
    public String ossFilePath;

    @NameInMap("PhoneList")
    public QuerySmsSaasTaskDetailNewResponseBodyPhoneList phoneList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SaasBaseCommParam")
    public QuerySmsSaasTaskDetailNewResponseBodySaasBaseCommParam saasBaseCommParam;

    @NameInMap("SaasFileUrl")
    public String saasFileUrl;

    @NameInMap("ScheduleType")
    public String scheduleType;

    @NameInMap("Status")
    public String status;

    @NameInMap("SuccessCount")
    public Integer successCount;

    @NameInMap("TaskId")
    public Long taskId;

    @NameInMap("TaskInstanceId")
    public Long taskInstanceId;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static QuerySmsSaasTaskDetailNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsSaasTaskDetailNewResponseBody self = new QuerySmsSaasTaskDetailNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmsSaasTaskDetailNewResponseBody setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QuerySmsSaasTaskDetailNewResponseBody setDetailDownloadUrl(String detailDownloadUrl) {
        this.detailDownloadUrl = detailDownloadUrl;
        return this;
    }
    public String getDetailDownloadUrl() {
        return this.detailDownloadUrl;
    }

    public QuerySmsSaasTaskDetailNewResponseBody setDetailDownloadUrlForSuccess(String detailDownloadUrlForSuccess) {
        this.detailDownloadUrlForSuccess = detailDownloadUrlForSuccess;
        return this;
    }
    public String getDetailDownloadUrlForSuccess() {
        return this.detailDownloadUrlForSuccess;
    }

    public QuerySmsSaasTaskDetailNewResponseBody setExtParams(String extParams) {
        this.extParams = extParams;
        return this;
    }
    public String getExtParams() {
        return this.extParams;
    }

    public QuerySmsSaasTaskDetailNewResponseBody setFailCount(Integer failCount) {
        this.failCount = failCount;
        return this;
    }
    public Integer getFailCount() {
        return this.failCount;
    }

    public QuerySmsSaasTaskDetailNewResponseBody setFireTime(String fireTime) {
        this.fireTime = fireTime;
        return this;
    }
    public String getFireTime() {
        return this.fireTime;
    }

    public QuerySmsSaasTaskDetailNewResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public QuerySmsSaasTaskDetailNewResponseBody setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }
    public Boolean getIsDeleted() {
        return this.isDeleted;
    }

    public QuerySmsSaasTaskDetailNewResponseBody setIsPermitOrder(Boolean isPermitOrder) {
        this.isPermitOrder = isPermitOrder;
        return this;
    }
    public Boolean getIsPermitOrder() {
        return this.isPermitOrder;
    }

    public QuerySmsSaasTaskDetailNewResponseBody setIsPermitOrderForSuccess(Boolean isPermitOrderForSuccess) {
        this.isPermitOrderForSuccess = isPermitOrderForSuccess;
        return this;
    }
    public Boolean getIsPermitOrderForSuccess() {
        return this.isPermitOrderForSuccess;
    }

    public QuerySmsSaasTaskDetailNewResponseBody setOssFilePath(String ossFilePath) {
        this.ossFilePath = ossFilePath;
        return this;
    }
    public String getOssFilePath() {
        return this.ossFilePath;
    }

    public QuerySmsSaasTaskDetailNewResponseBody setPhoneList(QuerySmsSaasTaskDetailNewResponseBodyPhoneList phoneList) {
        this.phoneList = phoneList;
        return this;
    }
    public QuerySmsSaasTaskDetailNewResponseBodyPhoneList getPhoneList() {
        return this.phoneList;
    }

    public QuerySmsSaasTaskDetailNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySmsSaasTaskDetailNewResponseBody setSaasBaseCommParam(QuerySmsSaasTaskDetailNewResponseBodySaasBaseCommParam saasBaseCommParam) {
        this.saasBaseCommParam = saasBaseCommParam;
        return this;
    }
    public QuerySmsSaasTaskDetailNewResponseBodySaasBaseCommParam getSaasBaseCommParam() {
        return this.saasBaseCommParam;
    }

    public QuerySmsSaasTaskDetailNewResponseBody setSaasFileUrl(String saasFileUrl) {
        this.saasFileUrl = saasFileUrl;
        return this;
    }
    public String getSaasFileUrl() {
        return this.saasFileUrl;
    }

    public QuerySmsSaasTaskDetailNewResponseBody setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

    public QuerySmsSaasTaskDetailNewResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QuerySmsSaasTaskDetailNewResponseBody setSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }
    public Integer getSuccessCount() {
        return this.successCount;
    }

    public QuerySmsSaasTaskDetailNewResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public QuerySmsSaasTaskDetailNewResponseBody setTaskInstanceId(Long taskInstanceId) {
        this.taskInstanceId = taskInstanceId;
        return this;
    }
    public Long getTaskInstanceId() {
        return this.taskInstanceId;
    }

    public QuerySmsSaasTaskDetailNewResponseBody setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public QuerySmsSaasTaskDetailNewResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class QuerySmsSaasTaskDetailNewResponseBodyPhoneList extends TeaModel {
        @NameInMap("phoneNum")
        public java.util.List<String> phoneNum;

        public static QuerySmsSaasTaskDetailNewResponseBodyPhoneList build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsSaasTaskDetailNewResponseBodyPhoneList self = new QuerySmsSaasTaskDetailNewResponseBodyPhoneList();
            return TeaModel.build(map, self);
        }

        public QuerySmsSaasTaskDetailNewResponseBodyPhoneList setPhoneNum(java.util.List<String> phoneNum) {
            this.phoneNum = phoneNum;
            return this;
        }
        public java.util.List<String> getPhoneNum() {
            return this.phoneNum;
        }

    }

    public static class QuerySmsSaasTaskDetailNewResponseBodySaasBaseCommParamParamList extends TeaModel {
        @NameInMap("Param")
        public java.util.List<String> param;

        public static QuerySmsSaasTaskDetailNewResponseBodySaasBaseCommParamParamList build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsSaasTaskDetailNewResponseBodySaasBaseCommParamParamList self = new QuerySmsSaasTaskDetailNewResponseBodySaasBaseCommParamParamList();
            return TeaModel.build(map, self);
        }

        public QuerySmsSaasTaskDetailNewResponseBodySaasBaseCommParamParamList setParam(java.util.List<String> param) {
            this.param = param;
            return this;
        }
        public java.util.List<String> getParam() {
            return this.param;
        }

    }

    public static class QuerySmsSaasTaskDetailNewResponseBodySaasBaseCommParam extends TeaModel {
        @NameInMap("AliyunUid")
        public Long aliyunUid;

        @NameInMap("BillCount")
        public Integer billCount;

        @NameInMap("ByteCount")
        public Integer byteCount;

        @NameInMap("ClientIp")
        public String clientIp;

        @NameInMap("CustId")
        public Long custId;

        @NameInMap("CycleNum")
        public Integer cycleNum;

        @NameInMap("ParamList")
        public QuerySmsSaasTaskDetailNewResponseBodySaasBaseCommParamParamList paramList;

        @NameInMap("PartnerId")
        public Long partnerId;

        @NameInMap("Signature")
        public String signature;

        @NameInMap("SmsContent")
        public String smsContent;

        @NameInMap("SmsTemplateCode")
        public String smsTemplateCode;

        @NameInMap("TaskErrorCase")
        public String taskErrorCase;

        @NameInMap("TaskErrorSuggestion")
        public String taskErrorSuggestion;

        public static QuerySmsSaasTaskDetailNewResponseBodySaasBaseCommParam build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsSaasTaskDetailNewResponseBodySaasBaseCommParam self = new QuerySmsSaasTaskDetailNewResponseBodySaasBaseCommParam();
            return TeaModel.build(map, self);
        }

        public QuerySmsSaasTaskDetailNewResponseBodySaasBaseCommParam setAliyunUid(Long aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public Long getAliyunUid() {
            return this.aliyunUid;
        }

        public QuerySmsSaasTaskDetailNewResponseBodySaasBaseCommParam setBillCount(Integer billCount) {
            this.billCount = billCount;
            return this;
        }
        public Integer getBillCount() {
            return this.billCount;
        }

        public QuerySmsSaasTaskDetailNewResponseBodySaasBaseCommParam setByteCount(Integer byteCount) {
            this.byteCount = byteCount;
            return this;
        }
        public Integer getByteCount() {
            return this.byteCount;
        }

        public QuerySmsSaasTaskDetailNewResponseBodySaasBaseCommParam setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public QuerySmsSaasTaskDetailNewResponseBodySaasBaseCommParam setCustId(Long custId) {
            this.custId = custId;
            return this;
        }
        public Long getCustId() {
            return this.custId;
        }

        public QuerySmsSaasTaskDetailNewResponseBodySaasBaseCommParam setCycleNum(Integer cycleNum) {
            this.cycleNum = cycleNum;
            return this;
        }
        public Integer getCycleNum() {
            return this.cycleNum;
        }

        public QuerySmsSaasTaskDetailNewResponseBodySaasBaseCommParam setParamList(QuerySmsSaasTaskDetailNewResponseBodySaasBaseCommParamParamList paramList) {
            this.paramList = paramList;
            return this;
        }
        public QuerySmsSaasTaskDetailNewResponseBodySaasBaseCommParamParamList getParamList() {
            return this.paramList;
        }

        public QuerySmsSaasTaskDetailNewResponseBodySaasBaseCommParam setPartnerId(Long partnerId) {
            this.partnerId = partnerId;
            return this;
        }
        public Long getPartnerId() {
            return this.partnerId;
        }

        public QuerySmsSaasTaskDetailNewResponseBodySaasBaseCommParam setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public QuerySmsSaasTaskDetailNewResponseBodySaasBaseCommParam setSmsContent(String smsContent) {
            this.smsContent = smsContent;
            return this;
        }
        public String getSmsContent() {
            return this.smsContent;
        }

        public QuerySmsSaasTaskDetailNewResponseBodySaasBaseCommParam setSmsTemplateCode(String smsTemplateCode) {
            this.smsTemplateCode = smsTemplateCode;
            return this;
        }
        public String getSmsTemplateCode() {
            return this.smsTemplateCode;
        }

        public QuerySmsSaasTaskDetailNewResponseBodySaasBaseCommParam setTaskErrorCase(String taskErrorCase) {
            this.taskErrorCase = taskErrorCase;
            return this;
        }
        public String getTaskErrorCase() {
            return this.taskErrorCase;
        }

        public QuerySmsSaasTaskDetailNewResponseBodySaasBaseCommParam setTaskErrorSuggestion(String taskErrorSuggestion) {
            this.taskErrorSuggestion = taskErrorSuggestion;
            return this;
        }
        public String getTaskErrorSuggestion() {
            return this.taskErrorSuggestion;
        }

    }

}
