// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetInstanceEndpointRequest extends TeaModel {
    /**
     * <p>The endpoint type. Only Internet is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>internet</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-xkx6vujuhay0****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The access module. Valid values:</p>
     * <ul>
     * <li><p><code>Registry</code>: image repository</p>
     * </li>
     * <li><p><code>Chart</code>: Helm chart</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Registry</p>
     */
    @NameInMap("ModuleName")
    public String moduleName;

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

}
