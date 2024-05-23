// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UnassociateNetworkAclRequest extends TeaModel {
    /**
     * <p>The ID of the network ACL that you want to disassociate from a resource.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NetworkAclId")
    public String networkAclId;

    /**
     * <p>Resources that you want to disassociate. Valid values of **N**: 0 to 29. A maximum of 30 resources can be unbound.</p>
     * <br>
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
         * <p>The ID of the resource that you want to disassociate.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the resource that you want to disassociate. Valid values:</p>
         * <br>
         * <p>*   Network</p>
         * <br>
         * <p>This parameter is required.</p>
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
