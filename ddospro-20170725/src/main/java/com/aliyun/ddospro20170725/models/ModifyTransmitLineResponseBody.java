// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class ModifyTransmitLineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyTransmitLineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTransmitLineResponseBody self = new ModifyTransmitLineResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTransmitLineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
