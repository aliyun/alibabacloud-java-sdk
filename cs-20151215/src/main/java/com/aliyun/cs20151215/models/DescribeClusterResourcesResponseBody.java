// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterResourcesResponseBody extends TeaModel {
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("resource_type")
    @Validation(required = true)
    public String resourceType;

    @NameInMap("resource_info")
    @Validation(required = true)
    public String resourceInfo;

    @NameInMap("state")
    @Validation(required = true)
    public String state;

    public static DescribeClusterResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterResourcesResponseBody self = new DescribeClusterResourcesResponseBody();
        return TeaModel.build(map, self);
    }

}
