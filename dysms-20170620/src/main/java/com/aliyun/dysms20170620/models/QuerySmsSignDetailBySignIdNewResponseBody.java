// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsSignDetailBySignIdNewResponseBody extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("ApplicationScene")
    public QuerySmsSignDetailBySignIdNewResponseBodyApplicationScene applicationScene;

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
    public String authorizationLetterId;

    @NameInMap("AuthorizationLetterName")
    public String authorizationLetterName;

    @NameInMap("AuthorizationLetterState")
    public String authorizationLetterState;

    @NameInMap("AuthorizationLetterStatus")
    public String authorizationLetterStatus;

    @NameInMap("AuthorizationSignScope")
    public String authorizationSignScope;

    @NameInMap("EffectSceneType")
    public Integer effectSceneType;

    @NameInMap("EnableAuthorizationLetter")
    public Boolean enableAuthorizationLetter;

    @NameInMap("ExtendMessage")
    public String extendMessage;

    @NameInMap("FileIds")
    public java.util.List<Long> fileIds;

    @NameInMap("FileUrlList")
    public java.util.List<String> fileUrlList;

    @NameInMap("From")
    public String from;

    @NameInMap("GmtCreateStr")
    public String gmtCreateStr;

    @NameInMap("Id")
    public String id;

    @NameInMap("IsAuthorizationLetterOCRComplete")
    public Boolean isAuthorizationLetterOCRComplete;

    @NameInMap("IsAuthorizationLetterOCRDiff")
    public Boolean isAuthorizationLetterOCRDiff;

    @NameInMap("IsSignScopeOCRDiff")
    public Boolean isSignScopeOCRDiff;

    @NameInMap("List")
    public java.util.List<QuerySmsSignDetailBySignIdNewResponseBodyList> list;

    @NameInMap("NeedAuthorized")
    public Boolean needAuthorized;

    @NameInMap("OpenTag")
    public Boolean openTag;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("OrganizationCode")
    public String organizationCode;

    @NameInMap("OssKeys")
    public java.util.List<String> ossKeys;

    @NameInMap("ProxyAuthorization")
    public String proxyAuthorization;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SceneType")
    public Integer sceneType;

    @NameInMap("ServiceType")
    public Integer serviceType;

    @NameInMap("SignCode")
    public String signCode;

    @NameInMap("SignName")
    public String signName;

    @NameInMap("SignScopeOCR")
    public String signScopeOCR;

    @NameInMap("SignUpgrade")
    public String signUpgrade;

    public static QuerySmsSignDetailBySignIdNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsSignDetailBySignIdNewResponseBody self = new QuerySmsSignDetailBySignIdNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setApplicationScene(QuerySmsSignDetailBySignIdNewResponseBodyApplicationScene applicationScene) {
        this.applicationScene = applicationScene;
        return this;
    }
    public QuerySmsSignDetailBySignIdNewResponseBodyApplicationScene getApplicationScene() {
        return this.applicationScene;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setAuditInfo(String auditInfo) {
        this.auditInfo = auditInfo;
        return this;
    }
    public String getAuditInfo() {
        return this.auditInfo;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setAuditRemarkInfo(String auditRemarkInfo) {
        this.auditRemarkInfo = auditRemarkInfo;
        return this;
    }
    public String getAuditRemarkInfo() {
        return this.auditRemarkInfo;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setAuditState(String auditState) {
        this.auditState = auditState;
        return this;
    }
    public String getAuditState() {
        return this.auditState;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    public String getAuthorization() {
        return this.authorization;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setAuthorizationEffTime(String authorizationEffTime) {
        this.authorizationEffTime = authorizationEffTime;
        return this;
    }
    public String getAuthorizationEffTime() {
        return this.authorizationEffTime;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setAuthorizationLetter(String authorizationLetter) {
        this.authorizationLetter = authorizationLetter;
        return this;
    }
    public String getAuthorizationLetter() {
        return this.authorizationLetter;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setAuthorizationLetterAuditPass(Boolean authorizationLetterAuditPass) {
        this.authorizationLetterAuditPass = authorizationLetterAuditPass;
        return this;
    }
    public Boolean getAuthorizationLetterAuditPass() {
        return this.authorizationLetterAuditPass;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setAuthorizationLetterId(String authorizationLetterId) {
        this.authorizationLetterId = authorizationLetterId;
        return this;
    }
    public String getAuthorizationLetterId() {
        return this.authorizationLetterId;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setAuthorizationLetterName(String authorizationLetterName) {
        this.authorizationLetterName = authorizationLetterName;
        return this;
    }
    public String getAuthorizationLetterName() {
        return this.authorizationLetterName;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setAuthorizationLetterState(String authorizationLetterState) {
        this.authorizationLetterState = authorizationLetterState;
        return this;
    }
    public String getAuthorizationLetterState() {
        return this.authorizationLetterState;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setAuthorizationLetterStatus(String authorizationLetterStatus) {
        this.authorizationLetterStatus = authorizationLetterStatus;
        return this;
    }
    public String getAuthorizationLetterStatus() {
        return this.authorizationLetterStatus;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setAuthorizationSignScope(String authorizationSignScope) {
        this.authorizationSignScope = authorizationSignScope;
        return this;
    }
    public String getAuthorizationSignScope() {
        return this.authorizationSignScope;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setEffectSceneType(Integer effectSceneType) {
        this.effectSceneType = effectSceneType;
        return this;
    }
    public Integer getEffectSceneType() {
        return this.effectSceneType;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setEnableAuthorizationLetter(Boolean enableAuthorizationLetter) {
        this.enableAuthorizationLetter = enableAuthorizationLetter;
        return this;
    }
    public Boolean getEnableAuthorizationLetter() {
        return this.enableAuthorizationLetter;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setExtendMessage(String extendMessage) {
        this.extendMessage = extendMessage;
        return this;
    }
    public String getExtendMessage() {
        return this.extendMessage;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setFileIds(java.util.List<Long> fileIds) {
        this.fileIds = fileIds;
        return this;
    }
    public java.util.List<Long> getFileIds() {
        return this.fileIds;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setFileUrlList(java.util.List<String> fileUrlList) {
        this.fileUrlList = fileUrlList;
        return this;
    }
    public java.util.List<String> getFileUrlList() {
        return this.fileUrlList;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setGmtCreateStr(String gmtCreateStr) {
        this.gmtCreateStr = gmtCreateStr;
        return this;
    }
    public String getGmtCreateStr() {
        return this.gmtCreateStr;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setIsAuthorizationLetterOCRComplete(Boolean isAuthorizationLetterOCRComplete) {
        this.isAuthorizationLetterOCRComplete = isAuthorizationLetterOCRComplete;
        return this;
    }
    public Boolean getIsAuthorizationLetterOCRComplete() {
        return this.isAuthorizationLetterOCRComplete;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setIsAuthorizationLetterOCRDiff(Boolean isAuthorizationLetterOCRDiff) {
        this.isAuthorizationLetterOCRDiff = isAuthorizationLetterOCRDiff;
        return this;
    }
    public Boolean getIsAuthorizationLetterOCRDiff() {
        return this.isAuthorizationLetterOCRDiff;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setIsSignScopeOCRDiff(Boolean isSignScopeOCRDiff) {
        this.isSignScopeOCRDiff = isSignScopeOCRDiff;
        return this;
    }
    public Boolean getIsSignScopeOCRDiff() {
        return this.isSignScopeOCRDiff;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setList(java.util.List<QuerySmsSignDetailBySignIdNewResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QuerySmsSignDetailBySignIdNewResponseBodyList> getList() {
        return this.list;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setNeedAuthorized(Boolean needAuthorized) {
        this.needAuthorized = needAuthorized;
        return this;
    }
    public Boolean getNeedAuthorized() {
        return this.needAuthorized;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setOpenTag(Boolean openTag) {
        this.openTag = openTag;
        return this;
    }
    public Boolean getOpenTag() {
        return this.openTag;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
        return this;
    }
    public String getOrganizationCode() {
        return this.organizationCode;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setOssKeys(java.util.List<String> ossKeys) {
        this.ossKeys = ossKeys;
        return this;
    }
    public java.util.List<String> getOssKeys() {
        return this.ossKeys;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setProxyAuthorization(String proxyAuthorization) {
        this.proxyAuthorization = proxyAuthorization;
        return this;
    }
    public String getProxyAuthorization() {
        return this.proxyAuthorization;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public Integer getSceneType() {
        return this.sceneType;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setServiceType(Integer serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public Integer getServiceType() {
        return this.serviceType;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setSignCode(String signCode) {
        this.signCode = signCode;
        return this;
    }
    public String getSignCode() {
        return this.signCode;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setSignScopeOCR(String signScopeOCR) {
        this.signScopeOCR = signScopeOCR;
        return this;
    }
    public String getSignScopeOCR() {
        return this.signScopeOCR;
    }

    public QuerySmsSignDetailBySignIdNewResponseBody setSignUpgrade(String signUpgrade) {
        this.signUpgrade = signUpgrade;
        return this;
    }
    public String getSignUpgrade() {
        return this.signUpgrade;
    }

    public static class QuerySmsSignDetailBySignIdNewResponseBodyApplicationScene extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static QuerySmsSignDetailBySignIdNewResponseBodyApplicationScene build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsSignDetailBySignIdNewResponseBodyApplicationScene self = new QuerySmsSignDetailBySignIdNewResponseBodyApplicationScene();
            return TeaModel.build(map, self);
        }

        public QuerySmsSignDetailBySignIdNewResponseBodyApplicationScene setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public QuerySmsSignDetailBySignIdNewResponseBodyApplicationScene setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QuerySmsSignDetailBySignIdNewResponseBodyApplicationScene setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QuerySmsSignDetailBySignIdNewResponseBodyList extends TeaModel {
        @NameInMap("AuditState")
        public String auditState;

        @NameInMap("SceneType")
        public Integer sceneType;

        public static QuerySmsSignDetailBySignIdNewResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsSignDetailBySignIdNewResponseBodyList self = new QuerySmsSignDetailBySignIdNewResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QuerySmsSignDetailBySignIdNewResponseBodyList setAuditState(String auditState) {
            this.auditState = auditState;
            return this;
        }
        public String getAuditState() {
            return this.auditState;
        }

        public QuerySmsSignDetailBySignIdNewResponseBodyList setSceneType(Integer sceneType) {
            this.sceneType = sceneType;
            return this;
        }
        public Integer getSceneType() {
            return this.sceneType;
        }

    }

}
