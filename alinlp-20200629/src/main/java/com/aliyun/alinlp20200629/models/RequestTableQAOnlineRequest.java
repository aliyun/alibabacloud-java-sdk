// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class RequestTableQAOnlineRequest extends TeaModel {
    @NameInMap("BotId")
    public String botId;

    @NameInMap("Params")
    public String params;

    @NameInMap("Question")
    public String question;

    @NameInMap("ServiceCode")
    public String serviceCode;

    public static RequestTableQAOnlineRequest build(java.util.Map<String, ?> map) throws Exception {
        RequestTableQAOnlineRequest self = new RequestTableQAOnlineRequest();
        return TeaModel.build(map, self);
    }

    public RequestTableQAOnlineRequest setBotId(String botId) {
        this.botId = botId;
        return this;
    }
    public String getBotId() {
        return this.botId;
    }

    public RequestTableQAOnlineRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public RequestTableQAOnlineRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public RequestTableQAOnlineRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

}
