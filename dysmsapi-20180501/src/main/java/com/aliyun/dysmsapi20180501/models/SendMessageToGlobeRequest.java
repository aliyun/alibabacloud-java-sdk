// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20180501.models;

import com.aliyun.tea.*;

public class SendMessageToGlobeRequest extends TeaModel {
    /**
     * <p>The ID of the channel.</p>
     * 
     * <strong>example:</strong>
     * <p>3790</p>
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
     * <p>Hello</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the messaging campaign. It must be 1 to 255 characters in length. The ID is the value of the TaskId field in the delivery receipt of the message.</p>
     * 
     * <strong>example:</strong>
     * <p>123****789</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The mobile phone number to which the message is sent. You must add the dialing code to the beginning of the mobile phone number. Example: 8521245567\<em>\</em>\<em>\</em>.</p>
     * <p>For more information, see <a href="https://www.alibabacloud.com/help/en/sms/product-overview/dialing-codes?spm=a2c63.p38356.0.0.48b940a1PFYRMz">Dialing codes</a>.</p>
     * <blockquote>
     * <p> You cannot call the SendMessageToGlobe operation to send messages to the Chinese mainland.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8521245567****</p>
     */
    @NameInMap("To")
    public String to;

    @NameInMap("Type")
    public String type;

    /**
     * <p>The validity period of the message. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("ValidityPeriod")
    public Long validityPeriod;

    public static SendMessageToGlobeRequest build(java.util.Map<String, ?> map) throws Exception {
        SendMessageToGlobeRequest self = new SendMessageToGlobeRequest();
        return TeaModel.build(map, self);
    }

    public SendMessageToGlobeRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
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

    public SendMessageToGlobeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SendMessageToGlobeRequest setValidityPeriod(Long validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }
    public Long getValidityPeriod() {
        return this.validityPeriod;
    }

}
