// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class CreateDefaultRoleRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateDefaultRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDefaultRoleRequest self = new CreateDefaultRoleRequest();
        return TeaModel.build(map, self);
    }

    public CreateDefaultRoleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
