// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddWorkspaceDocMembersResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static AddWorkspaceDocMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddWorkspaceDocMembersResponseBody self = new AddWorkspaceDocMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public AddWorkspaceDocMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
