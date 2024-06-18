// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetSubscribedCalendarResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>012345</p>
     */
    @NameInMap("author")
    public String author;

    /**
     * <strong>example:</strong>
     * <p>M5MjkxNDUxQHVzZXJzLmRpbmd0YWxrLmNv</p>
     */
    @NameInMap("calendarId")
    public String calendarId;

    /**
     * <strong>example:</strong>
     * <p>中国传统日历</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("managers")
    public java.util.List<String> managers;

    /**
     * <strong>example:</strong>
     * <p>中国传统日历</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("subscribeScope")
    public GetSubscribedCalendarResponseBodySubscribeScope subscribeScope;

    public static GetSubscribedCalendarResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSubscribedCalendarResponseBody self = new GetSubscribedCalendarResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSubscribedCalendarResponseBody setAuthor(String author) {
        this.author = author;
        return this;
    }
    public String getAuthor() {
        return this.author;
    }

    public GetSubscribedCalendarResponseBody setCalendarId(String calendarId) {
        this.calendarId = calendarId;
        return this;
    }
    public String getCalendarId() {
        return this.calendarId;
    }

    public GetSubscribedCalendarResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetSubscribedCalendarResponseBody setManagers(java.util.List<String> managers) {
        this.managers = managers;
        return this;
    }
    public java.util.List<String> getManagers() {
        return this.managers;
    }

    public GetSubscribedCalendarResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetSubscribedCalendarResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSubscribedCalendarResponseBody setSubscribeScope(GetSubscribedCalendarResponseBodySubscribeScope subscribeScope) {
        this.subscribeScope = subscribeScope;
        return this;
    }
    public GetSubscribedCalendarResponseBodySubscribeScope getSubscribeScope() {
        return this.subscribeScope;
    }

    public static class GetSubscribedCalendarResponseBodySubscribeScope extends TeaModel {
        @NameInMap("CorpIds")
        public java.util.List<String> corpIds;

        @NameInMap("OpenConversationIds")
        public java.util.List<String> openConversationIds;

        @NameInMap("UserIds")
        public java.util.List<String> userIds;

        public static GetSubscribedCalendarResponseBodySubscribeScope build(java.util.Map<String, ?> map) throws Exception {
            GetSubscribedCalendarResponseBodySubscribeScope self = new GetSubscribedCalendarResponseBodySubscribeScope();
            return TeaModel.build(map, self);
        }

        public GetSubscribedCalendarResponseBodySubscribeScope setCorpIds(java.util.List<String> corpIds) {
            this.corpIds = corpIds;
            return this;
        }
        public java.util.List<String> getCorpIds() {
            return this.corpIds;
        }

        public GetSubscribedCalendarResponseBodySubscribeScope setOpenConversationIds(java.util.List<String> openConversationIds) {
            this.openConversationIds = openConversationIds;
            return this;
        }
        public java.util.List<String> getOpenConversationIds() {
            return this.openConversationIds;
        }

        public GetSubscribedCalendarResponseBodySubscribeScope setUserIds(java.util.List<String> userIds) {
            this.userIds = userIds;
            return this;
        }
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

    }

}
