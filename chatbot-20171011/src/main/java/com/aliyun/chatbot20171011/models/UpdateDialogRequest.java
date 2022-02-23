// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class UpdateDialogRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("Description")
    public String description;

    @NameInMap("DialogId")
    public Long dialogId;

    @NameInMap("DialogName")
    public String dialogName;

    public static UpdateDialogRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDialogRequest self = new UpdateDialogRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDialogRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateDialogRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDialogRequest setDialogId(Long dialogId) {
        this.dialogId = dialogId;
        return this;
    }
    public Long getDialogId() {
        return this.dialogId;
    }

    public UpdateDialogRequest setDialogName(String dialogName) {
        this.dialogName = dialogName;
        return this;
    }
    public String getDialogName() {
        return this.dialogName;
    }

}
