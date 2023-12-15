// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class PaasButtonDTO extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Text")
    public String text;

    @NameInMap("Type")
    public String type;

    public static PaasButtonDTO build(java.util.Map<String, ?> map) throws Exception {
        PaasButtonDTO self = new PaasButtonDTO();
        return TeaModel.build(map, self);
    }

    public PaasButtonDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PaasButtonDTO setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public PaasButtonDTO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
