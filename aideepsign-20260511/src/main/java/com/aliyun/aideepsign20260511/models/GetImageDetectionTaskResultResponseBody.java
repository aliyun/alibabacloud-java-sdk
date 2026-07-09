// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class GetImageDetectionTaskResultResponseBody extends TeaModel {
    /**
     * <p>The business error code. The value <code>&quot;OK&quot;</code> is returned when the request succeeds.</p>
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
     * <p>This parameter is returned only when <code>Status</code> is <code>succeeded</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>tamper</p>
     */
    @NameInMap("DetectMode")
    public String detectMode;

    /**
     * <p>The HTTP status code. The value <code>200</code> is returned when the request succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The list of AIGC detection result labels. This parameter is returned only when <code>Status</code> is <code>succeeded</code> and the task includes AIGC detection.</p>
     */
    @NameInMap("Labels")
    public java.util.List<GetImageDetectionTaskResultResponseBodyLabels> labels;

    /**
     * <p>The additional information. The value <code>&quot;success&quot;</code> is returned when the request succeeds. An error message is returned when the task fails. This parameter is returned only when <code>Status</code> is <code>failed</code>.</p>
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
     * <li><code>pending</code>: waiting.</li>
     * <li><code>running</code>: in progress.</li>
     * <li><code>succeeded</code>: completed.</li>
     * <li><code>failed</code>: failed.</li>
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
     * <p>The tamper detection results. This parameter is returned only when <code>DetectType</code> is <code>tamper</code> or <code>auto</code> (and the image is identified as a credential-type image).</p>
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
         * <p>The detection label. Valid values:</p>
         * <ul>
         * <li>ai_generated: AI-generated.</li>
         * <li>non_ai_generated: not AI-generated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>non_ai_generated</p>
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
         * <p>The description of the AIGC detection result.</p>
         * 
         * <strong>example:</strong>
         * <p>疑似AI生成图片</p>
         */
        @NameInMap("Desc")
        public String desc;

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
         * <p>The description of the AI post-processing detection result.</p>
         * 
         * <strong>example:</strong>
         * <p>未发现AI后处理痕迹</p>
         */
        @NameInMap("Desc")
        public String desc;

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
         * <p>The bounding box coordinates of the tampered region in the format <code>[x1, y1, x2, y2]</code>.</p>
         */
        @NameInMap("Bbox")
        public java.util.List<Float> bbox;

        /**
         * <p>The tamper confidence level for the region. Value range: <code>0 to 1</code>.</p>
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
         * <p>The description of the PS tamper localization result.</p>
         * 
         * <strong>example:</strong>
         * <p>发现1处疑似PS修改区域</p>
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

    public static class GetImageDetectionTaskResultResponseBodyTamperBaseResults extends TeaModel {
        /**
         * <p>The AIGC detection score.</p>
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
         * <p>The PS tamper localization results.</p>
         */
        @NameInMap("PsLoc")
        public GetImageDetectionTaskResultResponseBodyTamperBaseResultsPsLoc psLoc;

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

    }

    public static class GetImageDetectionTaskResultResponseBodyTamper extends TeaModel {
        /**
         * <p>The basic detection results, including detection scores across multiple dimensions.</p>
         */
        @NameInMap("BaseResults")
        public GetImageDetectionTaskResultResponseBodyTamperBaseResults baseResults;

        /**
         * <p>The comprehensive analysis result from the large language model.</p>
         * 
         * <strong>example:</strong>
         * <p>该图片经检测存在AI生成痕迹，AIGC检测得分0.95，建议进一步核实图片来源。</p>
         */
        @NameInMap("LlmResult")
        public String llmResult;

        /**
         * <p>The risk code. A value of <code>&quot;0&quot;</code> indicates no risk.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RiskCode")
        public String riskCode;

        /**
         * <p>The list of risk reasons. An empty array is returned when no risk is detected.</p>
         */
        @NameInMap("RiskReasons")
        public java.util.List<String> riskReasons;

        public static GetImageDetectionTaskResultResponseBodyTamper build(java.util.Map<String, ?> map) throws Exception {
            GetImageDetectionTaskResultResponseBodyTamper self = new GetImageDetectionTaskResultResponseBodyTamper();
            return TeaModel.build(map, self);
        }

        public GetImageDetectionTaskResultResponseBodyTamper setBaseResults(GetImageDetectionTaskResultResponseBodyTamperBaseResults baseResults) {
            this.baseResults = baseResults;
            return this;
        }
        public GetImageDetectionTaskResultResponseBodyTamperBaseResults getBaseResults() {
            return this.baseResults;
        }

        public GetImageDetectionTaskResultResponseBodyTamper setLlmResult(String llmResult) {
            this.llmResult = llmResult;
            return this;
        }
        public String getLlmResult() {
            return this.llmResult;
        }

        public GetImageDetectionTaskResultResponseBodyTamper setRiskCode(String riskCode) {
            this.riskCode = riskCode;
            return this;
        }
        public String getRiskCode() {
            return this.riskCode;
        }

        public GetImageDetectionTaskResultResponseBodyTamper setRiskReasons(java.util.List<String> riskReasons) {
            this.riskReasons = riskReasons;
            return this;
        }
        public java.util.List<String> getRiskReasons() {
            return this.riskReasons;
        }

    }

}
