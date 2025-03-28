// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ModelConfig extends TeaModel {
    @NameInMap("bucket")
    public String bucket;

    @NameInMap("framework")
    public String framework;

    @NameInMap("model")
    public String model;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("multiModelConfig")
    public java.util.List<ModelConfig> multiModelConfig;

    @NameInMap("path")
    public String path;

    @NameInMap("prefix")
    public String prefix;

    @NameInMap("region")
    public String region;

    @NameInMap("reversion")
    public String reversion;

    @NameInMap("token")
    public String token;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>modelscope</p>
     */
    @NameInMap("type")
    public String type;

    public static ModelConfig build(java.util.Map<String, ?> map) throws Exception {
        ModelConfig self = new ModelConfig();
        return TeaModel.build(map, self);
    }

    public ModelConfig setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public ModelConfig setFramework(String framework) {
        this.framework = framework;
        return this;
    }
    public String getFramework() {
        return this.framework;
    }

    public ModelConfig setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ModelConfig setMultiModelConfig(java.util.List<ModelConfig> multiModelConfig) {
        this.multiModelConfig = multiModelConfig;
        return this;
    }
    public java.util.List<ModelConfig> getMultiModelConfig() {
        return this.multiModelConfig;
    }

    public ModelConfig setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public ModelConfig setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public ModelConfig setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ModelConfig setReversion(String reversion) {
        this.reversion = reversion;
        return this;
    }
    public String getReversion() {
        return this.reversion;
    }

    public ModelConfig setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public ModelConfig setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
