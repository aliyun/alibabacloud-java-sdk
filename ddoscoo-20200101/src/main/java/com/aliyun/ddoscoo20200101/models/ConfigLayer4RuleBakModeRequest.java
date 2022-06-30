// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigLayer4RuleBakModeRequest extends TeaModel {
    @NameInMap("BakMode")
    public String bakMode;

    @NameInMap("Listeners")
    public String listeners;

    public static ConfigLayer4RuleBakModeRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer4RuleBakModeRequest self = new ConfigLayer4RuleBakModeRequest();
        return TeaModel.build(map, self);
    }

    public ConfigLayer4RuleBakModeRequest setBakMode(String bakMode) {
        this.bakMode = bakMode;
        return this;
    }
    public String getBakMode() {
        return this.bakMode;
    }

    public ConfigLayer4RuleBakModeRequest setListeners(String listeners) {
        this.listeners = listeners;
        return this;
    }
    public String getListeners() {
        return this.listeners;
    }

}
