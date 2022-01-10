// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class RemoveMemberRoleResponseBody extends TeaModel {
    // 请求 id
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveMemberRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveMemberRoleResponseBody self = new RemoveMemberRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveMemberRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
