// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ModuleReShopItemListShoppingItemMapValue extends TeaModel {
    /**
     * <p>The remaining cabin inventory for each segment.</p>
     */
    @NameInMap("cabin_quantity_list")
    public java.util.List<ModuleReShopItemListShoppingItemMapValueCabinQuantityList> cabinQuantityList;

    /**
     * <p>The rebooking search price.</p>
     */
    @NameInMap("search_price")
    public ModuleReShopItemListShoppingItemMapValueSearchPrice searchPrice;

    /**
     * <p>The price for each segment. This field may not have a value because airline bundled products may not have segment-level pricing.</p>
     */
    @NameInMap("segment_price_list")
    public java.util.List<ModuleReShopItemListShoppingItemMapValueSegmentPriceList> segmentPriceList;

    public static ModuleReShopItemListShoppingItemMapValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleReShopItemListShoppingItemMapValue self = new ModuleReShopItemListShoppingItemMapValue();
        return TeaModel.build(map, self);
    }

    public ModuleReShopItemListShoppingItemMapValue setCabinQuantityList(java.util.List<ModuleReShopItemListShoppingItemMapValueCabinQuantityList> cabinQuantityList) {
        this.cabinQuantityList = cabinQuantityList;
        return this;
    }
    public java.util.List<ModuleReShopItemListShoppingItemMapValueCabinQuantityList> getCabinQuantityList() {
        return this.cabinQuantityList;
    }

    public ModuleReShopItemListShoppingItemMapValue setSearchPrice(ModuleReShopItemListShoppingItemMapValueSearchPrice searchPrice) {
        this.searchPrice = searchPrice;
        return this;
    }
    public ModuleReShopItemListShoppingItemMapValueSearchPrice getSearchPrice() {
        return this.searchPrice;
    }

    public ModuleReShopItemListShoppingItemMapValue setSegmentPriceList(java.util.List<ModuleReShopItemListShoppingItemMapValueSegmentPriceList> segmentPriceList) {
        this.segmentPriceList = segmentPriceList;
        return this;
    }
    public java.util.List<ModuleReShopItemListShoppingItemMapValueSegmentPriceList> getSegmentPriceList() {
        return this.segmentPriceList;
    }

    public static class ModuleReShopItemListShoppingItemMapValueCabinQuantityListSegmentPosition extends TeaModel {
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

        public static ModuleReShopItemListShoppingItemMapValueCabinQuantityListSegmentPosition build(java.util.Map<String, ?> map) throws Exception {
            ModuleReShopItemListShoppingItemMapValueCabinQuantityListSegmentPosition self = new ModuleReShopItemListShoppingItemMapValueCabinQuantityListSegmentPosition();
            return TeaModel.build(map, self);
        }

        public ModuleReShopItemListShoppingItemMapValueCabinQuantityListSegmentPosition setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public ModuleReShopItemListShoppingItemMapValueCabinQuantityListSegmentPosition setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

    }

    public static class ModuleReShopItemListShoppingItemMapValueCabinQuantityListCabinInfo extends TeaModel {
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
         * <p>1</p>
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

        public static ModuleReShopItemListShoppingItemMapValueCabinQuantityListCabinInfo build(java.util.Map<String, ?> map) throws Exception {
            ModuleReShopItemListShoppingItemMapValueCabinQuantityListCabinInfo self = new ModuleReShopItemListShoppingItemMapValueCabinQuantityListCabinInfo();
            return TeaModel.build(map, self);
        }

        public ModuleReShopItemListShoppingItemMapValueCabinQuantityListCabinInfo setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public ModuleReShopItemListShoppingItemMapValueCabinQuantityListCabinInfo setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public ModuleReShopItemListShoppingItemMapValueCabinQuantityListCabinInfo setCabinClassName(String cabinClassName) {
            this.cabinClassName = cabinClassName;
            return this;
        }
        public String getCabinClassName() {
            return this.cabinClassName;
        }

        public ModuleReShopItemListShoppingItemMapValueCabinQuantityListCabinInfo setQuantity(String quantity) {
            this.quantity = quantity;
            return this;
        }
        public String getQuantity() {
            return this.quantity;
        }

        public ModuleReShopItemListShoppingItemMapValueCabinQuantityListCabinInfo setCabinClassMemo(String cabinClassMemo) {
            this.cabinClassMemo = cabinClassMemo;
            return this;
        }
        public String getCabinClassMemo() {
            return this.cabinClassMemo;
        }

        public ModuleReShopItemListShoppingItemMapValueCabinQuantityListCabinInfo setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

    }

    public static class ModuleReShopItemListShoppingItemMapValueCabinQuantityList extends TeaModel {
        /**
         * <p>The segment position information, indicating which journey and which segment within the overall itinerary.</p>
         */
        @NameInMap("segment_position")
        public ModuleReShopItemListShoppingItemMapValueCabinQuantityListSegmentPosition segmentPosition;

        /**
         * <p>The detailed cabin information.</p>
         */
        @NameInMap("cabin_info")
        public ModuleReShopItemListShoppingItemMapValueCabinQuantityListCabinInfo cabinInfo;

        public static ModuleReShopItemListShoppingItemMapValueCabinQuantityList build(java.util.Map<String, ?> map) throws Exception {
            ModuleReShopItemListShoppingItemMapValueCabinQuantityList self = new ModuleReShopItemListShoppingItemMapValueCabinQuantityList();
            return TeaModel.build(map, self);
        }

        public ModuleReShopItemListShoppingItemMapValueCabinQuantityList setSegmentPosition(ModuleReShopItemListShoppingItemMapValueCabinQuantityListSegmentPosition segmentPosition) {
            this.segmentPosition = segmentPosition;
            return this;
        }
        public ModuleReShopItemListShoppingItemMapValueCabinQuantityListSegmentPosition getSegmentPosition() {
            return this.segmentPosition;
        }

        public ModuleReShopItemListShoppingItemMapValueCabinQuantityList setCabinInfo(ModuleReShopItemListShoppingItemMapValueCabinQuantityListCabinInfo cabinInfo) {
            this.cabinInfo = cabinInfo;
            return this;
        }
        public ModuleReShopItemListShoppingItemMapValueCabinQuantityListCabinInfo getCabinInfo() {
            return this.cabinInfo;
        }

    }

    public static class ModuleReShopItemListShoppingItemMapValueSearchPrice extends TeaModel {
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
         * <p>100</p>
         */
        @NameInMap("upgrade_amount")
        public Long upgradeAmount;

        /**
         * <p>The tax difference amount, in cents.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("tax_diff_amount")
        public Long taxDiffAmount;

        /**
         * <p>Indicates whether a direct price is available. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("has_price")
        public Boolean hasPrice;

        /**
         * <p>The text prompt displayed when no direct price is available.</p>
         * 
         * <strong>example:</strong>
         * <p>待服务商确认</p>
         */
        @NameInMap("non_price_text")
        public String nonPriceText;

        public static ModuleReShopItemListShoppingItemMapValueSearchPrice build(java.util.Map<String, ?> map) throws Exception {
            ModuleReShopItemListShoppingItemMapValueSearchPrice self = new ModuleReShopItemListShoppingItemMapValueSearchPrice();
            return TeaModel.build(map, self);
        }

        public ModuleReShopItemListShoppingItemMapValueSearchPrice setTotalAmount(Long totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public Long getTotalAmount() {
            return this.totalAmount;
        }

        public ModuleReShopItemListShoppingItemMapValueSearchPrice setHandlingAmount(Long handlingAmount) {
            this.handlingAmount = handlingAmount;
            return this;
        }
        public Long getHandlingAmount() {
            return this.handlingAmount;
        }

        public ModuleReShopItemListShoppingItemMapValueSearchPrice setUpgradeAmount(Long upgradeAmount) {
            this.upgradeAmount = upgradeAmount;
            return this;
        }
        public Long getUpgradeAmount() {
            return this.upgradeAmount;
        }

        public ModuleReShopItemListShoppingItemMapValueSearchPrice setTaxDiffAmount(Long taxDiffAmount) {
            this.taxDiffAmount = taxDiffAmount;
            return this;
        }
        public Long getTaxDiffAmount() {
            return this.taxDiffAmount;
        }

        public ModuleReShopItemListShoppingItemMapValueSearchPrice setHasPrice(Boolean hasPrice) {
            this.hasPrice = hasPrice;
            return this;
        }
        public Boolean getHasPrice() {
            return this.hasPrice;
        }

        public ModuleReShopItemListShoppingItemMapValueSearchPrice setNonPriceText(String nonPriceText) {
            this.nonPriceText = nonPriceText;
            return this;
        }
        public String getNonPriceText() {
            return this.nonPriceText;
        }

    }

    public static class ModuleReShopItemListShoppingItemMapValueSegmentPriceListSegmentPosition extends TeaModel {
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

        public static ModuleReShopItemListShoppingItemMapValueSegmentPriceListSegmentPosition build(java.util.Map<String, ?> map) throws Exception {
            ModuleReShopItemListShoppingItemMapValueSegmentPriceListSegmentPosition self = new ModuleReShopItemListShoppingItemMapValueSegmentPriceListSegmentPosition();
            return TeaModel.build(map, self);
        }

        public ModuleReShopItemListShoppingItemMapValueSegmentPriceListSegmentPosition setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public ModuleReShopItemListShoppingItemMapValueSegmentPriceListSegmentPosition setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

    }

    public static class ModuleReShopItemListShoppingItemMapValueSegmentPriceListSearchPrice extends TeaModel {
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
         * <p>10</p>
         */
        @NameInMap("handling_amount")
        public Long handlingAmount;

        /**
         * <p>The upgrade fee amount, in cents.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
         * <p>Indicates whether a direct price is available. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("has_price")
        public Boolean hasPrice;

        /**
         * <p>The text prompt displayed when no direct price is available.</p>
         * 
         * <strong>example:</strong>
         * <p>待服务商确认</p>
         */
        @NameInMap("non_price_text")
        public String nonPriceText;

        public static ModuleReShopItemListShoppingItemMapValueSegmentPriceListSearchPrice build(java.util.Map<String, ?> map) throws Exception {
            ModuleReShopItemListShoppingItemMapValueSegmentPriceListSearchPrice self = new ModuleReShopItemListShoppingItemMapValueSegmentPriceListSearchPrice();
            return TeaModel.build(map, self);
        }

        public ModuleReShopItemListShoppingItemMapValueSegmentPriceListSearchPrice setTotalAmount(Long totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public Long getTotalAmount() {
            return this.totalAmount;
        }

        public ModuleReShopItemListShoppingItemMapValueSegmentPriceListSearchPrice setHandlingAmount(Long handlingAmount) {
            this.handlingAmount = handlingAmount;
            return this;
        }
        public Long getHandlingAmount() {
            return this.handlingAmount;
        }

        public ModuleReShopItemListShoppingItemMapValueSegmentPriceListSearchPrice setUpgradeAmount(Long upgradeAmount) {
            this.upgradeAmount = upgradeAmount;
            return this;
        }
        public Long getUpgradeAmount() {
            return this.upgradeAmount;
        }

        public ModuleReShopItemListShoppingItemMapValueSegmentPriceListSearchPrice setTaxDiffAmount(Long taxDiffAmount) {
            this.taxDiffAmount = taxDiffAmount;
            return this;
        }
        public Long getTaxDiffAmount() {
            return this.taxDiffAmount;
        }

        public ModuleReShopItemListShoppingItemMapValueSegmentPriceListSearchPrice setHasPrice(Boolean hasPrice) {
            this.hasPrice = hasPrice;
            return this;
        }
        public Boolean getHasPrice() {
            return this.hasPrice;
        }

        public ModuleReShopItemListShoppingItemMapValueSegmentPriceListSearchPrice setNonPriceText(String nonPriceText) {
            this.nonPriceText = nonPriceText;
            return this;
        }
        public String getNonPriceText() {
            return this.nonPriceText;
        }

    }

    public static class ModuleReShopItemListShoppingItemMapValueSegmentPriceList extends TeaModel {
        /**
         * <p>The segment position information, indicating which journey and which segment within the overall itinerary.</p>
         */
        @NameInMap("segment_position")
        public ModuleReShopItemListShoppingItemMapValueSegmentPriceListSegmentPosition segmentPosition;

        /**
         * <p>The rebooking price.</p>
         */
        @NameInMap("search_price")
        public ModuleReShopItemListShoppingItemMapValueSegmentPriceListSearchPrice searchPrice;

        public static ModuleReShopItemListShoppingItemMapValueSegmentPriceList build(java.util.Map<String, ?> map) throws Exception {
            ModuleReShopItemListShoppingItemMapValueSegmentPriceList self = new ModuleReShopItemListShoppingItemMapValueSegmentPriceList();
            return TeaModel.build(map, self);
        }

        public ModuleReShopItemListShoppingItemMapValueSegmentPriceList setSegmentPosition(ModuleReShopItemListShoppingItemMapValueSegmentPriceListSegmentPosition segmentPosition) {
            this.segmentPosition = segmentPosition;
            return this;
        }
        public ModuleReShopItemListShoppingItemMapValueSegmentPriceListSegmentPosition getSegmentPosition() {
            return this.segmentPosition;
        }

        public ModuleReShopItemListShoppingItemMapValueSegmentPriceList setSearchPrice(ModuleReShopItemListShoppingItemMapValueSegmentPriceListSearchPrice searchPrice) {
            this.searchPrice = searchPrice;
            return this;
        }
        public ModuleReShopItemListShoppingItemMapValueSegmentPriceListSearchPrice getSearchPrice() {
            return this.searchPrice;
        }

    }

}
