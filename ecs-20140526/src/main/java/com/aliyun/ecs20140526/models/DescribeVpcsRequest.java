// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeVpcsRequest extends TeaModel {
    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("IsDefault")
    public Boolean isDefault;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeVpcsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcsRequest self = new DescribeVpcsRequest();
        return TeaModel.build(map, self);
    }

}
