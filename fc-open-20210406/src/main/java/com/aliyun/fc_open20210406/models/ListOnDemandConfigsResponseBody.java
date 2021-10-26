// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListOnDemandConfigsResponseBody extends TeaModel {
    // 预留实例配置
    @NameInMap("configs")
    public java.util.List<OnDemandConfig> configs;

    // 用来返回更多的查询结果。如果这个值没有返回，则说明没有更多结果。
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
