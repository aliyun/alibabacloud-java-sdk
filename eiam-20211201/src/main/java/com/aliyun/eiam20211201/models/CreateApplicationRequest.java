// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateApplicationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>application</p>
     */
    @NameInMap("ApplicationIdentityType")
    public String applicationIdentityType;

    /**
     * <p>The name of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Ram Account SSO</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>The type of the application source. Valid values:</p>
     * <ul>
     * <li>urn:alibaba:idaas:app:source:template: application template</li>
     * <li>urn:alibaba:idaas:app:source:standard: standard protocol</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>urn:alibaba:idaas:app:source:standard</p>
     */
    @NameInMap("ApplicationSourceType")
    public String applicationSourceType;

    /**
     * <p>The ID of the application template. This parameter is required if you set the ApplicationSourceType parameter to urn:alibaba:idaas:app:source:template.</p>
     * 
     * <strong>example:</strong>
     * <p>template_cloud_ram</p>
     */
    @NameInMap("ApplicationTemplateId")
    public String applicationTemplateId;

    /**
     * <p>The description of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>RAM user SSO application</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk2676xxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The URL of the application logo.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oss.cn-hangzhou.aliyuncs.com/logo.png">https://oss.cn-hangzhou.aliyuncs.com/logo.png</a></p>
     */
    @NameInMap("LogoUrl")
    public String logoUrl;

    /**
     * <p>The SSO protocol. Valid values:</p>
     * <ul>
     * <li>saml2: the SAML 2.0 protocol.</li>
     * <li>oidc: the OpenID Connect protocol.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>saml2</p>
     */
    @NameInMap("SsoType")
    public String ssoType;

    public static CreateApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationRequest self = new CreateApplicationRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationRequest setApplicationIdentityType(String applicationIdentityType) {
        this.applicationIdentityType = applicationIdentityType;
        return this;
    }
    public String getApplicationIdentityType() {
        return this.applicationIdentityType;
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
