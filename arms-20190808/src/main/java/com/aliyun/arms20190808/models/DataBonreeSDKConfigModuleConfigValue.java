// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DataBonreeSDKConfigModuleConfigValue extends TeaModel {
    @NameInMap("enable")
    public Boolean enable;

    public static DataBonreeSDKConfigModuleConfigValue build(java.util.Map<String, ?> map) throws Exception {
        DataBonreeSDKConfigModuleConfigValue self = new DataBonreeSDKConfigModuleConfigValue();
        return TeaModel.build(map, self);
    }

    public DataBonreeSDKConfigModuleConfigValue setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

}
