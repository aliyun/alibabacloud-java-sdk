// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ResetAccountPasswordResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ResetAccountPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetAccountPasswordResponse self = new ResetAccountPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ResetAccountPasswordResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
