// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetEngineNamepaceRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ClusterId")
    public String clusterId;

    public static GetEngineNamepaceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEngineNamepaceRequest self = new GetEngineNamepaceRequest();
        return TeaModel.build(map, self);
    }

    public GetEngineNamepaceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetEngineNamepaceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetEngineNamepaceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
