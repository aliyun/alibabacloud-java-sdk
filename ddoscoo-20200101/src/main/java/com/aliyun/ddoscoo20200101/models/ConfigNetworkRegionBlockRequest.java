// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigNetworkRegionBlockRequest extends TeaModel {
    @NameInMap("Config")
    public String config;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ConfigNetworkRegionBlockRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigNetworkRegionBlockRequest self = new ConfigNetworkRegionBlockRequest();
        return TeaModel.build(map, self);
    }

    public ConfigNetworkRegionBlockRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ConfigNetworkRegionBlockRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
