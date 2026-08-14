// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyTlsConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyTlsConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTlsConfigResponseBody self = new ModifyTlsConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTlsConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
