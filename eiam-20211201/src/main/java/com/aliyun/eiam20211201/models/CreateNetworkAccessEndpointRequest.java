// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateNetworkAccessEndpointRequest extends TeaModel {
    /**
     * <p>Idempotent token.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The region ID of the VPC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Private network endpoint name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eiam-vpc-access-endpoint</p>
     */
    @NameInMap("NetworkAccessEndpointName")
    public String networkAccessEndpointName;

    /**
     * <p>The IDs of vSwitches.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-examplexxx</p>
     */
    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    /**
     * <p>The ID of the VPC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-examplexxx</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The region ID of the outbound VPC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("VpcRegionId")
    public String vpcRegionId;

    public static CreateNetworkAccessEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkAccessEndpointRequest self = new CreateNetworkAccessEndpointRequest();
        return TeaModel.build(map, self);
    }

    public CreateNetworkAccessEndpointRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateNetworkAccessEndpointRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateNetworkAccessEndpointRequest setNetworkAccessEndpointName(String networkAccessEndpointName) {
        this.networkAccessEndpointName = networkAccessEndpointName;
        return this;
    }
    public String getNetworkAccessEndpointName() {
        return this.networkAccessEndpointName;
    }

    public CreateNetworkAccessEndpointRequest setVSwitchIds(java.util.List<String> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    public CreateNetworkAccessEndpointRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateNetworkAccessEndpointRequest setVpcRegionId(String vpcRegionId) {
        this.vpcRegionId = vpcRegionId;
        return this;
    }
    public String getVpcRegionId() {
        return this.vpcRegionId;
    }

}
