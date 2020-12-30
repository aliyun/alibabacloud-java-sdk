// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetSourceHostConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetSourceHostConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetSourceHostConfigResponseBody self = new SetSourceHostConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetSourceHostConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
