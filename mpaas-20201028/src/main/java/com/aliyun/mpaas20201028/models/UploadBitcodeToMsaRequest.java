// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UploadBitcodeToMsaRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Bitcode")
    public String bitcode;

    @NameInMap("License")
    public String license;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UploadBitcodeToMsaRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadBitcodeToMsaRequest self = new UploadBitcodeToMsaRequest();
        return TeaModel.build(map, self);
    }

    public UploadBitcodeToMsaRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UploadBitcodeToMsaRequest setBitcode(String bitcode) {
        this.bitcode = bitcode;
        return this;
    }
    public String getBitcode() {
        return this.bitcode;
    }

    public UploadBitcodeToMsaRequest setLicense(String license) {
        this.license = license;
        return this;
    }
    public String getLicense() {
        return this.license;
    }

    public UploadBitcodeToMsaRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UploadBitcodeToMsaRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
