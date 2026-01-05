// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DescribeCapacityReservationResponseBody extends TeaModel {
    @NameInMap("CapacityReservationState")
    public java.util.List<DescribeCapacityReservationResponseBodyCapacityReservationState> capacityReservationState;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DecreaseRequestsRemaining")
    public Integer decreaseRequestsRemaining;

    /**
     * <strong>example:</strong>
     * <p>2025-08-22 05:06:58</p>
     */
    @NameInMap("LastModifiedTime")
    public String lastModifiedTime;

    @NameInMap("MinimumLoadBalancerCapacity")
    public DescribeCapacityReservationResponseBodyMinimumLoadBalancerCapacity minimumLoadBalancerCapacity;

    /**
     * <strong>example:</strong>
     * <p>365F4154-92F6-4AE4-92F8-7FF3******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCapacityReservationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCapacityReservationResponseBody self = new DescribeCapacityReservationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCapacityReservationResponseBody setCapacityReservationState(java.util.List<DescribeCapacityReservationResponseBodyCapacityReservationState> capacityReservationState) {
        this.capacityReservationState = capacityReservationState;
        return this;
    }
    public java.util.List<DescribeCapacityReservationResponseBodyCapacityReservationState> getCapacityReservationState() {
        return this.capacityReservationState;
    }

    public DescribeCapacityReservationResponseBody setDecreaseRequestsRemaining(Integer decreaseRequestsRemaining) {
        this.decreaseRequestsRemaining = decreaseRequestsRemaining;
        return this;
    }
    public Integer getDecreaseRequestsRemaining() {
        return this.decreaseRequestsRemaining;
    }

    public DescribeCapacityReservationResponseBody setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public DescribeCapacityReservationResponseBody setMinimumLoadBalancerCapacity(DescribeCapacityReservationResponseBodyMinimumLoadBalancerCapacity minimumLoadBalancerCapacity) {
        this.minimumLoadBalancerCapacity = minimumLoadBalancerCapacity;
        return this;
    }
    public DescribeCapacityReservationResponseBodyMinimumLoadBalancerCapacity getMinimumLoadBalancerCapacity() {
        return this.minimumLoadBalancerCapacity;
    }

    public DescribeCapacityReservationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCapacityReservationResponseBodyCapacityReservationState extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-k</p>
         */
        @NameInMap("AvailabilityZone")
        public String availabilityZone;

        /**
         * <strong>example:</strong>
         * <p>50.0</p>
         */
        @NameInMap("EffectiveCapacityUnits")
        public Double effectiveCapacityUnits;

        /**
         * <strong>example:</strong>
         * <p>INSUFFICIENT_CAPACITY</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <strong>example:</strong>
         * <p>Provisioned</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeCapacityReservationResponseBodyCapacityReservationState build(java.util.Map<String, ?> map) throws Exception {
            DescribeCapacityReservationResponseBodyCapacityReservationState self = new DescribeCapacityReservationResponseBodyCapacityReservationState();
            return TeaModel.build(map, self);
        }

        public DescribeCapacityReservationResponseBodyCapacityReservationState setAvailabilityZone(String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public String getAvailabilityZone() {
            return this.availabilityZone;
        }

        public DescribeCapacityReservationResponseBodyCapacityReservationState setEffectiveCapacityUnits(Double effectiveCapacityUnits) {
            this.effectiveCapacityUnits = effectiveCapacityUnits;
            return this;
        }
        public Double getEffectiveCapacityUnits() {
            return this.effectiveCapacityUnits;
        }

        public DescribeCapacityReservationResponseBodyCapacityReservationState setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeCapacityReservationResponseBodyCapacityReservationState setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeCapacityReservationResponseBodyMinimumLoadBalancerCapacity extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CapacityUnits")
        public Integer capacityUnits;

        public static DescribeCapacityReservationResponseBodyMinimumLoadBalancerCapacity build(java.util.Map<String, ?> map) throws Exception {
            DescribeCapacityReservationResponseBodyMinimumLoadBalancerCapacity self = new DescribeCapacityReservationResponseBodyMinimumLoadBalancerCapacity();
            return TeaModel.build(map, self);
        }

        public DescribeCapacityReservationResponseBodyMinimumLoadBalancerCapacity setCapacityUnits(Integer capacityUnits) {
            this.capacityUnits = capacityUnits;
            return this;
        }
        public Integer getCapacityUnits() {
            return this.capacityUnits;
        }

    }

}
