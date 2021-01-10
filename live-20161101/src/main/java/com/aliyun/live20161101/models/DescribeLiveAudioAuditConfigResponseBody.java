// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveAudioAuditConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LiveAudioAuditConfigList")
    public DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigList liveAudioAuditConfigList;

    public static DescribeLiveAudioAuditConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveAudioAuditConfigResponseBody self = new DescribeLiveAudioAuditConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveAudioAuditConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveAudioAuditConfigResponseBody setLiveAudioAuditConfigList(DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigList liveAudioAuditConfigList) {
        this.liveAudioAuditConfigList = liveAudioAuditConfigList;
        return this;
    }
    public DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigList getLiveAudioAuditConfigList() {
        return this.liveAudioAuditConfigList;
    }

    public static class DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigListLiveAudioAuditConfigScenes extends TeaModel {
        @NameInMap("scene")
        public java.util.List<String> scene;

        public static DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigListLiveAudioAuditConfigScenes build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigListLiveAudioAuditConfigScenes self = new DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigListLiveAudioAuditConfigScenes();
            return TeaModel.build(map, self);
        }

        public DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigListLiveAudioAuditConfigScenes setScene(java.util.List<String> scene) {
            this.scene = scene;
            return this;
        }
        public java.util.List<String> getScene() {
            return this.scene;
        }

    }

    public static class DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigListLiveAudioAuditConfig extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("StreamName")
        public String streamName;

        @NameInMap("Scenes")
        public DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigListLiveAudioAuditConfigScenes scenes;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("BizType")
        public String bizType;

        public static DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigListLiveAudioAuditConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigListLiveAudioAuditConfig self = new DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigListLiveAudioAuditConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigListLiveAudioAuditConfig setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigListLiveAudioAuditConfig setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigListLiveAudioAuditConfig setScenes(DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigListLiveAudioAuditConfigScenes scenes) {
            this.scenes = scenes;
            return this;
        }
        public DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigListLiveAudioAuditConfigScenes getScenes() {
            return this.scenes;
        }

        public DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigListLiveAudioAuditConfig setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigListLiveAudioAuditConfig setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

    }

    public static class DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigList extends TeaModel {
        @NameInMap("LiveAudioAuditConfig")
        public java.util.List<DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigListLiveAudioAuditConfig> liveAudioAuditConfig;

        public static DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigList self = new DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigList setLiveAudioAuditConfig(java.util.List<DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigListLiveAudioAuditConfig> liveAudioAuditConfig) {
            this.liveAudioAuditConfig = liveAudioAuditConfig;
            return this;
        }
        public java.util.List<DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigListLiveAudioAuditConfig> getLiveAudioAuditConfig() {
            return this.liveAudioAuditConfig;
        }

    }

}
