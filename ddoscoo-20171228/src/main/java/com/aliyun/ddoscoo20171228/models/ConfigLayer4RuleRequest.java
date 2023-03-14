// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ConfigLayer4RuleRequest extends TeaModel {
    @NameInMap("Listeners")
    public String listeners;

    public static ConfigLayer4RuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer4RuleRequest self = new ConfigLayer4RuleRequest();
        return TeaModel.build(map, self);
    }

    public ConfigLayer4RuleRequest setListeners(String listeners) {
        this.listeners = listeners;
        return this;
    }
    public String getListeners() {
        return this.listeners;
    }

}
