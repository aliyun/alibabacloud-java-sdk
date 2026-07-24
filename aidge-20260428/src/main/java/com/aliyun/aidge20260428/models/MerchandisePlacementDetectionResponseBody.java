// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class MerchandisePlacementDetectionResponseBody extends TeaModel {
    /**
     * <p>The error code. This parameter is not returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The display detection result.</p>
     */
    @NameInMap("Data")
    public MerchandisePlacementDetectionResponseBodyData data;

    /**
     * <p>The error message. This parameter is not returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static MerchandisePlacementDetectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MerchandisePlacementDetectionResponseBody self = new MerchandisePlacementDetectionResponseBody();
        return TeaModel.build(map, self);
    }

    public MerchandisePlacementDetectionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MerchandisePlacementDetectionResponseBody setData(MerchandisePlacementDetectionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MerchandisePlacementDetectionResponseBodyData getData() {
        return this.data;
    }

    public MerchandisePlacementDetectionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MerchandisePlacementDetectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MerchandisePlacementDetectionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class MerchandisePlacementDetectionResponseBodyDataDataTop1 extends TeaModel {
        /**
         * <p>The similarity score, ranging from 0 to 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0.53</p>
         */
        @NameInMap("Score")
        public Float score;

        /**
         * <p>The ID of the recalled product.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("SkuId")
        public String skuId;

        /**
         * <p>The name of the recalled product.</p>
         * 
         * <strong>example:</strong>
         * <p>Bright Milk 500ml.</p>
         */
        @NameInMap("SkuName")
        public String skuName;

        public static MerchandisePlacementDetectionResponseBodyDataDataTop1 build(java.util.Map<String, ?> map) throws Exception {
            MerchandisePlacementDetectionResponseBodyDataDataTop1 self = new MerchandisePlacementDetectionResponseBodyDataDataTop1();
            return TeaModel.build(map, self);
        }

        public MerchandisePlacementDetectionResponseBodyDataDataTop1 setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public MerchandisePlacementDetectionResponseBodyDataDataTop1 setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

        public MerchandisePlacementDetectionResponseBodyDataDataTop1 setSkuName(String skuName) {
            this.skuName = skuName;
            return this;
        }
        public String getSkuName() {
            return this.skuName;
        }

    }

    public static class MerchandisePlacementDetectionResponseBodyDataDataTopk extends TeaModel {
        /**
         * <p>The recall rank.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Rank")
        public Integer rank;

        /**
         * <p>The similarity score, ranging from 0 to 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0.82</p>
         */
        @NameInMap("Score")
        public Float score;

        /**
         * <p>The ID of the recalled product.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("SkuId")
        public String skuId;

        /**
         * <p>The name of the recalled product.</p>
         * 
         * <strong>example:</strong>
         * <p>Bright Milk 500ml.</p>
         */
        @NameInMap("SkuName")
        public String skuName;

        public static MerchandisePlacementDetectionResponseBodyDataDataTopk build(java.util.Map<String, ?> map) throws Exception {
            MerchandisePlacementDetectionResponseBodyDataDataTopk self = new MerchandisePlacementDetectionResponseBodyDataDataTopk();
            return TeaModel.build(map, self);
        }

        public MerchandisePlacementDetectionResponseBodyDataDataTopk setRank(Integer rank) {
            this.rank = rank;
            return this;
        }
        public Integer getRank() {
            return this.rank;
        }

        public MerchandisePlacementDetectionResponseBodyDataDataTopk setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public MerchandisePlacementDetectionResponseBodyDataDataTopk setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

        public MerchandisePlacementDetectionResponseBodyDataDataTopk setSkuName(String skuName) {
            this.skuName = skuName;
            return this;
        }
        public String getSkuName() {
            return this.skuName;
        }

    }

    public static class MerchandisePlacementDetectionResponseBodyDataData extends TeaModel {
        /**
         * <p>The position coordinates of the detection box in the format [x1,y1,x2,y2].</p>
         */
        @NameInMap("Bbox")
        public java.util.List<Float> bbox;

        /**
         * <p>The failure reason for the detection box. The value is null if the detection is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;embedding failed&quot;</p>
         */
        @NameInMap("Error")
        public String error;

        /**
         * <p>The index of the detection box.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Idx")
        public Integer idx;

        /**
         * <p>The top-1 recalled product for the detection box.</p>
         */
        @NameInMap("Top1")
        public MerchandisePlacementDetectionResponseBodyDataDataTop1 top1;

        /**
         * <p>The list of top-K recalled products for the detection box.</p>
         */
        @NameInMap("Topk")
        public java.util.List<MerchandisePlacementDetectionResponseBodyDataDataTopk> topk;

        public static MerchandisePlacementDetectionResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            MerchandisePlacementDetectionResponseBodyDataData self = new MerchandisePlacementDetectionResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public MerchandisePlacementDetectionResponseBodyDataData setBbox(java.util.List<Float> bbox) {
            this.bbox = bbox;
            return this;
        }
        public java.util.List<Float> getBbox() {
            return this.bbox;
        }

        public MerchandisePlacementDetectionResponseBodyDataData setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public MerchandisePlacementDetectionResponseBodyDataData setIdx(Integer idx) {
            this.idx = idx;
            return this;
        }
        public Integer getIdx() {
            return this.idx;
        }

        public MerchandisePlacementDetectionResponseBodyDataData setTop1(MerchandisePlacementDetectionResponseBodyDataDataTop1 top1) {
            this.top1 = top1;
            return this;
        }
        public MerchandisePlacementDetectionResponseBodyDataDataTop1 getTop1() {
            return this.top1;
        }

        public MerchandisePlacementDetectionResponseBodyDataData setTopk(java.util.List<MerchandisePlacementDetectionResponseBodyDataDataTopk> topk) {
            this.topk = topk;
            return this;
        }
        public java.util.List<MerchandisePlacementDetectionResponseBodyDataDataTopk> getTopk() {
            return this.topk;
        }

    }

    public static class MerchandisePlacementDetectionResponseBodyData extends TeaModel {
        /**
         * <p>The number of valid detection boxes.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("BoxCount")
        public Integer boxCount;

        /**
         * <p>The list of retrieval details for each detection box.</p>
         */
        @NameInMap("Data")
        public java.util.List<MerchandisePlacementDetectionResponseBodyDataData> data;

        /**
         * <p>The usage information. The key is the usage metric name, and the value is the count.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ProcessingCount&quot;:1}</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, Long> usageMap;

        public static MerchandisePlacementDetectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MerchandisePlacementDetectionResponseBodyData self = new MerchandisePlacementDetectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MerchandisePlacementDetectionResponseBodyData setBoxCount(Integer boxCount) {
            this.boxCount = boxCount;
            return this;
        }
        public Integer getBoxCount() {
            return this.boxCount;
        }

        public MerchandisePlacementDetectionResponseBodyData setData(java.util.List<MerchandisePlacementDetectionResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<MerchandisePlacementDetectionResponseBodyDataData> getData() {
            return this.data;
        }

        public MerchandisePlacementDetectionResponseBodyData setUsageMap(java.util.Map<String, Long> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

    }

}
