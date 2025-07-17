// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DataBonreeSDKConfigModuleConfigVersionConfigsValue extends TeaModel {
    /**
     * <p>Indicates whether the custom configuration is used.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("useCustom")
    public Boolean useCustom;

    /**
     * <p>The custom configuration.</p>
     */
    @NameInMap("customConfig")
    public java.util.Map<String, DataBonreeSDKConfigModuleConfigVersionConfigsValueCustomConfigValue> customConfig;

    /**
     * <p>The description of the version configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The time when the version configuration was updated.</p>
     * 
     * <strong>example:</strong>
     * <p>1721112372055</p>
     */
    @NameInMap("updateTime")
    public Long updateTime;

    public static DataBonreeSDKConfigModuleConfigVersionConfigsValue build(java.util.Map<String, ?> map) throws Exception {
        DataBonreeSDKConfigModuleConfigVersionConfigsValue self = new DataBonreeSDKConfigModuleConfigVersionConfigsValue();
        return TeaModel.build(map, self);
    }

    public DataBonreeSDKConfigModuleConfigVersionConfigsValue setUseCustom(Boolean useCustom) {
        this.useCustom = useCustom;
        return this;
    }
    public Boolean getUseCustom() {
        return this.useCustom;
    }

    public DataBonreeSDKConfigModuleConfigVersionConfigsValue setCustomConfig(java.util.Map<String, DataBonreeSDKConfigModuleConfigVersionConfigsValueCustomConfigValue> customConfig) {
        this.customConfig = customConfig;
        return this;
    }
    public java.util.Map<String, DataBonreeSDKConfigModuleConfigVersionConfigsValueCustomConfigValue> getCustomConfig() {
        return this.customConfig;
    }

    public DataBonreeSDKConfigModuleConfigVersionConfigsValue setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DataBonreeSDKConfigModuleConfigVersionConfigsValue setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

}
