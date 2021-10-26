// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListCustomDomainsRequest extends TeaModel {
    @NameInMap("limit")
    public Integer limit;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("prefix")
    public String prefix;

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
