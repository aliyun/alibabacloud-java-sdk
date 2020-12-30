// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class SetInstanceNameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetInstanceNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetInstanceNameResponseBody self = new SetInstanceNameResponseBody();
        return TeaModel.build(map, self);
    }

    public SetInstanceNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
