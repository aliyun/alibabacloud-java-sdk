// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringAgentHostsRequest extends TeaModel {
    @NameInMap("KeyWord")
    public String keyWord;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("SerialNumbers")
    public String serialNumbers;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("InstanceRegionId")
    public String instanceRegionId;

    public static DescribeMonitoringAgentHostsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitoringAgentHostsRequest self = new DescribeMonitoringAgentHostsRequest();
        return TeaModel.build(map, self);
    }

}
