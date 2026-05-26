// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteUserPoolClientRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>my-web-app</p>
     */
    @NameInMap("ClientName")
    public String clientName;

    /**
     * <strong>example:</strong>
     * <p>my-agent-userpool</p>
     */
    @NameInMap("UserPoolName")
    public String userPoolName;

    public static DeleteUserPoolClientRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserPoolClientRequest self = new DeleteUserPoolClientRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserPoolClientRequest setClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }
    public String getClientName() {
        return this.clientName;
    }

    public DeleteUserPoolClientRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
