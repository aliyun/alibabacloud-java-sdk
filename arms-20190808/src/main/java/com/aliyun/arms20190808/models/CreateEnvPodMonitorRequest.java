// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateEnvPodMonitorRequest extends TeaModel {
    /**
     * <p>Locale, default is Chinese zh | en.</p>
     */
    @NameInMap("AliyunLang")
    public String aliyunLang;

    /**
     * <p>PodMonitor\"s yaml configuration string.</p>
     */
    @NameInMap("ConfigYaml")
    public String configYaml;

    /**
     * <p>Trial run: Check whether the format is legal and whether it can match targets.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Environment instance ID.</p>
     */
    @NameInMap("EnvironmentId")
    public String environmentId;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateEnvPodMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvPodMonitorRequest self = new CreateEnvPodMonitorRequest();
        return TeaModel.build(map, self);
    }

    public CreateEnvPodMonitorRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public CreateEnvPodMonitorRequest setConfigYaml(String configYaml) {
        this.configYaml = configYaml;
        return this;
    }
    public String getConfigYaml() {
        return this.configYaml;
    }

    public CreateEnvPodMonitorRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateEnvPodMonitorRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public CreateEnvPodMonitorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
