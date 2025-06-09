// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListPartitionSummariesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("pageToken")
    public String pageToken;

    /**
     * <strong>example:</strong>
     * <p>hh=10</p>
     */
    @NameInMap("partitionNamePattern")
    public String partitionNamePattern;

    public static ListPartitionSummariesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPartitionSummariesRequest self = new ListPartitionSummariesRequest();
        return TeaModel.build(map, self);
    }

    public ListPartitionSummariesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPartitionSummariesRequest setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    public String getPageToken() {
        return this.pageToken;
    }

    public ListPartitionSummariesRequest setPartitionNamePattern(String partitionNamePattern) {
        this.partitionNamePattern = partitionNamePattern;
        return this;
    }
    public String getPartitionNamePattern() {
        return this.partitionNamePattern;
    }

}
