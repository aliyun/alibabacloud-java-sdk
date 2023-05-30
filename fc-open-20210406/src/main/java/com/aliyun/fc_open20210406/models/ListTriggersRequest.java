// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListTriggersRequest extends TeaModel {
    /**
     * <p>The token required to obtain more results. You do not need to provide this parameter in the first call. The tokens for subsequent queries are obtained from the returned results.</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The prefix that the names of returned resources must contain.</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The returned resources are sorted in alphabetical order, and the resources that include and follow the resource specified by the startKey parameter are returned.</p>
     */
    @NameInMap("prefix")
    public String prefix;

    /**
     * <p>The ID of your Alibaba Cloud account.</p>
     */
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
