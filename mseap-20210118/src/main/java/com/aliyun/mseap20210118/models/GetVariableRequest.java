// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class GetVariableRequest extends TeaModel {
    /**
     * <p>aliyunKp</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AliyunKp")
    public String aliyunKp;

    /**
     * <p>apiType</p>
     * 
     * <strong>example:</strong>
     * <p>openAPI</p>
     */
    @NameInMap("ApiType")
    public String apiType;

    /**
     * <p>bid</p>
     * 
     * <strong>example:</strong>
     * <p>26842</p>
     */
    @NameInMap("Bid")
    public String bid;

    /**
     * <p>lang</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>originalRequest</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OriginalRequest")
    public String originalRequest;

    /**
     * <strong>example:</strong>
     * <p>17</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <p>userAccessKeyId</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UserAccessKeyId")
    public String userAccessKeyId;

    /**
     * <p>userBid</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UserBid")
    public String userBid;

    /**
     * <p>userCallerParentId</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UserCallerParentId")
    public Long userCallerParentId;

    /**
     * <p>userCallerSecurityTransport</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UserCallerSecurityTransport")
    public Boolean userCallerSecurityTransport;

    /**
     * <p>userCallerType</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UserCallerType")
    public String userCallerType;

    /**
     * <p>userClientIp</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <p>userKp</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UserKp")
    public String userKp;

    /**
     * <p>userMfaPresent</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UserMfaPresent")
    public Boolean userMfaPresent;

    /**
     * <p>userSecurityToken</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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

    public GetVariableRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetVariableRequest setOriginalRequest(String originalRequest) {
        this.originalRequest = originalRequest;
        return this;
    }
    public String getOriginalRequest() {
        return this.originalRequest;
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
