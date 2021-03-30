// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class ModifyProductResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyProductResponseBody self = new ModifyProductResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
