// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetInstanceEndpointRequest extends TeaModel {
    @NameInMap("EndpointType")
    public String endpointType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ModuleName")
    public String moduleName;

    @NameInMap("RegionId")
    public String regionId;

    public static GetInstanceEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceEndpointRequest self = new GetInstanceEndpointRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceEndpointRequest setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public GetInstanceEndpointRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceEndpointRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public GetInstanceEndpointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
