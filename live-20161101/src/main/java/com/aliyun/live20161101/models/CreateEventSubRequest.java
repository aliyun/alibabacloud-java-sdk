// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateEventSubRequest extends TeaModel {
    /**
     * <p>The ID of the application to subscribe to. You can view your application IDs by navigating to <strong>ApsaraVideo Live &gt; Live+ &gt; ApsaraVideo Real-time Communication &gt; Application Management</strong>. If no application exists, create one by clicking [Create Application].</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9qb1****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The callback URL. For the callback content, see the callback content examples below.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>http://****.com/callback</p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>The ID of the channel to subscribe to. You can call the <a href="https://help.aliyun.com/document_detail/2848210.html">ListEventSub</a> operation to query the subscribed channel IDs.</p>
     * <blockquote>
     * <ul>
     * <li>If the Users.N parameter is not empty, this parameter is required.</li>
     * <li>If ChannelId is set to \* or left empty, all channels are subscribed. Each AppId allows only one all-channel subscription.</li>
     * <li>Each AppId allows a maximum of 20 subscriptions at the same time.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123333</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The subscription events.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Events")
    public java.util.List<String> events;

    /**
     * <p>The users whose messages you want to subscribe to. If this parameter is empty, all users in the channel (including streamers and viewers) are subscribed. Format:</p>
     * <pre><code>Users.1=****
     * Users.2=****
     * ......
     * </code></pre>
     */
    @NameInMap("Users")
    public java.util.List<String> users;

    public static CreateEventSubRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEventSubRequest self = new CreateEventSubRequest();
        return TeaModel.build(map, self);
    }

    public CreateEventSubRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateEventSubRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public CreateEventSubRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public CreateEventSubRequest setEvents(java.util.List<String> events) {
        this.events = events;
        return this;
    }
    public java.util.List<String> getEvents() {
        return this.events;
    }

    public CreateEventSubRequest setUsers(java.util.List<String> users) {
        this.users = users;
        return this;
    }
    public java.util.List<String> getUsers() {
        return this.users;
    }

}
