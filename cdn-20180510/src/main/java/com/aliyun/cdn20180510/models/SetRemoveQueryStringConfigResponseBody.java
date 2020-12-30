// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetRemoveQueryStringConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetRemoveQueryStringConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetRemoveQueryStringConfigResponseBody self = new SetRemoveQueryStringConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetRemoveQueryStringConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
