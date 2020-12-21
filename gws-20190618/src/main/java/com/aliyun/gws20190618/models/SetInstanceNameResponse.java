// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class SetInstanceNameResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SetInstanceNameResponse build(java.util.Map<String, ?> map) throws Exception {
        SetInstanceNameResponse self = new SetInstanceNameResponse();
        return TeaModel.build(map, self);
    }

    public SetInstanceNameResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
