// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetCarbonEmissionTrendResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("data")
    public GetCarbonEmissionTrendResponseBodyData data;

    /**
     * <p>Id of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetCarbonEmissionTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCarbonEmissionTrendResponseBody self = new GetCarbonEmissionTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCarbonEmissionTrendResponseBody setData(GetCarbonEmissionTrendResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCarbonEmissionTrendResponseBodyData getData() {
        return this.data;
    }

    public GetCarbonEmissionTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCarbonEmissionTrendResponseBodyDataActualEmissionListItems extends TeaModel {
        /**
         * <p>Carbon emissions.</p>
         */
        @NameInMap("carbonEmissionData")
        public Double carbonEmissionData;

        /**
         * <p>The month.</p>
         */
        @NameInMap("month")
        public Integer month;

        /**
         * <p>The year.</p>
         */
        @NameInMap("year")
        public String year;

        public static GetCarbonEmissionTrendResponseBodyDataActualEmissionListItems build(java.util.Map<String, ?> map) throws Exception {
            GetCarbonEmissionTrendResponseBodyDataActualEmissionListItems self = new GetCarbonEmissionTrendResponseBodyDataActualEmissionListItems();
            return TeaModel.build(map, self);
        }

        public GetCarbonEmissionTrendResponseBodyDataActualEmissionListItems setCarbonEmissionData(Double carbonEmissionData) {
            this.carbonEmissionData = carbonEmissionData;
            return this;
        }
        public Double getCarbonEmissionData() {
            return this.carbonEmissionData;
        }

        public GetCarbonEmissionTrendResponseBodyDataActualEmissionListItems setMonth(Integer month) {
            this.month = month;
            return this;
        }
        public Integer getMonth() {
            return this.month;
        }

        public GetCarbonEmissionTrendResponseBodyDataActualEmissionListItems setYear(String year) {
            this.year = year;
            return this;
        }
        public String getYear() {
            return this.year;
        }

    }

    public static class GetCarbonEmissionTrendResponseBodyDataActualEmissionList extends TeaModel {
        /**
         * <p>Data item list.</p>
         */
        @NameInMap("items")
        public java.util.List<GetCarbonEmissionTrendResponseBodyDataActualEmissionListItems> items;

        /**
         * <p>The year.</p>
         */
        @NameInMap("year")
        public String year;

        public static GetCarbonEmissionTrendResponseBodyDataActualEmissionList build(java.util.Map<String, ?> map) throws Exception {
            GetCarbonEmissionTrendResponseBodyDataActualEmissionList self = new GetCarbonEmissionTrendResponseBodyDataActualEmissionList();
            return TeaModel.build(map, self);
        }

        public GetCarbonEmissionTrendResponseBodyDataActualEmissionList setItems(java.util.List<GetCarbonEmissionTrendResponseBodyDataActualEmissionListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetCarbonEmissionTrendResponseBodyDataActualEmissionListItems> getItems() {
            return this.items;
        }

        public GetCarbonEmissionTrendResponseBodyDataActualEmissionList setYear(String year) {
            this.year = year;
            return this;
        }
        public String getYear() {
            return this.year;
        }

    }

    public static class GetCarbonEmissionTrendResponseBodyDataTargetEmissionListItems extends TeaModel {
        /**
         * <p>Carbon emissions.</p>
         */
        @NameInMap("carbonEmissionData")
        public Double carbonEmissionData;

        /**
         * <p>The month.</p>
         */
        @NameInMap("month")
        public Integer month;

        /**
         * <p>The year.</p>
         */
        @NameInMap("year")
        public String year;

        public static GetCarbonEmissionTrendResponseBodyDataTargetEmissionListItems build(java.util.Map<String, ?> map) throws Exception {
            GetCarbonEmissionTrendResponseBodyDataTargetEmissionListItems self = new GetCarbonEmissionTrendResponseBodyDataTargetEmissionListItems();
            return TeaModel.build(map, self);
        }

        public GetCarbonEmissionTrendResponseBodyDataTargetEmissionListItems setCarbonEmissionData(Double carbonEmissionData) {
            this.carbonEmissionData = carbonEmissionData;
            return this;
        }
        public Double getCarbonEmissionData() {
            return this.carbonEmissionData;
        }

        public GetCarbonEmissionTrendResponseBodyDataTargetEmissionListItems setMonth(Integer month) {
            this.month = month;
            return this;
        }
        public Integer getMonth() {
            return this.month;
        }

        public GetCarbonEmissionTrendResponseBodyDataTargetEmissionListItems setYear(String year) {
            this.year = year;
            return this;
        }
        public String getYear() {
            return this.year;
        }

    }

    public static class GetCarbonEmissionTrendResponseBodyDataTargetEmissionList extends TeaModel {
        /**
         * <p>Data item list.</p>
         */
        @NameInMap("items")
        public java.util.List<GetCarbonEmissionTrendResponseBodyDataTargetEmissionListItems> items;

        /**
         * <p>The year.</p>
         */
        @NameInMap("year")
        public String year;

        public static GetCarbonEmissionTrendResponseBodyDataTargetEmissionList build(java.util.Map<String, ?> map) throws Exception {
            GetCarbonEmissionTrendResponseBodyDataTargetEmissionList self = new GetCarbonEmissionTrendResponseBodyDataTargetEmissionList();
            return TeaModel.build(map, self);
        }

        public GetCarbonEmissionTrendResponseBodyDataTargetEmissionList setItems(java.util.List<GetCarbonEmissionTrendResponseBodyDataTargetEmissionListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetCarbonEmissionTrendResponseBodyDataTargetEmissionListItems> getItems() {
            return this.items;
        }

        public GetCarbonEmissionTrendResponseBodyDataTargetEmissionList setYear(String year) {
            this.year = year;
            return this;
        }
        public String getYear() {
            return this.year;
        }

    }

    public static class GetCarbonEmissionTrendResponseBodyData extends TeaModel {
        /**
         * <p>Actual emission list.</p>
         */
        @NameInMap("actualEmissionList")
        public java.util.List<GetCarbonEmissionTrendResponseBodyDataActualEmissionList> actualEmissionList;

        /**
         * <p>Target Emission List.</p>
         */
        @NameInMap("targetEmissionList")
        public java.util.List<GetCarbonEmissionTrendResponseBodyDataTargetEmissionList> targetEmissionList;

        public static GetCarbonEmissionTrendResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCarbonEmissionTrendResponseBodyData self = new GetCarbonEmissionTrendResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCarbonEmissionTrendResponseBodyData setActualEmissionList(java.util.List<GetCarbonEmissionTrendResponseBodyDataActualEmissionList> actualEmissionList) {
            this.actualEmissionList = actualEmissionList;
            return this;
        }
        public java.util.List<GetCarbonEmissionTrendResponseBodyDataActualEmissionList> getActualEmissionList() {
            return this.actualEmissionList;
        }

        public GetCarbonEmissionTrendResponseBodyData setTargetEmissionList(java.util.List<GetCarbonEmissionTrendResponseBodyDataTargetEmissionList> targetEmissionList) {
            this.targetEmissionList = targetEmissionList;
            return this;
        }
        public java.util.List<GetCarbonEmissionTrendResponseBodyDataTargetEmissionList> getTargetEmissionList() {
            return this.targetEmissionList;
        }

    }

}
