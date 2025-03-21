// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class DataSolutionSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue extends TeaModel {
    /**
     * <p>checked baggage quantity</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("baggage_amount")
    public Integer baggageAmount;

    /**
     * <p>checked baggage weight</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("baggage_weight")
    public Integer baggageWeight;

    /**
     * <p>checked baggage weight unit</p>
     * 
     * <strong>example:</strong>
     * <p>KG</p>
     */
    @NameInMap("baggage_weight_unit")
    public String baggageWeightUnit;

    /**
     * <p>Whether the weight is for all baggages</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("is_all_weight")
    public Boolean isAllWeight;

    /**
     * <p>carry-on baggage quantity</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("carry_on_amount")
    public Integer carryOnAmount;

    /**
     * <p>carry-on baggage weight</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("carry_on_weight")
    public Integer carryOnWeight;

    /**
     * <p>carry-on baggage weight unit</p>
     * 
     * <strong>example:</strong>
     * <p>KG</p>
     */
    @NameInMap("carry_on_weight_unit")
    public String carryOnWeightUnit;

    /**
     * <p>Whether the weight is for all baggages</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("is_all_carry_on_weight")
    public Boolean isAllCarryOnWeight;

    public static DataSolutionSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue build(java.util.Map<String, ?> map) throws Exception {
        DataSolutionSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue self = new DataSolutionSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue();
        return TeaModel.build(map, self);
    }

    public DataSolutionSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue setBaggageAmount(Integer baggageAmount) {
        this.baggageAmount = baggageAmount;
        return this;
    }
    public Integer getBaggageAmount() {
        return this.baggageAmount;
    }

    public DataSolutionSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue setBaggageWeight(Integer baggageWeight) {
        this.baggageWeight = baggageWeight;
        return this;
    }
    public Integer getBaggageWeight() {
        return this.baggageWeight;
    }

    public DataSolutionSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue setBaggageWeightUnit(String baggageWeightUnit) {
        this.baggageWeightUnit = baggageWeightUnit;
        return this;
    }
    public String getBaggageWeightUnit() {
        return this.baggageWeightUnit;
    }

    public DataSolutionSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue setIsAllWeight(Boolean isAllWeight) {
        this.isAllWeight = isAllWeight;
        return this;
    }
    public Boolean getIsAllWeight() {
        return this.isAllWeight;
    }

    public DataSolutionSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue setCarryOnAmount(Integer carryOnAmount) {
        this.carryOnAmount = carryOnAmount;
        return this;
    }
    public Integer getCarryOnAmount() {
        return this.carryOnAmount;
    }

    public DataSolutionSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue setCarryOnWeight(Integer carryOnWeight) {
        this.carryOnWeight = carryOnWeight;
        return this;
    }
    public Integer getCarryOnWeight() {
        return this.carryOnWeight;
    }

    public DataSolutionSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue setCarryOnWeightUnit(String carryOnWeightUnit) {
        this.carryOnWeightUnit = carryOnWeightUnit;
        return this;
    }
    public String getCarryOnWeightUnit() {
        return this.carryOnWeightUnit;
    }

    public DataSolutionSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue setIsAllCarryOnWeight(Boolean isAllCarryOnWeight) {
        this.isAllCarryOnWeight = isAllCarryOnWeight;
        return this;
    }
    public Boolean getIsAllCarryOnWeight() {
        return this.isAllCarryOnWeight;
    }

}
