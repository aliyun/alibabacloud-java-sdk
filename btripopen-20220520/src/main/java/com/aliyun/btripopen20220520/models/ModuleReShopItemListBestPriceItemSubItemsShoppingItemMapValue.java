// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValue extends TeaModel {
    /**
     * <p>The cabin remaining inventory per segment.</p>
     */
    @NameInMap("cabin_quantity_list")
    public java.util.List<ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueCabinQuantityList> cabinQuantityList;

    /**
     * <p>The rebooking search price.</p>
     */
    @NameInMap("search_price")
    public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSearchPrice searchPrice;

    /**
     * <p>The price per segment. This field may not have a value because airline bundled products may not have prices split by segment.</p>
     */
    @NameInMap("segment_price_list")
    public java.util.List<ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceList> segmentPriceList;

    public static ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValue self = new ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValue();
        return TeaModel.build(map, self);
    }

    public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValue setCabinQuantityList(java.util.List<ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueCabinQuantityList> cabinQuantityList) {
        this.cabinQuantityList = cabinQuantityList;
        return this;
    }
    public java.util.List<ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueCabinQuantityList> getCabinQuantityList() {
        return this.cabinQuantityList;
    }

    public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValue setSearchPrice(ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSearchPrice searchPrice) {
        this.searchPrice = searchPrice;
        return this;
    }
    public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSearchPrice getSearchPrice() {
        return this.searchPrice;
    }

    public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValue setSegmentPriceList(java.util.List<ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceList> segmentPriceList) {
        this.segmentPriceList = segmentPriceList;
        return this;
    }
    public java.util.List<ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceList> getSegmentPriceList() {
        return this.segmentPriceList;
    }

    public static class ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueCabinQuantityListSegmentPosition extends TeaModel {
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

        public static ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueCabinQuantityListSegmentPosition build(java.util.Map<String, ?> map) throws Exception {
            ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueCabinQuantityListSegmentPosition self = new ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueCabinQuantityListSegmentPosition();
            return TeaModel.build(map, self);
        }

        public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueCabinQuantityListSegmentPosition setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueCabinQuantityListSegmentPosition setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

    }

    public static class ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueCabinQuantityListCabinInfo extends TeaModel {
        /**
         * <p>The cabin code.</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("cabin")
        public String cabin;

        /**
         * <p>The cabin class. Valid values: F: first class. C: business class. Y: economy class. P: premium economy class.</p>
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
         * <p>The number of remaining seats in the cabin. 0-9: 0 to 9 seats remaining. A: more than 9 seats remaining.</p>
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

        public static ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueCabinQuantityListCabinInfo build(java.util.Map<String, ?> map) throws Exception {
            ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueCabinQuantityListCabinInfo self = new ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueCabinQuantityListCabinInfo();
            return TeaModel.build(map, self);
        }

        public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueCabinQuantityListCabinInfo setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueCabinQuantityListCabinInfo setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueCabinQuantityListCabinInfo setCabinClassName(String cabinClassName) {
            this.cabinClassName = cabinClassName;
            return this;
        }
        public String getCabinClassName() {
            return this.cabinClassName;
        }

        public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueCabinQuantityListCabinInfo setQuantity(String quantity) {
            this.quantity = quantity;
            return this;
        }
        public String getQuantity() {
            return this.quantity;
        }

        public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueCabinQuantityListCabinInfo setCabinClassMemo(String cabinClassMemo) {
            this.cabinClassMemo = cabinClassMemo;
            return this;
        }
        public String getCabinClassMemo() {
            return this.cabinClassMemo;
        }

        public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueCabinQuantityListCabinInfo setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

    }

    public static class ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueCabinQuantityList extends TeaModel {
        /**
         * <p>The segment position information, indicating the journey index and segment index within the overall itinerary.</p>
         */
        @NameInMap("segment_position")
        public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueCabinQuantityListSegmentPosition segmentPosition;

        /**
         * <p>The cabin details.</p>
         */
        @NameInMap("cabin_info")
        public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueCabinQuantityListCabinInfo cabinInfo;

        public static ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueCabinQuantityList build(java.util.Map<String, ?> map) throws Exception {
            ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueCabinQuantityList self = new ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueCabinQuantityList();
            return TeaModel.build(map, self);
        }

        public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueCabinQuantityList setSegmentPosition(ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueCabinQuantityListSegmentPosition segmentPosition) {
            this.segmentPosition = segmentPosition;
            return this;
        }
        public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueCabinQuantityListSegmentPosition getSegmentPosition() {
            return this.segmentPosition;
        }

        public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueCabinQuantityList setCabinInfo(ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueCabinQuantityListCabinInfo cabinInfo) {
            this.cabinInfo = cabinInfo;
            return this;
        }
        public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueCabinQuantityListCabinInfo getCabinInfo() {
            return this.cabinInfo;
        }

    }

    public static class ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSearchPrice extends TeaModel {
        /**
         * <p>The total amount, in cents.</p>
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
         * <p>The cabin upgrade fee amount, in cents.</p>
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
         * <p>1000</p>
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

        public static ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSearchPrice build(java.util.Map<String, ?> map) throws Exception {
            ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSearchPrice self = new ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSearchPrice();
            return TeaModel.build(map, self);
        }

        public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSearchPrice setTotalAmount(Long totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public Long getTotalAmount() {
            return this.totalAmount;
        }

        public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSearchPrice setHandlingAmount(Long handlingAmount) {
            this.handlingAmount = handlingAmount;
            return this;
        }
        public Long getHandlingAmount() {
            return this.handlingAmount;
        }

        public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSearchPrice setUpgradeAmount(Long upgradeAmount) {
            this.upgradeAmount = upgradeAmount;
            return this;
        }
        public Long getUpgradeAmount() {
            return this.upgradeAmount;
        }

        public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSearchPrice setTaxDiffAmount(Long taxDiffAmount) {
            this.taxDiffAmount = taxDiffAmount;
            return this;
        }
        public Long getTaxDiffAmount() {
            return this.taxDiffAmount;
        }

        public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSearchPrice setHasPrice(Boolean hasPrice) {
            this.hasPrice = hasPrice;
            return this;
        }
        public Boolean getHasPrice() {
            return this.hasPrice;
        }

        public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSearchPrice setNonPriceText(String nonPriceText) {
            this.nonPriceText = nonPriceText;
            return this;
        }
        public String getNonPriceText() {
            return this.nonPriceText;
        }

    }

    public static class ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceListSegmentPosition extends TeaModel {
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

        public static ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceListSegmentPosition build(java.util.Map<String, ?> map) throws Exception {
            ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceListSegmentPosition self = new ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceListSegmentPosition();
            return TeaModel.build(map, self);
        }

        public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceListSegmentPosition setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceListSegmentPosition setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

    }

    public static class ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceListSearchPrice extends TeaModel {
        /**
         * <p>The total amount, in cents.</p>
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
         * <p>The cabin upgrade fee amount, in cents.</p>
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
         * <p>1000</p>
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

        public static ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceListSearchPrice build(java.util.Map<String, ?> map) throws Exception {
            ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceListSearchPrice self = new ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceListSearchPrice();
            return TeaModel.build(map, self);
        }

        public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceListSearchPrice setTotalAmount(Long totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public Long getTotalAmount() {
            return this.totalAmount;
        }

        public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceListSearchPrice setHandlingAmount(Long handlingAmount) {
            this.handlingAmount = handlingAmount;
            return this;
        }
        public Long getHandlingAmount() {
            return this.handlingAmount;
        }

        public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceListSearchPrice setUpgradeAmount(Long upgradeAmount) {
            this.upgradeAmount = upgradeAmount;
            return this;
        }
        public Long getUpgradeAmount() {
            return this.upgradeAmount;
        }

        public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceListSearchPrice setTaxDiffAmount(Long taxDiffAmount) {
            this.taxDiffAmount = taxDiffAmount;
            return this;
        }
        public Long getTaxDiffAmount() {
            return this.taxDiffAmount;
        }

        public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceListSearchPrice setHasPrice(Boolean hasPrice) {
            this.hasPrice = hasPrice;
            return this;
        }
        public Boolean getHasPrice() {
            return this.hasPrice;
        }

        public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceListSearchPrice setNonPriceText(String nonPriceText) {
            this.nonPriceText = nonPriceText;
            return this;
        }
        public String getNonPriceText() {
            return this.nonPriceText;
        }

    }

    public static class ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceList extends TeaModel {
        /**
         * <p>The segment position information, indicating the journey index and segment index within the overall itinerary.</p>
         */
        @NameInMap("segment_position")
        public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceListSegmentPosition segmentPosition;

        /**
         * <p>The rebooking price.</p>
         */
        @NameInMap("search_price")
        public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceListSearchPrice searchPrice;

        public static ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceList build(java.util.Map<String, ?> map) throws Exception {
            ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceList self = new ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceList();
            return TeaModel.build(map, self);
        }

        public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceList setSegmentPosition(ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceListSegmentPosition segmentPosition) {
            this.segmentPosition = segmentPosition;
            return this;
        }
        public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceListSegmentPosition getSegmentPosition() {
            return this.segmentPosition;
        }

        public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceList setSearchPrice(ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceListSearchPrice searchPrice) {
            this.searchPrice = searchPrice;
            return this;
        }
        public ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValueSegmentPriceListSearchPrice getSearchPrice() {
            return this.searchPrice;
        }

    }

}
