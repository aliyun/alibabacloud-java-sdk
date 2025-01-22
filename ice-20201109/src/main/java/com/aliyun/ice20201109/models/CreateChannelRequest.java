// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateChannelRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AccessPolicy")
    public Boolean accessPolicy;

    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("AccessToken")
    public String accessToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyChannel</p>
     */
    @NameInMap("ChannelName")
    public String channelName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("ChannelTier")
    public String channelTier;

    /**
     * <strong>example:</strong>
     * <p>MySourceLocation</p>
     */
    @NameInMap("FillerSourceLocationName")
    public String fillerSourceLocationName;

    /**
     * <strong>example:</strong>
     * <p>FillerSource</p>
     */
    @NameInMap("FillerSourceName")
    public String fillerSourceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{
     *     &quot;ManifestName&quot;: &quot;manifest-1&quot;,
     *     &quot;Format&quot;: &quot;HLS&quot;,
     *     &quot;SourceGroupName&quot;: &quot;source-group-1&quot;,
     *     &quot;ManifestSettings&quot;: {
     *         &quot;WindowDuration&quot;: 60,
     *         &quot;AdMarkType&quot;: &quot;Daterange&quot;
     *     }
     * }]</p>
     */
    @NameInMap("OutPutConfigList")
    public String outPutConfigList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>loop</p>
     */
    @NameInMap("PlaybackMode")
    public String playbackMode;

    public static CreateChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChannelRequest self = new CreateChannelRequest();
        return TeaModel.build(map, self);
    }

    public CreateChannelRequest setAccessPolicy(Boolean accessPolicy) {
        this.accessPolicy = accessPolicy;
        return this;
    }
    public Boolean getAccessPolicy() {
        return this.accessPolicy;
    }

    public CreateChannelRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public CreateChannelRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public CreateChannelRequest setChannelTier(String channelTier) {
        this.channelTier = channelTier;
        return this;
    }
    public String getChannelTier() {
        return this.channelTier;
    }

    public CreateChannelRequest setFillerSourceLocationName(String fillerSourceLocationName) {
        this.fillerSourceLocationName = fillerSourceLocationName;
        return this;
    }
    public String getFillerSourceLocationName() {
        return this.fillerSourceLocationName;
    }

    public CreateChannelRequest setFillerSourceName(String fillerSourceName) {
        this.fillerSourceName = fillerSourceName;
        return this;
    }
    public String getFillerSourceName() {
        return this.fillerSourceName;
    }

    public CreateChannelRequest setOutPutConfigList(String outPutConfigList) {
        this.outPutConfigList = outPutConfigList;
        return this;
    }
    public String getOutPutConfigList() {
        return this.outPutConfigList;
    }

    public CreateChannelRequest setPlaybackMode(String playbackMode) {
        this.playbackMode = playbackMode;
        return this;
    }
    public String getPlaybackMode() {
        return this.playbackMode;
    }

}
