// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateWaitingRoomRequest extends TeaModel {
    /**
     * <p>The name of the custom cookie.</p>
     * 
     * <strong>example:</strong>
     * <p>__aliwaitingroom_example</p>
     */
    @NameInMap("CookieName")
    public String cookieName;

    /**
     * <p>The content of the custom waiting room page. You must specify this parameter if you set WaitingRoomType to custom. The content must be Base64-encoded.</p>
     * 
     * <strong>example:</strong>
     * <p>Hello%20world!</p>
     */
    @NameInMap("CustomPageHtml")
    public String customPageHtml;

    /**
     * <p>The description of the waiting room.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to disable session renewal. Valid values:</p>
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
     * <p>Specifies whether to enable the waiting room. Valid values:</p>
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
    public java.util.List<UpdateWaitingRoomRequestHostNameAndPath> hostNameAndPath;

    /**
     * <p>Specifies whether to enable JSON response. If JSON response is enabled, a JSON body is returned for requests to the waiting room with the header Accept: application/json. Valid values:</p>
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
     * <p>The language of the waiting room page. You must specify this parameter if you set WaitingRoomType to default. Valid values:</p>
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
     * <p>Specifies whether to queue all requests. Valid values:</p>
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
     * <p>5</p>
     */
    @NameInMap("SessionDuration")
    public String sessionDuration;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7096621098****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The maximum number of active users.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("TotalActiveUsers")
    public String totalActiveUsers;

    /**
     * <p>The ID of the waiting room, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850279.html">ListWaitingRooms</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6a51d5bc6460887abd129****</p>
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

    public static UpdateWaitingRoomRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWaitingRoomRequest self = new UpdateWaitingRoomRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWaitingRoomRequest setCookieName(String cookieName) {
        this.cookieName = cookieName;
        return this;
    }
    public String getCookieName() {
        return this.cookieName;
    }

    public UpdateWaitingRoomRequest setCustomPageHtml(String customPageHtml) {
        this.customPageHtml = customPageHtml;
        return this;
    }
    public String getCustomPageHtml() {
        return this.customPageHtml;
    }

    public UpdateWaitingRoomRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateWaitingRoomRequest setDisableSessionRenewalEnable(String disableSessionRenewalEnable) {
        this.disableSessionRenewalEnable = disableSessionRenewalEnable;
        return this;
    }
    public String getDisableSessionRenewalEnable() {
        return this.disableSessionRenewalEnable;
    }

    public UpdateWaitingRoomRequest setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public UpdateWaitingRoomRequest setHostNameAndPath(java.util.List<UpdateWaitingRoomRequestHostNameAndPath> hostNameAndPath) {
        this.hostNameAndPath = hostNameAndPath;
        return this;
    }
    public java.util.List<UpdateWaitingRoomRequestHostNameAndPath> getHostNameAndPath() {
        return this.hostNameAndPath;
    }

    public UpdateWaitingRoomRequest setJsonResponseEnable(String jsonResponseEnable) {
        this.jsonResponseEnable = jsonResponseEnable;
        return this;
    }
    public String getJsonResponseEnable() {
        return this.jsonResponseEnable;
    }

    public UpdateWaitingRoomRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public UpdateWaitingRoomRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateWaitingRoomRequest setNewUsersPerMinute(String newUsersPerMinute) {
        this.newUsersPerMinute = newUsersPerMinute;
        return this;
    }
    public String getNewUsersPerMinute() {
        return this.newUsersPerMinute;
    }

    public UpdateWaitingRoomRequest setQueueAllEnable(String queueAllEnable) {
        this.queueAllEnable = queueAllEnable;
        return this;
    }
    public String getQueueAllEnable() {
        return this.queueAllEnable;
    }

    public UpdateWaitingRoomRequest setQueuingMethod(String queuingMethod) {
        this.queuingMethod = queuingMethod;
        return this;
    }
    public String getQueuingMethod() {
        return this.queuingMethod;
    }

    public UpdateWaitingRoomRequest setQueuingStatusCode(String queuingStatusCode) {
        this.queuingStatusCode = queuingStatusCode;
        return this;
    }
    public String getQueuingStatusCode() {
        return this.queuingStatusCode;
    }

    public UpdateWaitingRoomRequest setSessionDuration(String sessionDuration) {
        this.sessionDuration = sessionDuration;
        return this;
    }
    public String getSessionDuration() {
        return this.sessionDuration;
    }

    public UpdateWaitingRoomRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public UpdateWaitingRoomRequest setTotalActiveUsers(String totalActiveUsers) {
        this.totalActiveUsers = totalActiveUsers;
        return this;
    }
    public String getTotalActiveUsers() {
        return this.totalActiveUsers;
    }

    public UpdateWaitingRoomRequest setWaitingRoomId(String waitingRoomId) {
        this.waitingRoomId = waitingRoomId;
        return this;
    }
    public String getWaitingRoomId() {
        return this.waitingRoomId;
    }

    public UpdateWaitingRoomRequest setWaitingRoomType(String waitingRoomType) {
        this.waitingRoomType = waitingRoomType;
        return this;
    }
    public String getWaitingRoomType() {
        return this.waitingRoomType;
    }

    public static class UpdateWaitingRoomRequestHostNameAndPath extends TeaModel {
        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The probe path.</p>
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

        public static UpdateWaitingRoomRequestHostNameAndPath build(java.util.Map<String, ?> map) throws Exception {
            UpdateWaitingRoomRequestHostNameAndPath self = new UpdateWaitingRoomRequestHostNameAndPath();
            return TeaModel.build(map, self);
        }

        public UpdateWaitingRoomRequestHostNameAndPath setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public UpdateWaitingRoomRequestHostNameAndPath setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateWaitingRoomRequestHostNameAndPath setSubdomain(String subdomain) {
            this.subdomain = subdomain;
            return this;
        }
        public String getSubdomain() {
            return this.subdomain;
        }

    }

}
