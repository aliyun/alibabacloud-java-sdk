// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetK8sApplicationResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Applcation")
    public GetK8sApplicationResponseBodyApplcation applcation;

    @NameInMap("Code")
    public Integer code;

    public static GetK8sApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetK8sApplicationResponseBody self = new GetK8sApplicationResponseBody();
        return TeaModel.build(map, self);
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

    public static class GetK8sApplicationResponseBodyApplcationConf extends TeaModel {
        @NameInMap("PostStart")
        public String postStart;

        @NameInMap("Readiness")
        public String readiness;

        @NameInMap("AhasEnabled")
        public Boolean ahasEnabled;

        @NameInMap("K8sCmdArgs")
        public String k8sCmdArgs;

        @NameInMap("Liveness")
        public String liveness;

        @NameInMap("DeployAcrossNodes")
        public String deployAcrossNodes;

        @NameInMap("K8sCmd")
        public String k8sCmd;

        @NameInMap("PreStop")
        public String preStop;

        @NameInMap("JarStartArgs")
        public String jarStartArgs;

        @NameInMap("DeployAcrossZones")
        public String deployAcrossZones;

        @NameInMap("K8sNasInfo")
        public String k8sNasInfo;

        @NameInMap("JarStartOptions")
        public String jarStartOptions;

        @NameInMap("RuntimeClassName")
        public String runtimeClassName;

        @NameInMap("K8sLocalvolumeInfo")
        public String k8sLocalvolumeInfo;

        @NameInMap("K8sVolumeInfo")
        public String k8sVolumeInfo;

        public static GetK8sApplicationResponseBodyApplcationConf build(java.util.Map<String, ?> map) throws Exception {
            GetK8sApplicationResponseBodyApplcationConf self = new GetK8sApplicationResponseBodyApplcationConf();
            return TeaModel.build(map, self);
        }

        public GetK8sApplicationResponseBodyApplcationConf setPostStart(String postStart) {
            this.postStart = postStart;
            return this;
        }
        public String getPostStart() {
            return this.postStart;
        }

        public GetK8sApplicationResponseBodyApplcationConf setReadiness(String readiness) {
            this.readiness = readiness;
            return this;
        }
        public String getReadiness() {
            return this.readiness;
        }

        public GetK8sApplicationResponseBodyApplcationConf setAhasEnabled(Boolean ahasEnabled) {
            this.ahasEnabled = ahasEnabled;
            return this;
        }
        public Boolean getAhasEnabled() {
            return this.ahasEnabled;
        }

        public GetK8sApplicationResponseBodyApplcationConf setK8sCmdArgs(String k8sCmdArgs) {
            this.k8sCmdArgs = k8sCmdArgs;
            return this;
        }
        public String getK8sCmdArgs() {
            return this.k8sCmdArgs;
        }

        public GetK8sApplicationResponseBodyApplcationConf setLiveness(String liveness) {
            this.liveness = liveness;
            return this;
        }
        public String getLiveness() {
            return this.liveness;
        }

        public GetK8sApplicationResponseBodyApplcationConf setDeployAcrossNodes(String deployAcrossNodes) {
            this.deployAcrossNodes = deployAcrossNodes;
            return this;
        }
        public String getDeployAcrossNodes() {
            return this.deployAcrossNodes;
        }

        public GetK8sApplicationResponseBodyApplcationConf setK8sCmd(String k8sCmd) {
            this.k8sCmd = k8sCmd;
            return this;
        }
        public String getK8sCmd() {
            return this.k8sCmd;
        }

        public GetK8sApplicationResponseBodyApplcationConf setPreStop(String preStop) {
            this.preStop = preStop;
            return this;
        }
        public String getPreStop() {
            return this.preStop;
        }

        public GetK8sApplicationResponseBodyApplcationConf setJarStartArgs(String jarStartArgs) {
            this.jarStartArgs = jarStartArgs;
            return this;
        }
        public String getJarStartArgs() {
            return this.jarStartArgs;
        }

        public GetK8sApplicationResponseBodyApplcationConf setDeployAcrossZones(String deployAcrossZones) {
            this.deployAcrossZones = deployAcrossZones;
            return this;
        }
        public String getDeployAcrossZones() {
            return this.deployAcrossZones;
        }

        public GetK8sApplicationResponseBodyApplcationConf setK8sNasInfo(String k8sNasInfo) {
            this.k8sNasInfo = k8sNasInfo;
            return this;
        }
        public String getK8sNasInfo() {
            return this.k8sNasInfo;
        }

        public GetK8sApplicationResponseBodyApplcationConf setJarStartOptions(String jarStartOptions) {
            this.jarStartOptions = jarStartOptions;
            return this;
        }
        public String getJarStartOptions() {
            return this.jarStartOptions;
        }

        public GetK8sApplicationResponseBodyApplcationConf setRuntimeClassName(String runtimeClassName) {
            this.runtimeClassName = runtimeClassName;
            return this;
        }
        public String getRuntimeClassName() {
            return this.runtimeClassName;
        }

        public GetK8sApplicationResponseBodyApplcationConf setK8sLocalvolumeInfo(String k8sLocalvolumeInfo) {
            this.k8sLocalvolumeInfo = k8sLocalvolumeInfo;
            return this;
        }
        public String getK8sLocalvolumeInfo() {
            return this.k8sLocalvolumeInfo;
        }

        public GetK8sApplicationResponseBodyApplcationConf setK8sVolumeInfo(String k8sVolumeInfo) {
            this.k8sVolumeInfo = k8sVolumeInfo;
            return this;
        }
        public String getK8sVolumeInfo() {
            return this.k8sVolumeInfo;
        }

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
        @NameInMap("Value")
        public String value;

        @NameInMap("Name")
        public String name;

        public static GetK8sApplicationResponseBodyApplcationAppEnvListEnv build(java.util.Map<String, ?> map) throws Exception {
            GetK8sApplicationResponseBodyApplcationAppEnvListEnv self = new GetK8sApplicationResponseBodyApplcationAppEnvListEnv();
            return TeaModel.build(map, self);
        }

        public GetK8sApplicationResponseBodyApplcationAppEnvListEnv setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetK8sApplicationResponseBodyApplcationAppEnvListEnv setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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
        @NameInMap("InstancesBeforeScaling")
        public Integer instancesBeforeScaling;

        @NameInMap("DeployType")
        public String deployType;

        @NameInMap("ApplicationName")
        public String applicationName;

        @NameInMap("ApplicationType")
        public String applicationType;

        @NameInMap("Instances")
        public Integer instances;

        @NameInMap("CmdArgs")
        public GetK8sApplicationResponseBodyApplcationAppCmdArgs cmdArgs;

        @NameInMap("Cmd")
        public String cmd;

        @NameInMap("BuildpackId")
        public Integer buildpackId;

        @NameInMap("TomcatVersion")
        public String tomcatVersion;

        @NameInMap("CsClusterId")
        public String csClusterId;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("EdasContainerVersion")
        public String edasContainerVersion;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("EnvList")
        public GetK8sApplicationResponseBodyApplcationAppEnvList envList;

        public static GetK8sApplicationResponseBodyApplcationApp build(java.util.Map<String, ?> map) throws Exception {
            GetK8sApplicationResponseBodyApplcationApp self = new GetK8sApplicationResponseBodyApplcationApp();
            return TeaModel.build(map, self);
        }

        public GetK8sApplicationResponseBodyApplcationApp setInstancesBeforeScaling(Integer instancesBeforeScaling) {
            this.instancesBeforeScaling = instancesBeforeScaling;
            return this;
        }
        public Integer getInstancesBeforeScaling() {
            return this.instancesBeforeScaling;
        }

        public GetK8sApplicationResponseBodyApplcationApp setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
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

        public GetK8sApplicationResponseBodyApplcationApp setInstances(Integer instances) {
            this.instances = instances;
            return this;
        }
        public Integer getInstances() {
            return this.instances;
        }

        public GetK8sApplicationResponseBodyApplcationApp setCmdArgs(GetK8sApplicationResponseBodyApplcationAppCmdArgs cmdArgs) {
            this.cmdArgs = cmdArgs;
            return this;
        }
        public GetK8sApplicationResponseBodyApplcationAppCmdArgs getCmdArgs() {
            return this.cmdArgs;
        }

        public GetK8sApplicationResponseBodyApplcationApp setCmd(String cmd) {
            this.cmd = cmd;
            return this;
        }
        public String getCmd() {
            return this.cmd;
        }

        public GetK8sApplicationResponseBodyApplcationApp setBuildpackId(Integer buildpackId) {
            this.buildpackId = buildpackId;
            return this;
        }
        public Integer getBuildpackId() {
            return this.buildpackId;
        }

        public GetK8sApplicationResponseBodyApplcationApp setTomcatVersion(String tomcatVersion) {
            this.tomcatVersion = tomcatVersion;
            return this;
        }
        public String getTomcatVersion() {
            return this.tomcatVersion;
        }

        public GetK8sApplicationResponseBodyApplcationApp setCsClusterId(String csClusterId) {
            this.csClusterId = csClusterId;
            return this;
        }
        public String getCsClusterId() {
            return this.csClusterId;
        }

        public GetK8sApplicationResponseBodyApplcationApp setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetK8sApplicationResponseBodyApplcationApp setEdasContainerVersion(String edasContainerVersion) {
            this.edasContainerVersion = edasContainerVersion;
            return this;
        }
        public String getEdasContainerVersion() {
            return this.edasContainerVersion;
        }

        public GetK8sApplicationResponseBodyApplcationApp setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetK8sApplicationResponseBodyApplcationApp setEnvList(GetK8sApplicationResponseBodyApplcationAppEnvList envList) {
            this.envList = envList;
            return this;
        }
        public GetK8sApplicationResponseBodyApplcationAppEnvList getEnvList() {
            return this.envList;
        }

    }

    public static class GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponentsComponents extends TeaModel {
        @NameInMap("ComponentKey")
        public String componentKey;

        @NameInMap("ComponentId")
        public String componentId;

        public static GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponentsComponents build(java.util.Map<String, ?> map) throws Exception {
            GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponentsComponents self = new GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponentsComponents();
            return TeaModel.build(map, self);
        }

        public GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponentsComponents setComponentKey(String componentKey) {
            this.componentKey = componentKey;
            return this;
        }
        public String getComponentKey() {
            return this.componentKey;
        }

        public GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponentsComponents setComponentId(String componentId) {
            this.componentId = componentId;
            return this;
        }
        public String getComponentId() {
            return this.componentId;
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
        @NameInMap("RepoId")
        public String repoId;

        @NameInMap("ImageUrl")
        public String imageUrl;

        @NameInMap("RepoOriginType")
        public String repoOriginType;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("RepoName")
        public String repoName;

        @NameInMap("RepoNamespace")
        public String repoNamespace;

        @NameInMap("RegionId")
        public String regionId;

        public static GetK8sApplicationResponseBodyApplcationImageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetK8sApplicationResponseBodyApplcationImageInfo self = new GetK8sApplicationResponseBodyApplcationImageInfo();
            return TeaModel.build(map, self);
        }

        public GetK8sApplicationResponseBodyApplcationImageInfo setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

        public GetK8sApplicationResponseBodyApplcationImageInfo setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
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

        public GetK8sApplicationResponseBodyApplcationImageInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class GetK8sApplicationResponseBodyApplcation extends TeaModel {
        @NameInMap("Conf")
        public GetK8sApplicationResponseBodyApplcationConf conf;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("App")
        public GetK8sApplicationResponseBodyApplcationApp app;

        @NameInMap("DeployGroups")
        public GetK8sApplicationResponseBodyApplcationDeployGroups deployGroups;

        @NameInMap("ImageInfo")
        public GetK8sApplicationResponseBodyApplcationImageInfo imageInfo;

        public static GetK8sApplicationResponseBodyApplcation build(java.util.Map<String, ?> map) throws Exception {
            GetK8sApplicationResponseBodyApplcation self = new GetK8sApplicationResponseBodyApplcation();
            return TeaModel.build(map, self);
        }

        public GetK8sApplicationResponseBodyApplcation setConf(GetK8sApplicationResponseBodyApplcationConf conf) {
            this.conf = conf;
            return this;
        }
        public GetK8sApplicationResponseBodyApplcationConf getConf() {
            return this.conf;
        }

        public GetK8sApplicationResponseBodyApplcation setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetK8sApplicationResponseBodyApplcation setApp(GetK8sApplicationResponseBodyApplcationApp app) {
            this.app = app;
            return this;
        }
        public GetK8sApplicationResponseBodyApplcationApp getApp() {
            return this.app;
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

    }

}
