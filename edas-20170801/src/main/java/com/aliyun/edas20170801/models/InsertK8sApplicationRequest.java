// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertK8sApplicationRequest extends TeaModel {
    @NameInMap("Annotations")
    public String annotations;

    @NameInMap("AppConfig")
    public String appConfig;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppTemplateName")
    public String appTemplateName;

    @NameInMap("ApplicationDescription")
    public String applicationDescription;

    @NameInMap("BuildPackId")
    public String buildPackId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Command")
    public String command;

    @NameInMap("CommandArgs")
    public String commandArgs;

    @NameInMap("ConfigMountDescs")
    public String configMountDescs;

    @NameInMap("CsClusterId")
    public String csClusterId;

    @NameInMap("CustomAffinity")
    public String customAffinity;

    @NameInMap("CustomTolerations")
    public String customTolerations;

    @NameInMap("DeployAcrossNodes")
    public String deployAcrossNodes;

    @NameInMap("DeployAcrossZones")
    public String deployAcrossZones;

    @NameInMap("EdasContainerVersion")
    public String edasContainerVersion;

    @NameInMap("EmptyDirs")
    public String emptyDirs;

    @NameInMap("EnableAhas")
    public Boolean enableAhas;

    @NameInMap("EnableAsm")
    public Boolean enableAsm;

    @NameInMap("EnableEmptyPushReject")
    public Boolean enableEmptyPushReject;

    @NameInMap("EnableLosslessRule")
    public Boolean enableLosslessRule;

    @NameInMap("EnvFroms")
    public String envFroms;

    @NameInMap("Envs")
    public String envs;

    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("InternetSlbId")
    public String internetSlbId;

    @NameInMap("InternetSlbPort")
    public Integer internetSlbPort;

    @NameInMap("InternetSlbProtocol")
    public String internetSlbProtocol;

    @NameInMap("InternetTargetPort")
    public Integer internetTargetPort;

    @NameInMap("IntranetSlbId")
    public String intranetSlbId;

    @NameInMap("IntranetSlbPort")
    public Integer intranetSlbPort;

    @NameInMap("IntranetSlbProtocol")
    public String intranetSlbProtocol;

    @NameInMap("IntranetTargetPort")
    public Integer intranetTargetPort;

    @NameInMap("IsMultilingualApp")
    public Boolean isMultilingualApp;

    @NameInMap("JDK")
    public String JDK;

    @NameInMap("JavaStartUpConfig")
    public String javaStartUpConfig;

    @NameInMap("Labels")
    public String labels;

    @NameInMap("LimitCpu")
    public Integer limitCpu;

    @NameInMap("LimitMem")
    public Integer limitMem;

    @NameInMap("LimitmCpu")
    public Integer limitmCpu;

    @NameInMap("Liveness")
    public String liveness;

    @NameInMap("LocalVolume")
    public String localVolume;

    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    @NameInMap("LosslessRuleAligned")
    public Boolean losslessRuleAligned;

    @NameInMap("LosslessRuleDelayTime")
    public Integer losslessRuleDelayTime;

    @NameInMap("LosslessRuleFuncType")
    public Integer losslessRuleFuncType;

    @NameInMap("LosslessRuleRelated")
    public Boolean losslessRuleRelated;

    @NameInMap("LosslessRuleWarmupTime")
    public Integer losslessRuleWarmupTime;

    @NameInMap("MountDescs")
    public String mountDescs;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("NasId")
    public String nasId;

    @NameInMap("PackageType")
    public String packageType;

    @NameInMap("PackageUrl")
    public String packageUrl;

    @NameInMap("PackageVersion")
    public String packageVersion;

    @NameInMap("PostStart")
    public String postStart;

    @NameInMap("PreStop")
    public String preStop;

    @NameInMap("PvcMountDescs")
    public String pvcMountDescs;

    @NameInMap("Readiness")
    public String readiness;

    @NameInMap("Replicas")
    public Integer replicas;

    @NameInMap("RepoId")
    public String repoId;

    @NameInMap("RequestsCpu")
    public Integer requestsCpu;

    @NameInMap("RequestsMem")
    public Integer requestsMem;

    @NameInMap("RequestsmCpu")
    public Integer requestsmCpu;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("RuntimeClassName")
    public String runtimeClassName;

    @NameInMap("ServiceConfigs")
    public String serviceConfigs;

    @NameInMap("SlsConfigs")
    public String slsConfigs;

    @NameInMap("StorageType")
    public String storageType;

    @NameInMap("Timeout")
    public Integer timeout;

    @NameInMap("UriEncoding")
    public String uriEncoding;

    @NameInMap("UseBodyEncoding")
    public Boolean useBodyEncoding;

    @NameInMap("WebContainer")
    public String webContainer;

    @NameInMap("WebContainerConfig")
    public String webContainerConfig;

    public static InsertK8sApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertK8sApplicationRequest self = new InsertK8sApplicationRequest();
        return TeaModel.build(map, self);
    }

    public InsertK8sApplicationRequest setAnnotations(String annotations) {
        this.annotations = annotations;
        return this;
    }
    public String getAnnotations() {
        return this.annotations;
    }

    public InsertK8sApplicationRequest setAppConfig(String appConfig) {
        this.appConfig = appConfig;
        return this;
    }
    public String getAppConfig() {
        return this.appConfig;
    }

    public InsertK8sApplicationRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public InsertK8sApplicationRequest setAppTemplateName(String appTemplateName) {
        this.appTemplateName = appTemplateName;
        return this;
    }
    public String getAppTemplateName() {
        return this.appTemplateName;
    }

    public InsertK8sApplicationRequest setApplicationDescription(String applicationDescription) {
        this.applicationDescription = applicationDescription;
        return this;
    }
    public String getApplicationDescription() {
        return this.applicationDescription;
    }

    public InsertK8sApplicationRequest setBuildPackId(String buildPackId) {
        this.buildPackId = buildPackId;
        return this;
    }
    public String getBuildPackId() {
        return this.buildPackId;
    }

    public InsertK8sApplicationRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
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

    public InsertK8sApplicationRequest setConfigMountDescs(String configMountDescs) {
        this.configMountDescs = configMountDescs;
        return this;
    }
    public String getConfigMountDescs() {
        return this.configMountDescs;
    }

    public InsertK8sApplicationRequest setCsClusterId(String csClusterId) {
        this.csClusterId = csClusterId;
        return this;
    }
    public String getCsClusterId() {
        return this.csClusterId;
    }

    public InsertK8sApplicationRequest setCustomAffinity(String customAffinity) {
        this.customAffinity = customAffinity;
        return this;
    }
    public String getCustomAffinity() {
        return this.customAffinity;
    }

    public InsertK8sApplicationRequest setCustomTolerations(String customTolerations) {
        this.customTolerations = customTolerations;
        return this;
    }
    public String getCustomTolerations() {
        return this.customTolerations;
    }

    public InsertK8sApplicationRequest setDeployAcrossNodes(String deployAcrossNodes) {
        this.deployAcrossNodes = deployAcrossNodes;
        return this;
    }
    public String getDeployAcrossNodes() {
        return this.deployAcrossNodes;
    }

    public InsertK8sApplicationRequest setDeployAcrossZones(String deployAcrossZones) {
        this.deployAcrossZones = deployAcrossZones;
        return this;
    }
    public String getDeployAcrossZones() {
        return this.deployAcrossZones;
    }

    public InsertK8sApplicationRequest setEdasContainerVersion(String edasContainerVersion) {
        this.edasContainerVersion = edasContainerVersion;
        return this;
    }
    public String getEdasContainerVersion() {
        return this.edasContainerVersion;
    }

    public InsertK8sApplicationRequest setEmptyDirs(String emptyDirs) {
        this.emptyDirs = emptyDirs;
        return this;
    }
    public String getEmptyDirs() {
        return this.emptyDirs;
    }

    public InsertK8sApplicationRequest setEnableAhas(Boolean enableAhas) {
        this.enableAhas = enableAhas;
        return this;
    }
    public Boolean getEnableAhas() {
        return this.enableAhas;
    }

    public InsertK8sApplicationRequest setEnableAsm(Boolean enableAsm) {
        this.enableAsm = enableAsm;
        return this;
    }
    public Boolean getEnableAsm() {
        return this.enableAsm;
    }

    public InsertK8sApplicationRequest setEnableEmptyPushReject(Boolean enableEmptyPushReject) {
        this.enableEmptyPushReject = enableEmptyPushReject;
        return this;
    }
    public Boolean getEnableEmptyPushReject() {
        return this.enableEmptyPushReject;
    }

    public InsertK8sApplicationRequest setEnableLosslessRule(Boolean enableLosslessRule) {
        this.enableLosslessRule = enableLosslessRule;
        return this;
    }
    public Boolean getEnableLosslessRule() {
        return this.enableLosslessRule;
    }

    public InsertK8sApplicationRequest setEnvFroms(String envFroms) {
        this.envFroms = envFroms;
        return this;
    }
    public String getEnvFroms() {
        return this.envFroms;
    }

    public InsertK8sApplicationRequest setEnvs(String envs) {
        this.envs = envs;
        return this;
    }
    public String getEnvs() {
        return this.envs;
    }

    public InsertK8sApplicationRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public InsertK8sApplicationRequest setInternetSlbId(String internetSlbId) {
        this.internetSlbId = internetSlbId;
        return this;
    }
    public String getInternetSlbId() {
        return this.internetSlbId;
    }

    public InsertK8sApplicationRequest setInternetSlbPort(Integer internetSlbPort) {
        this.internetSlbPort = internetSlbPort;
        return this;
    }
    public Integer getInternetSlbPort() {
        return this.internetSlbPort;
    }

    public InsertK8sApplicationRequest setInternetSlbProtocol(String internetSlbProtocol) {
        this.internetSlbProtocol = internetSlbProtocol;
        return this;
    }
    public String getInternetSlbProtocol() {
        return this.internetSlbProtocol;
    }

    public InsertK8sApplicationRequest setInternetTargetPort(Integer internetTargetPort) {
        this.internetTargetPort = internetTargetPort;
        return this;
    }
    public Integer getInternetTargetPort() {
        return this.internetTargetPort;
    }

    public InsertK8sApplicationRequest setIntranetSlbId(String intranetSlbId) {
        this.intranetSlbId = intranetSlbId;
        return this;
    }
    public String getIntranetSlbId() {
        return this.intranetSlbId;
    }

    public InsertK8sApplicationRequest setIntranetSlbPort(Integer intranetSlbPort) {
        this.intranetSlbPort = intranetSlbPort;
        return this;
    }
    public Integer getIntranetSlbPort() {
        return this.intranetSlbPort;
    }

    public InsertK8sApplicationRequest setIntranetSlbProtocol(String intranetSlbProtocol) {
        this.intranetSlbProtocol = intranetSlbProtocol;
        return this;
    }
    public String getIntranetSlbProtocol() {
        return this.intranetSlbProtocol;
    }

    public InsertK8sApplicationRequest setIntranetTargetPort(Integer intranetTargetPort) {
        this.intranetTargetPort = intranetTargetPort;
        return this;
    }
    public Integer getIntranetTargetPort() {
        return this.intranetTargetPort;
    }

    public InsertK8sApplicationRequest setIsMultilingualApp(Boolean isMultilingualApp) {
        this.isMultilingualApp = isMultilingualApp;
        return this;
    }
    public Boolean getIsMultilingualApp() {
        return this.isMultilingualApp;
    }

    public InsertK8sApplicationRequest setJDK(String JDK) {
        this.JDK = JDK;
        return this;
    }
    public String getJDK() {
        return this.JDK;
    }

    public InsertK8sApplicationRequest setJavaStartUpConfig(String javaStartUpConfig) {
        this.javaStartUpConfig = javaStartUpConfig;
        return this;
    }
    public String getJavaStartUpConfig() {
        return this.javaStartUpConfig;
    }

    public InsertK8sApplicationRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
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

    public InsertK8sApplicationRequest setLimitmCpu(Integer limitmCpu) {
        this.limitmCpu = limitmCpu;
        return this;
    }
    public Integer getLimitmCpu() {
        return this.limitmCpu;
    }

    public InsertK8sApplicationRequest setLiveness(String liveness) {
        this.liveness = liveness;
        return this;
    }
    public String getLiveness() {
        return this.liveness;
    }

    public InsertK8sApplicationRequest setLocalVolume(String localVolume) {
        this.localVolume = localVolume;
        return this;
    }
    public String getLocalVolume() {
        return this.localVolume;
    }

    public InsertK8sApplicationRequest setLogicalRegionId(String logicalRegionId) {
        this.logicalRegionId = logicalRegionId;
        return this;
    }
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

    public InsertK8sApplicationRequest setLosslessRuleAligned(Boolean losslessRuleAligned) {
        this.losslessRuleAligned = losslessRuleAligned;
        return this;
    }
    public Boolean getLosslessRuleAligned() {
        return this.losslessRuleAligned;
    }

    public InsertK8sApplicationRequest setLosslessRuleDelayTime(Integer losslessRuleDelayTime) {
        this.losslessRuleDelayTime = losslessRuleDelayTime;
        return this;
    }
    public Integer getLosslessRuleDelayTime() {
        return this.losslessRuleDelayTime;
    }

    public InsertK8sApplicationRequest setLosslessRuleFuncType(Integer losslessRuleFuncType) {
        this.losslessRuleFuncType = losslessRuleFuncType;
        return this;
    }
    public Integer getLosslessRuleFuncType() {
        return this.losslessRuleFuncType;
    }

    public InsertK8sApplicationRequest setLosslessRuleRelated(Boolean losslessRuleRelated) {
        this.losslessRuleRelated = losslessRuleRelated;
        return this;
    }
    public Boolean getLosslessRuleRelated() {
        return this.losslessRuleRelated;
    }

    public InsertK8sApplicationRequest setLosslessRuleWarmupTime(Integer losslessRuleWarmupTime) {
        this.losslessRuleWarmupTime = losslessRuleWarmupTime;
        return this;
    }
    public Integer getLosslessRuleWarmupTime() {
        return this.losslessRuleWarmupTime;
    }

    public InsertK8sApplicationRequest setMountDescs(String mountDescs) {
        this.mountDescs = mountDescs;
        return this;
    }
    public String getMountDescs() {
        return this.mountDescs;
    }

    public InsertK8sApplicationRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public InsertK8sApplicationRequest setNasId(String nasId) {
        this.nasId = nasId;
        return this;
    }
    public String getNasId() {
        return this.nasId;
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

    public InsertK8sApplicationRequest setPostStart(String postStart) {
        this.postStart = postStart;
        return this;
    }
    public String getPostStart() {
        return this.postStart;
    }

    public InsertK8sApplicationRequest setPreStop(String preStop) {
        this.preStop = preStop;
        return this;
    }
    public String getPreStop() {
        return this.preStop;
    }

    public InsertK8sApplicationRequest setPvcMountDescs(String pvcMountDescs) {
        this.pvcMountDescs = pvcMountDescs;
        return this;
    }
    public String getPvcMountDescs() {
        return this.pvcMountDescs;
    }

    public InsertK8sApplicationRequest setReadiness(String readiness) {
        this.readiness = readiness;
        return this;
    }
    public String getReadiness() {
        return this.readiness;
    }

    public InsertK8sApplicationRequest setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

    public InsertK8sApplicationRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
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

    public InsertK8sApplicationRequest setRequestsmCpu(Integer requestsmCpu) {
        this.requestsmCpu = requestsmCpu;
        return this;
    }
    public Integer getRequestsmCpu() {
        return this.requestsmCpu;
    }

    public InsertK8sApplicationRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public InsertK8sApplicationRequest setRuntimeClassName(String runtimeClassName) {
        this.runtimeClassName = runtimeClassName;
        return this;
    }
    public String getRuntimeClassName() {
        return this.runtimeClassName;
    }

    public InsertK8sApplicationRequest setServiceConfigs(String serviceConfigs) {
        this.serviceConfigs = serviceConfigs;
        return this;
    }
    public String getServiceConfigs() {
        return this.serviceConfigs;
    }

    public InsertK8sApplicationRequest setSlsConfigs(String slsConfigs) {
        this.slsConfigs = slsConfigs;
        return this;
    }
    public String getSlsConfigs() {
        return this.slsConfigs;
    }

    public InsertK8sApplicationRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public InsertK8sApplicationRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
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

    public InsertK8sApplicationRequest setWebContainer(String webContainer) {
        this.webContainer = webContainer;
        return this;
    }
    public String getWebContainer() {
        return this.webContainer;
    }

    public InsertK8sApplicationRequest setWebContainerConfig(String webContainerConfig) {
        this.webContainerConfig = webContainerConfig;
        return this;
    }
    public String getWebContainerConfig() {
        return this.webContainerConfig;
    }

}
