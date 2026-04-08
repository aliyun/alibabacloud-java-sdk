// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AiNetworkSearchConfig extends TeaModel {
    @NameInMap("defaultEnable")
    public Boolean defaultEnable;

    @NameInMap("defaultLang")
    public String defaultLang;

    @NameInMap("needReference")
    public Boolean needReference;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("pluginStatus")
    public AiPluginStatus pluginStatus;

    @NameInMap("referenceFormat")
    public String referenceFormat;

    @NameInMap("referenceLocation")
    public String referenceLocation;

    @NameInMap("searchEngineConfig")
    public AiNetworkConfigSearchEngine searchEngineConfig;

    @NameInMap("searchFrom")
    public java.util.List<AiNetworkConfigSearchEngine> searchFrom;

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
        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("maxCount")
        public Integer maxCount;

        @NameInMap("modelName")
        public String modelName;

        @NameInMap("serviceId")
        public String serviceId;

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
