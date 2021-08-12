// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class AllocateCostUnitResourceRequest extends TeaModel {
    @NameInMap("FromUnitUserId")
    public Long fromUnitUserId;

    @NameInMap("FromUnitId")
    public Long fromUnitId;

    @NameInMap("ToUnitUserId")
    public Long toUnitUserId;

    @NameInMap("ToUnitId")
    public Long toUnitId;

    @NameInMap("ResourceInstanceList")
    public java.util.List<AllocateCostUnitResourceRequestResourceInstanceList> resourceInstanceList;

    public static AllocateCostUnitResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateCostUnitResourceRequest self = new AllocateCostUnitResourceRequest();
        return TeaModel.build(map, self);
    }

    public AllocateCostUnitResourceRequest setFromUnitUserId(Long fromUnitUserId) {
        this.fromUnitUserId = fromUnitUserId;
        return this;
    }
    public Long getFromUnitUserId() {
        return this.fromUnitUserId;
    }

    public AllocateCostUnitResourceRequest setFromUnitId(Long fromUnitId) {
        this.fromUnitId = fromUnitId;
        return this;
    }
    public Long getFromUnitId() {
        return this.fromUnitId;
    }

    public AllocateCostUnitResourceRequest setToUnitUserId(Long toUnitUserId) {
        this.toUnitUserId = toUnitUserId;
        return this;
    }
    public Long getToUnitUserId() {
        return this.toUnitUserId;
    }

    public AllocateCostUnitResourceRequest setToUnitId(Long toUnitId) {
        this.toUnitId = toUnitId;
        return this;
    }
    public Long getToUnitId() {
        return this.toUnitId;
    }

    public AllocateCostUnitResourceRequest setResourceInstanceList(java.util.List<AllocateCostUnitResourceRequestResourceInstanceList> resourceInstanceList) {
        this.resourceInstanceList = resourceInstanceList;
        return this;
    }
    public java.util.List<AllocateCostUnitResourceRequestResourceInstanceList> getResourceInstanceList() {
        return this.resourceInstanceList;
    }

    public static class AllocateCostUnitResourceRequestResourceInstanceList extends TeaModel {
        @NameInMap("ApportionCode")
        public String apportionCode;

        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("ResourceUserId")
        public Long resourceUserId;

        @NameInMap("ResourceId")
        public String resourceId;

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

        public AllocateCostUnitResourceRequestResourceInstanceList setResourceUserId(Long resourceUserId) {
            this.resourceUserId = resourceUserId;
            return this;
        }
        public Long getResourceUserId() {
            return this.resourceUserId;
        }

        public AllocateCostUnitResourceRequestResourceInstanceList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

}
