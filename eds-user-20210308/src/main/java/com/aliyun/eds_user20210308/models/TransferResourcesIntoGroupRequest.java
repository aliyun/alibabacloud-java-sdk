// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class TransferResourcesIntoGroupRequest extends TeaModel {
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
     * <p>rg-ckf3cx7isinhk***</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Resources")
    public java.util.List<TransferResourcesIntoGroupRequestResources> resources;

    public static TransferResourcesIntoGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferResourcesIntoGroupRequest self = new TransferResourcesIntoGroupRequest();
        return TeaModel.build(map, self);
    }

    public TransferResourcesIntoGroupRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    public TransferResourcesIntoGroupRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public TransferResourcesIntoGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public TransferResourcesIntoGroupRequest setResources(java.util.List<TransferResourcesIntoGroupRequestResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<TransferResourcesIntoGroupRequestResources> getResources() {
        return this.resources;
    }

    public static class TransferResourcesIntoGroupRequestResources extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>ecd-0jl0dwz61hn59tto****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>DESKTOP</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static TransferResourcesIntoGroupRequestResources build(java.util.Map<String, ?> map) throws Exception {
            TransferResourcesIntoGroupRequestResources self = new TransferResourcesIntoGroupRequestResources();
            return TeaModel.build(map, self);
        }

        public TransferResourcesIntoGroupRequestResources setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public TransferResourcesIntoGroupRequestResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public TransferResourcesIntoGroupRequestResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
