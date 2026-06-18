// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListMemoriesRequest extends TeaModel {
    /**
     * <p>The number of entries per page in a paged query. Valid values: 1 to 50.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Set this parameter to the NextToken value returned in the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>dc270401186b433f975d7e1faaa3xxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListMemoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMemoriesRequest self = new ListMemoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListMemoriesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMemoriesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
