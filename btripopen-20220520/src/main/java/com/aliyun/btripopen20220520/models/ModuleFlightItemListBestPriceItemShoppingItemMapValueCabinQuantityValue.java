// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityValue extends TeaModel {
    @NameInMap("cabin")
    public String cabin;

    @NameInMap("cabin_class")
    public String cabinClass;

    @NameInMap("cabin_class_name")
    public String cabinClassName;

    @NameInMap("cabin_class_memo")
    public String cabinClassMemo;

    @NameInMap("specification")
    public String specification;

    @NameInMap("quantity")
    public String quantity;

    @NameInMap("link_cabins")
    public java.util.List<String> linkCabins;

    @NameInMap("reshop_change_cabin")
    public Boolean reshopChangeCabin;

    @NameInMap("child_cabin_type")
    public Integer childCabinType;

    @NameInMap("infant_basic_cabin")
    public String infantBasicCabin;

    @NameInMap("inner_cabin_class")
    public Integer innerCabinClass;

    public static ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityValue self = new ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityValue();
        return TeaModel.build(map, self);
    }

    public ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityValue setCabin(String cabin) {
        this.cabin = cabin;
        return this;
    }
    public String getCabin() {
        return this.cabin;
    }

    public ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityValue setCabinClass(String cabinClass) {
        this.cabinClass = cabinClass;
        return this;
    }
    public String getCabinClass() {
        return this.cabinClass;
    }

    public ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityValue setCabinClassName(String cabinClassName) {
        this.cabinClassName = cabinClassName;
        return this;
    }
    public String getCabinClassName() {
        return this.cabinClassName;
    }

    public ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityValue setCabinClassMemo(String cabinClassMemo) {
        this.cabinClassMemo = cabinClassMemo;
        return this;
    }
    public String getCabinClassMemo() {
        return this.cabinClassMemo;
    }

    public ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityValue setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

    public ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityValue setQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }
    public String getQuantity() {
        return this.quantity;
    }

    public ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityValue setLinkCabins(java.util.List<String> linkCabins) {
        this.linkCabins = linkCabins;
        return this;
    }
    public java.util.List<String> getLinkCabins() {
        return this.linkCabins;
    }

    public ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityValue setReshopChangeCabin(Boolean reshopChangeCabin) {
        this.reshopChangeCabin = reshopChangeCabin;
        return this;
    }
    public Boolean getReshopChangeCabin() {
        return this.reshopChangeCabin;
    }

    public ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityValue setChildCabinType(Integer childCabinType) {
        this.childCabinType = childCabinType;
        return this;
    }
    public Integer getChildCabinType() {
        return this.childCabinType;
    }

    public ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityValue setInfantBasicCabin(String infantBasicCabin) {
        this.infantBasicCabin = infantBasicCabin;
        return this;
    }
    public String getInfantBasicCabin() {
        return this.infantBasicCabin;
    }

    public ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityValue setInnerCabinClass(Integer innerCabinClass) {
        this.innerCabinClass = innerCabinClass;
        return this;
    }
    public Integer getInnerCabinClass() {
        return this.innerCabinClass;
    }

}
