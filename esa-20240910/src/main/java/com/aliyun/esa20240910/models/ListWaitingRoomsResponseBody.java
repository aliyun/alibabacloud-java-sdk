// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWaitingRoomsResponseBody extends TeaModel {
    /**
     * <p>The request ID, which is used to trace a call.</p>
     * 
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-A198-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The waiting rooms.</p>
     */
    @NameInMap("WaitingRooms")
    public java.util.List<ListWaitingRoomsResponseBodyWaitingRooms> waitingRooms;

    public static ListWaitingRoomsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWaitingRoomsResponseBody self = new ListWaitingRoomsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWaitingRoomsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWaitingRoomsResponseBody setWaitingRooms(java.util.List<ListWaitingRoomsResponseBodyWaitingRooms> waitingRooms) {
        this.waitingRooms = waitingRooms;
        return this;
    }
    public java.util.List<ListWaitingRoomsResponseBodyWaitingRooms> getWaitingRooms() {
        return this.waitingRooms;
    }

    public static class ListWaitingRoomsResponseBodyWaitingRoomsHostNameAndPath extends TeaModel {
        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The path.</p>
         * 
         * <strong>example:</strong>
         * <p>/test</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The subdomain.</p>
         * 
         * <strong>example:</strong>
         * <p>test.</p>
         */
        @NameInMap("Subdomain")
        public String subdomain;

        public static ListWaitingRoomsResponseBodyWaitingRoomsHostNameAndPath build(java.util.Map<String, ?> map) throws Exception {
            ListWaitingRoomsResponseBodyWaitingRoomsHostNameAndPath self = new ListWaitingRoomsResponseBodyWaitingRoomsHostNameAndPath();
            return TeaModel.build(map, self);
        }

        public ListWaitingRoomsResponseBodyWaitingRoomsHostNameAndPath setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListWaitingRoomsResponseBodyWaitingRoomsHostNameAndPath setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListWaitingRoomsResponseBodyWaitingRoomsHostNameAndPath setSubdomain(String subdomain) {
            this.subdomain = subdomain;
            return this;
        }
        public String getSubdomain() {
            return this.subdomain;
        }

    }

    public static class ListWaitingRoomsResponseBodyWaitingRooms extends TeaModel {
        /**
         * <p>The name of the custom cookie.</p>
         * 
         * <strong>example:</strong>
         * <p>__aliwaitingroom_example</p>
         */
        @NameInMap("CookieName")
        public String cookieName;

        /**
         * <p>The HTML content or identifier of the custom queuing page. This parameter is valid only when <code>WaitingRoomType</code> is set to <code>custom</code>. The content must be URL-encoded.</p>
         */
        @NameInMap("CustomPageHtml")
        public String customPageHtml;

        /**
         * <p>The description of the waiting room.</p>
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
         * <p>on</p>
         */
        @NameInMap("DisableSessionRenewalEnable")
        public String disableSessionRenewalEnable;

        /**
         * <p>Indicates whether the waiting room is enabled. Valid values:</p>
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
         * <p>The hostname and path.</p>
         */
        @NameInMap("HostNameAndPath")
        public java.util.List<ListWaitingRoomsResponseBodyWaitingRoomsHostNameAndPath> hostNameAndPath;

        /**
         * <p>Indicates whether JSON response is enabled. If you set this parameter to on, a JSON body is returned for requests to the waiting room with the header Accept: application/json. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
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
         * <p>The name of the waiting room.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The maximum number of new users per minute.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("NewUsersPerMinute")
        public String newUsersPerMinute;

        /**
         * <p>Indicates whether all requests must be queued. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("QueueAllEnable")
        public String queueAllEnable;

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
         * <p>random</p>
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
         * <p>The maximum duration for which a session remains valid after a user leaves the origin. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("SessionDuration")
        public String sessionDuration;

        /**
         * <p>The maximum number of active users.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("TotalActiveUsers")
        public String totalActiveUsers;

        /**
         * <p>The unique ID of the waiting room.</p>
         * 
         * <strong>example:</strong>
         * <p>6a51d5bc6460887abd1291dc7d4d****</p>
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
         * <p>default</p>
         */
        @NameInMap("WaitingRoomType")
        public String waitingRoomType;

        public static ListWaitingRoomsResponseBodyWaitingRooms build(java.util.Map<String, ?> map) throws Exception {
            ListWaitingRoomsResponseBodyWaitingRooms self = new ListWaitingRoomsResponseBodyWaitingRooms();
            return TeaModel.build(map, self);
        }

        public ListWaitingRoomsResponseBodyWaitingRooms setCookieName(String cookieName) {
            this.cookieName = cookieName;
            return this;
        }
        public String getCookieName() {
            return this.cookieName;
        }

        public ListWaitingRoomsResponseBodyWaitingRooms setCustomPageHtml(String customPageHtml) {
            this.customPageHtml = customPageHtml;
            return this;
        }
        public String getCustomPageHtml() {
            return this.customPageHtml;
        }

        public ListWaitingRoomsResponseBodyWaitingRooms setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListWaitingRoomsResponseBodyWaitingRooms setDisableSessionRenewalEnable(String disableSessionRenewalEnable) {
            this.disableSessionRenewalEnable = disableSessionRenewalEnable;
            return this;
        }
        public String getDisableSessionRenewalEnable() {
            return this.disableSessionRenewalEnable;
        }

        public ListWaitingRoomsResponseBodyWaitingRooms setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public ListWaitingRoomsResponseBodyWaitingRooms setHostNameAndPath(java.util.List<ListWaitingRoomsResponseBodyWaitingRoomsHostNameAndPath> hostNameAndPath) {
            this.hostNameAndPath = hostNameAndPath;
            return this;
        }
        public java.util.List<ListWaitingRoomsResponseBodyWaitingRoomsHostNameAndPath> getHostNameAndPath() {
            return this.hostNameAndPath;
        }

        public ListWaitingRoomsResponseBodyWaitingRooms setJsonResponseEnable(String jsonResponseEnable) {
            this.jsonResponseEnable = jsonResponseEnable;
            return this;
        }
        public String getJsonResponseEnable() {
            return this.jsonResponseEnable;
        }

        public ListWaitingRoomsResponseBodyWaitingRooms setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ListWaitingRoomsResponseBodyWaitingRooms setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWaitingRoomsResponseBodyWaitingRooms setNewUsersPerMinute(String newUsersPerMinute) {
            this.newUsersPerMinute = newUsersPerMinute;
            return this;
        }
        public String getNewUsersPerMinute() {
            return this.newUsersPerMinute;
        }

        public ListWaitingRoomsResponseBodyWaitingRooms setQueueAllEnable(String queueAllEnable) {
            this.queueAllEnable = queueAllEnable;
            return this;
        }
        public String getQueueAllEnable() {
            return this.queueAllEnable;
        }

        public ListWaitingRoomsResponseBodyWaitingRooms setQueuingMethod(String queuingMethod) {
            this.queuingMethod = queuingMethod;
            return this;
        }
        public String getQueuingMethod() {
            return this.queuingMethod;
        }

        public ListWaitingRoomsResponseBodyWaitingRooms setQueuingStatusCode(String queuingStatusCode) {
            this.queuingStatusCode = queuingStatusCode;
            return this;
        }
        public String getQueuingStatusCode() {
            return this.queuingStatusCode;
        }

        public ListWaitingRoomsResponseBodyWaitingRooms setSessionDuration(String sessionDuration) {
            this.sessionDuration = sessionDuration;
            return this;
        }
        public String getSessionDuration() {
            return this.sessionDuration;
        }

        public ListWaitingRoomsResponseBodyWaitingRooms setTotalActiveUsers(String totalActiveUsers) {
            this.totalActiveUsers = totalActiveUsers;
            return this;
        }
        public String getTotalActiveUsers() {
            return this.totalActiveUsers;
        }

        public ListWaitingRoomsResponseBodyWaitingRooms setWaitingRoomId(String waitingRoomId) {
            this.waitingRoomId = waitingRoomId;
            return this;
        }
        public String getWaitingRoomId() {
            return this.waitingRoomId;
        }

        public ListWaitingRoomsResponseBodyWaitingRooms setWaitingRoomType(String waitingRoomType) {
            this.waitingRoomType = waitingRoomType;
            return this;
        }
        public String getWaitingRoomType() {
            return this.waitingRoomType;
        }

    }

}
