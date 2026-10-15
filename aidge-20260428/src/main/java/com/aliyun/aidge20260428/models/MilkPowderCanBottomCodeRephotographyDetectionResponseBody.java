// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class MilkPowderCanBottomCodeRephotographyDetectionResponseBody extends TeaModel {
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
    public MilkPowderCanBottomCodeRephotographyDetectionResponseBodyData data;

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
     * <p>Specifies whether the call is successful. A valid business conclusion does not mean that the review is passed.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static MilkPowderCanBottomCodeRephotographyDetectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MilkPowderCanBottomCodeRephotographyDetectionResponseBody self = new MilkPowderCanBottomCodeRephotographyDetectionResponseBody();
        return TeaModel.build(map, self);
    }

    public MilkPowderCanBottomCodeRephotographyDetectionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MilkPowderCanBottomCodeRephotographyDetectionResponseBody setData(MilkPowderCanBottomCodeRephotographyDetectionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MilkPowderCanBottomCodeRephotographyDetectionResponseBodyData getData() {
        return this.data;
    }

    public MilkPowderCanBottomCodeRephotographyDetectionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MilkPowderCanBottomCodeRephotographyDetectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MilkPowderCanBottomCodeRephotographyDetectionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class MilkPowderCanBottomCodeRephotographyDetectionResponseBodyDataResultGroundingRegions extends TeaModel {
        /**
         * <p>The bounding box coordinates in the format of <code>[top-left x, top-left y, bottom-right x, bottom-right y]</code>. Valid values: 0 to 1000. The left value must be less than the right value, and the top value must be less than the bottom value.</p>
         */
        @NameInMap("Bbox2d")
        public java.util.List<Float> bbox2d;

        /**
         * <p>The target category. For valid values, see the following table.</p>
         * 
         * <strong>example:</strong>
         * <p>milk_powder</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The confirmed short name or text of up to 24 characters. If the text is unclear, an empty string is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Milk powder</p>
         */
        @NameInMap("Text")
        public String text;

        public static MilkPowderCanBottomCodeRephotographyDetectionResponseBodyDataResultGroundingRegions build(java.util.Map<String, ?> map) throws Exception {
            MilkPowderCanBottomCodeRephotographyDetectionResponseBodyDataResultGroundingRegions self = new MilkPowderCanBottomCodeRephotographyDetectionResponseBodyDataResultGroundingRegions();
            return TeaModel.build(map, self);
        }

        public MilkPowderCanBottomCodeRephotographyDetectionResponseBodyDataResultGroundingRegions setBbox2d(java.util.List<Float> bbox2d) {
            this.bbox2d = bbox2d;
            return this;
        }
        public java.util.List<Float> getBbox2d() {
            return this.bbox2d;
        }

        public MilkPowderCanBottomCodeRephotographyDetectionResponseBodyDataResultGroundingRegions setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public MilkPowderCanBottomCodeRephotographyDetectionResponseBodyDataResultGroundingRegions setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class MilkPowderCanBottomCodeRephotographyDetectionResponseBodyDataResultGrounding extends TeaModel {
        /**
         * <p>The coverage. Valid values:</p>
         * <ul>
         * <li>complete: The relevant visible targets are complete.</li>
         * <li>partial: Only some targets are valid or recognizable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>complete</p>
         */
        @NameInMap("Coverage")
        public String coverage;

        /**
         * <p>The list of regions.</p>
         */
        @NameInMap("Regions")
        public java.util.List<MilkPowderCanBottomCodeRephotographyDetectionResponseBodyDataResultGroundingRegions> regions;

        public static MilkPowderCanBottomCodeRephotographyDetectionResponseBodyDataResultGrounding build(java.util.Map<String, ?> map) throws Exception {
            MilkPowderCanBottomCodeRephotographyDetectionResponseBodyDataResultGrounding self = new MilkPowderCanBottomCodeRephotographyDetectionResponseBodyDataResultGrounding();
            return TeaModel.build(map, self);
        }

        public MilkPowderCanBottomCodeRephotographyDetectionResponseBodyDataResultGrounding setCoverage(String coverage) {
            this.coverage = coverage;
            return this;
        }
        public String getCoverage() {
            return this.coverage;
        }

        public MilkPowderCanBottomCodeRephotographyDetectionResponseBodyDataResultGrounding setRegions(java.util.List<MilkPowderCanBottomCodeRephotographyDetectionResponseBodyDataResultGroundingRegions> regions) {
            this.regions = regions;
            return this;
        }
        public java.util.List<MilkPowderCanBottomCodeRephotographyDetectionResponseBodyDataResultGroundingRegions> getRegions() {
            return this.regions;
        }

    }

    public static class MilkPowderCanBottomCodeRephotographyDetectionResponseBodyDataResult extends TeaModel {
        /**
         * <p>The localization information.</p>
         */
        @NameInMap("Grounding")
        public MilkPowderCanBottomCodeRephotographyDetectionResponseBodyDataResultGrounding grounding;

        /**
         * <p>Specifies whether the image is recaptured.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsFake")
        public Boolean isFake;

        /**
         * <p>The detection type. The value is fixed to canBottom.</p>
         * 
         * <strong>example:</strong>
         * <p>canBottom</p>
         */
        @NameInMap("Type")
        public String type;

        public static MilkPowderCanBottomCodeRephotographyDetectionResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            MilkPowderCanBottomCodeRephotographyDetectionResponseBodyDataResult self = new MilkPowderCanBottomCodeRephotographyDetectionResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public MilkPowderCanBottomCodeRephotographyDetectionResponseBodyDataResult setGrounding(MilkPowderCanBottomCodeRephotographyDetectionResponseBodyDataResultGrounding grounding) {
            this.grounding = grounding;
            return this;
        }
        public MilkPowderCanBottomCodeRephotographyDetectionResponseBodyDataResultGrounding getGrounding() {
            return this.grounding;
        }

        public MilkPowderCanBottomCodeRephotographyDetectionResponseBodyDataResult setIsFake(Boolean isFake) {
            this.isFake = isFake;
            return this;
        }
        public Boolean getIsFake() {
            return this.isFake;
        }

        public MilkPowderCanBottomCodeRephotographyDetectionResponseBodyDataResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MilkPowderCanBottomCodeRephotographyDetectionResponseBodyData extends TeaModel {
        /**
         * <p>The details of the recapture detection result.</p>
         */
        @NameInMap("Result")
        public MilkPowderCanBottomCodeRephotographyDetectionResponseBodyDataResult result;

        /**
         * <p>The usage information. If the call is successful, the value is <code>{&quot;ProcessingCount&quot;:1}</code>. If the call fails, an empty object is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ProcessingCount&quot;:1}</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, Long> usageMap;

        public static MilkPowderCanBottomCodeRephotographyDetectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MilkPowderCanBottomCodeRephotographyDetectionResponseBodyData self = new MilkPowderCanBottomCodeRephotographyDetectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MilkPowderCanBottomCodeRephotographyDetectionResponseBodyData setResult(MilkPowderCanBottomCodeRephotographyDetectionResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public MilkPowderCanBottomCodeRephotographyDetectionResponseBodyDataResult getResult() {
            return this.result;
        }

        public MilkPowderCanBottomCodeRephotographyDetectionResponseBodyData setUsageMap(java.util.Map<String, Long> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

    }

}
