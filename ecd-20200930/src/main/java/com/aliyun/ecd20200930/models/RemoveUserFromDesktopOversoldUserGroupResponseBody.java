// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RemoveUserFromDesktopOversoldUserGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveUserFromDesktopOversoldUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserFromDesktopOversoldUserGroupResponseBody self = new RemoveUserFromDesktopOversoldUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveUserFromDesktopOversoldUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
