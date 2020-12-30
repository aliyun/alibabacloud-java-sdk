// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetForwardSchemeConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetForwardSchemeConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetForwardSchemeConfigResponseBody self = new SetForwardSchemeConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetForwardSchemeConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
