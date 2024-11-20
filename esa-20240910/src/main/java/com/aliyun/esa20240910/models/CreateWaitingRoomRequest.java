// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateWaitingRoomRequest extends TeaModel {
    /**
     * <p>The name of the custom cookie.</p>
     * <p>This parameter is required.</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <p>The hostname and path.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("HostNameAndPath")
    public java.util.List<CreateWaitingRoomRequestHostNameAndPath> hostNameAndPath;

    /**
     * <p>Specifies whether to enable JSON response. If you set this parameter to on, a JSON body is returned for requests to the waiting room with the header Accept: application/json. Valid values:</p>
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
     * <p>enus</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The name of the waiting room.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waitingroom_example</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The maximum number of new users per minute.</p>
     * <p>This parameter is required.</p>
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
     * <p>This parameter is required.</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("QueuingStatusCode")
    public String queuingStatusCode;

    /**
     * <p>The maximum duration for which a session remains valid after a user leaves the origin. Unit: minutes.</p>
     * <p>This parameter is required.</p>
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
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The maximum number of active users.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("TotalActiveUsers")
    public String totalActiveUsers;

    /**
     * <p>The type of the waiting room. Valid values:</p>
     * <ul>
     * <li>default</li>
     * <li>custom</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("WaitingRoomType")
    public String waitingRoomType;

    public static CreateWaitingRoomRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWaitingRoomRequest self = new CreateWaitingRoomRequest();
        return TeaModel.build(map, self);
    }

    public CreateWaitingRoomRequest setCookieName(String cookieName) {
        this.cookieName = cookieName;
        return this;
    }
    public String getCookieName() {
        return this.cookieName;
    }

    public CreateWaitingRoomRequest setCustomPageHtml(String customPageHtml) {
        this.customPageHtml = customPageHtml;
        return this;
    }
    public String getCustomPageHtml() {
        return this.customPageHtml;
    }

    public CreateWaitingRoomRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateWaitingRoomRequest setDisableSessionRenewalEnable(String disableSessionRenewalEnable) {
        this.disableSessionRenewalEnable = disableSessionRenewalEnable;
        return this;
    }
    public String getDisableSessionRenewalEnable() {
        return this.disableSessionRenewalEnable;
    }

    public CreateWaitingRoomRequest setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public CreateWaitingRoomRequest setHostNameAndPath(java.util.List<CreateWaitingRoomRequestHostNameAndPath> hostNameAndPath) {
        this.hostNameAndPath = hostNameAndPath;
        return this;
    }
    public java.util.List<CreateWaitingRoomRequestHostNameAndPath> getHostNameAndPath() {
        return this.hostNameAndPath;
    }

    public CreateWaitingRoomRequest setJsonResponseEnable(String jsonResponseEnable) {
        this.jsonResponseEnable = jsonResponseEnable;
        return this;
    }
    public String getJsonResponseEnable() {
        return this.jsonResponseEnable;
    }

    public CreateWaitingRoomRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CreateWaitingRoomRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateWaitingRoomRequest setNewUsersPerMinute(String newUsersPerMinute) {
        this.newUsersPerMinute = newUsersPerMinute;
        return this;
    }
    public String getNewUsersPerMinute() {
        return this.newUsersPerMinute;
    }

    public CreateWaitingRoomRequest setQueueAllEnable(String queueAllEnable) {
        this.queueAllEnable = queueAllEnable;
        return this;
    }
    public String getQueueAllEnable() {
        return this.queueAllEnable;
    }

    public CreateWaitingRoomRequest setQueuingMethod(String queuingMethod) {
        this.queuingMethod = queuingMethod;
        return this;
    }
    public String getQueuingMethod() {
        return this.queuingMethod;
    }

    public CreateWaitingRoomRequest setQueuingStatusCode(String queuingStatusCode) {
        this.queuingStatusCode = queuingStatusCode;
        return this;
    }
    public String getQueuingStatusCode() {
        return this.queuingStatusCode;
    }

    public CreateWaitingRoomRequest setSessionDuration(String sessionDuration) {
        this.sessionDuration = sessionDuration;
        return this;
    }
    public String getSessionDuration() {
        return this.sessionDuration;
    }

    public CreateWaitingRoomRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateWaitingRoomRequest setTotalActiveUsers(String totalActiveUsers) {
        this.totalActiveUsers = totalActiveUsers;
        return this;
    }
    public String getTotalActiveUsers() {
        return this.totalActiveUsers;
    }

    public CreateWaitingRoomRequest setWaitingRoomType(String waitingRoomType) {
        this.waitingRoomType = waitingRoomType;
        return this;
    }
    public String getWaitingRoomType() {
        return this.waitingRoomType;
    }

    public static class CreateWaitingRoomRequestHostNameAndPath extends TeaModel {
        /**
         * <p>The domain name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The path.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/test</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The subdomain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test.</p>
         */
        @NameInMap("Subdomain")
        public String subdomain;

        public static CreateWaitingRoomRequestHostNameAndPath build(java.util.Map<String, ?> map) throws Exception {
            CreateWaitingRoomRequestHostNameAndPath self = new CreateWaitingRoomRequestHostNameAndPath();
            return TeaModel.build(map, self);
        }

        public CreateWaitingRoomRequestHostNameAndPath setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CreateWaitingRoomRequestHostNameAndPath setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateWaitingRoomRequestHostNameAndPath setSubdomain(String subdomain) {
            this.subdomain = subdomain;
            return this;
        }
        public String getSubdomain() {
            return this.subdomain;
        }

    }

}
