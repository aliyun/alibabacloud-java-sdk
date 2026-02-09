// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcubeHotpatchResourceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALIPUBE5C3F6D091419</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://mcube-prod.oss-cn-hangzhou.aliyuncs.com/cubecard/tempFileForOnex/ONEXE99ED22171502/preProd/TPHWQYXG/8a6177ce-d7c3-434e-8c62-676a54db9667/main.zip">https://mcube-prod.oss-cn-hangzhou.aliyuncs.com/cubecard/tempFileForOnex/ONEXE99ED22171502/preProd/TPHWQYXG/8a6177ce-d7c3-434e-8c62-676a54db9667/main.zip</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    @NameInMap("FixDesc")
    public String fixDesc;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OnexFlag")
    public Boolean onexFlag;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>iOS,Android</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("ProductVersion")
    public String productVersion;

    /**
     * <strong>example:</strong>
     * <p>ZXCXMAHQ</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateMcubeHotpatchResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeHotpatchResourceRequest self = new CreateMcubeHotpatchResourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateMcubeHotpatchResourceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateMcubeHotpatchResourceRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public CreateMcubeHotpatchResourceRequest setFixDesc(String fixDesc) {
        this.fixDesc = fixDesc;
        return this;
    }
    public String getFixDesc() {
        return this.fixDesc;
    }

    public CreateMcubeHotpatchResourceRequest setOnexFlag(Boolean onexFlag) {
        this.onexFlag = onexFlag;
        return this;
    }
    public Boolean getOnexFlag() {
        return this.onexFlag;
    }

    public CreateMcubeHotpatchResourceRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public CreateMcubeHotpatchResourceRequest setProductVersion(String productVersion) {
        this.productVersion = productVersion;
        return this;
    }
    public String getProductVersion() {
        return this.productVersion;
    }

    public CreateMcubeHotpatchResourceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateMcubeHotpatchResourceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
