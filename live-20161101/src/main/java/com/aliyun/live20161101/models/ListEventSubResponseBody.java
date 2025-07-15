// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListEventSubResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AE050E24-BE9B-1E79-BB30-7EA0BBAE7F08</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The events.</p>
     */
    @NameInMap("Subscribers")
    public java.util.List<ListEventSubResponseBodySubscribers> subscribers;

    public static ListEventSubResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEventSubResponseBody self = new ListEventSubResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEventSubResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEventSubResponseBody setSubscribers(java.util.List<ListEventSubResponseBodySubscribers> subscribers) {
        this.subscribers = subscribers;
        return this;
    }
    public java.util.List<ListEventSubResponseBodySubscribers> getSubscribers() {
        return this.subscribers;
    }

    public static class ListEventSubResponseBodySubscribers extends TeaModel {
        /**
         * <p>The callback URL.</p>
         * 
         * <strong>example:</strong>
         * <p>http://****.com/callback</p>
         */
        @NameInMap("CallbackUrl")
        public String callbackUrl;

        /**
         * <p>The ID of the channel to which you subscribe.</p>
         * 
         * <strong>example:</strong>
         * <p>testmodify</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>The time when the subscription was created. The time is displayed in UTC+8. Format: yyyy-MM-dd hh:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-18 10:14:49</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The type of the event. Valid values:</p>
         * <ul>
         * <li>ChannelEvent: channel event. For example, the channel is opened or closed.</li>
         * <li>UserEvent: user event. For example, a user joins or leaves the channel.</li>
         * </ul>
         */
        @NameInMap("Events")
        public java.util.List<String> events;

        /**
         * <p>The time when the subscription was modified. The time is displayed in UTC+8. Format: yyyy-MM-dd hh:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-18 10:14:49</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The role of the user whose events are returned. Valid values:</p>
         * <ul>
         * <li>1: streamer</li>
         * <li>2: viewer</li>
         * </ul>
         * <p>An empty value or a value other than 1 and 2 indicates that events of all users in the channel are returned.</p>
         * <blockquote>
         * <p> This parameter is deprecated. When you create a subscription, this parameter is no longer supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Roles")
        @Deprecated
        public Integer roles;

        /**
         * <p>The ID of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>09be0d2254cb5a89f4cbd86403ec****</p>
         */
        @NameInMap("SubId")
        public String subId;

        /**
         * <p>The user whose events are returned. We recommend that you use either this parameter or Roles.</p>
         */
        @NameInMap("Users")
        public java.util.List<String> users;

        public static ListEventSubResponseBodySubscribers build(java.util.Map<String, ?> map) throws Exception {
            ListEventSubResponseBodySubscribers self = new ListEventSubResponseBodySubscribers();
            return TeaModel.build(map, self);
        }

        public ListEventSubResponseBodySubscribers setCallbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }
        public String getCallbackUrl() {
            return this.callbackUrl;
        }

        public ListEventSubResponseBodySubscribers setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public ListEventSubResponseBodySubscribers setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListEventSubResponseBodySubscribers setEvents(java.util.List<String> events) {
            this.events = events;
            return this;
        }
        public java.util.List<String> getEvents() {
            return this.events;
        }

        public ListEventSubResponseBodySubscribers setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        @Deprecated
        public ListEventSubResponseBodySubscribers setRoles(Integer roles) {
            this.roles = roles;
            return this;
        }
        public Integer getRoles() {
            return this.roles;
        }

        public ListEventSubResponseBodySubscribers setSubId(String subId) {
            this.subId = subId;
            return this;
        }
        public String getSubId() {
            return this.subId;
        }

        public ListEventSubResponseBodySubscribers setUsers(java.util.List<String> users) {
            this.users = users;
            return this;
        }
        public java.util.List<String> getUsers() {
            return this.users;
        }

    }

}
