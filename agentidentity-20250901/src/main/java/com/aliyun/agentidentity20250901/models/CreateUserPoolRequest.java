// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateUserPoolRequest extends TeaModel {
    /**
     * <p>The description of the user pool. The description must be 0 to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample user pool</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the user pool. The name must be unique within the same Alibaba Cloud account and must be 3 to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent-userpool</p>
     */
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
