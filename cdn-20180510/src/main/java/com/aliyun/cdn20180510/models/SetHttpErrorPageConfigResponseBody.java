// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetHttpErrorPageConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetHttpErrorPageConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetHttpErrorPageConfigResponseBody self = new SetHttpErrorPageConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetHttpErrorPageConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
