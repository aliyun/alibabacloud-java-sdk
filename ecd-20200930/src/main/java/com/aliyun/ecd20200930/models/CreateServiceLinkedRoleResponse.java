// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateServiceLinkedRoleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreateServiceLinkedRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceLinkedRoleResponse self = new CreateServiceLinkedRoleResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceLinkedRoleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
