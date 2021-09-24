// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetTenantApplicationRequest extends TeaModel {
    // 幂等标识
    @NameInMap("clientToken")
    public String clientToken;

    public static GetTenantApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTenantApplicationRequest self = new GetTenantApplicationRequest();
        return TeaModel.build(map, self);
    }

    public GetTenantApplicationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
