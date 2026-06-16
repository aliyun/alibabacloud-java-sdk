// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateNetworkZoneDescriptionRequest extends TeaModel {
    /**
     * <p>A client token. It is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-examplexxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the network zone.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The network zone ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>network_m5wsaclfvfrf5623xnirgxxxxx</p>
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
