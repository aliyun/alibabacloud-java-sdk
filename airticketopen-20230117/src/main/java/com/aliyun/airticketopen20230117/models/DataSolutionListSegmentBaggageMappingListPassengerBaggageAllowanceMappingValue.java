// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue extends TeaModel {
    /**
     * <p>Number of checked baggage pieces</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("baggage_amount")
    public Integer baggageAmount;

    /**
     * <p>Weight of checked baggage</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("baggage_weight")
    public Integer baggageWeight;

    /**
     * <p>Unit of checked baggage weight (KG)</p>
     * 
     * <strong>example:</strong>
     * <p>KG</p>
     */
    @NameInMap("baggage_weight_unit")
    public String baggageWeightUnit;

    /**
     * <p>Whether the weight applies to all checked baggage</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("is_all_weight")
    public Boolean isAllWeight;

    /**
     * <p>Number of carry-on baggage pieces</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("carry_on_amount")
    public Integer carryOnAmount;

    /**
     * <p>Weight of carry-on baggage</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("carry_on_weight")
    public Integer carryOnWeight;

    /**
     * <p>Carry-on luggage weight unit KG</p>
     * 
     * <strong>example:</strong>
     * <p>KG</p>
     */
    @NameInMap("carry_on_weight_unit")
    public String carryOnWeightUnit;

    /**
     * <p>Whether it is the total carry-on luggage weight</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("is_all_carry_on_weight")
    public Boolean isAllCarryOnWeight;

    /**
     * <p>Carry-on luggage length (unit: centimeters)</p>
     * 
     * <strong>example:</strong>
     * <p>55</p>
     */
    @NameInMap("carry_length")
    public Integer carryLength;

    /**
     * <p>Carry-on luggage width (unit: centimeters)</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("carry_width")
    public Integer carryWidth;

    /**
     * <p>Carry-on luggage height (unit: centimeters)</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("carry_height")
    public Integer carryHeight;

    /**
     * <p>Sum of three sides of the Carry-on luggage (unit: centimeters)</p>
     * 
     * <strong>example:</strong>
     * <p>115</p>
     */
    @NameInMap("carry_sum_of_length_width_height")
    public Integer carrySumOfLengthWidthHeight;

    /**
     * <p>Check-in luggage length (unit: centimeters)</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("length")
    public Integer length;

    /**
     * <p>Check-in luggage width (unit: centimeters)</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("width")
    public Integer width;

    /**
     * <p>Check-in luggage height (unit: centimeters)</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("height")
    public Integer height;

    /**
     * <p>Sum of three sides of the Check-in luggage (unit: centimeters)</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("sum_of_length_width_height")
    public Integer sumOfLengthWidthHeight;

    public static DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue build(java.util.Map<String, ?> map) throws Exception {
        DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue self = new DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue();
        return TeaModel.build(map, self);
    }

    public DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue setBaggageAmount(Integer baggageAmount) {
        this.baggageAmount = baggageAmount;
        return this;
    }
    public Integer getBaggageAmount() {
        return this.baggageAmount;
    }

    public DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue setBaggageWeight(Integer baggageWeight) {
        this.baggageWeight = baggageWeight;
        return this;
    }
    public Integer getBaggageWeight() {
        return this.baggageWeight;
    }

    public DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue setBaggageWeightUnit(String baggageWeightUnit) {
        this.baggageWeightUnit = baggageWeightUnit;
        return this;
    }
    public String getBaggageWeightUnit() {
        return this.baggageWeightUnit;
    }

    public DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue setIsAllWeight(Boolean isAllWeight) {
        this.isAllWeight = isAllWeight;
        return this;
    }
    public Boolean getIsAllWeight() {
        return this.isAllWeight;
    }

    public DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue setCarryOnAmount(Integer carryOnAmount) {
        this.carryOnAmount = carryOnAmount;
        return this;
    }
    public Integer getCarryOnAmount() {
        return this.carryOnAmount;
    }

    public DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue setCarryOnWeight(Integer carryOnWeight) {
        this.carryOnWeight = carryOnWeight;
        return this;
    }
    public Integer getCarryOnWeight() {
        return this.carryOnWeight;
    }

    public DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue setCarryOnWeightUnit(String carryOnWeightUnit) {
        this.carryOnWeightUnit = carryOnWeightUnit;
        return this;
    }
    public String getCarryOnWeightUnit() {
        return this.carryOnWeightUnit;
    }

    public DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue setIsAllCarryOnWeight(Boolean isAllCarryOnWeight) {
        this.isAllCarryOnWeight = isAllCarryOnWeight;
        return this;
    }
    public Boolean getIsAllCarryOnWeight() {
        return this.isAllCarryOnWeight;
    }

    public DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue setCarryLength(Integer carryLength) {
        this.carryLength = carryLength;
        return this;
    }
    public Integer getCarryLength() {
        return this.carryLength;
    }

    public DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue setCarryWidth(Integer carryWidth) {
        this.carryWidth = carryWidth;
        return this;
    }
    public Integer getCarryWidth() {
        return this.carryWidth;
    }

    public DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue setCarryHeight(Integer carryHeight) {
        this.carryHeight = carryHeight;
        return this;
    }
    public Integer getCarryHeight() {
        return this.carryHeight;
    }

    public DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue setCarrySumOfLengthWidthHeight(Integer carrySumOfLengthWidthHeight) {
        this.carrySumOfLengthWidthHeight = carrySumOfLengthWidthHeight;
        return this;
    }
    public Integer getCarrySumOfLengthWidthHeight() {
        return this.carrySumOfLengthWidthHeight;
    }

    public DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue setLength(Integer length) {
        this.length = length;
        return this;
    }
    public Integer getLength() {
        return this.length;
    }

    public DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

    public DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue setSumOfLengthWidthHeight(Integer sumOfLengthWidthHeight) {
        this.sumOfLengthWidthHeight = sumOfLengthWidthHeight;
        return this;
    }
    public Integer getSumOfLengthWidthHeight() {
        return this.sumOfLengthWidthHeight;
    }

}
