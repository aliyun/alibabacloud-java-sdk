// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class RollbackDcdnStagingConfigResponseBody extends TeaModel {
    /**
     * <p>The accelerated domain name. You can specify only one domain name in each call.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RollbackDcdnStagingConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RollbackDcdnStagingConfigResponseBody self = new RollbackDcdnStagingConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public RollbackDcdnStagingConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
