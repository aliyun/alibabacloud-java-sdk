// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMdsCubeResourceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0.0.0.1</p>
     */
    @NameInMap("AndroidMaxVersion")
    public String androidMaxVersion;

    /**
     * <strong>example:</strong>
     * <p>0.0.0.1</p>
     */
    @NameInMap("AndroidMinVersion")
    public String androidMinVersion;

    /**
     * <strong>example:</strong>
     * <p>ALIPUBE5C3F6D091419</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ExtendInfo")
    public String extendInfo;

    /**
     * <strong>example:</strong>
     * <p>url</p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <strong>example:</strong>
     * <p>0.0.0.1</p>
     */
    @NameInMap("IosMaxVersion")
    public String iosMaxVersion;

    /**
     * <strong>example:</strong>
     * <p>0.0.0.1</p>
     */
    @NameInMap("IosMinVersion")
    public String iosMinVersion;

    /**
     * <strong>example:</strong>
     * <p>url</p>
     */
    @NameInMap("MockDataUrl")
    public String mockDataUrl;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OnexFlag")
    public Boolean onexFlag;

    /**
     * <strong>example:</strong>
     * <p>Android,iOS</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <strong>example:</strong>
     * <p>url</p>
     */
    @NameInMap("PreviewPictureUrl")
    public String previewPictureUrl;

    /**
     * <strong>example:</strong>
     * <p>tempalte_test</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <strong>example:</strong>
     * <p>resource desc</p>
     */
    @NameInMap("TemplateResourceDesc")
    public String templateResourceDesc;

    /**
     * <strong>example:</strong>
     * <p>0.0.0.1</p>
     */
    @NameInMap("TemplateResourceVersion")
    public String templateResourceVersion;

    /**
     * <strong>example:</strong>
     * <p>LZFPEFIM-zh_CN</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <strong>example:</strong>
     * <p>dev</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateMdsCubeResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMdsCubeResourceRequest self = new CreateMdsCubeResourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateMdsCubeResourceRequest setAndroidMaxVersion(String androidMaxVersion) {
        this.androidMaxVersion = androidMaxVersion;
        return this;
    }
    public String getAndroidMaxVersion() {
        return this.androidMaxVersion;
    }

    public CreateMdsCubeResourceRequest setAndroidMinVersion(String androidMinVersion) {
        this.androidMinVersion = androidMinVersion;
        return this;
    }
    public String getAndroidMinVersion() {
        return this.androidMinVersion;
    }

    public CreateMdsCubeResourceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateMdsCubeResourceRequest setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

    public CreateMdsCubeResourceRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public CreateMdsCubeResourceRequest setIosMaxVersion(String iosMaxVersion) {
        this.iosMaxVersion = iosMaxVersion;
        return this;
    }
    public String getIosMaxVersion() {
        return this.iosMaxVersion;
    }

    public CreateMdsCubeResourceRequest setIosMinVersion(String iosMinVersion) {
        this.iosMinVersion = iosMinVersion;
        return this;
    }
    public String getIosMinVersion() {
        return this.iosMinVersion;
    }

    public CreateMdsCubeResourceRequest setMockDataUrl(String mockDataUrl) {
        this.mockDataUrl = mockDataUrl;
        return this;
    }
    public String getMockDataUrl() {
        return this.mockDataUrl;
    }

    public CreateMdsCubeResourceRequest setOnexFlag(Boolean onexFlag) {
        this.onexFlag = onexFlag;
        return this;
    }
    public Boolean getOnexFlag() {
        return this.onexFlag;
    }

    public CreateMdsCubeResourceRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public CreateMdsCubeResourceRequest setPreviewPictureUrl(String previewPictureUrl) {
        this.previewPictureUrl = previewPictureUrl;
        return this;
    }
    public String getPreviewPictureUrl() {
        return this.previewPictureUrl;
    }

    public CreateMdsCubeResourceRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateMdsCubeResourceRequest setTemplateResourceDesc(String templateResourceDesc) {
        this.templateResourceDesc = templateResourceDesc;
        return this;
    }
    public String getTemplateResourceDesc() {
        return this.templateResourceDesc;
    }

    public CreateMdsCubeResourceRequest setTemplateResourceVersion(String templateResourceVersion) {
        this.templateResourceVersion = templateResourceVersion;
        return this;
    }
    public String getTemplateResourceVersion() {
        return this.templateResourceVersion;
    }

    public CreateMdsCubeResourceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateMdsCubeResourceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
