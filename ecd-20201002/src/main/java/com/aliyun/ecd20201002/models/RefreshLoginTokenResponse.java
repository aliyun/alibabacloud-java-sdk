// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class RefreshLoginTokenResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static RefreshLoginTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshLoginTokenResponse self = new RefreshLoginTokenResponse();
        return TeaModel.build(map, self);
    }

    public RefreshLoginTokenResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
