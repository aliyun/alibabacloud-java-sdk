// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveAudioAuditNotifyConfigRequest extends TeaModel {
    /**
     * <p>The webhook URL for receiving callback notifications about audio that contains violations.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://guide.aliyundoc.com/callback">http://guide.aliyundoc.com/callback</a></p>
     */
    @NameInMap("Callback")
    public String callback;

    /**
     * <p>The callback template for automated review. The value can contain the following variables:</p>
     * <ul>
     * <li><p><strong>{DomainName}</strong>: The streaming domain.</p>
     * </li>
     * <li><p><strong>{AppName}</strong>: The AppName of the stream.</p>
     * </li>
     * <li><p><strong>{StreamName}</strong>: The stream name.</p>
     * </li>
     * <li><p><strong>{Timestamp}</strong>: The UNIX timestamp when the callback is generated. Unit: seconds.</p>
     * </li>
     * <li><p><strong>{Result}</strong>: The detection result.</p>
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

    public static UpdateLiveAudioAuditNotifyConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveAudioAuditNotifyConfigRequest self = new UpdateLiveAudioAuditNotifyConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveAudioAuditNotifyConfigRequest setCallback(String callback) {
        this.callback = callback;
        return this;
    }
    public String getCallback() {
        return this.callback;
    }

    public UpdateLiveAudioAuditNotifyConfigRequest setCallbackTemplate(String callbackTemplate) {
        this.callbackTemplate = callbackTemplate;
        return this;
    }
    public String getCallbackTemplate() {
        return this.callbackTemplate;
    }

    public UpdateLiveAudioAuditNotifyConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateLiveAudioAuditNotifyConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateLiveAudioAuditNotifyConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
