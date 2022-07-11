// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class StartK8sAppPrecheckRequest extends TeaModel {
    @NameInMap("Annotations")
    public String annotations;

    // A short description of struct
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ConfigMountDescs")
    public String configMountDescs;

    @NameInMap("EmptyDirs")
    public String emptyDirs;

    @NameInMap("EnvFroms")
    public String envFroms;

    @NameInMap("Envs")
    public String envs;

    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("JavaStartUpConfig")
    public String javaStartUpConfig;

    @NameInMap("Labels")
    public String labels;

    @NameInMap("LimitEphemeralStorage")
    public Integer limitEphemeralStorage;

    @NameInMap("LimitMem")
    public Integer limitMem;

    @NameInMap("LimitmCpu")
    public Integer limitmCpu;

    @NameInMap("LocalVolume")
    public String localVolume;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("PackageUrl")
    public String packageUrl;

    @NameInMap("PvcMountDescs")
    public String pvcMountDescs;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Replicas")
    public Integer replicas;

    @NameInMap("RequestsEphemeralStorage")
    public Integer requestsEphemeralStorage;

    @NameInMap("RequestsMem")
    public Integer requestsMem;

    @NameInMap("RequestsmCpu")
    public Integer requestsmCpu;

    public static StartK8sAppPrecheckRequest build(java.util.Map<String, ?> map) throws Exception {
        StartK8sAppPrecheckRequest self = new StartK8sAppPrecheckRequest();
        return TeaModel.build(map, self);
    }

    public StartK8sAppPrecheckRequest setAnnotations(String annotations) {
        this.annotations = annotations;
        return this;
    }
    public String getAnnotations() {
        return this.annotations;
    }

    public StartK8sAppPrecheckRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StartK8sAppPrecheckRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public StartK8sAppPrecheckRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public StartK8sAppPrecheckRequest setConfigMountDescs(String configMountDescs) {
        this.configMountDescs = configMountDescs;
        return this;
    }
    public String getConfigMountDescs() {
        return this.configMountDescs;
    }

    public StartK8sAppPrecheckRequest setEmptyDirs(String emptyDirs) {
        this.emptyDirs = emptyDirs;
        return this;
    }
    public String getEmptyDirs() {
        return this.emptyDirs;
    }

    public StartK8sAppPrecheckRequest setEnvFroms(String envFroms) {
        this.envFroms = envFroms;
        return this;
    }
    public String getEnvFroms() {
        return this.envFroms;
    }

    public StartK8sAppPrecheckRequest setEnvs(String envs) {
        this.envs = envs;
        return this;
    }
    public String getEnvs() {
        return this.envs;
    }

    public StartK8sAppPrecheckRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public StartK8sAppPrecheckRequest setJavaStartUpConfig(String javaStartUpConfig) {
        this.javaStartUpConfig = javaStartUpConfig;
        return this;
    }
    public String getJavaStartUpConfig() {
        return this.javaStartUpConfig;
    }

    public StartK8sAppPrecheckRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public StartK8sAppPrecheckRequest setLimitEphemeralStorage(Integer limitEphemeralStorage) {
        this.limitEphemeralStorage = limitEphemeralStorage;
        return this;
    }
    public Integer getLimitEphemeralStorage() {
        return this.limitEphemeralStorage;
    }

    public StartK8sAppPrecheckRequest setLimitMem(Integer limitMem) {
        this.limitMem = limitMem;
        return this;
    }
    public Integer getLimitMem() {
        return this.limitMem;
    }

    public StartK8sAppPrecheckRequest setLimitmCpu(Integer limitmCpu) {
        this.limitmCpu = limitmCpu;
        return this;
    }
    public Integer getLimitmCpu() {
        return this.limitmCpu;
    }

    public StartK8sAppPrecheckRequest setLocalVolume(String localVolume) {
        this.localVolume = localVolume;
        return this;
    }
    public String getLocalVolume() {
        return this.localVolume;
    }

    public StartK8sAppPrecheckRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public StartK8sAppPrecheckRequest setPackageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
        return this;
    }
    public String getPackageUrl() {
        return this.packageUrl;
    }

    public StartK8sAppPrecheckRequest setPvcMountDescs(String pvcMountDescs) {
        this.pvcMountDescs = pvcMountDescs;
        return this;
    }
    public String getPvcMountDescs() {
        return this.pvcMountDescs;
    }

    public StartK8sAppPrecheckRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartK8sAppPrecheckRequest setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

    public StartK8sAppPrecheckRequest setRequestsEphemeralStorage(Integer requestsEphemeralStorage) {
        this.requestsEphemeralStorage = requestsEphemeralStorage;
        return this;
    }
    public Integer getRequestsEphemeralStorage() {
        return this.requestsEphemeralStorage;
    }

    public StartK8sAppPrecheckRequest setRequestsMem(Integer requestsMem) {
        this.requestsMem = requestsMem;
        return this;
    }
    public Integer getRequestsMem() {
        return this.requestsMem;
    }

    public StartK8sAppPrecheckRequest setRequestsmCpu(Integer requestsmCpu) {
        this.requestsmCpu = requestsmCpu;
        return this;
    }
    public Integer getRequestsmCpu() {
        return this.requestsmCpu;
    }

}
