// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutMonitoringConfigRequest extends TeaModel {
    /**
     * <p>This parameter is not used.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoInstall")
    public Boolean autoInstall;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate the token on your client to ensure that the token is unique across different requests. The client token supports only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>6868E9A1-56E6-5FD7-9684-E2963BBAFB5F</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run on the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: sends a check request without deleting the endpoint IPAM pool. The check items include whether required parameters are specified, the request format, and service limits. If the request fails the check, an error is returned. If the request passes the check, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default value): sends a normal request and directly deletes the endpoint IPAM pool if the request passes the check.
     * Default value: <strong>false</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to automatically install the CloudMonitor agent on newly purchased ECS instances. Valid values:</p>
     * <ul>
     * <li>true: Automatically installs the CloudMonitor agent on newly purchased ECS instances.</li>
     * <li>false: Does not automatically install the CloudMonitor agent on newly purchased ECS instances.
     * Default value: true.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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

    public PutMonitoringConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public PutMonitoringConfigRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
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
