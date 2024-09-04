// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceAsyncManualScanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static VoiceAsyncManualScanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VoiceAsyncManualScanResponseBody self = new VoiceAsyncManualScanResponseBody();
        return TeaModel.build(map, self);
    }

    public VoiceAsyncManualScanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
