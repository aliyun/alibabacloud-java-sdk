// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NNG</p>
     */
    @NameInMap("start_city_code")
    public String startCityCode;

    /**
     * <strong>example:</strong>
     * <p>SHA</p>
     */
    @NameInMap("end_city_code")
    public String endCityCode;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("carry_free_pc")
    public Integer carryFreePc;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("carry_bag_weight")
    public Integer carryBagWeight;

    /**
     * <strong>example:</strong>
     * <p>20<em>40</em>55CM、三边之和不超过115CM</p>
     */
    @NameInMap("carry_bag_size")
    public String carryBagSize;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("is_all_carry_bag_weight")
    public Boolean isAllCarryBagWeight;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("total_pcs")
    public Long totalPcs;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("total_weight")
    public Long totalWeight;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("carry_unknown")
    public Boolean carryUnknown;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("carry_length")
    public Integer carryLength;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("carry_width")
    public Integer carryWidth;

    /**
     * <strong>example:</strong>
     * <p>55</p>
     */
    @NameInMap("carry_height")
    public Integer carryHeight;

    /**
     * <strong>example:</strong>
     * <p>115</p>
     */
    @NameInMap("carry_sum_of_length_width_height")
    public Integer carrySumOfLengthWidthHeight;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("free_pcs")
    public Long freePcs;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("baggage_weight")
    public Long baggageWeight;

    /**
     * <strong>example:</strong>
     * <p>KG</p>
     */
    @NameInMap("baggage_unit")
    public String baggageUnit;

    /**
     * <strong>example:</strong>
     * <p>长宽高之和≤158CM</p>
     */
    @NameInMap("baggage_size")
    public String baggageSize;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("all_weight")
    public Boolean allWeight;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("length")
    public Integer length;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("width")
    public Integer width;

    /**
     * <strong>example:</strong>
     * <p>55</p>
     */
    @NameInMap("height")
    public Integer height;

    /**
     * <strong>example:</strong>
     * <p>115</p>
     */
    @NameInMap("sum_of_length_width_height")
    public Integer sumOfLengthWidthHeight;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("unknown")
    public Boolean unknown;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("cn_desc")
    public String cnDesc;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("en_desc")
    public String enDesc;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("attribute")
    public String attribute;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("baggage_price")
    public Integer baggagePrice;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("carry_on_baggage_tips")
    public String carryOnBaggageTips;

    public static ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue self = new ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue();
        return TeaModel.build(map, self);
    }

    public ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setStartCityCode(String startCityCode) {
        this.startCityCode = startCityCode;
        return this;
    }
    public String getStartCityCode() {
        return this.startCityCode;
    }

    public ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setEndCityCode(String endCityCode) {
        this.endCityCode = endCityCode;
        return this;
    }
    public String getEndCityCode() {
        return this.endCityCode;
    }

    public ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setCarryFreePc(Integer carryFreePc) {
        this.carryFreePc = carryFreePc;
        return this;
    }
    public Integer getCarryFreePc() {
        return this.carryFreePc;
    }

    public ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setCarryBagWeight(Integer carryBagWeight) {
        this.carryBagWeight = carryBagWeight;
        return this;
    }
    public Integer getCarryBagWeight() {
        return this.carryBagWeight;
    }

    public ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setCarryBagSize(String carryBagSize) {
        this.carryBagSize = carryBagSize;
        return this;
    }
    public String getCarryBagSize() {
        return this.carryBagSize;
    }

    public ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setIsAllCarryBagWeight(Boolean isAllCarryBagWeight) {
        this.isAllCarryBagWeight = isAllCarryBagWeight;
        return this;
    }
    public Boolean getIsAllCarryBagWeight() {
        return this.isAllCarryBagWeight;
    }

    public ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setTotalPcs(Long totalPcs) {
        this.totalPcs = totalPcs;
        return this;
    }
    public Long getTotalPcs() {
        return this.totalPcs;
    }

    public ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setTotalWeight(Long totalWeight) {
        this.totalWeight = totalWeight;
        return this;
    }
    public Long getTotalWeight() {
        return this.totalWeight;
    }

    public ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setCarryUnknown(Boolean carryUnknown) {
        this.carryUnknown = carryUnknown;
        return this;
    }
    public Boolean getCarryUnknown() {
        return this.carryUnknown;
    }

    public ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setCarryLength(Integer carryLength) {
        this.carryLength = carryLength;
        return this;
    }
    public Integer getCarryLength() {
        return this.carryLength;
    }

    public ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setCarryWidth(Integer carryWidth) {
        this.carryWidth = carryWidth;
        return this;
    }
    public Integer getCarryWidth() {
        return this.carryWidth;
    }

    public ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setCarryHeight(Integer carryHeight) {
        this.carryHeight = carryHeight;
        return this;
    }
    public Integer getCarryHeight() {
        return this.carryHeight;
    }

    public ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setCarrySumOfLengthWidthHeight(Integer carrySumOfLengthWidthHeight) {
        this.carrySumOfLengthWidthHeight = carrySumOfLengthWidthHeight;
        return this;
    }
    public Integer getCarrySumOfLengthWidthHeight() {
        return this.carrySumOfLengthWidthHeight;
    }

    public ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setFreePcs(Long freePcs) {
        this.freePcs = freePcs;
        return this;
    }
    public Long getFreePcs() {
        return this.freePcs;
    }

    public ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setBaggageWeight(Long baggageWeight) {
        this.baggageWeight = baggageWeight;
        return this;
    }
    public Long getBaggageWeight() {
        return this.baggageWeight;
    }

    public ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setBaggageUnit(String baggageUnit) {
        this.baggageUnit = baggageUnit;
        return this;
    }
    public String getBaggageUnit() {
        return this.baggageUnit;
    }

    public ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setBaggageSize(String baggageSize) {
        this.baggageSize = baggageSize;
        return this;
    }
    public String getBaggageSize() {
        return this.baggageSize;
    }

    public ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setAllWeight(Boolean allWeight) {
        this.allWeight = allWeight;
        return this;
    }
    public Boolean getAllWeight() {
        return this.allWeight;
    }

    public ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setLength(Integer length) {
        this.length = length;
        return this;
    }
    public Integer getLength() {
        return this.length;
    }

    public ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

    public ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setSumOfLengthWidthHeight(Integer sumOfLengthWidthHeight) {
        this.sumOfLengthWidthHeight = sumOfLengthWidthHeight;
        return this;
    }
    public Integer getSumOfLengthWidthHeight() {
        return this.sumOfLengthWidthHeight;
    }

    public ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setUnknown(Boolean unknown) {
        this.unknown = unknown;
        return this;
    }
    public Boolean getUnknown() {
        return this.unknown;
    }

    public ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setCnDesc(String cnDesc) {
        this.cnDesc = cnDesc;
        return this;
    }
    public String getCnDesc() {
        return this.cnDesc;
    }

    public ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setEnDesc(String enDesc) {
        this.enDesc = enDesc;
        return this;
    }
    public String getEnDesc() {
        return this.enDesc;
    }

    public ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }
    public String getAttribute() {
        return this.attribute;
    }

    public ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setBaggagePrice(Integer baggagePrice) {
        this.baggagePrice = baggagePrice;
        return this;
    }
    public Integer getBaggagePrice() {
        return this.baggagePrice;
    }

    public ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setCarryOnBaggageTips(String carryOnBaggageTips) {
        this.carryOnBaggageTips = carryOnBaggageTips;
        return this;
    }
    public String getCarryOnBaggageTips() {
        return this.carryOnBaggageTips;
    }

}
