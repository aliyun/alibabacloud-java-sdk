// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetElecConstituteResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public GetElecConstituteResponseBodyData data;

    /**
     * <p>Id of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetElecConstituteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetElecConstituteResponseBody self = new GetElecConstituteResponseBody();
        return TeaModel.build(map, self);
    }

    public GetElecConstituteResponseBody setData(GetElecConstituteResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetElecConstituteResponseBodyData getData() {
        return this.data;
    }

    public GetElecConstituteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetElecConstituteResponseBodyDataLight extends TeaModel {
        /**
         * <p>Carbon emission.</p>
         */
        @NameInMap("carbonEmissionData")
        public Double carbonEmissionData;

        /**
         * <p>The unit.</p>
         */
        @NameInMap("dataUnit")
        public String dataUnit;

        /**
         * <p>The name.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The unique identifier of name.</p>
         */
        @NameInMap("nameKey")
        public String nameKey;

        /**
         * <p>Proportion of electricity consumption to all electricity consumption in the month: example value: 0.5 (i. e., 50%)</p>
         */
        @NameInMap("ratio")
        public Double ratio;

        /**
         * <p>Electricity consumption</p>
         */
        @NameInMap("rawData")
        public Double rawData;

        public static GetElecConstituteResponseBodyDataLight build(java.util.Map<String, ?> map) throws Exception {
            GetElecConstituteResponseBodyDataLight self = new GetElecConstituteResponseBodyDataLight();
            return TeaModel.build(map, self);
        }

        public GetElecConstituteResponseBodyDataLight setCarbonEmissionData(Double carbonEmissionData) {
            this.carbonEmissionData = carbonEmissionData;
            return this;
        }
        public Double getCarbonEmissionData() {
            return this.carbonEmissionData;
        }

        public GetElecConstituteResponseBodyDataLight setDataUnit(String dataUnit) {
            this.dataUnit = dataUnit;
            return this;
        }
        public String getDataUnit() {
            return this.dataUnit;
        }

        public GetElecConstituteResponseBodyDataLight setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetElecConstituteResponseBodyDataLight setNameKey(String nameKey) {
            this.nameKey = nameKey;
            return this;
        }
        public String getNameKey() {
            return this.nameKey;
        }

        public GetElecConstituteResponseBodyDataLight setRatio(Double ratio) {
            this.ratio = ratio;
            return this;
        }
        public Double getRatio() {
            return this.ratio;
        }

        public GetElecConstituteResponseBodyDataLight setRawData(Double rawData) {
            this.rawData = rawData;
            return this;
        }
        public Double getRawData() {
            return this.rawData;
        }

    }

    public static class GetElecConstituteResponseBodyDataNuclear extends TeaModel {
        /**
         * <p>Carbon emission.</p>
         */
        @NameInMap("carbonEmissionData")
        public Double carbonEmissionData;

        /**
         * <p>The unit.</p>
         */
        @NameInMap("dataUnit")
        public String dataUnit;

        /**
         * <p>The name.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The unique identifier of name.</p>
         */
        @NameInMap("nameKey")
        public String nameKey;

        /**
         * <p>Proportion of electricity consumption to all electricity consumption in the month: example value: 0.5 (i. e., 50%)</p>
         */
        @NameInMap("ratio")
        public Double ratio;

        /**
         * <p>Electricity consumption</p>
         */
        @NameInMap("rawData")
        public Double rawData;

        public static GetElecConstituteResponseBodyDataNuclear build(java.util.Map<String, ?> map) throws Exception {
            GetElecConstituteResponseBodyDataNuclear self = new GetElecConstituteResponseBodyDataNuclear();
            return TeaModel.build(map, self);
        }

        public GetElecConstituteResponseBodyDataNuclear setCarbonEmissionData(Double carbonEmissionData) {
            this.carbonEmissionData = carbonEmissionData;
            return this;
        }
        public Double getCarbonEmissionData() {
            return this.carbonEmissionData;
        }

        public GetElecConstituteResponseBodyDataNuclear setDataUnit(String dataUnit) {
            this.dataUnit = dataUnit;
            return this;
        }
        public String getDataUnit() {
            return this.dataUnit;
        }

        public GetElecConstituteResponseBodyDataNuclear setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetElecConstituteResponseBodyDataNuclear setNameKey(String nameKey) {
            this.nameKey = nameKey;
            return this;
        }
        public String getNameKey() {
            return this.nameKey;
        }

        public GetElecConstituteResponseBodyDataNuclear setRatio(Double ratio) {
            this.ratio = ratio;
            return this;
        }
        public Double getRatio() {
            return this.ratio;
        }

        public GetElecConstituteResponseBodyDataNuclear setRawData(Double rawData) {
            this.rawData = rawData;
            return this;
        }
        public Double getRawData() {
            return this.rawData;
        }

    }

    public static class GetElecConstituteResponseBodyDataRenewing extends TeaModel {
        /**
         * <p>Carbon emission.</p>
         */
        @NameInMap("carbonEmissionData")
        public Double carbonEmissionData;

        /**
         * <p>The unit.</p>
         */
        @NameInMap("dataUnit")
        public String dataUnit;

        /**
         * <p>The name.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The unique identifier of name.</p>
         */
        @NameInMap("nameKey")
        public String nameKey;

        /**
         * <p>Proportion of electricity consumption to all electricity consumption in the month: example value: 0.5 (i. e., 50%)</p>
         */
        @NameInMap("ratio")
        public Double ratio;

        /**
         * <p>Electricity consumption</p>
         */
        @NameInMap("rawData")
        public Double rawData;

        public static GetElecConstituteResponseBodyDataRenewing build(java.util.Map<String, ?> map) throws Exception {
            GetElecConstituteResponseBodyDataRenewing self = new GetElecConstituteResponseBodyDataRenewing();
            return TeaModel.build(map, self);
        }

        public GetElecConstituteResponseBodyDataRenewing setCarbonEmissionData(Double carbonEmissionData) {
            this.carbonEmissionData = carbonEmissionData;
            return this;
        }
        public Double getCarbonEmissionData() {
            return this.carbonEmissionData;
        }

        public GetElecConstituteResponseBodyDataRenewing setDataUnit(String dataUnit) {
            this.dataUnit = dataUnit;
            return this;
        }
        public String getDataUnit() {
            return this.dataUnit;
        }

        public GetElecConstituteResponseBodyDataRenewing setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetElecConstituteResponseBodyDataRenewing setNameKey(String nameKey) {
            this.nameKey = nameKey;
            return this;
        }
        public String getNameKey() {
            return this.nameKey;
        }

        public GetElecConstituteResponseBodyDataRenewing setRatio(Double ratio) {
            this.ratio = ratio;
            return this;
        }
        public Double getRatio() {
            return this.ratio;
        }

        public GetElecConstituteResponseBodyDataRenewing setRawData(Double rawData) {
            this.rawData = rawData;
            return this;
        }
        public Double getRawData() {
            return this.rawData;
        }

    }

    public static class GetElecConstituteResponseBodyDataUrban extends TeaModel {
        /**
         * <p>Carbon emission.</p>
         */
        @NameInMap("carbonEmissionData")
        public Double carbonEmissionData;

        /**
         * <p>The unit.</p>
         */
        @NameInMap("dataUnit")
        public String dataUnit;

        /**
         * <p>The name.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The unique identifier of name.</p>
         */
        @NameInMap("nameKey")
        public String nameKey;

        /**
         * <p>Proportion of electricity consumption to all electricity consumption in the month: example value: 0.5 (i. e., 50%)</p>
         */
        @NameInMap("ratio")
        public Double ratio;

        /**
         * <p>Electricity consumption</p>
         */
        @NameInMap("rawData")
        public Double rawData;

        public static GetElecConstituteResponseBodyDataUrban build(java.util.Map<String, ?> map) throws Exception {
            GetElecConstituteResponseBodyDataUrban self = new GetElecConstituteResponseBodyDataUrban();
            return TeaModel.build(map, self);
        }

        public GetElecConstituteResponseBodyDataUrban setCarbonEmissionData(Double carbonEmissionData) {
            this.carbonEmissionData = carbonEmissionData;
            return this;
        }
        public Double getCarbonEmissionData() {
            return this.carbonEmissionData;
        }

        public GetElecConstituteResponseBodyDataUrban setDataUnit(String dataUnit) {
            this.dataUnit = dataUnit;
            return this;
        }
        public String getDataUnit() {
            return this.dataUnit;
        }

        public GetElecConstituteResponseBodyDataUrban setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetElecConstituteResponseBodyDataUrban setNameKey(String nameKey) {
            this.nameKey = nameKey;
            return this;
        }
        public String getNameKey() {
            return this.nameKey;
        }

        public GetElecConstituteResponseBodyDataUrban setRatio(Double ratio) {
            this.ratio = ratio;
            return this;
        }
        public Double getRatio() {
            return this.ratio;
        }

        public GetElecConstituteResponseBodyDataUrban setRawData(Double rawData) {
            this.rawData = rawData;
            return this;
        }
        public Double getRawData() {
            return this.rawData;
        }

    }

    public static class GetElecConstituteResponseBodyDataWater extends TeaModel {
        /**
         * <p>Carbon emission.</p>
         */
        @NameInMap("carbonEmissionData")
        public Double carbonEmissionData;

        /**
         * <p>The unit.</p>
         */
        @NameInMap("dataUnit")
        public String dataUnit;

        /**
         * <p>The name.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The unique identifier of name.</p>
         */
        @NameInMap("nameKey")
        public String nameKey;

        /**
         * <p>Proportion of electricity consumption to all electricity consumption in the month: example value: 0.5 (i. e., 50%)</p>
         */
        @NameInMap("ratio")
        public Double ratio;

        /**
         * <p>Electricity consumption</p>
         */
        @NameInMap("rawData")
        public Double rawData;

        public static GetElecConstituteResponseBodyDataWater build(java.util.Map<String, ?> map) throws Exception {
            GetElecConstituteResponseBodyDataWater self = new GetElecConstituteResponseBodyDataWater();
            return TeaModel.build(map, self);
        }

        public GetElecConstituteResponseBodyDataWater setCarbonEmissionData(Double carbonEmissionData) {
            this.carbonEmissionData = carbonEmissionData;
            return this;
        }
        public Double getCarbonEmissionData() {
            return this.carbonEmissionData;
        }

        public GetElecConstituteResponseBodyDataWater setDataUnit(String dataUnit) {
            this.dataUnit = dataUnit;
            return this;
        }
        public String getDataUnit() {
            return this.dataUnit;
        }

        public GetElecConstituteResponseBodyDataWater setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetElecConstituteResponseBodyDataWater setNameKey(String nameKey) {
            this.nameKey = nameKey;
            return this;
        }
        public String getNameKey() {
            return this.nameKey;
        }

        public GetElecConstituteResponseBodyDataWater setRatio(Double ratio) {
            this.ratio = ratio;
            return this;
        }
        public Double getRatio() {
            return this.ratio;
        }

        public GetElecConstituteResponseBodyDataWater setRawData(Double rawData) {
            this.rawData = rawData;
            return this;
        }
        public Double getRawData() {
            return this.rawData;
        }

    }

    public static class GetElecConstituteResponseBodyDataWind extends TeaModel {
        /**
         * <p>Carbon emission.</p>
         */
        @NameInMap("carbonEmissionData")
        public Double carbonEmissionData;

        /**
         * <p>The unit.</p>
         */
        @NameInMap("dataUnit")
        public String dataUnit;

        /**
         * <p>The name.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The unique identifier of name.</p>
         */
        @NameInMap("nameKey")
        public String nameKey;

        /**
         * <p>Proportion of electricity consumption to all electricity consumption in the month: example value: 0.5 (i. e., 50%)</p>
         */
        @NameInMap("ratio")
        public Double ratio;

        /**
         * <p>Electricity consumption</p>
         */
        @NameInMap("rawData")
        public Double rawData;

        public static GetElecConstituteResponseBodyDataWind build(java.util.Map<String, ?> map) throws Exception {
            GetElecConstituteResponseBodyDataWind self = new GetElecConstituteResponseBodyDataWind();
            return TeaModel.build(map, self);
        }

        public GetElecConstituteResponseBodyDataWind setCarbonEmissionData(Double carbonEmissionData) {
            this.carbonEmissionData = carbonEmissionData;
            return this;
        }
        public Double getCarbonEmissionData() {
            return this.carbonEmissionData;
        }

        public GetElecConstituteResponseBodyDataWind setDataUnit(String dataUnit) {
            this.dataUnit = dataUnit;
            return this;
        }
        public String getDataUnit() {
            return this.dataUnit;
        }

        public GetElecConstituteResponseBodyDataWind setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetElecConstituteResponseBodyDataWind setNameKey(String nameKey) {
            this.nameKey = nameKey;
            return this;
        }
        public String getNameKey() {
            return this.nameKey;
        }

        public GetElecConstituteResponseBodyDataWind setRatio(Double ratio) {
            this.ratio = ratio;
            return this;
        }
        public Double getRatio() {
            return this.ratio;
        }

        public GetElecConstituteResponseBodyDataWind setRawData(Double rawData) {
            this.rawData = rawData;
            return this;
        }
        public Double getRawData() {
            return this.rawData;
        }

    }

    public static class GetElecConstituteResponseBodyDataZero extends TeaModel {
        /**
         * <p>Carbon emission.</p>
         */
        @NameInMap("carbonEmissionData")
        public Double carbonEmissionData;

        /**
         * <p>The unit.</p>
         */
        @NameInMap("dataUnit")
        public String dataUnit;

        /**
         * <p>The name.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The unique identifier of name.</p>
         */
        @NameInMap("nameKey")
        public String nameKey;

        /**
         * <p>Proportion of electricity consumption to all electricity consumption in the month: example value: 0.5 (i. e., 50%)</p>
         */
        @NameInMap("ratio")
        public Double ratio;

        /**
         * <p>Electricity consumption</p>
         */
        @NameInMap("rawData")
        public Double rawData;

        public static GetElecConstituteResponseBodyDataZero build(java.util.Map<String, ?> map) throws Exception {
            GetElecConstituteResponseBodyDataZero self = new GetElecConstituteResponseBodyDataZero();
            return TeaModel.build(map, self);
        }

        public GetElecConstituteResponseBodyDataZero setCarbonEmissionData(Double carbonEmissionData) {
            this.carbonEmissionData = carbonEmissionData;
            return this;
        }
        public Double getCarbonEmissionData() {
            return this.carbonEmissionData;
        }

        public GetElecConstituteResponseBodyDataZero setDataUnit(String dataUnit) {
            this.dataUnit = dataUnit;
            return this;
        }
        public String getDataUnit() {
            return this.dataUnit;
        }

        public GetElecConstituteResponseBodyDataZero setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetElecConstituteResponseBodyDataZero setNameKey(String nameKey) {
            this.nameKey = nameKey;
            return this;
        }
        public String getNameKey() {
            return this.nameKey;
        }

        public GetElecConstituteResponseBodyDataZero setRatio(Double ratio) {
            this.ratio = ratio;
            return this;
        }
        public Double getRatio() {
            return this.ratio;
        }

        public GetElecConstituteResponseBodyDataZero setRawData(Double rawData) {
            this.rawData = rawData;
            return this;
        }
        public Double getRawData() {
            return this.rawData;
        }

    }

    public static class GetElecConstituteResponseBodyData extends TeaModel {
        /**
         * <p>Photoelectric power consumption and carbon emission data of each enterprise.</p>
         */
        @NameInMap("light")
        public GetElecConstituteResponseBodyDataLight light;

        /**
         * <p>Data on nuclear power consumption and carbon emissions at each enterprise.</p>
         */
        @NameInMap("nuclear")
        public GetElecConstituteResponseBodyDataNuclear nuclear;

        /**
         * <p>Data on renewable electricity consumption and carbon emissions at each enterprise.</p>
         */
        @NameInMap("renewing")
        public GetElecConstituteResponseBodyDataRenewing renewing;

        /**
         * <p>Data on mains power electricity consumption and carbon emission of each enterprise.</p>
         */
        @NameInMap("urban")
        public GetElecConstituteResponseBodyDataUrban urban;

        /**
         * <p>Hydropower consumption and carbon emission data of each enterprise.</p>
         */
        @NameInMap("water")
        public GetElecConstituteResponseBodyDataWater water;

        /**
         * <p>Wind power consumption and carbon emission data of each enterprise.</p>
         */
        @NameInMap("wind")
        public GetElecConstituteResponseBodyDataWind wind;

        /**
         * <p>Data of zero electricity consumption and carbon emission of each enterprise.</p>
         */
        @NameInMap("zero")
        public GetElecConstituteResponseBodyDataZero zero;

        public static GetElecConstituteResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetElecConstituteResponseBodyData self = new GetElecConstituteResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetElecConstituteResponseBodyData setLight(GetElecConstituteResponseBodyDataLight light) {
            this.light = light;
            return this;
        }
        public GetElecConstituteResponseBodyDataLight getLight() {
            return this.light;
        }

        public GetElecConstituteResponseBodyData setNuclear(GetElecConstituteResponseBodyDataNuclear nuclear) {
            this.nuclear = nuclear;
            return this;
        }
        public GetElecConstituteResponseBodyDataNuclear getNuclear() {
            return this.nuclear;
        }

        public GetElecConstituteResponseBodyData setRenewing(GetElecConstituteResponseBodyDataRenewing renewing) {
            this.renewing = renewing;
            return this;
        }
        public GetElecConstituteResponseBodyDataRenewing getRenewing() {
            return this.renewing;
        }

        public GetElecConstituteResponseBodyData setUrban(GetElecConstituteResponseBodyDataUrban urban) {
            this.urban = urban;
            return this;
        }
        public GetElecConstituteResponseBodyDataUrban getUrban() {
            return this.urban;
        }

        public GetElecConstituteResponseBodyData setWater(GetElecConstituteResponseBodyDataWater water) {
            this.water = water;
            return this;
        }
        public GetElecConstituteResponseBodyDataWater getWater() {
            return this.water;
        }

        public GetElecConstituteResponseBodyData setWind(GetElecConstituteResponseBodyDataWind wind) {
            this.wind = wind;
            return this;
        }
        public GetElecConstituteResponseBodyDataWind getWind() {
            return this.wind;
        }

        public GetElecConstituteResponseBodyData setZero(GetElecConstituteResponseBodyDataZero zero) {
            this.zero = zero;
            return this;
        }
        public GetElecConstituteResponseBodyDataZero getZero() {
            return this.zero;
        }

    }

}
