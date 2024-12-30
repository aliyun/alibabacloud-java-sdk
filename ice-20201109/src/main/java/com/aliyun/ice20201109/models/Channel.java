// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class Channel extends TeaModel {
    @NameInMap("AccessPolicy")
    public Boolean accessPolicy;

    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("Arn")
    public String arn;

    @NameInMap("ChannelName")
    public String channelName;

    @NameInMap("ChannelTier")
    public String channelTier;

    @NameInMap("FillerSourceLocationName")
    public String fillerSourceLocationName;

    @NameInMap("FillerSourceName")
    public String fillerSourceName;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("OutPutConfigList")
    public java.util.List<ChannelOutPutConfigList> outPutConfigList;

    @NameInMap("PlaybackMode")
    public String playbackMode;

    @NameInMap("State")
    public Integer state;

    public static Channel build(java.util.Map<String, ?> map) throws Exception {
        Channel self = new Channel();
        return TeaModel.build(map, self);
    }

    public Channel setAccessPolicy(Boolean accessPolicy) {
        this.accessPolicy = accessPolicy;
        return this;
    }
    public Boolean getAccessPolicy() {
        return this.accessPolicy;
    }

    public Channel setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public Channel setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public Channel setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public Channel setChannelTier(String channelTier) {
        this.channelTier = channelTier;
        return this;
    }
    public String getChannelTier() {
        return this.channelTier;
    }

    public Channel setFillerSourceLocationName(String fillerSourceLocationName) {
        this.fillerSourceLocationName = fillerSourceLocationName;
        return this;
    }
    public String getFillerSourceLocationName() {
        return this.fillerSourceLocationName;
    }

    public Channel setFillerSourceName(String fillerSourceName) {
        this.fillerSourceName = fillerSourceName;
        return this;
    }
    public String getFillerSourceName() {
        return this.fillerSourceName;
    }

    public Channel setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public Channel setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public Channel setOutPutConfigList(java.util.List<ChannelOutPutConfigList> outPutConfigList) {
        this.outPutConfigList = outPutConfigList;
        return this;
    }
    public java.util.List<ChannelOutPutConfigList> getOutPutConfigList() {
        return this.outPutConfigList;
    }

    public Channel setPlaybackMode(String playbackMode) {
        this.playbackMode = playbackMode;
        return this;
    }
    public String getPlaybackMode() {
        return this.playbackMode;
    }

    public Channel setState(Integer state) {
        this.state = state;
        return this;
    }
    public Integer getState() {
        return this.state;
    }

    public static class ChannelOutPutConfigList extends TeaModel {
        @NameInMap("ChannelName")
        public String channelName;

        @NameInMap("Format")
        public String format;

        @NameInMap("ManifestName")
        public String manifestName;

        @NameInMap("ManifestSettings")
        public String manifestSettings;

        @NameInMap("PlaybackUrl")
        public String playbackUrl;

        @NameInMap("SourceGroupName")
        public String sourceGroupName;

        public static ChannelOutPutConfigList build(java.util.Map<String, ?> map) throws Exception {
            ChannelOutPutConfigList self = new ChannelOutPutConfigList();
            return TeaModel.build(map, self);
        }

        public ChannelOutPutConfigList setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public ChannelOutPutConfigList setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public ChannelOutPutConfigList setManifestName(String manifestName) {
            this.manifestName = manifestName;
            return this;
        }
        public String getManifestName() {
            return this.manifestName;
        }

        public ChannelOutPutConfigList setManifestSettings(String manifestSettings) {
            this.manifestSettings = manifestSettings;
            return this;
        }
        public String getManifestSettings() {
            return this.manifestSettings;
        }

        public ChannelOutPutConfigList setPlaybackUrl(String playbackUrl) {
            this.playbackUrl = playbackUrl;
            return this;
        }
        public String getPlaybackUrl() {
            return this.playbackUrl;
        }

        public ChannelOutPutConfigList setSourceGroupName(String sourceGroupName) {
            this.sourceGroupName = sourceGroupName;
            return this;
        }
        public String getSourceGroupName() {
            return this.sourceGroupName;
        }

    }

}
