// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListTriggersRequest extends TeaModel {
    // The maximum number of resources to return. Default value: 20. Maximum value: 100. The number of returned resources is less than or equal to the specified number.
    @NameInMap("limit")
    public Integer limit;

    // The token required to obtain more results. You do not need to provide this parameter in the first call. The tokens for subsequent queries are obtained from the returned results.
    @NameInMap("nextToken")
    public String nextToken;

    // The prefix that the names of returned resources must contain.
    @NameInMap("prefix")
    public String prefix;

    // The returned resources are sorted in alphabetical order, and the resources that include and follow the resource specified by the startKey parameter are returned.
    @NameInMap("startKey")
    public String startKey;

    public static ListTriggersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTriggersRequest self = new ListTriggersRequest();
        return TeaModel.build(map, self);
    }

    public ListTriggersRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListTriggersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTriggersRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public ListTriggersRequest setStartKey(String startKey) {
        this.startKey = startKey;
        return this;
    }
    public String getStartKey() {
        return this.startKey;
    }

}
