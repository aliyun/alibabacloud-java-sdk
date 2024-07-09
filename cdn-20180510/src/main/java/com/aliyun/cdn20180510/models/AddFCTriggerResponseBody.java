// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class AddFCTriggerResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EC046C5D-8CB4-4B6B-B7F8-B335E51EF90</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddFCTriggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddFCTriggerResponseBody self = new AddFCTriggerResponseBody();
        return TeaModel.build(map, self);
    }

    public AddFCTriggerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
