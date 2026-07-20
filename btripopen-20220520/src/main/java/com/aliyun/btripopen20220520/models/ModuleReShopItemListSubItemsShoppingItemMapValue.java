// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ModuleReShopItemListSubItemsShoppingItemMapValue extends TeaModel {
    /**
     * <p>The remaining cabin inventory for each segment.</p>
     */
    @NameInMap("cabin_quantity_list")
    public java.util.List<ModuleReShopItemListSubItemsShoppingItemMapValueCabinQuantityList> cabinQuantityList;

    /**
     * <p>The rebooking search price.</p>
     */
    @NameInMap("search_price")
    public ModuleReShopItemListSubItemsShoppingItemMapValueSearchPrice searchPrice;

    /**
     * <p>The price for each segment. This field may not have a value because airline bundled products may not have prices broken down by segment.</p>
     */
    @NameInMap("segment_price_list")
    public java.util.List<ModuleReShopItemListSubItemsShoppingItemMapValueSegmentPriceList> segmentPriceList;

    public static ModuleReShopItemListSubItemsShoppingItemMapValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleReShopItemListSubItemsShoppingItemMapValue self = new ModuleReShopItemListSubItemsShoppingItemMapValue();
        return TeaModel.build(map, self);
    }

    public ModuleReShopItemListSubItemsShoppingItemMapValue setCabinQuantityList(java.util.List<ModuleReShopItemListSubItemsShoppingItemMapValueCabinQuantityList> cabinQuantityList) {
        this.cabinQuantityList = cabinQuantityList;
        return this;
    }
    public java.util.List<ModuleReShopItemListSubItemsShoppingItemMapValueCabinQuantityList> getCabinQuantityList() {
        return this.cabinQuantityList;
    }

    public ModuleReShopItemListSubItemsShoppingItemMapValue setSearchPrice(ModuleReShopItemListSubItemsShoppingItemMapValueSearchPrice searchPrice) {
        this.searchPrice = searchPrice;
        return this;
    }
    public ModuleReShopItemListSubItemsShoppingItemMapValueSearchPrice getSearchPrice() {
        return this.searchPrice;
    }

    public ModuleReShopItemListSubItemsShoppingItemMapValue setSegmentPriceList(java.util.List<ModuleReShopItemListSubItemsShoppingItemMapValueSegmentPriceList> segmentPriceList) {
        this.segmentPriceList = segmentPriceList;
        return this;
    }
    public java.util.List<ModuleReShopItemListSubItemsShoppingItemMapValueSegmentPriceList> getSegmentPriceList() {
        return this.segmentPriceList;
    }

    public static class ModuleReShopItemListSubItemsShoppingItemMapValueCabinQuantityListSegmentPosition extends TeaModel {
        /**
         * <p>The journey ordinal number, starting from 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("journey_index")
        public Integer journeyIndex;

        /**
         * <p>The segment ordinal number, starting from 0 within the same journey.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("segment_index")
        public Integer segmentIndex;

        public static ModuleReShopItemListSubItemsShoppingItemMapValueCabinQuantityListSegmentPosition build(java.util.Map<String, ?> map) throws Exception {
            ModuleReShopItemListSubItemsShoppingItemMapValueCabinQuantityListSegmentPosition self = new ModuleReShopItemListSubItemsShoppingItemMapValueCabinQuantityListSegmentPosition();
            return TeaModel.build(map, self);
        }

        public ModuleReShopItemListSubItemsShoppingItemMapValueCabinQuantityListSegmentPosition setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public ModuleReShopItemListSubItemsShoppingItemMapValueCabinQuantityListSegmentPosition setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

    }

    public static class ModuleReShopItemListSubItemsShoppingItemMapValueCabinQuantityListCabinInfo extends TeaModel {
        /**
         * <p>The cabin code.</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("cabin")
        public String cabin;

        /**
         * <p>The cabin class. Valid values:</p>
         * <ul>
         * <li>F: First class.</li>
         * <li>C: Business class.</li>
         * <li>Y: Economy class.</li>
         * <li>P: Premium economy class.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("cabin_class")
        public String cabinClass;

        /**
         * <p>The cabin class name.</p>
         * 
         * <strong>example:</strong>
         * <p>经济舱</p>
         */
        @NameInMap("cabin_class_name")
        public String cabinClassName;

        /**
         * <p>The number of remaining seats in the cabin. Valid values: 0-9 (0 to 9 seats remaining) or A (more than 9 seats).</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("quantity")
        public String quantity;

        /**
         * <p>The cabin class description.</p>
         * 
         * <strong>example:</strong>
         * <p>经济舱</p>
         */
        @NameInMap("cabin_class_memo")
        public String cabinClassMemo;

        /**
         * <p>The domestic special notes.</p>
         * 
         * <strong>example:</strong>
         * <p>经济舱</p>
         */
        @NameInMap("specification")
        public String specification;

        public static ModuleReShopItemListSubItemsShoppingItemMapValueCabinQuantityListCabinInfo build(java.util.Map<String, ?> map) throws Exception {
            ModuleReShopItemListSubItemsShoppingItemMapValueCabinQuantityListCabinInfo self = new ModuleReShopItemListSubItemsShoppingItemMapValueCabinQuantityListCabinInfo();
            return TeaModel.build(map, self);
        }

        public ModuleReShopItemListSubItemsShoppingItemMapValueCabinQuantityListCabinInfo setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public ModuleReShopItemListSubItemsShoppingItemMapValueCabinQuantityListCabinInfo setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public ModuleReShopItemListSubItemsShoppingItemMapValueCabinQuantityListCabinInfo setCabinClassName(String cabinClassName) {
            this.cabinClassName = cabinClassName;
            return this;
        }
        public String getCabinClassName() {
            return this.cabinClassName;
        }

        public ModuleReShopItemListSubItemsShoppingItemMapValueCabinQuantityListCabinInfo setQuantity(String quantity) {
            this.quantity = quantity;
            return this;
        }
        public String getQuantity() {
            return this.quantity;
        }

        public ModuleReShopItemListSubItemsShoppingItemMapValueCabinQuantityListCabinInfo setCabinClassMemo(String cabinClassMemo) {
            this.cabinClassMemo = cabinClassMemo;
            return this;
        }
        public String getCabinClassMemo() {
            return this.cabinClassMemo;
        }

        public ModuleReShopItemListSubItemsShoppingItemMapValueCabinQuantityListCabinInfo setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

    }

    public static class ModuleReShopItemListSubItemsShoppingItemMapValueCabinQuantityList extends TeaModel {
        /**
         * <p>The segment position information, indicating which journey and which segment within the overall itinerary.</p>
         */
        @NameInMap("segment_position")
        public ModuleReShopItemListSubItemsShoppingItemMapValueCabinQuantityListSegmentPosition segmentPosition;

        /**
         * <p>The detailed cabin information.</p>
         */
        @NameInMap("cabin_info")
        public ModuleReShopItemListSubItemsShoppingItemMapValueCabinQuantityListCabinInfo cabinInfo;

        public static ModuleReShopItemListSubItemsShoppingItemMapValueCabinQuantityList build(java.util.Map<String, ?> map) throws Exception {
            ModuleReShopItemListSubItemsShoppingItemMapValueCabinQuantityList self = new ModuleReShopItemListSubItemsShoppingItemMapValueCabinQuantityList();
            return TeaModel.build(map, self);
        }

        public ModuleReShopItemListSubItemsShoppingItemMapValueCabinQuantityList setSegmentPosition(ModuleReShopItemListSubItemsShoppingItemMapValueCabinQuantityListSegmentPosition segmentPosition) {
            this.segmentPosition = segmentPosition;
            return this;
        }
        public ModuleReShopItemListSubItemsShoppingItemMapValueCabinQuantityListSegmentPosition getSegmentPosition() {
            return this.segmentPosition;
        }

        public ModuleReShopItemListSubItemsShoppingItemMapValueCabinQuantityList setCabinInfo(ModuleReShopItemListSubItemsShoppingItemMapValueCabinQuantityListCabinInfo cabinInfo) {
            this.cabinInfo = cabinInfo;
            return this;
        }
        public ModuleReShopItemListSubItemsShoppingItemMapValueCabinQuantityListCabinInfo getCabinInfo() {
            return this.cabinInfo;
        }

    }

    public static class ModuleReShopItemListSubItemsShoppingItemMapValueSearchPrice extends TeaModel {
        /**
         * <p>The total amount, in cents.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("total_amount")
        public Long totalAmount;

        /**
         * <p>The service fee amount in cents.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("handling_amount")
        public Long handlingAmount;

        /**
         * <p>The upgrade fee amount, in cents.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("upgrade_amount")
        public Long upgradeAmount;

        /**
         * <p>The tax difference amount, in cents.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("tax_diff_amount")
        public Long taxDiffAmount;

        /**
         * <p>Indicates whether a direct quote is available. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("has_price")
        public Boolean hasPrice;

        /**
         * <p>The text prompt displayed when no direct quote is available.</p>
         * 
         * <strong>example:</strong>
         * <p>待服务商确认</p>
         */
        @NameInMap("non_price_text")
        public String nonPriceText;

        public static ModuleReShopItemListSubItemsShoppingItemMapValueSearchPrice build(java.util.Map<String, ?> map) throws Exception {
            ModuleReShopItemListSubItemsShoppingItemMapValueSearchPrice self = new ModuleReShopItemListSubItemsShoppingItemMapValueSearchPrice();
            return TeaModel.build(map, self);
        }

        public ModuleReShopItemListSubItemsShoppingItemMapValueSearchPrice setTotalAmount(Long totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public Long getTotalAmount() {
            return this.totalAmount;
        }

        public ModuleReShopItemListSubItemsShoppingItemMapValueSearchPrice setHandlingAmount(Long handlingAmount) {
            this.handlingAmount = handlingAmount;
            return this;
        }
        public Long getHandlingAmount() {
            return this.handlingAmount;
        }

        public ModuleReShopItemListSubItemsShoppingItemMapValueSearchPrice setUpgradeAmount(Long upgradeAmount) {
            this.upgradeAmount = upgradeAmount;
            return this;
        }
        public Long getUpgradeAmount() {
            return this.upgradeAmount;
        }

        public ModuleReShopItemListSubItemsShoppingItemMapValueSearchPrice setTaxDiffAmount(Long taxDiffAmount) {
            this.taxDiffAmount = taxDiffAmount;
            return this;
        }
        public Long getTaxDiffAmount() {
            return this.taxDiffAmount;
        }

        public ModuleReShopItemListSubItemsShoppingItemMapValueSearchPrice setHasPrice(Boolean hasPrice) {
            this.hasPrice = hasPrice;
            return this;
        }
        public Boolean getHasPrice() {
            return this.hasPrice;
        }

        public ModuleReShopItemListSubItemsShoppingItemMapValueSearchPrice setNonPriceText(String nonPriceText) {
            this.nonPriceText = nonPriceText;
            return this;
        }
        public String getNonPriceText() {
            return this.nonPriceText;
        }

    }

    public static class ModuleReShopItemListSubItemsShoppingItemMapValueSegmentPriceListSegmentPosition extends TeaModel {
        /**
         * <p>The journey ordinal number, starting from 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("journey_index")
        public Integer journeyIndex;

        /**
         * <p>The segment ordinal number, starting from 0 within the same journey.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("segment_index")
        public Integer segmentIndex;

        public static ModuleReShopItemListSubItemsShoppingItemMapValueSegmentPriceListSegmentPosition build(java.util.Map<String, ?> map) throws Exception {
            ModuleReShopItemListSubItemsShoppingItemMapValueSegmentPriceListSegmentPosition self = new ModuleReShopItemListSubItemsShoppingItemMapValueSegmentPriceListSegmentPosition();
            return TeaModel.build(map, self);
        }

        public ModuleReShopItemListSubItemsShoppingItemMapValueSegmentPriceListSegmentPosition setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public ModuleReShopItemListSubItemsShoppingItemMapValueSegmentPriceListSegmentPosition setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

    }

    public static class ModuleReShopItemListSubItemsShoppingItemMapValueSegmentPriceListSearchPrice extends TeaModel {
        /**
         * <p>The total amount in cents.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("total_amount")
        public Long totalAmount;

        /**
         * <p>The service fee amount in cents.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("handling_amount")
        public Long handlingAmount;

        /**
         * <p>The upgrade fee amount in cents.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("upgrade_amount")
        public Long upgradeAmount;

        /**
         * <p>The tax difference amount in cents.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("tax_diff_amount")
        public Long taxDiffAmount;

        /**
         * <p>Indicates whether a direct quote is available. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("has_price")
        public Boolean hasPrice;

        /**
         * <p>The text prompt displayed when no direct quote is available.</p>
         * 
         * <strong>example:</strong>
         * <p>待服务商确认</p>
         */
        @NameInMap("non_price_text")
        public String nonPriceText;

        public static ModuleReShopItemListSubItemsShoppingItemMapValueSegmentPriceListSearchPrice build(java.util.Map<String, ?> map) throws Exception {
            ModuleReShopItemListSubItemsShoppingItemMapValueSegmentPriceListSearchPrice self = new ModuleReShopItemListSubItemsShoppingItemMapValueSegmentPriceListSearchPrice();
            return TeaModel.build(map, self);
        }

        public ModuleReShopItemListSubItemsShoppingItemMapValueSegmentPriceListSearchPrice setTotalAmount(Long totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public Long getTotalAmount() {
            return this.totalAmount;
        }

        public ModuleReShopItemListSubItemsShoppingItemMapValueSegmentPriceListSearchPrice setHandlingAmount(Long handlingAmount) {
            this.handlingAmount = handlingAmount;
            return this;
        }
        public Long getHandlingAmount() {
            return this.handlingAmount;
        }

        public ModuleReShopItemListSubItemsShoppingItemMapValueSegmentPriceListSearchPrice setUpgradeAmount(Long upgradeAmount) {
            this.upgradeAmount = upgradeAmount;
            return this;
        }
        public Long getUpgradeAmount() {
            return this.upgradeAmount;
        }

        public ModuleReShopItemListSubItemsShoppingItemMapValueSegmentPriceListSearchPrice setTaxDiffAmount(Long taxDiffAmount) {
            this.taxDiffAmount = taxDiffAmount;
            return this;
        }
        public Long getTaxDiffAmount() {
            return this.taxDiffAmount;
        }

        public ModuleReShopItemListSubItemsShoppingItemMapValueSegmentPriceListSearchPrice setHasPrice(Boolean hasPrice) {
            this.hasPrice = hasPrice;
            return this;
        }
        public Boolean getHasPrice() {
            return this.hasPrice;
        }

        public ModuleReShopItemListSubItemsShoppingItemMapValueSegmentPriceListSearchPrice setNonPriceText(String nonPriceText) {
            this.nonPriceText = nonPriceText;
            return this;
        }
        public String getNonPriceText() {
            return this.nonPriceText;
        }

    }

    public static class ModuleReShopItemListSubItemsShoppingItemMapValueSegmentPriceList extends TeaModel {
        /**
         * <p>The segment position information, indicating which journey and which segment within the overall itinerary.</p>
         */
        @NameInMap("segment_position")
        public ModuleReShopItemListSubItemsShoppingItemMapValueSegmentPriceListSegmentPosition segmentPosition;

        /**
         * <p>The rebooking quote.</p>
         */
        @NameInMap("search_price")
        public ModuleReShopItemListSubItemsShoppingItemMapValueSegmentPriceListSearchPrice searchPrice;

        public static ModuleReShopItemListSubItemsShoppingItemMapValueSegmentPriceList build(java.util.Map<String, ?> map) throws Exception {
            ModuleReShopItemListSubItemsShoppingItemMapValueSegmentPriceList self = new ModuleReShopItemListSubItemsShoppingItemMapValueSegmentPriceList();
            return TeaModel.build(map, self);
        }

        public ModuleReShopItemListSubItemsShoppingItemMapValueSegmentPriceList setSegmentPosition(ModuleReShopItemListSubItemsShoppingItemMapValueSegmentPriceListSegmentPosition segmentPosition) {
            this.segmentPosition = segmentPosition;
            return this;
        }
        public ModuleReShopItemListSubItemsShoppingItemMapValueSegmentPriceListSegmentPosition getSegmentPosition() {
            return this.segmentPosition;
        }

        public ModuleReShopItemListSubItemsShoppingItemMapValueSegmentPriceList setSearchPrice(ModuleReShopItemListSubItemsShoppingItemMapValueSegmentPriceListSearchPrice searchPrice) {
            this.searchPrice = searchPrice;
            return this;
        }
        public ModuleReShopItemListSubItemsShoppingItemMapValueSegmentPriceListSearchPrice getSearchPrice() {
            return this.searchPrice;
        }

    }

}
