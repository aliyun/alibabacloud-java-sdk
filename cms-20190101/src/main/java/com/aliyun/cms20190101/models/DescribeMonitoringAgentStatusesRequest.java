// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringAgentStatusesRequest extends TeaModel {
    @NameInMap("InstanceIds")
    @Validation(required = true)
    public String instanceIds;

    public static DescribeMonitoringAgentStatusesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitoringAgentStatusesRequest self = new DescribeMonitoringAgentStatusesRequest();
        return TeaModel.build(map, self);
    }

}
