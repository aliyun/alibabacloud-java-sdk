// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UpdateMpaasAppInfoRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("IconFileUrl")
    public String iconFileUrl;

    @NameInMap("Identifier")
    public String identifier;

    @NameInMap("OnexFlag")
    public Boolean onexFlag;

    @NameInMap("SystemType")
    public String systemType;

    @NameInMap("TenantId")
    public String tenantId;

    public static UpdateMpaasAppInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMpaasAppInfoRequest self = new UpdateMpaasAppInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMpaasAppInfoRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateMpaasAppInfoRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateMpaasAppInfoRequest setIconFileUrl(String iconFileUrl) {
        this.iconFileUrl = iconFileUrl;
        return this;
    }
    public String getIconFileUrl() {
        return this.iconFileUrl;
    }

    public UpdateMpaasAppInfoRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public UpdateMpaasAppInfoRequest setOnexFlag(Boolean onexFlag) {
        this.onexFlag = onexFlag;
        return this;
    }
    public Boolean getOnexFlag() {
        return this.onexFlag;
    }

    public UpdateMpaasAppInfoRequest setSystemType(String systemType) {
        this.systemType = systemType;
        return this;
    }
    public String getSystemType() {
        return this.systemType;
    }

    public UpdateMpaasAppInfoRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
