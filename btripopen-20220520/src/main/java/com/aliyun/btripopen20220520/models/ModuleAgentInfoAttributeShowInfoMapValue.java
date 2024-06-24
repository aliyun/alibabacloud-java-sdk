// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ModuleAgentInfoAttributeShowInfoMapValue extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FIRST_BAGGAGE</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("name")
    public String name;

    @NameInMap("text")
    public String text;

    public static ModuleAgentInfoAttributeShowInfoMapValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleAgentInfoAttributeShowInfoMapValue self = new ModuleAgentInfoAttributeShowInfoMapValue();
        return TeaModel.build(map, self);
    }

    public ModuleAgentInfoAttributeShowInfoMapValue setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModuleAgentInfoAttributeShowInfoMapValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModuleAgentInfoAttributeShowInfoMapValue setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
