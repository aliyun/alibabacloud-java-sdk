// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CursorShrinkRequest extends TeaModel {
    /**
     * <p>The end of the time range to query.</p>
     * <br>
     * <p>Unit: milliseconds.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. For example, 2023-01-01T00:00:00Z indicates January 1, 2023, 00:00:00 UTC.</p>
     * <br>
     * <p>*   If you do not set the end time, the end time is infinite. You can leave this parameter empty in real-time export scenarios.</p>
     * <p>*   In CloudMonitor, the TTL of monitoring data varies with the time granularity. Specify a proper time interval based on the TTL corresponding to the value of the `Period` parameter.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The dimension information of the metric.</p>
     */
    @NameInMap("Matchers")
    public String matchersShrink;

    /**
     * <p>The metric that is used to monitor the cloud service.</p>
     * <br>
     * <p>For more information about the metrics of cloud services, see [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("Metric")
    public String metric;

    /**
     * <p>The namespace of the cloud service.</p>
     * <br>
     * <p>For more information about the namespaces of cloud services, see [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The time interval based on which the metric value is measured.</p>
     * <br>
     * <p>Unit: seconds.</p>
     * <br>
     * <p>>  Generally, the time interval is 60 seconds. For more information about specific values, see the `Period` parameter in [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The beginning of the time range to query.</p>
     * <br>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. For example, 2023-01-01T00:00:00Z indicates January 1, 2023, 00:00:00 UTC.</p>
     * <br>
     * <p>>  In CloudMonitor, the TTL of monitoring data varies with the time granularity. Specify a proper time interval based on the TTL corresponding to the value of the `Period` parameter.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static CursorShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CursorShrinkRequest self = new CursorShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CursorShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CursorShrinkRequest setMatchersShrink(String matchersShrink) {
        this.matchersShrink = matchersShrink;
        return this;
    }
    public String getMatchersShrink() {
        return this.matchersShrink;
    }

    public CursorShrinkRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public CursorShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CursorShrinkRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CursorShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
