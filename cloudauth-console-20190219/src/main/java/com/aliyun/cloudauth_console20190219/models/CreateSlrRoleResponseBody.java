// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class CreateSlrRoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSlrRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSlrRoleResponseBody self = new CreateSlrRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSlrRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
