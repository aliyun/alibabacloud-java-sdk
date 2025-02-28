// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GenerateDefaultServiceTestConfigRequest extends TeaModel {
    /**
     * <p>The service ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>service-41ad58439b4b4bf8ae73</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The service version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>draft</p>
     */
    @NameInMap("ServiceVersion")
    public String serviceVersion;

    /**
     * <p>The template name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-1</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    public static GenerateDefaultServiceTestConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateDefaultServiceTestConfigRequest self = new GenerateDefaultServiceTestConfigRequest();
        return TeaModel.build(map, self);
    }

    public GenerateDefaultServiceTestConfigRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public GenerateDefaultServiceTestConfigRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public GenerateDefaultServiceTestConfigRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
