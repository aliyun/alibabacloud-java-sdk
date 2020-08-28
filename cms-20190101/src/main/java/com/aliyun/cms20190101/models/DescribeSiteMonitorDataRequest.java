// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorDataRequest extends TeaModel {
    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    @NameInMap("Type")
    public String type;

    @NameInMap("MetricName")
    @Validation(required = true)
    public String metricName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Period")
    public String period;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Length")
    public Integer length;

    public static DescribeSiteMonitorDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteMonitorDataRequest self = new DescribeSiteMonitorDataRequest();
        return TeaModel.build(map, self);
    }

}
