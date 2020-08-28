// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeNetworkInterfacePermissionsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    @NameInMap("NetworkInterfacePermissionId")
    public java.util.List<String> networkInterfacePermissionId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeNetworkInterfacePermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInterfacePermissionsRequest self = new DescribeNetworkInterfacePermissionsRequest();
        return TeaModel.build(map, self);
    }

}
