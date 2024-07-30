// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateNetworkAccessEndpointNameRequest extends TeaModel {
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

    /**
     * <p>专属网络端点名称。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xx业务VPC访问端点</p>
     */
    @NameInMap("NetworkAccessEndpointName")
    public String networkAccessEndpointName;

    public static UpdateNetworkAccessEndpointNameRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNetworkAccessEndpointNameRequest self = new UpdateNetworkAccessEndpointNameRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNetworkAccessEndpointNameRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateNetworkAccessEndpointNameRequest setNetworkAccessEndpointId(String networkAccessEndpointId) {
        this.networkAccessEndpointId = networkAccessEndpointId;
        return this;
    }
    public String getNetworkAccessEndpointId() {
        return this.networkAccessEndpointId;
    }

    public UpdateNetworkAccessEndpointNameRequest setNetworkAccessEndpointName(String networkAccessEndpointName) {
        this.networkAccessEndpointName = networkAccessEndpointName;
        return this;
    }
    public String getNetworkAccessEndpointName() {
        return this.networkAccessEndpointName;
    }

}
