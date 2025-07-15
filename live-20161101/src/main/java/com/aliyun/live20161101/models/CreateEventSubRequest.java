// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateEventSubRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9qb1****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The callback URL. For more information about the content of the messages that are sent to the callback URL, see the Callback section in this topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>http://****.com/callback</p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>The channel ID. You can call the <a href="https://help.aliyun.com/document_detail/2628135.html">ListEventSub</a> operation to query the channel ID.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter is required if you specify the Users.N parameter.</p>
     * </li>
     * <li><p>If you set this parameter to \* or do not specify this parameter, all channels are subscribed to.</p>
     * </li>
     * <li><p>Each application ID allows only one all-channel subscription.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>123333</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>Subscribe to events.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Events")
    public java.util.List<String> events;

    /**
     * <p>The user whose events you want to subscribe to. If you leave this parameter empty, the events of all users in the channel are subscribed to, including the events of the streamer and viewers. Specify this parameter in the following format:</p>
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
