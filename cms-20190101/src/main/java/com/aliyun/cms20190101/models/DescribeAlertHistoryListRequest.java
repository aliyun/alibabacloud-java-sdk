// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeAlertHistoryListRequest extends TeaModel {
    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Status")
    public String status;

    @NameInMap("State")
    public String state;

    @NameInMap("Ascending")
    public Boolean ascending;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Page")
    public Integer page;

    public static DescribeAlertHistoryListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertHistoryListRequest self = new DescribeAlertHistoryListRequest();
        return TeaModel.build(map, self);
    }

}
