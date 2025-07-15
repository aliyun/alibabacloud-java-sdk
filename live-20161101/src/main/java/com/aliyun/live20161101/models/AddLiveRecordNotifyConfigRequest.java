// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveRecordNotifyConfigRequest extends TeaModel {
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
     * <li>true: enables callbacks for recording status. If you set this parameter to <strong>true</strong>, an example of recording status callback is returned.</li>
     * <li>false (default): disables callbacks for recording status.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedStatusNotify")
    public Boolean needStatusNotify;

    /**
     * <p>The callback URL that is used to receive notifications about recording events and status.</p>
     * <blockquote>
     * <p> The URL must start with <code>http://</code> or <code>https://</code>. For more information, see <a href="https://help.aliyun.com/document_detail/55016.html">Callbacks for live stream recording</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://demo.aliyundoc.com/examplecallback.action">http://demo.aliyundoc.com/examplecallback.action</a></p>
     */
    @NameInMap("NotifyUrl")
    public String notifyUrl;

    /**
     * <p>The callback URL for on-demand recordings.</p>
     * <blockquote>
     * <p> The URL must start with <code>http://</code> or <code>https://</code>. For more information, see <a href="https://help.aliyun.com/document_detail/85910.html">On-demand recording</a>.</p>
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
