// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveRecordNotifyConfigRequest extends TeaModel {
    /**
     * <p>The streaming domain of the streamer.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Specifies whether recording task status callbacks are required. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Recording task status callbacks are required.</li>
     * <li><strong>false</strong> (default): Recording task status callbacks are not required.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedStatusNotify")
    public Boolean needStatusNotify;

    /**
     * <p>The callback authentication key. The key is 16 to 32 characters in length and can contain only letters and digits.</p>
     * <blockquote>
     * <p>This parameter is required when the NotifyReqAuth parameter is set to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testkeyyourkey12</p>
     */
    @NameInMap("NotifyAuthKey")
    public String notifyAuthKey;

    /**
     * <p>Specifies whether to enable callback authentication. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: Disabled.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Default value: <strong>false</strong>. If this parameter is set to <strong>true</strong>, the NotifyAuthKey parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NotifyReqAuth")
    public Boolean notifyReqAuth;

    /**
     * <p>The callback URL for recording events, including event callbacks and status callbacks.</p>
     * <blockquote>
     * <ul>
     * <li>The URL must start with <code>http://</code> or <code>https://</code>.</li>
     * <li>To properly identify Chinese characters, spaces, and other special characters in the input, perform URL encoding.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://learn.aliyundoc.com/examplecallback.action">http://learn.aliyundoc.com/examplecallback.action</a></p>
     */
    @NameInMap("NotifyUrl")
    public String notifyUrl;

    /**
     * <p>The on-demand recording callback URL.</p>
     * <blockquote>
     * <ul>
     * <li>The URL must start with <code>http://</code> or <code>https://</code>.</li>
     * <li>To properly identify Chinese characters, spaces, and other special characters in the input, perform URL encoding.</li>
     * </ul>
     * </blockquote>
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
