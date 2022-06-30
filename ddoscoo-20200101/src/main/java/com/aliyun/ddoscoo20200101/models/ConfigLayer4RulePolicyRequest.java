// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigLayer4RulePolicyRequest extends TeaModel {
    @NameInMap("Listeners")
    public String listeners;

    public static ConfigLayer4RulePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer4RulePolicyRequest self = new ConfigLayer4RulePolicyRequest();
        return TeaModel.build(map, self);
    }

    public ConfigLayer4RulePolicyRequest setListeners(String listeners) {
        this.listeners = listeners;
        return this;
    }
    public String getListeners() {
        return this.listeners;
    }

}
