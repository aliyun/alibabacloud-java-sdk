// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListConcurrencyConfigsRequest extends TeaModel {
    @NameInMap("functionName")
    public String functionName;

    @NameInMap("limit")
    public Integer limit;

    @NameInMap("nextToken")
    public String nextToken;

    public static ListConcurrencyConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConcurrencyConfigsRequest self = new ListConcurrencyConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListConcurrencyConfigsRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public ListConcurrencyConfigsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListConcurrencyConfigsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
