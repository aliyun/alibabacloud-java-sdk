// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeGroupMonitoringAgentProcessRequest extends TeaModel {
    @NameInMap("GroupId")
    @Validation(required = true)
    public String groupId;

    @NameInMap("ProcessName")
    public String processName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeGroupMonitoringAgentProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupMonitoringAgentProcessRequest self = new DescribeGroupMonitoringAgentProcessRequest();
        return TeaModel.build(map, self);
    }

}
