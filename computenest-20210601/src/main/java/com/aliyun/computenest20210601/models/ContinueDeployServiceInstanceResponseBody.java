// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ContinueDeployServiceInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ContinueDeployServiceInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ContinueDeployServiceInstanceResponseBody self = new ContinueDeployServiceInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ContinueDeployServiceInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
