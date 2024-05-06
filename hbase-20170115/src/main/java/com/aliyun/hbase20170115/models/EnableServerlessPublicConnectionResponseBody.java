// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class EnableServerlessPublicConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EnableServerlessPublicConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableServerlessPublicConnectionResponseBody self = new EnableServerlessPublicConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableServerlessPublicConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
