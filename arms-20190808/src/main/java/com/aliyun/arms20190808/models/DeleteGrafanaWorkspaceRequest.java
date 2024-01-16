// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteGrafanaWorkspaceRequest extends TeaModel {
    @NameInMap("GrafanaWorkspaceId")
    public String grafanaWorkspaceId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteGrafanaWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGrafanaWorkspaceRequest self = new DeleteGrafanaWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGrafanaWorkspaceRequest setGrafanaWorkspaceId(String grafanaWorkspaceId) {
        this.grafanaWorkspaceId = grafanaWorkspaceId;
        return this;
    }
    public String getGrafanaWorkspaceId() {
        return this.grafanaWorkspaceId;
    }

    public DeleteGrafanaWorkspaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
