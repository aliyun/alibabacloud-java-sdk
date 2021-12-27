// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20180501.models;

import com.aliyun.tea.*;

public class SendMessageToGlobeRequest extends TeaModel {
    @NameInMap("From")
    public String from;

    @NameInMap("Message")
    public String message;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("To")
    public String to;

    public static SendMessageToGlobeRequest build(java.util.Map<String, ?> map) throws Exception {
        SendMessageToGlobeRequest self = new SendMessageToGlobeRequest();
        return TeaModel.build(map, self);
    }

    public SendMessageToGlobeRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public SendMessageToGlobeRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendMessageToGlobeRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public SendMessageToGlobeRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

}
