// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigNetworkRegionBlockRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Config")
    public String config;

    public static ConfigNetworkRegionBlockRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigNetworkRegionBlockRequest self = new ConfigNetworkRegionBlockRequest();
        return TeaModel.build(map, self);
    }

    public ConfigNetworkRegionBlockRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ConfigNetworkRegionBlockRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ConfigNetworkRegionBlockRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

}
