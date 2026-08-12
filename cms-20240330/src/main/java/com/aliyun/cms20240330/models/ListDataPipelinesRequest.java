// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListDataPipelinesRequest extends TeaModel {
    /**
     * <p>The maximum number of results per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjEwfQ==</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListDataPipelinesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataPipelinesRequest self = new ListDataPipelinesRequest();
        return TeaModel.build(map, self);
    }

    public ListDataPipelinesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataPipelinesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
