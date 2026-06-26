// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetLoginPreferenceRequest extends TeaModel {
    @NameInMap("UserPoolName")
    public String userPoolName;

    public static GetLoginPreferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLoginPreferenceRequest self = new GetLoginPreferenceRequest();
        return TeaModel.build(map, self);
    }

    public GetLoginPreferenceRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
