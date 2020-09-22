// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20180418.models;

import com.aliyun.tea.*;

public class DescribeClustersQuery extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("clusterType")
    public String clusterType;

    public static DescribeClustersQuery build(java.util.Map<String, ?> map) throws Exception {
        DescribeClustersQuery self = new DescribeClustersQuery();
        return TeaModel.build(map, self);
    }

    public DescribeClustersQuery setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeClustersQuery setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

}
