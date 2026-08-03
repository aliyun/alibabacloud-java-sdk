// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class SendTextMsgRequest extends TeaModel {
    @NameInMap("projectId")
    public String projectId;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("sessionId")
    public String sessionId;

    @NameInMap("text")
    public String text;

    @NameInMap("type")
    public Integer type;

    public static SendTextMsgRequest build(java.util.Map<String, ?> map) throws Exception {
        SendTextMsgRequest self = new SendTextMsgRequest();
        return TeaModel.build(map, self);
    }

    public SendTextMsgRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public SendTextMsgRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendTextMsgRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public SendTextMsgRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public SendTextMsgRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
