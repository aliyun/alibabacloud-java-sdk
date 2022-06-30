// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigNetworkRulesRequest extends TeaModel {
    @NameInMap("NetworkRules")
    public String networkRules;

    public static ConfigNetworkRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigNetworkRulesRequest self = new ConfigNetworkRulesRequest();
        return TeaModel.build(map, self);
    }

    public ConfigNetworkRulesRequest setNetworkRules(String networkRules) {
        this.networkRules = networkRules;
        return this;
    }
    public String getNetworkRules() {
        return this.networkRules;
    }

}
