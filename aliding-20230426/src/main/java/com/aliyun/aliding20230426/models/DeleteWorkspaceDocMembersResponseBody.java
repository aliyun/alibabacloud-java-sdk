// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceDocMembersResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
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
