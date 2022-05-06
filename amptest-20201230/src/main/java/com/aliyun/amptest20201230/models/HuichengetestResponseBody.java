// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengetestResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static HuichengetestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HuichengetestResponseBody self = new HuichengetestResponseBody();
        return TeaModel.build(map, self);
    }

    public HuichengetestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
