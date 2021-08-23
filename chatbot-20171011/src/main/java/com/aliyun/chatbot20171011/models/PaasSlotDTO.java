// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class PaasSlotDTO extends TeaModel {
    @NameInMap("PluginFieldDataSlot")
    public PaasSlotPluginFieldDataDTO pluginFieldDataSlot;

    public static PaasSlotDTO build(java.util.Map<String, ?> map) throws Exception {
        PaasSlotDTO self = new PaasSlotDTO();
        return TeaModel.build(map, self);
    }

    public PaasSlotDTO setPluginFieldDataSlot(PaasSlotPluginFieldDataDTO pluginFieldDataSlot) {
        this.pluginFieldDataSlot = pluginFieldDataSlot;
        return this;
    }
    public PaasSlotPluginFieldDataDTO getPluginFieldDataSlot() {
        return this.pluginFieldDataSlot;
    }

}
