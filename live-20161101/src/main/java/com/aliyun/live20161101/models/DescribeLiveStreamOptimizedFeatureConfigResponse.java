// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamOptimizedFeatureConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LiveStreamOptimizedFeatureConfigList")
    @Validation(required = true)
    public DescribeLiveStreamOptimizedFeatureConfigResponseLiveStreamOptimizedFeatureConfigList liveStreamOptimizedFeatureConfigList;

    public static DescribeLiveStreamOptimizedFeatureConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamOptimizedFeatureConfigResponse self = new DescribeLiveStreamOptimizedFeatureConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamOptimizedFeatureConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamOptimizedFeatureConfigResponse setLiveStreamOptimizedFeatureConfigList(DescribeLiveStreamOptimizedFeatureConfigResponseLiveStreamOptimizedFeatureConfigList liveStreamOptimizedFeatureConfigList) {
        this.liveStreamOptimizedFeatureConfigList = liveStreamOptimizedFeatureConfigList;
        return this;
    }
    public DescribeLiveStreamOptimizedFeatureConfigResponseLiveStreamOptimizedFeatureConfigList getLiveStreamOptimizedFeatureConfigList() {
        return this.liveStreamOptimizedFeatureConfigList;
    }

    public static class DescribeLiveStreamOptimizedFeatureConfigResponseLiveStreamOptimizedFeatureConfigListLiveStreamOptimizedFeatureConfig extends TeaModel {
        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("ConfigName")
        @Validation(required = true)
        public String configName;

        @NameInMap("ConfigStatus")
        @Validation(required = true)
        public String configStatus;

        @NameInMap("ConfigValue")
        @Validation(required = true)
        public String configValue;

        public static DescribeLiveStreamOptimizedFeatureConfigResponseLiveStreamOptimizedFeatureConfigListLiveStreamOptimizedFeatureConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamOptimizedFeatureConfigResponseLiveStreamOptimizedFeatureConfigListLiveStreamOptimizedFeatureConfig self = new DescribeLiveStreamOptimizedFeatureConfigResponseLiveStreamOptimizedFeatureConfigListLiveStreamOptimizedFeatureConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamOptimizedFeatureConfigResponseLiveStreamOptimizedFeatureConfigListLiveStreamOptimizedFeatureConfig setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveStreamOptimizedFeatureConfigResponseLiveStreamOptimizedFeatureConfigListLiveStreamOptimizedFeatureConfig setConfigName(String configName) {
            this.configName = configName;
            return this;
        }
        public String getConfigName() {
            return this.configName;
        }

        public DescribeLiveStreamOptimizedFeatureConfigResponseLiveStreamOptimizedFeatureConfigListLiveStreamOptimizedFeatureConfig setConfigStatus(String configStatus) {
            this.configStatus = configStatus;
            return this;
        }
        public String getConfigStatus() {
            return this.configStatus;
        }

        public DescribeLiveStreamOptimizedFeatureConfigResponseLiveStreamOptimizedFeatureConfigListLiveStreamOptimizedFeatureConfig setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

    }

    public static class DescribeLiveStreamOptimizedFeatureConfigResponseLiveStreamOptimizedFeatureConfigList extends TeaModel {
        @NameInMap("LiveStreamOptimizedFeatureConfig")
        @Validation(required = true)
        public java.util.List<DescribeLiveStreamOptimizedFeatureConfigResponseLiveStreamOptimizedFeatureConfigListLiveStreamOptimizedFeatureConfig> liveStreamOptimizedFeatureConfig;

        public static DescribeLiveStreamOptimizedFeatureConfigResponseLiveStreamOptimizedFeatureConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamOptimizedFeatureConfigResponseLiveStreamOptimizedFeatureConfigList self = new DescribeLiveStreamOptimizedFeatureConfigResponseLiveStreamOptimizedFeatureConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamOptimizedFeatureConfigResponseLiveStreamOptimizedFeatureConfigList setLiveStreamOptimizedFeatureConfig(java.util.List<DescribeLiveStreamOptimizedFeatureConfigResponseLiveStreamOptimizedFeatureConfigListLiveStreamOptimizedFeatureConfig> liveStreamOptimizedFeatureConfig) {
            this.liveStreamOptimizedFeatureConfig = liveStreamOptimizedFeatureConfig;
            return this;
        }
        public java.util.List<DescribeLiveStreamOptimizedFeatureConfigResponseLiveStreamOptimizedFeatureConfigListLiveStreamOptimizedFeatureConfig> getLiveStreamOptimizedFeatureConfig() {
            return this.liveStreamOptimizedFeatureConfig;
        }

    }

}
