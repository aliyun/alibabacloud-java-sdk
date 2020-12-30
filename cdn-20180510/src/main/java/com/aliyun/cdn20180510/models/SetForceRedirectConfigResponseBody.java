// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetForceRedirectConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetForceRedirectConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetForceRedirectConfigResponseBody self = new SetForceRedirectConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetForceRedirectConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
