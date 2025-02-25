// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListLoadBalancerOriginStatusResponseBody extends TeaModel {
    /**
     * <p>List of origin statuses under the load balancer.</p>
     */
    @NameInMap("OriginStatus")
    public java.util.List<ListLoadBalancerOriginStatusResponseBodyOriginStatus> originStatus;

    /**
     * <p>Request ID, used for tracking the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
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
        /**
         * <p>ID of the load balancer.</p>
         * 
         * <strong>example:</strong>
         * <p>99874066052****</p>
         */
        @NameInMap("LoadBalancerId")
        public Long loadBalancerId;

        /**
         * <p>ID of the origin.</p>
         * 
         * <strong>example:</strong>
         * <p>99750209487****</p>
         */
        @NameInMap("OriginId")
        public Long originId;

        /**
         * <p>ID of the source address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>99750209487****</p>
         */
        @NameInMap("PoolId")
        public Long poolId;

        /**
         * <p>The origin pool to which the source belongs, under this load balancer. Only \&quot;default_pool\&quot; (default address pool) will be displayed; other types will return an empty string.</p>
         * 
         * <strong>example:</strong>
         * <p>default_pool</p>
         */
        @NameInMap("PoolType")
        public String poolType;

        /**
         * <p>Reason for the probe failure.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP connection error</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>Status of the origin:</p>
         * <ul>
         * <li>Healthy(healthy): The probe result is available.</li>
         * <li>Unhealthy(unhealthy): The probe result is unavailable.</li>
         * <li>Unknown(unknown): Unknown, the monitor has not yet probed.</li>
         * <li>Undetected(undetected): The load balancer to which the origin belongs is not bound to a monitor.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>healthy</p>
         */
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
