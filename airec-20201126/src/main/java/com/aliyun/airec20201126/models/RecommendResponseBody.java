// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class RecommendResponseBody extends TeaModel {
    /**
     * <p>This parameter may be used in the debugging process. You can ignore this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Queries the recommendation results of a specified instance.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;i2i_common_common;NotFound;1673254401;similar product/content of clicked ones;2023-01-09 16:53:21&quot;</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The weight of the specified process.</p>
     * 
     * <strong>example:</strong>
     * <p>04707E49-642A-4649-827A-F8EEB07D4C27</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The unique ID of the user.</p>
     */
    @NameInMap("result")
    public java.util.List<RecommendResponseBodyResult> result;

    public static RecommendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecommendResponseBody self = new RecommendResponseBody();
        return TeaModel.build(map, self);
    }

    public RecommendResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecommendResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecommendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecommendResponseBody setResult(java.util.List<RecommendResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<RecommendResponseBodyResult> getResult() {
        return this.result;
    }

    public static class RecommendResponseBodyResult extends TeaModel {
        /**
         * <p>The ID of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("flowWeight")
        public Double flowWeight;

        /**
         * <p>The returned results.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("itemId")
        public String itemId;

        /**
         * <p>The ID of the recommended item.</p>
         * 
         * <strong>example:</strong>
         * <p>item</p>
         */
        @NameInMap("itemType")
        public String itemType;

        /**
         * <p>N/A</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("matchInfo")
        public String matchInfo;

        /**
         * <p>The event tracking ID. This parameter is uploaded together with user behaviors on the recommended item. In this case, the value of this parameter is ali.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>The string for filtering during recommendation.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("position")
        public Integer position;

        /**
         * <p>The status of the execution.</p>
         * 
         * <strong>example:</strong>
         * <p>ali</p>
         */
        @NameInMap("traceId")
        public String traceId;

        /**
         * <p>Specifies whether to perform personalized ranking based on the user IDs in the filtering and ranking phases.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;1007.62381.131491.100200300000000:bcb946ed-3f09-4e9b-bf4a-c19862f42231:792783::0:s101:::15:content___130788_stall:item:i2i_common_common:0.0205279946753756:null:null:1673258031504::context__recall_index=156,context__hour=17,context__trigger_num=2::C7EF99C9-6C55-5D45-A8D5-0754082E9DCF:hot_common,i2i_common_common,i2i_swing_common,hot_full:::::&quot;</p>
         */
        @NameInMap("traceInfo")
        public String traceInfo;

        /**
         * <p>The weight of the recommended item.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("weight")
        public Float weight;

        public static RecommendResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            RecommendResponseBodyResult self = new RecommendResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public RecommendResponseBodyResult setFlowWeight(Double flowWeight) {
            this.flowWeight = flowWeight;
            return this;
        }
        public Double getFlowWeight() {
            return this.flowWeight;
        }

        public RecommendResponseBodyResult setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public RecommendResponseBodyResult setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public RecommendResponseBodyResult setMatchInfo(String matchInfo) {
            this.matchInfo = matchInfo;
            return this;
        }
        public String getMatchInfo() {
            return this.matchInfo;
        }

        public RecommendResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RecommendResponseBodyResult setPosition(Integer position) {
            this.position = position;
            return this;
        }
        public Integer getPosition() {
            return this.position;
        }

        public RecommendResponseBodyResult setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public RecommendResponseBodyResult setTraceInfo(String traceInfo) {
            this.traceInfo = traceInfo;
            return this;
        }
        public String getTraceInfo() {
            return this.traceInfo;
        }

        public RecommendResponseBodyResult setWeight(Float weight) {
            this.weight = weight;
            return this;
        }
        public Float getWeight() {
            return this.weight;
        }

    }

}
