// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateChannelRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
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
     * <strong>example:</strong>
     * <p>MySourceLocation</p>
     */
    @NameInMap("FillerSourceLocationName")
    public String fillerSourceLocationName;

    /**
     * <strong>example:</strong>
     * <p>MySource</p>
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

    public static UpdateChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateChannelRequest self = new UpdateChannelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateChannelRequest setAccessPolicy(Boolean accessPolicy) {
        this.accessPolicy = accessPolicy;
        return this;
    }
    public Boolean getAccessPolicy() {
        return this.accessPolicy;
    }

    public UpdateChannelRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public UpdateChannelRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public UpdateChannelRequest setFillerSourceLocationName(String fillerSourceLocationName) {
        this.fillerSourceLocationName = fillerSourceLocationName;
        return this;
    }
    public String getFillerSourceLocationName() {
        return this.fillerSourceLocationName;
    }

    public UpdateChannelRequest setFillerSourceName(String fillerSourceName) {
        this.fillerSourceName = fillerSourceName;
        return this;
    }
    public String getFillerSourceName() {
        return this.fillerSourceName;
    }

    public UpdateChannelRequest setOutPutConfigList(String outPutConfigList) {
        this.outPutConfigList = outPutConfigList;
        return this;
    }
    public String getOutPutConfigList() {
        return this.outPutConfigList;
    }

}
