// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetEmissionSummaryResponseBody extends TeaModel {
    /**
     * <p>Details of summarized data</p>
     */
    @NameInMap("data")
    public GetEmissionSummaryResponseBodyData data;

    /**
     * <p>Id of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>83A5A7DD-8974-5769-952E-590A97BEA34E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetEmissionSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEmissionSummaryResponseBody self = new GetEmissionSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEmissionSummaryResponseBody setData(GetEmissionSummaryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEmissionSummaryResponseBodyData getData() {
        return this.data;
    }

    public GetEmissionSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetEmissionSummaryResponseBodyData extends TeaModel {
        /**
         * <p>Percentage of scheduled.</p>
         * 
         * <strong>example:</strong>
         * <p>2.7657</p>
         */
        @NameInMap("actualEmissionRatio")
        public Double actualEmissionRatio;

        /**
         * <p>Carbon emissions reduction.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("carbonSaveConversion")
        public Double carbonSaveConversion;

        /**
         * <p>Statistical indicators for this cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>276.4</p>
         */
        @NameInMap("currentPeriodCarbonEmissionData")
        public Double currentPeriodCarbonEmissionData;

        /**
         * <p>Whether to show the weighting ratio carbon emission.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isWeighting")
        public Boolean isWeighting;

        /**
         * <p>Last period statistical indicators.</p>
         * 
         * <strong>example:</strong>
         * <p>9.40100</p>
         */
        @NameInMap("lastPeriodCarbonEmissionData")
        public Double lastPeriodCarbonEmissionData;

        /**
         * <p>Calculation of carbon emissions based on shareholding ratio in the last cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>8.4609</p>
         */
        @NameInMap("lastPeriodWeightingCarbonEmissionData")
        public Double lastPeriodWeightingCarbonEmissionData;

        /**
         * <p>Year-on-year.</p>
         * 
         * <strong>example:</strong>
         * <p>28.410</p>
         */
        @NameInMap("ratio")
        public Double ratio;

        /**
         * <p>Total carbon emissions.</p>
         * 
         * <strong>example:</strong>
         * <p>276.46</p>
         */
        @NameInMap("totalCarbonEmissionData")
        public Double totalCarbonEmissionData;

        /**
         * <p>Calculate carbon emissions by share ratio</p>
         * 
         * <strong>example:</strong>
         * <p>248.81400</p>
         */
        @NameInMap("weightingCarbonEmissionData")
        public Double weightingCarbonEmissionData;

        /**
         * <p>Year-on-year of weighting ratio carbon emissions.</p>
         * 
         * <strong>example:</strong>
         * <p>28.4102</p>
         */
        @NameInMap("weightingRatio")
        public Double weightingRatio;

        public static GetEmissionSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEmissionSummaryResponseBodyData self = new GetEmissionSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEmissionSummaryResponseBodyData setActualEmissionRatio(Double actualEmissionRatio) {
            this.actualEmissionRatio = actualEmissionRatio;
            return this;
        }
        public Double getActualEmissionRatio() {
            return this.actualEmissionRatio;
        }

        public GetEmissionSummaryResponseBodyData setCarbonSaveConversion(Double carbonSaveConversion) {
            this.carbonSaveConversion = carbonSaveConversion;
            return this;
        }
        public Double getCarbonSaveConversion() {
            return this.carbonSaveConversion;
        }

        public GetEmissionSummaryResponseBodyData setCurrentPeriodCarbonEmissionData(Double currentPeriodCarbonEmissionData) {
            this.currentPeriodCarbonEmissionData = currentPeriodCarbonEmissionData;
            return this;
        }
        public Double getCurrentPeriodCarbonEmissionData() {
            return this.currentPeriodCarbonEmissionData;
        }

        public GetEmissionSummaryResponseBodyData setIsWeighting(Boolean isWeighting) {
            this.isWeighting = isWeighting;
            return this;
        }
        public Boolean getIsWeighting() {
            return this.isWeighting;
        }

        public GetEmissionSummaryResponseBodyData setLastPeriodCarbonEmissionData(Double lastPeriodCarbonEmissionData) {
            this.lastPeriodCarbonEmissionData = lastPeriodCarbonEmissionData;
            return this;
        }
        public Double getLastPeriodCarbonEmissionData() {
            return this.lastPeriodCarbonEmissionData;
        }

        public GetEmissionSummaryResponseBodyData setLastPeriodWeightingCarbonEmissionData(Double lastPeriodWeightingCarbonEmissionData) {
            this.lastPeriodWeightingCarbonEmissionData = lastPeriodWeightingCarbonEmissionData;
            return this;
        }
        public Double getLastPeriodWeightingCarbonEmissionData() {
            return this.lastPeriodWeightingCarbonEmissionData;
        }

        public GetEmissionSummaryResponseBodyData setRatio(Double ratio) {
            this.ratio = ratio;
            return this;
        }
        public Double getRatio() {
            return this.ratio;
        }

        public GetEmissionSummaryResponseBodyData setTotalCarbonEmissionData(Double totalCarbonEmissionData) {
            this.totalCarbonEmissionData = totalCarbonEmissionData;
            return this;
        }
        public Double getTotalCarbonEmissionData() {
            return this.totalCarbonEmissionData;
        }

        public GetEmissionSummaryResponseBodyData setWeightingCarbonEmissionData(Double weightingCarbonEmissionData) {
            this.weightingCarbonEmissionData = weightingCarbonEmissionData;
            return this;
        }
        public Double getWeightingCarbonEmissionData() {
            return this.weightingCarbonEmissionData;
        }

        public GetEmissionSummaryResponseBodyData setWeightingRatio(Double weightingRatio) {
            this.weightingRatio = weightingRatio;
            return this;
        }
        public Double getWeightingRatio() {
            return this.weightingRatio;
        }

    }

}
