// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetK8sApplicationResponseBody extends TeaModel {
    @NameInMap("Applcation")
    public GetK8sApplicationResponseBodyApplcation applcation;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetK8sApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetK8sApplicationResponseBody self = new GetK8sApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetK8sApplicationResponseBody setApplcation(GetK8sApplicationResponseBodyApplcation applcation) {
        this.applcation = applcation;
        return this;
    }
    public GetK8sApplicationResponseBodyApplcation getApplcation() {
        return this.applcation;
    }

    public GetK8sApplicationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetK8sApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetK8sApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetK8sApplicationResponseBodyApplcationAppCmdArgs extends TeaModel {
        @NameInMap("CmdArg")
        public java.util.List<String> cmdArg;

        public static GetK8sApplicationResponseBodyApplcationAppCmdArgs build(java.util.Map<String, ?> map) throws Exception {
            GetK8sApplicationResponseBodyApplcationAppCmdArgs self = new GetK8sApplicationResponseBodyApplcationAppCmdArgs();
            return TeaModel.build(map, self);
        }

        public GetK8sApplicationResponseBodyApplcationAppCmdArgs setCmdArg(java.util.List<String> cmdArg) {
            this.cmdArg = cmdArg;
            return this;
        }
        public java.util.List<String> getCmdArg() {
            return this.cmdArg;
        }

    }

    public static class GetK8sApplicationResponseBodyApplcationAppEnvListEnv extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static GetK8sApplicationResponseBodyApplcationAppEnvListEnv build(java.util.Map<String, ?> map) throws Exception {
            GetK8sApplicationResponseBodyApplcationAppEnvListEnv self = new GetK8sApplicationResponseBodyApplcationAppEnvListEnv();
            return TeaModel.build(map, self);
        }

        public GetK8sApplicationResponseBodyApplcationAppEnvListEnv setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetK8sApplicationResponseBodyApplcationAppEnvListEnv setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetK8sApplicationResponseBodyApplcationAppEnvList extends TeaModel {
        @NameInMap("Env")
        public java.util.List<GetK8sApplicationResponseBodyApplcationAppEnvListEnv> env;

        public static GetK8sApplicationResponseBodyApplcationAppEnvList build(java.util.Map<String, ?> map) throws Exception {
            GetK8sApplicationResponseBodyApplcationAppEnvList self = new GetK8sApplicationResponseBodyApplcationAppEnvList();
            return TeaModel.build(map, self);
        }

        public GetK8sApplicationResponseBodyApplcationAppEnvList setEnv(java.util.List<GetK8sApplicationResponseBodyApplcationAppEnvListEnv> env) {
            this.env = env;
            return this;
        }
        public java.util.List<GetK8sApplicationResponseBodyApplcationAppEnvListEnv> getEnv() {
            return this.env;
        }

    }

    public static class GetK8sApplicationResponseBodyApplcationApp extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("ApplicationName")
        public String applicationName;

        @NameInMap("ApplicationType")
        public String applicationType;

        @NameInMap("BuildpackId")
        public Integer buildpackId;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("Cmd")
        public String cmd;

        @NameInMap("CmdArgs")
        public GetK8sApplicationResponseBodyApplcationAppCmdArgs cmdArgs;

        @NameInMap("CsClusterId")
        public String csClusterId;

        @NameInMap("DeployType")
        public String deployType;

        @NameInMap("DevelopType")
        public String developType;

        @NameInMap("EdasContainerVersion")
        public String edasContainerVersion;

        @NameInMap("EnvList")
        public GetK8sApplicationResponseBodyApplcationAppEnvList envList;

        @NameInMap("Instances")
        public Integer instances;

        @NameInMap("InstancesBeforeScaling")
        public Integer instancesBeforeScaling;

        @NameInMap("K8sNamespace")
        public String k8sNamespace;

        @NameInMap("LimitCpuM")
        public Integer limitCpuM;

        @NameInMap("LimitMem")
        public Integer limitMem;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RequestCpuM")
        public Integer requestCpuM;

        @NameInMap("RequestMem")
        public Integer requestMem;

        @NameInMap("TomcatVersion")
        public String tomcatVersion;

        public static GetK8sApplicationResponseBodyApplcationApp build(java.util.Map<String, ?> map) throws Exception {
            GetK8sApplicationResponseBodyApplcationApp self = new GetK8sApplicationResponseBodyApplcationApp();
            return TeaModel.build(map, self);
        }

        public GetK8sApplicationResponseBodyApplcationApp setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetK8sApplicationResponseBodyApplcationApp setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public GetK8sApplicationResponseBodyApplcationApp setApplicationType(String applicationType) {
            this.applicationType = applicationType;
            return this;
        }
        public String getApplicationType() {
            return this.applicationType;
        }

        public GetK8sApplicationResponseBodyApplcationApp setBuildpackId(Integer buildpackId) {
            this.buildpackId = buildpackId;
            return this;
        }
        public Integer getBuildpackId() {
            return this.buildpackId;
        }

        public GetK8sApplicationResponseBodyApplcationApp setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetK8sApplicationResponseBodyApplcationApp setCmd(String cmd) {
            this.cmd = cmd;
            return this;
        }
        public String getCmd() {
            return this.cmd;
        }

        public GetK8sApplicationResponseBodyApplcationApp setCmdArgs(GetK8sApplicationResponseBodyApplcationAppCmdArgs cmdArgs) {
            this.cmdArgs = cmdArgs;
            return this;
        }
        public GetK8sApplicationResponseBodyApplcationAppCmdArgs getCmdArgs() {
            return this.cmdArgs;
        }

        public GetK8sApplicationResponseBodyApplcationApp setCsClusterId(String csClusterId) {
            this.csClusterId = csClusterId;
            return this;
        }
        public String getCsClusterId() {
            return this.csClusterId;
        }

        public GetK8sApplicationResponseBodyApplcationApp setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public GetK8sApplicationResponseBodyApplcationApp setDevelopType(String developType) {
            this.developType = developType;
            return this;
        }
        public String getDevelopType() {
            return this.developType;
        }

        public GetK8sApplicationResponseBodyApplcationApp setEdasContainerVersion(String edasContainerVersion) {
            this.edasContainerVersion = edasContainerVersion;
            return this;
        }
        public String getEdasContainerVersion() {
            return this.edasContainerVersion;
        }

        public GetK8sApplicationResponseBodyApplcationApp setEnvList(GetK8sApplicationResponseBodyApplcationAppEnvList envList) {
            this.envList = envList;
            return this;
        }
        public GetK8sApplicationResponseBodyApplcationAppEnvList getEnvList() {
            return this.envList;
        }

        public GetK8sApplicationResponseBodyApplcationApp setInstances(Integer instances) {
            this.instances = instances;
            return this;
        }
        public Integer getInstances() {
            return this.instances;
        }

        public GetK8sApplicationResponseBodyApplcationApp setInstancesBeforeScaling(Integer instancesBeforeScaling) {
            this.instancesBeforeScaling = instancesBeforeScaling;
            return this;
        }
        public Integer getInstancesBeforeScaling() {
            return this.instancesBeforeScaling;
        }

        public GetK8sApplicationResponseBodyApplcationApp setK8sNamespace(String k8sNamespace) {
            this.k8sNamespace = k8sNamespace;
            return this;
        }
        public String getK8sNamespace() {
            return this.k8sNamespace;
        }

        public GetK8sApplicationResponseBodyApplcationApp setLimitCpuM(Integer limitCpuM) {
            this.limitCpuM = limitCpuM;
            return this;
        }
        public Integer getLimitCpuM() {
            return this.limitCpuM;
        }

        public GetK8sApplicationResponseBodyApplcationApp setLimitMem(Integer limitMem) {
            this.limitMem = limitMem;
            return this;
        }
        public Integer getLimitMem() {
            return this.limitMem;
        }

        public GetK8sApplicationResponseBodyApplcationApp setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetK8sApplicationResponseBodyApplcationApp setRequestCpuM(Integer requestCpuM) {
            this.requestCpuM = requestCpuM;
            return this;
        }
        public Integer getRequestCpuM() {
            return this.requestCpuM;
        }

        public GetK8sApplicationResponseBodyApplcationApp setRequestMem(Integer requestMem) {
            this.requestMem = requestMem;
            return this;
        }
        public Integer getRequestMem() {
            return this.requestMem;
        }

        public GetK8sApplicationResponseBodyApplcationApp setTomcatVersion(String tomcatVersion) {
            this.tomcatVersion = tomcatVersion;
            return this;
        }
        public String getTomcatVersion() {
            return this.tomcatVersion;
        }

    }

    public static class GetK8sApplicationResponseBodyApplcationConf extends TeaModel {
        @NameInMap("Affinity")
        public String affinity;

        @NameInMap("AhasEnabled")
        public Boolean ahasEnabled;

        @NameInMap("DeployAcrossNodes")
        public String deployAcrossNodes;

        @NameInMap("DeployAcrossZones")
        public String deployAcrossZones;

        @NameInMap("JarStartArgs")
        public String jarStartArgs;

        @NameInMap("JarStartOptions")
        public String jarStartOptions;

        @NameInMap("K8sCmd")
        public String k8sCmd;

        @NameInMap("K8sCmdArgs")
        public String k8sCmdArgs;

        @NameInMap("K8sLocalvolumeInfo")
        public String k8sLocalvolumeInfo;

        @NameInMap("K8sNasInfo")
        public String k8sNasInfo;

        @NameInMap("K8sVolumeInfo")
        public String k8sVolumeInfo;

        @NameInMap("Liveness")
        public String liveness;

        @NameInMap("PostStart")
        public String postStart;

        @NameInMap("PreStop")
        public String preStop;

        @NameInMap("Readiness")
        public String readiness;

        @NameInMap("RuntimeClassName")
        public String runtimeClassName;

        @NameInMap("Tolerations")
        public String tolerations;

        public static GetK8sApplicationResponseBodyApplcationConf build(java.util.Map<String, ?> map) throws Exception {
            GetK8sApplicationResponseBodyApplcationConf self = new GetK8sApplicationResponseBodyApplcationConf();
            return TeaModel.build(map, self);
        }

        public GetK8sApplicationResponseBodyApplcationConf setAffinity(String affinity) {
            this.affinity = affinity;
            return this;
        }
        public String getAffinity() {
            return this.affinity;
        }

        public GetK8sApplicationResponseBodyApplcationConf setAhasEnabled(Boolean ahasEnabled) {
            this.ahasEnabled = ahasEnabled;
            return this;
        }
        public Boolean getAhasEnabled() {
            return this.ahasEnabled;
        }

        public GetK8sApplicationResponseBodyApplcationConf setDeployAcrossNodes(String deployAcrossNodes) {
            this.deployAcrossNodes = deployAcrossNodes;
            return this;
        }
        public String getDeployAcrossNodes() {
            return this.deployAcrossNodes;
        }

        public GetK8sApplicationResponseBodyApplcationConf setDeployAcrossZones(String deployAcrossZones) {
            this.deployAcrossZones = deployAcrossZones;
            return this;
        }
        public String getDeployAcrossZones() {
            return this.deployAcrossZones;
        }

        public GetK8sApplicationResponseBodyApplcationConf setJarStartArgs(String jarStartArgs) {
            this.jarStartArgs = jarStartArgs;
            return this;
        }
        public String getJarStartArgs() {
            return this.jarStartArgs;
        }

        public GetK8sApplicationResponseBodyApplcationConf setJarStartOptions(String jarStartOptions) {
            this.jarStartOptions = jarStartOptions;
            return this;
        }
        public String getJarStartOptions() {
            return this.jarStartOptions;
        }

        public GetK8sApplicationResponseBodyApplcationConf setK8sCmd(String k8sCmd) {
            this.k8sCmd = k8sCmd;
            return this;
        }
        public String getK8sCmd() {
            return this.k8sCmd;
        }

        public GetK8sApplicationResponseBodyApplcationConf setK8sCmdArgs(String k8sCmdArgs) {
            this.k8sCmdArgs = k8sCmdArgs;
            return this;
        }
        public String getK8sCmdArgs() {
            return this.k8sCmdArgs;
        }

        public GetK8sApplicationResponseBodyApplcationConf setK8sLocalvolumeInfo(String k8sLocalvolumeInfo) {
            this.k8sLocalvolumeInfo = k8sLocalvolumeInfo;
            return this;
        }
        public String getK8sLocalvolumeInfo() {
            return this.k8sLocalvolumeInfo;
        }

        public GetK8sApplicationResponseBodyApplcationConf setK8sNasInfo(String k8sNasInfo) {
            this.k8sNasInfo = k8sNasInfo;
            return this;
        }
        public String getK8sNasInfo() {
            return this.k8sNasInfo;
        }

        public GetK8sApplicationResponseBodyApplcationConf setK8sVolumeInfo(String k8sVolumeInfo) {
            this.k8sVolumeInfo = k8sVolumeInfo;
            return this;
        }
        public String getK8sVolumeInfo() {
            return this.k8sVolumeInfo;
        }

        public GetK8sApplicationResponseBodyApplcationConf setLiveness(String liveness) {
            this.liveness = liveness;
            return this;
        }
        public String getLiveness() {
            return this.liveness;
        }

        public GetK8sApplicationResponseBodyApplcationConf setPostStart(String postStart) {
            this.postStart = postStart;
            return this;
        }
        public String getPostStart() {
            return this.postStart;
        }

        public GetK8sApplicationResponseBodyApplcationConf setPreStop(String preStop) {
            this.preStop = preStop;
            return this;
        }
        public String getPreStop() {
            return this.preStop;
        }

        public GetK8sApplicationResponseBodyApplcationConf setReadiness(String readiness) {
            this.readiness = readiness;
            return this;
        }
        public String getReadiness() {
            return this.readiness;
        }

        public GetK8sApplicationResponseBodyApplcationConf setRuntimeClassName(String runtimeClassName) {
            this.runtimeClassName = runtimeClassName;
            return this;
        }
        public String getRuntimeClassName() {
            return this.runtimeClassName;
        }

        public GetK8sApplicationResponseBodyApplcationConf setTolerations(String tolerations) {
            this.tolerations = tolerations;
            return this;
        }
        public String getTolerations() {
            return this.tolerations;
        }

    }

    public static class GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponentsComponents extends TeaModel {
        @NameInMap("ComponentId")
        public String componentId;

        @NameInMap("ComponentKey")
        public String componentKey;

        @NameInMap("Type")
        public String type;

        public static GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponentsComponents build(java.util.Map<String, ?> map) throws Exception {
            GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponentsComponents self = new GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponentsComponents();
            return TeaModel.build(map, self);
        }

        public GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponentsComponents setComponentId(String componentId) {
            this.componentId = componentId;
            return this;
        }
        public String getComponentId() {
            return this.componentId;
        }

        public GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponentsComponents setComponentKey(String componentKey) {
            this.componentKey = componentKey;
            return this;
        }
        public String getComponentKey() {
            return this.componentKey;
        }

        public GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponentsComponents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponents extends TeaModel {
        @NameInMap("Components")
        public java.util.List<GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponentsComponents> components;

        public static GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponents build(java.util.Map<String, ?> map) throws Exception {
            GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponents self = new GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponents();
            return TeaModel.build(map, self);
        }

        public GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponents setComponents(java.util.List<GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponentsComponents> components) {
            this.components = components;
            return this;
        }
        public java.util.List<GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponentsComponents> getComponents() {
            return this.components;
        }

    }

    public static class GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroup extends TeaModel {
        @NameInMap("Components")
        public GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponents components;

        public static GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroup build(java.util.Map<String, ?> map) throws Exception {
            GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroup self = new GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroup();
            return TeaModel.build(map, self);
        }

        public GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroup setComponents(GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponents components) {
            this.components = components;
            return this;
        }
        public GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponents getComponents() {
            return this.components;
        }

    }

    public static class GetK8sApplicationResponseBodyApplcationDeployGroups extends TeaModel {
        @NameInMap("DeployGroup")
        public java.util.List<GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroup> deployGroup;

        public static GetK8sApplicationResponseBodyApplcationDeployGroups build(java.util.Map<String, ?> map) throws Exception {
            GetK8sApplicationResponseBodyApplcationDeployGroups self = new GetK8sApplicationResponseBodyApplcationDeployGroups();
            return TeaModel.build(map, self);
        }

        public GetK8sApplicationResponseBodyApplcationDeployGroups setDeployGroup(java.util.List<GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroup> deployGroup) {
            this.deployGroup = deployGroup;
            return this;
        }
        public java.util.List<GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroup> getDeployGroup() {
            return this.deployGroup;
        }

    }

    public static class GetK8sApplicationResponseBodyApplcationImageInfo extends TeaModel {
        @NameInMap("ImageUrl")
        public String imageUrl;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RepoId")
        public String repoId;

        @NameInMap("RepoName")
        public String repoName;

        @NameInMap("RepoNamespace")
        public String repoNamespace;

        @NameInMap("RepoOriginType")
        public String repoOriginType;

        @NameInMap("Tag")
        public String tag;

        public static GetK8sApplicationResponseBodyApplcationImageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetK8sApplicationResponseBodyApplcationImageInfo self = new GetK8sApplicationResponseBodyApplcationImageInfo();
            return TeaModel.build(map, self);
        }

        public GetK8sApplicationResponseBodyApplcationImageInfo setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public GetK8sApplicationResponseBodyApplcationImageInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetK8sApplicationResponseBodyApplcationImageInfo setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

        public GetK8sApplicationResponseBodyApplcationImageInfo setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public GetK8sApplicationResponseBodyApplcationImageInfo setRepoNamespace(String repoNamespace) {
            this.repoNamespace = repoNamespace;
            return this;
        }
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        public GetK8sApplicationResponseBodyApplcationImageInfo setRepoOriginType(String repoOriginType) {
            this.repoOriginType = repoOriginType;
            return this;
        }
        public String getRepoOriginType() {
            return this.repoOriginType;
        }

        public GetK8sApplicationResponseBodyApplcationImageInfo setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

    public static class GetK8sApplicationResponseBodyApplcationLatestVersion extends TeaModel {
        @NameInMap("PackageVersion")
        public String packageVersion;

        @NameInMap("Url")
        public String url;

        @NameInMap("WarUrl")
        public String warUrl;

        public static GetK8sApplicationResponseBodyApplcationLatestVersion build(java.util.Map<String, ?> map) throws Exception {
            GetK8sApplicationResponseBodyApplcationLatestVersion self = new GetK8sApplicationResponseBodyApplcationLatestVersion();
            return TeaModel.build(map, self);
        }

        public GetK8sApplicationResponseBodyApplcationLatestVersion setPackageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }
        public String getPackageVersion() {
            return this.packageVersion;
        }

        public GetK8sApplicationResponseBodyApplcationLatestVersion setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetK8sApplicationResponseBodyApplcationLatestVersion setWarUrl(String warUrl) {
            this.warUrl = warUrl;
            return this;
        }
        public String getWarUrl() {
            return this.warUrl;
        }

    }

    public static class GetK8sApplicationResponseBodyApplcation extends TeaModel {
        @NameInMap("App")
        public GetK8sApplicationResponseBodyApplcationApp app;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("Conf")
        public GetK8sApplicationResponseBodyApplcationConf conf;

        @NameInMap("DeployGroups")
        public GetK8sApplicationResponseBodyApplcationDeployGroups deployGroups;

        @NameInMap("ImageInfo")
        public GetK8sApplicationResponseBodyApplcationImageInfo imageInfo;

        @NameInMap("LatestVersion")
        public GetK8sApplicationResponseBodyApplcationLatestVersion latestVersion;

        public static GetK8sApplicationResponseBodyApplcation build(java.util.Map<String, ?> map) throws Exception {
            GetK8sApplicationResponseBodyApplcation self = new GetK8sApplicationResponseBodyApplcation();
            return TeaModel.build(map, self);
        }

        public GetK8sApplicationResponseBodyApplcation setApp(GetK8sApplicationResponseBodyApplcationApp app) {
            this.app = app;
            return this;
        }
        public GetK8sApplicationResponseBodyApplcationApp getApp() {
            return this.app;
        }

        public GetK8sApplicationResponseBodyApplcation setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetK8sApplicationResponseBodyApplcation setConf(GetK8sApplicationResponseBodyApplcationConf conf) {
            this.conf = conf;
            return this;
        }
        public GetK8sApplicationResponseBodyApplcationConf getConf() {
            return this.conf;
        }

        public GetK8sApplicationResponseBodyApplcation setDeployGroups(GetK8sApplicationResponseBodyApplcationDeployGroups deployGroups) {
            this.deployGroups = deployGroups;
            return this;
        }
        public GetK8sApplicationResponseBodyApplcationDeployGroups getDeployGroups() {
            return this.deployGroups;
        }

        public GetK8sApplicationResponseBodyApplcation setImageInfo(GetK8sApplicationResponseBodyApplcationImageInfo imageInfo) {
            this.imageInfo = imageInfo;
            return this;
        }
        public GetK8sApplicationResponseBodyApplcationImageInfo getImageInfo() {
            return this.imageInfo;
        }

        public GetK8sApplicationResponseBodyApplcation setLatestVersion(GetK8sApplicationResponseBodyApplcationLatestVersion latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }
        public GetK8sApplicationResponseBodyApplcationLatestVersion getLatestVersion() {
            return this.latestVersion;
        }

    }

}
