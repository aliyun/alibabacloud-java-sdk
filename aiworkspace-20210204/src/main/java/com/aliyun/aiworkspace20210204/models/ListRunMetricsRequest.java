// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListRunMetricsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>loss</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PageToken")
    public Long pageToken;

    public static ListRunMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRunMetricsRequest self = new ListRunMetricsRequest();
        return TeaModel.build(map, self);
    }

    public ListRunMetricsRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ListRunMetricsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListRunMetricsRequest setPageToken(Long pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    public Long getPageToken() {
        return this.pageToken;
    }

}
