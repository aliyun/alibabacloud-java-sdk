// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ModuleReShopItemListBestPriceItemShoppingItemMapValue extends TeaModel {
    /**
     * <p>The remaining cabin inventory for each segment.</p>
     */
    @NameInMap("cabin_quantity_list")
    public java.util.List<ModuleReShopItemListBestPriceItemShoppingItemMapValueCabinQuantityList> cabinQuantityList;

    /**
     * <p>The rebooking search price.</p>
     */
    @NameInMap("search_price")
    public ModuleReShopItemListBestPriceItemShoppingItemMapValueSearchPrice searchPrice;

    /**
     * <p>The price for each segment. This value may not be available because airline bundled products may not have prices broken down by segment.</p>
     */
    @NameInMap("segment_price_list")
    public java.util.List<ModuleReShopItemListBestPriceItemShoppingItemMapValueSegmentPriceList> segmentPriceList;

    public static ModuleReShopItemListBestPriceItemShoppingItemMapValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleReShopItemListBestPriceItemShoppingItemMapValue self = new ModuleReShopItemListBestPriceItemShoppingItemMapValue();
        return TeaModel.build(map, self);
    }

    public ModuleReShopItemListBestPriceItemShoppingItemMapValue setCabinQuantityList(java.util.List<ModuleReShopItemListBestPriceItemShoppingItemMapValueCabinQuantityList> cabinQuantityList) {
        this.cabinQuantityList = cabinQuantityList;
        return this;
    }
    public java.util.List<ModuleReShopItemListBestPriceItemShoppingItemMapValueCabinQuantityList> getCabinQuantityList() {
        return this.cabinQuantityList;
    }

    public ModuleReShopItemListBestPriceItemShoppingItemMapValue setSearchPrice(ModuleReShopItemListBestPriceItemShoppingItemMapValueSearchPrice searchPrice) {
        this.searchPrice = searchPrice;
        return this;
    }
    public ModuleReShopItemListBestPriceItemShoppingItemMapValueSearchPrice getSearchPrice() {
        return this.searchPrice;
    }

    public ModuleReShopItemListBestPriceItemShoppingItemMapValue setSegmentPriceList(java.util.List<ModuleReShopItemListBestPriceItemShoppingItemMapValueSegmentPriceList> segmentPriceList) {
        this.segmentPriceList = segmentPriceList;
        return this;
    }
    public java.util.List<ModuleReShopItemListBestPriceItemShoppingItemMapValueSegmentPriceList> getSegmentPriceList() {
        return this.segmentPriceList;
    }

    public static class ModuleReShopItemListBestPriceItemShoppingItemMapValueCabinQuantityListSegmentPosition extends TeaModel {
        /**
         * <p>The journey ordinal number (starting from 0).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("journey_index")
        public Integer journeyIndex;

        /**
         * <p>The segment ordinal number (starting from 0 within the same journey).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("segment_index")
        public Integer segmentIndex;

        public static ModuleReShopItemListBestPriceItemShoppingItemMapValueCabinQuantityListSegmentPosition build(java.util.Map<String, ?> map) throws Exception {
            ModuleReShopItemListBestPriceItemShoppingItemMapValueCabinQuantityListSegmentPosition self = new ModuleReShopItemListBestPriceItemShoppingItemMapValueCabinQuantityListSegmentPosition();
            return TeaModel.build(map, self);
        }

        public ModuleReShopItemListBestPriceItemShoppingItemMapValueCabinQuantityListSegmentPosition setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public ModuleReShopItemListBestPriceItemShoppingItemMapValueCabinQuantityListSegmentPosition setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

    }

    public static class ModuleReShopItemListBestPriceItemShoppingItemMapValueCabinQuantityListCabinInfo extends TeaModel {
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
         * <li>F: first class.</li>
         * <li>C: business class.</li>
         * <li>Y: economy class.</li>
         * <li>P: premium economy class.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("cabin_class")
        public String cabinClass;

        /**
         * <p>The cabin class name. Displays the custom name if available. Otherwise, displays the standard name.</p>
         * 
         * <strong>example:</strong>
         * <p>经济舱</p>
         */
        @NameInMap("cabin_class_name")
        public String cabinClassName;

        /**
         * <p>The number of remaining seats in the cabin. Valid values: 0-9 indicates 0 to 9 remaining seats. A indicates more than 9 seats.</p>
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
         * <p>无</p>
         */
        @NameInMap("specification")
        public String specification;

        public static ModuleReShopItemListBestPriceItemShoppingItemMapValueCabinQuantityListCabinInfo build(java.util.Map<String, ?> map) throws Exception {
            ModuleReShopItemListBestPriceItemShoppingItemMapValueCabinQuantityListCabinInfo self = new ModuleReShopItemListBestPriceItemShoppingItemMapValueCabinQuantityListCabinInfo();
            return TeaModel.build(map, self);
        }

        public ModuleReShopItemListBestPriceItemShoppingItemMapValueCabinQuantityListCabinInfo setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public ModuleReShopItemListBestPriceItemShoppingItemMapValueCabinQuantityListCabinInfo setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public ModuleReShopItemListBestPriceItemShoppingItemMapValueCabinQuantityListCabinInfo setCabinClassName(String cabinClassName) {
            this.cabinClassName = cabinClassName;
            return this;
        }
        public String getCabinClassName() {
            return this.cabinClassName;
        }

        public ModuleReShopItemListBestPriceItemShoppingItemMapValueCabinQuantityListCabinInfo setQuantity(String quantity) {
            this.quantity = quantity;
            return this;
        }
        public String getQuantity() {
            return this.quantity;
        }

        public ModuleReShopItemListBestPriceItemShoppingItemMapValueCabinQuantityListCabinInfo setCabinClassMemo(String cabinClassMemo) {
            this.cabinClassMemo = cabinClassMemo;
            return this;
        }
        public String getCabinClassMemo() {
            return this.cabinClassMemo;
        }

        public ModuleReShopItemListBestPriceItemShoppingItemMapValueCabinQuantityListCabinInfo setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

    }

    public static class ModuleReShopItemListBestPriceItemShoppingItemMapValueCabinQuantityList extends TeaModel {
        /**
         * <p>The segment position information, indicating the journey index and segment index within the overall itinerary.</p>
         */
        @NameInMap("segment_position")
        public ModuleReShopItemListBestPriceItemShoppingItemMapValueCabinQuantityListSegmentPosition segmentPosition;

        /**
         * <p>The cabin details.</p>
         */
        @NameInMap("cabin_info")
        public ModuleReShopItemListBestPriceItemShoppingItemMapValueCabinQuantityListCabinInfo cabinInfo;

        public static ModuleReShopItemListBestPriceItemShoppingItemMapValueCabinQuantityList build(java.util.Map<String, ?> map) throws Exception {
            ModuleReShopItemListBestPriceItemShoppingItemMapValueCabinQuantityList self = new ModuleReShopItemListBestPriceItemShoppingItemMapValueCabinQuantityList();
            return TeaModel.build(map, self);
        }

        public ModuleReShopItemListBestPriceItemShoppingItemMapValueCabinQuantityList setSegmentPosition(ModuleReShopItemListBestPriceItemShoppingItemMapValueCabinQuantityListSegmentPosition segmentPosition) {
            this.segmentPosition = segmentPosition;
            return this;
        }
        public ModuleReShopItemListBestPriceItemShoppingItemMapValueCabinQuantityListSegmentPosition getSegmentPosition() {
            return this.segmentPosition;
        }

        public ModuleReShopItemListBestPriceItemShoppingItemMapValueCabinQuantityList setCabinInfo(ModuleReShopItemListBestPriceItemShoppingItemMapValueCabinQuantityListCabinInfo cabinInfo) {
            this.cabinInfo = cabinInfo;
            return this;
        }
        public ModuleReShopItemListBestPriceItemShoppingItemMapValueCabinQuantityListCabinInfo getCabinInfo() {
            return this.cabinInfo;
        }

    }

    public static class ModuleReShopItemListBestPriceItemShoppingItemMapValueSearchPrice extends TeaModel {
        /**
         * <p>The total amount in cents.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("total_amount")
        public Long totalAmount;

        /**
         * <p>The service fee amount, in cents.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("handling_amount")
        public Long handlingAmount;

        /**
         * <p>The cabin upgrade fee amount in cents.</p>
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
         * <p>Indicates whether a direct price is available. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
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

        public static ModuleReShopItemListBestPriceItemShoppingItemMapValueSearchPrice build(java.util.Map<String, ?> map) throws Exception {
            ModuleReShopItemListBestPriceItemShoppingItemMapValueSearchPrice self = new ModuleReShopItemListBestPriceItemShoppingItemMapValueSearchPrice();
            return TeaModel.build(map, self);
        }

        public ModuleReShopItemListBestPriceItemShoppingItemMapValueSearchPrice setTotalAmount(Long totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public Long getTotalAmount() {
            return this.totalAmount;
        }

        public ModuleReShopItemListBestPriceItemShoppingItemMapValueSearchPrice setHandlingAmount(Long handlingAmount) {
            this.handlingAmount = handlingAmount;
            return this;
        }
        public Long getHandlingAmount() {
            return this.handlingAmount;
        }

        public ModuleReShopItemListBestPriceItemShoppingItemMapValueSearchPrice setUpgradeAmount(Long upgradeAmount) {
            this.upgradeAmount = upgradeAmount;
            return this;
        }
        public Long getUpgradeAmount() {
            return this.upgradeAmount;
        }

        public ModuleReShopItemListBestPriceItemShoppingItemMapValueSearchPrice setTaxDiffAmount(Long taxDiffAmount) {
            this.taxDiffAmount = taxDiffAmount;
            return this;
        }
        public Long getTaxDiffAmount() {
            return this.taxDiffAmount;
        }

        public ModuleReShopItemListBestPriceItemShoppingItemMapValueSearchPrice setHasPrice(Boolean hasPrice) {
            this.hasPrice = hasPrice;
            return this;
        }
        public Boolean getHasPrice() {
            return this.hasPrice;
        }

        public ModuleReShopItemListBestPriceItemShoppingItemMapValueSearchPrice setNonPriceText(String nonPriceText) {
            this.nonPriceText = nonPriceText;
            return this;
        }
        public String getNonPriceText() {
            return this.nonPriceText;
        }

    }

    public static class ModuleReShopItemListBestPriceItemShoppingItemMapValueSegmentPriceListSegmentPosition extends TeaModel {
        /**
         * <p>The journey ordinal number (starting from 0).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("journey_index")
        public Integer journeyIndex;

        /**
         * <p>The segment ordinal number (starting from 0 within the same journey).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("segment_index")
        public Integer segmentIndex;

        public static ModuleReShopItemListBestPriceItemShoppingItemMapValueSegmentPriceListSegmentPosition build(java.util.Map<String, ?> map) throws Exception {
            ModuleReShopItemListBestPriceItemShoppingItemMapValueSegmentPriceListSegmentPosition self = new ModuleReShopItemListBestPriceItemShoppingItemMapValueSegmentPriceListSegmentPosition();
            return TeaModel.build(map, self);
        }

        public ModuleReShopItemListBestPriceItemShoppingItemMapValueSegmentPriceListSegmentPosition setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public ModuleReShopItemListBestPriceItemShoppingItemMapValueSegmentPriceListSegmentPosition setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

    }

    public static class ModuleReShopItemListBestPriceItemShoppingItemMapValueSegmentPriceListSearchPrice extends TeaModel {
        /**
         * <p>The total amount in cents.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("total_amount")
        public Long totalAmount;

        /**
         * <p>The service fee amount, in cents.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("handling_amount")
        public Long handlingAmount;

        /**
         * <p>The cabin upgrade fee amount in cents.</p>
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
         * <p>Indicates whether a direct price is available. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
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

        public static ModuleReShopItemListBestPriceItemShoppingItemMapValueSegmentPriceListSearchPrice build(java.util.Map<String, ?> map) throws Exception {
            ModuleReShopItemListBestPriceItemShoppingItemMapValueSegmentPriceListSearchPrice self = new ModuleReShopItemListBestPriceItemShoppingItemMapValueSegmentPriceListSearchPrice();
            return TeaModel.build(map, self);
        }

        public ModuleReShopItemListBestPriceItemShoppingItemMapValueSegmentPriceListSearchPrice setTotalAmount(Long totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public Long getTotalAmount() {
            return this.totalAmount;
        }

        public ModuleReShopItemListBestPriceItemShoppingItemMapValueSegmentPriceListSearchPrice setHandlingAmount(Long handlingAmount) {
            this.handlingAmount = handlingAmount;
            return this;
        }
        public Long getHandlingAmount() {
            return this.handlingAmount;
        }

        public ModuleReShopItemListBestPriceItemShoppingItemMapValueSegmentPriceListSearchPrice setUpgradeAmount(Long upgradeAmount) {
            this.upgradeAmount = upgradeAmount;
            return this;
        }
        public Long getUpgradeAmount() {
            return this.upgradeAmount;
        }

        public ModuleReShopItemListBestPriceItemShoppingItemMapValueSegmentPriceListSearchPrice setTaxDiffAmount(Long taxDiffAmount) {
            this.taxDiffAmount = taxDiffAmount;
            return this;
        }
        public Long getTaxDiffAmount() {
            return this.taxDiffAmount;
        }

        public ModuleReShopItemListBestPriceItemShoppingItemMapValueSegmentPriceListSearchPrice setHasPrice(Boolean hasPrice) {
            this.hasPrice = hasPrice;
            return this;
        }
        public Boolean getHasPrice() {
            return this.hasPrice;
        }

        public ModuleReShopItemListBestPriceItemShoppingItemMapValueSegmentPriceListSearchPrice setNonPriceText(String nonPriceText) {
            this.nonPriceText = nonPriceText;
            return this;
        }
        public String getNonPriceText() {
            return this.nonPriceText;
        }

    }

    public static class ModuleReShopItemListBestPriceItemShoppingItemMapValueSegmentPriceList extends TeaModel {
        /**
         * <p>The segment position information, indicating the journey index and segment index within the overall itinerary.</p>
         */
        @NameInMap("segment_position")
        public ModuleReShopItemListBestPriceItemShoppingItemMapValueSegmentPriceListSegmentPosition segmentPosition;

        /**
         * <p>The rebooking price.</p>
         */
        @NameInMap("search_price")
        public ModuleReShopItemListBestPriceItemShoppingItemMapValueSegmentPriceListSearchPrice searchPrice;

        public static ModuleReShopItemListBestPriceItemShoppingItemMapValueSegmentPriceList build(java.util.Map<String, ?> map) throws Exception {
            ModuleReShopItemListBestPriceItemShoppingItemMapValueSegmentPriceList self = new ModuleReShopItemListBestPriceItemShoppingItemMapValueSegmentPriceList();
            return TeaModel.build(map, self);
        }

        public ModuleReShopItemListBestPriceItemShoppingItemMapValueSegmentPriceList setSegmentPosition(ModuleReShopItemListBestPriceItemShoppingItemMapValueSegmentPriceListSegmentPosition segmentPosition) {
            this.segmentPosition = segmentPosition;
            return this;
        }
        public ModuleReShopItemListBestPriceItemShoppingItemMapValueSegmentPriceListSegmentPosition getSegmentPosition() {
            return this.segmentPosition;
        }

        public ModuleReShopItemListBestPriceItemShoppingItemMapValueSegmentPriceList setSearchPrice(ModuleReShopItemListBestPriceItemShoppingItemMapValueSegmentPriceListSearchPrice searchPrice) {
            this.searchPrice = searchPrice;
            return this;
        }
        public ModuleReShopItemListBestPriceItemShoppingItemMapValueSegmentPriceListSearchPrice getSearchPrice() {
            return this.searchPrice;
        }

    }

}
