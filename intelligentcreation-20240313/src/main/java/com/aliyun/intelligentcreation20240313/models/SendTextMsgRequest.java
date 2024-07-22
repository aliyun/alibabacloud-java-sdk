// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class SendTextMsgRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>126000030</p>
     */
    @NameInMap("projectId")
    public String projectId;

    /**
     * <strong>example:</strong>
     * <p>52775239-1575-5C07-A4AE-1835D120E4A6</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>tcm9xac9dsfbfgm8hf5k94l3cqybwh9o3mn0iuyytdgd9qoejxf1crxsdvuvr8fu0zudk5px4vsa3e3fgcclplkiuo7kyy3sqgscvhejmooblaiv64ww8cvlxvin2urzyhooqj33y7gvodef0sxn22n9q58o7xlupabiknxsv46qe7kof8nuc4be8kyhi01</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    @NameInMap("text")
    public String text;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
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
