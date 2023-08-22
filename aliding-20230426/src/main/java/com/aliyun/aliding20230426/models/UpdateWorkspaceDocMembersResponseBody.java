// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceDocMembersResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateWorkspaceDocMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceDocMembersResponseBody self = new UpdateWorkspaceDocMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceDocMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
