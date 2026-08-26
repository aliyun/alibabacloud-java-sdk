// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveRecordNotifyConfigRequest extends TeaModel {
    /**
     * <p>The streamer streaming domain.</p>
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
     * <li>true: Required. If NeedStatusNotify is set to <strong>true</strong>, the response includes a recording status callback example.</li>
     * <li>false (default): Not required.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedStatusNotify")
    public Boolean needStatusNotify;

    /**
     * <p>The callback authentication key. The key must be 16 to 32 characters in length and can contain only letters and digits.</p>
     * <blockquote>
     * <p>This parameter is required when the NotifyReqAuth parameter is set to true.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>chenhuanxin249088</p>
     */
    @NameInMap("NotifyAuthKey")
    public String notifyAuthKey;

    /**
     * <p>Specifies whether to enable callback authentication. Valid values:</p>
     * <ul>
     * <li><p>true: Enabled.</p>
     * </li>
     * <li><p>false (default): Disabled.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>When this parameter is set to true, the NotifyAuthKey parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NotifyReqAuth")
    public Boolean notifyReqAuth;

    /**
     * <p>The callback URL for recording events and status callbacks.</p>
     * <blockquote>
     * <p>The URL must start with <code>http://</code> or <code>https://</code>. For more information, see <a href="https://help.aliyun.com/document_detail/55016.html">Recording event callback</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://demo.aliyundoc.com/examplecallback.action">http://demo.aliyundoc.com/examplecallback.action</a></p>
     */
    @NameInMap("NotifyUrl")
    public String notifyUrl;

    /**
     * <p>The callback URL for on-demand recording.</p>
     * <blockquote>
     * <p>The URL must start with <code>http://</code> or <code>https://</code>. For more information, see <a href="https://help.aliyun.com/document_detail/85910.html">On-demand recording callback</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://learn.aliyundoc.com/ondemandcallback.action">http://learn.aliyundoc.com/ondemandcallback.action</a></p>
     */
    @NameInMap("OnDemandUrl")
    public String onDemandUrl;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static AddLiveRecordNotifyConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLiveRecordNotifyConfigRequest self = new AddLiveRecordNotifyConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddLiveRecordNotifyConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddLiveRecordNotifyConfigRequest setNeedStatusNotify(Boolean needStatusNotify) {
        this.needStatusNotify = needStatusNotify;
        return this;
    }
    public Boolean getNeedStatusNotify() {
        return this.needStatusNotify;
    }

    public AddLiveRecordNotifyConfigRequest setNotifyAuthKey(String notifyAuthKey) {
        this.notifyAuthKey = notifyAuthKey;
        return this;
    }
    public String getNotifyAuthKey() {
        return this.notifyAuthKey;
    }

    public AddLiveRecordNotifyConfigRequest setNotifyReqAuth(Boolean notifyReqAuth) {
        this.notifyReqAuth = notifyReqAuth;
        return this;
    }
    public Boolean getNotifyReqAuth() {
        return this.notifyReqAuth;
    }

    public AddLiveRecordNotifyConfigRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public AddLiveRecordNotifyConfigRequest setOnDemandUrl(String onDemandUrl) {
        this.onDemandUrl = onDemandUrl;
        return this;
    }
    public String getOnDemandUrl() {
        return this.onDemandUrl;
    }

    public AddLiveRecordNotifyConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddLiveRecordNotifyConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
