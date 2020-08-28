// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeBandwidthLimitationRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("OperationType")
    public String operationType;

    public static DescribeBandwidthLimitationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBandwidthLimitationRequest self = new DescribeBandwidthLimitationRequest();
        return TeaModel.build(map, self);
    }

}
