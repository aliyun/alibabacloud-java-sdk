// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class ConfigAppRequest extends TeaModel {
    @NameInMap("AppIds")
    public String appIds;

    @NameInMap("Enable")
    public String enable;

    @NameInMap("RegionId")
    public String regionId;

    public static ConfigAppRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigAppRequest self = new ConfigAppRequest();
        return TeaModel.build(map, self);
    }

    public ConfigAppRequest setAppIds(String appIds) {
        this.appIds = appIds;
        return this;
    }
    public String getAppIds() {
        return this.appIds;
    }

    public ConfigAppRequest setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public ConfigAppRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
