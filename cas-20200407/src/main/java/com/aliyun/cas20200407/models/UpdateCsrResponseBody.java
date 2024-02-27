// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UpdateCsrResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCsrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCsrResponseBody self = new UpdateCsrResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCsrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
