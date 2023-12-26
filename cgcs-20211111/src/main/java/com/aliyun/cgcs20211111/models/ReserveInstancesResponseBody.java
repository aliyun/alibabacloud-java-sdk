// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ReserveInstancesResponseBody extends TeaModel {
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("RequestId")
    public String requestId;

    public static ReserveInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReserveInstancesResponseBody self = new ReserveInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ReserveInstancesResponseBody setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ReserveInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
