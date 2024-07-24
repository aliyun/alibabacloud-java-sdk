// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateEnvPodMonitorRequest extends TeaModel {
    /**
     * <p>The language. Valid values:</p>
     * <ul>
     * <li>zh (default value): Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AliyunLang")
    public String aliyunLang;

    /**
     * <p>The YAML configuration file of the ServiceMonitor.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Refer to supplementary instructions.</p>
     */
    @NameInMap("ConfigYaml")
    public String configYaml;

    /**
     * <p>Checks whether the format is valid and whether targets are matched.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The environment ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>env-xxxxx</p>
     */
    @NameInMap("EnvironmentId")
    public String environmentId;

    /**
     * <p>The namespace where the PodMonitor resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>arms-prom</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The name of the PodMonitor.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>arms-admin-pm1</p>
     */
    @NameInMap("PodMonitorName")
    public String podMonitorName;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
