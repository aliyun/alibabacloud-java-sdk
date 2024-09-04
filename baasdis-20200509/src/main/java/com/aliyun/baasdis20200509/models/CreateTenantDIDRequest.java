// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baasdis20200509.models;

import com.aliyun.tea.*;

public class CreateTenantDIDRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>01357967-61d1-42a9-8a90-f0dd8a161411</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateTenantDIDRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantDIDRequest self = new CreateTenantDIDRequest();
        return TeaModel.build(map, self);
    }

    public CreateTenantDIDRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
