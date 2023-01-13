// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AllocateDedicatedHostsResponseBody extends TeaModel {
    /**
     * <p>The IDs of the dedicated hosts.</p>
     */
    @NameInMap("DedicatedHostIdSets")
    public AllocateDedicatedHostsResponseBodyDedicatedHostIdSets dedicatedHostIdSets;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AllocateDedicatedHostsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocateDedicatedHostsResponseBody self = new AllocateDedicatedHostsResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocateDedicatedHostsResponseBody setDedicatedHostIdSets(AllocateDedicatedHostsResponseBodyDedicatedHostIdSets dedicatedHostIdSets) {
        this.dedicatedHostIdSets = dedicatedHostIdSets;
        return this;
    }
    public AllocateDedicatedHostsResponseBodyDedicatedHostIdSets getDedicatedHostIdSets() {
        return this.dedicatedHostIdSets;
    }

    public AllocateDedicatedHostsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AllocateDedicatedHostsResponseBodyDedicatedHostIdSets extends TeaModel {
        @NameInMap("DedicatedHostId")
        public java.util.List<String> dedicatedHostId;

        public static AllocateDedicatedHostsResponseBodyDedicatedHostIdSets build(java.util.Map<String, ?> map) throws Exception {
            AllocateDedicatedHostsResponseBodyDedicatedHostIdSets self = new AllocateDedicatedHostsResponseBodyDedicatedHostIdSets();
            return TeaModel.build(map, self);
        }

        public AllocateDedicatedHostsResponseBodyDedicatedHostIdSets setDedicatedHostId(java.util.List<String> dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public java.util.List<String> getDedicatedHostId() {
            return this.dedicatedHostId;
        }

    }

}
