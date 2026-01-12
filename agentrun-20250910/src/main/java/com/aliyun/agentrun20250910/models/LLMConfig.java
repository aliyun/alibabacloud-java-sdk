// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class LLMConfig extends TeaModel {
    @NameInMap("config")
    public LLMConfigConfig config;

    @NameInMap("modelServiceName")
    public String modelServiceName;

    public static LLMConfig build(java.util.Map<String, ?> map) throws Exception {
        LLMConfig self = new LLMConfig();
        return TeaModel.build(map, self);
    }

    public LLMConfig setConfig(LLMConfigConfig config) {
        this.config = config;
        return this;
    }
    public LLMConfigConfig getConfig() {
        return this.config;
    }

    public LLMConfig setModelServiceName(String modelServiceName) {
        this.modelServiceName = modelServiceName;
        return this;
    }
    public String getModelServiceName() {
        return this.modelServiceName;
    }

    public static class LLMConfigConfig extends TeaModel {
        @NameInMap("model")
        public String model;

        public static LLMConfigConfig build(java.util.Map<String, ?> map) throws Exception {
            LLMConfigConfig self = new LLMConfigConfig();
            return TeaModel.build(map, self);
        }

        public LLMConfigConfig setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

    }

}
