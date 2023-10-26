// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateEnvPodMonitorRequest extends TeaModel {
    /**
     * <p>Locale, the default is Chinese zh | en.</p>
     */
    @NameInMap("AliyunLang")
    public String aliyunLang;

    /**
     * <p>yaml configuration string.</p>
     */
    @NameInMap("ConfigYaml")
    public String configYaml;

    /**
     * <p>Trial run: Check whether the format is legal and whether it can match targets.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Environment ID.</p>
     */
    @NameInMap("EnvironmentId")
    public String environmentId;

    /**
     * <p>The namespace where podMonitor is located.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>PodMonitor name.</p>
     */
    @NameInMap("PodMonitorName")
    public String podMonitorName;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateEnvPodMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnvPodMonitorRequest self = new UpdateEnvPodMonitorRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEnvPodMonitorRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public UpdateEnvPodMonitorRequest setConfigYaml(String configYaml) {
        this.configYaml = configYaml;
        return this;
    }
    public String getConfigYaml() {
        return this.configYaml;
    }

    public UpdateEnvPodMonitorRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateEnvPodMonitorRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public UpdateEnvPodMonitorRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateEnvPodMonitorRequest setPodMonitorName(String podMonitorName) {
        this.podMonitorName = podMonitorName;
        return this;
    }
    public String getPodMonitorName() {
        return this.podMonitorName;
    }

    public UpdateEnvPodMonitorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
