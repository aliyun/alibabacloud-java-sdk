// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateApplicationRequest extends TeaModel {
    /**
     * <p>The application identity type. Default value: application. Valid values:</p>
     * <ul>
     * <li>application: application.</li>
     * <li>agent: agent.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>application</p>
     */
    @NameInMap("ApplicationIdentityType")
    public String applicationIdentityType;

    /**
     * <p>The application name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Ram Account SSO</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    @NameInMap("ApplicationOwner")
    public CreateApplicationRequestApplicationOwner applicationOwner;

    /**
     * <p>The source from which the application is created. Valid values:</p>
     * <ul>
     * <li>urn:alibaba:idaas:app:source:template: application template.</li>
     * <li>urn:alibaba:idaas:app:source:standard: standard protocol.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>urn:alibaba:idaas:app:source:standard</p>
     */
    @NameInMap("ApplicationSourceType")
    public String applicationSourceType;

    /**
     * <p>The application template ID. This parameter is required when ApplicationSourceType is set to urn:alibaba:idaas:app:source:template.</p>
     * 
     * <strong>example:</strong>
     * <p>apt_ramuser_mjqrsi</p>
     */
    @NameInMap("ApplicationTemplateId")
    public String applicationTemplateId;

    @NameInMap("CustomFields")
    public java.util.List<CreateApplicationRequestCustomFields> customFields;

    /**
     * <p>The application description.</p>
     * 
     * <strong>example:</strong>
     * <p>RAM account SSO application</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The instance ID.</p>
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
     * <p>The single sign-on protocol. Valid values:</p>
     * <ul>
     * <li>saml2: SAML 2.0 protocol.</li>
     * <li>oidc: OpenID Connect protocol.</li>
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

    public CreateApplicationRequest setApplicationOwner(CreateApplicationRequestApplicationOwner applicationOwner) {
        this.applicationOwner = applicationOwner;
        return this;
    }
    public CreateApplicationRequestApplicationOwner getApplicationOwner() {
        return this.applicationOwner;
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

    public CreateApplicationRequest setCustomFields(java.util.List<CreateApplicationRequestCustomFields> customFields) {
        this.customFields = customFields;
        return this;
    }
    public java.util.List<CreateApplicationRequestCustomFields> getCustomFields() {
        return this.customFields;
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

    public static class CreateApplicationRequestApplicationOwner extends TeaModel {
        @NameInMap("GroupIds")
        public java.util.List<String> groupIds;

        @NameInMap("UserIds")
        public java.util.List<String> userIds;

        public static CreateApplicationRequestApplicationOwner build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationRequestApplicationOwner self = new CreateApplicationRequestApplicationOwner();
            return TeaModel.build(map, self);
        }

        public CreateApplicationRequestApplicationOwner setGroupIds(java.util.List<String> groupIds) {
            this.groupIds = groupIds;
            return this;
        }
        public java.util.List<String> getGroupIds() {
            return this.groupIds;
        }

        public CreateApplicationRequestApplicationOwner setUserIds(java.util.List<String> userIds) {
            this.userIds = userIds;
            return this;
        }
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

    }

    public static class CreateApplicationRequestCustomFields extends TeaModel {
        @NameInMap("FieldName")
        public String fieldName;

        @NameInMap("FieldValue")
        public String fieldValue;

        public static CreateApplicationRequestCustomFields build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationRequestCustomFields self = new CreateApplicationRequestCustomFields();
            return TeaModel.build(map, self);
        }

        public CreateApplicationRequestCustomFields setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public CreateApplicationRequestCustomFields setFieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            return this;
        }
        public String getFieldValue() {
            return this.fieldValue;
        }

    }

}
