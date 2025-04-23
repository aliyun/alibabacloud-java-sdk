// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListRunMetricsRequest extends TeaModel {
    /**
     * <p>The metric key of the run.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>loss</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The maximum number of entries in the request. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token, which starts from 0. Default value: 0.</p>
     * 
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
