// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamOptimizedFeatureConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LiveStreamOptimizedFeatureConfigList")
    public DescribeLiveStreamOptimizedFeatureConfigResponseBodyLiveStreamOptimizedFeatureConfigList liveStreamOptimizedFeatureConfigList;

    public static DescribeLiveStreamOptimizedFeatureConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamOptimizedFeatureConfigResponseBody self = new DescribeLiveStreamOptimizedFeatureConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamOptimizedFeatureConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamOptimizedFeatureConfigResponseBody setLiveStreamOptimizedFeatureConfigList(DescribeLiveStreamOptimizedFeatureConfigResponseBodyLiveStreamOptimizedFeatureConfigList liveStreamOptimizedFeatureConfigList) {
        this.liveStreamOptimizedFeatureConfigList = liveStreamOptimizedFeatureConfigList;
        return this;
    }
    public DescribeLiveStreamOptimizedFeatureConfigResponseBodyLiveStreamOptimizedFeatureConfigList getLiveStreamOptimizedFeatureConfigList() {
        return this.liveStreamOptimizedFeatureConfigList;
    }

    public static class DescribeLiveStreamOptimizedFeatureConfigResponseBodyLiveStreamOptimizedFeatureConfigListLiveStreamOptimizedFeatureConfig extends TeaModel {
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("ConfigName")
        public String configName;

        @NameInMap("ConfigStatus")
        public String configStatus;

        @NameInMap("ConfigValue")
        public String configValue;

        public static DescribeLiveStreamOptimizedFeatureConfigResponseBodyLiveStreamOptimizedFeatureConfigListLiveStreamOptimizedFeatureConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamOptimizedFeatureConfigResponseBodyLiveStreamOptimizedFeatureConfigListLiveStreamOptimizedFeatureConfig self = new DescribeLiveStreamOptimizedFeatureConfigResponseBodyLiveStreamOptimizedFeatureConfigListLiveStreamOptimizedFeatureConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamOptimizedFeatureConfigResponseBodyLiveStreamOptimizedFeatureConfigListLiveStreamOptimizedFeatureConfig setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveStreamOptimizedFeatureConfigResponseBodyLiveStreamOptimizedFeatureConfigListLiveStreamOptimizedFeatureConfig setConfigName(String configName) {
            this.configName = configName;
            return this;
        }
        public String getConfigName() {
            return this.configName;
        }

        public DescribeLiveStreamOptimizedFeatureConfigResponseBodyLiveStreamOptimizedFeatureConfigListLiveStreamOptimizedFeatureConfig setConfigStatus(String configStatus) {
            this.configStatus = configStatus;
            return this;
        }
        public String getConfigStatus() {
            return this.configStatus;
        }

        public DescribeLiveStreamOptimizedFeatureConfigResponseBodyLiveStreamOptimizedFeatureConfigListLiveStreamOptimizedFeatureConfig setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

    }

    public static class DescribeLiveStreamOptimizedFeatureConfigResponseBodyLiveStreamOptimizedFeatureConfigList extends TeaModel {
        @NameInMap("LiveStreamOptimizedFeatureConfig")
        public java.util.List<DescribeLiveStreamOptimizedFeatureConfigResponseBodyLiveStreamOptimizedFeatureConfigListLiveStreamOptimizedFeatureConfig> liveStreamOptimizedFeatureConfig;

        public static DescribeLiveStreamOptimizedFeatureConfigResponseBodyLiveStreamOptimizedFeatureConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamOptimizedFeatureConfigResponseBodyLiveStreamOptimizedFeatureConfigList self = new DescribeLiveStreamOptimizedFeatureConfigResponseBodyLiveStreamOptimizedFeatureConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamOptimizedFeatureConfigResponseBodyLiveStreamOptimizedFeatureConfigList setLiveStreamOptimizedFeatureConfig(java.util.List<DescribeLiveStreamOptimizedFeatureConfigResponseBodyLiveStreamOptimizedFeatureConfigListLiveStreamOptimizedFeatureConfig> liveStreamOptimizedFeatureConfig) {
            this.liveStreamOptimizedFeatureConfig = liveStreamOptimizedFeatureConfig;
            return this;
        }
        public java.util.List<DescribeLiveStreamOptimizedFeatureConfigResponseBodyLiveStreamOptimizedFeatureConfigListLiveStreamOptimizedFeatureConfig> getLiveStreamOptimizedFeatureConfig() {
            return this.liveStreamOptimizedFeatureConfig;
        }

    }

}
