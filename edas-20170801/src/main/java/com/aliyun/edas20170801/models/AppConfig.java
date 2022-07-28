// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class AppConfig extends TeaModel {
    @NameInMap("Command")
    public String command;

    @NameInMap("CommandArgs")
    public java.util.List<String> commandArgs;

    @NameInMap("ConfigMountDescs")
    public java.util.List<AppConfigConfigMountDescs> configMountDescs;

    @NameInMap("DeployAcrossNodes")
    public Boolean deployAcrossNodes;

    @NameInMap("DeployAcrossZones")
    public Boolean deployAcrossZones;

    @NameInMap("EmptyDirs")
    public java.util.List<AppConfigEmptyDirs> emptyDirs;

    @NameInMap("EnableAhas")
    public Boolean enableAhas;

    @NameInMap("EnvFroms")
    public java.util.List<AppConfigEnvFroms> envFroms;

    @NameInMap("Envs")
    public java.util.List<AppConfigEnvs> envs;

    @NameInMap("ImageConfig")
    public AppConfigImageConfig imageConfig;

    @NameInMap("IsMultilingualApp")
    public Boolean isMultilingualApp;

    @NameInMap("JavaStartUpConfig")
    public String javaStartUpConfig;

    @NameInMap("LimitCpu")
    public String limitCpu;

    @NameInMap("LimitMem")
    public String limitMem;

    @NameInMap("Liveness")
    public String liveness;

    @NameInMap("LocalVolumes")
    public java.util.List<AppConfigLocalVolumes> localVolumes;

    @NameInMap("NasId")
    public String nasId;

    @NameInMap("NasMountDescs")
    public java.util.List<AppConfigNasMountDescs> nasMountDescs;

    @NameInMap("NasStorageType")
    public String nasStorageType;

    @NameInMap("PackageConfig")
    public AppConfigPackageConfig packageConfig;

    @NameInMap("PostStart")
    public String postStart;

    @NameInMap("PreStop")
    public String preStop;

    @NameInMap("PvcMountDescs")
    public java.util.List<AppConfigPvcMountDescs> pvcMountDescs;

    @NameInMap("Readiness")
    public String readiness;

    @NameInMap("Replicas")
    public Long replicas;

    @NameInMap("RequestCpu")
    public String requestCpu;

    @NameInMap("RequestMem")
    public String requestMem;

    @NameInMap("RuntimeClassName")
    public String runtimeClassName;

    @NameInMap("SlsConfigs")
    public java.util.List<AppConfigSlsConfigs> slsConfigs;

    @NameInMap("WebContainerConfig")
    public AppConfigWebContainerConfig webContainerConfig;

    public static AppConfig build(java.util.Map<String, ?> map) throws Exception {
        AppConfig self = new AppConfig();
        return TeaModel.build(map, self);
    }

    public AppConfig setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public AppConfig setCommandArgs(java.util.List<String> commandArgs) {
        this.commandArgs = commandArgs;
        return this;
    }
    public java.util.List<String> getCommandArgs() {
        return this.commandArgs;
    }

    public AppConfig setConfigMountDescs(java.util.List<AppConfigConfigMountDescs> configMountDescs) {
        this.configMountDescs = configMountDescs;
        return this;
    }
    public java.util.List<AppConfigConfigMountDescs> getConfigMountDescs() {
        return this.configMountDescs;
    }

    public AppConfig setDeployAcrossNodes(Boolean deployAcrossNodes) {
        this.deployAcrossNodes = deployAcrossNodes;
        return this;
    }
    public Boolean getDeployAcrossNodes() {
        return this.deployAcrossNodes;
    }

    public AppConfig setDeployAcrossZones(Boolean deployAcrossZones) {
        this.deployAcrossZones = deployAcrossZones;
        return this;
    }
    public Boolean getDeployAcrossZones() {
        return this.deployAcrossZones;
    }

    public AppConfig setEmptyDirs(java.util.List<AppConfigEmptyDirs> emptyDirs) {
        this.emptyDirs = emptyDirs;
        return this;
    }
    public java.util.List<AppConfigEmptyDirs> getEmptyDirs() {
        return this.emptyDirs;
    }

    public AppConfig setEnableAhas(Boolean enableAhas) {
        this.enableAhas = enableAhas;
        return this;
    }
    public Boolean getEnableAhas() {
        return this.enableAhas;
    }

    public AppConfig setEnvFroms(java.util.List<AppConfigEnvFroms> envFroms) {
        this.envFroms = envFroms;
        return this;
    }
    public java.util.List<AppConfigEnvFroms> getEnvFroms() {
        return this.envFroms;
    }

    public AppConfig setEnvs(java.util.List<AppConfigEnvs> envs) {
        this.envs = envs;
        return this;
    }
    public java.util.List<AppConfigEnvs> getEnvs() {
        return this.envs;
    }

    public AppConfig setImageConfig(AppConfigImageConfig imageConfig) {
        this.imageConfig = imageConfig;
        return this;
    }
    public AppConfigImageConfig getImageConfig() {
        return this.imageConfig;
    }

    public AppConfig setIsMultilingualApp(Boolean isMultilingualApp) {
        this.isMultilingualApp = isMultilingualApp;
        return this;
    }
    public Boolean getIsMultilingualApp() {
        return this.isMultilingualApp;
    }

    public AppConfig setJavaStartUpConfig(String javaStartUpConfig) {
        this.javaStartUpConfig = javaStartUpConfig;
        return this;
    }
    public String getJavaStartUpConfig() {
        return this.javaStartUpConfig;
    }

    public AppConfig setLimitCpu(String limitCpu) {
        this.limitCpu = limitCpu;
        return this;
    }
    public String getLimitCpu() {
        return this.limitCpu;
    }

    public AppConfig setLimitMem(String limitMem) {
        this.limitMem = limitMem;
        return this;
    }
    public String getLimitMem() {
        return this.limitMem;
    }

    public AppConfig setLiveness(String liveness) {
        this.liveness = liveness;
        return this;
    }
    public String getLiveness() {
        return this.liveness;
    }

    public AppConfig setLocalVolumes(java.util.List<AppConfigLocalVolumes> localVolumes) {
        this.localVolumes = localVolumes;
        return this;
    }
    public java.util.List<AppConfigLocalVolumes> getLocalVolumes() {
        return this.localVolumes;
    }

    public AppConfig setNasId(String nasId) {
        this.nasId = nasId;
        return this;
    }
    public String getNasId() {
        return this.nasId;
    }

    public AppConfig setNasMountDescs(java.util.List<AppConfigNasMountDescs> nasMountDescs) {
        this.nasMountDescs = nasMountDescs;
        return this;
    }
    public java.util.List<AppConfigNasMountDescs> getNasMountDescs() {
        return this.nasMountDescs;
    }

    public AppConfig setNasStorageType(String nasStorageType) {
        this.nasStorageType = nasStorageType;
        return this;
    }
    public String getNasStorageType() {
        return this.nasStorageType;
    }

    public AppConfig setPackageConfig(AppConfigPackageConfig packageConfig) {
        this.packageConfig = packageConfig;
        return this;
    }
    public AppConfigPackageConfig getPackageConfig() {
        return this.packageConfig;
    }

    public AppConfig setPostStart(String postStart) {
        this.postStart = postStart;
        return this;
    }
    public String getPostStart() {
        return this.postStart;
    }

    public AppConfig setPreStop(String preStop) {
        this.preStop = preStop;
        return this;
    }
    public String getPreStop() {
        return this.preStop;
    }

    public AppConfig setPvcMountDescs(java.util.List<AppConfigPvcMountDescs> pvcMountDescs) {
        this.pvcMountDescs = pvcMountDescs;
        return this;
    }
    public java.util.List<AppConfigPvcMountDescs> getPvcMountDescs() {
        return this.pvcMountDescs;
    }

    public AppConfig setReadiness(String readiness) {
        this.readiness = readiness;
        return this;
    }
    public String getReadiness() {
        return this.readiness;
    }

    public AppConfig setReplicas(Long replicas) {
        this.replicas = replicas;
        return this;
    }
    public Long getReplicas() {
        return this.replicas;
    }

    public AppConfig setRequestCpu(String requestCpu) {
        this.requestCpu = requestCpu;
        return this;
    }
    public String getRequestCpu() {
        return this.requestCpu;
    }

    public AppConfig setRequestMem(String requestMem) {
        this.requestMem = requestMem;
        return this;
    }
    public String getRequestMem() {
        return this.requestMem;
    }

    public AppConfig setRuntimeClassName(String runtimeClassName) {
        this.runtimeClassName = runtimeClassName;
        return this;
    }
    public String getRuntimeClassName() {
        return this.runtimeClassName;
    }

    public AppConfig setSlsConfigs(java.util.List<AppConfigSlsConfigs> slsConfigs) {
        this.slsConfigs = slsConfigs;
        return this;
    }
    public java.util.List<AppConfigSlsConfigs> getSlsConfigs() {
        return this.slsConfigs;
    }

    public AppConfig setWebContainerConfig(AppConfigWebContainerConfig webContainerConfig) {
        this.webContainerConfig = webContainerConfig;
        return this;
    }
    public AppConfigWebContainerConfig getWebContainerConfig() {
        return this.webContainerConfig;
    }

    public static class AppConfigConfigMountDescsMountItems extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Path")
        public String path;

        public static AppConfigConfigMountDescsMountItems build(java.util.Map<String, ?> map) throws Exception {
            AppConfigConfigMountDescsMountItems self = new AppConfigConfigMountDescsMountItems();
            return TeaModel.build(map, self);
        }

        public AppConfigConfigMountDescsMountItems setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AppConfigConfigMountDescsMountItems setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class AppConfigConfigMountDescs extends TeaModel {
        @NameInMap("MountItems")
        public java.util.List<AppConfigConfigMountDescsMountItems> mountItems;

        @NameInMap("MountPath")
        public String mountPath;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static AppConfigConfigMountDescs build(java.util.Map<String, ?> map) throws Exception {
            AppConfigConfigMountDescs self = new AppConfigConfigMountDescs();
            return TeaModel.build(map, self);
        }

        public AppConfigConfigMountDescs setMountItems(java.util.List<AppConfigConfigMountDescsMountItems> mountItems) {
            this.mountItems = mountItems;
            return this;
        }
        public java.util.List<AppConfigConfigMountDescsMountItems> getMountItems() {
            return this.mountItems;
        }

        public AppConfigConfigMountDescs setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public AppConfigConfigMountDescs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AppConfigConfigMountDescs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class AppConfigEmptyDirs extends TeaModel {
        @NameInMap("MountPath")
        public String mountPath;

        @NameInMap("Name")
        public String name;

        @NameInMap("ReadOnly")
        public Boolean readOnly;

        @NameInMap("SubPathExpr")
        public String subPathExpr;

        public static AppConfigEmptyDirs build(java.util.Map<String, ?> map) throws Exception {
            AppConfigEmptyDirs self = new AppConfigEmptyDirs();
            return TeaModel.build(map, self);
        }

        public AppConfigEmptyDirs setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public AppConfigEmptyDirs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AppConfigEmptyDirs setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public AppConfigEmptyDirs setSubPathExpr(String subPathExpr) {
            this.subPathExpr = subPathExpr;
            return this;
        }
        public String getSubPathExpr() {
            return this.subPathExpr;
        }

    }

    public static class AppConfigEnvFroms extends TeaModel {
        @NameInMap("ConfigMapRef")
        public String configMapRef;

        @NameInMap("SecretRef")
        public String secretRef;

        public static AppConfigEnvFroms build(java.util.Map<String, ?> map) throws Exception {
            AppConfigEnvFroms self = new AppConfigEnvFroms();
            return TeaModel.build(map, self);
        }

        public AppConfigEnvFroms setConfigMapRef(String configMapRef) {
            this.configMapRef = configMapRef;
            return this;
        }
        public String getConfigMapRef() {
            return this.configMapRef;
        }

        public AppConfigEnvFroms setSecretRef(String secretRef) {
            this.secretRef = secretRef;
            return this;
        }
        public String getSecretRef() {
            return this.secretRef;
        }

    }

    public static class AppConfigEnvs extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        @NameInMap("ValueFrom")
        public String valueFrom;

        public static AppConfigEnvs build(java.util.Map<String, ?> map) throws Exception {
            AppConfigEnvs self = new AppConfigEnvs();
            return TeaModel.build(map, self);
        }

        public AppConfigEnvs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AppConfigEnvs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public AppConfigEnvs setValueFrom(String valueFrom) {
            this.valueFrom = valueFrom;
            return this;
        }
        public String getValueFrom() {
            return this.valueFrom;
        }

    }

    public static class AppConfigImageConfig extends TeaModel {
        @NameInMap("ContainerRegistryId")
        public String containerRegistryId;

        @NameInMap("CrInstanceId")
        public String crInstanceId;

        @NameInMap("CrRegionId")
        public String crRegionId;

        @NameInMap("ImageUrl")
        public String imageUrl;

        public static AppConfigImageConfig build(java.util.Map<String, ?> map) throws Exception {
            AppConfigImageConfig self = new AppConfigImageConfig();
            return TeaModel.build(map, self);
        }

        public AppConfigImageConfig setContainerRegistryId(String containerRegistryId) {
            this.containerRegistryId = containerRegistryId;
            return this;
        }
        public String getContainerRegistryId() {
            return this.containerRegistryId;
        }

        public AppConfigImageConfig setCrInstanceId(String crInstanceId) {
            this.crInstanceId = crInstanceId;
            return this;
        }
        public String getCrInstanceId() {
            return this.crInstanceId;
        }

        public AppConfigImageConfig setCrRegionId(String crRegionId) {
            this.crRegionId = crRegionId;
            return this;
        }
        public String getCrRegionId() {
            return this.crRegionId;
        }

        public AppConfigImageConfig setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

    }

    public static class AppConfigLocalVolumes extends TeaModel {
        @NameInMap("MountPath")
        public String mountPath;

        @NameInMap("Name")
        public String name;

        @NameInMap("NodePath")
        public String nodePath;

        @NameInMap("OpsAuth")
        public Long opsAuth;

        @NameInMap("Type")
        public String type;

        public static AppConfigLocalVolumes build(java.util.Map<String, ?> map) throws Exception {
            AppConfigLocalVolumes self = new AppConfigLocalVolumes();
            return TeaModel.build(map, self);
        }

        public AppConfigLocalVolumes setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public AppConfigLocalVolumes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AppConfigLocalVolumes setNodePath(String nodePath) {
            this.nodePath = nodePath;
            return this;
        }
        public String getNodePath() {
            return this.nodePath;
        }

        public AppConfigLocalVolumes setOpsAuth(Long opsAuth) {
            this.opsAuth = opsAuth;
            return this;
        }
        public Long getOpsAuth() {
            return this.opsAuth;
        }

        public AppConfigLocalVolumes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class AppConfigNasMountDescs extends TeaModel {
        @NameInMap("MountPath")
        public String mountPath;

        @NameInMap("NasPath")
        public String nasPath;

        public static AppConfigNasMountDescs build(java.util.Map<String, ?> map) throws Exception {
            AppConfigNasMountDescs self = new AppConfigNasMountDescs();
            return TeaModel.build(map, self);
        }

        public AppConfigNasMountDescs setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public AppConfigNasMountDescs setNasPath(String nasPath) {
            this.nasPath = nasPath;
            return this;
        }
        public String getNasPath() {
            return this.nasPath;
        }

    }

    public static class AppConfigPackageConfig extends TeaModel {
        @NameInMap("EdasContainerVersion")
        public String edasContainerVersion;

        @NameInMap("Jdk")
        public String jdk;

        @NameInMap("PackageType")
        public String packageType;

        @NameInMap("PackageUrl")
        public String packageUrl;

        @NameInMap("PackageVersion")
        public String packageVersion;

        @NameInMap("Timezone")
        public String timezone;

        @NameInMap("UriEncoding")
        public String uriEncoding;

        @NameInMap("UseBodyEncoding")
        public Boolean useBodyEncoding;

        @NameInMap("WebContainer")
        public String webContainer;

        public static AppConfigPackageConfig build(java.util.Map<String, ?> map) throws Exception {
            AppConfigPackageConfig self = new AppConfigPackageConfig();
            return TeaModel.build(map, self);
        }

        public AppConfigPackageConfig setEdasContainerVersion(String edasContainerVersion) {
            this.edasContainerVersion = edasContainerVersion;
            return this;
        }
        public String getEdasContainerVersion() {
            return this.edasContainerVersion;
        }

        public AppConfigPackageConfig setJdk(String jdk) {
            this.jdk = jdk;
            return this;
        }
        public String getJdk() {
            return this.jdk;
        }

        public AppConfigPackageConfig setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public AppConfigPackageConfig setPackageUrl(String packageUrl) {
            this.packageUrl = packageUrl;
            return this;
        }
        public String getPackageUrl() {
            return this.packageUrl;
        }

        public AppConfigPackageConfig setPackageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }
        public String getPackageVersion() {
            return this.packageVersion;
        }

        public AppConfigPackageConfig setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public AppConfigPackageConfig setUriEncoding(String uriEncoding) {
            this.uriEncoding = uriEncoding;
            return this;
        }
        public String getUriEncoding() {
            return this.uriEncoding;
        }

        public AppConfigPackageConfig setUseBodyEncoding(Boolean useBodyEncoding) {
            this.useBodyEncoding = useBodyEncoding;
            return this;
        }
        public Boolean getUseBodyEncoding() {
            return this.useBodyEncoding;
        }

        public AppConfigPackageConfig setWebContainer(String webContainer) {
            this.webContainer = webContainer;
            return this;
        }
        public String getWebContainer() {
            return this.webContainer;
        }

    }

    public static class AppConfigPvcMountDescsMountPaths extends TeaModel {
        @NameInMap("MountPath")
        public String mountPath;

        @NameInMap("ReadOnly")
        public Boolean readOnly;

        @NameInMap("SubPathExpr")
        public String subPathExpr;

        public static AppConfigPvcMountDescsMountPaths build(java.util.Map<String, ?> map) throws Exception {
            AppConfigPvcMountDescsMountPaths self = new AppConfigPvcMountDescsMountPaths();
            return TeaModel.build(map, self);
        }

        public AppConfigPvcMountDescsMountPaths setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public AppConfigPvcMountDescsMountPaths setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public AppConfigPvcMountDescsMountPaths setSubPathExpr(String subPathExpr) {
            this.subPathExpr = subPathExpr;
            return this;
        }
        public String getSubPathExpr() {
            return this.subPathExpr;
        }

    }

    public static class AppConfigPvcMountDescs extends TeaModel {
        @NameInMap("MountPaths")
        public java.util.List<AppConfigPvcMountDescsMountPaths> mountPaths;

        @NameInMap("PvcName")
        public String pvcName;

        public static AppConfigPvcMountDescs build(java.util.Map<String, ?> map) throws Exception {
            AppConfigPvcMountDescs self = new AppConfigPvcMountDescs();
            return TeaModel.build(map, self);
        }

        public AppConfigPvcMountDescs setMountPaths(java.util.List<AppConfigPvcMountDescsMountPaths> mountPaths) {
            this.mountPaths = mountPaths;
            return this;
        }
        public java.util.List<AppConfigPvcMountDescsMountPaths> getMountPaths() {
            return this.mountPaths;
        }

        public AppConfigPvcMountDescs setPvcName(String pvcName) {
            this.pvcName = pvcName;
            return this;
        }
        public String getPvcName() {
            return this.pvcName;
        }

    }

    public static class AppConfigSlsConfigs extends TeaModel {
        @NameInMap("LogDir")
        public String logDir;

        @NameInMap("Logstore")
        public String logstore;

        @NameInMap("Project")
        public String project;

        @NameInMap("Type")
        public String type;

        public static AppConfigSlsConfigs build(java.util.Map<String, ?> map) throws Exception {
            AppConfigSlsConfigs self = new AppConfigSlsConfigs();
            return TeaModel.build(map, self);
        }

        public AppConfigSlsConfigs setLogDir(String logDir) {
            this.logDir = logDir;
            return this;
        }
        public String getLogDir() {
            return this.logDir;
        }

        public AppConfigSlsConfigs setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public AppConfigSlsConfigs setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public AppConfigSlsConfigs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class AppConfigWebContainerConfig extends TeaModel {
        @NameInMap("ConnectorType")
        public String connectorType;

        @NameInMap("ContextInputType")
        public String contextInputType;

        @NameInMap("ContextPath")
        public String contextPath;

        @NameInMap("HttpPort")
        public Long httpPort;

        @NameInMap("MaxThreads")
        public Long maxThreads;

        @NameInMap("ServerXml")
        public String serverXml;

        @NameInMap("UriEncoding")
        public String uriEncoding;

        @NameInMap("UseAdvancedServerXml")
        public Boolean useAdvancedServerXml;

        @NameInMap("UseBodyEncoding")
        public Boolean useBodyEncoding;

        @NameInMap("UseDefaultConfig")
        public Boolean useDefaultConfig;

        public static AppConfigWebContainerConfig build(java.util.Map<String, ?> map) throws Exception {
            AppConfigWebContainerConfig self = new AppConfigWebContainerConfig();
            return TeaModel.build(map, self);
        }

        public AppConfigWebContainerConfig setConnectorType(String connectorType) {
            this.connectorType = connectorType;
            return this;
        }
        public String getConnectorType() {
            return this.connectorType;
        }

        public AppConfigWebContainerConfig setContextInputType(String contextInputType) {
            this.contextInputType = contextInputType;
            return this;
        }
        public String getContextInputType() {
            return this.contextInputType;
        }

        public AppConfigWebContainerConfig setContextPath(String contextPath) {
            this.contextPath = contextPath;
            return this;
        }
        public String getContextPath() {
            return this.contextPath;
        }

        public AppConfigWebContainerConfig setHttpPort(Long httpPort) {
            this.httpPort = httpPort;
            return this;
        }
        public Long getHttpPort() {
            return this.httpPort;
        }

        public AppConfigWebContainerConfig setMaxThreads(Long maxThreads) {
            this.maxThreads = maxThreads;
            return this;
        }
        public Long getMaxThreads() {
            return this.maxThreads;
        }

        public AppConfigWebContainerConfig setServerXml(String serverXml) {
            this.serverXml = serverXml;
            return this;
        }
        public String getServerXml() {
            return this.serverXml;
        }

        public AppConfigWebContainerConfig setUriEncoding(String uriEncoding) {
            this.uriEncoding = uriEncoding;
            return this;
        }
        public String getUriEncoding() {
            return this.uriEncoding;
        }

        public AppConfigWebContainerConfig setUseAdvancedServerXml(Boolean useAdvancedServerXml) {
            this.useAdvancedServerXml = useAdvancedServerXml;
            return this;
        }
        public Boolean getUseAdvancedServerXml() {
            return this.useAdvancedServerXml;
        }

        public AppConfigWebContainerConfig setUseBodyEncoding(Boolean useBodyEncoding) {
            this.useBodyEncoding = useBodyEncoding;
            return this;
        }
        public Boolean getUseBodyEncoding() {
            return this.useBodyEncoding;
        }

        public AppConfigWebContainerConfig setUseDefaultConfig(Boolean useDefaultConfig) {
            this.useDefaultConfig = useDefaultConfig;
            return this;
        }
        public Boolean getUseDefaultConfig() {
            return this.useDefaultConfig;
        }

    }

}
