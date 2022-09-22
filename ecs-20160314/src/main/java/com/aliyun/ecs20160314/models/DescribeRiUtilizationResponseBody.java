// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeRiUtilizationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Utilizations")
    public Utilizations utilizations;

    public static DescribeRiUtilizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiUtilizationResponseBody self = new DescribeRiUtilizationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRiUtilizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRiUtilizationResponseBody setUtilizations(Utilizations utilizations) {
        this.utilizations = utilizations;
        return this;
    }
    public Utilizations getUtilizations() {
        return this.utilizations;
    }

    public static class Utilization extends TeaModel {
        @NameInMap("ReservedInstanceId")
        public String reservedInstanceId;

        @NameInMap("Utilization")
        public String utilization;

        public static Utilization build(java.util.Map<String, ?> map) throws Exception {
            Utilization self = new Utilization();
            return TeaModel.build(map, self);
        }

        public Utilization setReservedInstanceId(String reservedInstanceId) {
            this.reservedInstanceId = reservedInstanceId;
            return this;
        }
        public String getReservedInstanceId() {
            return this.reservedInstanceId;
        }

        public Utilization setUtilization(String utilization) {
            this.utilization = utilization;
            return this;
        }
        public String getUtilization() {
            return this.utilization;
        }

    }

    public static class Utilizations extends TeaModel {
        @NameInMap("Utilization")
        public java.util.List<Utilization> utilization;

        public static Utilizations build(java.util.Map<String, ?> map) throws Exception {
            Utilizations self = new Utilizations();
            return TeaModel.build(map, self);
        }

        public Utilizations setUtilization(java.util.List<Utilization> utilization) {
            this.utilization = utilization;
            return this;
        }
        public java.util.List<Utilization> getUtilization() {
            return this.utilization;
        }

    }

}
