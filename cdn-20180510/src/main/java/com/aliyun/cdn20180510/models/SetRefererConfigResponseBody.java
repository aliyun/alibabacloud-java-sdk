// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetRefererConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetRefererConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetRefererConfigResponseBody self = new SetRefererConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetRefererConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
