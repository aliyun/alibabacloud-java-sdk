// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class QueryQuotaMetricRequest extends TeaModel {
    /**
     * <p>The fixed interval in seconds. If you leave this parameter empty, the system uses an automatic interval policy.</p>
     * <ul>
     * <li><p>Automatic interval policy: The interval is 60 seconds for a time range within 6 hours, 300 seconds for a time range within 24 hours, 900 seconds for a time range within 72 hours, and 1,800 seconds for a time range longer than 72 hours.</p>
     * </li>
     * <li><p>Specified interval: Valid values are 60, 300, and 900. The query time range must be within 72 hours.</p>
     * </li>
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
     * <p>The end of the time range to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1735536322</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The start of the time range to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1735534322</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    /**
     * <p>The aggregation strategy for the data. The default value is max. Valid values: max and avg.</p>
     * <p>Data is collected at one-minute intervals. If you query a long time range, the system may use an interval longer than one minute and aggregate the data. This parameter specifies how the data is aggregated.</p>
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
