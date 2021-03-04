// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateAliasResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAliasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAliasResponseBody self = new UpdateAliasResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAliasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
