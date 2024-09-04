// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class TextScanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static TextScanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TextScanResponseBody self = new TextScanResponseBody();
        return TeaModel.build(map, self);
    }

    public TextScanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
