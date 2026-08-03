// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class ListDataEventServicesRequest extends TeaModel {
    /**
     * <p>The maximum number of results to return.</p>
     * <ul>
     * <li><p>Valid values: 1 to 100.</p>
     * </li>
     * <li><p>Default value: 20.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * <ul>
     * <li><p>You do not need to specify this parameter for the first request.</p>
     * </li>
     * <li><p>You must specify the token that is obtained from the previous query as the value of <code>NextToken</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VjE6dLbnNpVmbz06****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListDataEventServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataEventServicesRequest self = new ListDataEventServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListDataEventServicesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataEventServicesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
