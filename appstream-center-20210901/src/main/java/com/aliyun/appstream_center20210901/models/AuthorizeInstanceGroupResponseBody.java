// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class AuthorizeInstanceGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AuthorizeInstanceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeInstanceGroupResponseBody self = new AuthorizeInstanceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AuthorizeInstanceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
