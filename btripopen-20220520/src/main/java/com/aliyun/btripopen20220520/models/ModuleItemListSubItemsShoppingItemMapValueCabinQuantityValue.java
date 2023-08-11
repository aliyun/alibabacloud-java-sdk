// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ModuleItemListSubItemsShoppingItemMapValueCabinQuantityValue extends TeaModel {
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

    public static ModuleItemListSubItemsShoppingItemMapValueCabinQuantityValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleItemListSubItemsShoppingItemMapValueCabinQuantityValue self = new ModuleItemListSubItemsShoppingItemMapValueCabinQuantityValue();
        return TeaModel.build(map, self);
    }

    public ModuleItemListSubItemsShoppingItemMapValueCabinQuantityValue setCabin(String cabin) {
        this.cabin = cabin;
        return this;
    }
    public String getCabin() {
        return this.cabin;
    }

    public ModuleItemListSubItemsShoppingItemMapValueCabinQuantityValue setCabinClass(String cabinClass) {
        this.cabinClass = cabinClass;
        return this;
    }
    public String getCabinClass() {
        return this.cabinClass;
    }

    public ModuleItemListSubItemsShoppingItemMapValueCabinQuantityValue setCabinClassName(String cabinClassName) {
        this.cabinClassName = cabinClassName;
        return this;
    }
    public String getCabinClassName() {
        return this.cabinClassName;
    }

    public ModuleItemListSubItemsShoppingItemMapValueCabinQuantityValue setCabinClassMemo(String cabinClassMemo) {
        this.cabinClassMemo = cabinClassMemo;
        return this;
    }
    public String getCabinClassMemo() {
        return this.cabinClassMemo;
    }

    public ModuleItemListSubItemsShoppingItemMapValueCabinQuantityValue setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

    public ModuleItemListSubItemsShoppingItemMapValueCabinQuantityValue setQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }
    public String getQuantity() {
        return this.quantity;
    }

    public ModuleItemListSubItemsShoppingItemMapValueCabinQuantityValue setLinkCabins(java.util.List<String> linkCabins) {
        this.linkCabins = linkCabins;
        return this;
    }
    public java.util.List<String> getLinkCabins() {
        return this.linkCabins;
    }

    public ModuleItemListSubItemsShoppingItemMapValueCabinQuantityValue setReshopChangeCabin(Boolean reshopChangeCabin) {
        this.reshopChangeCabin = reshopChangeCabin;
        return this;
    }
    public Boolean getReshopChangeCabin() {
        return this.reshopChangeCabin;
    }

    public ModuleItemListSubItemsShoppingItemMapValueCabinQuantityValue setChildCabinType(Integer childCabinType) {
        this.childCabinType = childCabinType;
        return this;
    }
    public Integer getChildCabinType() {
        return this.childCabinType;
    }

    public ModuleItemListSubItemsShoppingItemMapValueCabinQuantityValue setInfantBasicCabin(String infantBasicCabin) {
        this.infantBasicCabin = infantBasicCabin;
        return this;
    }
    public String getInfantBasicCabin() {
        return this.infantBasicCabin;
    }

    public ModuleItemListSubItemsShoppingItemMapValueCabinQuantityValue setInnerCabinClass(Integer innerCabinClass) {
        this.innerCabinClass = innerCabinClass;
        return this;
    }
    public Integer getInnerCabinClass() {
        return this.innerCabinClass;
    }

}
