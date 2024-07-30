// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteNetworkAccessEndpointRequest extends TeaModel {
    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>专属网络端点ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nae_examplexxxx</p>
     */
    @NameInMap("NetworkAccessEndpointId")
    public String networkAccessEndpointId;

    public static DeleteNetworkAccessEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkAccessEndpointRequest self = new DeleteNetworkAccessEndpointRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkAccessEndpointRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteNetworkAccessEndpointRequest setNetworkAccessEndpointId(String networkAccessEndpointId) {
        this.networkAccessEndpointId = networkAccessEndpointId;
        return this;
    }
    public String getNetworkAccessEndpointId() {
        return this.networkAccessEndpointId;
    }

}
