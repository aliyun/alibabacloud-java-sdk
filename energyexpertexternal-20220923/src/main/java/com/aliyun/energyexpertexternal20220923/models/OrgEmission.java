// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class OrgEmission extends TeaModel {
    @NameInMap("carbonEmissionData")
    public Double carbonEmissionData;

    @NameInMap("moduleEmissionList")
    public java.util.List<OrgEmissionModuleEmissionList> moduleEmissionList;

    @NameInMap("name")
    public String name;

    @NameInMap("nameKey")
    public String nameKey;

    @NameInMap("ratio")
    public Double ratio;

    @NameInMap("subEmissionItems")
    public java.util.List<OrgEmission> subEmissionItems;

    @NameInMap("weightingCarbonEmissionData")
    public Double weightingCarbonEmissionData;

    @NameInMap("weightingProportion")
    public Double weightingProportion;

    @NameInMap("weightingRatio")
    public Double weightingRatio;

    public static OrgEmission build(java.util.Map<String, ?> map) throws Exception {
        OrgEmission self = new OrgEmission();
        return TeaModel.build(map, self);
    }

    public OrgEmission setCarbonEmissionData(Double carbonEmissionData) {
        this.carbonEmissionData = carbonEmissionData;
        return this;
    }
    public Double getCarbonEmissionData() {
        return this.carbonEmissionData;
    }

    public OrgEmission setModuleEmissionList(java.util.List<OrgEmissionModuleEmissionList> moduleEmissionList) {
        this.moduleEmissionList = moduleEmissionList;
        return this;
    }
    public java.util.List<OrgEmissionModuleEmissionList> getModuleEmissionList() {
        return this.moduleEmissionList;
    }

    public OrgEmission setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OrgEmission setNameKey(String nameKey) {
        this.nameKey = nameKey;
        return this;
    }
    public String getNameKey() {
        return this.nameKey;
    }

    public OrgEmission setRatio(Double ratio) {
        this.ratio = ratio;
        return this;
    }
    public Double getRatio() {
        return this.ratio;
    }

    public OrgEmission setSubEmissionItems(java.util.List<OrgEmission> subEmissionItems) {
        this.subEmissionItems = subEmissionItems;
        return this;
    }
    public java.util.List<OrgEmission> getSubEmissionItems() {
        return this.subEmissionItems;
    }

    public OrgEmission setWeightingCarbonEmissionData(Double weightingCarbonEmissionData) {
        this.weightingCarbonEmissionData = weightingCarbonEmissionData;
        return this;
    }
    public Double getWeightingCarbonEmissionData() {
        return this.weightingCarbonEmissionData;
    }

    public OrgEmission setWeightingProportion(Double weightingProportion) {
        this.weightingProportion = weightingProportion;
        return this;
    }
    public Double getWeightingProportion() {
        return this.weightingProportion;
    }

    public OrgEmission setWeightingRatio(Double weightingRatio) {
        this.weightingRatio = weightingRatio;
        return this;
    }
    public Double getWeightingRatio() {
        return this.weightingRatio;
    }

    public static class OrgEmissionModuleEmissionList extends TeaModel {
        @NameInMap("carbonEmissionData")
        public Double carbonEmissionData;

        @NameInMap("name")
        public String name;

        @NameInMap("nameKey")
        public String nameKey;

        @NameInMap("ratio")
        public Double ratio;

        public static OrgEmissionModuleEmissionList build(java.util.Map<String, ?> map) throws Exception {
            OrgEmissionModuleEmissionList self = new OrgEmissionModuleEmissionList();
            return TeaModel.build(map, self);
        }

        public OrgEmissionModuleEmissionList setCarbonEmissionData(Double carbonEmissionData) {
            this.carbonEmissionData = carbonEmissionData;
            return this;
        }
        public Double getCarbonEmissionData() {
            return this.carbonEmissionData;
        }

        public OrgEmissionModuleEmissionList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public OrgEmissionModuleEmissionList setNameKey(String nameKey) {
            this.nameKey = nameKey;
            return this;
        }
        public String getNameKey() {
            return this.nameKey;
        }

        public OrgEmissionModuleEmissionList setRatio(Double ratio) {
            this.ratio = ratio;
            return this;
        }
        public Double getRatio() {
            return this.ratio;
        }

    }

}
