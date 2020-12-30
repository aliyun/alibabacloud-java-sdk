// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetHttpHeaderConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetHttpHeaderConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetHttpHeaderConfigResponseBody self = new SetHttpHeaderConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetHttpHeaderConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
