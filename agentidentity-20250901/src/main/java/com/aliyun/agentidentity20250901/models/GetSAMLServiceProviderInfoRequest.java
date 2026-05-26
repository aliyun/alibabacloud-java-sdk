// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetSAMLServiceProviderInfoRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>my-agent-userpool</p>
     */
    @NameInMap("UserPoolName")
    public String userPoolName;

    public static GetSAMLServiceProviderInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSAMLServiceProviderInfoRequest self = new GetSAMLServiceProviderInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetSAMLServiceProviderInfoRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
