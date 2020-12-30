// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetConfigOfVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetConfigOfVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetConfigOfVersionResponseBody self = new SetConfigOfVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public SetConfigOfVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
