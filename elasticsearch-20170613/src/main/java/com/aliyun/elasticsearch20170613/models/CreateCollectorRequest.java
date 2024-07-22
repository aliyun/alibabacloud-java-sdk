// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateCollectorRequest extends TeaModel {
    @NameInMap("collectorPaths")
    public java.util.List<String> collectorPaths;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("configs")
    public java.util.List<CreateCollectorRequestConfigs> configs;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("extendConfigs")
    public java.util.List<java.util.Map<String, ?>> extendConfigs;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ct-test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fileBeat</p>
     */
    @NameInMap("resType")
    public String resType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6.8.5_with_community</p>
     */
    @NameInMap("resVersion")
    public String resVersion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp12nu14urf0upaf*****</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    /**
     * <p>The ID of the created crawer.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
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
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;filebeat.inputs:xxx&quot;</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>filebeat.yml</p>
         */
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
