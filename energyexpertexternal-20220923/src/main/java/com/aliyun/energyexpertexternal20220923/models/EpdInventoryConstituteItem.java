// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class EpdInventoryConstituteItem extends TeaModel {
    /**
     * <p>Emissions are presented with 24 decimal places. It\&quot;s advisable to utilize the truncated version. These emissions encompass all tiers: At the first level, they reflect the product\&quot;s total emissions under the current environmental impact; at the second level, they show the process\&quot;s total emissions; and at the third level, they represent the inventory\&quot;s emissions within the same environmental impact context.</p>
     * 
     * <strong>example:</strong>
     * <p>1009.976265540000000000000000000000</p>
     */
    @NameInMap("carbonEmission")
    public Double carbonEmission;

    /**
     * <p>The value of the factor. Only the third level is not empty. The factor in the inventory information indicates the factor value of the selected factor. The factor value is kept to four decimal places after the decimal point, and &quot;1.0000&quot; indicates that the factor value is 1. The factor value should be used in combination with factorUnit. If factorUnit is &quot;kg CO2-Eq mg/kg&quot;, it means that the carbon emission per 1kg of the list is 1kg CO2-Eq.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0000</p>
     */
    @NameInMap("factor")
    public String factor;

    /**
     * <p>The database to which the factorDataset factor belongs. This field is used in conjunction with factorType. If factorType is 1, the data name of the factor is displayed. If factorType is 2,factorId indicates the ID of the referenced product. If factorType is null,factorId is meaningless. This field is a new field. Old data may not have data in this field and is displayed as &quot;/&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("factorDataset")
    public String factorDataset;

    /**
     * <p>The id of the factor.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("factorId")
    public String factorId;

    /**
     * <p>The key of the factor type. Only the third level is not empty. The factorType in the inventory information indicates that the factor source type is selected; the optional values are 1, 2, or null:1: factor library, 2: product library. null indicates that the factor is not selected from the factor library or product library, and the factor is constructed by the user.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("factorType")
    public Integer factorType;

    /**
     * <p>Factor Unit</p>
     * 
     * <strong>example:</strong>
     * <p>kg CO2-Eq/kg</p>
     */
    @NameInMap("factorUnit")
    public String factorUnit;

    /**
     * <p>manifest id</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("inventoryId")
    public Long inventoryId;

    /**
     * <p>Inventory Unit</p>
     * 
     * <strong>example:</strong>
     * <p>t</p>
     */
    @NameInMap("inventoryUnit")
    public String inventoryUnit;

    /**
     * <p>The quantity of the inventory. It is not empty only at the third level. The third level is the inventory details. This field indicates the id of the inventory. It should be used in conjunction with the InventoryUnit.</p>
     * 
     * <strong>example:</strong>
     * <p>2.000000000000000000000000</p>
     */
    @NameInMap("inventoryValue")
    public Double inventoryValue;

    /**
     * <p>Activity data per functional unit: only the third level is not empty; the value retains 24 decimal places, indicating the number of activities per functional unit; should be used in conjunction with the inventoryValuePerProductUnit.</p>
     * 
     * <strong>example:</strong>
     * <p>1.000000000000000000000000</p>
     */
    @NameInMap("inventoryValuePerProduct")
    public Double inventoryValuePerProduct;

    /**
     * <p>Unit of activity data per functional unit. Only the third level is not empty. in the inventory information indicates the unit of activity data per functional unit.</p>
     * 
     * <strong>example:</strong>
     * <p>kg</p>
     */
    @NameInMap("inventoryValuePerProductUnit")
    public String inventoryValuePerProductUnit;

    /**
     * <p>List of children</p>
     */
    @NameInMap("items")
    public java.util.List<EpdInventoryConstituteItem> items;

    /**
     * <p>Returns the name of the current level. The names of different levels have different meanings. The first level returns the environmental impact type. The second level returns the current process name. The third level returns the current inventory name</p>
     * 
     * <strong>example:</strong>
     * <p>climate change</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Category key, please refer to <a href="https://carbon-doc.oss-cn-hangzhou.aliyuncs.com/CarbonFootprintAppendices-en.pdf">Carbon Footprint Appendices</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("num")
    public Long num;

    /**
     * <p>The percentage. Four decimal places are retained and 31.4000 is returned to indicate the percentage 31.4%. The first level returns null; The second level returns the current process as a percentage of total emissions; the third level returns the current inventory as a percentage of total emissions.</p>
     * 
     * <strong>example:</strong>
     * <p>31.4000</p>
     */
    @NameInMap("percent")
    public Double percent;

    /**
     * <p>Raw activity data. Only the third level returns a quantity that is not null, indicating a manifest.</p>
     * 
     * <strong>example:</strong>
     * <p>1.000000000000</p>
     */
    @NameInMap("quantity")
    public Double quantity;

    /**
     * <p>The type of the inventory. Only the third level returns non-null, and the third level is the inventory details. This field indicates the resource type name of the inventory. You may refer to <a href="https://carbon-doc.oss-cn-hangzhou.aliyuncs.com/CarbonFootprintAppendices-en.pdf">Carbon Footprint Appendices</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Energy</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    /**
     * <p>The data status. 1 indicates accurate calculation, 2 indicates default data, 3 indicates missing factor, and 0 value is used in other cases.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("state")
    public Integer state;

    /**
     * <p>The unit of environmental impact result value. This unit is the unit of the environmental impact result value of the corresponding environmental impact category. For example, the unit kg CO2-Eq represent the emission values shown here is kg CO2-Eq.</p>
     * 
     * <strong>example:</strong>
     * <p>kg CO2-Eq</p>
     */
    @NameInMap("unit")
    public String unit;

    public static EpdInventoryConstituteItem build(java.util.Map<String, ?> map) throws Exception {
        EpdInventoryConstituteItem self = new EpdInventoryConstituteItem();
        return TeaModel.build(map, self);
    }

    public EpdInventoryConstituteItem setCarbonEmission(Double carbonEmission) {
        this.carbonEmission = carbonEmission;
        return this;
    }
    public Double getCarbonEmission() {
        return this.carbonEmission;
    }

    public EpdInventoryConstituteItem setFactor(String factor) {
        this.factor = factor;
        return this;
    }
    public String getFactor() {
        return this.factor;
    }

    public EpdInventoryConstituteItem setFactorDataset(String factorDataset) {
        this.factorDataset = factorDataset;
        return this;
    }
    public String getFactorDataset() {
        return this.factorDataset;
    }

    public EpdInventoryConstituteItem setFactorId(String factorId) {
        this.factorId = factorId;
        return this;
    }
    public String getFactorId() {
        return this.factorId;
    }

    public EpdInventoryConstituteItem setFactorType(Integer factorType) {
        this.factorType = factorType;
        return this;
    }
    public Integer getFactorType() {
        return this.factorType;
    }

    public EpdInventoryConstituteItem setFactorUnit(String factorUnit) {
        this.factorUnit = factorUnit;
        return this;
    }
    public String getFactorUnit() {
        return this.factorUnit;
    }

    public EpdInventoryConstituteItem setInventoryId(Long inventoryId) {
        this.inventoryId = inventoryId;
        return this;
    }
    public Long getInventoryId() {
        return this.inventoryId;
    }

    public EpdInventoryConstituteItem setInventoryUnit(String inventoryUnit) {
        this.inventoryUnit = inventoryUnit;
        return this;
    }
    public String getInventoryUnit() {
        return this.inventoryUnit;
    }

    public EpdInventoryConstituteItem setInventoryValue(Double inventoryValue) {
        this.inventoryValue = inventoryValue;
        return this;
    }
    public Double getInventoryValue() {
        return this.inventoryValue;
    }

    public EpdInventoryConstituteItem setInventoryValuePerProduct(Double inventoryValuePerProduct) {
        this.inventoryValuePerProduct = inventoryValuePerProduct;
        return this;
    }
    public Double getInventoryValuePerProduct() {
        return this.inventoryValuePerProduct;
    }

    public EpdInventoryConstituteItem setInventoryValuePerProductUnit(String inventoryValuePerProductUnit) {
        this.inventoryValuePerProductUnit = inventoryValuePerProductUnit;
        return this;
    }
    public String getInventoryValuePerProductUnit() {
        return this.inventoryValuePerProductUnit;
    }

    public EpdInventoryConstituteItem setItems(java.util.List<EpdInventoryConstituteItem> items) {
        this.items = items;
        return this;
    }
    public java.util.List<EpdInventoryConstituteItem> getItems() {
        return this.items;
    }

    public EpdInventoryConstituteItem setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public EpdInventoryConstituteItem setNum(Long num) {
        this.num = num;
        return this;
    }
    public Long getNum() {
        return this.num;
    }

    public EpdInventoryConstituteItem setPercent(Double percent) {
        this.percent = percent;
        return this;
    }
    public Double getPercent() {
        return this.percent;
    }

    public EpdInventoryConstituteItem setQuantity(Double quantity) {
        this.quantity = quantity;
        return this;
    }
    public Double getQuantity() {
        return this.quantity;
    }

    public EpdInventoryConstituteItem setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public EpdInventoryConstituteItem setState(Integer state) {
        this.state = state;
        return this;
    }
    public Integer getState() {
        return this.state;
    }

    public EpdInventoryConstituteItem setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

}
