// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class MerchandisePlacementDetectionProResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The detection result of product display detection Pro.</p>
     */
    @NameInMap("Data")
    public MerchandisePlacementDetectionProResponseBodyData data;

    /**
     * <p>The response message or failure description.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>70CBEFDF-BB17-1EB3-8A21-569F3124738F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static MerchandisePlacementDetectionProResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MerchandisePlacementDetectionProResponseBody self = new MerchandisePlacementDetectionProResponseBody();
        return TeaModel.build(map, self);
    }

    public MerchandisePlacementDetectionProResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MerchandisePlacementDetectionProResponseBody setData(MerchandisePlacementDetectionProResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MerchandisePlacementDetectionProResponseBodyData getData() {
        return this.data;
    }

    public MerchandisePlacementDetectionProResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MerchandisePlacementDetectionProResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MerchandisePlacementDetectionProResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class MerchandisePlacementDetectionProResponseBodyDataData extends TeaModel {
        /**
         * <p>The normalized bounding box coordinates [x1,y1,x2,y2], with values in the range 0–1000.</p>
         */
        @NameInMap("Bbox2d")
        public java.util.List<Integer> bbox2d;

        /**
         * <p>The detected product name. The value is unknown if the name cannot be determined.</p>
         * 
         * <strong>example:</strong>
         * <p>unknown</p>
         */
        @NameInMap("DetectedSkuName")
        public String detectedSkuName;

        /**
         * <p>The bounding box index, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Idx")
        public Integer idx;

        public static MerchandisePlacementDetectionProResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            MerchandisePlacementDetectionProResponseBodyDataData self = new MerchandisePlacementDetectionProResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public MerchandisePlacementDetectionProResponseBodyDataData setBbox2d(java.util.List<Integer> bbox2d) {
            this.bbox2d = bbox2d;
            return this;
        }
        public java.util.List<Integer> getBbox2d() {
            return this.bbox2d;
        }

        public MerchandisePlacementDetectionProResponseBodyDataData setDetectedSkuName(String detectedSkuName) {
            this.detectedSkuName = detectedSkuName;
            return this;
        }
        public String getDetectedSkuName() {
            return this.detectedSkuName;
        }

        public MerchandisePlacementDetectionProResponseBodyDataData setIdx(Integer idx) {
            this.idx = idx;
            return this;
        }
        public Integer getIdx() {
            return this.idx;
        }

    }

    public static class MerchandisePlacementDetectionProResponseBodyData extends TeaModel {
        /**
         * <p>The number of valid bounding boxes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("BoxCount")
        public Integer boxCount;

        /**
         * <p>The list of per-box detection details.</p>
         */
        @NameInMap("Data")
        public java.util.List<MerchandisePlacementDetectionProResponseBodyDataData> data;

        /**
         * <p>The usage information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ProcessingCount&quot;:1}</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, Long> usageMap;

        public static MerchandisePlacementDetectionProResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MerchandisePlacementDetectionProResponseBodyData self = new MerchandisePlacementDetectionProResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MerchandisePlacementDetectionProResponseBodyData setBoxCount(Integer boxCount) {
            this.boxCount = boxCount;
            return this;
        }
        public Integer getBoxCount() {
            return this.boxCount;
        }

        public MerchandisePlacementDetectionProResponseBodyData setData(java.util.List<MerchandisePlacementDetectionProResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<MerchandisePlacementDetectionProResponseBodyDataData> getData() {
            return this.data;
        }

        public MerchandisePlacementDetectionProResponseBodyData setUsageMap(java.util.Map<String, Long> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

    }

}
