// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class AddEnvironmentProductVersionHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("ClientToken")
    public String clientToken;

    public static AddEnvironmentProductVersionHeaders build(java.util.Map<String, ?> map) throws Exception {
        AddEnvironmentProductVersionHeaders self = new AddEnvironmentProductVersionHeaders();
        return TeaModel.build(map, self);
    }

    public AddEnvironmentProductVersionHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public AddEnvironmentProductVersionHeaders setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
