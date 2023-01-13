// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListOnDemandConfigsRequest extends TeaModel {
    /**
     * <p>The maximum number of resources to return. Default value: 20. Maximum value: 100. The number of returned resources is less than or equal to the specified number.</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The token used to obtain more results. If the number of resources exceeds the limit, the nextToken parameter is returned. You can include the parameter in subsequent calls to obtain more results. You do not need to provide this parameter in the first call.</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The prefix that the names of returned resources must contain. If the name prefix is a, the names of returned resources must start with a.</p>
     */
    @NameInMap("prefix")
    public String prefix;

    /**
     * <p>The returned resources are sorted in alphabetical order, and the resources that include and follow the resource specified by the startKey parameter are returned.</p>
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
