// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ModifyDcdnWafGroupRequest extends TeaModel {
    /**
     * <p>The ID of the custom WAF rule group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30000110</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The name of the custom WAF rule group.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The incremental modifications of the rules in the custom WAF rule group. The value is a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;All\&quot;:false,\&quot;Op\&quot;:\&quot;del\&quot;,\&quot;List\&quot;:\&quot;900109\&quot;}</p>
     */
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
