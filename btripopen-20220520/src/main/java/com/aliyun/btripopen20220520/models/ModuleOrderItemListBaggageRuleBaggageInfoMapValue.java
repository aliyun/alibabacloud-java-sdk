// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ModuleOrderItemListBaggageRuleBaggageInfoMapValue extends TeaModel {
    @NameInMap("carry_freepc")
    public Integer carryFreepc;

    @NameInMap("carry_bag_weight")
    public Integer carryBagWeight;

    @NameInMap("carry_bag_size")
    public String carryBagSize;

    @NameInMap("is_all_carry_bag_weight")
    public Boolean isAllCarryBagWeight;

    @NameInMap("airline")
    public String airline;

    @NameInMap("start_airport")
    public String startAirport;

    @NameInMap("end_airport")
    public String endAirport;

    @NameInMap("start_city_code")
    public String startCityCode;

    @NameInMap("end_city_code")
    public String endCityCode;

    @NameInMap("free_pcs")
    public Long freePcs;

    @NameInMap("baggage_weight")
    public Long baggageWeight;

    @NameInMap("baggage_unit")
    public String baggageUnit;

    @NameInMap("baggage_size")
    public String baggageSize;

    @NameInMap("all_weight")
    public Boolean allWeight;

    @NameInMap("total_pcs")
    public Long totalPcs;

    @NameInMap("total_weight")
    public Long totalWeight;

    public static ModuleOrderItemListBaggageRuleBaggageInfoMapValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleOrderItemListBaggageRuleBaggageInfoMapValue self = new ModuleOrderItemListBaggageRuleBaggageInfoMapValue();
        return TeaModel.build(map, self);
    }

    public ModuleOrderItemListBaggageRuleBaggageInfoMapValue setCarryFreepc(Integer carryFreepc) {
        this.carryFreepc = carryFreepc;
        return this;
    }
    public Integer getCarryFreepc() {
        return this.carryFreepc;
    }

    public ModuleOrderItemListBaggageRuleBaggageInfoMapValue setCarryBagWeight(Integer carryBagWeight) {
        this.carryBagWeight = carryBagWeight;
        return this;
    }
    public Integer getCarryBagWeight() {
        return this.carryBagWeight;
    }

    public ModuleOrderItemListBaggageRuleBaggageInfoMapValue setCarryBagSize(String carryBagSize) {
        this.carryBagSize = carryBagSize;
        return this;
    }
    public String getCarryBagSize() {
        return this.carryBagSize;
    }

    public ModuleOrderItemListBaggageRuleBaggageInfoMapValue setIsAllCarryBagWeight(Boolean isAllCarryBagWeight) {
        this.isAllCarryBagWeight = isAllCarryBagWeight;
        return this;
    }
    public Boolean getIsAllCarryBagWeight() {
        return this.isAllCarryBagWeight;
    }

    public ModuleOrderItemListBaggageRuleBaggageInfoMapValue setAirline(String airline) {
        this.airline = airline;
        return this;
    }
    public String getAirline() {
        return this.airline;
    }

    public ModuleOrderItemListBaggageRuleBaggageInfoMapValue setStartAirport(String startAirport) {
        this.startAirport = startAirport;
        return this;
    }
    public String getStartAirport() {
        return this.startAirport;
    }

    public ModuleOrderItemListBaggageRuleBaggageInfoMapValue setEndAirport(String endAirport) {
        this.endAirport = endAirport;
        return this;
    }
    public String getEndAirport() {
        return this.endAirport;
    }

    public ModuleOrderItemListBaggageRuleBaggageInfoMapValue setStartCityCode(String startCityCode) {
        this.startCityCode = startCityCode;
        return this;
    }
    public String getStartCityCode() {
        return this.startCityCode;
    }

    public ModuleOrderItemListBaggageRuleBaggageInfoMapValue setEndCityCode(String endCityCode) {
        this.endCityCode = endCityCode;
        return this;
    }
    public String getEndCityCode() {
        return this.endCityCode;
    }

    public ModuleOrderItemListBaggageRuleBaggageInfoMapValue setFreePcs(Long freePcs) {
        this.freePcs = freePcs;
        return this;
    }
    public Long getFreePcs() {
        return this.freePcs;
    }

    public ModuleOrderItemListBaggageRuleBaggageInfoMapValue setBaggageWeight(Long baggageWeight) {
        this.baggageWeight = baggageWeight;
        return this;
    }
    public Long getBaggageWeight() {
        return this.baggageWeight;
    }

    public ModuleOrderItemListBaggageRuleBaggageInfoMapValue setBaggageUnit(String baggageUnit) {
        this.baggageUnit = baggageUnit;
        return this;
    }
    public String getBaggageUnit() {
        return this.baggageUnit;
    }

    public ModuleOrderItemListBaggageRuleBaggageInfoMapValue setBaggageSize(String baggageSize) {
        this.baggageSize = baggageSize;
        return this;
    }
    public String getBaggageSize() {
        return this.baggageSize;
    }

    public ModuleOrderItemListBaggageRuleBaggageInfoMapValue setAllWeight(Boolean allWeight) {
        this.allWeight = allWeight;
        return this;
    }
    public Boolean getAllWeight() {
        return this.allWeight;
    }

    public ModuleOrderItemListBaggageRuleBaggageInfoMapValue setTotalPcs(Long totalPcs) {
        this.totalPcs = totalPcs;
        return this;
    }
    public Long getTotalPcs() {
        return this.totalPcs;
    }

    public ModuleOrderItemListBaggageRuleBaggageInfoMapValue setTotalWeight(Long totalWeight) {
        this.totalWeight = totalWeight;
        return this;
    }
    public Long getTotalWeight() {
        return this.totalWeight;
    }

}
