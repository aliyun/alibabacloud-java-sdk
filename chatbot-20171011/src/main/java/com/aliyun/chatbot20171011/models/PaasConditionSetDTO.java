// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class PaasConditionSetDTO extends TeaModel {
    @NameInMap("ConditionEntries")
    public java.util.List<PaasConditionEntryDTO> conditionEntries;

    public static PaasConditionSetDTO build(java.util.Map<String, ?> map) throws Exception {
        PaasConditionSetDTO self = new PaasConditionSetDTO();
        return TeaModel.build(map, self);
    }

    public PaasConditionSetDTO setConditionEntries(java.util.List<PaasConditionEntryDTO> conditionEntries) {
        this.conditionEntries = conditionEntries;
        return this;
    }
    public java.util.List<PaasConditionEntryDTO> getConditionEntries() {
        return this.conditionEntries;
    }

}
