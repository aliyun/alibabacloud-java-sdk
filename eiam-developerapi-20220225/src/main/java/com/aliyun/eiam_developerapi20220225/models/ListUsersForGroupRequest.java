// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class ListUsersForGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>nextToken</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListUsersForGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUsersForGroupRequest self = new ListUsersForGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListUsersForGroupRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUsersForGroupRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
