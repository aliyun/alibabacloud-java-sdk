// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetErrorPageConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetErrorPageConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetErrorPageConfigResponseBody self = new SetErrorPageConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetErrorPageConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
