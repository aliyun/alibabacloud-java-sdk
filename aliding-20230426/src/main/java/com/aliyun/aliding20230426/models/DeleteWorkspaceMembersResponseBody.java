// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceMembersResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteWorkspaceMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceMembersResponseBody self = new DeleteWorkspaceMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
