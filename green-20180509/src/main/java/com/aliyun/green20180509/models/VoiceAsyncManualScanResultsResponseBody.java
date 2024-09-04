// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceAsyncManualScanResultsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static VoiceAsyncManualScanResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VoiceAsyncManualScanResultsResponseBody self = new VoiceAsyncManualScanResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public VoiceAsyncManualScanResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
