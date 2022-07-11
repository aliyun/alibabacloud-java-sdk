// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class QueryTrademarkDetailByApplyNumber1Request extends TeaModel {
    @NameInMap("AliyunKp")
    public String aliyunKp;

    @NameInMap("AliyunKpLong")
    public Long aliyunKpLong;

    // INNER_API, OPEN_API
    @NameInMap("ApiType")
    public String apiType;

    @NameInMap("ApplyNumber")
    public String applyNumber;

    @NameInMap("Bid")
    public String bid;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("CallerParentId")
    public Long callerParentId;

    @NameInMap("CallerSecurityTransport")
    public Boolean callerSecurityTransport;

    @NameInMap("CallerType")
    public String callerType;

    @NameInMap("ClientIp")
    public String clientIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("MfaPresent")
    public Boolean mfaPresent;

    @NameInMap("OriginalRequest")
    public String originalRequest;

    @NameInMap("PopAction")
    public String popAction;

    @NameInMap("ProxyCallerIp")
    public String proxyCallerIp;

    @NameInMap("ProxyCallerSecurityTransport")
    public Boolean proxyCallerSecurityTransport;

    @NameInMap("ProxyTrustTransportInfo")
    public Boolean proxyTrustTransportInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("StsTokenCallerBid")
    public Long stsTokenCallerBid;

    @NameInMap("StsTokenCallerUid")
    public Long stsTokenCallerUid;

    @NameInMap("UserAccessKeyId")
    public String userAccessKeyId;

    @NameInMap("UserBid")
    public String userBid;

    @NameInMap("UserCallerParentId")
    public Long userCallerParentId;

    @NameInMap("UserCallerSecurityTransport")
    public Boolean userCallerSecurityTransport;

    @NameInMap("UserCallerType")
    public String userCallerType;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("UserKp")
    public String userKp;

    @NameInMap("UserMfaPresent")
    public Boolean userMfaPresent;

    @NameInMap("UserSecurityToken")
    public String userSecurityToken;

    public static QueryTrademarkDetailByApplyNumber1Request build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkDetailByApplyNumber1Request self = new QueryTrademarkDetailByApplyNumber1Request();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkDetailByApplyNumber1Request setAliyunKp(String aliyunKp) {
        this.aliyunKp = aliyunKp;
        return this;
    }
    public String getAliyunKp() {
        return this.aliyunKp;
    }

    public QueryTrademarkDetailByApplyNumber1Request setAliyunKpLong(Long aliyunKpLong) {
        this.aliyunKpLong = aliyunKpLong;
        return this;
    }
    public Long getAliyunKpLong() {
        return this.aliyunKpLong;
    }

    public QueryTrademarkDetailByApplyNumber1Request setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public QueryTrademarkDetailByApplyNumber1Request setApplyNumber(String applyNumber) {
        this.applyNumber = applyNumber;
        return this;
    }
    public String getApplyNumber() {
        return this.applyNumber;
    }

    public QueryTrademarkDetailByApplyNumber1Request setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public QueryTrademarkDetailByApplyNumber1Request setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QueryTrademarkDetailByApplyNumber1Request setCallerParentId(Long callerParentId) {
        this.callerParentId = callerParentId;
        return this;
    }
    public Long getCallerParentId() {
        return this.callerParentId;
    }

    public QueryTrademarkDetailByApplyNumber1Request setCallerSecurityTransport(Boolean callerSecurityTransport) {
        this.callerSecurityTransport = callerSecurityTransport;
        return this;
    }
    public Boolean getCallerSecurityTransport() {
        return this.callerSecurityTransport;
    }

    public QueryTrademarkDetailByApplyNumber1Request setCallerType(String callerType) {
        this.callerType = callerType;
        return this;
    }
    public String getCallerType() {
        return this.callerType;
    }

    public QueryTrademarkDetailByApplyNumber1Request setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public QueryTrademarkDetailByApplyNumber1Request setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryTrademarkDetailByApplyNumber1Request setMfaPresent(Boolean mfaPresent) {
        this.mfaPresent = mfaPresent;
        return this;
    }
    public Boolean getMfaPresent() {
        return this.mfaPresent;
    }

    public QueryTrademarkDetailByApplyNumber1Request setOriginalRequest(String originalRequest) {
        this.originalRequest = originalRequest;
        return this;
    }
    public String getOriginalRequest() {
        return this.originalRequest;
    }

    public QueryTrademarkDetailByApplyNumber1Request setPopAction(String popAction) {
        this.popAction = popAction;
        return this;
    }
    public String getPopAction() {
        return this.popAction;
    }

    public QueryTrademarkDetailByApplyNumber1Request setProxyCallerIp(String proxyCallerIp) {
        this.proxyCallerIp = proxyCallerIp;
        return this;
    }
    public String getProxyCallerIp() {
        return this.proxyCallerIp;
    }

    public QueryTrademarkDetailByApplyNumber1Request setProxyCallerSecurityTransport(Boolean proxyCallerSecurityTransport) {
        this.proxyCallerSecurityTransport = proxyCallerSecurityTransport;
        return this;
    }
    public Boolean getProxyCallerSecurityTransport() {
        return this.proxyCallerSecurityTransport;
    }

    public QueryTrademarkDetailByApplyNumber1Request setProxyTrustTransportInfo(Boolean proxyTrustTransportInfo) {
        this.proxyTrustTransportInfo = proxyTrustTransportInfo;
        return this;
    }
    public Boolean getProxyTrustTransportInfo() {
        return this.proxyTrustTransportInfo;
    }

    public QueryTrademarkDetailByApplyNumber1Request setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTrademarkDetailByApplyNumber1Request setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public QueryTrademarkDetailByApplyNumber1Request setStsTokenCallerBid(Long stsTokenCallerBid) {
        this.stsTokenCallerBid = stsTokenCallerBid;
        return this;
    }
    public Long getStsTokenCallerBid() {
        return this.stsTokenCallerBid;
    }

    public QueryTrademarkDetailByApplyNumber1Request setStsTokenCallerUid(Long stsTokenCallerUid) {
        this.stsTokenCallerUid = stsTokenCallerUid;
        return this;
    }
    public Long getStsTokenCallerUid() {
        return this.stsTokenCallerUid;
    }

    public QueryTrademarkDetailByApplyNumber1Request setUserAccessKeyId(String userAccessKeyId) {
        this.userAccessKeyId = userAccessKeyId;
        return this;
    }
    public String getUserAccessKeyId() {
        return this.userAccessKeyId;
    }

    public QueryTrademarkDetailByApplyNumber1Request setUserBid(String userBid) {
        this.userBid = userBid;
        return this;
    }
    public String getUserBid() {
        return this.userBid;
    }

    public QueryTrademarkDetailByApplyNumber1Request setUserCallerParentId(Long userCallerParentId) {
        this.userCallerParentId = userCallerParentId;
        return this;
    }
    public Long getUserCallerParentId() {
        return this.userCallerParentId;
    }

    public QueryTrademarkDetailByApplyNumber1Request setUserCallerSecurityTransport(Boolean userCallerSecurityTransport) {
        this.userCallerSecurityTransport = userCallerSecurityTransport;
        return this;
    }
    public Boolean getUserCallerSecurityTransport() {
        return this.userCallerSecurityTransport;
    }

    public QueryTrademarkDetailByApplyNumber1Request setUserCallerType(String userCallerType) {
        this.userCallerType = userCallerType;
        return this;
    }
    public String getUserCallerType() {
        return this.userCallerType;
    }

    public QueryTrademarkDetailByApplyNumber1Request setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public QueryTrademarkDetailByApplyNumber1Request setUserKp(String userKp) {
        this.userKp = userKp;
        return this;
    }
    public String getUserKp() {
        return this.userKp;
    }

    public QueryTrademarkDetailByApplyNumber1Request setUserMfaPresent(Boolean userMfaPresent) {
        this.userMfaPresent = userMfaPresent;
        return this;
    }
    public Boolean getUserMfaPresent() {
        return this.userMfaPresent;
    }

    public QueryTrademarkDetailByApplyNumber1Request setUserSecurityToken(String userSecurityToken) {
        this.userSecurityToken = userSecurityToken;
        return this;
    }
    public String getUserSecurityToken() {
        return this.userSecurityToken;
    }

}
