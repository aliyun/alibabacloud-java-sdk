// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class DeleteAuthorizationHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("ClientToken")
    public String clientToken;

    public static DeleteAuthorizationHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeleteAuthorizationHeaders self = new DeleteAuthorizationHeaders();
        return TeaModel.build(map, self);
    }

    public DeleteAuthorizationHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeleteAuthorizationHeaders setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
