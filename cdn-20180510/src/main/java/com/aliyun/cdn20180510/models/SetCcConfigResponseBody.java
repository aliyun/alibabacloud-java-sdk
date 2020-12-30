// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetCcConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetCcConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetCcConfigResponseBody self = new SetCcConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetCcConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
