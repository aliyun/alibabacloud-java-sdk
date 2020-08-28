// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AllocateDedicatedHostsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DedicatedHostIdSets")
    @Validation(required = true)
    public AllocateDedicatedHostsResponseDedicatedHostIdSets dedicatedHostIdSets;

    public static AllocateDedicatedHostsResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateDedicatedHostsResponse self = new AllocateDedicatedHostsResponse();
        return TeaModel.build(map, self);
    }

    public static class AllocateDedicatedHostsResponseDedicatedHostIdSets extends TeaModel {
        @NameInMap("DedicatedHostId")
        @Validation(required = true)
        public java.util.List<String> dedicatedHostId;

        public static AllocateDedicatedHostsResponseDedicatedHostIdSets build(java.util.Map<String, ?> map) throws Exception {
            AllocateDedicatedHostsResponseDedicatedHostIdSets self = new AllocateDedicatedHostsResponseDedicatedHostIdSets();
            return TeaModel.build(map, self);
        }

    }

}
