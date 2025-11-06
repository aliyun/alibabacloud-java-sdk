// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UpdateMdsCubeResourceRequest extends TeaModel {
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
     * <p>url</p>
     */
    @NameInMap("MockDataUrl")
    public String mockDataUrl;

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
     * <p>1</p>
     */
    @NameInMap("TemplateResourceId")
    public Long templateResourceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ZXCXMAHQ-zh_CN</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dev</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateMdsCubeResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMdsCubeResourceRequest self = new UpdateMdsCubeResourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMdsCubeResourceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateMdsCubeResourceRequest setMockDataUrl(String mockDataUrl) {
        this.mockDataUrl = mockDataUrl;
        return this;
    }
    public String getMockDataUrl() {
        return this.mockDataUrl;
    }

    public UpdateMdsCubeResourceRequest setOnexFlag(Boolean onexFlag) {
        this.onexFlag = onexFlag;
        return this;
    }
    public Boolean getOnexFlag() {
        return this.onexFlag;
    }

    public UpdateMdsCubeResourceRequest setTemplateResourceId(Long templateResourceId) {
        this.templateResourceId = templateResourceId;
        return this;
    }
    public Long getTemplateResourceId() {
        return this.templateResourceId;
    }

    public UpdateMdsCubeResourceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateMdsCubeResourceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
