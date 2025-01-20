// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class UnbindConfigGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceInfos")
    public java.util.List<UnbindConfigGroupRequestResourceInfos> resourceInfos;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Timer</p>
     */
    @NameInMap("Type")
    public String type;

    public static UnbindConfigGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindConfigGroupRequest self = new UnbindConfigGroupRequest();
        return TeaModel.build(map, self);
    }

    public UnbindConfigGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UnbindConfigGroupRequest setResourceInfos(java.util.List<UnbindConfigGroupRequestResourceInfos> resourceInfos) {
        this.resourceInfos = resourceInfos;
        return this;
    }
    public java.util.List<UnbindConfigGroupRequestResourceInfos> getResourceInfos() {
        return this.resourceInfos;
    }

    public UnbindConfigGroupRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class UnbindConfigGroupRequestResourceInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CLOUD_DESKTOP</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <strong>example:</strong>
         * <p>ecd-ctwj0bk3l5nz****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>cn-chengdu</p>
         */
        @NameInMap("ResourceRegionId")
        public String resourceRegionId;

        /**
         * <strong>example:</strong>
         * <p>CLOUD_DESKTOP</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static UnbindConfigGroupRequestResourceInfos build(java.util.Map<String, ?> map) throws Exception {
            UnbindConfigGroupRequestResourceInfos self = new UnbindConfigGroupRequestResourceInfos();
            return TeaModel.build(map, self);
        }

        public UnbindConfigGroupRequestResourceInfos setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public UnbindConfigGroupRequestResourceInfos setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public UnbindConfigGroupRequestResourceInfos setResourceRegionId(String resourceRegionId) {
            this.resourceRegionId = resourceRegionId;
            return this;
        }
        public String getResourceRegionId() {
            return this.resourceRegionId;
        }

        public UnbindConfigGroupRequestResourceInfos setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
