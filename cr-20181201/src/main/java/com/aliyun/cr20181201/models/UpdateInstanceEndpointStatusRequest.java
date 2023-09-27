// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateInstanceEndpointStatusRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the instance endpoint. Valid values:</p>
     * <br>
     * <p>*   `true`: enables the instance endpoint.</p>
     * <p>*   `false`: disables the instance endpoint</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The type of the endpoint. Set the value to Internet.</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the module that you want to access. Valid values:</p>
     * <br>
     * <p>*   `Registry`: the image repository.</p>
     * <p>*   `Chart`: a Helm chart.</p>
     */
    @NameInMap("ModuleName")
    public String moduleName;

    public static UpdateInstanceEndpointStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceEndpointStatusRequest self = new UpdateInstanceEndpointStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceEndpointStatusRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdateInstanceEndpointStatusRequest setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public UpdateInstanceEndpointStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateInstanceEndpointStatusRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

}
