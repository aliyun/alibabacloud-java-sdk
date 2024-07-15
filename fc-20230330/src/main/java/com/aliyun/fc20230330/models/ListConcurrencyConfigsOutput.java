// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListConcurrencyConfigsOutput extends TeaModel {
    @NameInMap("configs")
    public java.util.List<ConcurrencyConfig> configs;

    /**
     * <strong>example:</strong>
     * <p>next_token</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListConcurrencyConfigsOutput build(java.util.Map<String, ?> map) throws Exception {
        ListConcurrencyConfigsOutput self = new ListConcurrencyConfigsOutput();
        return TeaModel.build(map, self);
    }

    public ListConcurrencyConfigsOutput setConfigs(java.util.List<ConcurrencyConfig> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<ConcurrencyConfig> getConfigs() {
        return this.configs;
    }

    public ListConcurrencyConfigsOutput setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
