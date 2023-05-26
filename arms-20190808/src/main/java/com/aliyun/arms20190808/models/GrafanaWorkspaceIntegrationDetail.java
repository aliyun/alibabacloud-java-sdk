// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GrafanaWorkspaceIntegrationDetail extends TeaModel {
    @NameInMap("dataSources")
    public java.util.List<GrafanaWorkspaceIntegrationDataSource> dataSources;

    @NameInMap("integrationId")
    public String integrationId;

    @NameInMap("status")
    public String status;

    public static GrafanaWorkspaceIntegrationDetail build(java.util.Map<String, ?> map) throws Exception {
        GrafanaWorkspaceIntegrationDetail self = new GrafanaWorkspaceIntegrationDetail();
        return TeaModel.build(map, self);
    }

    public GrafanaWorkspaceIntegrationDetail setDataSources(java.util.List<GrafanaWorkspaceIntegrationDataSource> dataSources) {
        this.dataSources = dataSources;
        return this;
    }
    public java.util.List<GrafanaWorkspaceIntegrationDataSource> getDataSources() {
        return this.dataSources;
    }

    public GrafanaWorkspaceIntegrationDetail setIntegrationId(String integrationId) {
        this.integrationId = integrationId;
        return this;
    }
    public String getIntegrationId() {
        return this.integrationId;
    }

    public GrafanaWorkspaceIntegrationDetail setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
