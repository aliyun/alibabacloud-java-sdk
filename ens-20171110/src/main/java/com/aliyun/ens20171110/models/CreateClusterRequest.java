// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    /**
     * <p>The version of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>1.18.8</p>
     */
    @NameInMap("ClusterVersion")
    public String clusterVersion;

    /**
     * <p>The name of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>mycluster-1</p>
     */
    @NameInMap("Name")
    public String name;

    public static CreateClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterRequest self = new CreateClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterRequest setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }
    public String getClusterVersion() {
        return this.clusterVersion;
    }

    public CreateClusterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
