// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class IdentifyCodeRequest extends TeaModel {
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
     * <strong>example:</strong>
     * <p>{\&quot;engine\&quot;: \&quot;MySQL\&quot;, \&quot;instanceId\&quot;: \&quot;rm-2zes07949gc0febg6\&quot;, \&quot;userId\&quot;: \&quot;1204765431532768\&quot;, \&quot;previousExistConfig\&quot;: False, \&quot;engineVersion\&quot;: \&quot;8.0\&quot;, \&quot;autoResourceOptimize\&quot;: 0, \&quot;dasProOn\&quot;: False}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>1551278</p>
     */
    @NameInMap("Label")
    public String label;

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
     * <p>CBWP</p>
     */
    @NameInMap("Type")
    public String type;

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

    public static IdentifyCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        IdentifyCodeRequest self = new IdentifyCodeRequest();
        return TeaModel.build(map, self);
    }

    public IdentifyCodeRequest setAliyunKp(String aliyunKp) {
        this.aliyunKp = aliyunKp;
        return this;
    }
    public String getAliyunKp() {
        return this.aliyunKp;
    }

    public IdentifyCodeRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public IdentifyCodeRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public IdentifyCodeRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public IdentifyCodeRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public IdentifyCodeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public IdentifyCodeRequest setOriginalRequest(String originalRequest) {
        this.originalRequest = originalRequest;
        return this;
    }
    public String getOriginalRequest() {
        return this.originalRequest;
    }

    public IdentifyCodeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public IdentifyCodeRequest setUserAccessKeyId(String userAccessKeyId) {
        this.userAccessKeyId = userAccessKeyId;
        return this;
    }
    public String getUserAccessKeyId() {
        return this.userAccessKeyId;
    }

    public IdentifyCodeRequest setUserBid(String userBid) {
        this.userBid = userBid;
        return this;
    }
    public String getUserBid() {
        return this.userBid;
    }

    public IdentifyCodeRequest setUserCallerParentId(Long userCallerParentId) {
        this.userCallerParentId = userCallerParentId;
        return this;
    }
    public Long getUserCallerParentId() {
        return this.userCallerParentId;
    }

    public IdentifyCodeRequest setUserCallerSecurityTransport(Boolean userCallerSecurityTransport) {
        this.userCallerSecurityTransport = userCallerSecurityTransport;
        return this;
    }
    public Boolean getUserCallerSecurityTransport() {
        return this.userCallerSecurityTransport;
    }

    public IdentifyCodeRequest setUserCallerType(String userCallerType) {
        this.userCallerType = userCallerType;
        return this;
    }
    public String getUserCallerType() {
        return this.userCallerType;
    }

    public IdentifyCodeRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public IdentifyCodeRequest setUserKp(String userKp) {
        this.userKp = userKp;
        return this;
    }
    public String getUserKp() {
        return this.userKp;
    }

    public IdentifyCodeRequest setUserMfaPresent(Boolean userMfaPresent) {
        this.userMfaPresent = userMfaPresent;
        return this;
    }
    public Boolean getUserMfaPresent() {
        return this.userMfaPresent;
    }

    public IdentifyCodeRequest setUserSecurityToken(String userSecurityToken) {
        this.userSecurityToken = userSecurityToken;
        return this;
    }
    public String getUserSecurityToken() {
        return this.userSecurityToken;
    }

}
