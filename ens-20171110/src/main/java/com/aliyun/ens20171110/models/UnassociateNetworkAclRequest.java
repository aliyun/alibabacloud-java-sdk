// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UnassociateNetworkAclRequest extends TeaModel {
    /**
     * <p>The ID of the network ACL.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nacl-a2do9e413e0sp****</p>
     */
    @NameInMap("NetworkAclId")
    public String networkAclId;

    /**
     * <p>The list of resources to disassociate. Valid values of N: 1 to 30. The resources must be associated with the network ACL by calling the AssociateNetworkAcl operation, and the current association status must be BINDED.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Resource")
    public java.util.List<UnassociateNetworkAclRequestResource> resource;

    public static UnassociateNetworkAclRequest build(java.util.Map<String, ?> map) throws Exception {
        UnassociateNetworkAclRequest self = new UnassociateNetworkAclRequest();
        return TeaModel.build(map, self);
    }

    public UnassociateNetworkAclRequest setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }
    public String getNetworkAclId() {
        return this.networkAclId;
    }

    public UnassociateNetworkAclRequest setResource(java.util.List<UnassociateNetworkAclRequestResource> resource) {
        this.resource = resource;
        return this;
    }
    public java.util.List<UnassociateNetworkAclRequestResource> getResource() {
        return this.resource;
    }

    public static class UnassociateNetworkAclRequestResource extends TeaModel {
        /**
         * <p>The ID of the associated resource to disassociate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>n-5***</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the associated resource to disassociate. Valid values:</p>
         * <ul>
         * <li>Network: network.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Network</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static UnassociateNetworkAclRequestResource build(java.util.Map<String, ?> map) throws Exception {
            UnassociateNetworkAclRequestResource self = new UnassociateNetworkAclRequestResource();
            return TeaModel.build(map, self);
        }

        public UnassociateNetworkAclRequestResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public UnassociateNetworkAclRequestResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
