// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dashdeviceconsole20250408.models;

import com.aliyun.tea.*;

public class GetPromptRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>chat</p>
     */
    @NameInMap("groupId")
    public String groupId;

    public static GetPromptRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPromptRequest self = new GetPromptRequest();
        return TeaModel.build(map, self);
    }

    public GetPromptRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
