// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetGasConstituteResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("data")
    public java.util.List<GetGasConstituteResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>83A5A7DD-8974-5769-952E-590A97BEA34E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetGasConstituteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGasConstituteResponseBody self = new GetGasConstituteResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGasConstituteResponseBody setData(java.util.List<GetGasConstituteResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetGasConstituteResponseBodyData> getData() {
        return this.data;
    }

    public GetGasConstituteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetGasConstituteResponseBodyData extends TeaModel {
        /**
         * <p>Carbon emissions</p>
         * 
         * <strong>example:</strong>
         * <p>3.14</p>
         */
        @NameInMap("carbonEmissionData")
        public Double carbonEmissionData;

        /**
         * <p>Gas emissions</p>
         * 
         * <strong>example:</strong>
         * <p>3.14</p>
         */
        @NameInMap("gasEmissionData")
        public Double gasEmissionData;

        /**
         * <p>Name of gas</p>
         * 
         * <strong>example:</strong>
         * <p>CO₂</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Proportion of carbon emissions. Example value: 0.5 (50%)</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("ratio")
        public Double ratio;

        /**
         * <p>Gas Type</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("type")
        public Integer type;

        public static GetGasConstituteResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGasConstituteResponseBodyData self = new GetGasConstituteResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGasConstituteResponseBodyData setCarbonEmissionData(Double carbonEmissionData) {
            this.carbonEmissionData = carbonEmissionData;
            return this;
        }
        public Double getCarbonEmissionData() {
            return this.carbonEmissionData;
        }

        public GetGasConstituteResponseBodyData setGasEmissionData(Double gasEmissionData) {
            this.gasEmissionData = gasEmissionData;
            return this;
        }
        public Double getGasEmissionData() {
            return this.gasEmissionData;
        }

        public GetGasConstituteResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGasConstituteResponseBodyData setRatio(Double ratio) {
            this.ratio = ratio;
            return this;
        }
        public Double getRatio() {
            return this.ratio;
        }

        public GetGasConstituteResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
