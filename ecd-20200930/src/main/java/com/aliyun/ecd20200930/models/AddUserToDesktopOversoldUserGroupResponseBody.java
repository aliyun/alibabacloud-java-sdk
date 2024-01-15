// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AddUserToDesktopOversoldUserGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddUserToDesktopOversoldUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddUserToDesktopOversoldUserGroupResponseBody self = new AddUserToDesktopOversoldUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AddUserToDesktopOversoldUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
