// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetServiceEstimateCostRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>mRdxWuW2ts</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Commodity")
    public GetServiceEstimateCostRequestCommodity commodity;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;PayType\&quot;:\&quot;PostPaid\&quot;,\&quot;InstancePassword\&quot;:\&quot;xxxxxxxxxx\&quot;,\&quot;EcsInstanceType\&quot;:\&quot;ecs.g6.large\&quot;,\&quot;VSwitchId\&quot;:\&quot;vsw-0jlueyydpuekoxxxxxxxx\&quot;,\&quot;VpcId\&quot;:\&quot;vpc-0jlps6mjbgvpqxxxxxxxx\&quot;,\&quot;ZoneId\&quot;:\&quot;cn-wulanchabu-a\&quot;,\&quot;Enable\&quot;:false,\&quot;RegionId\&quot;:\&quot;cn-wulanchabu\&quot;}</p>
     */
    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

    /**
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>service-16fbd358d75e49xxxxxx</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <strong>example:</strong>
     * <p>si-d6ab3a63ccbb4b17****</p>
     */
    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    /**
     * <strong>example:</strong>
     * <p>draft</p>
     */
    @NameInMap("ServiceVersion")
    public String serviceVersion;

    @NameInMap("SpecificationName")
    public String specificationName;

    /**
     * <strong>example:</strong>
     * <p>Custom_Image_Ecs</p>
     */
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
