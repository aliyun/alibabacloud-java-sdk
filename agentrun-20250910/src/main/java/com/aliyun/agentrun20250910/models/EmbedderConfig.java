// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class EmbedderConfig extends TeaModel {
    @NameInMap("config")
    public EmbedderConfigConfig config;

    @NameInMap("modelServiceName")
    public String modelServiceName;

    public static EmbedderConfig build(java.util.Map<String, ?> map) throws Exception {
        EmbedderConfig self = new EmbedderConfig();
        return TeaModel.build(map, self);
    }

    public EmbedderConfig setConfig(EmbedderConfigConfig config) {
        this.config = config;
        return this;
    }
    public EmbedderConfigConfig getConfig() {
        return this.config;
    }

    public EmbedderConfig setModelServiceName(String modelServiceName) {
        this.modelServiceName = modelServiceName;
        return this;
    }
    public String getModelServiceName() {
        return this.modelServiceName;
    }

    public static class EmbedderConfigConfig extends TeaModel {
        @NameInMap("model")
        public String model;

        public static EmbedderConfigConfig build(java.util.Map<String, ?> map) throws Exception {
            EmbedderConfigConfig self = new EmbedderConfigConfig();
            return TeaModel.build(map, self);
        }

        public EmbedderConfigConfig setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

    }

}
