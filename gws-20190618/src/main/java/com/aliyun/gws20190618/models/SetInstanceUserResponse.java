// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class SetInstanceUserResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SetInstanceUserResponse build(java.util.Map<String, ?> map) throws Exception {
        SetInstanceUserResponse self = new SetInstanceUserResponse();
        return TeaModel.build(map, self);
    }

    public SetInstanceUserResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
