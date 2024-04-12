// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class CreateVirtualNodeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that the value is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The IP address of the DNS server. If dnsPolicy=ClusterFirst is configured for the Elastic Container Instance pod, Elastic Container Instance uses the configuration to provide DNS services to containers. You can configure multiple IP addresses. Separate multiple IP addresses with commas (,).</p>
     */
    @NameInMap("ClusterDNS")
    public String clusterDNS;

    /**
     * <p>The domain name of the cluster. If this parameter is specified, in addition to the search domain of the host, Kubelet configures all containers to search for the specified domain name.</p>
     */
    @NameInMap("ClusterDomain")
    public String clusterDomain;

    /**
     * <p>The custom resources that are supported by the virtual node. If a custom resource is specified in the request of an Elastic Container Instance pod, the pod is scheduled to run on the virtual node that supports the custom resource. You can use the Resource name = Number of resources format to specify custom resources. Separate multiple resources with commas (,).</p>
     */
    @NameInMap("CustomResources")
    public String customResources;

    /**
     * <p>The ID of the elastic IP address (EIP).</p>
     */
    @NameInMap("EipInstanceId")
    public String eipInstanceId;

    /**
     * <p>Specifies whether to enable Internet access for the VNode. Default value: false.</p>
     * <br>
     * <p>If the value of this parameter is true, the VNode exposes a public IP address to external services.</p>
     */
    @NameInMap("EnablePublicNetwork")
    public Boolean enablePublicNetwork;

    /**
     * <p>KubeConfig of the Kubernetes cluster to which the VNode is to be connected. The value must be Base64-encoded.</p>
     */
    @NameInMap("KubeConfig")
    public String kubeConfig;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the virtual node.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the security group. The VNode and the elastic container instances in the VNode are added to the security group.</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>Tag.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateVirtualNodeRequestTag> tag;

    /**
     * <p>Taint.</p>
     */
    @NameInMap("Taint")
    public java.util.List<CreateVirtualNodeRequestTaint> taint;

    /**
     * <p>Specifies whether to enable TLS bootstrapping. If you set this parameter to true, use the KubeConfig certificate for TLS bootstrapping. Valid values:</p>
     * <br>
     * <p>- true</p>
     * <p>- false</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("TlsBootstrapEnabled")
    public Boolean tlsBootstrapEnabled;

    /**
     * <p>The ID of the vSwitch. The vSwitch is connected to the VNode and the elastic container instances in the VNode.</p>
     * <br>
     * <p>You can specify 1 to 10 vSwitches for a VPC.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The name of the VNode. The name must be 2 to 128 characters in length, and can contain lowercase letters, digits, periods (.), and hyphens (-).</p>
     */
    @NameInMap("VirtualNodeName")
    public String virtualNodeName;

    /**
     * <p>The zone ID of the VNode.</p>
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

    public CreateVirtualNodeRequest setTag(java.util.List<CreateVirtualNodeRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateVirtualNodeRequestTag> getTag() {
        return this.tag;
    }

    public CreateVirtualNodeRequest setTaint(java.util.List<CreateVirtualNodeRequestTaint> taint) {
        this.taint = taint;
        return this;
    }
    public java.util.List<CreateVirtualNodeRequestTaint> getTaint() {
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

    public static class CreateVirtualNodeRequestTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateVirtualNodeRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateVirtualNodeRequestTag self = new CreateVirtualNodeRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateVirtualNodeRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateVirtualNodeRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateVirtualNodeRequestTaint extends TeaModel {
        /**
         * <p>The effect of taint N. Valid values of N: 1 to 20. Valid values:</p>
         * <br>
         * <p>- NoSchedule: No pods are scheduled to the nodes that have the taint.</p>
         * <p>- NoExecute: Existing pods in the node are evicted while no pods are scheduled to the nodes that have the taint.</p>
         * <p>- PreferNoSchedule: Pods are preferentially not scheduled to the nodes that have the taint.</p>
         */
        @NameInMap("Effect")
        public String effect;

        /**
         * <p>The key of taint.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of taint.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateVirtualNodeRequestTaint build(java.util.Map<String, ?> map) throws Exception {
            CreateVirtualNodeRequestTaint self = new CreateVirtualNodeRequestTaint();
            return TeaModel.build(map, self);
        }

        public CreateVirtualNodeRequestTaint setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public CreateVirtualNodeRequestTaint setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateVirtualNodeRequestTaint setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
