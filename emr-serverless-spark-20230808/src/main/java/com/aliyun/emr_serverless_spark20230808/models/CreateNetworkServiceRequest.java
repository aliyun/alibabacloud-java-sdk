// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CreateNetworkServiceRequest extends TeaModel {
    /**
     * <p>A token to ensure the idempotency of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>acaf8f54-d40e-4c33-a900-f6c1b345cb47</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The name of the network service.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The ID of the security group.</p>
     * 
     * <strong>example:</strong>
     * <p>securityGroupId</p>
     */
    @NameInMap("securityGroupId")
    public String securityGroupId;

    /**
     * <p>The type of the network service.</p>
     * 
     * <strong>example:</strong>
     * <p>type</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The ID of the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1g14f566kbk8jex****</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    /**
     * <p>A list of vSwitch IDs.</p>
     */
    @NameInMap("vswitchIds")
    public java.util.List<String> vswitchIds;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static CreateNetworkServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkServiceRequest self = new CreateNetworkServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateNetworkServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateNetworkServiceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateNetworkServiceRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateNetworkServiceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateNetworkServiceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateNetworkServiceRequest setVswitchIds(java.util.List<String> vswitchIds) {
        this.vswitchIds = vswitchIds;
        return this;
    }
    public java.util.List<String> getVswitchIds() {
        return this.vswitchIds;
    }

    public CreateNetworkServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
