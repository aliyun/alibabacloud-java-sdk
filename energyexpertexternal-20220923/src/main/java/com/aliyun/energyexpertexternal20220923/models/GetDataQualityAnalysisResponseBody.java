// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetDataQualityAnalysisResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("data")
    public GetDataQualityAnalysisResponseBodyData data;

    /**
     * <p>The ID of the request. The value is unique for each request. This facilitates subsequent troubleshooting.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetDataQualityAnalysisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataQualityAnalysisResponseBody self = new GetDataQualityAnalysisResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataQualityAnalysisResponseBody setData(GetDataQualityAnalysisResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDataQualityAnalysisResponseBodyData getData() {
        return this.data;
    }

    public GetDataQualityAnalysisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDataQualityAnalysisResponseBodyDataDataQualityScore extends TeaModel {
        /**
         * <p>Data quality evaluation indicator 1: activity data credibility.</p>
         */
        @NameInMap("g1")
        public Double g1;

        /**
         * <p>Data quality evaluation indicator 2: data factor reliability.</p>
         */
        @NameInMap("g2")
        public Double g2;

        /**
         * <p>Data quality evaluation indicator 3: time representativeness.</p>
         */
        @NameInMap("g3")
        public Double g3;

        /**
         * <p>Data quality evaluation indicator 4: geographic representativeness.</p>
         */
        @NameInMap("g4")
        public Double g4;

        public static GetDataQualityAnalysisResponseBodyDataDataQualityScore build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityAnalysisResponseBodyDataDataQualityScore self = new GetDataQualityAnalysisResponseBodyDataDataQualityScore();
            return TeaModel.build(map, self);
        }

        public GetDataQualityAnalysisResponseBodyDataDataQualityScore setG1(Double g1) {
            this.g1 = g1;
            return this;
        }
        public Double getG1() {
            return this.g1;
        }

        public GetDataQualityAnalysisResponseBodyDataDataQualityScore setG2(Double g2) {
            this.g2 = g2;
            return this;
        }
        public Double getG2() {
            return this.g2;
        }

        public GetDataQualityAnalysisResponseBodyDataDataQualityScore setG3(Double g3) {
            this.g3 = g3;
            return this;
        }
        public Double getG3() {
            return this.g3;
        }

        public GetDataQualityAnalysisResponseBodyDataDataQualityScore setG4(Double g4) {
            this.g4 = g4;
            return this;
        }
        public Double getG4() {
            return this.g4;
        }

    }

    public static class GetDataQualityAnalysisResponseBodyDataDataQuality extends TeaModel {
        /**
         * <p>Inventory name</p>
         */
        @NameInMap("inventory")
        public String inventory;

        /**
         * <p>Score. The distribution ranges from 1 to 5. A value closer to 1 indicates better data quality.</p>
         */
        @NameInMap("score")
        public GetDataQualityAnalysisResponseBodyDataDataQualityScore score;

        public static GetDataQualityAnalysisResponseBodyDataDataQuality build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityAnalysisResponseBodyDataDataQuality self = new GetDataQualityAnalysisResponseBodyDataDataQuality();
            return TeaModel.build(map, self);
        }

        public GetDataQualityAnalysisResponseBodyDataDataQuality setInventory(String inventory) {
            this.inventory = inventory;
            return this;
        }
        public String getInventory() {
            return this.inventory;
        }

        public GetDataQualityAnalysisResponseBodyDataDataQuality setScore(GetDataQualityAnalysisResponseBodyDataDataQualityScore score) {
            this.score = score;
            return this;
        }
        public GetDataQualityAnalysisResponseBodyDataDataQualityScore getScore() {
            return this.score;
        }

    }

    public static class GetDataQualityAnalysisResponseBodyDataDataQualityResult extends TeaModel {
        /**
         * <p>The score. This parameter is applicable to DQR results. The distribution ranges from 1 to 5. A value closer to 1 indicates better data quality. The number of valid digits is kept to four decimal places.</p>
         */
        @NameInMap("data_quality_score")
        public Double dataQualityScore;

        /**
         * <p>Data quality evaluation indicator 1: activity data credibility.</p>
         */
        @NameInMap("g1")
        public Double g1;

        /**
         * <p>Data quality evaluation indicator 2: data factor reliability.</p>
         */
        @NameInMap("g2")
        public Double g2;

        /**
         * <p>Data quality evaluation indicator 3: time representativeness.</p>
         */
        @NameInMap("g3")
        public Double g3;

        /**
         * <p>Data quality evaluation indicator 4: geographic representativeness.</p>
         */
        @NameInMap("g4")
        public Double g4;

        public static GetDataQualityAnalysisResponseBodyDataDataQualityResult build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityAnalysisResponseBodyDataDataQualityResult self = new GetDataQualityAnalysisResponseBodyDataDataQualityResult();
            return TeaModel.build(map, self);
        }

        public GetDataQualityAnalysisResponseBodyDataDataQualityResult setDataQualityScore(Double dataQualityScore) {
            this.dataQualityScore = dataQualityScore;
            return this;
        }
        public Double getDataQualityScore() {
            return this.dataQualityScore;
        }

        public GetDataQualityAnalysisResponseBodyDataDataQualityResult setG1(Double g1) {
            this.g1 = g1;
            return this;
        }
        public Double getG1() {
            return this.g1;
        }

        public GetDataQualityAnalysisResponseBodyDataDataQualityResult setG2(Double g2) {
            this.g2 = g2;
            return this;
        }
        public Double getG2() {
            return this.g2;
        }

        public GetDataQualityAnalysisResponseBodyDataDataQualityResult setG3(Double g3) {
            this.g3 = g3;
            return this;
        }
        public Double getG3() {
            return this.g3;
        }

        public GetDataQualityAnalysisResponseBodyDataDataQualityResult setG4(Double g4) {
            this.g4 = g4;
            return this;
        }
        public Double getG4() {
            return this.g4;
        }

    }

    public static class GetDataQualityAnalysisResponseBodyDataSensitivityList extends TeaModel {
        /**
         * <p>Inventory id</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>Name of the inventory item.</p>
         */
        @NameInMap("inventory")
        public String inventory;

        /**
         * <p>List of emission reduction measures.</p>
         */
        @NameInMap("reductionList")
        public java.util.List<String> reductionList;

        /**
         * <p>Sensitivity percentage.</p>
         */
        @NameInMap("sensitivity")
        public Double sensitivity;

        public static GetDataQualityAnalysisResponseBodyDataSensitivityList build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityAnalysisResponseBodyDataSensitivityList self = new GetDataQualityAnalysisResponseBodyDataSensitivityList();
            return TeaModel.build(map, self);
        }

        public GetDataQualityAnalysisResponseBodyDataSensitivityList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetDataQualityAnalysisResponseBodyDataSensitivityList setInventory(String inventory) {
            this.inventory = inventory;
            return this;
        }
        public String getInventory() {
            return this.inventory;
        }

        public GetDataQualityAnalysisResponseBodyDataSensitivityList setReductionList(java.util.List<String> reductionList) {
            this.reductionList = reductionList;
            return this;
        }
        public java.util.List<String> getReductionList() {
            return this.reductionList;
        }

        public GetDataQualityAnalysisResponseBodyDataSensitivityList setSensitivity(Double sensitivity) {
            this.sensitivity = sensitivity;
            return this;
        }
        public Double getSensitivity() {
            return this.sensitivity;
        }

    }

    public static class GetDataQualityAnalysisResponseBodyDataUncertaintyValues extends TeaModel {
        /**
         * <p>The name of the inventory. Format: process name / inventory name.</p>
         */
        @NameInMap("inventory")
        public String inventory;

        /**
         * <p>Inventory uncertainty absolute contribution size. The impact of the quality of each inventory data on the carbon footprint results in the modeling process, when the uncertain contribution of a list is large, please improve its data quality as much as possible to improve the accuracy of carbon footprint analysis. The meaning of "1.4964" is not determined to contribute 1.4964 kgCO₂ e/unit, where unit is the unit of the product.</p>
         */
        @NameInMap("uncertaintyContribution")
        public String uncertaintyContribution;

        public static GetDataQualityAnalysisResponseBodyDataUncertaintyValues build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityAnalysisResponseBodyDataUncertaintyValues self = new GetDataQualityAnalysisResponseBodyDataUncertaintyValues();
            return TeaModel.build(map, self);
        }

        public GetDataQualityAnalysisResponseBodyDataUncertaintyValues setInventory(String inventory) {
            this.inventory = inventory;
            return this;
        }
        public String getInventory() {
            return this.inventory;
        }

        public GetDataQualityAnalysisResponseBodyDataUncertaintyValues setUncertaintyContribution(String uncertaintyContribution) {
            this.uncertaintyContribution = uncertaintyContribution;
            return this;
        }
        public String getUncertaintyContribution() {
            return this.uncertaintyContribution;
        }

    }

    public static class GetDataQualityAnalysisResponseBodyData extends TeaModel {
        /**
         * <p>Score of each inventory.</p>
         */
        @NameInMap("dataQuality")
        public java.util.List<GetDataQualityAnalysisResponseBodyDataDataQuality> dataQuality;

        /**
         * <p>Data quality result.</p>
         */
        @NameInMap("dataQualityResult")
        public GetDataQualityAnalysisResponseBodyDataDataQualityResult dataQualityResult;

        /**
         * <p>Sensitivity analysis list</p>
         */
        @NameInMap("sensitivityList")
        public java.util.List<GetDataQualityAnalysisResponseBodyDataSensitivityList> sensitivityList;

        /**
         * <p>Uncertainty value. The model\\"s overall percentage uncertainty results. "10.00%" symbolizes a 10.00% uncertainty, indicating that the carbon footprint lies within ±10.00%. This is derived from a weighted aggregation of individual inventory uncertainties.</p>
         */
        @NameInMap("uncertainty")
        public String uncertainty;

        /**
         * <p>Uncertainty list</p>
         */
        @NameInMap("uncertaintyValues")
        public java.util.List<GetDataQualityAnalysisResponseBodyDataUncertaintyValues> uncertaintyValues;

        public static GetDataQualityAnalysisResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityAnalysisResponseBodyData self = new GetDataQualityAnalysisResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataQualityAnalysisResponseBodyData setDataQuality(java.util.List<GetDataQualityAnalysisResponseBodyDataDataQuality> dataQuality) {
            this.dataQuality = dataQuality;
            return this;
        }
        public java.util.List<GetDataQualityAnalysisResponseBodyDataDataQuality> getDataQuality() {
            return this.dataQuality;
        }

        public GetDataQualityAnalysisResponseBodyData setDataQualityResult(GetDataQualityAnalysisResponseBodyDataDataQualityResult dataQualityResult) {
            this.dataQualityResult = dataQualityResult;
            return this;
        }
        public GetDataQualityAnalysisResponseBodyDataDataQualityResult getDataQualityResult() {
            return this.dataQualityResult;
        }

        public GetDataQualityAnalysisResponseBodyData setSensitivityList(java.util.List<GetDataQualityAnalysisResponseBodyDataSensitivityList> sensitivityList) {
            this.sensitivityList = sensitivityList;
            return this;
        }
        public java.util.List<GetDataQualityAnalysisResponseBodyDataSensitivityList> getSensitivityList() {
            return this.sensitivityList;
        }

        public GetDataQualityAnalysisResponseBodyData setUncertainty(String uncertainty) {
            this.uncertainty = uncertainty;
            return this;
        }
        public String getUncertainty() {
            return this.uncertainty;
        }

        public GetDataQualityAnalysisResponseBodyData setUncertaintyValues(java.util.List<GetDataQualityAnalysisResponseBodyDataUncertaintyValues> uncertaintyValues) {
            this.uncertaintyValues = uncertaintyValues;
            return this;
        }
        public java.util.List<GetDataQualityAnalysisResponseBodyDataUncertaintyValues> getUncertaintyValues() {
            return this.uncertaintyValues;
        }

    }

}
