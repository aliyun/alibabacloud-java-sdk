// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class SendMessageRequest extends TeaModel {
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
    public java.util.List<String> msisdns;

    @NameInMap("TaskName")
    public String taskName;

    public static SendMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendMessageRequest self = new SendMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendMessageRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public SendMessageRequest setMessageSendTime(Long messageSendTime) {
        this.messageSendTime = messageSendTime;
        return this;
    }
    public Long getMessageSendTime() {
        return this.messageSendTime;
    }

    public SendMessageRequest setMessageTemplateId(Long messageTemplateId) {
        this.messageTemplateId = messageTemplateId;
        return this;
    }
    public Long getMessageTemplateId() {
        return this.messageTemplateId;
    }

    public SendMessageRequest setMessageVariableParam(String messageVariableParam) {
        this.messageVariableParam = messageVariableParam;
        return this;
    }
    public String getMessageVariableParam() {
        return this.messageVariableParam;
    }

    public SendMessageRequest setMsisdns(java.util.List<String> msisdns) {
        this.msisdns = msisdns;
        return this;
    }
    public java.util.List<String> getMsisdns() {
        return this.msisdns;
    }

    public SendMessageRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
