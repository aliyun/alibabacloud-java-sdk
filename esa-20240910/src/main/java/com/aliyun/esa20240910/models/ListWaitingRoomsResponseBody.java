// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWaitingRoomsResponseBody extends TeaModel {
    /**
     * <p>The request ID, which is used to trace API calls.</p>
     * 
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-A198-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of waiting rooms.</p>
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
         * <p>The custom cookie name.</p>
         * 
         * <strong>example:</strong>
         * <p>__aliwaitingroom_example</p>
         */
        @NameInMap("CookieName")
        public String cookieName;

        /**
         * <p>The HTML content or identifier of the custom queuing page. This parameter is valid only when WaitingRoomType is set to custom. The content must be URL-encoded.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom HTML content</p>
         */
        @NameInMap("CustomPageHtml")
        public String customPageHtml;

        /**
         * <p>The waiting room description.</p>
         * 
         * <strong>example:</strong>
         * <p>Test waiting room</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Specifies whether to disable session renewal. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: Enabled.</li>
         * <li><strong>off</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("DisableSessionRenewalEnable")
        public String disableSessionRenewalEnable;

        /**
         * <p>The enabled status. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: Enabled.</li>
         * <li><strong>off</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Enable")
        public String enable;

        /**
         * <p>The hostname and path configurations.</p>
         */
        @NameInMap("HostNameAndPath")
        public java.util.List<ListWaitingRoomsResponseBodyWaitingRoomsHostNameAndPath> hostNameAndPath;

        /**
         * <p>Specifies whether to enable JSON response. When enabled, requests with an Accept header containing &quot;application/json&quot; return JSON data. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: Enabled.</li>
         * <li><strong>off</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("JsonResponseEnable")
        public String jsonResponseEnable;

        /**
         * <p>The language of the waiting room page. This parameter is required when the waiting room type is default. Valid values:</p>
         * <ul>
         * <li><strong>enus</strong>: English.</li>
         * <li><strong>zhcn</strong>: Simplified Chinese.</li>
         * <li><strong>zhhk</strong>: Traditional Chinese.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zhcn</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The waiting room name.</p>
         * 
         * <strong>example:</strong>
         * <p>Test waiting room</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The number of new users per minute.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("NewUsersPerMinute")
        public String newUsersPerMinute;

        /**
         * <p>Specifies whether to queue all visitors. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: Enabled.</li>
         * <li><strong>off</strong>: Disabled.</li>
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
         * <li><strong>random</strong>: Random.</li>
         * <li><strong>fifo</strong>: First in, first out.</li>
         * <li><strong>passthrough</strong>: Passthrough.</li>
         * <li><strong>reject-all</strong>: Reject all.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>random</p>
         */
        @NameInMap("QueuingMethod")
        public String queuingMethod;

        /**
         * <p>The waiting room status code. Valid values:</p>
         * <ul>
         * <li><strong>200</strong></li>
         * <li><strong>202</strong></li>
         * <li><strong>429</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("QueuingStatusCode")
        public String queuingStatusCode;

        /**
         * <p>The session duration, in minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("SessionDuration")
        public String sessionDuration;

        /**
         * <p>The total number of active users.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("TotalActiveUsers")
        public String totalActiveUsers;

        /**
         * <p>The waiting room ID, which uniquely identifies a waiting room.</p>
         * 
         * <strong>example:</strong>
         * <p>6a51d5bc6460887abd1291dc7d4d****</p>
         */
        @NameInMap("WaitingRoomId")
        public String waitingRoomId;

        /**
         * <p>The waiting room type. Valid values:</p>
         * <ul>
         * <li><strong>default</strong>: Default type.</li>
         * <li><strong>custom</strong>: Custom type.</li>
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
