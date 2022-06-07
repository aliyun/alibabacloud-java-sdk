// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class AddResourceSnapshotRequest extends TeaModel {
    @NameInMap("clusterUID")
    public String clusterUID;

    @NameInMap("productVersionUID")
    public String productVersionUID;

    public static AddResourceSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        AddResourceSnapshotRequest self = new AddResourceSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public AddResourceSnapshotRequest setClusterUID(String clusterUID) {
        this.clusterUID = clusterUID;
        return this;
    }
    public String getClusterUID() {
        return this.clusterUID;
    }

    public AddResourceSnapshotRequest setProductVersionUID(String productVersionUID) {
        this.productVersionUID = productVersionUID;
        return this;
    }
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

}
