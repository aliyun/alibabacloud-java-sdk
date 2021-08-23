// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class PaasSlotPluginFieldDataDTO extends TeaModel {
    // IntentName
    @NameInMap("IntentName")
    public String intentName;

    // IntentId
    @NameInMap("IntentId")
    public String intentId;

    // Name
    @NameInMap("Name")
    public String name;

    // IsSysIntent
    @NameInMap("IsSysIntent")
    public Boolean isSysIntent;

    // ContentSlot
    @NameInMap("ContentSlot")
    public java.util.List<PaasSlotConfigDTO> contentSlot;

    public static PaasSlotPluginFieldDataDTO build(java.util.Map<String, ?> map) throws Exception {
        PaasSlotPluginFieldDataDTO self = new PaasSlotPluginFieldDataDTO();
        return TeaModel.build(map, self);
    }

    public PaasSlotPluginFieldDataDTO setIntentName(String intentName) {
        this.intentName = intentName;
        return this;
    }
    public String getIntentName() {
        return this.intentName;
    }

    public PaasSlotPluginFieldDataDTO setIntentId(String intentId) {
        this.intentId = intentId;
        return this;
    }
    public String getIntentId() {
        return this.intentId;
    }

    public PaasSlotPluginFieldDataDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PaasSlotPluginFieldDataDTO setIsSysIntent(Boolean isSysIntent) {
        this.isSysIntent = isSysIntent;
        return this;
    }
    public Boolean getIsSysIntent() {
        return this.isSysIntent;
    }

    public PaasSlotPluginFieldDataDTO setContentSlot(java.util.List<PaasSlotConfigDTO> contentSlot) {
        this.contentSlot = contentSlot;
        return this;
    }
    public java.util.List<PaasSlotConfigDTO> getContentSlot() {
        return this.contentSlot;
    }

}
