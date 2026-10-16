// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateUserPoolRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>更新后的用户池描述</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>my-agent-userpool</p>
     */
    @NameInMap("UserPoolName")
    public String userPoolName;

    public static UpdateUserPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserPoolRequest self = new UpdateUserPoolRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserPoolRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateUserPoolRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
