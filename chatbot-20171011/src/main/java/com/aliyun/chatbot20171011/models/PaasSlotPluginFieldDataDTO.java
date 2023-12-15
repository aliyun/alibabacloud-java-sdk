// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class PaasSlotPluginFieldDataDTO extends TeaModel {
    @NameInMap("ContentSlot")
    public java.util.List<PaasSlotConfigDTO> contentSlot;

    @NameInMap("IntentId")
    public String intentId;

    @NameInMap("IntentName")
    public String intentName;

    @NameInMap("IsSysIntent")
    public Boolean isSysIntent;

    @NameInMap("Name")
    public String name;

    public static PaasSlotPluginFieldDataDTO build(java.util.Map<String, ?> map) throws Exception {
        PaasSlotPluginFieldDataDTO self = new PaasSlotPluginFieldDataDTO();
        return TeaModel.build(map, self);
    }

    public PaasSlotPluginFieldDataDTO setContentSlot(java.util.List<PaasSlotConfigDTO> contentSlot) {
        this.contentSlot = contentSlot;
        return this;
    }
    public java.util.List<PaasSlotConfigDTO> getContentSlot() {
        return this.contentSlot;
    }

    public PaasSlotPluginFieldDataDTO setIntentId(String intentId) {
        this.intentId = intentId;
        return this;
    }
    public String getIntentId() {
        return this.intentId;
    }

    public PaasSlotPluginFieldDataDTO setIntentName(String intentName) {
        this.intentName = intentName;
        return this;
    }
    public String getIntentName() {
        return this.intentName;
    }

    public PaasSlotPluginFieldDataDTO setIsSysIntent(Boolean isSysIntent) {
        this.isSysIntent = isSysIntent;
        return this;
    }
    public Boolean getIsSysIntent() {
        return this.isSysIntent;
    }

    public PaasSlotPluginFieldDataDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
