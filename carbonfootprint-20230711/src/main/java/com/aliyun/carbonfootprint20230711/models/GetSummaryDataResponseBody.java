// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.carbonfootprint20230711.models;

import com.aliyun.tea.*;

public class GetSummaryDataResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetSummaryDataResponseBodyData data;

    /**
     * <p>Id of the request</p>
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
        @NameInMap("AircraftConsumptionConversion")
        public String aircraftConsumptionConversion;

        @NameInMap("CarConsumptionConversion")
        public String carConsumptionConversion;

        @NameInMap("LastMonthConsumptionConversion")
        public String lastMonthConsumptionConversion;

        @NameInMap("LastYearConsumptionConversion")
        public String lastYearConsumptionConversion;

        @NameInMap("LastYearConsumptionConversionSum")
        public String lastYearConsumptionConversionSum;

        @NameInMap("LatestDataTime")
        public String latestDataTime;

        @NameInMap("ThisMonthConsumptionConversion")
        public String thisMonthConsumptionConversion;

        @NameInMap("ThisYearConsumptionConversion")
        public String thisYearConsumptionConversion;

        @NameInMap("TotalCarbonConsumptionConversion")
        public String totalCarbonConsumptionConversion;

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
