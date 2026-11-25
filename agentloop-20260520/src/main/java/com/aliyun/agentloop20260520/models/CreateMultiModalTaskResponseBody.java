// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class CreateMultiModalTaskResponseBody extends TeaModel {
    /**
     * <p>The evaluation message. It is the description returned by the backend upon success, or the customer-visible error message upon failure.</p>
     * 
     * <strong>example:</strong>
     * <p>The image is complete and the inspection is passed</p>
     */
    @NameInMap("msg")
    public String msg;

    /**
     * <p>The score, ranging from 0 to 1. It is null when the evaluation fails. If the backend returns a percentage score greater than 1, it is converted to score/100 and rounded to a maximum of 4 decimal places.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("score")
    public Float score;

    /**
     * <p>The task ID, in the format of eval-task-&lt;32hex&gt;. It can be used for tracing in the console or query API. It is null if the failure occurs before the task is created.</p>
     * 
     * <strong>example:</strong>
     * <p>eval-task-0123456789abcdef0123456789abcdef</p>
     */
    @NameInMap("taskId")
    public String taskId;

    /**
     * <p>The task name used for this call. It is also returned upon failure if the request body has been parsed.</p>
     * 
     * <strong>example:</strong>
     * <p>agentloop-media-process</p>
     */
    @NameInMap("taskName")
    public String taskName;

    public static CreateMultiModalTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMultiModalTaskResponseBody self = new CreateMultiModalTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMultiModalTaskResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public CreateMultiModalTaskResponseBody setScore(Float score) {
        this.score = score;
        return this;
    }
    public Float getScore() {
        return this.score;
    }

    public CreateMultiModalTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public CreateMultiModalTaskResponseBody setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
