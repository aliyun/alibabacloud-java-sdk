// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class MilkPowderCartonCodeRephotographyDetectionResponseBody extends TeaModel {
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
    public MilkPowderCartonCodeRephotographyDetectionResponseBodyData data;

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

    public static MilkPowderCartonCodeRephotographyDetectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MilkPowderCartonCodeRephotographyDetectionResponseBody self = new MilkPowderCartonCodeRephotographyDetectionResponseBody();
        return TeaModel.build(map, self);
    }

    public MilkPowderCartonCodeRephotographyDetectionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MilkPowderCartonCodeRephotographyDetectionResponseBody setData(MilkPowderCartonCodeRephotographyDetectionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MilkPowderCartonCodeRephotographyDetectionResponseBodyData getData() {
        return this.data;
    }

    public MilkPowderCartonCodeRephotographyDetectionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MilkPowderCartonCodeRephotographyDetectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MilkPowderCartonCodeRephotographyDetectionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class MilkPowderCartonCodeRephotographyDetectionResponseBodyDataResultGroundingRegions extends TeaModel {
        /**
         * <p>The coordinates of the bounding box in the <code>[top-left x, top-left y, bottom-right x, bottom-right y]</code> format. The value range is 0 to 1000. The left value must be less than the right value, and the top value must be less than the bottom value.</p>
         */
        @NameInMap("Bbox2d")
        public java.util.List<Float> bbox2d;

        /**
         * <p>The category of the target. For enumerated values, see the following table.</p>
         * 
         * <strong>example:</strong>
         * <p>milk_powder</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The confirmed short name or text, which contains up to 24 characters. This field is an empty string if the text is unclear.</p>
         * 
         * <strong>example:</strong>
         * <p>Milk powder</p>
         */
        @NameInMap("Text")
        public String text;

        public static MilkPowderCartonCodeRephotographyDetectionResponseBodyDataResultGroundingRegions build(java.util.Map<String, ?> map) throws Exception {
            MilkPowderCartonCodeRephotographyDetectionResponseBodyDataResultGroundingRegions self = new MilkPowderCartonCodeRephotographyDetectionResponseBodyDataResultGroundingRegions();
            return TeaModel.build(map, self);
        }

        public MilkPowderCartonCodeRephotographyDetectionResponseBodyDataResultGroundingRegions setBbox2d(java.util.List<Float> bbox2d) {
            this.bbox2d = bbox2d;
            return this;
        }
        public java.util.List<Float> getBbox2d() {
            return this.bbox2d;
        }

        public MilkPowderCartonCodeRephotographyDetectionResponseBodyDataResultGroundingRegions setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public MilkPowderCartonCodeRephotographyDetectionResponseBodyDataResultGroundingRegions setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class MilkPowderCartonCodeRephotographyDetectionResponseBodyDataResultGrounding extends TeaModel {
        /**
         * <p>The coverage of the grounding. Valid values:</p>
         * <ul>
         * <li><code>complete</code>: The relevant visible targets are complete.</li>
         * <li><code>partial</code>: Only some targets are valid or recognizable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>complete</p>
         */
        @NameInMap("Coverage")
        public String coverage;

        /**
         * <p>The array of targets, which contains up to 12 items. This array can be empty if no relevant targets are found.</p>
         */
        @NameInMap("Regions")
        public java.util.List<MilkPowderCartonCodeRephotographyDetectionResponseBodyDataResultGroundingRegions> regions;

        public static MilkPowderCartonCodeRephotographyDetectionResponseBodyDataResultGrounding build(java.util.Map<String, ?> map) throws Exception {
            MilkPowderCartonCodeRephotographyDetectionResponseBodyDataResultGrounding self = new MilkPowderCartonCodeRephotographyDetectionResponseBodyDataResultGrounding();
            return TeaModel.build(map, self);
        }

        public MilkPowderCartonCodeRephotographyDetectionResponseBodyDataResultGrounding setCoverage(String coverage) {
            this.coverage = coverage;
            return this;
        }
        public String getCoverage() {
            return this.coverage;
        }

        public MilkPowderCartonCodeRephotographyDetectionResponseBodyDataResultGrounding setRegions(java.util.List<MilkPowderCartonCodeRephotographyDetectionResponseBodyDataResultGroundingRegions> regions) {
            this.regions = regions;
            return this;
        }
        public java.util.List<MilkPowderCartonCodeRephotographyDetectionResponseBodyDataResultGroundingRegions> getRegions() {
            return this.regions;
        }

    }

    public static class MilkPowderCartonCodeRephotographyDetectionResponseBodyDataResult extends TeaModel {
        /**
         * <p>The supplementary element grounding results.</p>
         */
        @NameInMap("Grounding")
        public MilkPowderCartonCodeRephotographyDetectionResponseBodyDataResultGrounding grounding;

        /**
         * <p>Indicates whether the image is recaptured.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsFake")
        public Boolean isFake;

        /**
         * <p>Indicates whether the image is suspected to be recaptured.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsSuspect")
        public Boolean isSuspect;

        /**
         * <p>The recapture status. Valid values:</p>
         * <ul>
         * <li><code>0</code>: Non-recapture.</li>
         * <li><code>1</code>: Recapture.</li>
         * <li><code>2</code>: Suspected recapture.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PhotoStatus")
        public Integer photoStatus;

        /**
         * <p>The confidence score for recapture detection.</p>
         * 
         * <strong>example:</strong>
         * <p>0.89</p>
         */
        @NameInMap("Score")
        public Float score;

        /**
         * <p>The detection type. The value is fixed to <code>boxCode</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>boxCode</p>
         */
        @NameInMap("Type")
        public String type;

        public static MilkPowderCartonCodeRephotographyDetectionResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            MilkPowderCartonCodeRephotographyDetectionResponseBodyDataResult self = new MilkPowderCartonCodeRephotographyDetectionResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public MilkPowderCartonCodeRephotographyDetectionResponseBodyDataResult setGrounding(MilkPowderCartonCodeRephotographyDetectionResponseBodyDataResultGrounding grounding) {
            this.grounding = grounding;
            return this;
        }
        public MilkPowderCartonCodeRephotographyDetectionResponseBodyDataResultGrounding getGrounding() {
            return this.grounding;
        }

        public MilkPowderCartonCodeRephotographyDetectionResponseBodyDataResult setIsFake(Boolean isFake) {
            this.isFake = isFake;
            return this;
        }
        public Boolean getIsFake() {
            return this.isFake;
        }

        public MilkPowderCartonCodeRephotographyDetectionResponseBodyDataResult setIsSuspect(Boolean isSuspect) {
            this.isSuspect = isSuspect;
            return this;
        }
        public Boolean getIsSuspect() {
            return this.isSuspect;
        }

        public MilkPowderCartonCodeRephotographyDetectionResponseBodyDataResult setPhotoStatus(Integer photoStatus) {
            this.photoStatus = photoStatus;
            return this;
        }
        public Integer getPhotoStatus() {
            return this.photoStatus;
        }

        public MilkPowderCartonCodeRephotographyDetectionResponseBodyDataResult setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public MilkPowderCartonCodeRephotographyDetectionResponseBodyDataResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MilkPowderCartonCodeRephotographyDetectionResponseBodyData extends TeaModel {
        /**
         * <p>The details of the recapture detection result.</p>
         */
        @NameInMap("Result")
        public MilkPowderCartonCodeRephotographyDetectionResponseBodyDataResult result;

        /**
         * <p>The usage information. The value is <code>{&quot;ProcessingCount&quot;:1}</code> if the call is successful, or an empty object if the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ProcessingCount&quot;:1}</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, Long> usageMap;

        public static MilkPowderCartonCodeRephotographyDetectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MilkPowderCartonCodeRephotographyDetectionResponseBodyData self = new MilkPowderCartonCodeRephotographyDetectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MilkPowderCartonCodeRephotographyDetectionResponseBodyData setResult(MilkPowderCartonCodeRephotographyDetectionResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public MilkPowderCartonCodeRephotographyDetectionResponseBodyDataResult getResult() {
            return this.result;
        }

        public MilkPowderCartonCodeRephotographyDetectionResponseBodyData setUsageMap(java.util.Map<String, Long> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

    }

}
