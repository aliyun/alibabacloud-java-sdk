// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class RetryClusterRequest extends TeaModel {
    @NameInMap("RequestPars")
    public String requestPars;

    @NameInMap("InstanceId")
    public String instanceId;

    public static RetryClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryClusterRequest self = new RetryClusterRequest();
        return TeaModel.build(map, self);
    }

    public RetryClusterRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

    public RetryClusterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
