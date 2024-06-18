// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetServiceEstimateCostShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>mRdxWuW2ts</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Commodity")
    public String commodityShrink;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;PayType\&quot;:\&quot;PostPaid\&quot;,\&quot;InstancePassword\&quot;:\&quot;xxxxxxxxxx\&quot;,\&quot;EcsInstanceType\&quot;:\&quot;ecs.g6.large\&quot;,\&quot;VSwitchId\&quot;:\&quot;vsw-0jlueyydpuekoxxxxxxxx\&quot;,\&quot;VpcId\&quot;:\&quot;vpc-0jlps6mjbgvpqxxxxxxxx\&quot;,\&quot;ZoneId\&quot;:\&quot;cn-wulanchabu-a\&quot;,\&quot;Enable\&quot;:false,\&quot;RegionId\&quot;:\&quot;cn-wulanchabu\&quot;}</p>
     */
    @NameInMap("Parameters")
    public String parametersShrink;

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
