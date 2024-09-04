// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceAsyncScanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static VoiceAsyncScanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VoiceAsyncScanResponseBody self = new VoiceAsyncScanResponseBody();
        return TeaModel.build(map, self);
    }

    public VoiceAsyncScanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
