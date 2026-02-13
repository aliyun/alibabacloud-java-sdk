// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class OrgEmission extends TeaModel {
    /**
     * <p>Carbon Equivalent</p>
     * 
     * <strong>example:</strong>
     * <p>1.2</p>
     */
    @NameInMap("carbonEmissionData")
    public Double carbonEmissionData;

    /**
     * <p>Sub-module carbon emission data</p>
     */
    @NameInMap("moduleEmissionList")
    public java.util.List<OrgEmissionModuleEmissionList> moduleEmissionList;

    /**
     * <p>The name of the organization.</p>
     * 
     * <strong>example:</strong>
     * <p>EnterpriseZ</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Enterprise type</p>
     * 
     * <strong>example:</strong>
     * <p>Z-20240115-4</p>
     */
    @NameInMap("nameKey")
    public String nameKey;

    /**
     * <p>Proportion of carbon emissions</p>
     * 
     * <strong>example:</strong>
     * <p>0.2</p>
     */
    @NameInMap("ratio")
    public Double ratio;

    /**
     * <p>Sub-level data, that is, site data under the organization</p>
     */
    @NameInMap("subEmissionItems")
    public java.util.List<OrgEmission> subEmissionItems;

    /**
     * <p>Calculate carbon emissions by share ratio</p>
     * 
     * <strong>example:</strong>
     * <p>2.3</p>
     */
    @NameInMap("weightingCarbonEmissionData")
    public Double weightingCarbonEmissionData;

    /**
     * <p>Weight ratio</p>
     * 
     * <strong>example:</strong>
     * <p>0.3</p>
     */
    @NameInMap("weightingProportion")
    public Double weightingProportion;

    /**
     * <p>Share ratio Carbon emissions YoY</p>
     * 
     * <strong>example:</strong>
     * <p>0.4</p>
     */
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
        /**
         * <p>Carbon emissions</p>
         * 
         * <strong>example:</strong>
         * <p>1.2</p>
         */
        @NameInMap("carbonEmissionData")
        public Double carbonEmissionData;

        /**
         * <p>module name</p>
         * 
         * <strong>example:</strong>
         * <p>Scope 1: Direct GHG emissions</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Module key</p>
         * 
         * <strong>example:</strong>
         * <p>carbonInventory.check.scope_1_direct_ghg_emissions</p>
         */
        @NameInMap("nameKey")
        public String nameKey;

        /**
         * <p>Proportion of carbon emissions</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
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
