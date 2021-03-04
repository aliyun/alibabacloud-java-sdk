// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class EnableKeyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EnableKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableKeyResponseBody self = new EnableKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
