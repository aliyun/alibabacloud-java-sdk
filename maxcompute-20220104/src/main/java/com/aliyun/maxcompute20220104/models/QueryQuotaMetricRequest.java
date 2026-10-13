// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class QueryQuotaMetricRequest extends TeaModel {
    /**
     * <p>The fixed interval in seconds. By default, this parameter is empty, which indicates that the adaptive interval policy of the system is used.</p>
     * <ul>
     * <li>Adaptive interval policy: The interval is 60 seconds if the query time range is within 6 hours, 300 seconds if within 24 hours, 900 seconds if within 72 hours, and 1800 seconds if exceeding 72 hours.</li>
     * <li>Specified interval: Only 60, 300, and 900 are supported. The query time range must be within 72 hours.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("interval")
    public Long interval;

    /**
     * <p>The nickname of the level-1 quota. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>os_sns_p</p>
     */
    @NameInMap("nickname")
    public String nickname;

    @NameInMap("subMetric")
    public String subMetric;

    /**
     * <p>The nickname of the level-2 quota.</p>
     * 
     * <strong>example:</strong>
     * <p>os_sns</p>
     */
    @NameInMap("subQuotaNickname")
    public String subQuotaNickname;

    /**
     * <p>The end time of the query time range. The value is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1735536322</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The start time of the query time range. The value is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1735534322</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    /**
     * <p>The data aggregation policy. Default value: max. Valid values: max and avg.</p>
     * <p>Data is collected every 1 minute. If the query time range is large, the adaptive step size for data display exceeds 1 minute, and the metrics are aggregated. This parameter specifies the data aggregation logic.</p>
     * 
     * <strong>example:</strong>
     * <p>max</p>
     */
    @NameInMap("strategy")
    public String strategy;

    public static QueryQuotaMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryQuotaMetricRequest self = new QueryQuotaMetricRequest();
        return TeaModel.build(map, self);
    }

    public QueryQuotaMetricRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public QueryQuotaMetricRequest setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }
    public String getNickname() {
        return this.nickname;
    }

    public QueryQuotaMetricRequest setSubMetric(String subMetric) {
        this.subMetric = subMetric;
        return this;
    }
    public String getSubMetric() {
        return this.subMetric;
    }

    public QueryQuotaMetricRequest setSubQuotaNickname(String subQuotaNickname) {
        this.subQuotaNickname = subQuotaNickname;
        return this;
    }
    public String getSubQuotaNickname() {
        return this.subQuotaNickname;
    }

    public QueryQuotaMetricRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryQuotaMetricRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryQuotaMetricRequest setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

}
