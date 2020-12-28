// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AllocateDedicatedHostsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DedicatedHostIdSets")
    public java.util.List<String> dedicatedHostIdSets;

    public static AllocateDedicatedHostsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocateDedicatedHostsResponseBody self = new AllocateDedicatedHostsResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocateDedicatedHostsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AllocateDedicatedHostsResponseBody setDedicatedHostIdSets(java.util.List<String> dedicatedHostIdSets) {
        this.dedicatedHostIdSets = dedicatedHostIdSets;
        return this;
    }
    public java.util.List<String> getDedicatedHostIdSets() {
        return this.dedicatedHostIdSets;
    }

}
