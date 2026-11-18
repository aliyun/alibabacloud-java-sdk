// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListDatasetVersionsRequest extends TeaModel {
    /**
     * <p>The maximum number of versions to return per page. Valid values: 1 to 100. Default value: 100. The actual number of returned versions may be less than this value.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page. Do not specify this parameter in the first request. To query subsequent pages, pass the nextToken value from the previous response as is, and keep the agent space and dataset name unchanged. The example is for demonstration purposes only. Use the actual token returned by the API operation.</p>
     * 
     * <strong>example:</strong>
     * <p>umaQfI7x758Ns4TgWrj8yA3fYlnk7dJgsfhMrSViRY8=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListDatasetVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetVersionsRequest self = new ListDatasetVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListDatasetVersionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDatasetVersionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
