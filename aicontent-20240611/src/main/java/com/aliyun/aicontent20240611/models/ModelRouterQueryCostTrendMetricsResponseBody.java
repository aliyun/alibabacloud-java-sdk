// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryCostTrendMetricsResponseBody extends TeaModel {
    /**
     * <p>The data object containing the cost trend metrics.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public CostQueryTrendDTO data;

    /**
     * <p>The error code returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>UNKNOWN_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>未知错误</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The maximum number of results returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>A token to retrieve the next page of results. If no token is returned, all results have been retrieved.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxx-xxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The unique request ID. If you encounter a problem, provide this ID to technical support for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. A value of <code>true</code> indicates success, and <code>false</code> indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ModelRouterQueryCostTrendMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryCostTrendMetricsResponseBody self = new ModelRouterQueryCostTrendMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryCostTrendMetricsResponseBody setData(CostQueryTrendDTO data) {
        this.data = data;
        return this;
    }
    public CostQueryTrendDTO getData() {
        return this.data;
    }

    public ModelRouterQueryCostTrendMetricsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModelRouterQueryCostTrendMetricsResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModelRouterQueryCostTrendMetricsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelRouterQueryCostTrendMetricsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ModelRouterQueryCostTrendMetricsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ModelRouterQueryCostTrendMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelRouterQueryCostTrendMetricsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
