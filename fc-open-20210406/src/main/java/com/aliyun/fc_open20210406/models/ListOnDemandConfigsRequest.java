// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListOnDemandConfigsRequest extends TeaModel {
    /**
     * <p>The time when Function Compute API is called.</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The ID of your Alibaba Cloud account.</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("prefix")
    public String prefix;

    /**
     * <p>The maximum number of resources to return. Default value: 20. Maximum value: 100. The number of returned resources is less than or equal to the specified number.</p>
     */
    @NameInMap("startKey")
    public String startKey;

    public static ListOnDemandConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOnDemandConfigsRequest self = new ListOnDemandConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListOnDemandConfigsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListOnDemandConfigsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOnDemandConfigsRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public ListOnDemandConfigsRequest setStartKey(String startKey) {
        this.startKey = startKey;
        return this;
    }
    public String getStartKey() {
        return this.startKey;
    }

}
