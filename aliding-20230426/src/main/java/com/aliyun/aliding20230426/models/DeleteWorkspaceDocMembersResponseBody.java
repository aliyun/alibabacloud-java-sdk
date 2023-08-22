// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceDocMembersResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteWorkspaceDocMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceDocMembersResponseBody self = new DeleteWorkspaceDocMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceDocMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
