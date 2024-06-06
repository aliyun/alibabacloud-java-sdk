// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetInventoryListResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("data")
    public GetInventoryListResponseBodyData data;

    /**
     * <p>The ID of the request. The value is unique for each request. This facilitates subsequent troubleshooting.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetInventoryListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInventoryListResponseBody self = new GetInventoryListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInventoryListResponseBody setData(GetInventoryListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInventoryListResponseBodyData getData() {
        return this.data;
    }

    public GetInventoryListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInventoryListResponseBodyDataItems extends TeaModel {
        /**
         * <p>Emission quantity: may be positive, negative, or 0. To ensure the calculation accuracy, 24 decimal places are reserved for the calculation process. We recommend that you intercept data based on your business requirements.</p>
         */
        @NameInMap("carbonEmission")
        public Double carbonEmission;

        /**
         * <p>Name </p>
         * <br>
         * <p>> The name is related to the request parameters group. Request parameters: resource, return name parameter meaning: list name; request parameters: process, return name parameter meaning: process name; request parameters: resourceType, return name parameter meaning: inventory resource type name; request parameters: processType, return name parameter meaning: flow name.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Percentage</p>
         */
        @NameInMap("percent")
        public String percent;

        /**
         * <p>Process Name: It is only meaningful when the request parameters group is resource.</p>
         */
        @NameInMap("processName")
        public String processName;

        public static GetInventoryListResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            GetInventoryListResponseBodyDataItems self = new GetInventoryListResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public GetInventoryListResponseBodyDataItems setCarbonEmission(Double carbonEmission) {
            this.carbonEmission = carbonEmission;
            return this;
        }
        public Double getCarbonEmission() {
            return this.carbonEmission;
        }

        public GetInventoryListResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetInventoryListResponseBodyDataItems setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public GetInventoryListResponseBodyDataItems setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

    }

    public static class GetInventoryListResponseBodyData extends TeaModel {
        /**
         * <p>Inventory detail.</p>
         */
        @NameInMap("items")
        public java.util.List<GetInventoryListResponseBodyDataItems> items;

        /**
         * <p>Unit of product.</p>
         */
        @NameInMap("productUnit")
        public String productUnit;

        /**
         * <p>Emission Unit: The default value is kgCO₂ /productUnit. productUnit is the unit selected for the product. The unit value is changed to tCO₂ e/productUnit or gCO₂ e/productUnit based on the emission quantity. For more information, see the quantity column.</p>
         */
        @NameInMap("unit")
        public String unit;

        public static GetInventoryListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInventoryListResponseBodyData self = new GetInventoryListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInventoryListResponseBodyData setItems(java.util.List<GetInventoryListResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetInventoryListResponseBodyDataItems> getItems() {
            return this.items;
        }

        public GetInventoryListResponseBodyData setProductUnit(String productUnit) {
            this.productUnit = productUnit;
            return this;
        }
        public String getProductUnit() {
            return this.productUnit;
        }

        public GetInventoryListResponseBodyData setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
