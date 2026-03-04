// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class Channel extends TeaModel {
    /**
     * <p>Specifies whether to enable access control.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AccessPolicy")
    public Boolean accessPolicy;

    /**
     * <p>The token for accessing the channel.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("AccessToken")
    public String accessToken;

    /**
     * <p>The ARN of the channel.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ims:mediaweaver:<regionId>:<userId>:channel/myChannel</p>
     */
    @NameInMap("Arn")
    public String arn;

    /**
     * <p>The name of the channel.</p>
     * 
     * <strong>example:</strong>
     * <p>MyChannel</p>
     */
    @NameInMap("ChannelName")
    public String channelName;

    /**
     * <p>The tier of the channel.</p>
     * 
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("ChannelTier")
    public String channelTier;

    /**
     * <p>The source location of the filler slate.</p>
     * 
     * <strong>example:</strong>
     * <p>MySourceLocation</p>
     */
    @NameInMap("FillerSourceLocationName")
    public String fillerSourceLocationName;

    /**
     * <p>The source name of the filler slate.</p>
     * 
     * <strong>example:</strong>
     * <p>MySource</p>
     */
    @NameInMap("FillerSourceName")
    public String fillerSourceName;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-15T03:44:16Z</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <p>The modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-09-01T10:09Z</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <p>The output configurations.</p>
     */
    @NameInMap("OutPutConfigList")
    public java.util.List<ChannelOutPutConfigList> outPutConfigList;

    /**
     * <p>The playback mode.</p>
     * 
     * <strong>example:</strong>
     * <p>loop</p>
     */
    @NameInMap("PlaybackMode")
    public String playbackMode;

    /**
     * <p>The state of the channel.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
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
        /**
         * <p>The name of the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>MyChannel</p>
         */
        @NameInMap("ChannelName")
        public String channelName;

        /**
         * <p>The format.</p>
         * 
         * <strong>example:</strong>
         * <p>hls</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The manifest name.</p>
         * 
         * <strong>example:</strong>
         * <p>index1</p>
         */
        @NameInMap("ManifestName")
        public String manifestName;

        /**
         * <p>The manifest settings.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;WindowDuration&quot;: 60,&quot;AdMarkType&quot;:&quot;Daterange&quot;}</p>
         */
        @NameInMap("ManifestSettings")
        public String manifestSettings;

        /**
         * <p>The playback URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxxx.com/xxx.m3u8">https://xxxxx.com/xxx.m3u8</a></p>
         */
        @NameInMap("PlaybackUrl")
        public String playbackUrl;

        /**
         * <p>The name of the source group.</p>
         * 
         * <strong>example:</strong>
         * <p>group1</p>
         */
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
