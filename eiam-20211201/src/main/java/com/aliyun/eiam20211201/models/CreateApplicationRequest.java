// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateApplicationRequest extends TeaModel {
    /**
     * <p>The name of the application.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>The type of the application source. Valid values:</p>
     * <br>
     * <p>*   urn:alibaba:idaas:app:source:template: application template</p>
     * <p>*   urn:alibaba:idaas:app:source:standard: standard protocol</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationSourceType")
    public String applicationSourceType;

    /**
     * <p>The ID of the application template. This parameter is required if you set the ApplicationSourceType parameter to urn:alibaba:idaas:app:source:template.</p>
     */
    @NameInMap("ApplicationTemplateId")
    public String applicationTemplateId;

    /**
     * <p>The description of the application.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The URL of the application logo.</p>
     */
    @NameInMap("LogoUrl")
    public String logoUrl;

    /**
     * <p>The SSO protocol. Valid values:</p>
     * <br>
     * <p>*   saml2: the SAML 2.0 protocol.</p>
     * <p>*   oidc: the OpenID Connect protocol.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SsoType")
    public String ssoType;

    public static CreateApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationRequest self = new CreateApplicationRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public CreateApplicationRequest setApplicationSourceType(String applicationSourceType) {
        this.applicationSourceType = applicationSourceType;
        return this;
    }
    public String getApplicationSourceType() {
        return this.applicationSourceType;
    }

    public CreateApplicationRequest setApplicationTemplateId(String applicationTemplateId) {
        this.applicationTemplateId = applicationTemplateId;
        return this;
    }
    public String getApplicationTemplateId() {
        return this.applicationTemplateId;
    }

    public CreateApplicationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApplicationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateApplicationRequest setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }
    public String getLogoUrl() {
        return this.logoUrl;
    }

    public CreateApplicationRequest setSsoType(String ssoType) {
        this.ssoType = ssoType;
        return this;
    }
    public String getSsoType() {
        return this.ssoType;
    }

}
