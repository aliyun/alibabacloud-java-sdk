// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AiNetworkSearchConfig extends TeaModel {
    /**
     * <p>Whether the network search feature is enabled by default.</p>
     */
    @NameInMap("defaultEnable")
    public Boolean defaultEnable;

    /**
     * <p>The default language for the search query.</p>
     */
    @NameInMap("defaultLang")
    public String defaultLang;

    /**
     * <p>Whether to include references in the search results.</p>
     */
    @NameInMap("needReference")
    public Boolean needReference;

    /**
     * <p>The status of the AI plugin.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("pluginStatus")
    public AiPluginStatus pluginStatus;

    /**
     * <p>The format of the references.</p>
     */
    @NameInMap("referenceFormat")
    public String referenceFormat;

    /**
     * <p>The location of the references in the response.</p>
     */
    @NameInMap("referenceLocation")
    public String referenceLocation;

    /**
     * <p>The search engine configuration.</p>
     */
    @NameInMap("searchEngineConfig")
    public AiNetworkConfigSearchEngine searchEngineConfig;

    /**
     * <p>A list of search engine configurations for the network search.</p>
     */
    @NameInMap("searchFrom")
    public java.util.List<AiNetworkConfigSearchEngine> searchFrom;

    /**
     * <p>Configuration for search query rewriting.</p>
     */
    @NameInMap("searchRewrite")
    public AiNetworkSearchConfigSearchRewrite searchRewrite;

    public static AiNetworkSearchConfig build(java.util.Map<String, ?> map) throws Exception {
        AiNetworkSearchConfig self = new AiNetworkSearchConfig();
        return TeaModel.build(map, self);
    }

    public AiNetworkSearchConfig setDefaultEnable(Boolean defaultEnable) {
        this.defaultEnable = defaultEnable;
        return this;
    }
    public Boolean getDefaultEnable() {
        return this.defaultEnable;
    }

    public AiNetworkSearchConfig setDefaultLang(String defaultLang) {
        this.defaultLang = defaultLang;
        return this;
    }
    public String getDefaultLang() {
        return this.defaultLang;
    }

    public AiNetworkSearchConfig setNeedReference(Boolean needReference) {
        this.needReference = needReference;
        return this;
    }
    public Boolean getNeedReference() {
        return this.needReference;
    }

    public AiNetworkSearchConfig setPluginStatus(AiPluginStatus pluginStatus) {
        this.pluginStatus = pluginStatus;
        return this;
    }
    public AiPluginStatus getPluginStatus() {
        return this.pluginStatus;
    }

    public AiNetworkSearchConfig setReferenceFormat(String referenceFormat) {
        this.referenceFormat = referenceFormat;
        return this;
    }
    public String getReferenceFormat() {
        return this.referenceFormat;
    }

    public AiNetworkSearchConfig setReferenceLocation(String referenceLocation) {
        this.referenceLocation = referenceLocation;
        return this;
    }
    public String getReferenceLocation() {
        return this.referenceLocation;
    }

    public AiNetworkSearchConfig setSearchEngineConfig(AiNetworkConfigSearchEngine searchEngineConfig) {
        this.searchEngineConfig = searchEngineConfig;
        return this;
    }
    public AiNetworkConfigSearchEngine getSearchEngineConfig() {
        return this.searchEngineConfig;
    }

    public AiNetworkSearchConfig setSearchFrom(java.util.List<AiNetworkConfigSearchEngine> searchFrom) {
        this.searchFrom = searchFrom;
        return this;
    }
    public java.util.List<AiNetworkConfigSearchEngine> getSearchFrom() {
        return this.searchFrom;
    }

    public AiNetworkSearchConfig setSearchRewrite(AiNetworkSearchConfigSearchRewrite searchRewrite) {
        this.searchRewrite = searchRewrite;
        return this;
    }
    public AiNetworkSearchConfigSearchRewrite getSearchRewrite() {
        return this.searchRewrite;
    }

    public static class AiNetworkSearchConfigSearchRewrite extends TeaModel {
        /**
         * <p>Whether to enable the search query rewrite feature.</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The maximum number of rewritten queries to generate.</p>
         */
        @NameInMap("maxCount")
        public Integer maxCount;

        /**
         * <p>The name of the model to use for query rewriting.</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <p>The ID of the query rewriting service.</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>Timeout for the query rewriting operation, in milliseconds.</p>
         */
        @NameInMap("timeoutMillisecond")
        public Integer timeoutMillisecond;

        public static AiNetworkSearchConfigSearchRewrite build(java.util.Map<String, ?> map) throws Exception {
            AiNetworkSearchConfigSearchRewrite self = new AiNetworkSearchConfigSearchRewrite();
            return TeaModel.build(map, self);
        }

        public AiNetworkSearchConfigSearchRewrite setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public AiNetworkSearchConfigSearchRewrite setMaxCount(Integer maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public Integer getMaxCount() {
            return this.maxCount;
        }

        public AiNetworkSearchConfigSearchRewrite setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public AiNetworkSearchConfigSearchRewrite setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public AiNetworkSearchConfigSearchRewrite setTimeoutMillisecond(Integer timeoutMillisecond) {
            this.timeoutMillisecond = timeoutMillisecond;
            return this;
        }
        public Integer getTimeoutMillisecond() {
            return this.timeoutMillisecond;
        }

    }

}
