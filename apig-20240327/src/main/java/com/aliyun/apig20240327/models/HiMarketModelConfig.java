// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HiMarketModelConfig extends TeaModel {
    @NameInMap("modelAPIConfig")
    public HiMarketModelConfigModelAPIConfig modelAPIConfig;

    public static HiMarketModelConfig build(java.util.Map<String, ?> map) throws Exception {
        HiMarketModelConfig self = new HiMarketModelConfig();
        return TeaModel.build(map, self);
    }

    public HiMarketModelConfig setModelAPIConfig(HiMarketModelConfigModelAPIConfig modelAPIConfig) {
        this.modelAPIConfig = modelAPIConfig;
        return this;
    }
    public HiMarketModelConfigModelAPIConfig getModelAPIConfig() {
        return this.modelAPIConfig;
    }

    public static class HiMarketModelConfigModelAPIConfig extends TeaModel {
        @NameInMap("aiProtocols")
        public java.util.List<String> aiProtocols;

        @NameInMap("modelCategory")
        public String modelCategory;

        @NameInMap("routes")
        public java.util.List<HiMarketHttpRoute> routes;

        public static HiMarketModelConfigModelAPIConfig build(java.util.Map<String, ?> map) throws Exception {
            HiMarketModelConfigModelAPIConfig self = new HiMarketModelConfigModelAPIConfig();
            return TeaModel.build(map, self);
        }

        public HiMarketModelConfigModelAPIConfig setAiProtocols(java.util.List<String> aiProtocols) {
            this.aiProtocols = aiProtocols;
            return this;
        }
        public java.util.List<String> getAiProtocols() {
            return this.aiProtocols;
        }

        public HiMarketModelConfigModelAPIConfig setModelCategory(String modelCategory) {
            this.modelCategory = modelCategory;
            return this;
        }
        public String getModelCategory() {
            return this.modelCategory;
        }

        public HiMarketModelConfigModelAPIConfig setRoutes(java.util.List<HiMarketHttpRoute> routes) {
            this.routes = routes;
            return this;
        }
        public java.util.List<HiMarketHttpRoute> getRoutes() {
            return this.routes;
        }

    }

}
