// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeployFunctionFileResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeployFunctionFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeployFunctionFileResponseBody self = new DeployFunctionFileResponseBody();
        return TeaModel.build(map, self);
    }

    public DeployFunctionFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
