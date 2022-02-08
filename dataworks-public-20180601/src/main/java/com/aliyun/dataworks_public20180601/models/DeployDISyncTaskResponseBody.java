// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class DeployDISyncTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeployDISyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeployDISyncTaskResponseBody self = new DeployDISyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeployDISyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
