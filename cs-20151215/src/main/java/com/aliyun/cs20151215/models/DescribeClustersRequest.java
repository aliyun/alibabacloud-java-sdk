// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClustersRequest extends TeaModel {
    @NameInMap("clusterType")
    public String clusterType;

    @NameInMap("name")
    public String name;

    public static DescribeClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClustersRequest self = new DescribeClustersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClustersRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public DescribeClustersRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
