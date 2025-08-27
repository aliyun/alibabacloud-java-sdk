// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListElasticConfigsOutput extends TeaModel {
    @NameInMap("elasticConfigs")
    public java.util.List<ElasticConfigStatus> elasticConfigs;

    @NameInMap("nextToken")
    public String nextToken;

    public static ListElasticConfigsOutput build(java.util.Map<String, ?> map) throws Exception {
        ListElasticConfigsOutput self = new ListElasticConfigsOutput();
        return TeaModel.build(map, self);
    }

    public ListElasticConfigsOutput setElasticConfigs(java.util.List<ElasticConfigStatus> elasticConfigs) {
        this.elasticConfigs = elasticConfigs;
        return this;
    }
    public java.util.List<ElasticConfigStatus> getElasticConfigs() {
        return this.elasticConfigs;
    }

    public ListElasticConfigsOutput setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
