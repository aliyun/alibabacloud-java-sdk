// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeAutoProvisioningGroupCapacitiesResponseBody extends TeaModel {
    @NameInMap("Capacities")
    public Capacities capacities;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAutoProvisioningGroupCapacitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoProvisioningGroupCapacitiesResponseBody self = new DescribeAutoProvisioningGroupCapacitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAutoProvisioningGroupCapacitiesResponseBody setCapacities(Capacities capacities) {
        this.capacities = capacities;
        return this;
    }
    public Capacities getCapacities() {
        return this.capacities;
    }

    public DescribeAutoProvisioningGroupCapacitiesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAutoProvisioningGroupCapacitiesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAutoProvisioningGroupCapacitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAutoProvisioningGroupCapacitiesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class Capacity extends TeaModel {
        @NameInMap("AutoProvisioningGroupId")
        public String autoProvisioningGroupId;

        @NameInMap("PayAsYouGoCapacity")
        public String payAsYouGoCapacity;

        @NameInMap("SpotCapacity")
        public String spotCapacity;

        @NameInMap("TotalCapacity")
        public String totalCapacity;

        public static Capacity build(java.util.Map<String, ?> map) throws Exception {
            Capacity self = new Capacity();
            return TeaModel.build(map, self);
        }

        public Capacity setAutoProvisioningGroupId(String autoProvisioningGroupId) {
            this.autoProvisioningGroupId = autoProvisioningGroupId;
            return this;
        }
        public String getAutoProvisioningGroupId() {
            return this.autoProvisioningGroupId;
        }

        public Capacity setPayAsYouGoCapacity(String payAsYouGoCapacity) {
            this.payAsYouGoCapacity = payAsYouGoCapacity;
            return this;
        }
        public String getPayAsYouGoCapacity() {
            return this.payAsYouGoCapacity;
        }

        public Capacity setSpotCapacity(String spotCapacity) {
            this.spotCapacity = spotCapacity;
            return this;
        }
        public String getSpotCapacity() {
            return this.spotCapacity;
        }

        public Capacity setTotalCapacity(String totalCapacity) {
            this.totalCapacity = totalCapacity;
            return this;
        }
        public String getTotalCapacity() {
            return this.totalCapacity;
        }

    }

    public static class Capacities extends TeaModel {
        @NameInMap("Capacity")
        public java.util.List<Capacity> capacity;

        public static Capacities build(java.util.Map<String, ?> map) throws Exception {
            Capacities self = new Capacities();
            return TeaModel.build(map, self);
        }

        public Capacities setCapacity(java.util.List<Capacity> capacity) {
            this.capacity = capacity;
            return this;
        }
        public java.util.List<Capacity> getCapacity() {
            return this.capacity;
        }

    }

}
