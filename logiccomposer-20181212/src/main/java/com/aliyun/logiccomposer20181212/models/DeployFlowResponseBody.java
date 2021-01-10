// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class DeployFlowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeployFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeployFlowResponseBody self = new DeployFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public DeployFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
