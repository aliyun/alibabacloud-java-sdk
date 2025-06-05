// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class CreateVirtualNodeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that the value is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The IP address of the DNS server. If dnsPolicy=ClusterFirst is configured for the Elastic Container Instance pod, Elastic Container Instance uses the configuration to provide DNS services to containers. You can configure multiple IP addresses. Separate multiple IP addresses with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>100.1.XX.XX</p>
     */
    @NameInMap("ClusterDNS")
    public String clusterDNS;

    /**
     * <p>The domain name of the cluster. If this parameter is specified, in addition to the search domain of the host, Kubelet configures all containers to search for the specified domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("ClusterDomain")
    public String clusterDomain;

    /**
     * <p>The custom resources that are supported by the virtual node. If a custom resource is specified in the request of an Elastic Container Instance pod, the pod is scheduled to run on the virtual node that supports the custom resource. You can use the Resource name = Number of resources format to specify custom resources. Separate multiple resources with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>example1.com=100,example2.com=200</p>
     */
    @NameInMap("CustomResources")
    public String customResources;

    /**
     * <p>The ID of the elastic IP address (EIP).</p>
     * 
     * <strong>example:</strong>
     * <p>eip-uf66jeqopgqa9hdn****</p>
     */
    @NameInMap("EipInstanceId")
    public String eipInstanceId;

    /**
     * <p>Specifies whether to enable Internet access for the VNode. Default value: false.</p>
     * <p>If the value of this parameter is true, the VNode exposes a public IP address to external services.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnablePublicNetwork")
    public Boolean enablePublicNetwork;

    /**
     * <p>The KubeConfig of the Kubernetes cluster with which the VNode is connected. The value must be Base64-encoded.</p>
     * 
     * <strong>example:</strong>
     * <p>JTVDbmFwaVZlcnNpb24lM0ElMjB2MSU1Q25jbHVzdGVycyUzQSU1Q24tJTIwY2x1c3RlciUzQSU1Q24uLi******</p>
     */
    @NameInMap("KubeConfig")
    public String kubeConfig;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the virtual node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-uf66jeqopgqa9hdn****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the security group. The VNode and the elastic container instances in the VNode are added to the security group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-2ze81zoc3yl7a3we****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The tags to add to the VNode. You can add up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<Tag> tag;

    /**
     * <p>The taints of the VNode. You can configure up to 20 taints.</p>
     */
    @NameInMap("Taint")
    public java.util.List<Taint> taint;

    /**
     * <p>Specifies whether to enable TLS bootstrapping. If you set this parameter to true, use the KubeConfig certificate for TLS bootstrapping. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("TlsBootstrapEnabled")
    public Boolean tlsBootstrapEnabled;

    /**
     * <p>The ID of the vSwitch. The vSwitch is connected to the VNode and the elastic container instances in the VNode.</p>
     * <p>You can specify 1 to 10 vSwitches for a VPC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-2ze23nqzig8inprou****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The name of the VNode. The name must be 2 to 128 characters in length, and can contain lowercase letters, digits, periods (.), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>testNode</p>
     */
    @NameInMap("VirtualNodeName")
    public String virtualNodeName;

    /**
     * <p>The zone ID of the VNode.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateVirtualNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualNodeRequest self = new CreateVirtualNodeRequest();
        return TeaModel.build(map, self);
    }

    public CreateVirtualNodeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateVirtualNodeRequest setClusterDNS(String clusterDNS) {
        this.clusterDNS = clusterDNS;
        return this;
    }
    public String getClusterDNS() {
        return this.clusterDNS;
    }

    public CreateVirtualNodeRequest setClusterDomain(String clusterDomain) {
        this.clusterDomain = clusterDomain;
        return this;
    }
    public String getClusterDomain() {
        return this.clusterDomain;
    }

    public CreateVirtualNodeRequest setCustomResources(String customResources) {
        this.customResources = customResources;
        return this;
    }
    public String getCustomResources() {
        return this.customResources;
    }

    public CreateVirtualNodeRequest setEipInstanceId(String eipInstanceId) {
        this.eipInstanceId = eipInstanceId;
        return this;
    }
    public String getEipInstanceId() {
        return this.eipInstanceId;
    }

    public CreateVirtualNodeRequest setEnablePublicNetwork(Boolean enablePublicNetwork) {
        this.enablePublicNetwork = enablePublicNetwork;
        return this;
    }
    public Boolean getEnablePublicNetwork() {
        return this.enablePublicNetwork;
    }

    public CreateVirtualNodeRequest setKubeConfig(String kubeConfig) {
        this.kubeConfig = kubeConfig;
        return this;
    }
    public String getKubeConfig() {
        return this.kubeConfig;
    }

    public CreateVirtualNodeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateVirtualNodeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateVirtualNodeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVirtualNodeRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateVirtualNodeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateVirtualNodeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateVirtualNodeRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateVirtualNodeRequest setTag(java.util.List<Tag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public CreateVirtualNodeRequest setTaint(java.util.List<Taint> taint) {
        this.taint = taint;
        return this;
    }
    public java.util.List<Taint> getTaint() {
        return this.taint;
    }

    public CreateVirtualNodeRequest setTlsBootstrapEnabled(Boolean tlsBootstrapEnabled) {
        this.tlsBootstrapEnabled = tlsBootstrapEnabled;
        return this;
    }
    public Boolean getTlsBootstrapEnabled() {
        return this.tlsBootstrapEnabled;
    }

    public CreateVirtualNodeRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateVirtualNodeRequest setVirtualNodeName(String virtualNodeName) {
        this.virtualNodeName = virtualNodeName;
        return this;
    }
    public String getVirtualNodeName() {
        return this.virtualNodeName;
    }

    public CreateVirtualNodeRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class Tag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static Tag build(java.util.Map<String, ?> map) throws Exception {
            Tag self = new Tag();
            return TeaModel.build(map, self);
        }

        public Tag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public Tag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class Taint extends TeaModel {
        /**
         * <p>The effect of the taint. Valid values:</p>
         * <ul>
         * <li>NoSchedule: does not schedule pods to run on the VNodes that have the taint.</li>
         * <li>NoExecute: evicts existing pods on the VNodes that have the taint while not scheduling pods to run on the VNodes.</li>
         * <li>PreferNoSchedule: avoids scheduling pods to run on the VNodes that have the taint.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NoSchedule</p>
         */
        @NameInMap("Effect")
        public String effect;

        /**
         * <p>The key of the taint.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the taint.</p>
         * 
         * <strong>example:</strong>
         * <p>testValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static Taint build(java.util.Map<String, ?> map) throws Exception {
            Taint self = new Taint();
            return TeaModel.build(map, self);
        }

        public Taint setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public Taint setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public Taint setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
