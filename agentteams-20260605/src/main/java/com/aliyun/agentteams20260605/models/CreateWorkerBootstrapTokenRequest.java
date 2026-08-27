// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateWorkerBootstrapTokenRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>inst-demo</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>worker-demo</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The network type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>INTRANET</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    public static CreateWorkerBootstrapTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkerBootstrapTokenRequest self = new CreateWorkerBootstrapTokenRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkerBootstrapTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateWorkerBootstrapTokenRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateWorkerBootstrapTokenRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

}
