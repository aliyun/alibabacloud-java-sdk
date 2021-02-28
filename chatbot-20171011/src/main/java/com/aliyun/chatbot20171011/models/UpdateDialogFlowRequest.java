// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class UpdateDialogFlowRequest extends TeaModel {
    @NameInMap("DialogId")
    public Long dialogId;

    @NameInMap("ModuleDefinition")
    public String moduleDefinition;

    public static UpdateDialogFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDialogFlowRequest self = new UpdateDialogFlowRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDialogFlowRequest setDialogId(Long dialogId) {
        this.dialogId = dialogId;
        return this;
    }
    public Long getDialogId() {
        return this.dialogId;
    }

    public UpdateDialogFlowRequest setModuleDefinition(String moduleDefinition) {
        this.moduleDefinition = moduleDefinition;
        return this;
    }
    public String getModuleDefinition() {
        return this.moduleDefinition;
    }

}
