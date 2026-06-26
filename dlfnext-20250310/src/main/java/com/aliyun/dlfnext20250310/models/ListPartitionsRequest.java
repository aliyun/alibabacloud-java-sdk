// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListPartitionsRequest extends TeaModel {
    /**
     * <p>The maximum number of records to return in a single request.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    /**
     * <p>The pagination token used to retrieve the next page of results. If the response does not include this token, pass an empty string (&quot;&quot;).</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("pageToken")
    public String pageToken;

    /**
     * <p>The partition name pattern.</p>
     * 
     * <strong>example:</strong>
     * <p>partition</p>
     */
    @NameInMap("partitionNamePattern")
    public String partitionNamePattern;

    public static ListPartitionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPartitionsRequest self = new ListPartitionsRequest();
        return TeaModel.build(map, self);
    }

    public ListPartitionsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListPartitionsRequest setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    public String getPageToken() {
        return this.pageToken;
    }

    public ListPartitionsRequest setPartitionNamePattern(String partitionNamePattern) {
        this.partitionNamePattern = partitionNamePattern;
        return this;
    }
    public String getPartitionNamePattern() {
        return this.partitionNamePattern;
    }

}
