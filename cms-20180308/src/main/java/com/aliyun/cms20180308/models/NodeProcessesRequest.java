// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class NodeProcessesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static NodeProcessesRequest build(java.util.Map<String, ?> map) throws Exception {
        NodeProcessesRequest self = new NodeProcessesRequest();
        return TeaModel.build(map, self);
    }

    public NodeProcessesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public NodeProcessesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
