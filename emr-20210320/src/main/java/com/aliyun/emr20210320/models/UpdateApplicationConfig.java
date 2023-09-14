// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class UpdateApplicationConfig extends TeaModel {
    /**
     * <p>修改描述。</p>
     */
    @NameInMap("ConfigDescription")
    public String configDescription;

    /**
     * <p>应用配置文件名。</p>
     */
    @NameInMap("ConfigFileName")
    public String configFileName;

    /**
     * <p>配置项键。</p>
     */
    @NameInMap("ConfigItemKey")
    public String configItemKey;

    /**
     * <p>配置项值。</p>
     */
    @NameInMap("ConfigItemValue")
    public String configItemValue;

    public static UpdateApplicationConfig build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationConfig self = new UpdateApplicationConfig();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationConfig setConfigDescription(String configDescription) {
        this.configDescription = configDescription;
        return this;
    }
    public String getConfigDescription() {
        return this.configDescription;
    }

    public UpdateApplicationConfig setConfigFileName(String configFileName) {
        this.configFileName = configFileName;
        return this;
    }
    public String getConfigFileName() {
        return this.configFileName;
    }

    public UpdateApplicationConfig setConfigItemKey(String configItemKey) {
        this.configItemKey = configItemKey;
        return this;
    }
    public String getConfigItemKey() {
        return this.configItemKey;
    }

    public UpdateApplicationConfig setConfigItemValue(String configItemValue) {
        this.configItemValue = configItemValue;
        return this;
    }
    public String getConfigItemValue() {
        return this.configItemValue;
    }

}
