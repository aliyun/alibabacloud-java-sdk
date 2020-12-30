// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetIgnoreQueryStringConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetIgnoreQueryStringConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetIgnoreQueryStringConfigResponseBody self = new SetIgnoreQueryStringConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetIgnoreQueryStringConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
