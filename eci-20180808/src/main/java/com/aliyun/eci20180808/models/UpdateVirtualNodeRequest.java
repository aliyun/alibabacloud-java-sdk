// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class UpdateVirtualNodeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotency of requests?</a></p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The IP address of the DNS server. If <code>dnsPolicy=ClusterFirst</code> is configured for the Elastic Container Instance pod, Elastic Container Instance uses the configuration to provide DNS services to containers. You can configure multiple IP addresses. Separate multiple IP addresses with commas (,).</p>
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
     * <p>The custom resources that are supported by the virtual node. If a custom resource is specified in the request of an Elastic Container Instance pod, the pod is scheduled to run on the virtual node that supports the custom resource. You can use the <code>Resource name = Number of resources</code> format to specify custom resources. Separate multiple resources with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>example1.com=100,example2.com=200</p>
     */
    @NameInMap("CustomResources")
    public String customResources;

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

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags to add to the virtual node.</p>
     */
    @NameInMap("Tag")
    public java.util.List<UpdateVirtualNodeRequestTag> tag;

    /**
     * <p>The ID of the virtual node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vnd-2ze960zkdqrldeaw****</p>
     */
    @NameInMap("VirtualNodeId")
    public String virtualNodeId;

    /**
     * <p>The name of the virtual node.</p>
     * 
     * <strong>example:</strong>
     * <p>testNode</p>
     */
    @NameInMap("VirtualNodeName")
    public String virtualNodeName;

    public static UpdateVirtualNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVirtualNodeRequest self = new UpdateVirtualNodeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVirtualNodeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateVirtualNodeRequest setClusterDNS(String clusterDNS) {
        this.clusterDNS = clusterDNS;
        return this;
    }
    public String getClusterDNS() {
        return this.clusterDNS;
    }

    public UpdateVirtualNodeRequest setClusterDomain(String clusterDomain) {
        this.clusterDomain = clusterDomain;
        return this;
    }
    public String getClusterDomain() {
        return this.clusterDomain;
    }

    public UpdateVirtualNodeRequest setCustomResources(String customResources) {
        this.customResources = customResources;
        return this;
    }
    public String getCustomResources() {
        return this.customResources;
    }

    public UpdateVirtualNodeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateVirtualNodeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateVirtualNodeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateVirtualNodeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateVirtualNodeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateVirtualNodeRequest setTag(java.util.List<UpdateVirtualNodeRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<UpdateVirtualNodeRequestTag> getTag() {
        return this.tag;
    }

    public UpdateVirtualNodeRequest setVirtualNodeId(String virtualNodeId) {
        this.virtualNodeId = virtualNodeId;
        return this;
    }
    public String getVirtualNodeId() {
        return this.virtualNodeId;
    }

    public UpdateVirtualNodeRequest setVirtualNodeName(String virtualNodeName) {
        this.virtualNodeName = virtualNodeName;
        return this;
    }
    public String getVirtualNodeName() {
        return this.virtualNodeName;
    }

    public static class UpdateVirtualNodeRequestTag extends TeaModel {
        /**
         * <p>The key of tag N to add to the virtual node.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the virtual node.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateVirtualNodeRequestTag build(java.util.Map<String, ?> map) throws Exception {
            UpdateVirtualNodeRequestTag self = new UpdateVirtualNodeRequestTag();
            return TeaModel.build(map, self);
        }

        public UpdateVirtualNodeRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateVirtualNodeRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
