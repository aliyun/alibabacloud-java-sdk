// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWaitingRoomEventsResponseBody extends TeaModel {
    /**
     * <p>The request ID, which is used to trace a call.</p>
     * 
     * <strong>example:</strong>
     * <p>f3c3700a-4c0f-4a24-b576-fd7dbf9e7c55</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the waiting room events.</p>
     */
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
         * <p>The content of the custom waiting room page. This parameter is returned when the waiting room type is set to custom. The content is URL-encoded.</p>
         * 
         * <strong>example:</strong>
         * <p>html-yets-maqi1111</p>
         */
        @NameInMap("CustomPageHtml")
        public String customPageHtml;

        /**
         * <p>The event description.</p>
         * 
         * <strong>example:</strong>
         * <p>terraform-example</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether session renewal is disabled. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("DisableSessionRenewalEnable")
        public String disableSessionRenewalEnable;

        /**
         * <p>The event status. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Enable")
        public String enable;

        /**
         * <p>The end time of the event. This value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1719814497</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>Indicates whether JOSN response is enabled. If JSON response is enabled, a JSON body is returned for requests to the waiting room with the header Accept: application/json. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("JsonResponseEnable")
        public String jsonResponseEnable;

        /**
         * <p>The language of the waiting room page. This parameter is returned when the waiting room type is set to default. Valid values:</p>
         * <ul>
         * <li>enus: English.</li>
         * <li>zhcn: Simplified Chinese.</li>
         * <li>zhhk: Traditional Chinese.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zhcn</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The custom event name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The maximum number of new users per minute.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("NewUsersPerMinute")
        public String newUsersPerMinute;

        /**
         * <p>Indicates whether pre-queuing is enabled. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("PreQueueEnable")
        public String preQueueEnable;

        /**
         * <p>The start time for pre-queuing. This value is a UNIX timestamp. This parameter is valid only when pre-queuing is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>1719814097</p>
         */
        @NameInMap("PreQueueStartTime")
        public String preQueueStartTime;

        /**
         * <p>The queuing method. Valid values:</p>
         * <ul>
         * <li>random: Users gain access to the origin randomly, regardless of the arrival time.</li>
         * <li>fifo: Users gain access to the origin in order of arrival.</li>
         * <li>passthrough: Users pass through the waiting room and go straight to the origin.</li>
         * <li>reject-all: Users are blocked from reaching the origin.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>fifo</p>
         */
        @NameInMap("QueuingMethod")
        public String queuingMethod;

        /**
         * <p>The HTTP status code to return while a user is in the queue. Valid values:</p>
         * <ul>
         * <li>200</li>
         * <li>202</li>
         * <li>429</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("QueuingStatusCode")
        public String queuingStatusCode;

        /**
         * <p>Indicates whether random queuing is enabled. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RandomPreQueueEnable")
        public String randomPreQueueEnable;

        /**
         * <p>The maximum duration for which a session remains valid after a user leaves the origin. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SessionDuration")
        public String sessionDuration;

        /**
         * <p>The start time of the event. This value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1719814398</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The maximum number of active users.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("TotalActiveUsers")
        public String totalActiveUsers;

        /**
         * <p>The unique ID of the waiting room event.</p>
         * 
         * <strong>example:</strong>
         * <p>89677721098****</p>
         */
        @NameInMap("WaitingRoomEventId")
        public Long waitingRoomEventId;

        /**
         * <p>The ID of the waiting room associated with the event.</p>
         * 
         * <strong>example:</strong>
         * <p>5c938a045c9ca46607163d34966****</p>
         */
        @NameInMap("WaitingRoomId")
        public String waitingRoomId;

        /**
         * <p>The type of the waiting room. Valid values:</p>
         * <ul>
         * <li>default</li>
         * <li>custom</li>
         * </ul>
         * 
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
