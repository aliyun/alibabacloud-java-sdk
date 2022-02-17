// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class FoundationVersion extends TeaModel {
    // description
    @NameInMap("description")
    public String description;

    // documents
    @NameInMap("documents")
    public String documents;

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
