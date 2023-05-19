// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class RollbackStagingConfigResponseBody extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to **RollbackStagingConfig**.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RollbackStagingConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RollbackStagingConfigResponseBody self = new RollbackStagingConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public RollbackStagingConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
