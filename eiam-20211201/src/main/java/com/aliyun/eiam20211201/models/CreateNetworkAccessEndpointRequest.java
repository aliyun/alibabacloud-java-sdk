// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateNetworkAccessEndpointRequest extends TeaModel {
    /**
     * <p>Ensures the idempotency of the request. Generate a parameter value from your client to ensure uniqueness across different requests. ClientToken supports only ASCII characters and cannot exceed 64 characters. For more information, see <a href="https://www.alibabacloud.com/help/en/ecs/developer-reference/how-to-ensure-idempotence">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Network access endpoint name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Xx-business VPC access endpoint</p>
     */
    @NameInMap("NetworkAccessEndpointName")
    public String networkAccessEndpointName;

    /**
     * <p>List of specified vSwitches connected to the network access endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-examplexxx</p>
     */
    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    /**
     * <p>VPC ID connected to the network access endpoint.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-examplexxx</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>Region of the VPC ID connected to the network access endpoint.</p>
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
