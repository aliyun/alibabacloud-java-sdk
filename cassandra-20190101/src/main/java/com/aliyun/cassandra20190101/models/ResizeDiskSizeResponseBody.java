// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class ResizeDiskSizeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ResizeDiskSizeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResizeDiskSizeResponseBody self = new ResizeDiskSizeResponseBody();
        return TeaModel.build(map, self);
    }

    public ResizeDiskSizeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
