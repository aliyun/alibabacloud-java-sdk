// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetElecTrendResponseBody extends TeaModel {
    /**
     * <p>The code returned for the request. A value of Success indicates that the request was successful. Other values indicate that the request failed. You can troubleshoot the error by viewing the error message returned.</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public GetElecTrendResponseBodyData data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetElecTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetElecTrendResponseBody self = new GetElecTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public GetElecTrendResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetElecTrendResponseBody setData(GetElecTrendResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetElecTrendResponseBodyData getData() {
        return this.data;
    }

    public GetElecTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetElecTrendResponseBodyDataLight extends TeaModel {
        /**
         * <p>Carbon emissions</p>
         */
        @NameInMap("carbonEmissionData")
        public Double carbonEmissionData;

        /**
         * <p>The unit.</p>
         */
        @NameInMap("dataUnit")
        public String dataUnit;

        /**
         * <p>Month</p>
         */
        @NameInMap("month")
        public Integer month;

        /**
         * <p>Power type name.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Power Type Code</p>
         */
        @NameInMap("nameKey")
        public String nameKey;

        /**
         * <p>Proportion of electricity consumption to all electricity consumption in the month: example value: 0.5 (i. e. 50%).</p>
         */
        @NameInMap("ratio")
        public Double ratio;

        /**
         * <p>Electricity consumption</p>
         */
        @NameInMap("rawData")
        public Double rawData;

        /**
         * <p>Year</p>
         */
        @NameInMap("year")
        public String year;

        public static GetElecTrendResponseBodyDataLight build(java.util.Map<String, ?> map) throws Exception {
            GetElecTrendResponseBodyDataLight self = new GetElecTrendResponseBodyDataLight();
            return TeaModel.build(map, self);
        }

        public GetElecTrendResponseBodyDataLight setCarbonEmissionData(Double carbonEmissionData) {
            this.carbonEmissionData = carbonEmissionData;
            return this;
        }
        public Double getCarbonEmissionData() {
            return this.carbonEmissionData;
        }

        public GetElecTrendResponseBodyDataLight setDataUnit(String dataUnit) {
            this.dataUnit = dataUnit;
            return this;
        }
        public String getDataUnit() {
            return this.dataUnit;
        }

        public GetElecTrendResponseBodyDataLight setMonth(Integer month) {
            this.month = month;
            return this;
        }
        public Integer getMonth() {
            return this.month;
        }

        public GetElecTrendResponseBodyDataLight setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetElecTrendResponseBodyDataLight setNameKey(String nameKey) {
            this.nameKey = nameKey;
            return this;
        }
        public String getNameKey() {
            return this.nameKey;
        }

        public GetElecTrendResponseBodyDataLight setRatio(Double ratio) {
            this.ratio = ratio;
            return this;
        }
        public Double getRatio() {
            return this.ratio;
        }

        public GetElecTrendResponseBodyDataLight setRawData(Double rawData) {
            this.rawData = rawData;
            return this;
        }
        public Double getRawData() {
            return this.rawData;
        }

        public GetElecTrendResponseBodyDataLight setYear(String year) {
            this.year = year;
            return this;
        }
        public String getYear() {
            return this.year;
        }

    }

    public static class GetElecTrendResponseBodyDataNuclear extends TeaModel {
        /**
         * <p>Carbon emissions</p>
         */
        @NameInMap("carbonEmissionData")
        public Double carbonEmissionData;

        /**
         * <p>The price unit.</p>
         */
        @NameInMap("dataUnit")
        public String dataUnit;

        /**
         * <p>Month</p>
         */
        @NameInMap("month")
        public Integer month;

        /**
         * <p>Power Type Name</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Power Type Code</p>
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

        /**
         * <p>Year</p>
         */
        @NameInMap("year")
        public String year;

        public static GetElecTrendResponseBodyDataNuclear build(java.util.Map<String, ?> map) throws Exception {
            GetElecTrendResponseBodyDataNuclear self = new GetElecTrendResponseBodyDataNuclear();
            return TeaModel.build(map, self);
        }

        public GetElecTrendResponseBodyDataNuclear setCarbonEmissionData(Double carbonEmissionData) {
            this.carbonEmissionData = carbonEmissionData;
            return this;
        }
        public Double getCarbonEmissionData() {
            return this.carbonEmissionData;
        }

        public GetElecTrendResponseBodyDataNuclear setDataUnit(String dataUnit) {
            this.dataUnit = dataUnit;
            return this;
        }
        public String getDataUnit() {
            return this.dataUnit;
        }

        public GetElecTrendResponseBodyDataNuclear setMonth(Integer month) {
            this.month = month;
            return this;
        }
        public Integer getMonth() {
            return this.month;
        }

        public GetElecTrendResponseBodyDataNuclear setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetElecTrendResponseBodyDataNuclear setNameKey(String nameKey) {
            this.nameKey = nameKey;
            return this;
        }
        public String getNameKey() {
            return this.nameKey;
        }

        public GetElecTrendResponseBodyDataNuclear setRatio(Double ratio) {
            this.ratio = ratio;
            return this;
        }
        public Double getRatio() {
            return this.ratio;
        }

        public GetElecTrendResponseBodyDataNuclear setRawData(Double rawData) {
            this.rawData = rawData;
            return this;
        }
        public Double getRawData() {
            return this.rawData;
        }

        public GetElecTrendResponseBodyDataNuclear setYear(String year) {
            this.year = year;
            return this;
        }
        public String getYear() {
            return this.year;
        }

    }

    public static class GetElecTrendResponseBodyDataRenewing extends TeaModel {
        /**
         * <p>Carbon emissions</p>
         */
        @NameInMap("carbonEmissionData")
        public Double carbonEmissionData;

        /**
         * <p>The price unit.</p>
         */
        @NameInMap("dataUnit")
        public String dataUnit;

        /**
         * <p>Month</p>
         */
        @NameInMap("month")
        public Integer month;

        /**
         * <p>Power Type Name</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Power Type Code</p>
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

        /**
         * <p>Year</p>
         */
        @NameInMap("year")
        public String year;

        public static GetElecTrendResponseBodyDataRenewing build(java.util.Map<String, ?> map) throws Exception {
            GetElecTrendResponseBodyDataRenewing self = new GetElecTrendResponseBodyDataRenewing();
            return TeaModel.build(map, self);
        }

        public GetElecTrendResponseBodyDataRenewing setCarbonEmissionData(Double carbonEmissionData) {
            this.carbonEmissionData = carbonEmissionData;
            return this;
        }
        public Double getCarbonEmissionData() {
            return this.carbonEmissionData;
        }

        public GetElecTrendResponseBodyDataRenewing setDataUnit(String dataUnit) {
            this.dataUnit = dataUnit;
            return this;
        }
        public String getDataUnit() {
            return this.dataUnit;
        }

        public GetElecTrendResponseBodyDataRenewing setMonth(Integer month) {
            this.month = month;
            return this;
        }
        public Integer getMonth() {
            return this.month;
        }

        public GetElecTrendResponseBodyDataRenewing setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetElecTrendResponseBodyDataRenewing setNameKey(String nameKey) {
            this.nameKey = nameKey;
            return this;
        }
        public String getNameKey() {
            return this.nameKey;
        }

        public GetElecTrendResponseBodyDataRenewing setRatio(Double ratio) {
            this.ratio = ratio;
            return this;
        }
        public Double getRatio() {
            return this.ratio;
        }

        public GetElecTrendResponseBodyDataRenewing setRawData(Double rawData) {
            this.rawData = rawData;
            return this;
        }
        public Double getRawData() {
            return this.rawData;
        }

        public GetElecTrendResponseBodyDataRenewing setYear(String year) {
            this.year = year;
            return this;
        }
        public String getYear() {
            return this.year;
        }

    }

    public static class GetElecTrendResponseBodyDataUrban extends TeaModel {
        /**
         * <p>Carbon emissions</p>
         */
        @NameInMap("carbonEmissionData")
        public Double carbonEmissionData;

        /**
         * <p>The price unit.</p>
         */
        @NameInMap("dataUnit")
        public String dataUnit;

        /**
         * <p>Month</p>
         */
        @NameInMap("month")
        public Integer month;

        /**
         * <p>Power Type Name</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Power Type Code</p>
         */
        @NameInMap("nameKey")
        public String nameKey;

        /**
         * <p>Proportion of electricity consumption to all electricity consumption in the month: example value: 0.5 (i. e. 50%).</p>
         */
        @NameInMap("ratio")
        public Double ratio;

        /**
         * <p>Electricity consumption</p>
         */
        @NameInMap("rawData")
        public Double rawData;

        /**
         * <p>Year</p>
         */
        @NameInMap("year")
        public String year;

        public static GetElecTrendResponseBodyDataUrban build(java.util.Map<String, ?> map) throws Exception {
            GetElecTrendResponseBodyDataUrban self = new GetElecTrendResponseBodyDataUrban();
            return TeaModel.build(map, self);
        }

        public GetElecTrendResponseBodyDataUrban setCarbonEmissionData(Double carbonEmissionData) {
            this.carbonEmissionData = carbonEmissionData;
            return this;
        }
        public Double getCarbonEmissionData() {
            return this.carbonEmissionData;
        }

        public GetElecTrendResponseBodyDataUrban setDataUnit(String dataUnit) {
            this.dataUnit = dataUnit;
            return this;
        }
        public String getDataUnit() {
            return this.dataUnit;
        }

        public GetElecTrendResponseBodyDataUrban setMonth(Integer month) {
            this.month = month;
            return this;
        }
        public Integer getMonth() {
            return this.month;
        }

        public GetElecTrendResponseBodyDataUrban setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetElecTrendResponseBodyDataUrban setNameKey(String nameKey) {
            this.nameKey = nameKey;
            return this;
        }
        public String getNameKey() {
            return this.nameKey;
        }

        public GetElecTrendResponseBodyDataUrban setRatio(Double ratio) {
            this.ratio = ratio;
            return this;
        }
        public Double getRatio() {
            return this.ratio;
        }

        public GetElecTrendResponseBodyDataUrban setRawData(Double rawData) {
            this.rawData = rawData;
            return this;
        }
        public Double getRawData() {
            return this.rawData;
        }

        public GetElecTrendResponseBodyDataUrban setYear(String year) {
            this.year = year;
            return this;
        }
        public String getYear() {
            return this.year;
        }

    }

    public static class GetElecTrendResponseBodyDataWater extends TeaModel {
        /**
         * <p>Carbon emissions</p>
         */
        @NameInMap("carbonEmissionData")
        public Double carbonEmissionData;

        /**
         * <p>The unit.</p>
         */
        @NameInMap("dataUnit")
        public String dataUnit;

        /**
         * <p>Month</p>
         */
        @NameInMap("month")
        public Integer month;

        /**
         * <p>Power Type Name</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Power Type Code</p>
         */
        @NameInMap("nameKey")
        public String nameKey;

        /**
         * <p>Proportion of electricity consumption to all electricity consumption in the month: example value: 0.5 (i. e. 50%).</p>
         */
        @NameInMap("ratio")
        public Double ratio;

        /**
         * <p>Electricity consumption</p>
         */
        @NameInMap("rawData")
        public Double rawData;

        /**
         * <p>Year</p>
         */
        @NameInMap("year")
        public String year;

        public static GetElecTrendResponseBodyDataWater build(java.util.Map<String, ?> map) throws Exception {
            GetElecTrendResponseBodyDataWater self = new GetElecTrendResponseBodyDataWater();
            return TeaModel.build(map, self);
        }

        public GetElecTrendResponseBodyDataWater setCarbonEmissionData(Double carbonEmissionData) {
            this.carbonEmissionData = carbonEmissionData;
            return this;
        }
        public Double getCarbonEmissionData() {
            return this.carbonEmissionData;
        }

        public GetElecTrendResponseBodyDataWater setDataUnit(String dataUnit) {
            this.dataUnit = dataUnit;
            return this;
        }
        public String getDataUnit() {
            return this.dataUnit;
        }

        public GetElecTrendResponseBodyDataWater setMonth(Integer month) {
            this.month = month;
            return this;
        }
        public Integer getMonth() {
            return this.month;
        }

        public GetElecTrendResponseBodyDataWater setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetElecTrendResponseBodyDataWater setNameKey(String nameKey) {
            this.nameKey = nameKey;
            return this;
        }
        public String getNameKey() {
            return this.nameKey;
        }

        public GetElecTrendResponseBodyDataWater setRatio(Double ratio) {
            this.ratio = ratio;
            return this;
        }
        public Double getRatio() {
            return this.ratio;
        }

        public GetElecTrendResponseBodyDataWater setRawData(Double rawData) {
            this.rawData = rawData;
            return this;
        }
        public Double getRawData() {
            return this.rawData;
        }

        public GetElecTrendResponseBodyDataWater setYear(String year) {
            this.year = year;
            return this;
        }
        public String getYear() {
            return this.year;
        }

    }

    public static class GetElecTrendResponseBodyDataWind extends TeaModel {
        /**
         * <p>Carbon emissions</p>
         */
        @NameInMap("carbonEmissionData")
        public Double carbonEmissionData;

        /**
         * <p>The price unit.</p>
         */
        @NameInMap("dataUnit")
        public String dataUnit;

        /**
         * <p>Month</p>
         */
        @NameInMap("month")
        public Integer month;

        /**
         * <p>Power Type Name</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Power Type Code</p>
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

        /**
         * <p>Year</p>
         */
        @NameInMap("year")
        public String year;

        public static GetElecTrendResponseBodyDataWind build(java.util.Map<String, ?> map) throws Exception {
            GetElecTrendResponseBodyDataWind self = new GetElecTrendResponseBodyDataWind();
            return TeaModel.build(map, self);
        }

        public GetElecTrendResponseBodyDataWind setCarbonEmissionData(Double carbonEmissionData) {
            this.carbonEmissionData = carbonEmissionData;
            return this;
        }
        public Double getCarbonEmissionData() {
            return this.carbonEmissionData;
        }

        public GetElecTrendResponseBodyDataWind setDataUnit(String dataUnit) {
            this.dataUnit = dataUnit;
            return this;
        }
        public String getDataUnit() {
            return this.dataUnit;
        }

        public GetElecTrendResponseBodyDataWind setMonth(Integer month) {
            this.month = month;
            return this;
        }
        public Integer getMonth() {
            return this.month;
        }

        public GetElecTrendResponseBodyDataWind setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetElecTrendResponseBodyDataWind setNameKey(String nameKey) {
            this.nameKey = nameKey;
            return this;
        }
        public String getNameKey() {
            return this.nameKey;
        }

        public GetElecTrendResponseBodyDataWind setRatio(Double ratio) {
            this.ratio = ratio;
            return this;
        }
        public Double getRatio() {
            return this.ratio;
        }

        public GetElecTrendResponseBodyDataWind setRawData(Double rawData) {
            this.rawData = rawData;
            return this;
        }
        public Double getRawData() {
            return this.rawData;
        }

        public GetElecTrendResponseBodyDataWind setYear(String year) {
            this.year = year;
            return this;
        }
        public String getYear() {
            return this.year;
        }

    }

    public static class GetElecTrendResponseBodyDataZero extends TeaModel {
        /**
         * <p>Carbon emissions</p>
         */
        @NameInMap("carbonEmissionData")
        public Double carbonEmissionData;

        /**
         * <p>The price unit.</p>
         */
        @NameInMap("dataUnit")
        public String dataUnit;

        /**
         * <p>Month</p>
         */
        @NameInMap("month")
        public Integer month;

        /**
         * <p>Power Type Name</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Power Type Code</p>
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

        /**
         * <p>Year</p>
         */
        @NameInMap("year")
        public String year;

        public static GetElecTrendResponseBodyDataZero build(java.util.Map<String, ?> map) throws Exception {
            GetElecTrendResponseBodyDataZero self = new GetElecTrendResponseBodyDataZero();
            return TeaModel.build(map, self);
        }

        public GetElecTrendResponseBodyDataZero setCarbonEmissionData(Double carbonEmissionData) {
            this.carbonEmissionData = carbonEmissionData;
            return this;
        }
        public Double getCarbonEmissionData() {
            return this.carbonEmissionData;
        }

        public GetElecTrendResponseBodyDataZero setDataUnit(String dataUnit) {
            this.dataUnit = dataUnit;
            return this;
        }
        public String getDataUnit() {
            return this.dataUnit;
        }

        public GetElecTrendResponseBodyDataZero setMonth(Integer month) {
            this.month = month;
            return this;
        }
        public Integer getMonth() {
            return this.month;
        }

        public GetElecTrendResponseBodyDataZero setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetElecTrendResponseBodyDataZero setNameKey(String nameKey) {
            this.nameKey = nameKey;
            return this;
        }
        public String getNameKey() {
            return this.nameKey;
        }

        public GetElecTrendResponseBodyDataZero setRatio(Double ratio) {
            this.ratio = ratio;
            return this;
        }
        public Double getRatio() {
            return this.ratio;
        }

        public GetElecTrendResponseBodyDataZero setRawData(Double rawData) {
            this.rawData = rawData;
            return this;
        }
        public Double getRawData() {
            return this.rawData;
        }

        public GetElecTrendResponseBodyDataZero setYear(String year) {
            this.year = year;
            return this;
        }
        public String getYear() {
            return this.year;
        }

    }

    public static class GetElecTrendResponseBodyData extends TeaModel {
        /**
         * <p>Photoelectricity monthly electricity consumption and carbon emissions and other data.</p>
         */
        @NameInMap("light")
        public java.util.List<GetElecTrendResponseBodyDataLight> light;

        /**
         * <p>Monthly electricity consumption and carbon emissions data for nuclear power</p>
         */
        @NameInMap("nuclear")
        public java.util.List<GetElecTrendResponseBodyDataNuclear> nuclear;

        /**
         * <p>Monthly data on renewable electricity consumption and carbon emissions</p>
         */
        @NameInMap("renewing")
        public java.util.List<GetElecTrendResponseBodyDataRenewing> renewing;

        /**
         * <p>Data such as monthly electricity consumption and carbon emissions from the mains.</p>
         */
        @NameInMap("urban")
        public java.util.List<GetElecTrendResponseBodyDataUrban> urban;

        /**
         * <p>Monthly data on electricity consumption and carbon emissions for hydropower.</p>
         */
        @NameInMap("water")
        public java.util.List<GetElecTrendResponseBodyDataWater> water;

        /**
         * <p>Monthly wind power consumption and carbon emission data</p>
         */
        @NameInMap("wind")
        public java.util.List<GetElecTrendResponseBodyDataWind> wind;

        /**
         * <p>Zero electricity monthly electricity consumption and carbon emissions and other data.</p>
         */
        @NameInMap("zero")
        public java.util.List<GetElecTrendResponseBodyDataZero> zero;

        public static GetElecTrendResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetElecTrendResponseBodyData self = new GetElecTrendResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetElecTrendResponseBodyData setLight(java.util.List<GetElecTrendResponseBodyDataLight> light) {
            this.light = light;
            return this;
        }
        public java.util.List<GetElecTrendResponseBodyDataLight> getLight() {
            return this.light;
        }

        public GetElecTrendResponseBodyData setNuclear(java.util.List<GetElecTrendResponseBodyDataNuclear> nuclear) {
            this.nuclear = nuclear;
            return this;
        }
        public java.util.List<GetElecTrendResponseBodyDataNuclear> getNuclear() {
            return this.nuclear;
        }

        public GetElecTrendResponseBodyData setRenewing(java.util.List<GetElecTrendResponseBodyDataRenewing> renewing) {
            this.renewing = renewing;
            return this;
        }
        public java.util.List<GetElecTrendResponseBodyDataRenewing> getRenewing() {
            return this.renewing;
        }

        public GetElecTrendResponseBodyData setUrban(java.util.List<GetElecTrendResponseBodyDataUrban> urban) {
            this.urban = urban;
            return this;
        }
        public java.util.List<GetElecTrendResponseBodyDataUrban> getUrban() {
            return this.urban;
        }

        public GetElecTrendResponseBodyData setWater(java.util.List<GetElecTrendResponseBodyDataWater> water) {
            this.water = water;
            return this;
        }
        public java.util.List<GetElecTrendResponseBodyDataWater> getWater() {
            return this.water;
        }

        public GetElecTrendResponseBodyData setWind(java.util.List<GetElecTrendResponseBodyDataWind> wind) {
            this.wind = wind;
            return this;
        }
        public java.util.List<GetElecTrendResponseBodyDataWind> getWind() {
            return this.wind;
        }

        public GetElecTrendResponseBodyData setZero(java.util.List<GetElecTrendResponseBodyDataZero> zero) {
            this.zero = zero;
            return this;
        }
        public java.util.List<GetElecTrendResponseBodyDataZero> getZero() {
            return this.zero;
        }

    }

}
