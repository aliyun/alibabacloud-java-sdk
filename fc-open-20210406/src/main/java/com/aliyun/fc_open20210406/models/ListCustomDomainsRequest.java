// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListCustomDomainsRequest extends TeaModel {
    // The maximum number of resources to return. Default value: 20. Maximum value: 100. The number of returned resources is less than or equal to the specified number.
    @NameInMap("limit")
    public Integer limit;

    // The token used to obtain more results. If the number of resources exceeds the limit, the nextToken parameter is returned. You can include the parameter in subsequent calls to obtain more results. You do not need to provide this parameter in the first call.
    @NameInMap("nextToken")
    public String nextToken;

    // The prefix that the returned domain names must contain.
    @NameInMap("prefix")
    public String prefix;

    // The returned resources are sorted in alphabetical order, and the resources that include and follow the resource specified by the startKey parameter are returned.
    @NameInMap("startKey")
    public String startKey;

    public static ListCustomDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCustomDomainsRequest self = new ListCustomDomainsRequest();
        return TeaModel.build(map, self);
    }

    public ListCustomDomainsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListCustomDomainsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCustomDomainsRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public ListCustomDomainsRequest setStartKey(String startKey) {
        this.startKey = startKey;
        return this;
    }
    public String getStartKey() {
        return this.startKey;
    }

}
