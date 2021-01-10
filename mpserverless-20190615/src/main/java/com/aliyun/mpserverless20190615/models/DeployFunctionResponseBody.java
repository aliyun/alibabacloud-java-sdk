// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeployFunctionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeployFunctionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeployFunctionResponseBody self = new DeployFunctionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeployFunctionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
