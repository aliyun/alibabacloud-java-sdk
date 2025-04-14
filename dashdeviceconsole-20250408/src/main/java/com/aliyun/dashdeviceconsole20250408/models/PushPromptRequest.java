// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dashdeviceconsole20250408.models;

import com.aliyun.tea.*;

public class PushPromptRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>chat</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("promptContent")
    public String promptContent;

    public static PushPromptRequest build(java.util.Map<String, ?> map) throws Exception {
        PushPromptRequest self = new PushPromptRequest();
        return TeaModel.build(map, self);
    }

    public PushPromptRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public PushPromptRequest setPromptContent(String promptContent) {
        this.promptContent = promptContent;
        return this;
    }
    public String getPromptContent() {
        return this.promptContent;
    }

}
