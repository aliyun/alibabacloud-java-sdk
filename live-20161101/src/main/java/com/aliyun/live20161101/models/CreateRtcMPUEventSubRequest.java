// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateRtcMPUEventSubRequest extends TeaModel {
    /**
     * <p>The ID of the application to subscribe to. You can view your application IDs by navigating to <strong>ApsaraVideo Live &gt; Live+ &gt; ApsaraVideo Real-time Communication &gt; Application Management</strong>. If no application exists, create one by clicking <strong>Create Application</strong>.</p>
     * <blockquote>
     * <p>The application ID consists of uppercase and lowercase letters, digits, underscores, and hyphens (-), with a maximum of 64 characters.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourAppId</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The callback URL. For the URL format, refer to the callback content specifications below.</p>
     * <blockquote>
     * <p>The callback URL protocol must be HTTP or HTTPS. The URL can contain only the following characters: a-z, A-Z, 0-9, -, _, ?, %, =, #, ., /, and +. The URL cannot exceed 2083 characters.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>http://****.com/callback</p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>The channel IDs of the stream mixing tasks for which you want to receive callbacks. You can specify multiple channel IDs separated by commas (,).</p>
     * <blockquote>
     * <ul>
     * <li>If you leave this parameter empty, callbacks for all stream mixing and relaying tasks under the specified AppId are received by default.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>When specifying multiple channel IDs, do not include duplicates. You can specify up to 20 channel IDs at a time.</li>
     * <li>Each channel ID consists of uppercase and lowercase letters, digits, underscores, and hyphens (-), with a maximum of 64 characters.</li>
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
