// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CreateAccountAndAuthorityResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreateAccountAndAuthorityResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountAndAuthorityResponse self = new CreateAccountAndAuthorityResponse();
        return TeaModel.build(map, self);
    }

    public CreateAccountAndAuthorityResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
