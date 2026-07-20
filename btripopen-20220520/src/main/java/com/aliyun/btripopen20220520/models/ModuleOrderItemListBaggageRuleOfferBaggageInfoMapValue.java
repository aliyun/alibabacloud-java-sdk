// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue extends TeaModel {
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
     * <p>30</p>
     */
    @NameInMap("length")
    public Integer length;

    /**
     * <strong>example:</strong>
     * <p>20</p>
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

    public static ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue self = new ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue();
        return TeaModel.build(map, self);
    }

    public ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue setStartCityCode(String startCityCode) {
        this.startCityCode = startCityCode;
        return this;
    }
    public String getStartCityCode() {
        return this.startCityCode;
    }

    public ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue setEndCityCode(String endCityCode) {
        this.endCityCode = endCityCode;
        return this;
    }
    public String getEndCityCode() {
        return this.endCityCode;
    }

    public ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue setCarryFreePc(Integer carryFreePc) {
        this.carryFreePc = carryFreePc;
        return this;
    }
    public Integer getCarryFreePc() {
        return this.carryFreePc;
    }

    public ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue setCarryBagWeight(Integer carryBagWeight) {
        this.carryBagWeight = carryBagWeight;
        return this;
    }
    public Integer getCarryBagWeight() {
        return this.carryBagWeight;
    }

    public ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue setCarryBagSize(String carryBagSize) {
        this.carryBagSize = carryBagSize;
        return this;
    }
    public String getCarryBagSize() {
        return this.carryBagSize;
    }

    public ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue setIsAllCarryBagWeight(Boolean isAllCarryBagWeight) {
        this.isAllCarryBagWeight = isAllCarryBagWeight;
        return this;
    }
    public Boolean getIsAllCarryBagWeight() {
        return this.isAllCarryBagWeight;
    }

    public ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue setTotalPcs(Long totalPcs) {
        this.totalPcs = totalPcs;
        return this;
    }
    public Long getTotalPcs() {
        return this.totalPcs;
    }

    public ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue setTotalWeight(Long totalWeight) {
        this.totalWeight = totalWeight;
        return this;
    }
    public Long getTotalWeight() {
        return this.totalWeight;
    }

    public ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue setCarryUnknown(Boolean carryUnknown) {
        this.carryUnknown = carryUnknown;
        return this;
    }
    public Boolean getCarryUnknown() {
        return this.carryUnknown;
    }

    public ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue setCarryLength(Integer carryLength) {
        this.carryLength = carryLength;
        return this;
    }
    public Integer getCarryLength() {
        return this.carryLength;
    }

    public ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue setCarryWidth(Integer carryWidth) {
        this.carryWidth = carryWidth;
        return this;
    }
    public Integer getCarryWidth() {
        return this.carryWidth;
    }

    public ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue setCarryHeight(Integer carryHeight) {
        this.carryHeight = carryHeight;
        return this;
    }
    public Integer getCarryHeight() {
        return this.carryHeight;
    }

    public ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue setCarrySumOfLengthWidthHeight(Integer carrySumOfLengthWidthHeight) {
        this.carrySumOfLengthWidthHeight = carrySumOfLengthWidthHeight;
        return this;
    }
    public Integer getCarrySumOfLengthWidthHeight() {
        return this.carrySumOfLengthWidthHeight;
    }

    public ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue setFreePcs(Long freePcs) {
        this.freePcs = freePcs;
        return this;
    }
    public Long getFreePcs() {
        return this.freePcs;
    }

    public ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue setBaggageWeight(Long baggageWeight) {
        this.baggageWeight = baggageWeight;
        return this;
    }
    public Long getBaggageWeight() {
        return this.baggageWeight;
    }

    public ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue setBaggageUnit(String baggageUnit) {
        this.baggageUnit = baggageUnit;
        return this;
    }
    public String getBaggageUnit() {
        return this.baggageUnit;
    }

    public ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue setBaggageSize(String baggageSize) {
        this.baggageSize = baggageSize;
        return this;
    }
    public String getBaggageSize() {
        return this.baggageSize;
    }

    public ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue setAllWeight(Boolean allWeight) {
        this.allWeight = allWeight;
        return this;
    }
    public Boolean getAllWeight() {
        return this.allWeight;
    }

    public ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue setLength(Integer length) {
        this.length = length;
        return this;
    }
    public Integer getLength() {
        return this.length;
    }

    public ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

    public ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue setSumOfLengthWidthHeight(Integer sumOfLengthWidthHeight) {
        this.sumOfLengthWidthHeight = sumOfLengthWidthHeight;
        return this;
    }
    public Integer getSumOfLengthWidthHeight() {
        return this.sumOfLengthWidthHeight;
    }

    public ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue setUnknown(Boolean unknown) {
        this.unknown = unknown;
        return this;
    }
    public Boolean getUnknown() {
        return this.unknown;
    }

    public ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue setCnDesc(String cnDesc) {
        this.cnDesc = cnDesc;
        return this;
    }
    public String getCnDesc() {
        return this.cnDesc;
    }

    public ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue setEnDesc(String enDesc) {
        this.enDesc = enDesc;
        return this;
    }
    public String getEnDesc() {
        return this.enDesc;
    }

    public ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue setAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }
    public String getAttribute() {
        return this.attribute;
    }

    public ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue setBaggagePrice(Integer baggagePrice) {
        this.baggagePrice = baggagePrice;
        return this;
    }
    public Integer getBaggagePrice() {
        return this.baggagePrice;
    }

    public ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue setCarryOnBaggageTips(String carryOnBaggageTips) {
        this.carryOnBaggageTips = carryOnBaggageTips;
        return this;
    }
    public String getCarryOnBaggageTips() {
        return this.carryOnBaggageTips;
    }

}
