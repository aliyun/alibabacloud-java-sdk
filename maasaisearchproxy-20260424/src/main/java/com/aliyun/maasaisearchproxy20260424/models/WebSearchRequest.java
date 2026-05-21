// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasaisearchproxy20260424.models;

import com.aliyun.tea.*;

public class WebSearchRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1754973000000</p>
     */
    @NameInMap("endTime")
    public String endTime;

    @NameInMap("excludeDomain")
    public java.util.List<String> excludeDomain;

    @NameInMap("includeDomain")
    public java.util.List<String> includeDomain;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;entityFilter\&quot;:{\&quot;domain\&quot;:\&quot;synthetics\&quot;,\&quot;filters\&quot;:[],\&quot;type\&quot;:\&quot;synthetics.task\&quot;},\&quot;metric\&quot;:\&quot;availability\&quot;,\&quot;metricSet\&quot;:\&quot;synthetics.metric.task\&quot;,\&quot;type\&quot;:\&quot;METRIC_SET_QUERY\&quot;}</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("region")
    public String region;

    @NameInMap("searchType")
    public String searchType;

    /**
     * <strong>example:</strong>
     * <p>2026-03-06 10:04:45</p>
     */
    @NameInMap("startTime")
    public String startTime;

    public static WebSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        WebSearchRequest self = new WebSearchRequest();
        return TeaModel.build(map, self);
    }

    public WebSearchRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public WebSearchRequest setExcludeDomain(java.util.List<String> excludeDomain) {
        this.excludeDomain = excludeDomain;
        return this;
    }
    public java.util.List<String> getExcludeDomain() {
        return this.excludeDomain;
    }

    public WebSearchRequest setIncludeDomain(java.util.List<String> includeDomain) {
        this.includeDomain = includeDomain;
        return this;
    }
    public java.util.List<String> getIncludeDomain() {
        return this.includeDomain;
    }

    public WebSearchRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public WebSearchRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public WebSearchRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public WebSearchRequest setSearchType(String searchType) {
        this.searchType = searchType;
        return this;
    }
    public String getSearchType() {
        return this.searchType;
    }

    public WebSearchRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
