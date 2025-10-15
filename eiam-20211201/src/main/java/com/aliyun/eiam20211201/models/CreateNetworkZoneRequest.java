// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateNetworkZoneRequest extends TeaModel {
    /**
     * <p>保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符，且不能超过64个字符。</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>网络区域描述</p>
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
     * <p>网络区域ipv4Cidr</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.0.0/0</p>
     */
    @NameInMap("Ipv4Cidrs")
    public java.util.List<String> ipv4Cidrs;

    /**
     * <p>网络区域ipv6Cidr</p>
     * 
     * <strong>example:</strong>
     * <p>::/0</p>
     */
    @NameInMap("Ipv6Cidrs")
    public java.util.List<String> ipv6Cidrs;

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
     * <p>网络区域类型</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>arn:alibaba:idaas:network:zone:classic</p>
     */
    @NameInMap("NetworkZoneType")
    public String networkZoneType;

    /**
     * <p>专有网络VpcId</p>
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
