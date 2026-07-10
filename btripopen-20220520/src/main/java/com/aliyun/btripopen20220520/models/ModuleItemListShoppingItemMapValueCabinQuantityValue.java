// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ModuleItemListShoppingItemMapValueCabinQuantityValue extends TeaModel {
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

    public static ModuleItemListShoppingItemMapValueCabinQuantityValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleItemListShoppingItemMapValueCabinQuantityValue self = new ModuleItemListShoppingItemMapValueCabinQuantityValue();
        return TeaModel.build(map, self);
    }

    public ModuleItemListShoppingItemMapValueCabinQuantityValue setCabin(String cabin) {
        this.cabin = cabin;
        return this;
    }
    public String getCabin() {
        return this.cabin;
    }

    public ModuleItemListShoppingItemMapValueCabinQuantityValue setCabinClass(String cabinClass) {
        this.cabinClass = cabinClass;
        return this;
    }
    public String getCabinClass() {
        return this.cabinClass;
    }

    public ModuleItemListShoppingItemMapValueCabinQuantityValue setCabinClassName(String cabinClassName) {
        this.cabinClassName = cabinClassName;
        return this;
    }
    public String getCabinClassName() {
        return this.cabinClassName;
    }

    public ModuleItemListShoppingItemMapValueCabinQuantityValue setCabinClassMemo(String cabinClassMemo) {
        this.cabinClassMemo = cabinClassMemo;
        return this;
    }
    public String getCabinClassMemo() {
        return this.cabinClassMemo;
    }

    public ModuleItemListShoppingItemMapValueCabinQuantityValue setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

    public ModuleItemListShoppingItemMapValueCabinQuantityValue setQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }
    public String getQuantity() {
        return this.quantity;
    }

    public ModuleItemListShoppingItemMapValueCabinQuantityValue setLinkCabins(java.util.List<String> linkCabins) {
        this.linkCabins = linkCabins;
        return this;
    }
    public java.util.List<String> getLinkCabins() {
        return this.linkCabins;
    }

    public ModuleItemListShoppingItemMapValueCabinQuantityValue setReshopChangeCabin(Boolean reshopChangeCabin) {
        this.reshopChangeCabin = reshopChangeCabin;
        return this;
    }
    public Boolean getReshopChangeCabin() {
        return this.reshopChangeCabin;
    }

    public ModuleItemListShoppingItemMapValueCabinQuantityValue setChildCabinType(Integer childCabinType) {
        this.childCabinType = childCabinType;
        return this;
    }
    public Integer getChildCabinType() {
        return this.childCabinType;
    }

    public ModuleItemListShoppingItemMapValueCabinQuantityValue setInfantBasicCabin(String infantBasicCabin) {
        this.infantBasicCabin = infantBasicCabin;
        return this;
    }
    public String getInfantBasicCabin() {
        return this.infantBasicCabin;
    }

    public ModuleItemListShoppingItemMapValueCabinQuantityValue setInnerCabinClass(Integer innerCabinClass) {
        this.innerCabinClass = innerCabinClass;
        return this;
    }
    public Integer getInnerCabinClass() {
        return this.innerCabinClass;
    }

}
