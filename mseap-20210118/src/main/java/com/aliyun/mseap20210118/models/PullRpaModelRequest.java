// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class PullRpaModelRequest extends TeaModel {
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
     * <p>templateId</p>
     * 
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
     * <p>1</p>
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

    public static PullRpaModelRequest build(java.util.Map<String, ?> map) throws Exception {
        PullRpaModelRequest self = new PullRpaModelRequest();
        return TeaModel.build(map, self);
    }

    public PullRpaModelRequest setAliyunKp(String aliyunKp) {
        this.aliyunKp = aliyunKp;
        return this;
    }
    public String getAliyunKp() {
        return this.aliyunKp;
    }

    public PullRpaModelRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public PullRpaModelRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public PullRpaModelRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public PullRpaModelRequest setOriginalRequest(String originalRequest) {
        this.originalRequest = originalRequest;
        return this;
    }
    public String getOriginalRequest() {
        return this.originalRequest;
    }

    public PullRpaModelRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public PullRpaModelRequest setUserAccessKeyId(String userAccessKeyId) {
        this.userAccessKeyId = userAccessKeyId;
        return this;
    }
    public String getUserAccessKeyId() {
        return this.userAccessKeyId;
    }

    public PullRpaModelRequest setUserBid(String userBid) {
        this.userBid = userBid;
        return this;
    }
    public String getUserBid() {
        return this.userBid;
    }

    public PullRpaModelRequest setUserCallerParentId(Long userCallerParentId) {
        this.userCallerParentId = userCallerParentId;
        return this;
    }
    public Long getUserCallerParentId() {
        return this.userCallerParentId;
    }

    public PullRpaModelRequest setUserCallerType(String userCallerType) {
        this.userCallerType = userCallerType;
        return this;
    }
    public String getUserCallerType() {
        return this.userCallerType;
    }

    public PullRpaModelRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public PullRpaModelRequest setUserKp(String userKp) {
        this.userKp = userKp;
        return this;
    }
    public String getUserKp() {
        return this.userKp;
    }

    public PullRpaModelRequest setUserMfaPresent(Boolean userMfaPresent) {
        this.userMfaPresent = userMfaPresent;
        return this;
    }
    public Boolean getUserMfaPresent() {
        return this.userMfaPresent;
    }

    public PullRpaModelRequest setUserSecurityToken(String userSecurityToken) {
        this.userSecurityToken = userSecurityToken;
        return this;
    }
    public String getUserSecurityToken() {
        return this.userSecurityToken;
    }

}
