// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateApplicationInfoRequest extends TeaModel {
    /**
     * <p>IDaaS的应用主键id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>应用的表示名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Ram Account SSO</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    @NameInMap("ApplicationVisibility")
    public java.util.List<String> applicationVisibility;

    /**
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>IDaaS EIAM的实例id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>应用Logo地址</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.aliyuncs.com/logo.png">https://example.aliyuncs.com/logo.png</a></p>
     */
    @NameInMap("LogoUrl")
    public String logoUrl;

    public static UpdateApplicationInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationInfoRequest self = new UpdateApplicationInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationInfoRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpdateApplicationInfoRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public UpdateApplicationInfoRequest setApplicationVisibility(java.util.List<String> applicationVisibility) {
        this.applicationVisibility = applicationVisibility;
        return this;
    }
    public java.util.List<String> getApplicationVisibility() {
        return this.applicationVisibility;
    }

    public UpdateApplicationInfoRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateApplicationInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateApplicationInfoRequest setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }
    public String getLogoUrl() {
        return this.logoUrl;
    }

}
