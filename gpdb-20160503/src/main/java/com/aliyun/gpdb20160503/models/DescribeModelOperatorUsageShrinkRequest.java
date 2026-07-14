// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeModelOperatorUsageShrinkRequest extends TeaModel {
    /**
     * <p>The list of API key IDs. Separate multiple IDs with commas (,). If this parameter is not specified, all API key IDs under the instance ID are used by default.</p>
     * <blockquote>
     * <p>The list can contain up to 50 items.</p>
     * </blockquote>
     */
    @NameInMap("ApiKeyIds")
    public String apiKeyIdsShrink;

    /**
     * <p>The end time of the query. Specify the time in the <i>YYYY-MM-DDThh:mmZ</i> format (UTC).</p>
     * <blockquote>
     * <p>The end time must be later than the start time, and the interval between the start time and end time cannot exceed 7 days.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2026-06-02T00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The dimension by which to split the series. Separate multiple dimensions with commas (,). The order is not significant. Valid values:</p>
     * <ul>
     * <li>model (default): splits by model.</li>
     * <li>api_key: splits by API key.</li>
     * <li>model,api_key: splits by model and API key.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>model</p>
     */
    @NameInMap("GroupBy")
    public String groupBy;

    /**
     * <p>The list of metrics. Separate multiple metrics with commas (,). Valid values:</p>
     * <ul>
     * <li>request_count: the number of requests.</li>
     * <li>success_count: the number of successful requests.</li>
     * <li>error_count: the number of failed requests.</li>
     * <li>success_rate: the request success rate.</li>
     * <li>input_token: the number of input tokens.</li>
     * <li>output_token: the number of output tokens.</li>
     * <li>total_token: the total number of tokens.</li>
     * </ul>
     */
    @NameInMap("Keys")
    public String keysShrink;

    /**
     * <p>The list of model names. Separate multiple names with commas (,).</p>
     */
    @NameInMap("ModelNames")
    public String modelNamesShrink;

    /**
     * <p>The time bucket size in seconds. Valid values: 1, 5, 15, 60, 300, and 3600.</p>
     * <blockquote>
     * <ul>
     * <li><ol>
     * <li>If Period is not specified, the default value is determined by the following rules:</li>
     * </ol>
     * </li>
     * <li><ul>
     * <li>Window range ≤ 1 hour: Period = 1.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>Window range ≤ 1 day: Period = 60.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>Window range ≤ 7 days: Period = 60.</li>
     * </ul>
     * </li>
     * <li><ol start="2">
     * <li>When Period is set to 1, the window must be ≤ 1 day.</li>
     * </ol>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The start time of the query. Specify the time in the <i>YYYY-MM-DDThh:mmZ</i> format (UTC).</p>
     * <blockquote>
     * <p>Only metrics within the last 30 days can be queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2026-06-01T00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeModelOperatorUsageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelOperatorUsageShrinkRequest self = new DescribeModelOperatorUsageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeModelOperatorUsageShrinkRequest setApiKeyIdsShrink(String apiKeyIdsShrink) {
        this.apiKeyIdsShrink = apiKeyIdsShrink;
        return this;
    }
    public String getApiKeyIdsShrink() {
        return this.apiKeyIdsShrink;
    }

    public DescribeModelOperatorUsageShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeModelOperatorUsageShrinkRequest setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public String getGroupBy() {
        return this.groupBy;
    }

    public DescribeModelOperatorUsageShrinkRequest setKeysShrink(String keysShrink) {
        this.keysShrink = keysShrink;
        return this;
    }
    public String getKeysShrink() {
        return this.keysShrink;
    }

    public DescribeModelOperatorUsageShrinkRequest setModelNamesShrink(String modelNamesShrink) {
        this.modelNamesShrink = modelNamesShrink;
        return this;
    }
    public String getModelNamesShrink() {
        return this.modelNamesShrink;
    }

    public DescribeModelOperatorUsageShrinkRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribeModelOperatorUsageShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
