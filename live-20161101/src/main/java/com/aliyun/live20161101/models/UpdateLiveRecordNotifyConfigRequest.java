// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveRecordNotifyConfigRequest extends TeaModel {
    /**
     * <p>The main streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Specifies whether to enable callbacks for recording status. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedStatusNotify")
    public Boolean needStatusNotify;

    @NameInMap("NotifyAuthKey")
    public String notifyAuthKey;

    @NameInMap("NotifyReqAuth")
    public Boolean notifyReqAuth;

    /**
     * <p>The callback URL that is used to receive notifications about recording events and status.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The URL must start with <code>http://</code> or <code>https://</code>.</p>
     * </li>
     * <li><p>You must use URLEncoder for encoding. This way, the system can identify Chinese characters, spaces, and special characters.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://learn.aliyundoc.com/examplecallback.action">http://learn.aliyundoc.com/examplecallback.action</a></p>
     */
    @NameInMap("NotifyUrl")
    public String notifyUrl;

    /**
     * <p>The callback URL for on-demand recordings.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The URL must start with <code>http://</code> or <code>https://</code>.</p>
     * </li>
     * <li><p>You must use URLEncoder for encoding. This way, the system can identify Chinese characters, spaces, and special characters.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="http://guide.aliyundoc.com/ondemandcallback.action">http://guide.aliyundoc.com/ondemandcallback.action</a></p>
     */
    @NameInMap("OnDemandUrl")
    public String onDemandUrl;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static UpdateLiveRecordNotifyConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveRecordNotifyConfigRequest self = new UpdateLiveRecordNotifyConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveRecordNotifyConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateLiveRecordNotifyConfigRequest setNeedStatusNotify(Boolean needStatusNotify) {
        this.needStatusNotify = needStatusNotify;
        return this;
    }
    public Boolean getNeedStatusNotify() {
        return this.needStatusNotify;
    }

    public UpdateLiveRecordNotifyConfigRequest setNotifyAuthKey(String notifyAuthKey) {
        this.notifyAuthKey = notifyAuthKey;
        return this;
    }
    public String getNotifyAuthKey() {
        return this.notifyAuthKey;
    }

    public UpdateLiveRecordNotifyConfigRequest setNotifyReqAuth(Boolean notifyReqAuth) {
        this.notifyReqAuth = notifyReqAuth;
        return this;
    }
    public Boolean getNotifyReqAuth() {
        return this.notifyReqAuth;
    }

    public UpdateLiveRecordNotifyConfigRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public UpdateLiveRecordNotifyConfigRequest setOnDemandUrl(String onDemandUrl) {
        this.onDemandUrl = onDemandUrl;
        return this;
    }
    public String getOnDemandUrl() {
        return this.onDemandUrl;
    }

    public UpdateLiveRecordNotifyConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateLiveRecordNotifyConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
