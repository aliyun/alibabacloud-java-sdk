// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DataBonreeSDKConfigModuleConfigVersionConfigsValueCustomConfigValue extends TeaModel {
    /**
     * <p>Indicates whether the configuration is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    public static DataBonreeSDKConfigModuleConfigVersionConfigsValueCustomConfigValue build(java.util.Map<String, ?> map) throws Exception {
        DataBonreeSDKConfigModuleConfigVersionConfigsValueCustomConfigValue self = new DataBonreeSDKConfigModuleConfigVersionConfigsValueCustomConfigValue();
        return TeaModel.build(map, self);
    }

    public DataBonreeSDKConfigModuleConfigVersionConfigsValueCustomConfigValue setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

}
