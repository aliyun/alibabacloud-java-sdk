// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class VodPackagingConfig extends TeaModel {
    @NameInMap("DrmProvider")
    public VodPackagingConfigDrmProvider drmProvider;

    @NameInMap("ManifestName")
    public String manifestName;

    @NameInMap("SegmentDuration")
    public Long segmentDuration;

    @NameInMap("StreamSelection")
    public VodPackagingConfigStreamSelection streamSelection;

    public static VodPackagingConfig build(java.util.Map<String, ?> map) throws Exception {
        VodPackagingConfig self = new VodPackagingConfig();
        return TeaModel.build(map, self);
    }

    public VodPackagingConfig setDrmProvider(VodPackagingConfigDrmProvider drmProvider) {
        this.drmProvider = drmProvider;
        return this;
    }
    public VodPackagingConfigDrmProvider getDrmProvider() {
        return this.drmProvider;
    }

    public VodPackagingConfig setManifestName(String manifestName) {
        this.manifestName = manifestName;
        return this;
    }
    public String getManifestName() {
        return this.manifestName;
    }

    public VodPackagingConfig setSegmentDuration(Long segmentDuration) {
        this.segmentDuration = segmentDuration;
        return this;
    }
    public Long getSegmentDuration() {
        return this.segmentDuration;
    }

    public VodPackagingConfig setStreamSelection(VodPackagingConfigStreamSelection streamSelection) {
        this.streamSelection = streamSelection;
        return this;
    }
    public VodPackagingConfigStreamSelection getStreamSelection() {
        return this.streamSelection;
    }

    public static class VodPackagingConfigDrmProvider extends TeaModel {
        @NameInMap("EncryptionMethod")
        public String encryptionMethod;

        @NameInMap("IV")
        public String IV;

        @NameInMap("SystemIds")
        public java.util.List<String> systemIds;

        @NameInMap("Url")
        public String url;

        public static VodPackagingConfigDrmProvider build(java.util.Map<String, ?> map) throws Exception {
            VodPackagingConfigDrmProvider self = new VodPackagingConfigDrmProvider();
            return TeaModel.build(map, self);
        }

        public VodPackagingConfigDrmProvider setEncryptionMethod(String encryptionMethod) {
            this.encryptionMethod = encryptionMethod;
            return this;
        }
        public String getEncryptionMethod() {
            return this.encryptionMethod;
        }

        public VodPackagingConfigDrmProvider setIV(String IV) {
            this.IV = IV;
            return this;
        }
        public String getIV() {
            return this.IV;
        }

        public VodPackagingConfigDrmProvider setSystemIds(java.util.List<String> systemIds) {
            this.systemIds = systemIds;
            return this;
        }
        public java.util.List<String> getSystemIds() {
            return this.systemIds;
        }

        public VodPackagingConfigDrmProvider setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class VodPackagingConfigStreamSelection extends TeaModel {
        @NameInMap("MaxVideoBitsPerSecond")
        public Long maxVideoBitsPerSecond;

        @NameInMap("MinVideoBitsPerSecond")
        public Long minVideoBitsPerSecond;

        @NameInMap("StreamOrder")
        public String streamOrder;

        public static VodPackagingConfigStreamSelection build(java.util.Map<String, ?> map) throws Exception {
            VodPackagingConfigStreamSelection self = new VodPackagingConfigStreamSelection();
            return TeaModel.build(map, self);
        }

        public VodPackagingConfigStreamSelection setMaxVideoBitsPerSecond(Long maxVideoBitsPerSecond) {
            this.maxVideoBitsPerSecond = maxVideoBitsPerSecond;
            return this;
        }
        public Long getMaxVideoBitsPerSecond() {
            return this.maxVideoBitsPerSecond;
        }

        public VodPackagingConfigStreamSelection setMinVideoBitsPerSecond(Long minVideoBitsPerSecond) {
            this.minVideoBitsPerSecond = minVideoBitsPerSecond;
            return this;
        }
        public Long getMinVideoBitsPerSecond() {
            return this.minVideoBitsPerSecond;
        }

        public VodPackagingConfigStreamSelection setStreamOrder(String streamOrder) {
            this.streamOrder = streamOrder;
            return this;
        }
        public String getStreamOrder() {
            return this.streamOrder;
        }

    }

}
