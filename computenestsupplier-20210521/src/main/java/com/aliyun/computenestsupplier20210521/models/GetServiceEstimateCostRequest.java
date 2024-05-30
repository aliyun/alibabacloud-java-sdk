// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetServiceEstimateCostRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Commodity")
    public GetServiceEstimateCostRequestCommodity commodity;

    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    @NameInMap("ServiceVersion")
    public String serviceVersion;

    @NameInMap("SpecificationName")
    public String specificationName;

    @NameInMap("TemplateName")
    public String templateName;

    public static GetServiceEstimateCostRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceEstimateCostRequest self = new GetServiceEstimateCostRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceEstimateCostRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetServiceEstimateCostRequest setCommodity(GetServiceEstimateCostRequestCommodity commodity) {
        this.commodity = commodity;
        return this;
    }
    public GetServiceEstimateCostRequestCommodity getCommodity() {
        return this.commodity;
    }

    public GetServiceEstimateCostRequest setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public GetServiceEstimateCostRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetServiceEstimateCostRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public GetServiceEstimateCostRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public GetServiceEstimateCostRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public GetServiceEstimateCostRequest setSpecificationName(String specificationName) {
        this.specificationName = specificationName;
        return this;
    }
    public String getSpecificationName() {
        return this.specificationName;
    }

    public GetServiceEstimateCostRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public static class GetServiceEstimateCostRequestCommodity extends TeaModel {
        @NameInMap("PayPeriod")
        public Integer payPeriod;

        @NameInMap("PayPeriodUnit")
        public String payPeriodUnit;

        public static GetServiceEstimateCostRequestCommodity build(java.util.Map<String, ?> map) throws Exception {
            GetServiceEstimateCostRequestCommodity self = new GetServiceEstimateCostRequestCommodity();
            return TeaModel.build(map, self);
        }

        public GetServiceEstimateCostRequestCommodity setPayPeriod(Integer payPeriod) {
            this.payPeriod = payPeriod;
            return this;
        }
        public Integer getPayPeriod() {
            return this.payPeriod;
        }

        public GetServiceEstimateCostRequestCommodity setPayPeriodUnit(String payPeriodUnit) {
            this.payPeriodUnit = payPeriodUnit;
            return this;
        }
        public String getPayPeriodUnit() {
            return this.payPeriodUnit;
        }

    }

}
