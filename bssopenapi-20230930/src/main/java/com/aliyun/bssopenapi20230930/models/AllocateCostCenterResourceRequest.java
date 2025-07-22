// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class AllocateCostCenterResourceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>637180</p>
     */
    @NameInMap("FromCostCenterId")
    public Long fromCostCenterId;

    /**
     * <strong>example:</strong>
     * <p>1529600453335198</p>
     */
    @NameInMap("FromOwnerAccountId")
    public Long fromOwnerAccountId;

    /**
     * <strong>example:</strong>
     * <p>2684201000001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceInstanceList")
    public java.util.List<AllocateCostCenterResourceRequestResourceInstanceList> resourceInstanceList;

    /**
     * <strong>example:</strong>
     * <p>638288</p>
     */
    @NameInMap("ToCostCenterId")
    public Long toCostCenterId;

    public static AllocateCostCenterResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateCostCenterResourceRequest self = new AllocateCostCenterResourceRequest();
        return TeaModel.build(map, self);
    }

    public AllocateCostCenterResourceRequest setFromCostCenterId(Long fromCostCenterId) {
        this.fromCostCenterId = fromCostCenterId;
        return this;
    }
    public Long getFromCostCenterId() {
        return this.fromCostCenterId;
    }

    public AllocateCostCenterResourceRequest setFromOwnerAccountId(Long fromOwnerAccountId) {
        this.fromOwnerAccountId = fromOwnerAccountId;
        return this;
    }
    public Long getFromOwnerAccountId() {
        return this.fromOwnerAccountId;
    }

    public AllocateCostCenterResourceRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public AllocateCostCenterResourceRequest setResourceInstanceList(java.util.List<AllocateCostCenterResourceRequestResourceInstanceList> resourceInstanceList) {
        this.resourceInstanceList = resourceInstanceList;
        return this;
    }
    public java.util.List<AllocateCostCenterResourceRequestResourceInstanceList> getResourceInstanceList() {
        return this.resourceInstanceList;
    }

    public AllocateCostCenterResourceRequest setToCostCenterId(Long toCostCenterId) {
        this.toCostCenterId = toCostCenterId;
        return this;
    }
    public Long getToCostCenterId() {
        return this.toCostCenterId;
    }

    public static class AllocateCostCenterResourceRequestResourceInstanceList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>qwer1-cn-beijing</p>
         */
        @NameInMap("ApportionCode")
        public String apportionCode;

        /**
         * <strong>example:</strong>
         * <p>split-item-test1</p>
         */
        @NameInMap("ApportionName")
        public String apportionName;

        /**
         * <strong>example:</strong>
         * <p>oss</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <strong>example:</strong>
         * <p>RESOURCE_UDR</p>
         */
        @NameInMap("CommodityName")
        public String commodityName;

        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("PipCode")
        public String pipCode;

        /**
         * <strong>example:</strong>
         * <p>related-resource</p>
         */
        @NameInMap("RelatedResources")
        public String relatedResources;

        /**
         * <strong>example:</strong>
         * <p>xihe_mpp</p>
         */
        @NameInMap("ResourceGroup")
        public String resourceGroup;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou;standard</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>ecs-test-1</p>
         */
        @NameInMap("ResourceNick")
        public String resourceNick;

        /**
         * <strong>example:</strong>
         * <p>AUTO_ALLOCATE</p>
         */
        @NameInMap("ResourceSource")
        public String resourceSource;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ResourceStatus")
        public String resourceStatus;

        /**
         * <strong>example:</strong>
         * <p>tag-test1</p>
         */
        @NameInMap("ResourceTag")
        public String resourceTag;

        /**
         * <strong>example:</strong>
         * <p>SCU</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>273394581313325532</p>
         */
        @NameInMap("ResourceUserId")
        public Long resourceUserId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ResourceUserName")
        public String resourceUserName;

        public static AllocateCostCenterResourceRequestResourceInstanceList build(java.util.Map<String, ?> map) throws Exception {
            AllocateCostCenterResourceRequestResourceInstanceList self = new AllocateCostCenterResourceRequestResourceInstanceList();
            return TeaModel.build(map, self);
        }

        public AllocateCostCenterResourceRequestResourceInstanceList setApportionCode(String apportionCode) {
            this.apportionCode = apportionCode;
            return this;
        }
        public String getApportionCode() {
            return this.apportionCode;
        }

        public AllocateCostCenterResourceRequestResourceInstanceList setApportionName(String apportionName) {
            this.apportionName = apportionName;
            return this;
        }
        public String getApportionName() {
            return this.apportionName;
        }

        public AllocateCostCenterResourceRequestResourceInstanceList setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public AllocateCostCenterResourceRequestResourceInstanceList setCommodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }
        public String getCommodityName() {
            return this.commodityName;
        }

        public AllocateCostCenterResourceRequestResourceInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AllocateCostCenterResourceRequestResourceInstanceList setPipCode(String pipCode) {
            this.pipCode = pipCode;
            return this;
        }
        public String getPipCode() {
            return this.pipCode;
        }

        public AllocateCostCenterResourceRequestResourceInstanceList setRelatedResources(String relatedResources) {
            this.relatedResources = relatedResources;
            return this;
        }
        public String getRelatedResources() {
            return this.relatedResources;
        }

        public AllocateCostCenterResourceRequestResourceInstanceList setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public AllocateCostCenterResourceRequestResourceInstanceList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public AllocateCostCenterResourceRequestResourceInstanceList setResourceNick(String resourceNick) {
            this.resourceNick = resourceNick;
            return this;
        }
        public String getResourceNick() {
            return this.resourceNick;
        }

        public AllocateCostCenterResourceRequestResourceInstanceList setResourceSource(String resourceSource) {
            this.resourceSource = resourceSource;
            return this;
        }
        public String getResourceSource() {
            return this.resourceSource;
        }

        public AllocateCostCenterResourceRequestResourceInstanceList setResourceStatus(String resourceStatus) {
            this.resourceStatus = resourceStatus;
            return this;
        }
        public String getResourceStatus() {
            return this.resourceStatus;
        }

        public AllocateCostCenterResourceRequestResourceInstanceList setResourceTag(String resourceTag) {
            this.resourceTag = resourceTag;
            return this;
        }
        public String getResourceTag() {
            return this.resourceTag;
        }

        public AllocateCostCenterResourceRequestResourceInstanceList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public AllocateCostCenterResourceRequestResourceInstanceList setResourceUserId(Long resourceUserId) {
            this.resourceUserId = resourceUserId;
            return this;
        }
        public Long getResourceUserId() {
            return this.resourceUserId;
        }

        public AllocateCostCenterResourceRequestResourceInstanceList setResourceUserName(String resourceUserName) {
            this.resourceUserName = resourceUserName;
            return this;
        }
        public String getResourceUserName() {
            return this.resourceUserName;
        }

    }

}
