// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class ReleaseLindormInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseLindormInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseLindormInstanceResponseBody self = new ReleaseLindormInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseLindormInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
