// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class PaasEntryDTO extends TeaModel {
    @NameInMap("PluginFieldDataEntry")
    public PaasEntryPluginFieldDataDTO pluginFieldDataEntry;

    public static PaasEntryDTO build(java.util.Map<String, ?> map) throws Exception {
        PaasEntryDTO self = new PaasEntryDTO();
        return TeaModel.build(map, self);
    }

    public PaasEntryDTO setPluginFieldDataEntry(PaasEntryPluginFieldDataDTO pluginFieldDataEntry) {
        this.pluginFieldDataEntry = pluginFieldDataEntry;
        return this;
    }
    public PaasEntryPluginFieldDataDTO getPluginFieldDataEntry() {
        return this.pluginFieldDataEntry;
    }

}
