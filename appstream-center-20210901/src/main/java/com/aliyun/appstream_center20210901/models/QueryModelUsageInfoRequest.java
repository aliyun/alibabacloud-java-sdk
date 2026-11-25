// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class QueryModelUsageInfoRequest extends TeaModel {
    /**
     * <p>The business type. This parameter is required and has no default value. The mapping between business types and values is as follows:</p>
     * <ul>
     * <li><code>1</code>: Enterprise Edition.</li>
     * <li><code>10</code>: Personal Edition.</li>
     * <li><code>20</code>: Commercial Edition.</li>
     * <li><code>70</code>: Agentic Computer.</li>
     * </ul>
     * <p><strong>The API directly queries the model usage of the current account based on the specified <code>BizType</code> and does not automatically convert or replace the business type.</strong> To query the usage of the Agentic Computer business, you must explicitly set <code>BizType</code> to <code>70</code>. The usage of different business types is calculated separately.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BizType")
    public Integer bizType;

    /**
     * <p>The end date of the custom query. The format is <code>yyyy-MM-dd</code>. The date is interpreted as a calendar day in the Asia/Shanghai (UTC+8) time zone and includes the current day. The value is a date string and does not include hours, minutes, seconds, or a time zone suffix.</p>
     * <p><strong>This parameter can be specified only when <code>StatDateType</code> is set to <code>1d</code>, and it must be specified or omitted together with <code>StartDate</code>.</strong> The end date cannot be earlier than the start date. The total number of days, including the start and end dates, cannot exceed 90. If you do not use a custom date, omit these two parameters directly. Do not pass empty strings or blank spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-07</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The model type filter. If this parameter is not specified or an empty string is passed, no filtering by type is performed. The value is case-insensitive:</p>
     * <ul>
     * <li><code>LLM</code>: Large language model.</li>
     * <li><code>IMAGE</code>: Image model.</li>
     * <li><code>VIDEO</code>: Video model.</li>
     * <li><code>AUDIO</code>: Audio model.</li>
     * <li><code>EMBEDDING</code>: Embedding model.</li>
     * </ul>
     * <p>Non-empty values do not support leading or trailing spaces. Other non-empty values will cause parameter validation to fail.</p>
     * 
     * <strong>example:</strong>
     * <p>LLM</p>
     */
    @NameInMap("ModelType")
    public String modelType;

    /**
     * <p>The start date of the custom query. The format is <code>yyyy-MM-dd</code>. The date is interpreted as a calendar day in the Asia/Shanghai (UTC+8) time zone and includes the current day. The value is a date string and does not include hours, minutes, seconds, or a time zone suffix.</p>
     * <p><strong>This parameter can be specified only when <code>StatDateType</code> is set to <code>1d</code>, and it must be specified or omitted together with <code>EndDate</code>.</strong> The start date cannot be later than the end date. The total number of days, including the start and end dates, must be between 1 and 90. If both parameters are omitted, the cumulative usage for today is queried. If you do not use a custom date, omit these two parameters directly. Do not pass empty strings or blank spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-01</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The statistical window. This parameter is required, has no default value, is case-sensitive, and does not support leading or trailing spaces. Time boundaries are calculated based on <strong>Asia/Shanghai (UTC+8)</strong>.</p>
     * <ul>
     * <li><code>24h</code>: The last 24 hours up to the most recent available statistical cutoff time. The cutoff time corresponds to the current hour or the previous hour.</li>
     * <li><code>1d</code>: If the start and end dates are not specified, the cumulative usage for today is queried. If both <code>StartDate</code> and <code>EndDate</code> are specified, the specified calendar day range is queried.</li>
     * <li><code>1w</code>: The last 7 days up to the day of the request. If the statistical results for the current day are unavailable, the results from the previous day are not used.</li>
     * <li><code>30d</code>: The last 30 days up to the day of the request. If the statistical results for the current day are unavailable, the results from the previous day are not used.</li>
     * <li><code>1y</code>: The statistical results for the last 365 days. If the results for the current year are unavailable, the statistical results for the previous year may be returned, and the actual coverage may be earlier than the day of the request. This API does not return the statistical cutoff time for this result, so you cannot use it to confirm whether the data has been updated to the current day.</li>
     * </ul>
     * <p><strong>Only <code>1d</code> supports custom date ranges</strong>. Do not specify start and end dates for other windows.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1d</p>
     */
    @NameInMap("StatDateType")
    public String statDateType;

    public static QueryModelUsageInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryModelUsageInfoRequest self = new QueryModelUsageInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryModelUsageInfoRequest setBizType(Integer bizType) {
        this.bizType = bizType;
        return this;
    }
    public Integer getBizType() {
        return this.bizType;
    }

    public QueryModelUsageInfoRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryModelUsageInfoRequest setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public QueryModelUsageInfoRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public QueryModelUsageInfoRequest setStatDateType(String statDateType) {
        this.statDateType = statDateType;
        return this;
    }
    public String getStatDateType() {
        return this.statDateType;
    }

}
