// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateNetworkZoneRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>client-token-examplexxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

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
     * <p>包含的CIDR</p>
     */
    @NameInMap("Ipv4Cidrs")
    public java.util.List<String> ipv4Cidrs;

    /**
     * <p>网络区域ipv6Cidr</p>
     */
    @NameInMap("Ipv6Cidrs")
    public java.util.List<String> ipv6Cidrs;

    /**
     * <p>IDaaS的网络区域主键id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>network_11111</p>
     */
    @NameInMap("NetworkZoneId")
    public String networkZoneId;

    /**
     * <p>网络区域名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IPV4Test</p>
     */
    @NameInMap("NetworkZoneName")
    public String networkZoneName;

    /**
     * <p>专有网络VpcId</p>
     * 
     * <strong>example:</strong>
     * <p>vpc_xxxxx</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static UpdateNetworkZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNetworkZoneRequest self = new UpdateNetworkZoneRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNetworkZoneRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateNetworkZoneRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateNetworkZoneRequest setIpv4Cidrs(java.util.List<String> ipv4Cidrs) {
        this.ipv4Cidrs = ipv4Cidrs;
        return this;
    }
    public java.util.List<String> getIpv4Cidrs() {
        return this.ipv4Cidrs;
    }

    public UpdateNetworkZoneRequest setIpv6Cidrs(java.util.List<String> ipv6Cidrs) {
        this.ipv6Cidrs = ipv6Cidrs;
        return this;
    }
    public java.util.List<String> getIpv6Cidrs() {
        return this.ipv6Cidrs;
    }

    public UpdateNetworkZoneRequest setNetworkZoneId(String networkZoneId) {
        this.networkZoneId = networkZoneId;
        return this;
    }
    public String getNetworkZoneId() {
        return this.networkZoneId;
    }

    public UpdateNetworkZoneRequest setNetworkZoneName(String networkZoneName) {
        this.networkZoneName = networkZoneName;
        return this;
    }
    public String getNetworkZoneName() {
        return this.networkZoneName;
    }

    public UpdateNetworkZoneRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
