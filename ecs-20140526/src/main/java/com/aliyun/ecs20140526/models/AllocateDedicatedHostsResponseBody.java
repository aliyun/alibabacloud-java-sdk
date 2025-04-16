// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AllocateDedicatedHostsResponseBody extends TeaModel {
    /**
     * <p>A list of dedicated host IDs.</p>
     */
    @NameInMap("DedicatedHostIdSets")
    public AllocateDedicatedHostsResponseBodyDedicatedHostIdSets dedicatedHostIdSets;

    /**
     * <p>The ID of the order.</p>
     * <blockquote>
     * <p> This parameter has a return value only when the dedicated host is a subscription one (request parameter <strong>ChargeType set to PrePaid</strong>).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>23841229****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E2A664A6-2933-4C64-88AE-5033D003****</p>
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

    public AllocateDedicatedHostsResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
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
