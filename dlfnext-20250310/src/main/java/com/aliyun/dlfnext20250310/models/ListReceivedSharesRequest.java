// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListReceivedSharesRequest extends TeaModel {
    /**
     * <p>The maximum number of records to return for this request.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The token to retrieve the next page of results. If the response does not include this token, pass an empty string (&quot;&quot;).</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("pageToken")
    public String pageToken;

    public static ListReceivedSharesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListReceivedSharesRequest self = new ListReceivedSharesRequest();
        return TeaModel.build(map, self);
    }

    public ListReceivedSharesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListReceivedSharesRequest setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    public String getPageToken() {
        return this.pageToken;
    }

}
