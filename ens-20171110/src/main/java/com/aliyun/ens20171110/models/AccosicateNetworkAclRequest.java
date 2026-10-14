// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AccosicateNetworkAclRequest extends TeaModel {
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
     * <p>The information about the associated resources.</p>
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
         * <p>The ID of the associated resource.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>n-5****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the associated resource. Valid values:</p>
         * <ul>
         * <li><strong>Network</strong>: network.</li>
         * </ul>
         * <p><strong>N</strong> ranges from 0 to 29. You can associate up to 30 resources.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Network</p>
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
