// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateNetworkZoneRequest extends TeaModel {
    /**
     * <p>The idempotence token.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the network zone.</p>
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
     * <p>The IPv4 CIDR blocks of the network zone.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.0.0/0</p>
     */
    @NameInMap("Ipv4Cidrs")
    public java.util.List<String> ipv4Cidrs;

    /**
     * <p>The IPv6 CIDR blocks of the network zone.</p>
     * 
     * <strong>example:</strong>
     * <p>::/0</p>
     */
    @NameInMap("Ipv6Cidrs")
    public java.util.List<String> ipv6Cidrs;

    /**
     * <p>The name of the network zone.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IPV4Test</p>
     */
    @NameInMap("NetworkZoneName")
    public String networkZoneName;

    /**
     * <p>The type of the network zone.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>arn:alibaba:idaas:network:zone:classic</p>
     */
    @NameInMap("NetworkZoneType")
    public String networkZoneType;

    /**
     * <p>The ID of the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc_xxxxx</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateNetworkZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkZoneRequest self = new CreateNetworkZoneRequest();
        return TeaModel.build(map, self);
    }

    public CreateNetworkZoneRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateNetworkZoneRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateNetworkZoneRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateNetworkZoneRequest setIpv4Cidrs(java.util.List<String> ipv4Cidrs) {
        this.ipv4Cidrs = ipv4Cidrs;
        return this;
    }
    public java.util.List<String> getIpv4Cidrs() {
        return this.ipv4Cidrs;
    }

    public CreateNetworkZoneRequest setIpv6Cidrs(java.util.List<String> ipv6Cidrs) {
        this.ipv6Cidrs = ipv6Cidrs;
        return this;
    }
    public java.util.List<String> getIpv6Cidrs() {
        return this.ipv6Cidrs;
    }

    public CreateNetworkZoneRequest setNetworkZoneName(String networkZoneName) {
        this.networkZoneName = networkZoneName;
        return this;
    }
    public String getNetworkZoneName() {
        return this.networkZoneName;
    }

    public CreateNetworkZoneRequest setNetworkZoneType(String networkZoneType) {
        this.networkZoneType = networkZoneType;
        return this;
    }
    public String getNetworkZoneType() {
        return this.networkZoneType;
    }

    public CreateNetworkZoneRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
