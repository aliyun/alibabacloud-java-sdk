// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListOnDemandConfigsResponseBody extends TeaModel {
    // The information about the provisioned configuration.
    @NameInMap("configs")
    public java.util.List<OnDemandConfig> configs;

    // The token used to obtain more results. If this parameter is left empty, all the results are returned.
    @NameInMap("nextToken")
    public String nextToken;

    public static ListOnDemandConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOnDemandConfigsResponseBody self = new ListOnDemandConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOnDemandConfigsResponseBody setConfigs(java.util.List<OnDemandConfig> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<OnDemandConfig> getConfigs() {
        return this.configs;
    }

    public ListOnDemandConfigsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
