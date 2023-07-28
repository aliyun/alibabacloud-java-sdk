// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ModifyDcdnWafGroupRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("Name")
    public String name;

    @NameInMap("Rules")
    public String rules;

    public static ModifyDcdnWafGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDcdnWafGroupRequest self = new ModifyDcdnWafGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDcdnWafGroupRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ModifyDcdnWafGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyDcdnWafGroupRequest setRules(String rules) {
        this.rules = rules;
        return this;
    }
    public String getRules() {
        return this.rules;
    }

}
