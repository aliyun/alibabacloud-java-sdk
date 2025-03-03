// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListEventBusesRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return in a request. You can use this parameter and NextToken to implement paging.</p>
     * <blockquote>
     * <p> A maximum of 100 entries can be returned in a request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The prefix of the names of the event buses that you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>My</p>
     */
    @NameInMap("NamePrefix")
    public String namePrefix;

    /**
     * <p>If you configure Limit and excess return values exist, this parameter is returned. You can use this parameter and Limit to implement paging.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListEventBusesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEventBusesRequest self = new ListEventBusesRequest();
        return TeaModel.build(map, self);
    }

    public ListEventBusesRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListEventBusesRequest setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
        return this;
    }
    public String getNamePrefix() {
        return this.namePrefix;
    }

    public ListEventBusesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
