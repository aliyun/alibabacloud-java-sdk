// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsSaleControlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SaleControl")
    public java.util.List<DescribeEnsSaleControlResponseBodySaleControl> saleControl;

    public static DescribeEnsSaleControlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsSaleControlResponseBody self = new DescribeEnsSaleControlResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEnsSaleControlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEnsSaleControlResponseBody setSaleControl(java.util.List<DescribeEnsSaleControlResponseBodySaleControl> saleControl) {
        this.saleControl = saleControl;
        return this;
    }
    public java.util.List<DescribeEnsSaleControlResponseBodySaleControl> getSaleControl() {
        return this.saleControl;
    }

    public static class DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControlModuleValue extends TeaModel {
        @NameInMap("ModuleMaxValue")
        public String moduleMaxValue;

        @NameInMap("ModuleMinValue")
        public String moduleMinValue;

        @NameInMap("ModuleValue")
        public java.util.List<String> moduleValue;

        public static DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControlModuleValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControlModuleValue self = new DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControlModuleValue();
            return TeaModel.build(map, self);
        }

        public DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControlModuleValue setModuleMaxValue(String moduleMaxValue) {
            this.moduleMaxValue = moduleMaxValue;
            return this;
        }
        public String getModuleMaxValue() {
            return this.moduleMaxValue;
        }

        public DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControlModuleValue setModuleMinValue(String moduleMinValue) {
            this.moduleMinValue = moduleMinValue;
            return this;
        }
        public String getModuleMinValue() {
            return this.moduleMinValue;
        }

        public DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControlModuleValue setModuleValue(java.util.List<String> moduleValue) {
            this.moduleValue = moduleValue;
            return this;
        }
        public java.util.List<String> getModuleValue() {
            return this.moduleValue;
        }

    }

    public static class DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControl extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("ModuleValue")
        public DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControlModuleValue moduleValue;

        @NameInMap("Operator")
        public String operator;

        public static DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControl build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControl self = new DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControl();
            return TeaModel.build(map, self);
        }

        public DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControl setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControl setModuleValue(DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControlModuleValue moduleValue) {
            this.moduleValue = moduleValue;
            return this;
        }
        public DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControlModuleValue getModuleValue() {
            return this.moduleValue;
        }

        public DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControl setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

    }

    public static class DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlConditionControl extends TeaModel {
        @NameInMap("ConditionControlModuleCode")
        public String conditionControlModuleCode;

        @NameInMap("ConditionControlModuleValue")
        public String conditionControlModuleValue;

        public static DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlConditionControl build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlConditionControl self = new DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlConditionControl();
            return TeaModel.build(map, self);
        }

        public DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlConditionControl setConditionControlModuleCode(String conditionControlModuleCode) {
            this.conditionControlModuleCode = conditionControlModuleCode;
            return this;
        }
        public String getConditionControlModuleCode() {
            return this.conditionControlModuleCode;
        }

        public DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlConditionControl setConditionControlModuleValue(String conditionControlModuleValue) {
            this.conditionControlModuleValue = conditionControlModuleValue;
            return this;
        }
        public String getConditionControlModuleValue() {
            return this.conditionControlModuleValue;
        }

    }

    public static class DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlModuleValue extends TeaModel {
        @NameInMap("ModuleMaxValue")
        public String moduleMaxValue;

        @NameInMap("ModuleMinValue")
        public String moduleMinValue;

        @NameInMap("ModuleValue")
        public java.util.List<String> moduleValue;

        public static DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlModuleValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlModuleValue self = new DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlModuleValue();
            return TeaModel.build(map, self);
        }

        public DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlModuleValue setModuleMaxValue(String moduleMaxValue) {
            this.moduleMaxValue = moduleMaxValue;
            return this;
        }
        public String getModuleMaxValue() {
            return this.moduleMaxValue;
        }

        public DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlModuleValue setModuleMinValue(String moduleMinValue) {
            this.moduleMinValue = moduleMinValue;
            return this;
        }
        public String getModuleMinValue() {
            return this.moduleMinValue;
        }

        public DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlModuleValue setModuleValue(java.util.List<String> moduleValue) {
            this.moduleValue = moduleValue;
            return this;
        }
        public java.util.List<String> getModuleValue() {
            return this.moduleValue;
        }

    }

    public static class DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControl extends TeaModel {
        @NameInMap("ConditionControl")
        public DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlConditionControl conditionControl;

        @NameInMap("Description")
        public String description;

        @NameInMap("ModuleValue")
        public DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlModuleValue moduleValue;

        @NameInMap("Operator")
        public String operator;

        public static DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControl build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControl self = new DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControl();
            return TeaModel.build(map, self);
        }

        public DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControl setConditionControl(DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlConditionControl conditionControl) {
            this.conditionControl = conditionControl;
            return this;
        }
        public DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlConditionControl getConditionControl() {
            return this.conditionControl;
        }

        public DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControl setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControl setModuleValue(DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlModuleValue moduleValue) {
            this.moduleValue = moduleValue;
            return this;
        }
        public DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControlModuleValue getModuleValue() {
            return this.moduleValue;
        }

        public DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControl setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

    }

    public static class DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItem extends TeaModel {
        @NameInMap("BasicSaleControl")
        public DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControl basicSaleControl;

        @NameInMap("ConditionSaleControl")
        public java.util.List<DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControl> conditionSaleControl;

        public static DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItem self = new DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItem();
            return TeaModel.build(map, self);
        }

        public DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItem setBasicSaleControl(DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControl basicSaleControl) {
            this.basicSaleControl = basicSaleControl;
            return this;
        }
        public DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemBasicSaleControl getBasicSaleControl() {
            return this.basicSaleControl;
        }

        public DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItem setConditionSaleControl(java.util.List<DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControl> conditionSaleControl) {
            this.conditionSaleControl = conditionSaleControl;
            return this;
        }
        public java.util.List<DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItemConditionSaleControl> getConditionSaleControl() {
            return this.conditionSaleControl;
        }

    }

    public static class DescribeEnsSaleControlResponseBodySaleControlSaleControlItems extends TeaModel {
        @NameInMap("ModuleCode")
        public String moduleCode;

        @NameInMap("SaleControlItem")
        public DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItem saleControlItem;

        public static DescribeEnsSaleControlResponseBodySaleControlSaleControlItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsSaleControlResponseBodySaleControlSaleControlItems self = new DescribeEnsSaleControlResponseBodySaleControlSaleControlItems();
            return TeaModel.build(map, self);
        }

        public DescribeEnsSaleControlResponseBodySaleControlSaleControlItems setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public DescribeEnsSaleControlResponseBodySaleControlSaleControlItems setSaleControlItem(DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItem saleControlItem) {
            this.saleControlItem = saleControlItem;
            return this;
        }
        public DescribeEnsSaleControlResponseBodySaleControlSaleControlItemsSaleControlItem getSaleControlItem() {
            return this.saleControlItem;
        }

    }

    public static class DescribeEnsSaleControlResponseBodySaleControl extends TeaModel {
        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("OrderType")
        public String orderType;

        @NameInMap("SaleControlItems")
        public java.util.List<DescribeEnsSaleControlResponseBodySaleControlSaleControlItems> saleControlItems;

        public static DescribeEnsSaleControlResponseBodySaleControl build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsSaleControlResponseBodySaleControl self = new DescribeEnsSaleControlResponseBodySaleControl();
            return TeaModel.build(map, self);
        }

        public DescribeEnsSaleControlResponseBodySaleControl setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeEnsSaleControlResponseBodySaleControl setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public DescribeEnsSaleControlResponseBodySaleControl setSaleControlItems(java.util.List<DescribeEnsSaleControlResponseBodySaleControlSaleControlItems> saleControlItems) {
            this.saleControlItems = saleControlItems;
            return this;
        }
        public java.util.List<DescribeEnsSaleControlResponseBodySaleControlSaleControlItems> getSaleControlItems() {
            return this.saleControlItems;
        }

    }

}
