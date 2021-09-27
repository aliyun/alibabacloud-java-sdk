// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateProductVersionPackageHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateProductVersionPackageHeaders build(java.util.Map<String, ?> map) throws Exception {
        CreateProductVersionPackageHeaders self = new CreateProductVersionPackageHeaders();
        return TeaModel.build(map, self);
    }

    public CreateProductVersionPackageHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CreateProductVersionPackageHeaders setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
