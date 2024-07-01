// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ModuleAgentInfosAttributeShowInfoMapValue extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("name")
    public String name;

    @NameInMap("text")
    public String text;

    public static ModuleAgentInfosAttributeShowInfoMapValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleAgentInfosAttributeShowInfoMapValue self = new ModuleAgentInfosAttributeShowInfoMapValue();
        return TeaModel.build(map, self);
    }

    public ModuleAgentInfosAttributeShowInfoMapValue setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModuleAgentInfosAttributeShowInfoMapValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModuleAgentInfosAttributeShowInfoMapValue setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
