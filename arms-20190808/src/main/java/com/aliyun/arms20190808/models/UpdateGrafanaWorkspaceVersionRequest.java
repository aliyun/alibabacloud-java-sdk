// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateGrafanaWorkspaceVersionRequest extends TeaModel {
    @NameInMap("AliyunLang")
    public String aliyunLang;

    @NameInMap("GrafanaVersion")
    public String grafanaVersion;

    @NameInMap("GrafanaWorkspaceId")
    public String grafanaWorkspaceId;

    @NameInMap("RegionId")
    public String regionId;

    public static UpdateGrafanaWorkspaceVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGrafanaWorkspaceVersionRequest self = new UpdateGrafanaWorkspaceVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGrafanaWorkspaceVersionRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public UpdateGrafanaWorkspaceVersionRequest setGrafanaVersion(String grafanaVersion) {
        this.grafanaVersion = grafanaVersion;
        return this;
    }
    public String getGrafanaVersion() {
        return this.grafanaVersion;
    }

    public UpdateGrafanaWorkspaceVersionRequest setGrafanaWorkspaceId(String grafanaWorkspaceId) {
        this.grafanaWorkspaceId = grafanaWorkspaceId;
        return this;
    }
    public String getGrafanaWorkspaceId() {
        return this.grafanaWorkspaceId;
    }

    public UpdateGrafanaWorkspaceVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
