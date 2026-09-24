// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class GeneralRephotographyDetectionResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The recapture detection result.</p>
     */
    @NameInMap("Data")
    public GeneralRephotographyDetectionResponseBodyData data;

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

    public static GeneralRephotographyDetectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GeneralRephotographyDetectionResponseBody self = new GeneralRephotographyDetectionResponseBody();
        return TeaModel.build(map, self);
    }

    public GeneralRephotographyDetectionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GeneralRephotographyDetectionResponseBody setData(GeneralRephotographyDetectionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GeneralRephotographyDetectionResponseBodyData getData() {
        return this.data;
    }

    public GeneralRephotographyDetectionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GeneralRephotographyDetectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GeneralRephotographyDetectionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GeneralRephotographyDetectionResponseBodyDataResultGroundingRegions extends TeaModel {
        /**
         * <p>The bounding box coordinates.</p>
         */
        @NameInMap("Bbox2d")
        public java.util.List<Float> bbox2d;

        /**
         * <p>The target category. For valid values, see the table below.</p>
         * 
         * <strong>example:</strong>
         * <p>product</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The confirmed short name or text of up to 24 characters. This value is an empty string if the text is unreadable.</p>
         * 
         * <strong>example:</strong>
         * <p>Product</p>
         */
        @NameInMap("Text")
        public String text;

        public static GeneralRephotographyDetectionResponseBodyDataResultGroundingRegions build(java.util.Map<String, ?> map) throws Exception {
            GeneralRephotographyDetectionResponseBodyDataResultGroundingRegions self = new GeneralRephotographyDetectionResponseBodyDataResultGroundingRegions();
            return TeaModel.build(map, self);
        }

        public GeneralRephotographyDetectionResponseBodyDataResultGroundingRegions setBbox2d(java.util.List<Float> bbox2d) {
            this.bbox2d = bbox2d;
            return this;
        }
        public java.util.List<Float> getBbox2d() {
            return this.bbox2d;
        }

        public GeneralRephotographyDetectionResponseBodyDataResultGroundingRegions setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GeneralRephotographyDetectionResponseBodyDataResultGroundingRegions setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class GeneralRephotographyDetectionResponseBodyDataResultGrounding extends TeaModel {
        /**
         * <p>The coverage of the localization. Valid values:</p>
         * <ul>
         * <li>complete: All relevant visible targets are fully covered.</li>
         * <li>partial: Only some targets are valid or recognizable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>complete</p>
         */
        @NameInMap("Coverage")
        public String coverage;

        /**
         * <p>The array of targets. A maximum of 12 items are returned. This value can be empty if no relevant targets exist.</p>
         */
        @NameInMap("Regions")
        public java.util.List<GeneralRephotographyDetectionResponseBodyDataResultGroundingRegions> regions;

        public static GeneralRephotographyDetectionResponseBodyDataResultGrounding build(java.util.Map<String, ?> map) throws Exception {
            GeneralRephotographyDetectionResponseBodyDataResultGrounding self = new GeneralRephotographyDetectionResponseBodyDataResultGrounding();
            return TeaModel.build(map, self);
        }

        public GeneralRephotographyDetectionResponseBodyDataResultGrounding setCoverage(String coverage) {
            this.coverage = coverage;
            return this;
        }
        public String getCoverage() {
            return this.coverage;
        }

        public GeneralRephotographyDetectionResponseBodyDataResultGrounding setRegions(java.util.List<GeneralRephotographyDetectionResponseBodyDataResultGroundingRegions> regions) {
            this.regions = regions;
            return this;
        }
        public java.util.List<GeneralRephotographyDetectionResponseBodyDataResultGroundingRegions> getRegions() {
            return this.regions;
        }

    }

    public static class GeneralRephotographyDetectionResponseBodyDataResult extends TeaModel {
        /**
         * <p>The supplementary element localization result.</p>
         */
        @NameInMap("Grounding")
        public GeneralRephotographyDetectionResponseBodyDataResultGrounding grounding;

        /**
         * <p>Indicates whether the image is a recaptured photo.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsFake")
        public Boolean isFake;

        /**
         * <p>The detection type. The value is fixed as general.</p>
         * 
         * <strong>example:</strong>
         * <p>general</p>
         */
        @NameInMap("Type")
        public String type;

        public static GeneralRephotographyDetectionResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            GeneralRephotographyDetectionResponseBodyDataResult self = new GeneralRephotographyDetectionResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public GeneralRephotographyDetectionResponseBodyDataResult setGrounding(GeneralRephotographyDetectionResponseBodyDataResultGrounding grounding) {
            this.grounding = grounding;
            return this;
        }
        public GeneralRephotographyDetectionResponseBodyDataResultGrounding getGrounding() {
            return this.grounding;
        }

        public GeneralRephotographyDetectionResponseBodyDataResult setIsFake(Boolean isFake) {
            this.isFake = isFake;
            return this;
        }
        public Boolean getIsFake() {
            return this.isFake;
        }

        public GeneralRephotographyDetectionResponseBodyDataResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GeneralRephotographyDetectionResponseBodyData extends TeaModel {
        /**
         * <p>The business result. This value is an empty object if the request fails.</p>
         */
        @NameInMap("Result")
        public GeneralRephotographyDetectionResponseBodyDataResult result;

        /**
         * <p>The usage information. The value is <code>{&quot;ProcessingCount&quot;:1}</code> on success, or an empty object on failure.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ProcessingCount&quot;:1}</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, Long> usageMap;

        public static GeneralRephotographyDetectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GeneralRephotographyDetectionResponseBodyData self = new GeneralRephotographyDetectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GeneralRephotographyDetectionResponseBodyData setResult(GeneralRephotographyDetectionResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public GeneralRephotographyDetectionResponseBodyDataResult getResult() {
            return this.result;
        }

        public GeneralRephotographyDetectionResponseBodyData setUsageMap(java.util.Map<String, Long> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

    }

}
