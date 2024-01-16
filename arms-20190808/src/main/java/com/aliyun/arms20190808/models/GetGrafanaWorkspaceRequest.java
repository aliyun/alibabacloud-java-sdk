// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetGrafanaWorkspaceRequest extends TeaModel {
    @NameInMap("AliyunLang")
    public String aliyunLang;

    @NameInMap("GrafanaWorkspaceId")
    public String grafanaWorkspaceId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetGrafanaWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGrafanaWorkspaceRequest self = new GetGrafanaWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public GetGrafanaWorkspaceRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public GetGrafanaWorkspaceRequest setGrafanaWorkspaceId(String grafanaWorkspaceId) {
        this.grafanaWorkspaceId = grafanaWorkspaceId;
        return this;
    }
    public String getGrafanaWorkspaceId() {
        return this.grafanaWorkspaceId;
    }

    public GetGrafanaWorkspaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
