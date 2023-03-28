// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceSpecResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceSpecResponseBody self = new ModifyInstanceSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
