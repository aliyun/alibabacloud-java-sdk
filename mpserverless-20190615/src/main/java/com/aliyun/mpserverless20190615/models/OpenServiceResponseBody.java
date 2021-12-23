// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class OpenServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static OpenServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenServiceResponseBody self = new OpenServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
