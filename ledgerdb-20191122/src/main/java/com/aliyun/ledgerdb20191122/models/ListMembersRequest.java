// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class ListMembersRequest extends TeaModel {
    @NameInMap("LedgerId")
    public String ledgerId;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("MaxResults")
    public Integer maxResults;

    public static ListMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMembersRequest self = new ListMembersRequest();
        return TeaModel.build(map, self);
    }

    public ListMembersRequest setLedgerId(String ledgerId) {
        this.ledgerId = ledgerId;
        return this;
    }
    public String getLedgerId() {
        return this.ledgerId;
    }

    public ListMembersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMembersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

}
