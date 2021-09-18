// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20180501.models;

import com.aliyun.tea.*;

public class SendMessageWithTemplateRequest extends TeaModel {
    @NameInMap("To")
    public String to;

    @NameInMap("From")
    public String from;

    @NameInMap("TemplateCode")
    public String templateCode;

    @NameInMap("TemplateParam")
    public String templateParam;

    @NameInMap("SmsUpExtendCode")
    public String smsUpExtendCode;

    public static SendMessageWithTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        SendMessageWithTemplateRequest self = new SendMessageWithTemplateRequest();
        return TeaModel.build(map, self);
    }

    public SendMessageWithTemplateRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public SendMessageWithTemplateRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public SendMessageWithTemplateRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SendMessageWithTemplateRequest setTemplateParam(String templateParam) {
        this.templateParam = templateParam;
        return this;
    }
    public String getTemplateParam() {
        return this.templateParam;
    }

    public SendMessageWithTemplateRequest setSmsUpExtendCode(String smsUpExtendCode) {
        this.smsUpExtendCode = smsUpExtendCode;
        return this;
    }
    public String getSmsUpExtendCode() {
        return this.smsUpExtendCode;
    }

}
