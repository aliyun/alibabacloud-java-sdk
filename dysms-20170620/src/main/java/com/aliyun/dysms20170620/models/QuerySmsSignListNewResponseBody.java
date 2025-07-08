// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsSignListNewResponseBody extends TeaModel {
    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SmsSign")
    public QuerySmsSignListNewResponseBodySmsSign smsSign;

    @NameInMap("Total")
    public Long total;

    public static QuerySmsSignListNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsSignListNewResponseBody self = new QuerySmsSignListNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmsSignListNewResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QuerySmsSignListNewResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySmsSignListNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySmsSignListNewResponseBody setSmsSign(QuerySmsSignListNewResponseBodySmsSign smsSign) {
        this.smsSign = smsSign;
        return this;
    }
    public QuerySmsSignListNewResponseBodySmsSign getSmsSign() {
        return this.smsSign;
    }

    public QuerySmsSignListNewResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class QuerySmsSignListNewResponseBodySmsSignSmsSignFileIds extends TeaModel {
        @NameInMap("FileId")
        public java.util.List<Long> fileId;

        public static QuerySmsSignListNewResponseBodySmsSignSmsSignFileIds build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsSignListNewResponseBodySmsSignSmsSignFileIds self = new QuerySmsSignListNewResponseBodySmsSignSmsSignFileIds();
            return TeaModel.build(map, self);
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSignFileIds setFileId(java.util.List<Long> fileId) {
            this.fileId = fileId;
            return this;
        }
        public java.util.List<Long> getFileId() {
            return this.fileId;
        }

    }

    public static class QuerySmsSignListNewResponseBodySmsSignSmsSignFileUrlList extends TeaModel {
        @NameInMap("FileUrl")
        public java.util.List<String> fileUrl;

        public static QuerySmsSignListNewResponseBodySmsSignSmsSignFileUrlList build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsSignListNewResponseBodySmsSignSmsSignFileUrlList self = new QuerySmsSignListNewResponseBodySmsSignSmsSignFileUrlList();
            return TeaModel.build(map, self);
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSignFileUrlList setFileUrl(java.util.List<String> fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public java.util.List<String> getFileUrl() {
            return this.fileUrl;
        }

    }

    public static class QuerySmsSignListNewResponseBodySmsSignSmsSignSignSceneDetailListSignSceneDetail extends TeaModel {
        @NameInMap("AuditState")
        public String auditState;

        @NameInMap("SceneType")
        public Integer sceneType;

        public static QuerySmsSignListNewResponseBodySmsSignSmsSignSignSceneDetailListSignSceneDetail build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsSignListNewResponseBodySmsSignSmsSignSignSceneDetailListSignSceneDetail self = new QuerySmsSignListNewResponseBodySmsSignSmsSignSignSceneDetailListSignSceneDetail();
            return TeaModel.build(map, self);
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSignSignSceneDetailListSignSceneDetail setAuditState(String auditState) {
            this.auditState = auditState;
            return this;
        }
        public String getAuditState() {
            return this.auditState;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSignSignSceneDetailListSignSceneDetail setSceneType(Integer sceneType) {
            this.sceneType = sceneType;
            return this;
        }
        public Integer getSceneType() {
            return this.sceneType;
        }

    }

    public static class QuerySmsSignListNewResponseBodySmsSignSmsSignSignSceneDetailList extends TeaModel {
        @NameInMap("SignSceneDetail")
        public java.util.List<QuerySmsSignListNewResponseBodySmsSignSmsSignSignSceneDetailListSignSceneDetail> signSceneDetail;

        public static QuerySmsSignListNewResponseBodySmsSignSmsSignSignSceneDetailList build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsSignListNewResponseBodySmsSignSmsSignSignSceneDetailList self = new QuerySmsSignListNewResponseBodySmsSignSmsSignSignSceneDetailList();
            return TeaModel.build(map, self);
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSignSignSceneDetailList setSignSceneDetail(java.util.List<QuerySmsSignListNewResponseBodySmsSignSmsSignSignSceneDetailListSignSceneDetail> signSceneDetail) {
            this.signSceneDetail = signSceneDetail;
            return this;
        }
        public java.util.List<QuerySmsSignListNewResponseBodySmsSignSmsSignSignSceneDetailListSignSceneDetail> getSignSceneDetail() {
            return this.signSceneDetail;
        }

    }

    public static class QuerySmsSignListNewResponseBodySmsSignSmsSign extends TeaModel {
        @NameInMap("AggregatedRegisterStatus")
        public Integer aggregatedRegisterStatus;

        @NameInMap("ApplySource")
        public String applySource;

        @NameInMap("AuditInfo")
        public String auditInfo;

        @NameInMap("AuditRemarkInfo")
        public String auditRemarkInfo;

        @NameInMap("AuditState")
        public String auditState;

        @NameInMap("Authorization")
        public String authorization;

        @NameInMap("AuthorizationEffTime")
        public String authorizationEffTime;

        @NameInMap("AuthorizationLetter")
        public String authorizationLetter;

        @NameInMap("AuthorizationLetterAuditPass")
        public Boolean authorizationLetterAuditPass;

        @NameInMap("AuthorizationLetterId")
        public Long authorizationLetterId;

        @NameInMap("AuthorizationLetterName")
        public String authorizationLetterName;

        @NameInMap("AuthorizationLetterStatus")
        public String authorizationLetterStatus;

        @NameInMap("AuthorizationSignScope")
        public String authorizationSignScope;

        @NameInMap("CanRegister")
        public Boolean canRegister;

        @NameInMap("EnableAuthorizationLetter")
        public Boolean enableAuthorizationLetter;

        @NameInMap("ExtendMessage")
        public String extendMessage;

        @NameInMap("FileIds")
        public QuerySmsSignListNewResponseBodySmsSignSmsSignFileIds fileIds;

        @NameInMap("FileUrlList")
        public QuerySmsSignListNewResponseBodySmsSignSmsSignFileUrlList fileUrlList;

        @NameInMap("GmtCreateStr")
        public String gmtCreateStr;

        @NameInMap("Id")
        public String id;

        @NameInMap("IsAuthorizationLetterOCRComplete")
        public Boolean isAuthorizationLetterOCRComplete;

        @NameInMap("IsAuthorizationLetterOCRDiff")
        public Boolean isAuthorizationLetterOCRDiff;

        @NameInMap("IsDefaultSign")
        public Boolean isDefaultSign;

        @NameInMap("IsSignScopeOCRDiff")
        public Boolean isSignScopeOCRDiff;

        @NameInMap("MobileRegisterStatus")
        public Integer mobileRegisterStatus;

        @NameInMap("OperateDateStr")
        public String operateDateStr;

        @NameInMap("OrderCount")
        public Long orderCount;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("OrganizationCode")
        public String organizationCode;

        @NameInMap("ProxyAuthorization")
        public String proxyAuthorization;

        @NameInMap("QualificationId")
        public Long qualificationId;

        @NameInMap("QualificationName")
        public String qualificationName;

        @NameInMap("QualificationState")
        public String qualificationState;

        @NameInMap("QualificationVersion")
        public Long qualificationVersion;

        @NameInMap("QualificationWorkOrderId")
        public Long qualificationWorkOrderId;

        @NameInMap("RegisterResult")
        public Integer registerResult;

        @NameInMap("RegisterTime")
        public Long registerTime;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("ResultReason")
        public String resultReason;

        @NameInMap("SceneType")
        public Integer sceneType;

        @NameInMap("ServiceType")
        public Integer serviceType;

        @NameInMap("SignCode")
        public String signCode;

        @NameInMap("SignName")
        public String signName;

        @NameInMap("SignSceneDetailList")
        public QuerySmsSignListNewResponseBodySmsSignSmsSignSignSceneDetailList signSceneDetailList;

        @NameInMap("SignScopeOCR")
        public String signScopeOCR;

        @NameInMap("SignSource")
        public String signSource;

        @NameInMap("SignType")
        public Integer signType;

        @NameInMap("TelecomRegisterStatus")
        public Integer telecomRegisterStatus;

        @NameInMap("UnicomRegisterStatus")
        public Integer unicomRegisterStatus;

        public static QuerySmsSignListNewResponseBodySmsSignSmsSign build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsSignListNewResponseBodySmsSignSmsSign self = new QuerySmsSignListNewResponseBodySmsSignSmsSign();
            return TeaModel.build(map, self);
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setAggregatedRegisterStatus(Integer aggregatedRegisterStatus) {
            this.aggregatedRegisterStatus = aggregatedRegisterStatus;
            return this;
        }
        public Integer getAggregatedRegisterStatus() {
            return this.aggregatedRegisterStatus;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setApplySource(String applySource) {
            this.applySource = applySource;
            return this;
        }
        public String getApplySource() {
            return this.applySource;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setAuditInfo(String auditInfo) {
            this.auditInfo = auditInfo;
            return this;
        }
        public String getAuditInfo() {
            return this.auditInfo;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setAuditRemarkInfo(String auditRemarkInfo) {
            this.auditRemarkInfo = auditRemarkInfo;
            return this;
        }
        public String getAuditRemarkInfo() {
            return this.auditRemarkInfo;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setAuditState(String auditState) {
            this.auditState = auditState;
            return this;
        }
        public String getAuditState() {
            return this.auditState;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setAuthorization(String authorization) {
            this.authorization = authorization;
            return this;
        }
        public String getAuthorization() {
            return this.authorization;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setAuthorizationEffTime(String authorizationEffTime) {
            this.authorizationEffTime = authorizationEffTime;
            return this;
        }
        public String getAuthorizationEffTime() {
            return this.authorizationEffTime;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setAuthorizationLetter(String authorizationLetter) {
            this.authorizationLetter = authorizationLetter;
            return this;
        }
        public String getAuthorizationLetter() {
            return this.authorizationLetter;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setAuthorizationLetterAuditPass(Boolean authorizationLetterAuditPass) {
            this.authorizationLetterAuditPass = authorizationLetterAuditPass;
            return this;
        }
        public Boolean getAuthorizationLetterAuditPass() {
            return this.authorizationLetterAuditPass;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setAuthorizationLetterId(Long authorizationLetterId) {
            this.authorizationLetterId = authorizationLetterId;
            return this;
        }
        public Long getAuthorizationLetterId() {
            return this.authorizationLetterId;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setAuthorizationLetterName(String authorizationLetterName) {
            this.authorizationLetterName = authorizationLetterName;
            return this;
        }
        public String getAuthorizationLetterName() {
            return this.authorizationLetterName;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setAuthorizationLetterStatus(String authorizationLetterStatus) {
            this.authorizationLetterStatus = authorizationLetterStatus;
            return this;
        }
        public String getAuthorizationLetterStatus() {
            return this.authorizationLetterStatus;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setAuthorizationSignScope(String authorizationSignScope) {
            this.authorizationSignScope = authorizationSignScope;
            return this;
        }
        public String getAuthorizationSignScope() {
            return this.authorizationSignScope;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setCanRegister(Boolean canRegister) {
            this.canRegister = canRegister;
            return this;
        }
        public Boolean getCanRegister() {
            return this.canRegister;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setEnableAuthorizationLetter(Boolean enableAuthorizationLetter) {
            this.enableAuthorizationLetter = enableAuthorizationLetter;
            return this;
        }
        public Boolean getEnableAuthorizationLetter() {
            return this.enableAuthorizationLetter;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setExtendMessage(String extendMessage) {
            this.extendMessage = extendMessage;
            return this;
        }
        public String getExtendMessage() {
            return this.extendMessage;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setFileIds(QuerySmsSignListNewResponseBodySmsSignSmsSignFileIds fileIds) {
            this.fileIds = fileIds;
            return this;
        }
        public QuerySmsSignListNewResponseBodySmsSignSmsSignFileIds getFileIds() {
            return this.fileIds;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setFileUrlList(QuerySmsSignListNewResponseBodySmsSignSmsSignFileUrlList fileUrlList) {
            this.fileUrlList = fileUrlList;
            return this;
        }
        public QuerySmsSignListNewResponseBodySmsSignSmsSignFileUrlList getFileUrlList() {
            return this.fileUrlList;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setGmtCreateStr(String gmtCreateStr) {
            this.gmtCreateStr = gmtCreateStr;
            return this;
        }
        public String getGmtCreateStr() {
            return this.gmtCreateStr;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setIsAuthorizationLetterOCRComplete(Boolean isAuthorizationLetterOCRComplete) {
            this.isAuthorizationLetterOCRComplete = isAuthorizationLetterOCRComplete;
            return this;
        }
        public Boolean getIsAuthorizationLetterOCRComplete() {
            return this.isAuthorizationLetterOCRComplete;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setIsAuthorizationLetterOCRDiff(Boolean isAuthorizationLetterOCRDiff) {
            this.isAuthorizationLetterOCRDiff = isAuthorizationLetterOCRDiff;
            return this;
        }
        public Boolean getIsAuthorizationLetterOCRDiff() {
            return this.isAuthorizationLetterOCRDiff;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setIsDefaultSign(Boolean isDefaultSign) {
            this.isDefaultSign = isDefaultSign;
            return this;
        }
        public Boolean getIsDefaultSign() {
            return this.isDefaultSign;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setIsSignScopeOCRDiff(Boolean isSignScopeOCRDiff) {
            this.isSignScopeOCRDiff = isSignScopeOCRDiff;
            return this;
        }
        public Boolean getIsSignScopeOCRDiff() {
            return this.isSignScopeOCRDiff;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setMobileRegisterStatus(Integer mobileRegisterStatus) {
            this.mobileRegisterStatus = mobileRegisterStatus;
            return this;
        }
        public Integer getMobileRegisterStatus() {
            return this.mobileRegisterStatus;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setOperateDateStr(String operateDateStr) {
            this.operateDateStr = operateDateStr;
            return this;
        }
        public String getOperateDateStr() {
            return this.operateDateStr;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setOrderCount(Long orderCount) {
            this.orderCount = orderCount;
            return this;
        }
        public Long getOrderCount() {
            return this.orderCount;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setOrganizationCode(String organizationCode) {
            this.organizationCode = organizationCode;
            return this;
        }
        public String getOrganizationCode() {
            return this.organizationCode;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setProxyAuthorization(String proxyAuthorization) {
            this.proxyAuthorization = proxyAuthorization;
            return this;
        }
        public String getProxyAuthorization() {
            return this.proxyAuthorization;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setQualificationId(Long qualificationId) {
            this.qualificationId = qualificationId;
            return this;
        }
        public Long getQualificationId() {
            return this.qualificationId;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setQualificationName(String qualificationName) {
            this.qualificationName = qualificationName;
            return this;
        }
        public String getQualificationName() {
            return this.qualificationName;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setQualificationState(String qualificationState) {
            this.qualificationState = qualificationState;
            return this;
        }
        public String getQualificationState() {
            return this.qualificationState;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setQualificationVersion(Long qualificationVersion) {
            this.qualificationVersion = qualificationVersion;
            return this;
        }
        public Long getQualificationVersion() {
            return this.qualificationVersion;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setQualificationWorkOrderId(Long qualificationWorkOrderId) {
            this.qualificationWorkOrderId = qualificationWorkOrderId;
            return this;
        }
        public Long getQualificationWorkOrderId() {
            return this.qualificationWorkOrderId;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setRegisterResult(Integer registerResult) {
            this.registerResult = registerResult;
            return this;
        }
        public Integer getRegisterResult() {
            return this.registerResult;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setRegisterTime(Long registerTime) {
            this.registerTime = registerTime;
            return this;
        }
        public Long getRegisterTime() {
            return this.registerTime;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setResultReason(String resultReason) {
            this.resultReason = resultReason;
            return this;
        }
        public String getResultReason() {
            return this.resultReason;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setSceneType(Integer sceneType) {
            this.sceneType = sceneType;
            return this;
        }
        public Integer getSceneType() {
            return this.sceneType;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setServiceType(Integer serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public Integer getServiceType() {
            return this.serviceType;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setSignCode(String signCode) {
            this.signCode = signCode;
            return this;
        }
        public String getSignCode() {
            return this.signCode;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setSignName(String signName) {
            this.signName = signName;
            return this;
        }
        public String getSignName() {
            return this.signName;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setSignSceneDetailList(QuerySmsSignListNewResponseBodySmsSignSmsSignSignSceneDetailList signSceneDetailList) {
            this.signSceneDetailList = signSceneDetailList;
            return this;
        }
        public QuerySmsSignListNewResponseBodySmsSignSmsSignSignSceneDetailList getSignSceneDetailList() {
            return this.signSceneDetailList;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setSignScopeOCR(String signScopeOCR) {
            this.signScopeOCR = signScopeOCR;
            return this;
        }
        public String getSignScopeOCR() {
            return this.signScopeOCR;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setSignSource(String signSource) {
            this.signSource = signSource;
            return this;
        }
        public String getSignSource() {
            return this.signSource;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setSignType(Integer signType) {
            this.signType = signType;
            return this;
        }
        public Integer getSignType() {
            return this.signType;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setTelecomRegisterStatus(Integer telecomRegisterStatus) {
            this.telecomRegisterStatus = telecomRegisterStatus;
            return this;
        }
        public Integer getTelecomRegisterStatus() {
            return this.telecomRegisterStatus;
        }

        public QuerySmsSignListNewResponseBodySmsSignSmsSign setUnicomRegisterStatus(Integer unicomRegisterStatus) {
            this.unicomRegisterStatus = unicomRegisterStatus;
            return this;
        }
        public Integer getUnicomRegisterStatus() {
            return this.unicomRegisterStatus;
        }

    }

    public static class QuerySmsSignListNewResponseBodySmsSign extends TeaModel {
        @NameInMap("SmsSign")
        public java.util.List<QuerySmsSignListNewResponseBodySmsSignSmsSign> smsSign;

        public static QuerySmsSignListNewResponseBodySmsSign build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsSignListNewResponseBodySmsSign self = new QuerySmsSignListNewResponseBodySmsSign();
            return TeaModel.build(map, self);
        }

        public QuerySmsSignListNewResponseBodySmsSign setSmsSign(java.util.List<QuerySmsSignListNewResponseBodySmsSignSmsSign> smsSign) {
            this.smsSign = smsSign;
            return this;
        }
        public java.util.List<QuerySmsSignListNewResponseBodySmsSignSmsSign> getSmsSign() {
            return this.smsSign;
        }

    }

}
