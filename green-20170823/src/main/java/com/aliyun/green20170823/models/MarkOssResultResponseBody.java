// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class MarkOssResultResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static MarkOssResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MarkOssResultResponseBody self = new MarkOssResultResponseBody();
        return TeaModel.build(map, self);
    }

    public MarkOssResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
