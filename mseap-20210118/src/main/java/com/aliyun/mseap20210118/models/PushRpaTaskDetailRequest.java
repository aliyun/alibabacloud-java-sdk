// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class PushRpaTaskDetailRequest extends TeaModel {
    /**
     * <p>aliyunKp</p>
     */
    @NameInMap("AliyunKp")
    public String aliyunKp;

    /**
     * <p>aliyunKpLong</p>
     */
    @NameInMap("AliyunKpLong")
    public Long aliyunKpLong;

    /**
     * <p>apiType</p>
     */
    @NameInMap("ApiType")
    public String apiType;

    /**
     * <p>bid</p>
     */
    @NameInMap("Bid")
    public String bid;

    /**
     * <p>callerParentId</p>
     */
    @NameInMap("CallerParentId")
    public Long callerParentId;

    /**
     * <p>callerSecurityTransport</p>
     */
    @NameInMap("CallerSecurityTransport")
    public Boolean callerSecurityTransport;

    /**
     * <p>callerType</p>
     */
    @NameInMap("CallerType")
    public String callerType;

    /**
     * <p>clientIp</p>
     */
    @NameInMap("ClientIp")
    public String clientIp;

    /**
     * <p>inputData</p>
     */
    @NameInMap("InputData")
    public String inputData;

    /**
     * <p>inputHtml</p>
     */
    @NameInMap("InputHtml")
    public String inputHtml;

    /**
     * <p>inputScreenshot</p>
     */
    @NameInMap("InputScreenshot")
    public String inputScreenshot;

    /**
     * <p>lang</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>mfaPresent</p>
     */
    @NameInMap("MfaPresent")
    public Boolean mfaPresent;

    /**
     * <p>modelDetailId</p>
     */
    @NameInMap("ModelDetailId")
    public Long modelDetailId;

    /**
     * <p>originalRequest</p>
     */
    @NameInMap("OriginalRequest")
    public String originalRequest;

    /**
     * <p>outputData</p>
     */
    @NameInMap("OutputData")
    public String outputData;

    /**
     * <p>outputHtml</p>
     */
    @NameInMap("OutputHtml")
    public String outputHtml;

    /**
     * <p>outputScreenshot</p>
     */
    @NameInMap("OutputScreenshot")
    public String outputScreenshot;

    /**
     * <p>popAction</p>
     */
    @NameInMap("PopAction")
    public String popAction;

    /**
     * <p>proxyCallerIp</p>
     */
    @NameInMap("ProxyCallerIp")
    public String proxyCallerIp;

    /**
     * <p>proxyCallerSecurityTransport</p>
     */
    @NameInMap("ProxyCallerSecurityTransport")
    public Boolean proxyCallerSecurityTransport;

    /**
     * <p>proxyTrustTransportInfo</p>
     */
    @NameInMap("ProxyTrustTransportInfo")
    public Boolean proxyTrustTransportInfo;

    /**
     * <p>requestId</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>status</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>stsTokenCallerBid</p>
     */
    @NameInMap("StsTokenCallerBid")
    public Long stsTokenCallerBid;

    /**
     * <p>stsTokenCallerUid</p>
     */
    @NameInMap("StsTokenCallerUid")
    public Long stsTokenCallerUid;

    /**
     * <p>taskDetailId</p>
     */
    @NameInMap("TaskDetailId")
    public Long taskDetailId;

    /**
     * <p>taskId</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>userAccessKeyId</p>
     */
    @NameInMap("UserAccessKeyId")
    public String userAccessKeyId;

    /**
     * <p>userBid</p>
     */
    @NameInMap("UserBid")
    public String userBid;

    /**
     * <p>userCallerParentId</p>
     */
    @NameInMap("UserCallerParentId")
    public Long userCallerParentId;

    /**
     * <p>userCallerSecurityTransport</p>
     */
    @NameInMap("UserCallerSecurityTransport")
    public Boolean userCallerSecurityTransport;

    /**
     * <p>userCallerType</p>
     */
    @NameInMap("UserCallerType")
    public String userCallerType;

    /**
     * <p>userClientIp</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <p>userKp</p>
     */
    @NameInMap("UserKp")
    public String userKp;

    /**
     * <p>userMfaPresent</p>
     */
    @NameInMap("UserMfaPresent")
    public Boolean userMfaPresent;

    /**
     * <p>userSecurityToken</p>
     */
    @NameInMap("UserSecurityToken")
    public String userSecurityToken;

    public static PushRpaTaskDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        PushRpaTaskDetailRequest self = new PushRpaTaskDetailRequest();
        return TeaModel.build(map, self);
    }

    public PushRpaTaskDetailRequest setAliyunKp(String aliyunKp) {
        this.aliyunKp = aliyunKp;
        return this;
    }
    public String getAliyunKp() {
        return this.aliyunKp;
    }

    public PushRpaTaskDetailRequest setAliyunKpLong(Long aliyunKpLong) {
        this.aliyunKpLong = aliyunKpLong;
        return this;
    }
    public Long getAliyunKpLong() {
        return this.aliyunKpLong;
    }

    public PushRpaTaskDetailRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public PushRpaTaskDetailRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public PushRpaTaskDetailRequest setCallerParentId(Long callerParentId) {
        this.callerParentId = callerParentId;
        return this;
    }
    public Long getCallerParentId() {
        return this.callerParentId;
    }

    public PushRpaTaskDetailRequest setCallerSecurityTransport(Boolean callerSecurityTransport) {
        this.callerSecurityTransport = callerSecurityTransport;
        return this;
    }
    public Boolean getCallerSecurityTransport() {
        return this.callerSecurityTransport;
    }

    public PushRpaTaskDetailRequest setCallerType(String callerType) {
        this.callerType = callerType;
        return this;
    }
    public String getCallerType() {
        return this.callerType;
    }

    public PushRpaTaskDetailRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public PushRpaTaskDetailRequest setInputData(String inputData) {
        this.inputData = inputData;
        return this;
    }
    public String getInputData() {
        return this.inputData;
    }

    public PushRpaTaskDetailRequest setInputHtml(String inputHtml) {
        this.inputHtml = inputHtml;
        return this;
    }
    public String getInputHtml() {
        return this.inputHtml;
    }

    public PushRpaTaskDetailRequest setInputScreenshot(String inputScreenshot) {
        this.inputScreenshot = inputScreenshot;
        return this;
    }
    public String getInputScreenshot() {
        return this.inputScreenshot;
    }

    public PushRpaTaskDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public PushRpaTaskDetailRequest setMfaPresent(Boolean mfaPresent) {
        this.mfaPresent = mfaPresent;
        return this;
    }
    public Boolean getMfaPresent() {
        return this.mfaPresent;
    }

    public PushRpaTaskDetailRequest setModelDetailId(Long modelDetailId) {
        this.modelDetailId = modelDetailId;
        return this;
    }
    public Long getModelDetailId() {
        return this.modelDetailId;
    }

    public PushRpaTaskDetailRequest setOriginalRequest(String originalRequest) {
        this.originalRequest = originalRequest;
        return this;
    }
    public String getOriginalRequest() {
        return this.originalRequest;
    }

    public PushRpaTaskDetailRequest setOutputData(String outputData) {
        this.outputData = outputData;
        return this;
    }
    public String getOutputData() {
        return this.outputData;
    }

    public PushRpaTaskDetailRequest setOutputHtml(String outputHtml) {
        this.outputHtml = outputHtml;
        return this;
    }
    public String getOutputHtml() {
        return this.outputHtml;
    }

    public PushRpaTaskDetailRequest setOutputScreenshot(String outputScreenshot) {
        this.outputScreenshot = outputScreenshot;
        return this;
    }
    public String getOutputScreenshot() {
        return this.outputScreenshot;
    }

    public PushRpaTaskDetailRequest setPopAction(String popAction) {
        this.popAction = popAction;
        return this;
    }
    public String getPopAction() {
        return this.popAction;
    }

    public PushRpaTaskDetailRequest setProxyCallerIp(String proxyCallerIp) {
        this.proxyCallerIp = proxyCallerIp;
        return this;
    }
    public String getProxyCallerIp() {
        return this.proxyCallerIp;
    }

    public PushRpaTaskDetailRequest setProxyCallerSecurityTransport(Boolean proxyCallerSecurityTransport) {
        this.proxyCallerSecurityTransport = proxyCallerSecurityTransport;
        return this;
    }
    public Boolean getProxyCallerSecurityTransport() {
        return this.proxyCallerSecurityTransport;
    }

    public PushRpaTaskDetailRequest setProxyTrustTransportInfo(Boolean proxyTrustTransportInfo) {
        this.proxyTrustTransportInfo = proxyTrustTransportInfo;
        return this;
    }
    public Boolean getProxyTrustTransportInfo() {
        return this.proxyTrustTransportInfo;
    }

    public PushRpaTaskDetailRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushRpaTaskDetailRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public PushRpaTaskDetailRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public PushRpaTaskDetailRequest setStsTokenCallerBid(Long stsTokenCallerBid) {
        this.stsTokenCallerBid = stsTokenCallerBid;
        return this;
    }
    public Long getStsTokenCallerBid() {
        return this.stsTokenCallerBid;
    }

    public PushRpaTaskDetailRequest setStsTokenCallerUid(Long stsTokenCallerUid) {
        this.stsTokenCallerUid = stsTokenCallerUid;
        return this;
    }
    public Long getStsTokenCallerUid() {
        return this.stsTokenCallerUid;
    }

    public PushRpaTaskDetailRequest setTaskDetailId(Long taskDetailId) {
        this.taskDetailId = taskDetailId;
        return this;
    }
    public Long getTaskDetailId() {
        return this.taskDetailId;
    }

    public PushRpaTaskDetailRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public PushRpaTaskDetailRequest setUserAccessKeyId(String userAccessKeyId) {
        this.userAccessKeyId = userAccessKeyId;
        return this;
    }
    public String getUserAccessKeyId() {
        return this.userAccessKeyId;
    }

    public PushRpaTaskDetailRequest setUserBid(String userBid) {
        this.userBid = userBid;
        return this;
    }
    public String getUserBid() {
        return this.userBid;
    }

    public PushRpaTaskDetailRequest setUserCallerParentId(Long userCallerParentId) {
        this.userCallerParentId = userCallerParentId;
        return this;
    }
    public Long getUserCallerParentId() {
        return this.userCallerParentId;
    }

    public PushRpaTaskDetailRequest setUserCallerSecurityTransport(Boolean userCallerSecurityTransport) {
        this.userCallerSecurityTransport = userCallerSecurityTransport;
        return this;
    }
    public Boolean getUserCallerSecurityTransport() {
        return this.userCallerSecurityTransport;
    }

    public PushRpaTaskDetailRequest setUserCallerType(String userCallerType) {
        this.userCallerType = userCallerType;
        return this;
    }
    public String getUserCallerType() {
        return this.userCallerType;
    }

    public PushRpaTaskDetailRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public PushRpaTaskDetailRequest setUserKp(String userKp) {
        this.userKp = userKp;
        return this;
    }
    public String getUserKp() {
        return this.userKp;
    }

    public PushRpaTaskDetailRequest setUserMfaPresent(Boolean userMfaPresent) {
        this.userMfaPresent = userMfaPresent;
        return this;
    }
    public Boolean getUserMfaPresent() {
        return this.userMfaPresent;
    }

    public PushRpaTaskDetailRequest setUserSecurityToken(String userSecurityToken) {
        this.userSecurityToken = userSecurityToken;
        return this;
    }
    public String getUserSecurityToken() {
        return this.userSecurityToken;
    }

}
