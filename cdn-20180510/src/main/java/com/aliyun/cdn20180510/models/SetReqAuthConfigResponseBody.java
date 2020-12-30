// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetReqAuthConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetReqAuthConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetReqAuthConfigResponseBody self = new SetReqAuthConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetReqAuthConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
