// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceMembersResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateWorkspaceMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceMembersResponseBody self = new UpdateWorkspaceMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
