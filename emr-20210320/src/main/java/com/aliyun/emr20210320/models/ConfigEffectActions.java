// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ConfigEffectActions extends TeaModel {
    /**
     * <p>配置生效动作。</p>
     */
    @NameInMap("ConfigEffectAction")
    public String configEffectAction;

    /**
     * <p>配置生效配置文件。</p>
     */
    @NameInMap("ConfigFiles")
    public java.util.List<String> configFiles;

    public static ConfigEffectActions build(java.util.Map<String, ?> map) throws Exception {
        ConfigEffectActions self = new ConfigEffectActions();
        return TeaModel.build(map, self);
    }

    public ConfigEffectActions setConfigEffectAction(String configEffectAction) {
        this.configEffectAction = configEffectAction;
        return this;
    }
    public String getConfigEffectAction() {
        return this.configEffectAction;
    }

    public ConfigEffectActions setConfigFiles(java.util.List<String> configFiles) {
        this.configFiles = configFiles;
        return this;
    }
    public java.util.List<String> getConfigFiles() {
        return this.configFiles;
    }

}
