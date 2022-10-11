// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetEnvironmentDeliveryInstanceRequest extends TeaModel {
    @NameInMap("clusterUID")
    public String clusterUID;

    @NameInMap("envUID")
    public String envUID;

    public static GetEnvironmentDeliveryInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEnvironmentDeliveryInstanceRequest self = new GetEnvironmentDeliveryInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetEnvironmentDeliveryInstanceRequest setClusterUID(String clusterUID) {
        this.clusterUID = clusterUID;
        return this;
    }
    public String getClusterUID() {
        return this.clusterUID;
    }

    public GetEnvironmentDeliveryInstanceRequest setEnvUID(String envUID) {
        this.envUID = envUID;
        return this;
    }
    public String getEnvUID() {
        return this.envUID;
    }

}
