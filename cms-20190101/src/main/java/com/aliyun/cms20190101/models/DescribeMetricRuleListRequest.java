// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleListRequest extends TeaModel {
    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("EnableState")
    public Boolean enableState;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("AlertState")
    public String alertState;

    @NameInMap("Dimensions")
    public String dimensions;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("RuleIds")
    public String ruleIds;

    public static DescribeMetricRuleListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRuleListRequest self = new DescribeMetricRuleListRequest();
        return TeaModel.build(map, self);
    }

}
