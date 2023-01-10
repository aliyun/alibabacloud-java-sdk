// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListFunctionsRequest extends TeaModel {
    // The maximum number of resources to return. Default value: 20. Maximum value: 100. The number of returned resources is less than or equal to the specified number.
    @NameInMap("limit")
    public Integer limit;

    // The token required to obtain more results. If the number of resources exceeds the limit, the nextToken parameter is returned. You can include the parameter in subsequent calls to obtain more results. You do not need to provide this parameter in the first call.
    @NameInMap("nextToken")
    public String nextToken;

    // The prefix that the names of returned resources must contain.
    @NameInMap("prefix")
    public String prefix;

    // The version or alias of the service.
    @NameInMap("qualifier")
    public String qualifier;

    // The returned resources are sorted in alphabetical order, and the resources that include and follow the resource specified by the startKey parameter are returned.
    @NameInMap("startKey")
    public String startKey;

    public static ListFunctionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionsRequest self = new ListFunctionsRequest();
        return TeaModel.build(map, self);
    }

    public ListFunctionsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListFunctionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListFunctionsRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public ListFunctionsRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public ListFunctionsRequest setStartKey(String startKey) {
        this.startKey = startKey;
        return this;
    }
    public String getStartKey() {
        return this.startKey;
    }

}
