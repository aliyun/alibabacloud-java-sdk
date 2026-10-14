// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class GetWatermarkExtractTaskResultResponseBody extends TeaModel {
    /**
     * <p>The average extraction confidence, ranging from 0 to 1. This parameter is returned only when Status is succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>0.99</p>
     */
    @NameInMap("AvgAcc")
    public Double avgAcc;

    /**
     * <p>The business error code. OK is returned if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether a watermark is detected.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Detected")
    public Boolean detected;

    /**
     * <p>The HTTP status code. 200 is returned if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The failure reason when the task fails. This parameter is returned only when Status is failed.</p>
     * 
     * <strong>example:</strong>
     * <p>The request has failed due to a temporary failure of the server.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-7890-ABCD-EF1234567890</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li>running: In progress.</li>
     * <li>succeeded: Completed.</li>
     * <li>failed: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>succeeded</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The dark watermark extraction task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>f47ac10b-58cc-4372-a567-0e02b2c3d479</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The extracted watermark content. This parameter is returned only when <code>Status</code> is <code>succeeded</code> and <code>Detected=true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>wm-e2e-85970647</p>
     */
    @NameInMap("WatermarkContent")
    public String watermarkContent;

    public static GetWatermarkExtractTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWatermarkExtractTaskResultResponseBody self = new GetWatermarkExtractTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWatermarkExtractTaskResultResponseBody setAvgAcc(Double avgAcc) {
        this.avgAcc = avgAcc;
        return this;
    }
    public Double getAvgAcc() {
        return this.avgAcc;
    }

    public GetWatermarkExtractTaskResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetWatermarkExtractTaskResultResponseBody setDetected(Boolean detected) {
        this.detected = detected;
        return this;
    }
    public Boolean getDetected() {
        return this.detected;
    }

    public GetWatermarkExtractTaskResultResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetWatermarkExtractTaskResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWatermarkExtractTaskResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWatermarkExtractTaskResultResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetWatermarkExtractTaskResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetWatermarkExtractTaskResultResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetWatermarkExtractTaskResultResponseBody setWatermarkContent(String watermarkContent) {
        this.watermarkContent = watermarkContent;
        return this;
    }
    public String getWatermarkContent() {
        return this.watermarkContent;
    }

}
