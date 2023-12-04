// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ModuleGroupItemShoppingItemMapValue extends TeaModel {
    @NameInMap("cabin_quantity_list")
    public java.util.List<ModuleGroupItemShoppingItemMapValueCabinQuantityList> cabinQuantityList;

    @NameInMap("search_price")
    public ModuleGroupItemShoppingItemMapValueSearchPrice searchPrice;

    @NameInMap("segment_price_list")
    public java.util.List<ModuleGroupItemShoppingItemMapValueSegmentPriceList> segmentPriceList;

    public static ModuleGroupItemShoppingItemMapValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleGroupItemShoppingItemMapValue self = new ModuleGroupItemShoppingItemMapValue();
        return TeaModel.build(map, self);
    }

    public ModuleGroupItemShoppingItemMapValue setCabinQuantityList(java.util.List<ModuleGroupItemShoppingItemMapValueCabinQuantityList> cabinQuantityList) {
        this.cabinQuantityList = cabinQuantityList;
        return this;
    }
    public java.util.List<ModuleGroupItemShoppingItemMapValueCabinQuantityList> getCabinQuantityList() {
        return this.cabinQuantityList;
    }

    public ModuleGroupItemShoppingItemMapValue setSearchPrice(ModuleGroupItemShoppingItemMapValueSearchPrice searchPrice) {
        this.searchPrice = searchPrice;
        return this;
    }
    public ModuleGroupItemShoppingItemMapValueSearchPrice getSearchPrice() {
        return this.searchPrice;
    }

    public ModuleGroupItemShoppingItemMapValue setSegmentPriceList(java.util.List<ModuleGroupItemShoppingItemMapValueSegmentPriceList> segmentPriceList) {
        this.segmentPriceList = segmentPriceList;
        return this;
    }
    public java.util.List<ModuleGroupItemShoppingItemMapValueSegmentPriceList> getSegmentPriceList() {
        return this.segmentPriceList;
    }

    public static class ModuleGroupItemShoppingItemMapValueCabinQuantityListSegmentPosition extends TeaModel {
        @NameInMap("journey_index")
        public Integer journeyIndex;

        @NameInMap("segment_index")
        public Integer segmentIndex;

        public static ModuleGroupItemShoppingItemMapValueCabinQuantityListSegmentPosition build(java.util.Map<String, ?> map) throws Exception {
            ModuleGroupItemShoppingItemMapValueCabinQuantityListSegmentPosition self = new ModuleGroupItemShoppingItemMapValueCabinQuantityListSegmentPosition();
            return TeaModel.build(map, self);
        }

        public ModuleGroupItemShoppingItemMapValueCabinQuantityListSegmentPosition setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public ModuleGroupItemShoppingItemMapValueCabinQuantityListSegmentPosition setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

    }

    public static class ModuleGroupItemShoppingItemMapValueCabinQuantityListCabin extends TeaModel {
        @NameInMap("cabin")
        public String cabin;

        @NameInMap("cabin_class")
        public String cabinClass;

        @NameInMap("cabin_class_name")
        public String cabinClassName;

        @NameInMap("quantity")
        public String quantity;

        public static ModuleGroupItemShoppingItemMapValueCabinQuantityListCabin build(java.util.Map<String, ?> map) throws Exception {
            ModuleGroupItemShoppingItemMapValueCabinQuantityListCabin self = new ModuleGroupItemShoppingItemMapValueCabinQuantityListCabin();
            return TeaModel.build(map, self);
        }

        public ModuleGroupItemShoppingItemMapValueCabinQuantityListCabin setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public ModuleGroupItemShoppingItemMapValueCabinQuantityListCabin setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public ModuleGroupItemShoppingItemMapValueCabinQuantityListCabin setCabinClassName(String cabinClassName) {
            this.cabinClassName = cabinClassName;
            return this;
        }
        public String getCabinClassName() {
            return this.cabinClassName;
        }

        public ModuleGroupItemShoppingItemMapValueCabinQuantityListCabin setQuantity(String quantity) {
            this.quantity = quantity;
            return this;
        }
        public String getQuantity() {
            return this.quantity;
        }

    }

    public static class ModuleGroupItemShoppingItemMapValueCabinQuantityList extends TeaModel {
        @NameInMap("segment_position")
        public ModuleGroupItemShoppingItemMapValueCabinQuantityListSegmentPosition segmentPosition;

        @NameInMap("cabin")
        public ModuleGroupItemShoppingItemMapValueCabinQuantityListCabin cabin;

        public static ModuleGroupItemShoppingItemMapValueCabinQuantityList build(java.util.Map<String, ?> map) throws Exception {
            ModuleGroupItemShoppingItemMapValueCabinQuantityList self = new ModuleGroupItemShoppingItemMapValueCabinQuantityList();
            return TeaModel.build(map, self);
        }

        public ModuleGroupItemShoppingItemMapValueCabinQuantityList setSegmentPosition(ModuleGroupItemShoppingItemMapValueCabinQuantityListSegmentPosition segmentPosition) {
            this.segmentPosition = segmentPosition;
            return this;
        }
        public ModuleGroupItemShoppingItemMapValueCabinQuantityListSegmentPosition getSegmentPosition() {
            return this.segmentPosition;
        }

        public ModuleGroupItemShoppingItemMapValueCabinQuantityList setCabin(ModuleGroupItemShoppingItemMapValueCabinQuantityListCabin cabin) {
            this.cabin = cabin;
            return this;
        }
        public ModuleGroupItemShoppingItemMapValueCabinQuantityListCabin getCabin() {
            return this.cabin;
        }

    }

    public static class ModuleGroupItemShoppingItemMapValueSearchPrice extends TeaModel {
        @NameInMap("ticket_price")
        public Integer ticketPrice;

        @NameInMap("sell_price")
        public Integer sellPrice;

        @NameInMap("tax")
        public Integer tax;

        public static ModuleGroupItemShoppingItemMapValueSearchPrice build(java.util.Map<String, ?> map) throws Exception {
            ModuleGroupItemShoppingItemMapValueSearchPrice self = new ModuleGroupItemShoppingItemMapValueSearchPrice();
            return TeaModel.build(map, self);
        }

        public ModuleGroupItemShoppingItemMapValueSearchPrice setTicketPrice(Integer ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Integer getTicketPrice() {
            return this.ticketPrice;
        }

        public ModuleGroupItemShoppingItemMapValueSearchPrice setSellPrice(Integer sellPrice) {
            this.sellPrice = sellPrice;
            return this;
        }
        public Integer getSellPrice() {
            return this.sellPrice;
        }

        public ModuleGroupItemShoppingItemMapValueSearchPrice setTax(Integer tax) {
            this.tax = tax;
            return this;
        }
        public Integer getTax() {
            return this.tax;
        }

    }

    public static class ModuleGroupItemShoppingItemMapValueSegmentPriceListSegmentPosition extends TeaModel {
        @NameInMap("journey_index")
        public Integer journeyIndex;

        @NameInMap("segment_index")
        public Integer segmentIndex;

        public static ModuleGroupItemShoppingItemMapValueSegmentPriceListSegmentPosition build(java.util.Map<String, ?> map) throws Exception {
            ModuleGroupItemShoppingItemMapValueSegmentPriceListSegmentPosition self = new ModuleGroupItemShoppingItemMapValueSegmentPriceListSegmentPosition();
            return TeaModel.build(map, self);
        }

        public ModuleGroupItemShoppingItemMapValueSegmentPriceListSegmentPosition setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public ModuleGroupItemShoppingItemMapValueSegmentPriceListSegmentPosition setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

    }

    public static class ModuleGroupItemShoppingItemMapValueSegmentPriceListSearchPrice extends TeaModel {
        @NameInMap("ticket_price")
        public Integer ticketPrice;

        @NameInMap("sell_price")
        public Integer sellPrice;

        @NameInMap("tax")
        public Integer tax;

        public static ModuleGroupItemShoppingItemMapValueSegmentPriceListSearchPrice build(java.util.Map<String, ?> map) throws Exception {
            ModuleGroupItemShoppingItemMapValueSegmentPriceListSearchPrice self = new ModuleGroupItemShoppingItemMapValueSegmentPriceListSearchPrice();
            return TeaModel.build(map, self);
        }

        public ModuleGroupItemShoppingItemMapValueSegmentPriceListSearchPrice setTicketPrice(Integer ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Integer getTicketPrice() {
            return this.ticketPrice;
        }

        public ModuleGroupItemShoppingItemMapValueSegmentPriceListSearchPrice setSellPrice(Integer sellPrice) {
            this.sellPrice = sellPrice;
            return this;
        }
        public Integer getSellPrice() {
            return this.sellPrice;
        }

        public ModuleGroupItemShoppingItemMapValueSegmentPriceListSearchPrice setTax(Integer tax) {
            this.tax = tax;
            return this;
        }
        public Integer getTax() {
            return this.tax;
        }

    }

    public static class ModuleGroupItemShoppingItemMapValueSegmentPriceList extends TeaModel {
        @NameInMap("segment_position")
        public ModuleGroupItemShoppingItemMapValueSegmentPriceListSegmentPosition segmentPosition;

        @NameInMap("search_price")
        public ModuleGroupItemShoppingItemMapValueSegmentPriceListSearchPrice searchPrice;

        public static ModuleGroupItemShoppingItemMapValueSegmentPriceList build(java.util.Map<String, ?> map) throws Exception {
            ModuleGroupItemShoppingItemMapValueSegmentPriceList self = new ModuleGroupItemShoppingItemMapValueSegmentPriceList();
            return TeaModel.build(map, self);
        }

        public ModuleGroupItemShoppingItemMapValueSegmentPriceList setSegmentPosition(ModuleGroupItemShoppingItemMapValueSegmentPriceListSegmentPosition segmentPosition) {
            this.segmentPosition = segmentPosition;
            return this;
        }
        public ModuleGroupItemShoppingItemMapValueSegmentPriceListSegmentPosition getSegmentPosition() {
            return this.segmentPosition;
        }

        public ModuleGroupItemShoppingItemMapValueSegmentPriceList setSearchPrice(ModuleGroupItemShoppingItemMapValueSegmentPriceListSearchPrice searchPrice) {
            this.searchPrice = searchPrice;
            return this;
        }
        public ModuleGroupItemShoppingItemMapValueSegmentPriceListSearchPrice getSearchPrice() {
            return this.searchPrice;
        }

    }

}
