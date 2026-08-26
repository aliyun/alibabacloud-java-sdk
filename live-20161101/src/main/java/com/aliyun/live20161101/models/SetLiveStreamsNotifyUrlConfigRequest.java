// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveStreamsNotifyUrlConfigRequest extends TeaModel {
    /**
     * <p>The ingest domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The callback URL for exception events.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://4a7e5f08.r37.cpolar.top/live/Rsssd/call-back/streamStart">https://4a7e5f08.r37.cpolar.top/live/Rsssd/call-back/streamStart</a></p>
     */
    @NameInMap("ExceptionNotifyUrl")
    public String exceptionNotifyUrl;

    /**
     * <p>The authentication key.</p>
     * <blockquote>
     * <p>This parameter is required when the NotifyReqAuth request parameter is set to <strong>yes</strong>.</p>
     * </blockquote>
     * <p>Value requirements:</p>
     * <ul>
     * <li><p>16 to 64 characters in length.</p>
     * </li>
     * <li><p>Supports uppercase letters, lowercase letters, and digits.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("NotifyAuthKey")
    public String notifyAuthKey;

    /**
     * <p>Specifies whether to enable authentication. Valid values:</p>
     * <ul>
     * <li><strong>yes</strong>: Enabled. If you set this parameter to <strong>yes</strong>, you must also set the NotifyAuthKey request parameter.</li>
     * <li><strong>no</strong>: Disabled.</li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is not specified, the default value is <strong>no</strong>.</p>
     * </blockquote>
     * <p>For the authentication logic, see <strong>Stream ingest callback authentication description</strong> below.</p>
     * 
     * <strong>example:</strong>
     * <p>yes</p>
     */
    @NameInMap("NotifyReqAuth")
    public String notifyReqAuth;

    /**
     * <p>The URL to which live stream information is pushed.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://guide.aliyundoc.com/notify">http://guide.aliyundoc.com/notify</a></p>
     */
    @NameInMap("NotifyUrl")
    public String notifyUrl;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The callback URL for stream switching information.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://guide.aliyundoc.com/switchnotify">http://guide.aliyundoc.com/switchnotify</a></p>
     */
    @NameInMap("SwitchNotifyUrl")
    public String switchNotifyUrl;

    public static SetLiveStreamsNotifyUrlConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLiveStreamsNotifyUrlConfigRequest self = new SetLiveStreamsNotifyUrlConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetLiveStreamsNotifyUrlConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetLiveStreamsNotifyUrlConfigRequest setExceptionNotifyUrl(String exceptionNotifyUrl) {
        this.exceptionNotifyUrl = exceptionNotifyUrl;
        return this;
    }
    public String getExceptionNotifyUrl() {
        return this.exceptionNotifyUrl;
    }

    public SetLiveStreamsNotifyUrlConfigRequest setNotifyAuthKey(String notifyAuthKey) {
        this.notifyAuthKey = notifyAuthKey;
        return this;
    }
    public String getNotifyAuthKey() {
        return this.notifyAuthKey;
    }

    public SetLiveStreamsNotifyUrlConfigRequest setNotifyReqAuth(String notifyReqAuth) {
        this.notifyReqAuth = notifyReqAuth;
        return this;
    }
    public String getNotifyReqAuth() {
        return this.notifyReqAuth;
    }

    public SetLiveStreamsNotifyUrlConfigRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public SetLiveStreamsNotifyUrlConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetLiveStreamsNotifyUrlConfigRequest setSwitchNotifyUrl(String switchNotifyUrl) {
        this.switchNotifyUrl = switchNotifyUrl;
        return this;
    }
    public String getSwitchNotifyUrl() {
        return this.switchNotifyUrl;
    }

}
