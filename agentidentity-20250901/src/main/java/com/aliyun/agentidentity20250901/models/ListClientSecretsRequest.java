// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListClientSecretsRequest extends TeaModel {
    @NameInMap("ClientName")
    public String clientName;

    @NameInMap("UserPoolName")
    public String userPoolName;

    public static ListClientSecretsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClientSecretsRequest self = new ListClientSecretsRequest();
        return TeaModel.build(map, self);
    }

    public ListClientSecretsRequest setClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }
    public String getClientName() {
        return this.clientName;
    }

    public ListClientSecretsRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
