// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class AllocateCostUnitResourceRequest extends TeaModel {
    /**
     * <p>The ID of the source cost center.</p>
     * <ul>
     * <li>A value of 0 indicates that the resources to be transferred have not been allocated to a cost center.</li>
     * <li>A value greater than 0 indicates the ID of an existing cost center.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FromUnitId")
    public Long fromUnitId;

    /**
     * <p>The user ID of the owner of the source cost center.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>273394581313325532</p>
     */
    @NameInMap("FromUnitUserId")
    public Long fromUnitUserId;

    /**
     * <p>The resource instances to be transferred.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceInstanceList")
    public java.util.List<AllocateCostUnitResourceRequestResourceInstanceList> resourceInstanceList;

    /**
     * <p>The ID of the destination cost center.</p>
     * <ul>
     * <li>A value of -1 indicates that the allocated resources are changed to unallocated.</li>
     * <li>A value greater than 0 indicates the ID of an existing cost center.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>186419</p>
     */
    @NameInMap("ToUnitId")
    public Long toUnitId;

    /**
     * <p>The user ID of the owner of the destination cost center.</p>
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
         * <p>The split item of the shared instance. This parameter is required only for shared instances.</p>
         * <ul>
         * <li>Eight cloud services support bill splitting. The commodity codes of the eight services are oss, dcdn, snapshot, vod, cdn, live, cbwp, and pcdn.</li>
         * <li>You can obtain the split item of a shared instance by calling QueryCostUnitResource operation to obtain all resource instances within a cost center.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>qwer1-cn-beijing</p>
         */
        @NameInMap("ApportionCode")
        public String apportionCode;

        /**
         * <p>The commodity code of the resource instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The ID of the resource instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou;standard</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The user ID of the resource instance owner.</p>
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
