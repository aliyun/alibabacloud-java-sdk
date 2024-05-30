// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetServiceEstimateCostShrinkRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Commodity")
    public String commodityShrink;

    @NameInMap("Parameters")
    public String parametersShrink;

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

    public static GetServiceEstimateCostShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceEstimateCostShrinkRequest self = new GetServiceEstimateCostShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceEstimateCostShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetServiceEstimateCostShrinkRequest setCommodityShrink(String commodityShrink) {
        this.commodityShrink = commodityShrink;
        return this;
    }
    public String getCommodityShrink() {
        return this.commodityShrink;
    }

    public GetServiceEstimateCostShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

    public GetServiceEstimateCostShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetServiceEstimateCostShrinkRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public GetServiceEstimateCostShrinkRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public GetServiceEstimateCostShrinkRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public GetServiceEstimateCostShrinkRequest setSpecificationName(String specificationName) {
        this.specificationName = specificationName;
        return this;
    }
    public String getSpecificationName() {
        return this.specificationName;
    }

    public GetServiceEstimateCostShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
