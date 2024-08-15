// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetTenantApplicationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7C56D225-7C34-40BB-9624-C8BA449260E6</p>
     */
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
