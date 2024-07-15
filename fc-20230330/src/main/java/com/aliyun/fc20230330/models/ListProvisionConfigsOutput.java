// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListProvisionConfigsOutput extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>next_token</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("provisionConfigs")
    public java.util.List<ProvisionConfig> provisionConfigs;

    public static ListProvisionConfigsOutput build(java.util.Map<String, ?> map) throws Exception {
        ListProvisionConfigsOutput self = new ListProvisionConfigsOutput();
        return TeaModel.build(map, self);
    }

    public ListProvisionConfigsOutput setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListProvisionConfigsOutput setProvisionConfigs(java.util.List<ProvisionConfig> provisionConfigs) {
        this.provisionConfigs = provisionConfigs;
        return this;
    }
    public java.util.List<ProvisionConfig> getProvisionConfigs() {
        return this.provisionConfigs;
    }

}
