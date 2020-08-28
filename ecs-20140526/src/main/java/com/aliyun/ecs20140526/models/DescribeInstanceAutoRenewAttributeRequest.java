// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceAutoRenewAttributeRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("RenewalStatus")
    public String renewalStatus;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("PageNumber")
    public String pageNumber;

    public static DescribeInstanceAutoRenewAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAutoRenewAttributeRequest self = new DescribeInstanceAutoRenewAttributeRequest();
        return TeaModel.build(map, self);
    }

}
