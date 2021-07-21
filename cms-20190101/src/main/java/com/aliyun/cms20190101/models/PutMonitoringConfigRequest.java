// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutMonitoringConfigRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("AutoInstall")
    public Boolean autoInstall;

    @NameInMap("EnableInstallAgentNewECS")
    public Boolean enableInstallAgentNewECS;

    public static PutMonitoringConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        PutMonitoringConfigRequest self = new PutMonitoringConfigRequest();
        return TeaModel.build(map, self);
    }

    public PutMonitoringConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PutMonitoringConfigRequest setAutoInstall(Boolean autoInstall) {
        this.autoInstall = autoInstall;
        return this;
    }
    public Boolean getAutoInstall() {
        return this.autoInstall;
    }

    public PutMonitoringConfigRequest setEnableInstallAgentNewECS(Boolean enableInstallAgentNewECS) {
        this.enableInstallAgentNewECS = enableInstallAgentNewECS;
        return this;
    }
    public Boolean getEnableInstallAgentNewECS() {
        return this.enableInstallAgentNewECS;
    }

}
