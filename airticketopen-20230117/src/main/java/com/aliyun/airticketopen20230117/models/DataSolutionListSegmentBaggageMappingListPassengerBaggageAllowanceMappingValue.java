// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue extends TeaModel {
    /**
     * <p>checked baggage quantity</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("baggage_amount")
    public Integer baggageAmount;

    /**
     * <p>checked baggage weight</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("baggage_weight")
    public Integer baggageWeight;

    /**
     * <p>checked baggage weight unit</p>
     * 
     * <strong>example:</strong>
     * <p>kg</p>
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
     * <p>2</p>
     */
    @NameInMap("carry_on_weight")
    public Integer carryOnWeight;

    /**
     * <p>carry-on baggage weight unit</p>
     * 
     * <strong>example:</strong>
     * <p>kg</p>
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

}
