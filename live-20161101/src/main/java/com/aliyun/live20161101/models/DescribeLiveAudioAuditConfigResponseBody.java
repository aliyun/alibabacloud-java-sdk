// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveAudioAuditConfigResponseBody extends TeaModel {
    @NameInMap("LiveAudioAuditConfigList")
    public DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigList liveAudioAuditConfigList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7BF95F2A-3B24-4CDE-9346-7F6FA86697A1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveAudioAuditConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveAudioAuditConfigResponseBody self = new DescribeLiveAudioAuditConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveAudioAuditConfigResponseBody setLiveAudioAuditConfigList(DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigList liveAudioAuditConfigList) {
        this.liveAudioAuditConfigList = liveAudioAuditConfigList;
        return this;
    }
    public DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigList getLiveAudioAuditConfigList() {
        return this.liveAudioAuditConfigList;
    }

    public DescribeLiveAudioAuditConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

        @NameInMap("BizType")
        public String bizType;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("Scenes")
        public DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigListLiveAudioAuditConfigScenes scenes;

        @NameInMap("StreamName")
        public String streamName;

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

        public DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigListLiveAudioAuditConfig setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigListLiveAudioAuditConfig setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigListLiveAudioAuditConfig setScenes(DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigListLiveAudioAuditConfigScenes scenes) {
            this.scenes = scenes;
            return this;
        }
        public DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigListLiveAudioAuditConfigScenes getScenes() {
            return this.scenes;
        }

        public DescribeLiveAudioAuditConfigResponseBodyLiveAudioAuditConfigListLiveAudioAuditConfig setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
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
