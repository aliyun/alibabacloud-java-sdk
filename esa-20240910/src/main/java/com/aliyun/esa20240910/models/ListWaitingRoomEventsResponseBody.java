// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWaitingRoomEventsResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>f3c3700a-4c0f-4a24-b576-fd7dbf9e7c55</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WaitingRoomEvents")
    public java.util.List<ListWaitingRoomEventsResponseBodyWaitingRoomEvents> waitingRoomEvents;

    public static ListWaitingRoomEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWaitingRoomEventsResponseBody self = new ListWaitingRoomEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWaitingRoomEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWaitingRoomEventsResponseBody setWaitingRoomEvents(java.util.List<ListWaitingRoomEventsResponseBodyWaitingRoomEvents> waitingRoomEvents) {
        this.waitingRoomEvents = waitingRoomEvents;
        return this;
    }
    public java.util.List<ListWaitingRoomEventsResponseBodyWaitingRoomEvents> getWaitingRoomEvents() {
        return this.waitingRoomEvents;
    }

    public static class ListWaitingRoomEventsResponseBodyWaitingRoomEvents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>html-yets-maqi1111</p>
         */
        @NameInMap("CustomPageHtml")
        public String customPageHtml;

        /**
         * <strong>example:</strong>
         * <p>terraform-example</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("DisableSessionRenewalEnable")
        public String disableSessionRenewalEnable;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Enable")
        public String enable;

        /**
         * <strong>example:</strong>
         * <p>1719814497</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("JsonResponseEnable")
        public String jsonResponseEnable;

        /**
         * <strong>example:</strong>
         * <p>zhcn</p>
         */
        @NameInMap("Language")
        public String language;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("NewUsersPerMinute")
        public String newUsersPerMinute;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("PreQueueEnable")
        public String preQueueEnable;

        /**
         * <strong>example:</strong>
         * <p>1719814097</p>
         */
        @NameInMap("PreQueueStartTime")
        public String preQueueStartTime;

        /**
         * <strong>example:</strong>
         * <p>fifo</p>
         */
        @NameInMap("QueuingMethod")
        public String queuingMethod;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("QueuingStatusCode")
        public String queuingStatusCode;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RandomPreQueueEnable")
        public String randomPreQueueEnable;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SessionDuration")
        public String sessionDuration;

        /**
         * <strong>example:</strong>
         * <p>1719814398</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("TotalActiveUsers")
        public String totalActiveUsers;

        /**
         * <strong>example:</strong>
         * <p>89677721098****</p>
         */
        @NameInMap("WaitingRoomEventId")
        public Long waitingRoomEventId;

        /**
         * <strong>example:</strong>
         * <p>5c938a045c9ca46607163d34966****</p>
         */
        @NameInMap("WaitingRoomId")
        public String waitingRoomId;

        /**
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("WaitingRoomType")
        public String waitingRoomType;

        public static ListWaitingRoomEventsResponseBodyWaitingRoomEvents build(java.util.Map<String, ?> map) throws Exception {
            ListWaitingRoomEventsResponseBodyWaitingRoomEvents self = new ListWaitingRoomEventsResponseBodyWaitingRoomEvents();
            return TeaModel.build(map, self);
        }

        public ListWaitingRoomEventsResponseBodyWaitingRoomEvents setCustomPageHtml(String customPageHtml) {
            this.customPageHtml = customPageHtml;
            return this;
        }
        public String getCustomPageHtml() {
            return this.customPageHtml;
        }

        public ListWaitingRoomEventsResponseBodyWaitingRoomEvents setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListWaitingRoomEventsResponseBodyWaitingRoomEvents setDisableSessionRenewalEnable(String disableSessionRenewalEnable) {
            this.disableSessionRenewalEnable = disableSessionRenewalEnable;
            return this;
        }
        public String getDisableSessionRenewalEnable() {
            return this.disableSessionRenewalEnable;
        }

        public ListWaitingRoomEventsResponseBodyWaitingRoomEvents setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public ListWaitingRoomEventsResponseBodyWaitingRoomEvents setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListWaitingRoomEventsResponseBodyWaitingRoomEvents setJsonResponseEnable(String jsonResponseEnable) {
            this.jsonResponseEnable = jsonResponseEnable;
            return this;
        }
        public String getJsonResponseEnable() {
            return this.jsonResponseEnable;
        }

        public ListWaitingRoomEventsResponseBodyWaitingRoomEvents setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ListWaitingRoomEventsResponseBodyWaitingRoomEvents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWaitingRoomEventsResponseBodyWaitingRoomEvents setNewUsersPerMinute(String newUsersPerMinute) {
            this.newUsersPerMinute = newUsersPerMinute;
            return this;
        }
        public String getNewUsersPerMinute() {
            return this.newUsersPerMinute;
        }

        public ListWaitingRoomEventsResponseBodyWaitingRoomEvents setPreQueueEnable(String preQueueEnable) {
            this.preQueueEnable = preQueueEnable;
            return this;
        }
        public String getPreQueueEnable() {
            return this.preQueueEnable;
        }

        public ListWaitingRoomEventsResponseBodyWaitingRoomEvents setPreQueueStartTime(String preQueueStartTime) {
            this.preQueueStartTime = preQueueStartTime;
            return this;
        }
        public String getPreQueueStartTime() {
            return this.preQueueStartTime;
        }

        public ListWaitingRoomEventsResponseBodyWaitingRoomEvents setQueuingMethod(String queuingMethod) {
            this.queuingMethod = queuingMethod;
            return this;
        }
        public String getQueuingMethod() {
            return this.queuingMethod;
        }

        public ListWaitingRoomEventsResponseBodyWaitingRoomEvents setQueuingStatusCode(String queuingStatusCode) {
            this.queuingStatusCode = queuingStatusCode;
            return this;
        }
        public String getQueuingStatusCode() {
            return this.queuingStatusCode;
        }

        public ListWaitingRoomEventsResponseBodyWaitingRoomEvents setRandomPreQueueEnable(String randomPreQueueEnable) {
            this.randomPreQueueEnable = randomPreQueueEnable;
            return this;
        }
        public String getRandomPreQueueEnable() {
            return this.randomPreQueueEnable;
        }

        public ListWaitingRoomEventsResponseBodyWaitingRoomEvents setSessionDuration(String sessionDuration) {
            this.sessionDuration = sessionDuration;
            return this;
        }
        public String getSessionDuration() {
            return this.sessionDuration;
        }

        public ListWaitingRoomEventsResponseBodyWaitingRoomEvents setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListWaitingRoomEventsResponseBodyWaitingRoomEvents setTotalActiveUsers(String totalActiveUsers) {
            this.totalActiveUsers = totalActiveUsers;
            return this;
        }
        public String getTotalActiveUsers() {
            return this.totalActiveUsers;
        }

        public ListWaitingRoomEventsResponseBodyWaitingRoomEvents setWaitingRoomEventId(Long waitingRoomEventId) {
            this.waitingRoomEventId = waitingRoomEventId;
            return this;
        }
        public Long getWaitingRoomEventId() {
            return this.waitingRoomEventId;
        }

        public ListWaitingRoomEventsResponseBodyWaitingRoomEvents setWaitingRoomId(String waitingRoomId) {
            this.waitingRoomId = waitingRoomId;
            return this;
        }
        public String getWaitingRoomId() {
            return this.waitingRoomId;
        }

        public ListWaitingRoomEventsResponseBodyWaitingRoomEvents setWaitingRoomType(String waitingRoomType) {
            this.waitingRoomType = waitingRoomType;
            return this;
        }
        public String getWaitingRoomType() {
            return this.waitingRoomType;
        }

    }

}
