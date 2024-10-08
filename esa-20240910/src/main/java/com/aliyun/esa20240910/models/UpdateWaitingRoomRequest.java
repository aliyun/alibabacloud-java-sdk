// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateWaitingRoomRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>__aliwaitingroom_example</p>
     */
    @NameInMap("CookieName")
    public String cookieName;

    /**
     * <strong>example:</strong>
     * <p>Hello%20world!</p>
     */
    @NameInMap("CustomPageHtml")
    public String customPageHtml;

    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("DisableSessionRenewalEnable")
    public String disableSessionRenewalEnable;

    /**
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Enable")
    public String enable;

    @NameInMap("HostNameAndPath")
    public java.util.List<UpdateWaitingRoomRequestHostNameAndPath> hostNameAndPath;

    /**
     * <strong>example:</strong>
     * <p>on</p>
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
     * <p>200</p>
     */
    @NameInMap("NewUsersPerMinute")
    public String newUsersPerMinute;

    /**
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("QueueAllEnable")
    public String queueAllEnable;

    /**
     * <strong>example:</strong>
     * <p>random</p>
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
     * <p>5</p>
     */
    @NameInMap("SessionDuration")
    public String sessionDuration;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7096621098****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("TotalActiveUsers")
    public String totalActiveUsers;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6a51d5bc6460887abd129****</p>
     */
    @NameInMap("WaitingRoomId")
    public String waitingRoomId;

    /**
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
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>/test</p>
         */
        @NameInMap("Path")
        public String path;

        /**
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
