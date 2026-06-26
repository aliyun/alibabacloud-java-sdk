// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetUserPoolRequest extends TeaModel {
    @NameInMap("UserPoolName")
    public String userPoolName;

    public static GetUserPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserPoolRequest self = new GetUserPoolRequest();
        return TeaModel.build(map, self);
    }

    public GetUserPoolRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
