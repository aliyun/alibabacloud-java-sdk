// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceSyncScanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static VoiceSyncScanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VoiceSyncScanResponseBody self = new VoiceSyncScanResponseBody();
        return TeaModel.build(map, self);
    }

    public VoiceSyncScanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
