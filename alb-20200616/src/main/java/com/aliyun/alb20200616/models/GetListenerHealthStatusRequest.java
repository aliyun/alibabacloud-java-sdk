// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class GetListenerHealthStatusRequest extends TeaModel {
    /**
     * <p>Specifies whether to return the health check results of forwarding rules. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false** (default)</p>
     */
    @NameInMap("IncludeRule")
    public Boolean includeRule;

    /**
     * <p>The listener ID.</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The number of entries to return on each page. Valid values: **1** to **30**. Default value: **20**.</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The token that determines the start point of the query. Valid values:</p>
     * <br>
     * <p>*   If this is your first query or no next queries are to be sent, ignore this parameter.</p>
     * <p>*   If a next query is to be sent, set the value to the value of **NextToken** that is returned from the last call.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static GetListenerHealthStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetListenerHealthStatusRequest self = new GetListenerHealthStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetListenerHealthStatusRequest setIncludeRule(Boolean includeRule) {
        this.includeRule = includeRule;
        return this;
    }
    public Boolean getIncludeRule() {
        return this.includeRule;
    }

    public GetListenerHealthStatusRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public GetListenerHealthStatusRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public GetListenerHealthStatusRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
