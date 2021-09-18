// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20180501.models;

import com.aliyun.tea.*;

public class BatchSendMessageToGlobeRequest extends TeaModel {
    @NameInMap("To")
    public String to;

    @NameInMap("From")
    public String from;

    @NameInMap("Message")
    public String message;

    @NameInMap("Type")
    public String type;

    @NameInMap("TaskId")
    public String taskId;

    public static BatchSendMessageToGlobeRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchSendMessageToGlobeRequest self = new BatchSendMessageToGlobeRequest();
        return TeaModel.build(map, self);
    }

    public BatchSendMessageToGlobeRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public BatchSendMessageToGlobeRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public BatchSendMessageToGlobeRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchSendMessageToGlobeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public BatchSendMessageToGlobeRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
