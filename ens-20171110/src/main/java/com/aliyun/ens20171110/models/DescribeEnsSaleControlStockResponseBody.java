// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsSaleControlStockResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SaleControl")
    public java.util.List<DescribeEnsSaleControlStockResponseBodySaleControl> saleControl;

    public static DescribeEnsSaleControlStockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsSaleControlStockResponseBody self = new DescribeEnsSaleControlStockResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEnsSaleControlStockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEnsSaleControlStockResponseBody setSaleControl(java.util.List<DescribeEnsSaleControlStockResponseBodySaleControl> saleControl) {
        this.saleControl = saleControl;
        return this;
    }
    public java.util.List<DescribeEnsSaleControlStockResponseBodySaleControl> getSaleControl() {
        return this.saleControl;
    }

    public static class DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControlModuleValue extends TeaModel {
        @NameInMap("ModuleMaxValue")
        public String moduleMaxValue;

        @NameInMap("ModuleMinValue")
        public String moduleMinValue;

        public static DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControlModuleValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControlModuleValue self = new DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControlModuleValue();
            return TeaModel.build(map, self);
        }

        public DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControlModuleValue setModuleMaxValue(String moduleMaxValue) {
            this.moduleMaxValue = moduleMaxValue;
            return this;
        }
        public String getModuleMaxValue() {
            return this.moduleMaxValue;
        }

        public DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControlModuleValue setModuleMinValue(String moduleMinValue) {
            this.moduleMinValue = moduleMinValue;
            return this;
        }
        public String getModuleMinValue() {
            return this.moduleMinValue;
        }

    }

    public static class DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControl extends TeaModel {
        @NameInMap("ModuleValue")
        public DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControlModuleValue moduleValue;

        @NameInMap("StockValue")
        public String stockValue;

        public static DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControl build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControl self = new DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControl();
            return TeaModel.build(map, self);
        }

        public DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControl setModuleValue(DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControlModuleValue moduleValue) {
            this.moduleValue = moduleValue;
            return this;
        }
        public DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControlModuleValue getModuleValue() {
            return this.moduleValue;
        }

        public DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControl setStockValue(String stockValue) {
            this.stockValue = stockValue;
            return this;
        }
        public String getStockValue() {
            return this.stockValue;
        }

    }

    public static class DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlConditionControl extends TeaModel {
        @NameInMap("ConditionControlModuleCode")
        public String conditionControlModuleCode;

        @NameInMap("ConditionControlModuleValue")
        public String conditionControlModuleValue;

        public static DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlConditionControl build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlConditionControl self = new DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlConditionControl();
            return TeaModel.build(map, self);
        }

        public DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlConditionControl setConditionControlModuleCode(String conditionControlModuleCode) {
            this.conditionControlModuleCode = conditionControlModuleCode;
            return this;
        }
        public String getConditionControlModuleCode() {
            return this.conditionControlModuleCode;
        }

        public DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlConditionControl setConditionControlModuleValue(String conditionControlModuleValue) {
            this.conditionControlModuleValue = conditionControlModuleValue;
            return this;
        }
        public String getConditionControlModuleValue() {
            return this.conditionControlModuleValue;
        }

    }

    public static class DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlModuleValue extends TeaModel {
        @NameInMap("ModuleMaxValue")
        public String moduleMaxValue;

        @NameInMap("ModuleMinValue")
        public String moduleMinValue;

        public static DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlModuleValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlModuleValue self = new DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlModuleValue();
            return TeaModel.build(map, self);
        }

        public DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlModuleValue setModuleMaxValue(String moduleMaxValue) {
            this.moduleMaxValue = moduleMaxValue;
            return this;
        }
        public String getModuleMaxValue() {
            return this.moduleMaxValue;
        }

        public DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlModuleValue setModuleMinValue(String moduleMinValue) {
            this.moduleMinValue = moduleMinValue;
            return this;
        }
        public String getModuleMinValue() {
            return this.moduleMinValue;
        }

    }

    public static class DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControl extends TeaModel {
        @NameInMap("ConditionControl")
        public DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlConditionControl conditionControl;

        @NameInMap("ModuleValue")
        public DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlModuleValue moduleValue;

        @NameInMap("StockValue")
        public String stockValue;

        public static DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControl build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControl self = new DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControl();
            return TeaModel.build(map, self);
        }

        public DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControl setConditionControl(DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlConditionControl conditionControl) {
            this.conditionControl = conditionControl;
            return this;
        }
        public DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlConditionControl getConditionControl() {
            return this.conditionControl;
        }

        public DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControl setModuleValue(DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlModuleValue moduleValue) {
            this.moduleValue = moduleValue;
            return this;
        }
        public DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlModuleValue getModuleValue() {
            return this.moduleValue;
        }

        public DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControl setStockValue(String stockValue) {
            this.stockValue = stockValue;
            return this;
        }
        public String getStockValue() {
            return this.stockValue;
        }

    }

    public static class DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItem extends TeaModel {
        @NameInMap("BasicSaleControl")
        public DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControl basicSaleControl;

        @NameInMap("ConditionSaleControl")
        public java.util.List<DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControl> conditionSaleControl;

        public static DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItem self = new DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItem();
            return TeaModel.build(map, self);
        }

        public DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItem setBasicSaleControl(DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControl basicSaleControl) {
            this.basicSaleControl = basicSaleControl;
            return this;
        }
        public DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControl getBasicSaleControl() {
            return this.basicSaleControl;
        }

        public DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItem setConditionSaleControl(java.util.List<DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControl> conditionSaleControl) {
            this.conditionSaleControl = conditionSaleControl;
            return this;
        }
        public java.util.List<DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControl> getConditionSaleControl() {
            return this.conditionSaleControl;
        }

    }

    public static class DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItems extends TeaModel {
        @NameInMap("ModuleCode")
        public String moduleCode;

        @NameInMap("SaleControlItem")
        public DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItem saleControlItem;

        public static DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItems self = new DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItems();
            return TeaModel.build(map, self);
        }

        public DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItems setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItems setSaleControlItem(DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItem saleControlItem) {
            this.saleControlItem = saleControlItem;
            return this;
        }
        public DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItemsSaleControlItem getSaleControlItem() {
            return this.saleControlItem;
        }

    }

    public static class DescribeEnsSaleControlStockResponseBodySaleControl extends TeaModel {
        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("OrderType")
        public String orderType;

        @NameInMap("SaleControlItems")
        public java.util.List<DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItems> saleControlItems;

        public static DescribeEnsSaleControlStockResponseBodySaleControl build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsSaleControlStockResponseBodySaleControl self = new DescribeEnsSaleControlStockResponseBodySaleControl();
            return TeaModel.build(map, self);
        }

        public DescribeEnsSaleControlStockResponseBodySaleControl setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeEnsSaleControlStockResponseBodySaleControl setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public DescribeEnsSaleControlStockResponseBodySaleControl setSaleControlItems(java.util.List<DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItems> saleControlItems) {
            this.saleControlItems = saleControlItems;
            return this;
        }
        public java.util.List<DescribeEnsSaleControlStockResponseBodySaleControlSaleControlItems> getSaleControlItems() {
            return this.saleControlItems;
        }

    }

}
