// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GrafanaWorkspaceIntegration extends TeaModel {
    @NameInMap("datasourceAmount")
    public Long datasourceAmount;

    @NameInMap("integrationId")
    public String integrationId;

    @NameInMap("integrationName")
    public String integrationName;

    @NameInMap("previews")
    public java.util.List<GrafanaWorkspaceIntegrationPreview> previews;

    @NameInMap("status")
    public String status;

    @NameInMap("supportRegions")
    public java.util.List<String> supportRegions;

    public static GrafanaWorkspaceIntegration build(java.util.Map<String, ?> map) throws Exception {
        GrafanaWorkspaceIntegration self = new GrafanaWorkspaceIntegration();
        return TeaModel.build(map, self);
    }

    public GrafanaWorkspaceIntegration setDatasourceAmount(Long datasourceAmount) {
        this.datasourceAmount = datasourceAmount;
        return this;
    }
    public Long getDatasourceAmount() {
        return this.datasourceAmount;
    }

    public GrafanaWorkspaceIntegration setIntegrationId(String integrationId) {
        this.integrationId = integrationId;
        return this;
    }
    public String getIntegrationId() {
        return this.integrationId;
    }

    public GrafanaWorkspaceIntegration setIntegrationName(String integrationName) {
        this.integrationName = integrationName;
        return this;
    }
    public String getIntegrationName() {
        return this.integrationName;
    }

    public GrafanaWorkspaceIntegration setPreviews(java.util.List<GrafanaWorkspaceIntegrationPreview> previews) {
        this.previews = previews;
        return this;
    }
    public java.util.List<GrafanaWorkspaceIntegrationPreview> getPreviews() {
        return this.previews;
    }

    public GrafanaWorkspaceIntegration setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GrafanaWorkspaceIntegration setSupportRegions(java.util.List<String> supportRegions) {
        this.supportRegions = supportRegions;
        return this;
    }
    public java.util.List<String> getSupportRegions() {
        return this.supportRegions;
    }

}
