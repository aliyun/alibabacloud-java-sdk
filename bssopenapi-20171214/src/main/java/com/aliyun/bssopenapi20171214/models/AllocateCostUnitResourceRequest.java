// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class AllocateCostUnitResourceRequest extends TeaModel {
    /**
     * <p>The ID of the source financial unit. This parameter is required.</p>
     * <ul>
     * <li>0 indicates the unallocated financial unit ID.</li>
     * <li>A value greater than 0 indicates an allocated financial unit ID.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FromUnitId")
    public Long fromUnitId;

    /**
     * <p>The ID of the owner of the source financial unit. This parameter is required.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>273394581313325532</p>
     */
    @NameInMap("FromUnitUserId")
    public Long fromUnitUserId;

    /**
     * <p>The list of resource instances.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceInstanceList")
    public java.util.List<AllocateCostUnitResourceRequestResourceInstanceList> resourceInstanceList;

    /**
     * <p>The ID of the destination financial unit. Valid values:</p>
     * <ul>
     * <li>-1: moves the allocated resource to the unallocated state.</li>
     * <li>A value greater than 0: allocates the resource to the specified financial unit.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>186419</p>
     */
    @NameInMap("ToUnitId")
    public Long toUnitId;

    /**
     * <p>The ID of the owner of the destination financial unit.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>241021678450941490</p>
     */
    @NameInMap("ToUnitUserId")
    public Long toUnitUserId;

    public static AllocateCostUnitResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateCostUnitResourceRequest self = new AllocateCostUnitResourceRequest();
        return TeaModel.build(map, self);
    }

    public AllocateCostUnitResourceRequest setFromUnitId(Long fromUnitId) {
        this.fromUnitId = fromUnitId;
        return this;
    }
    public Long getFromUnitId() {
        return this.fromUnitId;
    }

    public AllocateCostUnitResourceRequest setFromUnitUserId(Long fromUnitUserId) {
        this.fromUnitUserId = fromUnitUserId;
        return this;
    }
    public Long getFromUnitUserId() {
        return this.fromUnitUserId;
    }

    public AllocateCostUnitResourceRequest setResourceInstanceList(java.util.List<AllocateCostUnitResourceRequestResourceInstanceList> resourceInstanceList) {
        this.resourceInstanceList = resourceInstanceList;
        return this;
    }
    public java.util.List<AllocateCostUnitResourceRequestResourceInstanceList> getResourceInstanceList() {
        return this.resourceInstanceList;
    }

    public AllocateCostUnitResourceRequest setToUnitId(Long toUnitId) {
        this.toUnitId = toUnitId;
        return this;
    }
    public Long getToUnitId() {
        return this.toUnitId;
    }

    public AllocateCostUnitResourceRequest setToUnitUserId(Long toUnitUserId) {
        this.toUnitUserId = toUnitUserId;
        return this;
    }
    public Long getToUnitUserId() {
        return this.toUnitUserId;
    }

    public static class AllocateCostUnitResourceRequestResourceInstanceList extends TeaModel {
        /**
         * <p>The attached resource type of the attached-resource-based instance. This parameter is required only for attached-resource-based product instances.</p>
         * <ul>
         * <li>Currently, eight commodities support attached resources. Their commodity codes are oss, dcdn, snapshot, vod, cdn, live, and cbwp.</li>
         * <li>This attached resource field is typically obtained by calling QueryCostUnitResource to retrieve all billing instances (including attached-resource-based instances with attached resource information) under a specific financial unit (including the unallocated unit) of a user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>qwer1-cn-beijing</p>
         */
        @NameInMap("ApportionCode")
        public String apportionCode;

        /**
         * <p>The commodity code of the billing instance. This parameter is required.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The instance ID of the billing instance. This parameter is required.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou;standard</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The ID of the owner of the billing instance. This parameter is required.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>273394581313325532</p>
         */
        @NameInMap("ResourceUserId")
        public Long resourceUserId;

        public static AllocateCostUnitResourceRequestResourceInstanceList build(java.util.Map<String, ?> map) throws Exception {
            AllocateCostUnitResourceRequestResourceInstanceList self = new AllocateCostUnitResourceRequestResourceInstanceList();
            return TeaModel.build(map, self);
        }

        public AllocateCostUnitResourceRequestResourceInstanceList setApportionCode(String apportionCode) {
            this.apportionCode = apportionCode;
            return this;
        }
        public String getApportionCode() {
            return this.apportionCode;
        }

        public AllocateCostUnitResourceRequestResourceInstanceList setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public AllocateCostUnitResourceRequestResourceInstanceList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public AllocateCostUnitResourceRequestResourceInstanceList setResourceUserId(Long resourceUserId) {
            this.resourceUserId = resourceUserId;
            return this;
        }
        public Long getResourceUserId() {
            return this.resourceUserId;
        }

    }

}
