// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class EnableExtensionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EnableExtensionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableExtensionResponseBody self = new EnableExtensionResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableExtensionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
