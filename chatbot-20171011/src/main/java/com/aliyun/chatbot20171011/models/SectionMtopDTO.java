// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class SectionMtopDTO extends TeaModel {
    // SlotId
    @NameInMap("SlotId")
    public String slotId;

    // Text
    @NameInMap("Text")
    public String text;

    public static SectionMtopDTO build(java.util.Map<String, ?> map) throws Exception {
        SectionMtopDTO self = new SectionMtopDTO();
        return TeaModel.build(map, self);
    }

    public SectionMtopDTO setSlotId(String slotId) {
        this.slotId = slotId;
        return this;
    }
    public String getSlotId() {
        return this.slotId;
    }

    public SectionMtopDTO setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
