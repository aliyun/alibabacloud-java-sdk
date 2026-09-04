// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class GetListenerHealthStatusRequest extends TeaModel {
    /**
     * <p>Specifies whether to include the health check results of forwarding rules. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Include the results.</li>
     * <li><strong>false</strong> (default): Do not include the results.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeRule")
    public Boolean includeRule;

    /**
     * <p>The listener ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lsn-o4u54y73wq7b******</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The maximum number of entries to return per page in a paginated query. Valid values: <strong>1</strong> to <strong>30</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>Specifies whether there is a token for the next query. Valid values:</p>
     * <ul>
     * <li>For the first query or when no next query exists, leave this parameter empty.</li>
     * <li>If a next query exists, set this parameter to the <strong>NextToken</strong> value returned by the previous API call.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
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
