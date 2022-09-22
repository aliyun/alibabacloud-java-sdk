// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class RenewDedicatedHostsResponseBody extends TeaModel {
    @NameInMap("DedicatedHostIdSets")
    public DedicatedHostIdSets dedicatedHostIdSets;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static RenewDedicatedHostsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewDedicatedHostsResponseBody self = new RenewDedicatedHostsResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewDedicatedHostsResponseBody setDedicatedHostIdSets(DedicatedHostIdSets dedicatedHostIdSets) {
        this.dedicatedHostIdSets = dedicatedHostIdSets;
        return this;
    }
    public DedicatedHostIdSets getDedicatedHostIdSets() {
        return this.dedicatedHostIdSets;
    }

    public RenewDedicatedHostsResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public RenewDedicatedHostsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DedicatedHostIdSets extends TeaModel {
        @NameInMap("DedicatedHostId")
        public java.util.List<String> dedicatedHostId;

        public static DedicatedHostIdSets build(java.util.Map<String, ?> map) throws Exception {
            DedicatedHostIdSets self = new DedicatedHostIdSets();
            return TeaModel.build(map, self);
        }

        public DedicatedHostIdSets setDedicatedHostId(java.util.List<String> dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public java.util.List<String> getDedicatedHostId() {
            return this.dedicatedHostId;
        }

    }

}
