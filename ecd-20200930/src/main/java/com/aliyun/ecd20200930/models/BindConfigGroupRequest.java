// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class BindConfigGroupRequest extends TeaModel {
    /**
     * <p>The ID of the configuration group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccg-0chlk9b65lj8z****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the region. Set the value to <code>cn-shanghai</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resources to which you want to bind the configuration group.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceInfos")
    public java.util.List<BindConfigGroupRequestResourceInfos> resourceInfos;

    public static BindConfigGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        BindConfigGroupRequest self = new BindConfigGroupRequest();
        return TeaModel.build(map, self);
    }

    public BindConfigGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public BindConfigGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public BindConfigGroupRequest setResourceInfos(java.util.List<BindConfigGroupRequestResourceInfos> resourceInfos) {
        this.resourceInfos = resourceInfos;
        return this;
    }
    public java.util.List<BindConfigGroupRequestResourceInfos> getResourceInfos() {
        return this.resourceInfos;
    }

    public static class BindConfigGroupRequestResourceInfos extends TeaModel {
        /**
         * <p>The service type of the resource.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>CLOUD_DESKTOP: the cloud computer service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CLOUD_DESKTOP</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-1bo4xotjvwyon****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The region ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("ResourceRegionId")
        public String resourceRegionId;

        /**
         * <p>The type of the resource.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>RESOURCE_GROUP: the resource group</li>
         * <li>CLOUD_DESKTOP: the cloud computer service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CLOUD_DESKTOP</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static BindConfigGroupRequestResourceInfos build(java.util.Map<String, ?> map) throws Exception {
            BindConfigGroupRequestResourceInfos self = new BindConfigGroupRequestResourceInfos();
            return TeaModel.build(map, self);
        }

        public BindConfigGroupRequestResourceInfos setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public BindConfigGroupRequestResourceInfos setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public BindConfigGroupRequestResourceInfos setResourceRegionId(String resourceRegionId) {
            this.resourceRegionId = resourceRegionId;
            return this;
        }
        public String getResourceRegionId() {
            return this.resourceRegionId;
        }

        public BindConfigGroupRequestResourceInfos setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
