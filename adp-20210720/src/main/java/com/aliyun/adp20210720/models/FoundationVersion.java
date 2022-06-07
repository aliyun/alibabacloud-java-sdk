// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class FoundationVersion extends TeaModel {
    // cluster config schema，用作针对 cluster config 进行校验以及前端可根据改数据进行展示
    @NameInMap("clusterConfigSchema")
    public String clusterConfigSchema;

    // 支持的 cluster 引擎列表
    @NameInMap("clusterEngines")
    public java.util.List<FoundationVersionClusterEngines> clusterEngines;

    // 默认 cluster config，需要通过base64 进行编码
    @NameInMap("defaultClusterConfig")
    public String defaultClusterConfig;

    // description
    @NameInMap("description")
    public String description;

    // documents
    @NameInMap("documents")
    public String documents;

    // 驱动层描述
    @NameInMap("driver")
    public FoundationVersionDriver driver;

    // 底座功能列表
    @NameInMap("features")
    public java.util.List<String> features;

    // 标签
    @NameInMap("labels")
    public String labels;

    // name，目前仅能是 “ADP 底座“
    @NameInMap("name")
    public String name;

    // 打包工具
    @NameInMap("packageTools")
    public java.util.List<FoundationVersionPackageTools> packageTools;

    // platforms
    @NameInMap("platforms")
    public java.util.List<Platform> platforms;

    // status，ENUM:["Testing","Published","Deprecated"] Published 后，则全平台所有用户可见，请谨慎操作
    @NameInMap("status")
    public String status;

    // the type of foundation version,ENUM:["trident","ack"]
    @NameInMap("type")
    public String type;

    // uid
    @NameInMap("uid")
    public String uid;

    // version
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

    public FoundationVersion setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
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

    public FoundationVersion setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class FoundationVersionClusterEnginesPackageToolsInstallToolPackages extends TeaModel {
        // 安装工具架构类型
        @NameInMap("architecture")
        public String architecture;

        // 安装工具支持的操作系统
        @NameInMap("os")
        public String os;

        // 地址
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
        // 打包工具image 地址
        @NameInMap("image")
        public String image;

        // 安装工具
        @NameInMap("installToolPackages")
        public java.util.List<FoundationVersionClusterEnginesPackageToolsInstallToolPackages> installToolPackages;

        // 打包工具名称
        @NameInMap("name")
        public String name;

        // 包类型
        @NameInMap("packageFormat")
        public String packageFormat;

        // 打包工具类型
        @NameInMap("type")
        public String type;

        // 打包工具版本
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
        // 包支持的架构
        @NameInMap("architecture")
        public String architecture;

        // 包支持的操作系统
        @NameInMap("os")
        public String os;

        // 包地址
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

        public FoundationVersionClusterEnginesPackages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class FoundationVersionClusterEngines extends TeaModel {
        // cluster engine 支持的打包工具定义
        @NameInMap("packageTools")
        public java.util.List<FoundationVersionClusterEnginesPackageTools> packageTools;

        // cluster engine 的包
        @NameInMap("packages")
        public java.util.List<FoundationVersionClusterEnginesPackages> packages;

        // cluster engine 列表
        @NameInMap("type")
        public String type;

        // cluster engine 版本
        @NameInMap("version")
        public String version;

        public static FoundationVersionClusterEngines build(java.util.Map<String, ?> map) throws Exception {
            FoundationVersionClusterEngines self = new FoundationVersionClusterEngines();
            return TeaModel.build(map, self);
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
        // 组件名称
        @NameInMap("name")
        public String name;

        // 组件版本
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
        // 驱动层组件
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
        // 工具名
        @NameInMap("name")
        public String name;

        // 工具版本
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

}
