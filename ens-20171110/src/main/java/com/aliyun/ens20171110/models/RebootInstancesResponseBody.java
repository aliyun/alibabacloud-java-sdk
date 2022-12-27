// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RebootInstancesResponseBody extends TeaModel {
    @NameInMap("InstanceResponses")
    public java.util.List<InstanceOperateResponse> instanceResponses;

    @NameInMap("RequestId")
    public String requestId;

    public static RebootInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RebootInstancesResponseBody self = new RebootInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public RebootInstancesResponseBody setInstanceResponses(java.util.List<InstanceOperateResponse> instanceResponses) {
        this.instanceResponses = instanceResponses;
        return this;
    }
    public java.util.List<InstanceOperateResponse> getInstanceResponses() {
        return this.instanceResponses;
    }

    public RebootInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
