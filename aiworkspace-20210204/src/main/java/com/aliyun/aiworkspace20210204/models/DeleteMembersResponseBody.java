// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteMembersResponseBody extends TeaModel {
    // 请求 id
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMembersResponseBody self = new DeleteMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
