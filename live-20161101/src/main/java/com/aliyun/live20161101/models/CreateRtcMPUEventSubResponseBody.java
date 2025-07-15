// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateRtcMPUEventSubResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the subscription.</p>
     * 
     * <strong>example:</strong>
     * <p>Sub-<strong><strong><strong>9799B2C4500</strong></strong></strong></p>
     */
    @NameInMap("SubId")
    public String subId;

    public static CreateRtcMPUEventSubResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRtcMPUEventSubResponseBody self = new CreateRtcMPUEventSubResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRtcMPUEventSubResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRtcMPUEventSubResponseBody setSubId(String subId) {
        this.subId = subId;
        return this;
    }
    public String getSubId() {
        return this.subId;
    }

}
