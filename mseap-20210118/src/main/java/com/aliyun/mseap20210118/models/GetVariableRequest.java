// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class GetVariableRequest extends TeaModel {
    // aliyunKp
    @NameInMap("AliyunKp")
    public String aliyunKp;

    // aliyunKpLong
    @NameInMap("AliyunKpLong")
    public Long aliyunKpLong;

    // apiType
    @NameInMap("ApiType")
    public String apiType;

    // bid
    @NameInMap("Bid")
    public String bid;

    // callerParentId
    @NameInMap("CallerParentId")
    public Long callerParentId;

    // callerSecurityTransport
    @NameInMap("CallerSecurityTransport")
    public Boolean callerSecurityTransport;

    // callerType
    @NameInMap("CallerType")
    public String callerType;

    // clientIp
    @NameInMap("ClientIp")
    public String clientIp;

    // lang
    @NameInMap("Lang")
    public String lang;

    // mfaPresent
    @NameInMap("MfaPresent")
    public Boolean mfaPresent;

    // originalRequest
    @NameInMap("OriginalRequest")
    public String originalRequest;

    // popAction
    @NameInMap("PopAction")
    public String popAction;

    // proxyCallerIp
    @NameInMap("ProxyCallerIp")
    public String proxyCallerIp;

    // proxyCallerSecurityTransport
    @NameInMap("ProxyCallerSecurityTransport")
    public Boolean proxyCallerSecurityTransport;

    // proxyTrustTransportInfo
    @NameInMap("ProxyTrustTransportInfo")
    public Boolean proxyTrustTransportInfo;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // securityToken
    @NameInMap("SecurityToken")
    public String securityToken;

    // stsTokenCallerBid
    @NameInMap("StsTokenCallerBid")
    public Long stsTokenCallerBid;

    // stsTokenCallerUid
    @NameInMap("StsTokenCallerUid")
    public Long stsTokenCallerUid;

    // templateId
    @NameInMap("TemplateId")
    public Long templateId;

    // userAccessKeyId
    @NameInMap("UserAccessKeyId")
    public String userAccessKeyId;

    // userBid
    @NameInMap("UserBid")
    public String userBid;

    // userCallerParentId
    @NameInMap("UserCallerParentId")
    public Long userCallerParentId;

    // userCallerSecurityTransport
    @NameInMap("UserCallerSecurityTransport")
    public Boolean userCallerSecurityTransport;

    // userCallerType
    @NameInMap("UserCallerType")
    public String userCallerType;

    // userClientIp
    @NameInMap("UserClientIp")
    public String userClientIp;

    // userKp
    @NameInMap("UserKp")
    public String userKp;

    // userMfaPresent
    @NameInMap("UserMfaPresent")
    public Boolean userMfaPresent;

    // userSecurityToken
    @NameInMap("UserSecurityToken")
    public String userSecurityToken;

    public static GetVariableRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVariableRequest self = new GetVariableRequest();
        return TeaModel.build(map, self);
    }

    public GetVariableRequest setAliyunKp(String aliyunKp) {
        this.aliyunKp = aliyunKp;
        return this;
    }
    public String getAliyunKp() {
        return this.aliyunKp;
    }

    public GetVariableRequest setAliyunKpLong(Long aliyunKpLong) {
        this.aliyunKpLong = aliyunKpLong;
        return this;
    }
    public Long getAliyunKpLong() {
        return this.aliyunKpLong;
    }

    public GetVariableRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public GetVariableRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public GetVariableRequest setCallerParentId(Long callerParentId) {
        this.callerParentId = callerParentId;
        return this;
    }
    public Long getCallerParentId() {
        return this.callerParentId;
    }

    public GetVariableRequest setCallerSecurityTransport(Boolean callerSecurityTransport) {
        this.callerSecurityTransport = callerSecurityTransport;
        return this;
    }
    public Boolean getCallerSecurityTransport() {
        return this.callerSecurityTransport;
    }

    public GetVariableRequest setCallerType(String callerType) {
        this.callerType = callerType;
        return this;
    }
    public String getCallerType() {
        return this.callerType;
    }

    public GetVariableRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public GetVariableRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetVariableRequest setMfaPresent(Boolean mfaPresent) {
        this.mfaPresent = mfaPresent;
        return this;
    }
    public Boolean getMfaPresent() {
        return this.mfaPresent;
    }

    public GetVariableRequest setOriginalRequest(String originalRequest) {
        this.originalRequest = originalRequest;
        return this;
    }
    public String getOriginalRequest() {
        return this.originalRequest;
    }

    public GetVariableRequest setPopAction(String popAction) {
        this.popAction = popAction;
        return this;
    }
    public String getPopAction() {
        return this.popAction;
    }

    public GetVariableRequest setProxyCallerIp(String proxyCallerIp) {
        this.proxyCallerIp = proxyCallerIp;
        return this;
    }
    public String getProxyCallerIp() {
        return this.proxyCallerIp;
    }

    public GetVariableRequest setProxyCallerSecurityTransport(Boolean proxyCallerSecurityTransport) {
        this.proxyCallerSecurityTransport = proxyCallerSecurityTransport;
        return this;
    }
    public Boolean getProxyCallerSecurityTransport() {
        return this.proxyCallerSecurityTransport;
    }

    public GetVariableRequest setProxyTrustTransportInfo(Boolean proxyTrustTransportInfo) {
        this.proxyTrustTransportInfo = proxyTrustTransportInfo;
        return this;
    }
    public Boolean getProxyTrustTransportInfo() {
        return this.proxyTrustTransportInfo;
    }

    public GetVariableRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVariableRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public GetVariableRequest setStsTokenCallerBid(Long stsTokenCallerBid) {
        this.stsTokenCallerBid = stsTokenCallerBid;
        return this;
    }
    public Long getStsTokenCallerBid() {
        return this.stsTokenCallerBid;
    }

    public GetVariableRequest setStsTokenCallerUid(Long stsTokenCallerUid) {
        this.stsTokenCallerUid = stsTokenCallerUid;
        return this;
    }
    public Long getStsTokenCallerUid() {
        return this.stsTokenCallerUid;
    }

    public GetVariableRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public GetVariableRequest setUserAccessKeyId(String userAccessKeyId) {
        this.userAccessKeyId = userAccessKeyId;
        return this;
    }
    public String getUserAccessKeyId() {
        return this.userAccessKeyId;
    }

    public GetVariableRequest setUserBid(String userBid) {
        this.userBid = userBid;
        return this;
    }
    public String getUserBid() {
        return this.userBid;
    }

    public GetVariableRequest setUserCallerParentId(Long userCallerParentId) {
        this.userCallerParentId = userCallerParentId;
        return this;
    }
    public Long getUserCallerParentId() {
        return this.userCallerParentId;
    }

    public GetVariableRequest setUserCallerSecurityTransport(Boolean userCallerSecurityTransport) {
        this.userCallerSecurityTransport = userCallerSecurityTransport;
        return this;
    }
    public Boolean getUserCallerSecurityTransport() {
        return this.userCallerSecurityTransport;
    }

    public GetVariableRequest setUserCallerType(String userCallerType) {
        this.userCallerType = userCallerType;
        return this;
    }
    public String getUserCallerType() {
        return this.userCallerType;
    }

    public GetVariableRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public GetVariableRequest setUserKp(String userKp) {
        this.userKp = userKp;
        return this;
    }
    public String getUserKp() {
        return this.userKp;
    }

    public GetVariableRequest setUserMfaPresent(Boolean userMfaPresent) {
        this.userMfaPresent = userMfaPresent;
        return this;
    }
    public Boolean getUserMfaPresent() {
        return this.userMfaPresent;
    }

    public GetVariableRequest setUserSecurityToken(String userSecurityToken) {
        this.userSecurityToken = userSecurityToken;
        return this;
    }
    public String getUserSecurityToken() {
        return this.userSecurityToken;
    }

}
