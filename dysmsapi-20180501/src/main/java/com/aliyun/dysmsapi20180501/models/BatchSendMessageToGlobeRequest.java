// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20180501.models;

import com.aliyun.tea.*;

public class BatchSendMessageToGlobeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>sms-djnfjn344</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The mobile phone number of the sender. You can also specify a sender ID. The sender ID can contain both letters and digits. If it does, the ID must be between 1 to 11 characters in length. If the sender ID contains only digits, it must be 1 to 15 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Alicloud321</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The content of the message.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;message to 931520581****\&quot;,\&quot;message to 931530581****\&quot;,\&quot;message to 931540581****\&quot;,\&quot;message to 931550581****\&quot;]</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the messaging campaign. It must be 1 to 255 characters in length. The ID is the value of the TaskId field in the delivery receipt of the message.</p>
     * 
     * <strong>example:</strong>
     * <p>123789****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The mobile phone numbers to which the message is sent. You must add the dialing code to the beginning of each mobile phone number.</p>
     * <p>For more information, see <a href="https://www.alibabacloud.com/help/en/short-message-service/latest/dialing-codes">Dialing codes</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;931520581****\&quot;,\&quot;931530581****\&quot;,\&quot;931540581****\&quot;,\&quot;931550581****\&quot;]</p>
     */
    @NameInMap("To")
    public String to;

    /**
     * <p>The type of the message. Valid values:</p>
     * <ul>
     * <li><strong>NOTIFY</strong>: notification</li>
     * <li><strong>MKT</strong>: promotional message</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NOTIFY</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The validity period of the message. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ValidityPeriod")
    public Long validityPeriod;

    public static BatchSendMessageToGlobeRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchSendMessageToGlobeRequest self = new BatchSendMessageToGlobeRequest();
        return TeaModel.build(map, self);
    }

    public BatchSendMessageToGlobeRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
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

    public BatchSendMessageToGlobeRequest setValidityPeriod(Long validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }
    public Long getValidityPeriod() {
        return this.validityPeriod;
    }

}
