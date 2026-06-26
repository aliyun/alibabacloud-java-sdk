// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateUserPoolRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("UserPoolName")
    public String userPoolName;

    public static CreateUserPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserPoolRequest self = new CreateUserPoolRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserPoolRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateUserPoolRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
