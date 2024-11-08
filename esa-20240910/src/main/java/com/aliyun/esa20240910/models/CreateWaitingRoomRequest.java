// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateWaitingRoomRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CookieName")
    public String cookieName;

    @NameInMap("CustomPageHtml")
    public String customPageHtml;

    @NameInMap("Description")
    public String description;

    @NameInMap("DisableSessionRenewalEnable")
    public String disableSessionRenewalEnable;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("HostNameAndPath")
    public java.util.List<CreateWaitingRoomRequestHostNameAndPath> hostNameAndPath;

    @NameInMap("JsonResponseEnable")
    public String jsonResponseEnable;

    @NameInMap("Language")
    public String language;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NewUsersPerMinute")
    public String newUsersPerMinute;

    @NameInMap("QueueAllEnable")
    public String queueAllEnable;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("QueuingMethod")
    public String queuingMethod;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("QueuingStatusCode")
    public String queuingStatusCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SessionDuration")
    public String sessionDuration;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TotalActiveUsers")
    public String totalActiveUsers;

    /**
     * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>This parameter is required.</p>
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
