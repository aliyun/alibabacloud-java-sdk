// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class SetPersonResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetPersonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetPersonResponseBody self = new SetPersonResponseBody();
        return TeaModel.build(map, self);
    }

    public SetPersonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
