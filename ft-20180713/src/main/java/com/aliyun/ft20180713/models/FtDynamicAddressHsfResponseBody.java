// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FtDynamicAddressHsfResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static FtDynamicAddressHsfResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FtDynamicAddressHsfResponseBody self = new FtDynamicAddressHsfResponseBody();
        return TeaModel.build(map, self);
    }

    public FtDynamicAddressHsfResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
