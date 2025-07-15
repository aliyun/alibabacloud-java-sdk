// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateRtcMPUEventSubResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateRtcMPUEventSubResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRtcMPUEventSubResponseBody self = new UpdateRtcMPUEventSubResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRtcMPUEventSubResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
