// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListLogStoresResponseBody extends TeaModel {
    /**
     * <p>The list of Simple Log Service Logstores.</p>
     */
    @NameInMap("LogStores")
    public java.util.List<String> logStores;

    /**
     * <p>The maximum number of entries to return for the current request.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query. If this is the first query or no subsequent query is required, you do not need to specify this parameter. If a subsequent query is required, set this parameter to the NextToken value returned by the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>57</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListLogStoresResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLogStoresResponseBody self = new ListLogStoresResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLogStoresResponseBody setLogStores(java.util.List<String> logStores) {
        this.logStores = logStores;
        return this;
    }
    public java.util.List<String> getLogStores() {
        return this.logStores;
    }

    public ListLogStoresResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListLogStoresResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListLogStoresResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLogStoresResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
