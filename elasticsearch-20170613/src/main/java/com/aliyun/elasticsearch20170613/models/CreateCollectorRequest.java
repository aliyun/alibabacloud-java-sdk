// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateCollectorRequest extends TeaModel {
    @NameInMap("collectorPaths")
    public java.util.List<String> collectorPaths;

    @NameInMap("configs")
    public java.util.List<CreateCollectorRequestConfigs> configs;

    @NameInMap("dryRun")
    public Boolean dryRun;

    @NameInMap("extendConfigs")
    public java.util.List<java.util.Map<String, ?>> extendConfigs;

    @NameInMap("name")
    public String name;

    @NameInMap("resType")
    public String resType;

    @NameInMap("resVersion")
    public String resVersion;

    @NameInMap("vpcId")
    public String vpcId;

    /**
     * <p>The ID of the created crawer.</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateCollectorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCollectorRequest self = new CreateCollectorRequest();
        return TeaModel.build(map, self);
    }

    public CreateCollectorRequest setCollectorPaths(java.util.List<String> collectorPaths) {
        this.collectorPaths = collectorPaths;
        return this;
    }
    public java.util.List<String> getCollectorPaths() {
        return this.collectorPaths;
    }

    public CreateCollectorRequest setConfigs(java.util.List<CreateCollectorRequestConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<CreateCollectorRequestConfigs> getConfigs() {
        return this.configs;
    }

    public CreateCollectorRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateCollectorRequest setExtendConfigs(java.util.List<java.util.Map<String, ?>> extendConfigs) {
        this.extendConfigs = extendConfigs;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getExtendConfigs() {
        return this.extendConfigs;
    }

    public CreateCollectorRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCollectorRequest setResType(String resType) {
        this.resType = resType;
        return this;
    }
    public String getResType() {
        return this.resType;
    }

    public CreateCollectorRequest setResVersion(String resVersion) {
        this.resVersion = resVersion;
        return this;
    }
    public String getResVersion() {
        return this.resVersion;
    }

    public CreateCollectorRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateCollectorRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreateCollectorRequestConfigs extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("fileName")
        public String fileName;

        public static CreateCollectorRequestConfigs build(java.util.Map<String, ?> map) throws Exception {
            CreateCollectorRequestConfigs self = new CreateCollectorRequestConfigs();
            return TeaModel.build(map, self);
        }

        public CreateCollectorRequestConfigs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateCollectorRequestConfigs setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

}
