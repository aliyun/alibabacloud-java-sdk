// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeAddonsQuery extends TeaModel {
    @NameInMap("region")
    public String region;

    @NameInMap("cluster_type")
    public String clusterType;

    public static DescribeAddonsQuery build(java.util.Map<String, ?> map) throws Exception {
        DescribeAddonsQuery self = new DescribeAddonsQuery();
        return TeaModel.build(map, self);
    }

}
