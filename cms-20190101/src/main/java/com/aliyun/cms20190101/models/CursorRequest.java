// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CursorRequest extends TeaModel {
    /**
     * <p>The end timestamp.</p>
     * <p>Unit: milliseconds.</p>
     * <blockquote>
     * <ul>
     * <li>UNIX timestamp: the number of milliseconds that have elapsed since January 1, 1970. The format YYYY-MM-DDThh:mm:ssZ is supported. Example: 2023-01-01T00:00:00Z, which specifies 00:00:00 on January 1, 2023 (GMT).</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>If you do not specify the end time, the end time is considered infinite. In real-time export scenarios, you can leave this parameter empty.</li>
     * <li>The TTL of monitoring data in CloudMonitor varies with the time granularity. Refer to the data TTL corresponding to the Period request parameter to set a reasonable time interval.</li>
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
    public java.util.List<Matcher> matchers;

    /**
     * <p>The name of the metric for the cloud service.</p>
     * <p>For more information about how to obtain the metric name of a cloud service, see <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring metrics</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpu_idle</p>
     */
    @NameInMap("Metric")
    public String metric;

    /**
     * <p>The data namespace of the cloud service.</p>
     * <p>For more information about how to obtain the data namespace of a cloud service, see <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring metrics</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs_ecs_dashboard</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The time interval of the metric.</p>
     * <p>Unit: seconds.</p>
     * <blockquote>
     * <p>The time interval of a metric is typically 60 seconds. For special values, see the Period parameter in <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring metrics</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The start timestamp.</p>
     * <p>The format YYYY-MM-DDThh:mm:ssZ is supported. Example: 2023-01-01T00:00:00Z, which specifies 00:00:00 on January 1, 2023 (GMT).</p>
     * <blockquote>
     * <p>The time-to-live (TTL) of monitoring data in CloudMonitor varies with the time granularity. Refer to the data TTL corresponding to the Period request parameter to set a reasonable time interval.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1641627000000</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static CursorRequest build(java.util.Map<String, ?> map) throws Exception {
        CursorRequest self = new CursorRequest();
        return TeaModel.build(map, self);
    }

    public CursorRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CursorRequest setMatchers(java.util.List<Matcher> matchers) {
        this.matchers = matchers;
        return this;
    }
    public java.util.List<Matcher> getMatchers() {
        return this.matchers;
    }

    public CursorRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public CursorRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CursorRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CursorRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
