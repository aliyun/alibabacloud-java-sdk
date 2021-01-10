// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveAudioAuditNotifyConfigRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Callback")
    public String callback;

    @NameInMap("CallbackTemplate")
    public String callbackTemplate;

    public static AddLiveAudioAuditNotifyConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLiveAudioAuditNotifyConfigRequest self = new AddLiveAudioAuditNotifyConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddLiveAudioAuditNotifyConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddLiveAudioAuditNotifyConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
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

}
