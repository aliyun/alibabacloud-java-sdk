// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class LLMAPIConfiguration extends TeaModel {
    @NameInMap("aiProtocols")
    public java.util.List<String> aiProtocols;

    @NameInMap("attachPolicyConfigs")
    public java.util.List<AttachPolicyConfig> attachPolicyConfigs;

    @NameInMap("basePath")
    public String basePath;

    @NameInMap("deployConfigs")
    public java.util.List<LLMDeployConfig> deployConfigs;

    @NameInMap("modelCategory")
    public String modelCategory;

    @NameInMap("removeBasePathOnForward")
    public Boolean removeBasePathOnForward;

    @NameInMap("type")
    public String type;

    public static LLMAPIConfiguration build(java.util.Map<String, ?> map) throws Exception {
        LLMAPIConfiguration self = new LLMAPIConfiguration();
        return TeaModel.build(map, self);
    }

    public LLMAPIConfiguration setAiProtocols(java.util.List<String> aiProtocols) {
        this.aiProtocols = aiProtocols;
        return this;
    }
    public java.util.List<String> getAiProtocols() {
        return this.aiProtocols;
    }

    public LLMAPIConfiguration setAttachPolicyConfigs(java.util.List<AttachPolicyConfig> attachPolicyConfigs) {
        this.attachPolicyConfigs = attachPolicyConfigs;
        return this;
    }
    public java.util.List<AttachPolicyConfig> getAttachPolicyConfigs() {
        return this.attachPolicyConfigs;
    }

    public LLMAPIConfiguration setBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }
    public String getBasePath() {
        return this.basePath;
    }

    public LLMAPIConfiguration setDeployConfigs(java.util.List<LLMDeployConfig> deployConfigs) {
        this.deployConfigs = deployConfigs;
        return this;
    }
    public java.util.List<LLMDeployConfig> getDeployConfigs() {
        return this.deployConfigs;
    }

    public LLMAPIConfiguration setModelCategory(String modelCategory) {
        this.modelCategory = modelCategory;
        return this;
    }
    public String getModelCategory() {
        return this.modelCategory;
    }

    public LLMAPIConfiguration setRemoveBasePathOnForward(Boolean removeBasePathOnForward) {
        this.removeBasePathOnForward = removeBasePathOnForward;
        return this;
    }
    public Boolean getRemoveBasePathOnForward() {
        return this.removeBasePathOnForward;
    }

    public LLMAPIConfiguration setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
