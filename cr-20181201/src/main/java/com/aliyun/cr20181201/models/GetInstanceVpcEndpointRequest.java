// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetInstanceVpcEndpointRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ModuleName")
    public String moduleName;

    @NameInMap("RegionId")
    public String regionId;

    public static GetInstanceVpcEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceVpcEndpointRequest self = new GetInstanceVpcEndpointRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceVpcEndpointRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceVpcEndpointRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public GetInstanceVpcEndpointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
