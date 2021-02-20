// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyCnameReuseResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCnameReuseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCnameReuseResponseBody self = new ModifyCnameReuseResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCnameReuseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
