// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorStatisticsRequest extends TeaModel {
    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    @NameInMap("TimeRange")
    public String timeRange;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("MetricName")
    @Validation(required = true)
    public String metricName;

    public static DescribeSiteMonitorStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteMonitorStatisticsRequest self = new DescribeSiteMonitorStatisticsRequest();
        return TeaModel.build(map, self);
    }

}
