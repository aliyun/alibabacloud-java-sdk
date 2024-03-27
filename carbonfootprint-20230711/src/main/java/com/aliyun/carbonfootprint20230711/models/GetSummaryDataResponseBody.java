// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.carbonfootprint20230711.models;

import com.aliyun.tea.*;

public class GetSummaryDataResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetSummaryDataResponseBodyData data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetSummaryDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSummaryDataResponseBody self = new GetSummaryDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSummaryDataResponseBody setData(GetSummaryDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSummaryDataResponseBodyData getData() {
        return this.data;
    }

    public GetSummaryDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSummaryDataResponseBodyData extends TeaModel {
        /**
         * <p>Converted aircraft carbon emissions.</p>
         */
        @NameInMap("AircraftConsumptionConversion")
        public String aircraftConsumptionConversion;

        /**
         * <p>Converted car carbon emissions.</p>
         */
        @NameInMap("CarConsumptionConversion")
        public String carConsumptionConversion;

        /**
         * <p>The carbon emissions in the previous month, in kgCO₂e.</p>
         */
        @NameInMap("LastMonthConsumptionConversion")
        public String lastMonthConsumptionConversion;

        /**
         * <p>The carbon emissions in the same month of the previous year, in kgCO₂e.</p>
         */
        @NameInMap("LastYearConsumptionConversion")
        public String lastYearConsumptionConversion;

        /**
         * <p>The carbon emissions of the previous year, in kgCO₂e.</p>
         */
        @NameInMap("LastYearConsumptionConversionSum")
        public String lastYearConsumptionConversionSum;

        /**
         * <p>The point in time at which the data is last updated.</p>
         */
        @NameInMap("LatestDataTime")
        public String latestDataTime;

        /**
         * <p>The carbon emissions in this month, in kgCO₂e.</p>
         */
        @NameInMap("ThisMonthConsumptionConversion")
        public String thisMonthConsumptionConversion;

        /**
         * <p>The carbon emissions in the year of this month, in kgCO₂e.</p>
         */
        @NameInMap("ThisYearConsumptionConversion")
        public String thisYearConsumptionConversion;

        /**
         * <p>The total carbon emissions within the specified time range, in kgCO₂e.</p>
         */
        @NameInMap("TotalCarbonConsumptionConversion")
        public String totalCarbonConsumptionConversion;

        /**
         * <p>Converted tree carbon absorption.</p>
         */
        @NameInMap("TreeConsumptionConversion")
        public String treeConsumptionConversion;

        public static GetSummaryDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSummaryDataResponseBodyData self = new GetSummaryDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSummaryDataResponseBodyData setAircraftConsumptionConversion(String aircraftConsumptionConversion) {
            this.aircraftConsumptionConversion = aircraftConsumptionConversion;
            return this;
        }
        public String getAircraftConsumptionConversion() {
            return this.aircraftConsumptionConversion;
        }

        public GetSummaryDataResponseBodyData setCarConsumptionConversion(String carConsumptionConversion) {
            this.carConsumptionConversion = carConsumptionConversion;
            return this;
        }
        public String getCarConsumptionConversion() {
            return this.carConsumptionConversion;
        }

        public GetSummaryDataResponseBodyData setLastMonthConsumptionConversion(String lastMonthConsumptionConversion) {
            this.lastMonthConsumptionConversion = lastMonthConsumptionConversion;
            return this;
        }
        public String getLastMonthConsumptionConversion() {
            return this.lastMonthConsumptionConversion;
        }

        public GetSummaryDataResponseBodyData setLastYearConsumptionConversion(String lastYearConsumptionConversion) {
            this.lastYearConsumptionConversion = lastYearConsumptionConversion;
            return this;
        }
        public String getLastYearConsumptionConversion() {
            return this.lastYearConsumptionConversion;
        }

        public GetSummaryDataResponseBodyData setLastYearConsumptionConversionSum(String lastYearConsumptionConversionSum) {
            this.lastYearConsumptionConversionSum = lastYearConsumptionConversionSum;
            return this;
        }
        public String getLastYearConsumptionConversionSum() {
            return this.lastYearConsumptionConversionSum;
        }

        public GetSummaryDataResponseBodyData setLatestDataTime(String latestDataTime) {
            this.latestDataTime = latestDataTime;
            return this;
        }
        public String getLatestDataTime() {
            return this.latestDataTime;
        }

        public GetSummaryDataResponseBodyData setThisMonthConsumptionConversion(String thisMonthConsumptionConversion) {
            this.thisMonthConsumptionConversion = thisMonthConsumptionConversion;
            return this;
        }
        public String getThisMonthConsumptionConversion() {
            return this.thisMonthConsumptionConversion;
        }

        public GetSummaryDataResponseBodyData setThisYearConsumptionConversion(String thisYearConsumptionConversion) {
            this.thisYearConsumptionConversion = thisYearConsumptionConversion;
            return this;
        }
        public String getThisYearConsumptionConversion() {
            return this.thisYearConsumptionConversion;
        }

        public GetSummaryDataResponseBodyData setTotalCarbonConsumptionConversion(String totalCarbonConsumptionConversion) {
            this.totalCarbonConsumptionConversion = totalCarbonConsumptionConversion;
            return this;
        }
        public String getTotalCarbonConsumptionConversion() {
            return this.totalCarbonConsumptionConversion;
        }

        public GetSummaryDataResponseBodyData setTreeConsumptionConversion(String treeConsumptionConversion) {
            this.treeConsumptionConversion = treeConsumptionConversion;
            return this;
        }
        public String getTreeConsumptionConversion() {
            return this.treeConsumptionConversion;
        }

    }

}
