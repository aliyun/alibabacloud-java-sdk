// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue extends TeaModel {
    /**
     * <p>The departure city code.</p>
     * 
     * <strong>example:</strong>
     * <p>BJS</p>
     */
    @NameInMap("start_city_code")
    public String startCityCode;

    /**
     * <p>The arrival city code.</p>
     * 
     * <strong>example:</strong>
     * <p>HGH</p>
     */
    @NameInMap("end_city_code")
    public String endCityCode;

    /**
     * <p>The number of carry-on baggage pieces.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("carry_free_pc")
    public Integer carryFreePc;

    /**
     * <p>The carry-on baggage weight.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("carry_bag_weight")
    public Integer carryBagWeight;

    /**
     * <p>The weight unit of carry-on baggage.</p>
     * 
     * <strong>example:</strong>
     * <p>KG</p>
     */
    @NameInMap("carry_on_weight_unit")
    public String carryOnWeightUnit;

    /**
     * <p>The carry-on baggage size.</p>
     * 
     * <strong>example:</strong>
     * <p>20<em>40</em>55CM、三边之和不超过115CM</p>
     */
    @NameInMap("carry_bag_size")
    public String carryBagSize;

    /**
     * <p>Indicates whether the carry-on baggage weight represents the total weight.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("is_all_carry_bag_weight")
    public Boolean isAllCarryBagWeight;

    /**
     * <p>The total number of carry-on and checked baggage pieces. This field is for domestic flights only.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("total_pcs")
    public Long totalPcs;

    /**
     * <p>The total weight of carry-on and checked baggage. This field is for domestic flights only.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("total_weight")
    public Long totalWeight;

    /**
     * <p>The unknown flag for carry-on baggage.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("carry_unknown")
    public Boolean carryUnknown;

    /**
     * <p>The length of carry-on baggage.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("carry_length")
    public Integer carryLength;

    /**
     * <p>The width of carry-on baggage.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("carry_width")
    public Integer carryWidth;

    /**
     * <p>The height of carry-on baggage.</p>
     * 
     * <strong>example:</strong>
     * <p>55</p>
     */
    @NameInMap("carry_height")
    public Integer carryHeight;

    /**
     * <p>The sum of length, width, and height of carry-on baggage.</p>
     * 
     * <strong>example:</strong>
     * <p>115</p>
     */
    @NameInMap("carry_sum_of_length_width_height")
    public Integer carrySumOfLengthWidthHeight;

    /**
     * <p>The number of checked baggage pieces.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("free_pcs")
    public Long freePcs;

    /**
     * <p>The maximum weight of checked baggage, in pounds or kilograms.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("baggage_weight")
    public Long baggageWeight;

    /**
     * <p>The weight unit of checked baggage.</p>
     * 
     * <strong>example:</strong>
     * <p>KG</p>
     */
    @NameInMap("baggage_unit")
    public String baggageUnit;

    /**
     * <p>The checked baggage size.</p>
     * 
     * <strong>example:</strong>
     * <p>长宽高之和≤158CM</p>
     */
    @NameInMap("baggage_size")
    public String baggageSize;

    /**
     * <p>Indicates whether the checked baggage weight represents the total weight of all pieces.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("all_weight")
    public Boolean allWeight;

    /**
     * <p>The length of checked baggage.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("length")
    public Integer length;

    /**
     * <p>The width of checked baggage.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("width")
    public Integer width;

    /**
     * <p>The height of checked baggage.</p>
     * 
     * <strong>example:</strong>
     * <p>55</p>
     */
    @NameInMap("height")
    public Integer height;

    /**
     * <p>The sum of length, width, and height of checked baggage.</p>
     * 
     * <strong>example:</strong>
     * <p>115</p>
     */
    @NameInMap("sum_of_length_width_height")
    public Integer sumOfLengthWidthHeight;

    /**
     * <p>The unknown baggage flag.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("unknown")
    public Boolean unknown;

    /**
     * <p>The Chinese description of the baggage allowance.</p>
     * 
     * <strong>example:</strong>
     * <p>行李额中文描述</p>
     */
    @NameInMap("cn_desc")
    public String cnDesc;

    /**
     * <p>The English description of the baggage allowance.</p>
     * 
     * <strong>example:</strong>
     * <p>行李额英文描述</p>
     */
    @NameInMap("en_desc")
    public String enDesc;

    /**
     * <p>The extended attributes in JSON format. For domestic flights, this field stores multiple text fields with the following field names:</p>
     * <ul>
     * <li>label: label</li>
     * <li>excessInstruction: excess baggage instructions</li>
     * <li>babyCar: baby stroller instructions</li>
     * <li>phoneText: SMS text</li>
     * <li>defaultRule: fallback rule</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;defaultRule&quot;:&quot;&quot;}</p>
     */
    @NameInMap("attribute")
    public String attribute;

    /**
     * <p>The baggage price.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("baggage_price")
    public Integer baggagePrice;

    /**
     * <p>The carry-on baggage tips.</p>
     * 
     * <strong>example:</strong>
     * <p>随身行李提示信息</p>
     */
    @NameInMap("carry_on_baggage_tips")
    public String carryOnBaggageTips;

    public static ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue self = new ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue();
        return TeaModel.build(map, self);
    }

    public ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setStartCityCode(String startCityCode) {
        this.startCityCode = startCityCode;
        return this;
    }
    public String getStartCityCode() {
        return this.startCityCode;
    }

    public ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setEndCityCode(String endCityCode) {
        this.endCityCode = endCityCode;
        return this;
    }
    public String getEndCityCode() {
        return this.endCityCode;
    }

    public ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setCarryFreePc(Integer carryFreePc) {
        this.carryFreePc = carryFreePc;
        return this;
    }
    public Integer getCarryFreePc() {
        return this.carryFreePc;
    }

    public ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setCarryBagWeight(Integer carryBagWeight) {
        this.carryBagWeight = carryBagWeight;
        return this;
    }
    public Integer getCarryBagWeight() {
        return this.carryBagWeight;
    }

    public ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setCarryOnWeightUnit(String carryOnWeightUnit) {
        this.carryOnWeightUnit = carryOnWeightUnit;
        return this;
    }
    public String getCarryOnWeightUnit() {
        return this.carryOnWeightUnit;
    }

    public ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setCarryBagSize(String carryBagSize) {
        this.carryBagSize = carryBagSize;
        return this;
    }
    public String getCarryBagSize() {
        return this.carryBagSize;
    }

    public ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setIsAllCarryBagWeight(Boolean isAllCarryBagWeight) {
        this.isAllCarryBagWeight = isAllCarryBagWeight;
        return this;
    }
    public Boolean getIsAllCarryBagWeight() {
        return this.isAllCarryBagWeight;
    }

    public ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setTotalPcs(Long totalPcs) {
        this.totalPcs = totalPcs;
        return this;
    }
    public Long getTotalPcs() {
        return this.totalPcs;
    }

    public ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setTotalWeight(Long totalWeight) {
        this.totalWeight = totalWeight;
        return this;
    }
    public Long getTotalWeight() {
        return this.totalWeight;
    }

    public ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setCarryUnknown(Boolean carryUnknown) {
        this.carryUnknown = carryUnknown;
        return this;
    }
    public Boolean getCarryUnknown() {
        return this.carryUnknown;
    }

    public ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setCarryLength(Integer carryLength) {
        this.carryLength = carryLength;
        return this;
    }
    public Integer getCarryLength() {
        return this.carryLength;
    }

    public ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setCarryWidth(Integer carryWidth) {
        this.carryWidth = carryWidth;
        return this;
    }
    public Integer getCarryWidth() {
        return this.carryWidth;
    }

    public ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setCarryHeight(Integer carryHeight) {
        this.carryHeight = carryHeight;
        return this;
    }
    public Integer getCarryHeight() {
        return this.carryHeight;
    }

    public ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setCarrySumOfLengthWidthHeight(Integer carrySumOfLengthWidthHeight) {
        this.carrySumOfLengthWidthHeight = carrySumOfLengthWidthHeight;
        return this;
    }
    public Integer getCarrySumOfLengthWidthHeight() {
        return this.carrySumOfLengthWidthHeight;
    }

    public ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setFreePcs(Long freePcs) {
        this.freePcs = freePcs;
        return this;
    }
    public Long getFreePcs() {
        return this.freePcs;
    }

    public ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setBaggageWeight(Long baggageWeight) {
        this.baggageWeight = baggageWeight;
        return this;
    }
    public Long getBaggageWeight() {
        return this.baggageWeight;
    }

    public ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setBaggageUnit(String baggageUnit) {
        this.baggageUnit = baggageUnit;
        return this;
    }
    public String getBaggageUnit() {
        return this.baggageUnit;
    }

    public ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setBaggageSize(String baggageSize) {
        this.baggageSize = baggageSize;
        return this;
    }
    public String getBaggageSize() {
        return this.baggageSize;
    }

    public ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setAllWeight(Boolean allWeight) {
        this.allWeight = allWeight;
        return this;
    }
    public Boolean getAllWeight() {
        return this.allWeight;
    }

    public ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setLength(Integer length) {
        this.length = length;
        return this;
    }
    public Integer getLength() {
        return this.length;
    }

    public ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

    public ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setSumOfLengthWidthHeight(Integer sumOfLengthWidthHeight) {
        this.sumOfLengthWidthHeight = sumOfLengthWidthHeight;
        return this;
    }
    public Integer getSumOfLengthWidthHeight() {
        return this.sumOfLengthWidthHeight;
    }

    public ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setUnknown(Boolean unknown) {
        this.unknown = unknown;
        return this;
    }
    public Boolean getUnknown() {
        return this.unknown;
    }

    public ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setCnDesc(String cnDesc) {
        this.cnDesc = cnDesc;
        return this;
    }
    public String getCnDesc() {
        return this.cnDesc;
    }

    public ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setEnDesc(String enDesc) {
        this.enDesc = enDesc;
        return this;
    }
    public String getEnDesc() {
        return this.enDesc;
    }

    public ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }
    public String getAttribute() {
        return this.attribute;
    }

    public ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setBaggagePrice(Integer baggagePrice) {
        this.baggagePrice = baggagePrice;
        return this;
    }
    public Integer getBaggagePrice() {
        return this.baggagePrice;
    }

    public ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue setCarryOnBaggageTips(String carryOnBaggageTips) {
        this.carryOnBaggageTips = carryOnBaggageTips;
        return this;
    }
    public String getCarryOnBaggageTips() {
        return this.carryOnBaggageTips;
    }

}
