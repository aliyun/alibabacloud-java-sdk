// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListServicesRequest extends TeaModel {
    // The maximum number of resources to return. Default value: 20. Maximum value: 100. The number of returned configurations is less than or equal to the specified number.
    @NameInMap("limit")
    public Integer limit;

    // The starting position of the query. If this parameter is left empty, the query starts from the beginning. You do not need to specify this parameter in the first query. If the number of asynchronous tasks exceeds the limit, the nextToken parameter is returned, the value of which can be used in subsequent calls to obtain more results.
    @NameInMap("nextToken")
    public String nextToken;

    // The prefix that the names of returned resources must contain. If the name prefix is a, the names of returned resources must start with a.
    @NameInMap("prefix")
    public String prefix;

    // The returned resources are sorted in alphabetical order, and the resources that include and follow the resource specified by the startKey parameter are returned.
    @NameInMap("startKey")
    public String startKey;

    public static ListServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServicesRequest self = new ListServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListServicesRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListServicesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServicesRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public ListServicesRequest setStartKey(String startKey) {
        this.startKey = startKey;
        return this;
    }
    public String getStartKey() {
        return this.startKey;
    }

}
