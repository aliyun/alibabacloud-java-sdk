// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class GetClusterDetailRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetClusterDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterDetailRequest self = new GetClusterDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
