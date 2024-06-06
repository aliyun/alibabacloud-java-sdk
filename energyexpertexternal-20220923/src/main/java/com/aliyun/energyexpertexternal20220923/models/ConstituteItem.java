// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class ConstituteItem extends TeaModel {
    @NameInMap("carbonEmissionData")
    public Double carbonEmissionData;

    @NameInMap("dataUnit")
    public String dataUnit;

    @NameInMap("emissionSource")
    public String emissionSource;

    @NameInMap("emissionSourceKey")
    public String emissionSourceKey;

    @NameInMap("enterpriseName")
    public String enterpriseName;

    @NameInMap("envGasEmissions")
    public java.util.List<ConstituteItemEnvGasEmissions> envGasEmissions;

    @NameInMap("name")
    public String name;

    @NameInMap("nameKey")
    public String nameKey;

    @NameInMap("ratio")
    public Double ratio;

    @NameInMap("rawData")
    public Double rawData;

    @NameInMap("subConstituteItems")
    public java.util.List<ConstituteItem> subConstituteItems;

    public static ConstituteItem build(java.util.Map<String, ?> map) throws Exception {
        ConstituteItem self = new ConstituteItem();
        return TeaModel.build(map, self);
    }

    public ConstituteItem setCarbonEmissionData(Double carbonEmissionData) {
        this.carbonEmissionData = carbonEmissionData;
        return this;
    }
    public Double getCarbonEmissionData() {
        return this.carbonEmissionData;
    }

    public ConstituteItem setDataUnit(String dataUnit) {
        this.dataUnit = dataUnit;
        return this;
    }
    public String getDataUnit() {
        return this.dataUnit;
    }

    public ConstituteItem setEmissionSource(String emissionSource) {
        this.emissionSource = emissionSource;
        return this;
    }
    public String getEmissionSource() {
        return this.emissionSource;
    }

    public ConstituteItem setEmissionSourceKey(String emissionSourceKey) {
        this.emissionSourceKey = emissionSourceKey;
        return this;
    }
    public String getEmissionSourceKey() {
        return this.emissionSourceKey;
    }

    public ConstituteItem setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
        return this;
    }
    public String getEnterpriseName() {
        return this.enterpriseName;
    }

    public ConstituteItem setEnvGasEmissions(java.util.List<ConstituteItemEnvGasEmissions> envGasEmissions) {
        this.envGasEmissions = envGasEmissions;
        return this;
    }
    public java.util.List<ConstituteItemEnvGasEmissions> getEnvGasEmissions() {
        return this.envGasEmissions;
    }

    public ConstituteItem setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ConstituteItem setNameKey(String nameKey) {
        this.nameKey = nameKey;
        return this;
    }
    public String getNameKey() {
        return this.nameKey;
    }

    public ConstituteItem setRatio(Double ratio) {
        this.ratio = ratio;
        return this;
    }
    public Double getRatio() {
        return this.ratio;
    }

    public ConstituteItem setRawData(Double rawData) {
        this.rawData = rawData;
        return this;
    }
    public Double getRawData() {
        return this.rawData;
    }

    public ConstituteItem setSubConstituteItems(java.util.List<ConstituteItem> subConstituteItems) {
        this.subConstituteItems = subConstituteItems;
        return this;
    }
    public java.util.List<ConstituteItem> getSubConstituteItems() {
        return this.subConstituteItems;
    }

    public static class ConstituteItemEnvGasEmissions extends TeaModel {
        @NameInMap("carbonEmissionData")
        public Double carbonEmissionData;

        @NameInMap("gasEmissionData")
        public Double gasEmissionData;

        @NameInMap("name")
        public String name;

        @NameInMap("type")
        public String type;

        public static ConstituteItemEnvGasEmissions build(java.util.Map<String, ?> map) throws Exception {
            ConstituteItemEnvGasEmissions self = new ConstituteItemEnvGasEmissions();
            return TeaModel.build(map, self);
        }

        public ConstituteItemEnvGasEmissions setCarbonEmissionData(Double carbonEmissionData) {
            this.carbonEmissionData = carbonEmissionData;
            return this;
        }
        public Double getCarbonEmissionData() {
            return this.carbonEmissionData;
        }

        public ConstituteItemEnvGasEmissions setGasEmissionData(Double gasEmissionData) {
            this.gasEmissionData = gasEmissionData;
            return this;
        }
        public Double getGasEmissionData() {
            return this.gasEmissionData;
        }

        public ConstituteItemEnvGasEmissions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ConstituteItemEnvGasEmissions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
