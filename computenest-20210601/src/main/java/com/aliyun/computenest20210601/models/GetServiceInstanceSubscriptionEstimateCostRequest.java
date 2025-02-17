// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class GetServiceInstanceSubscriptionEstimateCostRequest extends TeaModel {
    /**
     * <p>Ensures idempotence of the request. Generate a parameter value from your client to ensure its uniqueness across different requests. <strong>ClientToken</strong> supports only ASCII characters and cannot exceed 64 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Order type. Possible value: Renewal.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Renewal</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The renewal duration for all prepaid resources of the service instance. The unit is specified by PeriodUnit.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The time unit for the renewal duration of all prepaid resources of the service instance, which is the unit of the Period parameter. Valid values: Month, Year. Default value: Month.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Resource renewal configuration.</p>
     */
    @NameInMap("ResourcePeriod")
    public java.util.List<GetServiceInstanceSubscriptionEstimateCostRequestResourcePeriod> resourcePeriod;

    /**
     * <p>Service instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>si-d6ab3a63ccbb4b17****</p>
     */
    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    public static GetServiceInstanceSubscriptionEstimateCostRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceInstanceSubscriptionEstimateCostRequest self = new GetServiceInstanceSubscriptionEstimateCostRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceInstanceSubscriptionEstimateCostRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetServiceInstanceSubscriptionEstimateCostRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public GetServiceInstanceSubscriptionEstimateCostRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public GetServiceInstanceSubscriptionEstimateCostRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public GetServiceInstanceSubscriptionEstimateCostRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetServiceInstanceSubscriptionEstimateCostRequest setResourcePeriod(java.util.List<GetServiceInstanceSubscriptionEstimateCostRequestResourcePeriod> resourcePeriod) {
        this.resourcePeriod = resourcePeriod;
        return this;
    }
    public java.util.List<GetServiceInstanceSubscriptionEstimateCostRequestResourcePeriod> getResourcePeriod() {
        return this.resourcePeriod;
    }

    public GetServiceInstanceSubscriptionEstimateCostRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public static class GetServiceInstanceSubscriptionEstimateCostRequestResourcePeriod extends TeaModel {
        /**
         * <p>Renewal duration. The unit is specified by PeriodUnit.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The time unit for the resource renewal duration, which is the unit of the Period parameter. Valid values: Month, Year. Default value: Month.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        /**
         * <p>Resource ARN (Aliyun Resource Name).</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ecs:cn-guangzhou:1361753504587228:instance/i-7xv9pgeqvhxg10jji3vd</p>
         */
        @NameInMap("ResourceArn")
        public String resourceArn;

        public static GetServiceInstanceSubscriptionEstimateCostRequestResourcePeriod build(java.util.Map<String, ?> map) throws Exception {
            GetServiceInstanceSubscriptionEstimateCostRequestResourcePeriod self = new GetServiceInstanceSubscriptionEstimateCostRequestResourcePeriod();
            return TeaModel.build(map, self);
        }

        public GetServiceInstanceSubscriptionEstimateCostRequestResourcePeriod setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public GetServiceInstanceSubscriptionEstimateCostRequestResourcePeriod setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public GetServiceInstanceSubscriptionEstimateCostRequestResourcePeriod setResourceArn(String resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }
        public String getResourceArn() {
            return this.resourceArn;
        }

    }

}
