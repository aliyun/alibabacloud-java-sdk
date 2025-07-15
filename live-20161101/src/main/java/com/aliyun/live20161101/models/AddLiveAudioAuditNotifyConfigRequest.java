// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveAudioAuditNotifyConfigRequest extends TeaModel {
    /**
     * <p>The callback URL. This URL is used to receive callback notifications about violations in audio.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://demo.aliyundoc.com/callback">https://demo.aliyundoc.com/callback</a></p>
     */
    @NameInMap("Callback")
    public String callback;

    /**
     * <p>The callback template. Valid values:</p>
     * <ul>
     * <li><strong>{DomainName}</strong>: the streaming domain.</li>
     * <li><strong>{AppName}</strong>: the name of the application to which the live stream belongs.</li>
     * <li><strong>{StreamName}</strong>: the name of the live stream.</li>
     * <li><strong>{Timestamp}</strong>: the time when the callback is returned. The value of this field is a UNIX timestamp. Unit: seconds.</li>
     * <li><strong>{Result}</strong>: the moderation results.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;domain&quot;:{DomainName},&quot;app&quot;:{AppName},&quot;stream&quot;:{StreamName},&quot;timestamp&quot;:{Timestamp},&quot;result&quot;:{Result}}</p>
     */
    @NameInMap("CallbackTemplate")
    public String callbackTemplate;

    /**
     * <p>The main streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    public static AddLiveAudioAuditNotifyConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLiveAudioAuditNotifyConfigRequest self = new AddLiveAudioAuditNotifyConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddLiveAudioAuditNotifyConfigRequest setCallback(String callback) {
        this.callback = callback;
        return this;
    }
    public String getCallback() {
        return this.callback;
    }

    public AddLiveAudioAuditNotifyConfigRequest setCallbackTemplate(String callbackTemplate) {
        this.callbackTemplate = callbackTemplate;
        return this;
    }
    public String getCallbackTemplate() {
        return this.callbackTemplate;
    }

    public AddLiveAudioAuditNotifyConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddLiveAudioAuditNotifyConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddLiveAudioAuditNotifyConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
