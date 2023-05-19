// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class UpdateCdnDeliverTaskResponseBody extends TeaModel {
    /**
     * <p>The parameters that specify the time interval at which the tracking task sends operations reports. The settings must be escaped in JSON.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCdnDeliverTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCdnDeliverTaskResponseBody self = new UpdateCdnDeliverTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCdnDeliverTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
