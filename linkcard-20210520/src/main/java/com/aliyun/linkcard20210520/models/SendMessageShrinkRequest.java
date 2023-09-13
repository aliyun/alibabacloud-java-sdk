// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class SendMessageShrinkRequest extends TeaModel {
    /**
     * <p>Linkcard</p>
     */
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("MessageSendTime")
    public Long messageSendTime;

    @NameInMap("MessageTemplateId")
    public Long messageTemplateId;

    @NameInMap("MessageVariableParam")
    public String messageVariableParam;

    @NameInMap("Msisdns")
    public String msisdnsShrink;

    @NameInMap("TaskName")
    public String taskName;

    public static SendMessageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendMessageShrinkRequest self = new SendMessageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SendMessageShrinkRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public SendMessageShrinkRequest setMessageSendTime(Long messageSendTime) {
        this.messageSendTime = messageSendTime;
        return this;
    }
    public Long getMessageSendTime() {
        return this.messageSendTime;
    }

    public SendMessageShrinkRequest setMessageTemplateId(Long messageTemplateId) {
        this.messageTemplateId = messageTemplateId;
        return this;
    }
    public Long getMessageTemplateId() {
        return this.messageTemplateId;
    }

    public SendMessageShrinkRequest setMessageVariableParam(String messageVariableParam) {
        this.messageVariableParam = messageVariableParam;
        return this;
    }
    public String getMessageVariableParam() {
        return this.messageVariableParam;
    }

    public SendMessageShrinkRequest setMsisdnsShrink(String msisdnsShrink) {
        this.msisdnsShrink = msisdnsShrink;
        return this;
    }
    public String getMsisdnsShrink() {
        return this.msisdnsShrink;
    }

    public SendMessageShrinkRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
