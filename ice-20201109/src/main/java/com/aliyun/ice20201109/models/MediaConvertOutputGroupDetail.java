// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaConvertOutputGroupDetail extends TeaModel {
    /**
     * <p>The error code for the failed output group task.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter.ResourceContentBad</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The time the task was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-21T01:48:41Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The end time of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-21T01:48:41Z</p>
     */
    @NameInMap("FinishTime")
    public String finishTime;

    /**
     * <p>The reason for a task failure.</p>
     * 
     * <strong>example:</strong>
     * <p>The resource operated &quot;InputFile&quot; is bad</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The name of the output group.</p>
     * 
     * <strong>example:</strong>
     * <p>hls-group</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The output details.</p>
     */
    @NameInMap("Outputs")
    public java.util.List<MediaConvertOutputDetail> outputs;

    /**
     * <p>The status of the output group task.</p>
     * <ul>
     * <li>Init: The task is submitted.</li>
     * <li>Running</li>
     * <li>Success</li>
     * <li>Failed</li>
     * <li>Skipped</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the output group task.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>22dad741d086a50325f9</strong></strong></strong></p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static MediaConvertOutputGroupDetail build(java.util.Map<String, ?> map) throws Exception {
        MediaConvertOutputGroupDetail self = new MediaConvertOutputGroupDetail();
        return TeaModel.build(map, self);
    }

    public MediaConvertOutputGroupDetail setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MediaConvertOutputGroupDetail setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public MediaConvertOutputGroupDetail setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public String getFinishTime() {
        return this.finishTime;
    }

    public MediaConvertOutputGroupDetail setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MediaConvertOutputGroupDetail setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MediaConvertOutputGroupDetail setOutputs(java.util.List<MediaConvertOutputDetail> outputs) {
        this.outputs = outputs;
        return this;
    }
    public java.util.List<MediaConvertOutputDetail> getOutputs() {
        return this.outputs;
    }

    public MediaConvertOutputGroupDetail setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public MediaConvertOutputGroupDetail setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
