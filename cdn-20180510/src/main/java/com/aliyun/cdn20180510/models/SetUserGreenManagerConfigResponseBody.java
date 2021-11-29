// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetUserGreenManagerConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetUserGreenManagerConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetUserGreenManagerConfigResponseBody self = new SetUserGreenManagerConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetUserGreenManagerConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
