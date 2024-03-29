// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class RetryUserProvisioningEventResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RetryUserProvisioningEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetryUserProvisioningEventResponseBody self = new RetryUserProvisioningEventResponseBody();
        return TeaModel.build(map, self);
    }

    public RetryUserProvisioningEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
