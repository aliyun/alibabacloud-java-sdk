// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class EpdInventoryConstituteItem extends TeaModel {
    @NameInMap("carbonEmission")
    public Double carbonEmission;

    @NameInMap("factor")
    public String factor;

    @NameInMap("factorDataset")
    public String factorDataset;

    @NameInMap("factorId")
    public String factorId;

    @NameInMap("factorType")
    public Integer factorType;

    @NameInMap("factorUnit")
    public String factorUnit;

    @NameInMap("inventoryId")
    public Long inventoryId;

    @NameInMap("inventoryUnit")
    public String inventoryUnit;

    @NameInMap("inventoryValue")
    public Double inventoryValue;

    @NameInMap("inventoryValuePerProduct")
    public Double inventoryValuePerProduct;

    @NameInMap("inventoryValuePerProductUnit")
    public String inventoryValuePerProductUnit;

    @NameInMap("items")
    public java.util.List<EpdInventoryConstituteItem> items;

    @NameInMap("name")
    public String name;

    @NameInMap("num")
    public Long num;

    @NameInMap("percent")
    public Double percent;

    @NameInMap("quantity")
    public Double quantity;

    @NameInMap("resourceType")
    public String resourceType;

    @NameInMap("state")
    public Integer state;

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
