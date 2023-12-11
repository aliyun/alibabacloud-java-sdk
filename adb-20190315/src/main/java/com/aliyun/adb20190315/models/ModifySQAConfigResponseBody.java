// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifySQAConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySQAConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySQAConfigResponseBody self = new ModifySQAConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySQAConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
