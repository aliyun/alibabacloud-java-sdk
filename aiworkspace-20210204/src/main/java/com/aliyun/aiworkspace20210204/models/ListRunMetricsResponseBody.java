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
     * <p>The pagination token. Leave this parameter empty when you query the first page. The response returns the token for the next page. A value of 0 indicates that all results have been retrieved. You can obtain the token for the next page from the <strong>NextPageToken</strong> field in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NextPageToken")
    public Long nextPageToken;

    /**
     * <p>Id of the request</p>
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
