// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetInstanceVpcEndpointRequest extends TeaModel {
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

}
