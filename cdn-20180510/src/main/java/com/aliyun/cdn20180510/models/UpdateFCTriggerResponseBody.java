// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class UpdateFCTriggerResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EC046C5D-8CB4-4B6B-B7F8-B335E51EF90E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateFCTriggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFCTriggerResponseBody self = new UpdateFCTriggerResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFCTriggerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
