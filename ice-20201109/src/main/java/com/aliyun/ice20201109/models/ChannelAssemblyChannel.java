// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ChannelAssemblyChannel extends TeaModel {
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
     * <p>The tier of the channel. Valid values: basic and standard.</p>
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
     * <p>The time when the channel was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-15T03:44:16Z</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <p>The time when the channel was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-09-01T10:09Z</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <p>The channel output configurations.</p>
     */
    @NameInMap("OutPutConfigList")
    public java.util.List<ChannelAssemblyChannelOutPutConfigList> outPutConfigList;

    /**
     * <p>The playback mode. Valid values: loop and linear.</p>
     * 
     * <strong>example:</strong>
     * <p>loop</p>
     */
    @NameInMap("PlaybackMode")
    public String playbackMode;

    /**
     * <p>The channel status. A value of 0 specifies stopped. A value of 1 specifies running.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("State")
    public Integer state;

    public static ChannelAssemblyChannel build(java.util.Map<String, ?> map) throws Exception {
        ChannelAssemblyChannel self = new ChannelAssemblyChannel();
        return TeaModel.build(map, self);
    }

    public ChannelAssemblyChannel setAccessPolicy(Boolean accessPolicy) {
        this.accessPolicy = accessPolicy;
        return this;
    }
    public Boolean getAccessPolicy() {
        return this.accessPolicy;
    }

    public ChannelAssemblyChannel setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public ChannelAssemblyChannel setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public ChannelAssemblyChannel setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public ChannelAssemblyChannel setChannelTier(String channelTier) {
        this.channelTier = channelTier;
        return this;
    }
    public String getChannelTier() {
        return this.channelTier;
    }

    public ChannelAssemblyChannel setFillerSourceLocationName(String fillerSourceLocationName) {
        this.fillerSourceLocationName = fillerSourceLocationName;
        return this;
    }
    public String getFillerSourceLocationName() {
        return this.fillerSourceLocationName;
    }

    public ChannelAssemblyChannel setFillerSourceName(String fillerSourceName) {
        this.fillerSourceName = fillerSourceName;
        return this;
    }
    public String getFillerSourceName() {
        return this.fillerSourceName;
    }

    public ChannelAssemblyChannel setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ChannelAssemblyChannel setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public ChannelAssemblyChannel setOutPutConfigList(java.util.List<ChannelAssemblyChannelOutPutConfigList> outPutConfigList) {
        this.outPutConfigList = outPutConfigList;
        return this;
    }
    public java.util.List<ChannelAssemblyChannelOutPutConfigList> getOutPutConfigList() {
        return this.outPutConfigList;
    }

    public ChannelAssemblyChannel setPlaybackMode(String playbackMode) {
        this.playbackMode = playbackMode;
        return this;
    }
    public String getPlaybackMode() {
        return this.playbackMode;
    }

    public ChannelAssemblyChannel setState(Integer state) {
        this.state = state;
        return this;
    }
    public Integer getState() {
        return this.state;
    }

    public static class ChannelAssemblyChannelOutPutConfigList extends TeaModel {
        /**
         * <p>The name of the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>MyChannel</p>
         */
        @NameInMap("ChannelName")
        public String channelName;

        /**
         * <p>The streaming protocol. Only HTTP Live Streaming (HLS) is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>hls</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The name of the manifest file.</p>
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

        public static ChannelAssemblyChannelOutPutConfigList build(java.util.Map<String, ?> map) throws Exception {
            ChannelAssemblyChannelOutPutConfigList self = new ChannelAssemblyChannelOutPutConfigList();
            return TeaModel.build(map, self);
        }

        public ChannelAssemblyChannelOutPutConfigList setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public ChannelAssemblyChannelOutPutConfigList setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public ChannelAssemblyChannelOutPutConfigList setManifestName(String manifestName) {
            this.manifestName = manifestName;
            return this;
        }
        public String getManifestName() {
            return this.manifestName;
        }

        public ChannelAssemblyChannelOutPutConfigList setManifestSettings(String manifestSettings) {
            this.manifestSettings = manifestSettings;
            return this;
        }
        public String getManifestSettings() {
            return this.manifestSettings;
        }

        public ChannelAssemblyChannelOutPutConfigList setPlaybackUrl(String playbackUrl) {
            this.playbackUrl = playbackUrl;
            return this;
        }
        public String getPlaybackUrl() {
            return this.playbackUrl;
        }

        public ChannelAssemblyChannelOutPutConfigList setSourceGroupName(String sourceGroupName) {
            this.sourceGroupName = sourceGroupName;
            return this;
        }
        public String getSourceGroupName() {
            return this.sourceGroupName;
        }

    }

}
