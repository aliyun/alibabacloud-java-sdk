// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AccosicateNetworkAclRequest extends TeaModel {
    /**
     * <p>The ID of the network ACL.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NetworkAclId")
    public String networkAclId;

    /**
     * <p>The information about the resources with which you want to associate the network ACL.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Resource")
    public java.util.List<AccosicateNetworkAclRequestResource> resource;

    public static AccosicateNetworkAclRequest build(java.util.Map<String, ?> map) throws Exception {
        AccosicateNetworkAclRequest self = new AccosicateNetworkAclRequest();
        return TeaModel.build(map, self);
    }

    public AccosicateNetworkAclRequest setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }
    public String getNetworkAclId() {
        return this.networkAclId;
    }

    public AccosicateNetworkAclRequest setResource(java.util.List<AccosicateNetworkAclRequestResource> resource) {
        this.resource = resource;
        return this;
    }
    public java.util.List<AccosicateNetworkAclRequestResource> getResource() {
        return this.resource;
    }

    public static class AccosicateNetworkAclRequestResource extends TeaModel {
        /**
         * <p>The ID of the resource with which you want to associate the network ACL.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of resource with which you want to associate the network ACL. Set the value to **Network**.</p>
         * <br>
         * <p>****</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static AccosicateNetworkAclRequestResource build(java.util.Map<String, ?> map) throws Exception {
            AccosicateNetworkAclRequestResource self = new AccosicateNetworkAclRequestResource();
            return TeaModel.build(map, self);
        }

        public AccosicateNetworkAclRequestResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public AccosicateNetworkAclRequestResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
