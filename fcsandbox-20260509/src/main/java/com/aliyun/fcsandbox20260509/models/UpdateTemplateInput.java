// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class UpdateTemplateInput extends TeaModel {
    @NameInMap("containerConfiguration")
    public ContainerConfiguration containerConfiguration;

    @NameInMap("logConfiguration")
    public LogConfiguration logConfiguration;

    @NameInMap("networkConfiguration")
    public NetworkConfiguration networkConfiguration;

    @NameInMap("teamID")
    public String teamID;

    public static UpdateTemplateInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateInput self = new UpdateTemplateInput();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateInput setContainerConfiguration(ContainerConfiguration containerConfiguration) {
        this.containerConfiguration = containerConfiguration;
        return this;
    }
    public ContainerConfiguration getContainerConfiguration() {
        return this.containerConfiguration;
    }

    public UpdateTemplateInput setLogConfiguration(LogConfiguration logConfiguration) {
        this.logConfiguration = logConfiguration;
        return this;
    }
    public LogConfiguration getLogConfiguration() {
        return this.logConfiguration;
    }

    public UpdateTemplateInput setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    public UpdateTemplateInput setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

}
