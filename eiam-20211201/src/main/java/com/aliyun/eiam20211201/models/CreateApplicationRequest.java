// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateApplicationRequest extends TeaModel {
    /**
     * <p>应用的表示名称</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>创建应用的来源类型，标准协议 or 模板应用 or 自建应用</p>
     */
    @NameInMap("ApplicationSourceType")
    public String applicationSourceType;

    /**
     * <p>应用创建来源为模板应用时必须指定</p>
     */
    @NameInMap("ApplicationTemplateId")
    public String applicationTemplateId;

    /**
     * <p>应用的描述信息</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>IDaaS EIAM的实例id</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>应用Logo地址</p>
     */
    @NameInMap("LogoUrl")
    public String logoUrl;

    /**
     * <p>单点登录类型，saml2 or oidc</p>
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
