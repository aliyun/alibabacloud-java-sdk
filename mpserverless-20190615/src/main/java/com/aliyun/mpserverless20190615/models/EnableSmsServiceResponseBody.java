// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class EnableSmsServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EnableSmsServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableSmsServiceResponseBody self = new EnableSmsServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableSmsServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
