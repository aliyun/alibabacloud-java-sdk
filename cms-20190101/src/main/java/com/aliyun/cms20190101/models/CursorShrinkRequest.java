// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CursorShrinkRequest extends TeaModel {
    /**
     * <p>The end of the time range to query.</p>
     * <p>Unit: milliseconds.</p>
     * <blockquote>
     * <ul>
     * <li>Unix timestamp: the number of milliseconds that have elapsed since 00:00:00 on January 1, 1970. The value is in the YYYY-MM-DDThh:mm:ssZ format. For example, 2023-01-01T00:00:00Z indicates 00:00:00 on January 1, 2023 (GMT).</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>If you do not specify an end time, the end time is unlimited. You do not need to specify this parameter when you export data in real time.</li>
     * <li>The time to live (TTL) of monitoring data varies based on the statistical granularity in CloudMonitor. Configure a proper time range based on the TTL of the data that corresponds to the <code>Period</code> parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1641645000000</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The dimension information of the metric.</p>
     */
    @NameInMap("Matchers")
    public String matchersShrink;

    /**
     * <p>The metric name of the cloud service.</p>
     * <p>For information about how to obtain the metric name of a cloud service, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpu_idle</p>
     */
    @NameInMap("Metric")
    public String metric;

    /**
     * <p>The data namespace of the cloud service.</p>
     * <p>For information about how to obtain the data namespace of a cloud service, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs_ecs_dashboard</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The statistical period of the metric.</p>
     * <p>Unit: seconds.</p>
     * <blockquote>
     * <p>The statistical period of a metric is typically 60 seconds. For special values, see the <code>Period</code> parameter in <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The beginning of the time range to query.</p>
     * <p>The value is in the YYYY-MM-DDThh:mm:ssZ format. For example, 2023-01-01T00:00:00Z indicates 00:00:00 on January 1, 2023 (GMT).</p>
     * <blockquote>
     * <p>The time to live (TTL) of monitoring data varies based on the statistical granularity in CloudMonitor. Configure a proper time range based on the TTL of the data that corresponds to the <code>Period</code> parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1641627000000</p>
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
