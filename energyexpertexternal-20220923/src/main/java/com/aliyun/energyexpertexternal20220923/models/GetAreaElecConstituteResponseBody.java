// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetAreaElecConstituteResponseBody extends TeaModel {
    /**
     * <p>The code returned for the request. A value of Success indicates that the request was successful. Other values indicate that the request failed. You can troubleshoot the error by viewing the error message returned.</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public GetAreaElecConstituteResponseBodyData data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetAreaElecConstituteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAreaElecConstituteResponseBody self = new GetAreaElecConstituteResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAreaElecConstituteResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAreaElecConstituteResponseBody setData(GetAreaElecConstituteResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAreaElecConstituteResponseBodyData getData() {
        return this.data;
    }

    public GetAreaElecConstituteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAreaElecConstituteResponseBodyData extends TeaModel {
        /**
         * <p>Photoelectric power consumption and carbon emission data of each enterprise.</p>
         */
        @NameInMap("light")
        public java.util.List<CarbonEmissionElecSummaryItem> light;

        /**
         * <p>Data on nuclear power consumption and carbon emissions at each enterprise.</p>
         */
        @NameInMap("nuclear")
        public java.util.List<CarbonEmissionElecSummaryItem> nuclear;

        /**
         * <p>Data on renewable electricity consumption and carbon emissions at each enterprise.</p>
         */
        @NameInMap("renewing")
        public java.util.List<CarbonEmissionElecSummaryItem> renewing;

        /**
         * <p>Data on mains electricity consumption and carbon emission of each enterprise.</p>
         */
        @NameInMap("urban")
        public java.util.List<CarbonEmissionElecSummaryItem> urban;

        /**
         * <p>Hydropower consumption and carbon emission data of each enterprise.</p>
         */
        @NameInMap("water")
        public java.util.List<CarbonEmissionElecSummaryItem> water;

        /**
         * <p>Wind power consumption and carbon emission data of each enterprise.</p>
         */
        @NameInMap("wind")
        public java.util.List<CarbonEmissionElecSummaryItem> wind;

        /**
         * <p>Data of zero electricity consumption and carbon emission of each enterprise.</p>
         */
        @NameInMap("zero")
        public java.util.List<CarbonEmissionElecSummaryItem> zero;

        public static GetAreaElecConstituteResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAreaElecConstituteResponseBodyData self = new GetAreaElecConstituteResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAreaElecConstituteResponseBodyData setLight(java.util.List<CarbonEmissionElecSummaryItem> light) {
            this.light = light;
            return this;
        }
        public java.util.List<CarbonEmissionElecSummaryItem> getLight() {
            return this.light;
        }

        public GetAreaElecConstituteResponseBodyData setNuclear(java.util.List<CarbonEmissionElecSummaryItem> nuclear) {
            this.nuclear = nuclear;
            return this;
        }
        public java.util.List<CarbonEmissionElecSummaryItem> getNuclear() {
            return this.nuclear;
        }

        public GetAreaElecConstituteResponseBodyData setRenewing(java.util.List<CarbonEmissionElecSummaryItem> renewing) {
            this.renewing = renewing;
            return this;
        }
        public java.util.List<CarbonEmissionElecSummaryItem> getRenewing() {
            return this.renewing;
        }

        public GetAreaElecConstituteResponseBodyData setUrban(java.util.List<CarbonEmissionElecSummaryItem> urban) {
            this.urban = urban;
            return this;
        }
        public java.util.List<CarbonEmissionElecSummaryItem> getUrban() {
            return this.urban;
        }

        public GetAreaElecConstituteResponseBodyData setWater(java.util.List<CarbonEmissionElecSummaryItem> water) {
            this.water = water;
            return this;
        }
        public java.util.List<CarbonEmissionElecSummaryItem> getWater() {
            return this.water;
        }

        public GetAreaElecConstituteResponseBodyData setWind(java.util.List<CarbonEmissionElecSummaryItem> wind) {
            this.wind = wind;
            return this;
        }
        public java.util.List<CarbonEmissionElecSummaryItem> getWind() {
            return this.wind;
        }

        public GetAreaElecConstituteResponseBodyData setZero(java.util.List<CarbonEmissionElecSummaryItem> zero) {
            this.zero = zero;
            return this;
        }
        public java.util.List<CarbonEmissionElecSummaryItem> getZero() {
            return this.zero;
        }

    }

}
