// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListTriggersRequest extends TeaModel {
    /**
     * <p>The number of triggers returned.</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The token for the next page.</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The trigger name prefix.</p>
     */
    @NameInMap("prefix")
    public String prefix;

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

}
