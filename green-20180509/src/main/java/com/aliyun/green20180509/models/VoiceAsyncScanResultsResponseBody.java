// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceAsyncScanResultsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static VoiceAsyncScanResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VoiceAsyncScanResultsResponseBody self = new VoiceAsyncScanResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public VoiceAsyncScanResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
