// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateNetworkZoneDescriptionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>client-token-examplexxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>网络区域描述</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>测试描述</p>
     */
    @NameInMap("Description")
    public String description;

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
     * <p>IDaaS的网络区域主键id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>network_11111</p>
     */
    @NameInMap("NetworkZoneId")
    public String networkZoneId;

    public static UpdateNetworkZoneDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNetworkZoneDescriptionRequest self = new UpdateNetworkZoneDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNetworkZoneDescriptionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateNetworkZoneDescriptionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateNetworkZoneDescriptionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateNetworkZoneDescriptionRequest setNetworkZoneId(String networkZoneId) {
        this.networkZoneId = networkZoneId;
        return this;
    }
    public String getNetworkZoneId() {
        return this.networkZoneId;
    }

}
