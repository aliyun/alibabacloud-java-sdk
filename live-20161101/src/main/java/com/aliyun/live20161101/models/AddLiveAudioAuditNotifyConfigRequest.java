// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveAudioAuditNotifyConfigRequest extends TeaModel {
    /**
     * <p>The URL used to receive callbacks for audio that contains problematic content.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://demo.aliyundoc.com/callback">https://demo.aliyundoc.com/callback</a></p>
     */
    @NameInMap("Callback")
    public String callback;

    /**
     * <p>The callback template for automated reviews. The value is a JSON string that can contain the following variables:</p>
     * <ul>
     * <li><p><strong>{DomainName}</strong>: The streaming domain.</p>
     * </li>
     * <li><p><strong>{AppName}</strong>: The AppName of the live stream.</p>
     * </li>
     * <li><p><strong>{StreamName}</strong>: The stream name.</p>
     * </li>
     * <li><p><strong>{Timestamp}</strong>: The UNIX timestamp of the callback. Unit: seconds.</p>
     * </li>
     * <li><p><strong>{Result}</strong>: The review result.</p>
     * </li>
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

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
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
