// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertK8sApplicationRequest extends TeaModel {
    @NameInMap("IntranetTargetPort")
    public Integer intranetTargetPort;

    @NameInMap("IntranetSlbPort")
    public Integer intranetSlbPort;

    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("ApplicationDescription")
    public String applicationDescription;

    @NameInMap("RepoId")
    public String repoId;

    @NameInMap("Replicas")
    public Integer replicas;

    @NameInMap("LimitCpu")
    public Integer limitCpu;

    @NameInMap("LimitMem")
    public Integer limitMem;

    @NameInMap("RequestsCpu")
    public Integer requestsCpu;

    @NameInMap("RequestsMem")
    public Integer requestsMem;

    @NameInMap("Command")
    public String command;

    @NameInMap("CommandArgs")
    public String commandArgs;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("IntranetSlbProtocol")
    public String intranetSlbProtocol;

    @NameInMap("IntranetSlbId")
    public String intranetSlbId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("InternetSlbId")
    public String internetSlbId;

    @NameInMap("InternetSlbProtocol")
    public String internetSlbProtocol;

    @NameInMap("InternetSlbPort")
    public Integer internetSlbPort;

    @NameInMap("InternetTargetPort")
    public Integer internetTargetPort;

    @NameInMap("Envs")
    public String envs;

    @NameInMap("PreStop")
    public String preStop;

    @NameInMap("PostStart")
    public String postStart;

    @NameInMap("Liveness")
    public String liveness;

    @NameInMap("Readiness")
    public String readiness;

    @NameInMap("NasId")
    public String nasId;

    @NameInMap("MountDescs")
    public String mountDescs;

    @NameInMap("StorageType")
    public String storageType;

    @NameInMap("LocalVolume")
    public String localVolume;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    @NameInMap("PackageType")
    public String packageType;

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

    @NameInMap("RequestsmCpu")
    public Integer requestsmCpu;

    @NameInMap("LimitmCpu")
    public Integer limitmCpu;

    @NameInMap("RuntimeClassName")
    public String runtimeClassName;

    @NameInMap("DeployAcrossZones")
    public String deployAcrossZones;

    @NameInMap("Timeout")
    public Integer timeout;

    @NameInMap("EnableAhas")
    public Boolean enableAhas;

    @NameInMap("WebContainerConfig")
    public String webContainerConfig;

    @NameInMap("JavaStartUpConfig")
    public String javaStartUpConfig;

    @NameInMap("SlsConfigs")
    public String slsConfigs;

    @NameInMap("IsMultilingualApp")
    public Boolean isMultilingualApp;

    @NameInMap("DeployAcrossNodes")
    public String deployAcrossNodes;

    public static InsertK8sApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertK8sApplicationRequest self = new InsertK8sApplicationRequest();
        return TeaModel.build(map, self);
    }

    public InsertK8sApplicationRequest setIntranetTargetPort(Integer intranetTargetPort) {
        this.intranetTargetPort = intranetTargetPort;
        return this;
    }
    public Integer getIntranetTargetPort() {
        return this.intranetTargetPort;
    }

    public InsertK8sApplicationRequest setIntranetSlbPort(Integer intranetSlbPort) {
        this.intranetSlbPort = intranetSlbPort;
        return this;
    }
    public Integer getIntranetSlbPort() {
        return this.intranetSlbPort;
    }

    public InsertK8sApplicationRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public InsertK8sApplicationRequest setApplicationDescription(String applicationDescription) {
        this.applicationDescription = applicationDescription;
        return this;
    }
    public String getApplicationDescription() {
        return this.applicationDescription;
    }

    public InsertK8sApplicationRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public InsertK8sApplicationRequest setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

    public InsertK8sApplicationRequest setLimitCpu(Integer limitCpu) {
        this.limitCpu = limitCpu;
        return this;
    }
    public Integer getLimitCpu() {
        return this.limitCpu;
    }

    public InsertK8sApplicationRequest setLimitMem(Integer limitMem) {
        this.limitMem = limitMem;
        return this;
    }
    public Integer getLimitMem() {
        return this.limitMem;
    }

    public InsertK8sApplicationRequest setRequestsCpu(Integer requestsCpu) {
        this.requestsCpu = requestsCpu;
        return this;
    }
    public Integer getRequestsCpu() {
        return this.requestsCpu;
    }

    public InsertK8sApplicationRequest setRequestsMem(Integer requestsMem) {
        this.requestsMem = requestsMem;
        return this;
    }
    public Integer getRequestsMem() {
        return this.requestsMem;
    }

    public InsertK8sApplicationRequest setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public InsertK8sApplicationRequest setCommandArgs(String commandArgs) {
        this.commandArgs = commandArgs;
        return this;
    }
    public String getCommandArgs() {
        return this.commandArgs;
    }

    public InsertK8sApplicationRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public InsertK8sApplicationRequest setIntranetSlbProtocol(String intranetSlbProtocol) {
        this.intranetSlbProtocol = intranetSlbProtocol;
        return this;
    }
    public String getIntranetSlbProtocol() {
        return this.intranetSlbProtocol;
    }

    public InsertK8sApplicationRequest setIntranetSlbId(String intranetSlbId) {
        this.intranetSlbId = intranetSlbId;
        return this;
    }
    public String getIntranetSlbId() {
        return this.intranetSlbId;
    }

    public InsertK8sApplicationRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public InsertK8sApplicationRequest setInternetSlbId(String internetSlbId) {
        this.internetSlbId = internetSlbId;
        return this;
    }
    public String getInternetSlbId() {
        return this.internetSlbId;
    }

    public InsertK8sApplicationRequest setInternetSlbProtocol(String internetSlbProtocol) {
        this.internetSlbProtocol = internetSlbProtocol;
        return this;
    }
    public String getInternetSlbProtocol() {
        return this.internetSlbProtocol;
    }

    public InsertK8sApplicationRequest setInternetSlbPort(Integer internetSlbPort) {
        this.internetSlbPort = internetSlbPort;
        return this;
    }
    public Integer getInternetSlbPort() {
        return this.internetSlbPort;
    }

    public InsertK8sApplicationRequest setInternetTargetPort(Integer internetTargetPort) {
        this.internetTargetPort = internetTargetPort;
        return this;
    }
    public Integer getInternetTargetPort() {
        return this.internetTargetPort;
    }

    public InsertK8sApplicationRequest setEnvs(String envs) {
        this.envs = envs;
        return this;
    }
    public String getEnvs() {
        return this.envs;
    }

    public InsertK8sApplicationRequest setPreStop(String preStop) {
        this.preStop = preStop;
        return this;
    }
    public String getPreStop() {
        return this.preStop;
    }

    public InsertK8sApplicationRequest setPostStart(String postStart) {
        this.postStart = postStart;
        return this;
    }
    public String getPostStart() {
        return this.postStart;
    }

    public InsertK8sApplicationRequest setLiveness(String liveness) {
        this.liveness = liveness;
        return this;
    }
    public String getLiveness() {
        return this.liveness;
    }

    public InsertK8sApplicationRequest setReadiness(String readiness) {
        this.readiness = readiness;
        return this;
    }
    public String getReadiness() {
        return this.readiness;
    }

    public InsertK8sApplicationRequest setNasId(String nasId) {
        this.nasId = nasId;
        return this;
    }
    public String getNasId() {
        return this.nasId;
    }

    public InsertK8sApplicationRequest setMountDescs(String mountDescs) {
        this.mountDescs = mountDescs;
        return this;
    }
    public String getMountDescs() {
        return this.mountDescs;
    }

    public InsertK8sApplicationRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public InsertK8sApplicationRequest setLocalVolume(String localVolume) {
        this.localVolume = localVolume;
        return this;
    }
    public String getLocalVolume() {
        return this.localVolume;
    }

    public InsertK8sApplicationRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public InsertK8sApplicationRequest setLogicalRegionId(String logicalRegionId) {
        this.logicalRegionId = logicalRegionId;
        return this;
    }
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

    public InsertK8sApplicationRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public InsertK8sApplicationRequest setPackageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
        return this;
    }
    public String getPackageUrl() {
        return this.packageUrl;
    }

    public InsertK8sApplicationRequest setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
        return this;
    }
    public String getPackageVersion() {
        return this.packageVersion;
    }

    public InsertK8sApplicationRequest setJDK(String JDK) {
        this.JDK = JDK;
        return this;
    }
    public String getJDK() {
        return this.JDK;
    }

    public InsertK8sApplicationRequest setWebContainer(String webContainer) {
        this.webContainer = webContainer;
        return this;
    }
    public String getWebContainer() {
        return this.webContainer;
    }

    public InsertK8sApplicationRequest setEdasContainerVersion(String edasContainerVersion) {
        this.edasContainerVersion = edasContainerVersion;
        return this;
    }
    public String getEdasContainerVersion() {
        return this.edasContainerVersion;
    }

    public InsertK8sApplicationRequest setUriEncoding(String uriEncoding) {
        this.uriEncoding = uriEncoding;
        return this;
    }
    public String getUriEncoding() {
        return this.uriEncoding;
    }

    public InsertK8sApplicationRequest setUseBodyEncoding(Boolean useBodyEncoding) {
        this.useBodyEncoding = useBodyEncoding;
        return this;
    }
    public Boolean getUseBodyEncoding() {
        return this.useBodyEncoding;
    }

    public InsertK8sApplicationRequest setRequestsmCpu(Integer requestsmCpu) {
        this.requestsmCpu = requestsmCpu;
        return this;
    }
    public Integer getRequestsmCpu() {
        return this.requestsmCpu;
    }

    public InsertK8sApplicationRequest setLimitmCpu(Integer limitmCpu) {
        this.limitmCpu = limitmCpu;
        return this;
    }
    public Integer getLimitmCpu() {
        return this.limitmCpu;
    }

    public InsertK8sApplicationRequest setRuntimeClassName(String runtimeClassName) {
        this.runtimeClassName = runtimeClassName;
        return this;
    }
    public String getRuntimeClassName() {
        return this.runtimeClassName;
    }

    public InsertK8sApplicationRequest setDeployAcrossZones(String deployAcrossZones) {
        this.deployAcrossZones = deployAcrossZones;
        return this;
    }
    public String getDeployAcrossZones() {
        return this.deployAcrossZones;
    }

    public InsertK8sApplicationRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public InsertK8sApplicationRequest setEnableAhas(Boolean enableAhas) {
        this.enableAhas = enableAhas;
        return this;
    }
    public Boolean getEnableAhas() {
        return this.enableAhas;
    }

    public InsertK8sApplicationRequest setWebContainerConfig(String webContainerConfig) {
        this.webContainerConfig = webContainerConfig;
        return this;
    }
    public String getWebContainerConfig() {
        return this.webContainerConfig;
    }

    public InsertK8sApplicationRequest setJavaStartUpConfig(String javaStartUpConfig) {
        this.javaStartUpConfig = javaStartUpConfig;
        return this;
    }
    public String getJavaStartUpConfig() {
        return this.javaStartUpConfig;
    }

    public InsertK8sApplicationRequest setSlsConfigs(String slsConfigs) {
        this.slsConfigs = slsConfigs;
        return this;
    }
    public String getSlsConfigs() {
        return this.slsConfigs;
    }

    public InsertK8sApplicationRequest setIsMultilingualApp(Boolean isMultilingualApp) {
        this.isMultilingualApp = isMultilingualApp;
        return this;
    }
    public Boolean getIsMultilingualApp() {
        return this.isMultilingualApp;
    }

    public InsertK8sApplicationRequest setDeployAcrossNodes(String deployAcrossNodes) {
        this.deployAcrossNodes = deployAcrossNodes;
        return this;
    }
    public String getDeployAcrossNodes() {
        return this.deployAcrossNodes;
    }

}
