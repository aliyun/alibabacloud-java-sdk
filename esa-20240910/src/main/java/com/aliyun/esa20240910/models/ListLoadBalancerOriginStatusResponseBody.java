// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListLoadBalancerOriginStatusResponseBody extends TeaModel {
    @NameInMap("OriginStatus")
    public java.util.List<ListLoadBalancerOriginStatusResponseBodyOriginStatus> originStatus;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListLoadBalancerOriginStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLoadBalancerOriginStatusResponseBody self = new ListLoadBalancerOriginStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLoadBalancerOriginStatusResponseBody setOriginStatus(java.util.List<ListLoadBalancerOriginStatusResponseBodyOriginStatus> originStatus) {
        this.originStatus = originStatus;
        return this;
    }
    public java.util.List<ListLoadBalancerOriginStatusResponseBodyOriginStatus> getOriginStatus() {
        return this.originStatus;
    }

    public ListLoadBalancerOriginStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListLoadBalancerOriginStatusResponseBodyOriginStatus extends TeaModel {
        @NameInMap("LoadBalancerId")
        public Long loadBalancerId;

        @NameInMap("OriginId")
        public Long originId;

        @NameInMap("PoolId")
        public Long poolId;

        @NameInMap("PoolType")
        public String poolType;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("Status")
        public String status;

        public static ListLoadBalancerOriginStatusResponseBodyOriginStatus build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancerOriginStatusResponseBodyOriginStatus self = new ListLoadBalancerOriginStatusResponseBodyOriginStatus();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancerOriginStatusResponseBodyOriginStatus setLoadBalancerId(Long loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public Long getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public ListLoadBalancerOriginStatusResponseBodyOriginStatus setOriginId(Long originId) {
            this.originId = originId;
            return this;
        }
        public Long getOriginId() {
            return this.originId;
        }

        public ListLoadBalancerOriginStatusResponseBodyOriginStatus setPoolId(Long poolId) {
            this.poolId = poolId;
            return this;
        }
        public Long getPoolId() {
            return this.poolId;
        }

        public ListLoadBalancerOriginStatusResponseBodyOriginStatus setPoolType(String poolType) {
            this.poolType = poolType;
            return this;
        }
        public String getPoolType() {
            return this.poolType;
        }

        public ListLoadBalancerOriginStatusResponseBodyOriginStatus setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListLoadBalancerOriginStatusResponseBodyOriginStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
