// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateEventSubRequest extends TeaModel {
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
     * <p>The callback URL. For more information about the callback content, see CreateEventSub.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>http://****.com/callback</p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>The channel ID. You can call the <a href="https://help.aliyun.com/document_detail/2848210.html">ListEventSub</a> operation to query the channel ID.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter is required if you specify the Users.N parameter.</p>
     * </li>
     * <li><p>If you set this parameter to \* or do not specify this parameter, all channels are subscribed to.</p>
     * </li>
     * <li><p>You can create up to 20 subscriptions for each application ID.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>123333</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The type of the events to which you want to subscribe.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Events")
    public java.util.List<String> events;

    /**
     * <p>The subscription ID. You can obtain the ID from the response to the <a href="https://help.aliyun.com/document_detail/2848209.html">CreateEventSub</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ad53276431c****</p>
     */
    @NameInMap("SubscribeId")
    public String subscribeId;

    /**
     * <p>The user whose events you want to subscribe to.</p>
     */
    @NameInMap("Users")
    public java.util.List<String> users;

    public static UpdateEventSubRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventSubRequest self = new UpdateEventSubRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEventSubRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateEventSubRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public UpdateEventSubRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public UpdateEventSubRequest setEvents(java.util.List<String> events) {
        this.events = events;
        return this;
    }
    public java.util.List<String> getEvents() {
        return this.events;
    }

    public UpdateEventSubRequest setSubscribeId(String subscribeId) {
        this.subscribeId = subscribeId;
        return this;
    }
    public String getSubscribeId() {
        return this.subscribeId;
    }

    public UpdateEventSubRequest setUsers(java.util.List<String> users) {
        this.users = users;
        return this;
    }
    public java.util.List<String> getUsers() {
        return this.users;
    }

}
