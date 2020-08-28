// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeMultiContainerGroupMetricRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ContainerGroupIds")
    @Validation(required = true)
    public String containerGroupIds;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("MetricType")
    public String metricType;

    public static DescribeMultiContainerGroupMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMultiContainerGroupMetricRequest self = new DescribeMultiContainerGroupMetricRequest();
        return TeaModel.build(map, self);
    }

}
