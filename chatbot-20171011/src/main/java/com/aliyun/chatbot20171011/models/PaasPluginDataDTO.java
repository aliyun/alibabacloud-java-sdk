// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class PaasPluginDataDTO extends TeaModel {
    @NameInMap("Entry")
    public PaasEntryDTO entry;

    @NameInMap("Function")
    public PaasFunctionDTO function;

    @NameInMap("Response")
    public PaasResponseDTO response;

    @NameInMap("Slot")
    public PaasSlotDTO slot;

    public static PaasPluginDataDTO build(java.util.Map<String, ?> map) throws Exception {
        PaasPluginDataDTO self = new PaasPluginDataDTO();
        return TeaModel.build(map, self);
    }

    public PaasPluginDataDTO setEntry(PaasEntryDTO entry) {
        this.entry = entry;
        return this;
    }
    public PaasEntryDTO getEntry() {
        return this.entry;
    }

    public PaasPluginDataDTO setFunction(PaasFunctionDTO function) {
        this.function = function;
        return this;
    }
    public PaasFunctionDTO getFunction() {
        return this.function;
    }

    public PaasPluginDataDTO setResponse(PaasResponseDTO response) {
        this.response = response;
        return this;
    }
    public PaasResponseDTO getResponse() {
        return this.response;
    }

    public PaasPluginDataDTO setSlot(PaasSlotDTO slot) {
        this.slot = slot;
        return this;
    }
    public PaasSlotDTO getSlot() {
        return this.slot;
    }

}
