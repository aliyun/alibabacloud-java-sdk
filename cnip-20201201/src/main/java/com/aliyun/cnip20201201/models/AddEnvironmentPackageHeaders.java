// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class AddEnvironmentPackageHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("ClientToken")
    public String clientToken;

    public static AddEnvironmentPackageHeaders build(java.util.Map<String, ?> map) throws Exception {
        AddEnvironmentPackageHeaders self = new AddEnvironmentPackageHeaders();
        return TeaModel.build(map, self);
    }

    public AddEnvironmentPackageHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public AddEnvironmentPackageHeaders setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
