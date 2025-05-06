// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dashdeviceconsole20250408.models;

import com.aliyun.tea.*;

public class DeletePromptRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>chat</p>
     */
    @NameInMap("groupId")
    public String groupId;

    public static DeletePromptRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePromptRequest self = new DeletePromptRequest();
        return TeaModel.build(map, self);
    }

    public DeletePromptRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
