// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class PaasEntryPluginFieldDataDTO extends TeaModel {
    @NameInMap("ContentEntry")
    public java.util.List<PaasConditionSetDTO> contentEntry;

    @NameInMap("LifeSpan")
    public Long lifeSpan;

    @NameInMap("Name")
    public String name;

    public static PaasEntryPluginFieldDataDTO build(java.util.Map<String, ?> map) throws Exception {
        PaasEntryPluginFieldDataDTO self = new PaasEntryPluginFieldDataDTO();
        return TeaModel.build(map, self);
    }

    public PaasEntryPluginFieldDataDTO setContentEntry(java.util.List<PaasConditionSetDTO> contentEntry) {
        this.contentEntry = contentEntry;
        return this;
    }
    public java.util.List<PaasConditionSetDTO> getContentEntry() {
        return this.contentEntry;
    }

    public PaasEntryPluginFieldDataDTO setLifeSpan(Long lifeSpan) {
        this.lifeSpan = lifeSpan;
        return this;
    }
    public Long getLifeSpan() {
        return this.lifeSpan;
    }

    public PaasEntryPluginFieldDataDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
