// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class FoundationVersion extends TeaModel {
    @NameInMap("clusterConfigSchema")
    public String clusterConfigSchema;

    @NameInMap("clusterEngines")
    public java.util.List<FoundationVersionClusterEngines> clusterEngines;

    @NameInMap("defaultClusterConfig")
    public String defaultClusterConfig;

    @NameInMap("description")
    public String description;

    @NameInMap("documents")
    public String documents;

    @NameInMap("driver")
    public FoundationVersionDriver driver;

    @NameInMap("features")
    public java.util.List<String> features;

    @NameInMap("isDefault")
    public Boolean isDefault;

    @NameInMap("labels")
    public String labels;

    @NameInMap("name")
    public String name;

    @NameInMap("packageTools")
    public java.util.List<FoundationVersionPackageTools> packageTools;

    @NameInMap("platforms")
    public java.util.List<Platform> platforms;

    @NameInMap("specName")
    public String specName;

    @NameInMap("status")
    public String status;

    @NameInMap("tools")
    public FoundationVersionTools tools;

    @NameInMap("type")
    public String type;

    @NameInMap("uid")
    public String uid;

    @NameInMap("userWhiteList")
    public java.util.List<String> userWhiteList;

    @NameInMap("version")
    public String version;

    public static FoundationVersion build(java.util.Map<String, ?> map) throws Exception {
        FoundationVersion self = new FoundationVersion();
        return TeaModel.build(map, self);
    }

    public FoundationVersion setClusterConfigSchema(String clusterConfigSchema) {
        this.clusterConfigSchema = clusterConfigSchema;
        return this;
    }
    public String getClusterConfigSchema() {
        return this.clusterConfigSchema;
    }

    public FoundationVersion setClusterEngines(java.util.List<FoundationVersionClusterEngines> clusterEngines) {
        this.clusterEngines = clusterEngines;
        return this;
    }
    public java.util.List<FoundationVersionClusterEngines> getClusterEngines() {
        return this.clusterEngines;
    }

    public FoundationVersion setDefaultClusterConfig(String defaultClusterConfig) {
        this.defaultClusterConfig = defaultClusterConfig;
        return this;
    }
    public String getDefaultClusterConfig() {
        return this.defaultClusterConfig;
    }

    public FoundationVersion setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public FoundationVersion setDocuments(String documents) {
        this.documents = documents;
        return this;
    }
    public String getDocuments() {
        return this.documents;
    }

    public FoundationVersion setDriver(FoundationVersionDriver driver) {
        this.driver = driver;
        return this;
    }
    public FoundationVersionDriver getDriver() {
        return this.driver;
    }

    public FoundationVersion setFeatures(java.util.List<String> features) {
        this.features = features;
        return this;
    }
    public java.util.List<String> getFeatures() {
        return this.features;
    }

    public FoundationVersion setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public FoundationVersion setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public FoundationVersion setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FoundationVersion setPackageTools(java.util.List<FoundationVersionPackageTools> packageTools) {
        this.packageTools = packageTools;
        return this;
    }
    public java.util.List<FoundationVersionPackageTools> getPackageTools() {
        return this.packageTools;
    }

    public FoundationVersion setPlatforms(java.util.List<Platform> platforms) {
        this.platforms = platforms;
        return this;
    }
    public java.util.List<Platform> getPlatforms() {
        return this.platforms;
    }

    public FoundationVersion setSpecName(String specName) {
        this.specName = specName;
        return this;
    }
    public String getSpecName() {
        return this.specName;
    }

    public FoundationVersion setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public FoundationVersion setTools(FoundationVersionTools tools) {
        this.tools = tools;
        return this;
    }
    public FoundationVersionTools getTools() {
        return this.tools;
    }

    public FoundationVersion setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public FoundationVersion setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public FoundationVersion setUserWhiteList(java.util.List<String> userWhiteList) {
        this.userWhiteList = userWhiteList;
        return this;
    }
    public java.util.List<String> getUserWhiteList() {
        return this.userWhiteList;
    }

    public FoundationVersion setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class FoundationVersionClusterEnginesInfrastructureStatements extends TeaModel {
        @NameInMap("default")
        public Boolean _default;

        @NameInMap("distroName")
        public String distroName;

        @NameInMap("distroVersion")
        public String distroVersion;

        @NameInMap("platform")
        public Platform platform;

        public static FoundationVersionClusterEnginesInfrastructureStatements build(java.util.Map<String, ?> map) throws Exception {
            FoundationVersionClusterEnginesInfrastructureStatements self = new FoundationVersionClusterEnginesInfrastructureStatements();
            return TeaModel.build(map, self);
        }

        public FoundationVersionClusterEnginesInfrastructureStatements set_default(Boolean _default) {
            this._default = _default;
            return this;
        }
        public Boolean get_default() {
            return this._default;
        }

        public FoundationVersionClusterEnginesInfrastructureStatements setDistroName(String distroName) {
            this.distroName = distroName;
            return this;
        }
        public String getDistroName() {
            return this.distroName;
        }

        public FoundationVersionClusterEnginesInfrastructureStatements setDistroVersion(String distroVersion) {
            this.distroVersion = distroVersion;
            return this;
        }
        public String getDistroVersion() {
            return this.distroVersion;
        }

        public FoundationVersionClusterEnginesInfrastructureStatements setPlatform(Platform platform) {
            this.platform = platform;
            return this;
        }
        public Platform getPlatform() {
            return this.platform;
        }

    }

    public static class FoundationVersionClusterEnginesNetworkList extends TeaModel {
        @NameInMap("ipFamilies")
        public java.util.List<String> ipFamilies;

        @NameInMap("name")
        public String name;

        public static FoundationVersionClusterEnginesNetworkList build(java.util.Map<String, ?> map) throws Exception {
            FoundationVersionClusterEnginesNetworkList self = new FoundationVersionClusterEnginesNetworkList();
            return TeaModel.build(map, self);
        }

        public FoundationVersionClusterEnginesNetworkList setIpFamilies(java.util.List<String> ipFamilies) {
            this.ipFamilies = ipFamilies;
            return this;
        }
        public java.util.List<String> getIpFamilies() {
            return this.ipFamilies;
        }

        public FoundationVersionClusterEnginesNetworkList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class FoundationVersionClusterEnginesPackageToolsInstallToolPackages extends TeaModel {
        @NameInMap("architecture")
        public String architecture;

        @NameInMap("os")
        public String os;

        @NameInMap("url")
        public String url;

        public static FoundationVersionClusterEnginesPackageToolsInstallToolPackages build(java.util.Map<String, ?> map) throws Exception {
            FoundationVersionClusterEnginesPackageToolsInstallToolPackages self = new FoundationVersionClusterEnginesPackageToolsInstallToolPackages();
            return TeaModel.build(map, self);
        }

        public FoundationVersionClusterEnginesPackageToolsInstallToolPackages setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public FoundationVersionClusterEnginesPackageToolsInstallToolPackages setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public FoundationVersionClusterEnginesPackageToolsInstallToolPackages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class FoundationVersionClusterEnginesPackageTools extends TeaModel {
        @NameInMap("image")
        public String image;

        @NameInMap("installToolPackages")
        public java.util.List<FoundationVersionClusterEnginesPackageToolsInstallToolPackages> installToolPackages;

        @NameInMap("name")
        public String name;

        @NameInMap("packageFormat")
        public String packageFormat;

        @NameInMap("type")
        public String type;

        @NameInMap("version")
        public String version;

        public static FoundationVersionClusterEnginesPackageTools build(java.util.Map<String, ?> map) throws Exception {
            FoundationVersionClusterEnginesPackageTools self = new FoundationVersionClusterEnginesPackageTools();
            return TeaModel.build(map, self);
        }

        public FoundationVersionClusterEnginesPackageTools setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public FoundationVersionClusterEnginesPackageTools setInstallToolPackages(java.util.List<FoundationVersionClusterEnginesPackageToolsInstallToolPackages> installToolPackages) {
            this.installToolPackages = installToolPackages;
            return this;
        }
        public java.util.List<FoundationVersionClusterEnginesPackageToolsInstallToolPackages> getInstallToolPackages() {
            return this.installToolPackages;
        }

        public FoundationVersionClusterEnginesPackageTools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FoundationVersionClusterEnginesPackageTools setPackageFormat(String packageFormat) {
            this.packageFormat = packageFormat;
            return this;
        }
        public String getPackageFormat() {
            return this.packageFormat;
        }

        public FoundationVersionClusterEnginesPackageTools setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public FoundationVersionClusterEnginesPackageTools setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class FoundationVersionClusterEnginesPackages extends TeaModel {
        @NameInMap("architecture")
        public String architecture;

        @NameInMap("os")
        public String os;

        @NameInMap("platforms")
        public java.util.List<Platform> platforms;

        @NameInMap("url")
        public String url;

        public static FoundationVersionClusterEnginesPackages build(java.util.Map<String, ?> map) throws Exception {
            FoundationVersionClusterEnginesPackages self = new FoundationVersionClusterEnginesPackages();
            return TeaModel.build(map, self);
        }

        public FoundationVersionClusterEnginesPackages setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public FoundationVersionClusterEnginesPackages setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public FoundationVersionClusterEnginesPackages setPlatforms(java.util.List<Platform> platforms) {
            this.platforms = platforms;
            return this;
        }
        public java.util.List<Platform> getPlatforms() {
            return this.platforms;
        }

        public FoundationVersionClusterEnginesPackages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class FoundationVersionClusterEngines extends TeaModel {
        @NameInMap("infrastructureStatements")
        public java.util.List<FoundationVersionClusterEnginesInfrastructureStatements> infrastructureStatements;

        @NameInMap("networkList")
        public java.util.List<FoundationVersionClusterEnginesNetworkList> networkList;

        @NameInMap("packageTools")
        public java.util.List<FoundationVersionClusterEnginesPackageTools> packageTools;

        @NameInMap("packages")
        public java.util.List<FoundationVersionClusterEnginesPackages> packages;

        @NameInMap("type")
        public String type;

        @NameInMap("version")
        public String version;

        public static FoundationVersionClusterEngines build(java.util.Map<String, ?> map) throws Exception {
            FoundationVersionClusterEngines self = new FoundationVersionClusterEngines();
            return TeaModel.build(map, self);
        }

        public FoundationVersionClusterEngines setInfrastructureStatements(java.util.List<FoundationVersionClusterEnginesInfrastructureStatements> infrastructureStatements) {
            this.infrastructureStatements = infrastructureStatements;
            return this;
        }
        public java.util.List<FoundationVersionClusterEnginesInfrastructureStatements> getInfrastructureStatements() {
            return this.infrastructureStatements;
        }

        public FoundationVersionClusterEngines setNetworkList(java.util.List<FoundationVersionClusterEnginesNetworkList> networkList) {
            this.networkList = networkList;
            return this;
        }
        public java.util.List<FoundationVersionClusterEnginesNetworkList> getNetworkList() {
            return this.networkList;
        }

        public FoundationVersionClusterEngines setPackageTools(java.util.List<FoundationVersionClusterEnginesPackageTools> packageTools) {
            this.packageTools = packageTools;
            return this;
        }
        public java.util.List<FoundationVersionClusterEnginesPackageTools> getPackageTools() {
            return this.packageTools;
        }

        public FoundationVersionClusterEngines setPackages(java.util.List<FoundationVersionClusterEnginesPackages> packages) {
            this.packages = packages;
            return this;
        }
        public java.util.List<FoundationVersionClusterEnginesPackages> getPackages() {
            return this.packages;
        }

        public FoundationVersionClusterEngines setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public FoundationVersionClusterEngines setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class FoundationVersionDriverComponents extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("version")
        public String version;

        public static FoundationVersionDriverComponents build(java.util.Map<String, ?> map) throws Exception {
            FoundationVersionDriverComponents self = new FoundationVersionDriverComponents();
            return TeaModel.build(map, self);
        }

        public FoundationVersionDriverComponents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FoundationVersionDriverComponents setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class FoundationVersionDriver extends TeaModel {
        @NameInMap("components")
        public java.util.List<FoundationVersionDriverComponents> components;

        public static FoundationVersionDriver build(java.util.Map<String, ?> map) throws Exception {
            FoundationVersionDriver self = new FoundationVersionDriver();
            return TeaModel.build(map, self);
        }

        public FoundationVersionDriver setComponents(java.util.List<FoundationVersionDriverComponents> components) {
            this.components = components;
            return this;
        }
        public java.util.List<FoundationVersionDriverComponents> getComponents() {
            return this.components;
        }

    }

    public static class FoundationVersionPackageTools extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("version")
        public String version;

        public static FoundationVersionPackageTools build(java.util.Map<String, ?> map) throws Exception {
            FoundationVersionPackageTools self = new FoundationVersionPackageTools();
            return TeaModel.build(map, self);
        }

        public FoundationVersionPackageTools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FoundationVersionPackageTools setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class FoundationVersionToolsSiteSurvey extends TeaModel {
        @NameInMap("clusterCheckerURL")
        public String clusterCheckerURL;

        @NameInMap("clusterInfoBrief")
        public String clusterInfoBrief;

        public static FoundationVersionToolsSiteSurvey build(java.util.Map<String, ?> map) throws Exception {
            FoundationVersionToolsSiteSurvey self = new FoundationVersionToolsSiteSurvey();
            return TeaModel.build(map, self);
        }

        public FoundationVersionToolsSiteSurvey setClusterCheckerURL(String clusterCheckerURL) {
            this.clusterCheckerURL = clusterCheckerURL;
            return this;
        }
        public String getClusterCheckerURL() {
            return this.clusterCheckerURL;
        }

        public FoundationVersionToolsSiteSurvey setClusterInfoBrief(String clusterInfoBrief) {
            this.clusterInfoBrief = clusterInfoBrief;
            return this;
        }
        public String getClusterInfoBrief() {
            return this.clusterInfoBrief;
        }

    }

    public static class FoundationVersionTools extends TeaModel {
        @NameInMap("siteSurvey")
        public FoundationVersionToolsSiteSurvey siteSurvey;

        public static FoundationVersionTools build(java.util.Map<String, ?> map) throws Exception {
            FoundationVersionTools self = new FoundationVersionTools();
            return TeaModel.build(map, self);
        }

        public FoundationVersionTools setSiteSurvey(FoundationVersionToolsSiteSurvey siteSurvey) {
            this.siteSurvey = siteSurvey;
            return this;
        }
        public FoundationVersionToolsSiteSurvey getSiteSurvey() {
            return this.siteSurvey;
        }

    }

}
