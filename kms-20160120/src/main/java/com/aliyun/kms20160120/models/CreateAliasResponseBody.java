// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateAliasResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAliasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAliasResponseBody self = new CreateAliasResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAliasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
