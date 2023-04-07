// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AddUserToDesktopGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddUserToDesktopGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddUserToDesktopGroupResponseBody self = new AddUserToDesktopGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AddUserToDesktopGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
