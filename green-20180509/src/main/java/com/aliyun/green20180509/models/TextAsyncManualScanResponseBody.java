// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class TextAsyncManualScanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static TextAsyncManualScanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TextAsyncManualScanResponseBody self = new TextAsyncManualScanResponseBody();
        return TeaModel.build(map, self);
    }

    public TextAsyncManualScanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
