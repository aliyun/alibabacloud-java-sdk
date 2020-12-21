// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class CreateServiceLinkedRoleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AlreadyExists")
    @Validation(required = true)
    public Boolean alreadyExists;

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

    public CreateServiceLinkedRoleResponse setAlreadyExists(Boolean alreadyExists) {
        this.alreadyExists = alreadyExists;
        return this;
    }
    public Boolean getAlreadyExists() {
        return this.alreadyExists;
    }

}
