// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ExportMappCenterAppConfigRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("CertRsaBase64")
    public String certRsaBase64;

    @NameInMap("Identifier")
    public String identifier;

    @NameInMap("OnexFlag")
    public Boolean onexFlag;

    @NameInMap("SystemType")
    public String systemType;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ExportMappCenterAppConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportMappCenterAppConfigRequest self = new ExportMappCenterAppConfigRequest();
        return TeaModel.build(map, self);
    }

    public ExportMappCenterAppConfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ExportMappCenterAppConfigRequest setCertRsaBase64(String certRsaBase64) {
        this.certRsaBase64 = certRsaBase64;
        return this;
    }
    public String getCertRsaBase64() {
        return this.certRsaBase64;
    }

    public ExportMappCenterAppConfigRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public ExportMappCenterAppConfigRequest setOnexFlag(Boolean onexFlag) {
        this.onexFlag = onexFlag;
        return this;
    }
    public Boolean getOnexFlag() {
        return this.onexFlag;
    }

    public ExportMappCenterAppConfigRequest setSystemType(String systemType) {
        this.systemType = systemType;
        return this;
    }
    public String getSystemType() {
        return this.systemType;
    }

    public ExportMappCenterAppConfigRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
