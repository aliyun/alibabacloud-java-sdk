// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeployK8sApplicationRequest extends TeaModel {
    @NameInMap("PreStop")
    public String preStop;

    @NameInMap("Envs")
    public String envs;

    @NameInMap("ImageTag")
    public String imageTag;

    @NameInMap("BatchWaitTime")
    public Integer batchWaitTime;

    @NameInMap("Command")
    public String command;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("PostStart")
    public String postStart;

    @NameInMap("Readiness")
    public String readiness;

    @NameInMap("Liveness")
    public String liveness;

    @NameInMap("Args")
    public String args;

    @NameInMap("Replicas")
    public Integer replicas;

    @NameInMap("Image")
    public String image;

    @NameInMap("CpuLimit")
    public Integer cpuLimit;

    @NameInMap("MemoryLimit")
    public Integer memoryLimit;

    @NameInMap("CpuRequest")
    public Integer cpuRequest;

    @NameInMap("MemoryRequest")
    public Integer memoryRequest;

    @NameInMap("NasId")
    public String nasId;

    @NameInMap("MountDescs")
    public String mountDescs;

    @NameInMap("StorageType")
    public String storageType;

    @NameInMap("LocalVolume")
    public String localVolume;

    @NameInMap("PackageUrl")
    public String packageUrl;

    @NameInMap("PackageVersion")
    public String packageVersion;

    @NameInMap("JDK")
    public String JDK;

    @NameInMap("WebContainer")
    public String webContainer;

    @NameInMap("EdasContainerVersion")
    public String edasContainerVersion;

    @NameInMap("UriEncoding")
    public String uriEncoding;

    @NameInMap("UseBodyEncoding")
    public Boolean useBodyEncoding;

    @NameInMap("UpdateStrategy")
    public String updateStrategy;

    @NameInMap("McpuRequest")
    public Integer mcpuRequest;

    @NameInMap("McpuLimit")
    public Integer mcpuLimit;

    @NameInMap("VolumesStr")
    public String volumesStr;

    @NameInMap("PackageVersionId")
    public String packageVersionId;

    @NameInMap("ChangeOrderDesc")
    public String changeOrderDesc;

    @NameInMap("RuntimeClassName")
    public String runtimeClassName;

    @NameInMap("DeployAcrossZones")
    public String deployAcrossZones;

    @NameInMap("BatchTimeout")
    public Integer batchTimeout;

    @NameInMap("EnableAhas")
    public Boolean enableAhas;

    @NameInMap("WebContainerConfig")
    public String webContainerConfig;

    @NameInMap("JavaStartUpConfig")
    public String javaStartUpConfig;

    @NameInMap("SlsConfigs")
    public String slsConfigs;

    @NameInMap("DeployAcrossNodes")
    public String deployAcrossNodes;

    @NameInMap("TrafficControlStrategy")
    public String trafficControlStrategy;

    public static DeployK8sApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployK8sApplicationRequest self = new DeployK8sApplicationRequest();
        return TeaModel.build(map, self);
    }

    public DeployK8sApplicationRequest setPreStop(String preStop) {
        this.preStop = preStop;
        return this;
    }
    public String getPreStop() {
        return this.preStop;
    }

    public DeployK8sApplicationRequest setEnvs(String envs) {
        this.envs = envs;
        return this;
    }
    public String getEnvs() {
        return this.envs;
    }

    public DeployK8sApplicationRequest setImageTag(String imageTag) {
        this.imageTag = imageTag;
        return this;
    }
    public String getImageTag() {
        return this.imageTag;
    }

    public DeployK8sApplicationRequest setBatchWaitTime(Integer batchWaitTime) {
        this.batchWaitTime = batchWaitTime;
        return this;
    }
    public Integer getBatchWaitTime() {
        return this.batchWaitTime;
    }

    public DeployK8sApplicationRequest setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public DeployK8sApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeployK8sApplicationRequest setPostStart(String postStart) {
        this.postStart = postStart;
        return this;
    }
    public String getPostStart() {
        return this.postStart;
    }

    public DeployK8sApplicationRequest setReadiness(String readiness) {
        this.readiness = readiness;
        return this;
    }
    public String getReadiness() {
        return this.readiness;
    }

    public DeployK8sApplicationRequest setLiveness(String liveness) {
        this.liveness = liveness;
        return this;
    }
    public String getLiveness() {
        return this.liveness;
    }

    public DeployK8sApplicationRequest setArgs(String args) {
        this.args = args;
        return this;
    }
    public String getArgs() {
        return this.args;
    }

    public DeployK8sApplicationRequest setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

    public DeployK8sApplicationRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public DeployK8sApplicationRequest setCpuLimit(Integer cpuLimit) {
        this.cpuLimit = cpuLimit;
        return this;
    }
    public Integer getCpuLimit() {
        return this.cpuLimit;
    }

    public DeployK8sApplicationRequest setMemoryLimit(Integer memoryLimit) {
        this.memoryLimit = memoryLimit;
        return this;
    }
    public Integer getMemoryLimit() {
        return this.memoryLimit;
    }

    public DeployK8sApplicationRequest setCpuRequest(Integer cpuRequest) {
        this.cpuRequest = cpuRequest;
        return this;
    }
    public Integer getCpuRequest() {
        return this.cpuRequest;
    }

    public DeployK8sApplicationRequest setMemoryRequest(Integer memoryRequest) {
        this.memoryRequest = memoryRequest;
        return this;
    }
    public Integer getMemoryRequest() {
        return this.memoryRequest;
    }

    public DeployK8sApplicationRequest setNasId(String nasId) {
        this.nasId = nasId;
        return this;
    }
    public String getNasId() {
        return this.nasId;
    }

    public DeployK8sApplicationRequest setMountDescs(String mountDescs) {
        this.mountDescs = mountDescs;
        return this;
    }
    public String getMountDescs() {
        return this.mountDescs;
    }

    public DeployK8sApplicationRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public DeployK8sApplicationRequest setLocalVolume(String localVolume) {
        this.localVolume = localVolume;
        return this;
    }
    public String getLocalVolume() {
        return this.localVolume;
    }

    public DeployK8sApplicationRequest setPackageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
        return this;
    }
    public String getPackageUrl() {
        return this.packageUrl;
    }

    public DeployK8sApplicationRequest setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
        return this;
    }
    public String getPackageVersion() {
        return this.packageVersion;
    }

    public DeployK8sApplicationRequest setJDK(String JDK) {
        this.JDK = JDK;
        return this;
    }
    public String getJDK() {
        return this.JDK;
    }

    public DeployK8sApplicationRequest setWebContainer(String webContainer) {
        this.webContainer = webContainer;
        return this;
    }
    public String getWebContainer() {
        return this.webContainer;
    }

    public DeployK8sApplicationRequest setEdasContainerVersion(String edasContainerVersion) {
        this.edasContainerVersion = edasContainerVersion;
        return this;
    }
    public String getEdasContainerVersion() {
        return this.edasContainerVersion;
    }

    public DeployK8sApplicationRequest setUriEncoding(String uriEncoding) {
        this.uriEncoding = uriEncoding;
        return this;
    }
    public String getUriEncoding() {
        return this.uriEncoding;
    }

    public DeployK8sApplicationRequest setUseBodyEncoding(Boolean useBodyEncoding) {
        this.useBodyEncoding = useBodyEncoding;
        return this;
    }
    public Boolean getUseBodyEncoding() {
        return this.useBodyEncoding;
    }

    public DeployK8sApplicationRequest setUpdateStrategy(String updateStrategy) {
        this.updateStrategy = updateStrategy;
        return this;
    }
    public String getUpdateStrategy() {
        return this.updateStrategy;
    }

    public DeployK8sApplicationRequest setMcpuRequest(Integer mcpuRequest) {
        this.mcpuRequest = mcpuRequest;
        return this;
    }
    public Integer getMcpuRequest() {
        return this.mcpuRequest;
    }

    public DeployK8sApplicationRequest setMcpuLimit(Integer mcpuLimit) {
        this.mcpuLimit = mcpuLimit;
        return this;
    }
    public Integer getMcpuLimit() {
        return this.mcpuLimit;
    }

    public DeployK8sApplicationRequest setVolumesStr(String volumesStr) {
        this.volumesStr = volumesStr;
        return this;
    }
    public String getVolumesStr() {
        return this.volumesStr;
    }

    public DeployK8sApplicationRequest setPackageVersionId(String packageVersionId) {
        this.packageVersionId = packageVersionId;
        return this;
    }
    public String getPackageVersionId() {
        return this.packageVersionId;
    }

    public DeployK8sApplicationRequest setChangeOrderDesc(String changeOrderDesc) {
        this.changeOrderDesc = changeOrderDesc;
        return this;
    }
    public String getChangeOrderDesc() {
        return this.changeOrderDesc;
    }

    public DeployK8sApplicationRequest setRuntimeClassName(String runtimeClassName) {
        this.runtimeClassName = runtimeClassName;
        return this;
    }
    public String getRuntimeClassName() {
        return this.runtimeClassName;
    }

    public DeployK8sApplicationRequest setDeployAcrossZones(String deployAcrossZones) {
        this.deployAcrossZones = deployAcrossZones;
        return this;
    }
    public String getDeployAcrossZones() {
        return this.deployAcrossZones;
    }

    public DeployK8sApplicationRequest setBatchTimeout(Integer batchTimeout) {
        this.batchTimeout = batchTimeout;
        return this;
    }
    public Integer getBatchTimeout() {
        return this.batchTimeout;
    }

    public DeployK8sApplicationRequest setEnableAhas(Boolean enableAhas) {
        this.enableAhas = enableAhas;
        return this;
    }
    public Boolean getEnableAhas() {
        return this.enableAhas;
    }

    public DeployK8sApplicationRequest setWebContainerConfig(String webContainerConfig) {
        this.webContainerConfig = webContainerConfig;
        return this;
    }
    public String getWebContainerConfig() {
        return this.webContainerConfig;
    }

    public DeployK8sApplicationRequest setJavaStartUpConfig(String javaStartUpConfig) {
        this.javaStartUpConfig = javaStartUpConfig;
        return this;
    }
    public String getJavaStartUpConfig() {
        return this.javaStartUpConfig;
    }

    public DeployK8sApplicationRequest setSlsConfigs(String slsConfigs) {
        this.slsConfigs = slsConfigs;
        return this;
    }
    public String getSlsConfigs() {
        return this.slsConfigs;
    }

    public DeployK8sApplicationRequest setDeployAcrossNodes(String deployAcrossNodes) {
        this.deployAcrossNodes = deployAcrossNodes;
        return this;
    }
    public String getDeployAcrossNodes() {
        return this.deployAcrossNodes;
    }

    public DeployK8sApplicationRequest setTrafficControlStrategy(String trafficControlStrategy) {
        this.trafficControlStrategy = trafficControlStrategy;
        return this;
    }
    public String getTrafficControlStrategy() {
        return this.trafficControlStrategy;
    }

}
