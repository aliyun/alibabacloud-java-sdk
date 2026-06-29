// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AiNetworkSearchConfig extends TeaModel {
    /**
     * <p>Specifies whether the plug-in feature is enabled by default.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("defaultEnable")
    public Boolean defaultEnable;

    /**
     * <p>The default search language code.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("defaultLang")
    public String defaultLang;

    /**
     * <p>Specifies whether to add reference sources in the answer.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("needReference")
    public Boolean needReference;

    /**
     * <p>The plug-in running status.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("pluginStatus")
    public AiPluginStatus pluginStatus;

    /**
     * <p>The format template for reference content. The template must contain at least one %s placeholder.</p>
     * 
     * <strong>example:</strong>
     * <p>参考来源:\n%s</p>
     */
    @NameInMap("referenceFormat")
    public String referenceFormat;

    /**
     * <p>The reference location.</p>
     * 
     * <strong>example:</strong>
     * <p>head</p>
     */
    @NameInMap("referenceLocation")
    public String referenceLocation;

    /**
     * <p>The search engine configuration.</p>
     */
    @NameInMap("searchEngineConfig")
    public AiNetworkConfigSearchEngine searchEngineConfig;

    /**
     * <p>The list of search engines (multi-engine configuration).</p>
     */
    @NameInMap("searchFrom")
    public java.util.List<AiNetworkConfigSearchEngine> searchFrom;

    /**
     * <p>The search term rewriting configuration.</p>
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
         * <p>Specifies whether to enable search query rewriting.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The maximum number of search queries after rewriting.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("maxCount")
        public Integer maxCount;

        /**
         * <p>The name of the model used for rewriting.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <p>The ID of the rewriting service.</p>
         * 
         * <strong>example:</strong>
         * <p>svc-xxx</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>The timeout period for the rewriting request, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
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
