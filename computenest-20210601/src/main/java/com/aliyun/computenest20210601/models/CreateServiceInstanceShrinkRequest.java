// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CreateServiceInstanceShrinkRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("ServiceVersion")
    public String serviceVersion;

    @NameInMap("Parameters")
    public String parametersShrink;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("EnableInstanceOps")
    public Boolean enableInstanceOps;

    @NameInMap("EnableAccountOps")
    public Boolean enableAccountOps;

    @NameInMap("TemplateName")
    public String templateName;

    public static CreateServiceInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceInstanceShrinkRequest self = new CreateServiceInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceInstanceShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateServiceInstanceShrinkRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public CreateServiceInstanceShrinkRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public CreateServiceInstanceShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

    public CreateServiceInstanceShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateServiceInstanceShrinkRequest setEnableInstanceOps(Boolean enableInstanceOps) {
        this.enableInstanceOps = enableInstanceOps;
        return this;
    }
    public Boolean getEnableInstanceOps() {
        return this.enableInstanceOps;
    }

    public CreateServiceInstanceShrinkRequest setEnableAccountOps(Boolean enableAccountOps) {
        this.enableAccountOps = enableAccountOps;
        return this;
    }
    public Boolean getEnableAccountOps() {
        return this.enableAccountOps;
    }

    public CreateServiceInstanceShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
