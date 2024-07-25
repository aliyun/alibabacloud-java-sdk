// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class GetServiceProvisionsRequest extends TeaModel {
    /**
     * <p>The parameters configured for the service instance.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;RegionId\&quot;:\&quot;cn-hangzhou\&quot;,\&quot;ZoneId\&quot;:\&quot;cn-hangzhou-g\&quot;,\&quot;EcsInstanceType\&quot;:\&quot;ecs.g5.large\&quot;,\&quot;InstancePassword\&quot;:\&quot;xxxxxxxx\&quot;,\&quot;PayType\&quot;:\&quot;PostPaid\&quot;,\&quot;PayPeriodUnit\&quot;:\&quot;Month\&quot;,\&quot;PayPeriod\&quot;:1}</p>
     */
    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The service ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>service-0efc0db451794bxxxxxx</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The version of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ServiceVersion")
    public String serviceVersion;

    /**
     * <p>The template name.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The trial policy. Valid values:</p>
     * <ul>
     * <li>Trial: Trials are supported.</li>
     * <li>NotTrial: Trials are not supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Trial</p>
     */
    @NameInMap("TrialType")
    public String trialType;

    public static GetServiceProvisionsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceProvisionsRequest self = new GetServiceProvisionsRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceProvisionsRequest setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public GetServiceProvisionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetServiceProvisionsRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public GetServiceProvisionsRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public GetServiceProvisionsRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public GetServiceProvisionsRequest setTrialType(String trialType) {
        this.trialType = trialType;
        return this;
    }
    public String getTrialType() {
        return this.trialType;
    }

}
