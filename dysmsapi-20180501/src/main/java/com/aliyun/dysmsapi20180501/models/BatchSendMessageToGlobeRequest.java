// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20180501.models;

import com.aliyun.tea.*;

public class BatchSendMessageToGlobeRequest extends TeaModel {
    @NameInMap("From")
    public String from;

    @NameInMap("Message")
    public String message;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("To")
    public String to;

    @NameInMap("Type")
    public String type;

    public static BatchSendMessageToGlobeRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchSendMessageToGlobeRequest self = new BatchSendMessageToGlobeRequest();
        return TeaModel.build(map, self);
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

    public BatchSendMessageToGlobeRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public BatchSendMessageToGlobeRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public BatchSendMessageToGlobeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
