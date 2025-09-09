// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ValidateServiceInstanceNameRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsTrial")
    public Boolean isTrial;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>service-12xxxxxx</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("ServiceInstanceName")
    public String serviceInstanceName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ServiceVersion")
    public String serviceVersion;

    /**
     * <strong>example:</strong>
     * <p>模板一</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    public static ValidateServiceInstanceNameRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateServiceInstanceNameRequest self = new ValidateServiceInstanceNameRequest();
        return TeaModel.build(map, self);
    }

    public ValidateServiceInstanceNameRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ValidateServiceInstanceNameRequest setIsTrial(Boolean isTrial) {
        this.isTrial = isTrial;
        return this;
    }
    public Boolean getIsTrial() {
        return this.isTrial;
    }

    public ValidateServiceInstanceNameRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public ValidateServiceInstanceNameRequest setServiceInstanceName(String serviceInstanceName) {
        this.serviceInstanceName = serviceInstanceName;
        return this;
    }
    public String getServiceInstanceName() {
        return this.serviceInstanceName;
    }

    public ValidateServiceInstanceNameRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public ValidateServiceInstanceNameRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
