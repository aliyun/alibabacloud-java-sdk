// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class FeedbackSessionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>01E1BC28-9155-59F0-BA7E-3706170DEF1B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static FeedbackSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FeedbackSessionResponseBody self = new FeedbackSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public FeedbackSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
