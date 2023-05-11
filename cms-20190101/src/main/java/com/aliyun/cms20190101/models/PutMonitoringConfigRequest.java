// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutMonitoringConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically install the CloudMonitor agent on new ECS instances. Valid values:</p>
     * <br>
     * <p>*   true (default value)</p>
     * <p>*   false</p>
     */
    @NameInMap("AutoInstall")
    public Boolean autoInstall;

    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call was successful.</p>
     */
    @NameInMap("EnableInstallAgentNewECS")
    public Boolean enableInstallAgentNewECS;

    @NameInMap("RegionId")
    public String regionId;

    public static PutMonitoringConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        PutMonitoringConfigRequest self = new PutMonitoringConfigRequest();
        return TeaModel.build(map, self);
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

    public PutMonitoringConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
