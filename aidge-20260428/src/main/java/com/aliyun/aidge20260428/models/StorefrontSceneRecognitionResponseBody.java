// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class StorefrontSceneRecognitionResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The scene recognition result.</p>
     */
    @NameInMap("Data")
    public StorefrontSceneRecognitionResponseBodyData data;

    /**
     * <p>The returned message or failure description.</p>
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

    public static StorefrontSceneRecognitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StorefrontSceneRecognitionResponseBody self = new StorefrontSceneRecognitionResponseBody();
        return TeaModel.build(map, self);
    }

    public StorefrontSceneRecognitionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StorefrontSceneRecognitionResponseBody setData(StorefrontSceneRecognitionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StorefrontSceneRecognitionResponseBodyData getData() {
        return this.data;
    }

    public StorefrontSceneRecognitionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StorefrontSceneRecognitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StorefrontSceneRecognitionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class StorefrontSceneRecognitionResponseBodyDataResultDetails extends TeaModel {
        /**
         * <p>The non-empty category name.</p>
         * 
         * <strong>example:</strong>
         * <p>oppo vivo smartphone specialty store</p>
         */
        @NameInMap("Clazz")
        public String clazz;

        /**
         * <p>A finite numerical value. The source document does not specify a value range.</p>
         * 
         * <strong>example:</strong>
         * <p>0.99</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        public static StorefrontSceneRecognitionResponseBodyDataResultDetails build(java.util.Map<String, ?> map) throws Exception {
            StorefrontSceneRecognitionResponseBodyDataResultDetails self = new StorefrontSceneRecognitionResponseBodyDataResultDetails();
            return TeaModel.build(map, self);
        }

        public StorefrontSceneRecognitionResponseBodyDataResultDetails setClazz(String clazz) {
            this.clazz = clazz;
            return this;
        }
        public String getClazz() {
            return this.clazz;
        }

        public StorefrontSceneRecognitionResponseBodyDataResultDetails setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

    }

    public static class StorefrontSceneRecognitionResponseBodyDataResultGroundingRegions extends TeaModel {
        /**
         * <p>The bounding box coordinates.</p>
         */
        @NameInMap("Bbox2d")
        public java.util.List<Float> bbox2d;

        /**
         * <p>The label.</p>
         * 
         * <strong>example:</strong>
         * <p>store_sign</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The recognized text.</p>
         * 
         * <strong>example:</strong>
         * <p>oppo</p>
         */
        @NameInMap("Text")
        public String text;

        public static StorefrontSceneRecognitionResponseBodyDataResultGroundingRegions build(java.util.Map<String, ?> map) throws Exception {
            StorefrontSceneRecognitionResponseBodyDataResultGroundingRegions self = new StorefrontSceneRecognitionResponseBodyDataResultGroundingRegions();
            return TeaModel.build(map, self);
        }

        public StorefrontSceneRecognitionResponseBodyDataResultGroundingRegions setBbox2d(java.util.List<Float> bbox2d) {
            this.bbox2d = bbox2d;
            return this;
        }
        public java.util.List<Float> getBbox2d() {
            return this.bbox2d;
        }

        public StorefrontSceneRecognitionResponseBodyDataResultGroundingRegions setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public StorefrontSceneRecognitionResponseBodyDataResultGroundingRegions setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class StorefrontSceneRecognitionResponseBodyDataResultGrounding extends TeaModel {
        /**
         * <p>The coverage.</p>
         * 
         * <strong>example:</strong>
         * <p>partial</p>
         */
        @NameInMap("Coverage")
        public String coverage;

        /**
         * <p>The region list.</p>
         */
        @NameInMap("Regions")
        public java.util.List<StorefrontSceneRecognitionResponseBodyDataResultGroundingRegions> regions;

        public static StorefrontSceneRecognitionResponseBodyDataResultGrounding build(java.util.Map<String, ?> map) throws Exception {
            StorefrontSceneRecognitionResponseBodyDataResultGrounding self = new StorefrontSceneRecognitionResponseBodyDataResultGrounding();
            return TeaModel.build(map, self);
        }

        public StorefrontSceneRecognitionResponseBodyDataResultGrounding setCoverage(String coverage) {
            this.coverage = coverage;
            return this;
        }
        public String getCoverage() {
            return this.coverage;
        }

        public StorefrontSceneRecognitionResponseBodyDataResultGrounding setRegions(java.util.List<StorefrontSceneRecognitionResponseBodyDataResultGroundingRegions> regions) {
            this.regions = regions;
            return this;
        }
        public java.util.List<StorefrontSceneRecognitionResponseBodyDataResultGroundingRegions> getRegions() {
            return this.regions;
        }

    }

    public static class StorefrontSceneRecognitionResponseBodyDataResult extends TeaModel {
        /**
         * <p>The classification details. This can be an empty array.</p>
         */
        @NameInMap("Details")
        public java.util.List<StorefrontSceneRecognitionResponseBodyDataResultDetails> details;

        /**
         * <p>The localization information.</p>
         */
        @NameInMap("Grounding")
        public StorefrontSceneRecognitionResponseBodyDataResultGrounding grounding;

        /**
         * <p>The non-empty scene classification array.</p>
         */
        @NameInMap("Scenes")
        public java.util.List<String> scenes;

        public static StorefrontSceneRecognitionResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            StorefrontSceneRecognitionResponseBodyDataResult self = new StorefrontSceneRecognitionResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public StorefrontSceneRecognitionResponseBodyDataResult setDetails(java.util.List<StorefrontSceneRecognitionResponseBodyDataResultDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<StorefrontSceneRecognitionResponseBodyDataResultDetails> getDetails() {
            return this.details;
        }

        public StorefrontSceneRecognitionResponseBodyDataResult setGrounding(StorefrontSceneRecognitionResponseBodyDataResultGrounding grounding) {
            this.grounding = grounding;
            return this;
        }
        public StorefrontSceneRecognitionResponseBodyDataResultGrounding getGrounding() {
            return this.grounding;
        }

        public StorefrontSceneRecognitionResponseBodyDataResult setScenes(java.util.List<String> scenes) {
            this.scenes = scenes;
            return this;
        }
        public java.util.List<String> getScenes() {
            return this.scenes;
        }

    }

    public static class StorefrontSceneRecognitionResponseBodyData extends TeaModel {
        /**
         * <p>The scene recognition result details.</p>
         */
        @NameInMap("Result")
        public StorefrontSceneRecognitionResponseBodyDataResult result;

        /**
         * <p>The usage information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ProcessingCount&quot;:1}</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, Long> usageMap;

        public static StorefrontSceneRecognitionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StorefrontSceneRecognitionResponseBodyData self = new StorefrontSceneRecognitionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StorefrontSceneRecognitionResponseBodyData setResult(StorefrontSceneRecognitionResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public StorefrontSceneRecognitionResponseBodyDataResult getResult() {
            return this.result;
        }

        public StorefrontSceneRecognitionResponseBodyData setUsageMap(java.util.Map<String, Long> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

    }

}
