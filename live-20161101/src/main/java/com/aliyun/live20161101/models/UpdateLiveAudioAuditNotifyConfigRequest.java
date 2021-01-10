// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveAudioAuditNotifyConfigRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Callback")
    public String callback;

    @NameInMap("CallbackTemplate")
    public String callbackTemplate;

    public static UpdateLiveAudioAuditNotifyConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveAudioAuditNotifyConfigRequest self = new UpdateLiveAudioAuditNotifyConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveAudioAuditNotifyConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateLiveAudioAuditNotifyConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
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

}
