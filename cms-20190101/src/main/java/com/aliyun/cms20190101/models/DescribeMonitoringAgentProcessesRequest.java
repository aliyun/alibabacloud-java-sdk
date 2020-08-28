// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringAgentProcessesRequest extends TeaModel {
    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    public static DescribeMonitoringAgentProcessesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitoringAgentProcessesRequest self = new DescribeMonitoringAgentProcessesRequest();
        return TeaModel.build(map, self);
    }

}
