// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyBlockStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyBlockStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyBlockStatusResponseBody self = new ModifyBlockStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyBlockStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
