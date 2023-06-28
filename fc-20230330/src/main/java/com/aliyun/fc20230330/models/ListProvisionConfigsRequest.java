// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListProvisionConfigsRequest extends TeaModel {
    @NameInMap("functionName")
    public String functionName;

    @NameInMap("limit")
    public Integer limit;

    @NameInMap("nextToken")
    public String nextToken;

    public static ListProvisionConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProvisionConfigsRequest self = new ListProvisionConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListProvisionConfigsRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public ListProvisionConfigsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListProvisionConfigsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
