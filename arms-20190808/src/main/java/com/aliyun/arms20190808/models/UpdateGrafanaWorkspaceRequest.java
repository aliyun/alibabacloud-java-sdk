// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateGrafanaWorkspaceRequest extends TeaModel {
    /**
     * <p>The language. Valid values: zh and en. Default value: zh.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AliyunLang")
    public String aliyunLang;

    /**
     * <p>The description of the workspace.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>grafana-cn-4xl3g******</p>
     */
    @NameInMap("GrafanaWorkspaceId")
    public String grafanaWorkspaceId;

    /**
     * <p>The workspace name.</p>
     * 
     * <strong>example:</strong>
     * <p>testGrafana</p>
     */
    @NameInMap("GrafanaWorkspaceName")
    public String grafanaWorkspaceName;

    /**
     * <p>The region ID. Default value: <code>cn-hangzhou</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateGrafanaWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGrafanaWorkspaceRequest self = new UpdateGrafanaWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGrafanaWorkspaceRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public UpdateGrafanaWorkspaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateGrafanaWorkspaceRequest setGrafanaWorkspaceId(String grafanaWorkspaceId) {
        this.grafanaWorkspaceId = grafanaWorkspaceId;
        return this;
    }
    public String getGrafanaWorkspaceId() {
        return this.grafanaWorkspaceId;
    }

    public UpdateGrafanaWorkspaceRequest setGrafanaWorkspaceName(String grafanaWorkspaceName) {
        this.grafanaWorkspaceName = grafanaWorkspaceName;
        return this;
    }
    public String getGrafanaWorkspaceName() {
        return this.grafanaWorkspaceName;
    }

    public UpdateGrafanaWorkspaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
