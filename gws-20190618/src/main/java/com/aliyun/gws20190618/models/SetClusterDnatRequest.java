// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class SetClusterDnatRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("NatId")
    public String natId;

    @NameInMap("NatEip")
    public String natEip;

    public static SetClusterDnatRequest build(java.util.Map<String, ?> map) throws Exception {
        SetClusterDnatRequest self = new SetClusterDnatRequest();
        return TeaModel.build(map, self);
    }

    public SetClusterDnatRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public SetClusterDnatRequest setNatId(String natId) {
        this.natId = natId;
        return this;
    }
    public String getNatId() {
        return this.natId;
    }

    public SetClusterDnatRequest setNatEip(String natEip) {
        this.natEip = natEip;
        return this;
    }
    public String getNatEip() {
        return this.natEip;
    }

}
