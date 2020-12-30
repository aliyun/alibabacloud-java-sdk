// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class SetInstanceUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetInstanceUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetInstanceUserResponseBody self = new SetInstanceUserResponseBody();
        return TeaModel.build(map, self);
    }

    public SetInstanceUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
