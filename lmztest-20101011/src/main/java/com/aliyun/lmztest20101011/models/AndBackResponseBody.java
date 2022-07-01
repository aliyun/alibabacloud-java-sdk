// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class AndBackResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static AndBackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AndBackResponseBody self = new AndBackResponseBody();
        return TeaModel.build(map, self);
    }

    public AndBackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
