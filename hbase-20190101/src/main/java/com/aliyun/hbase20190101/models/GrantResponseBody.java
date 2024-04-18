// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class GrantResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static GrantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GrantResponseBody self = new GrantResponseBody();
        return TeaModel.build(map, self);
    }

    public GrantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
