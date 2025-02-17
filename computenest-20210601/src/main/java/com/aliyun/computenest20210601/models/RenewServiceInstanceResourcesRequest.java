// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class RenewServiceInstanceResourcesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The renewal duration for all prepaid resources in the service instance. The unit is specified by PeriodUnit.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The time unit for the renewal duration of all prepaid resources in the service instance, which is the unit for the Period parameter. Valid values: Month, Year. Default value: Month.</p>
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
     * <p>List of resource renewals.</p>
     */
    @NameInMap("ResourcePeriod")
    public java.util.List<RenewServiceInstanceResourcesRequestResourcePeriod> resourcePeriod;

    /**
     * <p>Service instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>si-b58c874912fc4294****</p>
     */
    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    public static RenewServiceInstanceResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewServiceInstanceResourcesRequest self = new RenewServiceInstanceResourcesRequest();
        return TeaModel.build(map, self);
    }

    public RenewServiceInstanceResourcesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RenewServiceInstanceResourcesRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public RenewServiceInstanceResourcesRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public RenewServiceInstanceResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RenewServiceInstanceResourcesRequest setResourcePeriod(java.util.List<RenewServiceInstanceResourcesRequestResourcePeriod> resourcePeriod) {
        this.resourcePeriod = resourcePeriod;
        return this;
    }
    public java.util.List<RenewServiceInstanceResourcesRequestResourcePeriod> getResourcePeriod() {
        return this.resourcePeriod;
    }

    public RenewServiceInstanceResourcesRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public static class RenewServiceInstanceResourcesRequestResourcePeriod extends TeaModel {
        /**
         * <p>The renewal duration for the resource. The unit is specified by PeriodUnit.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The time unit for the renewal duration of the resource, which is the unit for the Period parameter. Valid values: Month, Year. Default value: Month.</p>
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
         * <p>acs:ecs:cn-hongkong:1488317743351199:instance/i-j6c6f3lbky38o8rpeqw2</p>
         */
        @NameInMap("ResourceArn")
        public String resourceArn;

        public static RenewServiceInstanceResourcesRequestResourcePeriod build(java.util.Map<String, ?> map) throws Exception {
            RenewServiceInstanceResourcesRequestResourcePeriod self = new RenewServiceInstanceResourcesRequestResourcePeriod();
            return TeaModel.build(map, self);
        }

        public RenewServiceInstanceResourcesRequestResourcePeriod setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public RenewServiceInstanceResourcesRequestResourcePeriod setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public RenewServiceInstanceResourcesRequestResourcePeriod setResourceArn(String resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }
        public String getResourceArn() {
            return this.resourceArn;
        }

    }

}
