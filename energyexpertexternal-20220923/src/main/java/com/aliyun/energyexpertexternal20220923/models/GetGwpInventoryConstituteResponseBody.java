// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetGwpInventoryConstituteResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("data")
    public GetGwpInventoryConstituteResponseBodyData data;

    /**
     * <p>The ID of the request. The value is unique for each request. This facilitates subsequent troubleshooting.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetGwpInventoryConstituteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGwpInventoryConstituteResponseBody self = new GetGwpInventoryConstituteResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGwpInventoryConstituteResponseBody setData(GetGwpInventoryConstituteResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGwpInventoryConstituteResponseBodyData getData() {
        return this.data;
    }

    public GetGwpInventoryConstituteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetGwpInventoryConstituteResponseBodyData extends TeaModel {
        /**
         * <p>Aggregated by resource type of an inventory.</p>
         */
        @NameInMap("byResourceType")
        public java.util.List<GwpInventoryConstitute> byResourceType;

        /**
         * <p>Emission quantity: may be positive, negative, or 0. To ensure the calculation accuracy, 24 decimal places are reserved for the calculation process. We recommend that you intercept data based on your business requirements.</p>
         */
        @NameInMap("carbonEmission")
        public Double carbonEmission;

        /**
         * <p>Organized by hierarchy from high to low, according to the flow-> process-> inventory hierarchy.</p>
         */
        @NameInMap("items")
        public java.util.List<GwpInventoryConstitute> items;

        /**
         * <p>The name.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Emission Unit.</p>
         */
        @NameInMap("unit")
        public String unit;

        public static GetGwpInventoryConstituteResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGwpInventoryConstituteResponseBodyData self = new GetGwpInventoryConstituteResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGwpInventoryConstituteResponseBodyData setByResourceType(java.util.List<GwpInventoryConstitute> byResourceType) {
            this.byResourceType = byResourceType;
            return this;
        }
        public java.util.List<GwpInventoryConstitute> getByResourceType() {
            return this.byResourceType;
        }

        public GetGwpInventoryConstituteResponseBodyData setCarbonEmission(Double carbonEmission) {
            this.carbonEmission = carbonEmission;
            return this;
        }
        public Double getCarbonEmission() {
            return this.carbonEmission;
        }

        public GetGwpInventoryConstituteResponseBodyData setItems(java.util.List<GwpInventoryConstitute> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GwpInventoryConstitute> getItems() {
            return this.items;
        }

        public GetGwpInventoryConstituteResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGwpInventoryConstituteResponseBodyData setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
