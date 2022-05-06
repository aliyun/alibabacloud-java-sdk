// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static HuichengetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HuichengetResponseBody self = new HuichengetResponseBody();
        return TeaModel.build(map, self);
    }

    public HuichengetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
