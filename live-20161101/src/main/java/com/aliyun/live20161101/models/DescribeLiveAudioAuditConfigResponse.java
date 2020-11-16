// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveAudioAuditConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LiveAudioAuditConfigList")
    @Validation(required = true)
    public DescribeLiveAudioAuditConfigResponseLiveAudioAuditConfigList liveAudioAuditConfigList;

    public static DescribeLiveAudioAuditConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveAudioAuditConfigResponse self = new DescribeLiveAudioAuditConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveAudioAuditConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveAudioAuditConfigResponse setLiveAudioAuditConfigList(DescribeLiveAudioAuditConfigResponseLiveAudioAuditConfigList liveAudioAuditConfigList) {
        this.liveAudioAuditConfigList = liveAudioAuditConfigList;
        return this;
    }
    public DescribeLiveAudioAuditConfigResponseLiveAudioAuditConfigList getLiveAudioAuditConfigList() {
        return this.liveAudioAuditConfigList;
    }

    public static class DescribeLiveAudioAuditConfigResponseLiveAudioAuditConfigListLiveAudioAuditConfigScenes extends TeaModel {
        // scene
        @NameInMap("scene")
        @Validation(required = true)
        public java.util.List<String> scene;

        public static DescribeLiveAudioAuditConfigResponseLiveAudioAuditConfigListLiveAudioAuditConfigScenes build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveAudioAuditConfigResponseLiveAudioAuditConfigListLiveAudioAuditConfigScenes self = new DescribeLiveAudioAuditConfigResponseLiveAudioAuditConfigListLiveAudioAuditConfigScenes();
            return TeaModel.build(map, self);
        }

        public DescribeLiveAudioAuditConfigResponseLiveAudioAuditConfigListLiveAudioAuditConfigScenes setScene(java.util.List<String> scene) {
            this.scene = scene;
            return this;
        }
        public java.util.List<String> getScene() {
            return this.scene;
        }

    }

    public static class DescribeLiveAudioAuditConfigResponseLiveAudioAuditConfigListLiveAudioAuditConfig extends TeaModel {
        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        @NameInMap("StreamName")
        @Validation(required = true)
        public String streamName;

        @NameInMap("BizType")
        @Validation(required = true)
        public String bizType;

        @NameInMap("Scenes")
        @Validation(required = true)
        public DescribeLiveAudioAuditConfigResponseLiveAudioAuditConfigListLiveAudioAuditConfigScenes scenes;

        public static DescribeLiveAudioAuditConfigResponseLiveAudioAuditConfigListLiveAudioAuditConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveAudioAuditConfigResponseLiveAudioAuditConfigListLiveAudioAuditConfig self = new DescribeLiveAudioAuditConfigResponseLiveAudioAuditConfigListLiveAudioAuditConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveAudioAuditConfigResponseLiveAudioAuditConfigListLiveAudioAuditConfig setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveAudioAuditConfigResponseLiveAudioAuditConfigListLiveAudioAuditConfig setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveAudioAuditConfigResponseLiveAudioAuditConfigListLiveAudioAuditConfig setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLiveAudioAuditConfigResponseLiveAudioAuditConfigListLiveAudioAuditConfig setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribeLiveAudioAuditConfigResponseLiveAudioAuditConfigListLiveAudioAuditConfig setScenes(DescribeLiveAudioAuditConfigResponseLiveAudioAuditConfigListLiveAudioAuditConfigScenes scenes) {
            this.scenes = scenes;
            return this;
        }
        public DescribeLiveAudioAuditConfigResponseLiveAudioAuditConfigListLiveAudioAuditConfigScenes getScenes() {
            return this.scenes;
        }

    }

    public static class DescribeLiveAudioAuditConfigResponseLiveAudioAuditConfigList extends TeaModel {
        @NameInMap("LiveAudioAuditConfig")
        @Validation(required = true)
        public java.util.List<DescribeLiveAudioAuditConfigResponseLiveAudioAuditConfigListLiveAudioAuditConfig> liveAudioAuditConfig;

        public static DescribeLiveAudioAuditConfigResponseLiveAudioAuditConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveAudioAuditConfigResponseLiveAudioAuditConfigList self = new DescribeLiveAudioAuditConfigResponseLiveAudioAuditConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveAudioAuditConfigResponseLiveAudioAuditConfigList setLiveAudioAuditConfig(java.util.List<DescribeLiveAudioAuditConfigResponseLiveAudioAuditConfigListLiveAudioAuditConfig> liveAudioAuditConfig) {
            this.liveAudioAuditConfig = liveAudioAuditConfig;
            return this;
        }
        public java.util.List<DescribeLiveAudioAuditConfigResponseLiveAudioAuditConfigListLiveAudioAuditConfig> getLiveAudioAuditConfig() {
            return this.liveAudioAuditConfig;
        }

    }

}
