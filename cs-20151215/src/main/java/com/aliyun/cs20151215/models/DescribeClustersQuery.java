// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClustersQuery extends TeaModel {
    @NameInMap("name")
    public String name;

    @NameInMap("clusterType")
    public String clusterType;

    public static DescribeClustersQuery build(java.util.Map<String, ?> map) throws Exception {
        DescribeClustersQuery self = new DescribeClustersQuery();
        return TeaModel.build(map, self);
    }

}
