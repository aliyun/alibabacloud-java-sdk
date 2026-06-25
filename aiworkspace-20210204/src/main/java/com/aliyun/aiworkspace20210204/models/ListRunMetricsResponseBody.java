// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListRunMetricsResponseBody extends TeaModel {
    /**
     * <p>The list of metrics.</p>
     */
    @NameInMap("Metrics")
    public java.util.List<RunMetric> metrics;

    /**
     * <p>The token to retrieve the next page of results. A value of 0 indicates that all results have been returned. Use the value of this parameter for the \<code>PageToken\\</code> parameter in your next request to retrieve the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NextPageToken")
    public Long nextPageToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ADF6D849-*****-7E7030F0CE53</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListRunMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRunMetricsResponseBody self = new ListRunMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRunMetricsResponseBody setMetrics(java.util.List<RunMetric> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<RunMetric> getMetrics() {
        return this.metrics;
    }

    public ListRunMetricsResponseBody setNextPageToken(Long nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public Long getNextPageToken() {
        return this.nextPageToken;
    }

    public ListRunMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
