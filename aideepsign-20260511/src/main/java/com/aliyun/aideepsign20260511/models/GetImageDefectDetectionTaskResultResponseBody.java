// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class GetImageDefectDetectionTaskResultResponseBody extends TeaModel {
    /**
     * <p><strong>The image abnormality reason.</strong> This field is returned only when <code>Status</code> is <code>succeeded</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>The main subject of the image is blurry</p>
     */
    @NameInMap("AbnormalityReason")
    public String abnormalityReason;

    /**
     * <p><strong>The image abnormality score.</strong> The value ranges from 0 to 1. A higher value indicates a more severe image abnormality. This field is returned only when <code>Status</code> is <code>succeeded</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>0.9667</p>
     */
    @NameInMap("AbnormalityScore")
    public Float abnormalityScore;

    /**
     * <p><strong>The business error code.</strong> The value &quot;OK&quot; is returned for successful requests.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p><strong>The HTTP status code.</strong> The value 200 is returned for successful requests.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The failure reason. This field is returned only when <code>Status</code> is <code>failed</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>poll timeout: no result within 30m0s</p>
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
     * <p>The raw downstream detection result (JSON string). The <code>AbnormalityScore</code> and <code>AbnormalityReason</code> fields are parsed from this raw result. The raw result is retained for debugging and passing through newly added upstream fields.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;image_abnormality_score&quot;: 0.75, &quot;image_abnormality_reason&quot;: &quot;The main subject of the image is blurry&quot;}</p>
     */
    @NameInMap("Result")
    public String result;

    /**
     * <p>The risk code. <strong>This field is deprecated and has no meaning.</strong> Determine whether an abnormality exists based on the AbnormalityScore, AbnormalityReason, and Result fields.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;0&quot;</p>
     */
    @NameInMap("RiskCode")
    public String riskCode;

    /**
     * <p><strong>The task status.</strong> Valid values:</p>
     * <ul>
     * <li><code>running</code>: The task is running.</li>
     * <li><code>succeeded</code>: The task is completed.</li>
     * <li><code>failed</code>: The task failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>succeeded</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p><strong>The task ID.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>f47ac10b-58cc-4372-a567-0e02b2c3d479</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetImageDefectDetectionTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageDefectDetectionTaskResultResponseBody self = new GetImageDefectDetectionTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageDefectDetectionTaskResultResponseBody setAbnormalityReason(String abnormalityReason) {
        this.abnormalityReason = abnormalityReason;
        return this;
    }
    public String getAbnormalityReason() {
        return this.abnormalityReason;
    }

    public GetImageDefectDetectionTaskResultResponseBody setAbnormalityScore(Float abnormalityScore) {
        this.abnormalityScore = abnormalityScore;
        return this;
    }
    public Float getAbnormalityScore() {
        return this.abnormalityScore;
    }

    public GetImageDefectDetectionTaskResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetImageDefectDetectionTaskResultResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetImageDefectDetectionTaskResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetImageDefectDetectionTaskResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetImageDefectDetectionTaskResultResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public GetImageDefectDetectionTaskResultResponseBody setRiskCode(String riskCode) {
        this.riskCode = riskCode;
        return this;
    }
    public String getRiskCode() {
        return this.riskCode;
    }

    public GetImageDefectDetectionTaskResultResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetImageDefectDetectionTaskResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetImageDefectDetectionTaskResultResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
