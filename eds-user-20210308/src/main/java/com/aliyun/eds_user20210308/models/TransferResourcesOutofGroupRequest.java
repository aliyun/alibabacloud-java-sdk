// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class TransferResourcesOutofGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("BusinessChannel")
    public String businessChannel;

    /**
     * <strong>example:</strong>
     * <p>AliyunConsole</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <strong>example:</strong>
     * <p>rg-66konqltcpx43****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Resources")
    public java.util.List<TransferResourcesOutofGroupRequestResources> resources;

    /**
     * <strong>example:</strong>
     * <p>rg-hcjo6dugpo1****</p>
     */
    @NameInMap("TargetResourceGroupId")
    public String targetResourceGroupId;

    public static TransferResourcesOutofGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferResourcesOutofGroupRequest self = new TransferResourcesOutofGroupRequest();
        return TeaModel.build(map, self);
    }

    public TransferResourcesOutofGroupRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    public TransferResourcesOutofGroupRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public TransferResourcesOutofGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public TransferResourcesOutofGroupRequest setResources(java.util.List<TransferResourcesOutofGroupRequestResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<TransferResourcesOutofGroupRequestResources> getResources() {
        return this.resources;
    }

    public TransferResourcesOutofGroupRequest setTargetResourceGroupId(String targetResourceGroupId) {
        this.targetResourceGroupId = targetResourceGroupId;
        return this;
    }
    public String getTargetResourceGroupId() {
        return this.targetResourceGroupId;
    }

    public static class TransferResourcesOutofGroupRequestResources extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>ecd-1shc5sk0vo****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>DESKTOP</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static TransferResourcesOutofGroupRequestResources build(java.util.Map<String, ?> map) throws Exception {
            TransferResourcesOutofGroupRequestResources self = new TransferResourcesOutofGroupRequestResources();
            return TeaModel.build(map, self);
        }

        public TransferResourcesOutofGroupRequestResources setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public TransferResourcesOutofGroupRequestResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public TransferResourcesOutofGroupRequestResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
