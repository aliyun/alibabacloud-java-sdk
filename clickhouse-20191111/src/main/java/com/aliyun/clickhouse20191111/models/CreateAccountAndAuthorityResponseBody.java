// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CreateAccountAndAuthorityResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAccountAndAuthorityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountAndAuthorityResponseBody self = new CreateAccountAndAuthorityResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAccountAndAuthorityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
