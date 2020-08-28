// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeAlertingMetricRuleResourcesRequest extends TeaModel {
    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeAlertingMetricRuleResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertingMetricRuleResourcesRequest self = new DescribeAlertingMetricRuleResourcesRequest();
        return TeaModel.build(map, self);
    }

}
