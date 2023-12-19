// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpdateContainerClusterRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("RenewToken")
    public Boolean renewToken;

    public static UpdateContainerClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContainerClusterRequest self = new UpdateContainerClusterRequest();
        return TeaModel.build(map, self);
    }

    public UpdateContainerClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateContainerClusterRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateContainerClusterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateContainerClusterRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public UpdateContainerClusterRequest setRenewToken(Boolean renewToken) {
        this.renewToken = renewToken;
        return this;
    }
    public Boolean getRenewToken() {
        return this.renewToken;
    }

}
