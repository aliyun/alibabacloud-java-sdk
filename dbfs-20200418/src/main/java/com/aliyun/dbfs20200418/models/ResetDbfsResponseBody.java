// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ResetDbfsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ResetDbfsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetDbfsResponseBody self = new ResetDbfsResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetDbfsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
