// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyAccountAuthorityResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyAccountAuthorityResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountAuthorityResponse self = new ModifyAccountAuthorityResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAccountAuthorityResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
