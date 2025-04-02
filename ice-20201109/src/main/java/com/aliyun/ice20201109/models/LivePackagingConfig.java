// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class LivePackagingConfig extends TeaModel {
    @NameInMap("DrmConfig")
    public LivePackagingConfigDrmConfig drmConfig;

    @NameInMap("LiveManifestConfigs")
    public java.util.List<LiveManifestConfig> liveManifestConfigs;

    @NameInMap("SegmentDuration")
    public Integer segmentDuration;

    @NameInMap("UseAudioRenditionGroups")
    public Boolean useAudioRenditionGroups;

    public static LivePackagingConfig build(java.util.Map<String, ?> map) throws Exception {
        LivePackagingConfig self = new LivePackagingConfig();
        return TeaModel.build(map, self);
    }

    public LivePackagingConfig setDrmConfig(LivePackagingConfigDrmConfig drmConfig) {
        this.drmConfig = drmConfig;
        return this;
    }
    public LivePackagingConfigDrmConfig getDrmConfig() {
        return this.drmConfig;
    }

    public LivePackagingConfig setLiveManifestConfigs(java.util.List<LiveManifestConfig> liveManifestConfigs) {
        this.liveManifestConfigs = liveManifestConfigs;
        return this;
    }
    public java.util.List<LiveManifestConfig> getLiveManifestConfigs() {
        return this.liveManifestConfigs;
    }

    public LivePackagingConfig setSegmentDuration(Integer segmentDuration) {
        this.segmentDuration = segmentDuration;
        return this;
    }
    public Integer getSegmentDuration() {
        return this.segmentDuration;
    }

    public LivePackagingConfig setUseAudioRenditionGroups(Boolean useAudioRenditionGroups) {
        this.useAudioRenditionGroups = useAudioRenditionGroups;
        return this;
    }
    public Boolean getUseAudioRenditionGroups() {
        return this.useAudioRenditionGroups;
    }

    public static class LivePackagingConfigDrmConfig extends TeaModel {
        @NameInMap("EncryptionMethod")
        public String encryptionMethod;

        @NameInMap("IV")
        public String IV;

        @NameInMap("RotatePeriod")
        public Integer rotatePeriod;

        @NameInMap("SystemIds")
        public java.util.List<String> systemIds;

        @NameInMap("Url")
        public String url;

        public static LivePackagingConfigDrmConfig build(java.util.Map<String, ?> map) throws Exception {
            LivePackagingConfigDrmConfig self = new LivePackagingConfigDrmConfig();
            return TeaModel.build(map, self);
        }

        public LivePackagingConfigDrmConfig setEncryptionMethod(String encryptionMethod) {
            this.encryptionMethod = encryptionMethod;
            return this;
        }
        public String getEncryptionMethod() {
            return this.encryptionMethod;
        }

        public LivePackagingConfigDrmConfig setIV(String IV) {
            this.IV = IV;
            return this;
        }
        public String getIV() {
            return this.IV;
        }

        public LivePackagingConfigDrmConfig setRotatePeriod(Integer rotatePeriod) {
            this.rotatePeriod = rotatePeriod;
            return this;
        }
        public Integer getRotatePeriod() {
            return this.rotatePeriod;
        }

        public LivePackagingConfigDrmConfig setSystemIds(java.util.List<String> systemIds) {
            this.systemIds = systemIds;
            return this;
        }
        public java.util.List<String> getSystemIds() {
            return this.systemIds;
        }

        public LivePackagingConfigDrmConfig setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
