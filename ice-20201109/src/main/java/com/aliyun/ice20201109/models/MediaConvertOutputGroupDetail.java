// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaConvertOutputGroupDetail extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Name")
    public String name;

    @NameInMap("Outputs")
    public java.util.List<MediaConvertOutputDetail> outputs;

    @NameInMap("Status")
    public String status;

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
