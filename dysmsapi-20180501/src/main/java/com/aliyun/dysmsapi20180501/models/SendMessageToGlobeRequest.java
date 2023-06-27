// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20180501.models;

import com.aliyun.tea.*;

public class SendMessageToGlobeRequest extends TeaModel {
    /**
     * <p>The mobile phone number of the sender. You can also specify a sender ID. The sender ID can contain both letters and digits. If it does, the ID must be between 1 to 11 characters in length. If the sender ID contains only digits, it must be 1 to 15 characters in length.</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The content of the message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the messaging campaign. It must be 1 to 255 characters in length. The ID is the value of the TaskId field in the delivery receipt of the message.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The mobile phone number to which the message is sent. You must add the dialing code to the beginning of the mobile phone number. Example: 8521245567\*\*\*\*.</p>
     * <br>
     * <p>For more information, see [Dialing codes](https://www.alibabacloud.com/help/zh/short-message-service/latest/dialing-codes).</p>
     */
    @NameInMap("To")
    public String to;

    @NameInMap("ValidityPeriod")
    public Long validityPeriod;

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

    public SendMessageToGlobeRequest setValidityPeriod(Long validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }
    public Long getValidityPeriod() {
        return this.validityPeriod;
    }

}
