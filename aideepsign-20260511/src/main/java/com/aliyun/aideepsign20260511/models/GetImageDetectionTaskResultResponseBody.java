// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class GetImageDetectionTaskResultResponseBody extends TeaModel {
    /**
     * <p>The business error code. The value &quot;OK&quot; is returned when the request succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The detection mode that was actually executed. Valid values:</p>
     * <ul>
     * <li>aigc: AIGC only.</li>
     * <li>tamper: tamper detection.</li>
     * </ul>
     * <p>This field is returned only when Status is succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>tamper</p>
     */
    @NameInMap("DetectMode")
    public String detectMode;

    /**
     * <p>The HTTP status code. The value 200 is returned when the request succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The list of detection result labels. This field is returned only when Status is succeeded and AIGC detection is included. The label values and confidence ranges vary depending on DetectMode. In aigc mode, AIGC generation identification labels are returned (see the table below). In tamper mode, aigc/aips labels are returned (confidence range: 0 to 1).</p>
     */
    @NameInMap("Labels")
    public java.util.List<GetImageDetectionTaskResultResponseBodyLabels> labels;

    /**
     * <p>The additional information. The value &quot;success&quot; is returned when the request succeeds. The error message is returned when the task fails. This field is returned only when Status is failed.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-7890-ABCD-EF1234567890</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li>pending: waiting.</li>
     * <li>running: in progress.</li>
     * <li>succeeded: completed.</li>
     * <li>failed: failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>succeeded</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The tamper detection result.</p>
     */
    @NameInMap("Tamper")
    public GetImageDetectionTaskResultResponseBodyTamper tamper;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>f47ac10b-58cc-4372-a567-0e02b2c3d479</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetImageDetectionTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageDetectionTaskResultResponseBody self = new GetImageDetectionTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageDetectionTaskResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetImageDetectionTaskResultResponseBody setDetectMode(String detectMode) {
        this.detectMode = detectMode;
        return this;
    }
    public String getDetectMode() {
        return this.detectMode;
    }

    public GetImageDetectionTaskResultResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetImageDetectionTaskResultResponseBody setLabels(java.util.List<GetImageDetectionTaskResultResponseBodyLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<GetImageDetectionTaskResultResponseBodyLabels> getLabels() {
        return this.labels;
    }

    public GetImageDetectionTaskResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetImageDetectionTaskResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetImageDetectionTaskResultResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetImageDetectionTaskResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetImageDetectionTaskResultResponseBody setTamper(GetImageDetectionTaskResultResponseBodyTamper tamper) {
        this.tamper = tamper;
        return this;
    }
    public GetImageDetectionTaskResultResponseBodyTamper getTamper() {
        return this.tamper;
    }

    public GetImageDetectionTaskResultResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class GetImageDetectionTaskResultResponseBodyLabels extends TeaModel {
        /**
         * <p>The confidence level. Value range: 0 to 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9562</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <p>The detection label. When DetectMode is aigc, valid values are: risk_aigc (the image is suspected to be AIGC-generated), risk_fake (the image is suspected to be a composite image), risk_edit (the image is suspected to be AI-edited). When DetectMode is tamper, valid values are: aigc (AIGC detection score), aips (AI post-processing detection score).</p>
         * 
         * <strong>example:</strong>
         * <p>risk_aigc</p>
         */
        @NameInMap("Label")
        public String label;

        public static GetImageDetectionTaskResultResponseBodyLabels build(java.util.Map<String, ?> map) throws Exception {
            GetImageDetectionTaskResultResponseBodyLabels self = new GetImageDetectionTaskResultResponseBodyLabels();
            return TeaModel.build(map, self);
        }

        public GetImageDetectionTaskResultResponseBodyLabels setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public GetImageDetectionTaskResultResponseBodyLabels setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class GetImageDetectionTaskResultResponseBodyTamperBaseResultsAigc extends TeaModel {
        /**
         * <p>The AIGC detection result description.</p>
         * 
         * <strong>example:</strong>
         * <p>Suspected AI-generated image</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>The AIGC dimension risk label.</p>
         * 
         * <strong>example:</strong>
         * <p>高风险</p>
         */
        @NameInMap("Risk")
        public String risk;

        /**
         * <p>The AIGC detection score. Value range: 0 to 1. A higher value indicates a greater likelihood of AI generation.</p>
         * 
         * <strong>example:</strong>
         * <p>0.47</p>
         */
        @NameInMap("Score")
        public Float score;

        public static GetImageDetectionTaskResultResponseBodyTamperBaseResultsAigc build(java.util.Map<String, ?> map) throws Exception {
            GetImageDetectionTaskResultResponseBodyTamperBaseResultsAigc self = new GetImageDetectionTaskResultResponseBodyTamperBaseResultsAigc();
            return TeaModel.build(map, self);
        }

        public GetImageDetectionTaskResultResponseBodyTamperBaseResultsAigc setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetImageDetectionTaskResultResponseBodyTamperBaseResultsAigc setRisk(String risk) {
            this.risk = risk;
            return this;
        }
        public String getRisk() {
            return this.risk;
        }

        public GetImageDetectionTaskResultResponseBodyTamperBaseResultsAigc setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class GetImageDetectionTaskResultResponseBodyTamperBaseResultsAips extends TeaModel {
        /**
         * <p>The AI post-processing detection result description.</p>
         * 
         * <strong>example:</strong>
         * <p>No AI post-processing traces detected</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>The local PS/AI editing dimension risk label.</p>
         * 
         * <strong>example:</strong>
         * <p>高风险</p>
         */
        @NameInMap("Risk")
        public String risk;

        /**
         * <p>The AI post-processing detection score. Value range: 0 to 1. A higher value indicates a greater likelihood of AI post-processing.</p>
         * 
         * <strong>example:</strong>
         * <p>0.12</p>
         */
        @NameInMap("Score")
        public Float score;

        public static GetImageDetectionTaskResultResponseBodyTamperBaseResultsAips build(java.util.Map<String, ?> map) throws Exception {
            GetImageDetectionTaskResultResponseBodyTamperBaseResultsAips self = new GetImageDetectionTaskResultResponseBodyTamperBaseResultsAips();
            return TeaModel.build(map, self);
        }

        public GetImageDetectionTaskResultResponseBodyTamperBaseResultsAips setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetImageDetectionTaskResultResponseBodyTamperBaseResultsAips setRisk(String risk) {
            this.risk = risk;
            return this;
        }
        public String getRisk() {
            return this.risk;
        }

        public GetImageDetectionTaskResultResponseBodyTamperBaseResultsAips setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class GetImageDetectionTaskResultResponseBodyTamperBaseResultsPsLocItems extends TeaModel {
        /**
         * <p>The bounding box coordinates of the tampered region, in the format <code>[x1, y1, x2, y2]</code>.</p>
         */
        @NameInMap("Bbox")
        public java.util.List<Float> bbox;

        /**
         * <p>The tamper confidence of the region. Value range: 0 to 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0.67</p>
         */
        @NameInMap("Score")
        public Float score;

        public static GetImageDetectionTaskResultResponseBodyTamperBaseResultsPsLocItems build(java.util.Map<String, ?> map) throws Exception {
            GetImageDetectionTaskResultResponseBodyTamperBaseResultsPsLocItems self = new GetImageDetectionTaskResultResponseBodyTamperBaseResultsPsLocItems();
            return TeaModel.build(map, self);
        }

        public GetImageDetectionTaskResultResponseBodyTamperBaseResultsPsLocItems setBbox(java.util.List<Float> bbox) {
            this.bbox = bbox;
            return this;
        }
        public java.util.List<Float> getBbox() {
            return this.bbox;
        }

        public GetImageDetectionTaskResultResponseBodyTamperBaseResultsPsLocItems setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class GetImageDetectionTaskResultResponseBodyTamperBaseResultsPsLoc extends TeaModel {
        /**
         * <p>The PS tamper localization result description.</p>
         * 
         * <strong>example:</strong>
         * <p>1 suspected PS-modified region detected</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>The list of tampered regions.</p>
         */
        @NameInMap("Items")
        public java.util.List<GetImageDetectionTaskResultResponseBodyTamperBaseResultsPsLocItems> items;

        public static GetImageDetectionTaskResultResponseBodyTamperBaseResultsPsLoc build(java.util.Map<String, ?> map) throws Exception {
            GetImageDetectionTaskResultResponseBodyTamperBaseResultsPsLoc self = new GetImageDetectionTaskResultResponseBodyTamperBaseResultsPsLoc();
            return TeaModel.build(map, self);
        }

        public GetImageDetectionTaskResultResponseBodyTamperBaseResultsPsLoc setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetImageDetectionTaskResultResponseBodyTamperBaseResultsPsLoc setItems(java.util.List<GetImageDetectionTaskResultResponseBodyTamperBaseResultsPsLocItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetImageDetectionTaskResultResponseBodyTamperBaseResultsPsLocItems> getItems() {
            return this.items;
        }

    }

    public static class GetImageDetectionTaskResultResponseBodyTamperBaseResultsRecap extends TeaModel {
        /**
         * <p>The recapture/copy detection result description.</p>
         * 
         * <strong>example:</strong>
         * <p>Recapture detection score</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>The recapture/copy dimension risk label.</p>
         * 
         * <strong>example:</strong>
         * <p>高风险</p>
         */
        @NameInMap("Risk")
        public String risk;

        /**
         * <p>The recapture/copy detection score. Value range: 0 to 1. A higher value indicates a greater likelihood of recapture or copying.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9998</p>
         */
        @NameInMap("Score")
        public Float score;

        public static GetImageDetectionTaskResultResponseBodyTamperBaseResultsRecap build(java.util.Map<String, ?> map) throws Exception {
            GetImageDetectionTaskResultResponseBodyTamperBaseResultsRecap self = new GetImageDetectionTaskResultResponseBodyTamperBaseResultsRecap();
            return TeaModel.build(map, self);
        }

        public GetImageDetectionTaskResultResponseBodyTamperBaseResultsRecap setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetImageDetectionTaskResultResponseBodyTamperBaseResultsRecap setRisk(String risk) {
            this.risk = risk;
            return this;
        }
        public String getRisk() {
            return this.risk;
        }

        public GetImageDetectionTaskResultResponseBodyTamperBaseResultsRecap setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class GetImageDetectionTaskResultResponseBodyTamperBaseResults extends TeaModel {
        /**
         * <p>The AIGC detection result.</p>
         */
        @NameInMap("Aigc")
        public GetImageDetectionTaskResultResponseBodyTamperBaseResultsAigc aigc;

        /**
         * <p>The AI post-processing detection score.</p>
         */
        @NameInMap("Aips")
        public GetImageDetectionTaskResultResponseBodyTamperBaseResultsAips aips;

        /**
         * <p>The image type.</p>
         * 
         * <strong>example:</strong>
         * <p>natural</p>
         */
        @NameInMap("ImgType")
        public String imgType;

        /**
         * <p>The PS tamper localization result.</p>
         */
        @NameInMap("PsLoc")
        public GetImageDetectionTaskResultResponseBodyTamperBaseResultsPsLoc psLoc;

        /**
         * <p>The recapture/copy detection result.</p>
         */
        @NameInMap("Recap")
        public GetImageDetectionTaskResultResponseBodyTamperBaseResultsRecap recap;

        public static GetImageDetectionTaskResultResponseBodyTamperBaseResults build(java.util.Map<String, ?> map) throws Exception {
            GetImageDetectionTaskResultResponseBodyTamperBaseResults self = new GetImageDetectionTaskResultResponseBodyTamperBaseResults();
            return TeaModel.build(map, self);
        }

        public GetImageDetectionTaskResultResponseBodyTamperBaseResults setAigc(GetImageDetectionTaskResultResponseBodyTamperBaseResultsAigc aigc) {
            this.aigc = aigc;
            return this;
        }
        public GetImageDetectionTaskResultResponseBodyTamperBaseResultsAigc getAigc() {
            return this.aigc;
        }

        public GetImageDetectionTaskResultResponseBodyTamperBaseResults setAips(GetImageDetectionTaskResultResponseBodyTamperBaseResultsAips aips) {
            this.aips = aips;
            return this;
        }
        public GetImageDetectionTaskResultResponseBodyTamperBaseResultsAips getAips() {
            return this.aips;
        }

        public GetImageDetectionTaskResultResponseBodyTamperBaseResults setImgType(String imgType) {
            this.imgType = imgType;
            return this;
        }
        public String getImgType() {
            return this.imgType;
        }

        public GetImageDetectionTaskResultResponseBodyTamperBaseResults setPsLoc(GetImageDetectionTaskResultResponseBodyTamperBaseResultsPsLoc psLoc) {
            this.psLoc = psLoc;
            return this;
        }
        public GetImageDetectionTaskResultResponseBodyTamperBaseResultsPsLoc getPsLoc() {
            return this.psLoc;
        }

        public GetImageDetectionTaskResultResponseBodyTamperBaseResults setRecap(GetImageDetectionTaskResultResponseBodyTamperBaseResultsRecap recap) {
            this.recap = recap;
            return this;
        }
        public GetImageDetectionTaskResultResponseBodyTamperBaseResultsRecap getRecap() {
            return this.recap;
        }

    }

    public static class GetImageDetectionTaskResultResponseBodyTamper extends TeaModel {
        /**
         * <p>The AI visible watermark. This field is returned only in large model mode. It is empty in small model mode.</p>
         * 
         * <strong>example:</strong>
         * <p>是</p>
         */
        @NameInMap("AiWatermark")
        public String aiWatermark;

        /**
         * <p>The basic algorithm detection results, including multi-dimensional detection scores and risk labels.</p>
         */
        @NameInMap("BaseResults")
        public GetImageDetectionTaskResultResponseBodyTamperBaseResults baseResults;

        /**
         * <p>The final conclusion.</p>
         * 
         * <strong>example:</strong>
         * <p>Metadata data analytics result verified as high risk</p>
         */
        @NameInMap("FinalConclusion")
        public String finalConclusion;

        /**
         * <p>The comprehensive analysis result from the large language model.</p>
         * 
         * <strong>example:</strong>
         * <p>The image has been detected with traces of AI generation. The AIGC detection score is 0.95. We recommend further verifying the image source</p>
         */
        @NameInMap("LlmResult")
        public String llmResult;

        /**
         * <p>The metadata AI flag. This field is always returned.</p>
         * 
         * <strong>example:</strong>
         * <p>高风险</p>
         */
        @NameInMap("MetadataAiFlag")
        public String metadataAiFlag;

        /**
         * <p>The source of the metadata AI flag. This field is returned only in large model mode. It is empty in small model mode.</p>
         * 
         * <strong>example:</strong>
         * <p>通义</p>
         */
        @NameInMap("MetadataAiSource")
        public String metadataAiSource;

        /**
         * <p>The determination result. This field is always returned.</p>
         * 
         * <strong>example:</strong>
         * <p>高风险</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        public static GetImageDetectionTaskResultResponseBodyTamper build(java.util.Map<String, ?> map) throws Exception {
            GetImageDetectionTaskResultResponseBodyTamper self = new GetImageDetectionTaskResultResponseBodyTamper();
            return TeaModel.build(map, self);
        }

        public GetImageDetectionTaskResultResponseBodyTamper setAiWatermark(String aiWatermark) {
            this.aiWatermark = aiWatermark;
            return this;
        }
        public String getAiWatermark() {
            return this.aiWatermark;
        }

        public GetImageDetectionTaskResultResponseBodyTamper setBaseResults(GetImageDetectionTaskResultResponseBodyTamperBaseResults baseResults) {
            this.baseResults = baseResults;
            return this;
        }
        public GetImageDetectionTaskResultResponseBodyTamperBaseResults getBaseResults() {
            return this.baseResults;
        }

        public GetImageDetectionTaskResultResponseBodyTamper setFinalConclusion(String finalConclusion) {
            this.finalConclusion = finalConclusion;
            return this;
        }
        public String getFinalConclusion() {
            return this.finalConclusion;
        }

        public GetImageDetectionTaskResultResponseBodyTamper setLlmResult(String llmResult) {
            this.llmResult = llmResult;
            return this;
        }
        public String getLlmResult() {
            return this.llmResult;
        }

        public GetImageDetectionTaskResultResponseBodyTamper setMetadataAiFlag(String metadataAiFlag) {
            this.metadataAiFlag = metadataAiFlag;
            return this;
        }
        public String getMetadataAiFlag() {
            return this.metadataAiFlag;
        }

        public GetImageDetectionTaskResultResponseBodyTamper setMetadataAiSource(String metadataAiSource) {
            this.metadataAiSource = metadataAiSource;
            return this;
        }
        public String getMetadataAiSource() {
            return this.metadataAiSource;
        }

        public GetImageDetectionTaskResultResponseBodyTamper setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

    }

}
