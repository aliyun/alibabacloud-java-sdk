// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyPortAutoCcStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyPortAutoCcStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPortAutoCcStatusResponseBody self = new ModifyPortAutoCcStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPortAutoCcStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
