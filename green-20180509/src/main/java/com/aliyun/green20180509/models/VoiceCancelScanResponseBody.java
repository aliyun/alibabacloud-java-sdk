// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceCancelScanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static VoiceCancelScanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VoiceCancelScanResponseBody self = new VoiceCancelScanResponseBody();
        return TeaModel.build(map, self);
    }

    public VoiceCancelScanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
