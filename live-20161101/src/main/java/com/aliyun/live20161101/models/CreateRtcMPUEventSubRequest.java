// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateRtcMPUEventSubRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <blockquote>
     * <p>The ID can be up to 64 characters in length and can contain letters, digits, underscores, and hyphens (-).</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourAppId</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The callback URL.</p>
     * <blockquote>
     * <p>The callback URL can be up to 2,083 characters in length. You can use headers such as HTTP and HTTPS in callback URLs. The URL can contain letters, digits, and the following special characters: - _ ? % = # . / +</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>http://****.com/callback</p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>The ID of the channel to which you want to send mixed-stream relay event callbacks. Separate multiple channel IDs with commas (,).</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If you leave this parameter empty, you are subscribed to mixed-stream relay events of all channels in the application.</p>
     * </li>
     * <li><p>You cannot specify duplicate channel IDs. You can specify up to 20 channel IDs in each call.</p>
     * </li>
     * <li><p>The ID can be up to 64 characters in length and contain letters, digits, underscores (_), and hyphens (-).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>yourChannelIds</p>
     */
    @NameInMap("ChannelIds")
    public String channelIds;

    public static CreateRtcMPUEventSubRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRtcMPUEventSubRequest self = new CreateRtcMPUEventSubRequest();
        return TeaModel.build(map, self);
    }

    public CreateRtcMPUEventSubRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateRtcMPUEventSubRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public CreateRtcMPUEventSubRequest setChannelIds(String channelIds) {
        this.channelIds = channelIds;
        return this;
    }
    public String getChannelIds() {
        return this.channelIds;
    }

}
