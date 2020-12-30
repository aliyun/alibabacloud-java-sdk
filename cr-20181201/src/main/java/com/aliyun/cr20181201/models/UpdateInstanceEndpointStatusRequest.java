// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateInstanceEndpointStatusRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("EndpointType")
    public String endpointType;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("ModuleName")
    public String moduleName;

    public static UpdateInstanceEndpointStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceEndpointStatusRequest self = new UpdateInstanceEndpointStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceEndpointStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateInstanceEndpointStatusRequest setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public UpdateInstanceEndpointStatusRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdateInstanceEndpointStatusRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

}
