// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateWaitingRoomShrinkRequest extends TeaModel {
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
    public String hostNameAndPathShrink;

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

    public static CreateWaitingRoomShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWaitingRoomShrinkRequest self = new CreateWaitingRoomShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateWaitingRoomShrinkRequest setCookieName(String cookieName) {
        this.cookieName = cookieName;
        return this;
    }
    public String getCookieName() {
        return this.cookieName;
    }

    public CreateWaitingRoomShrinkRequest setCustomPageHtml(String customPageHtml) {
        this.customPageHtml = customPageHtml;
        return this;
    }
    public String getCustomPageHtml() {
        return this.customPageHtml;
    }

    public CreateWaitingRoomShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateWaitingRoomShrinkRequest setDisableSessionRenewalEnable(String disableSessionRenewalEnable) {
        this.disableSessionRenewalEnable = disableSessionRenewalEnable;
        return this;
    }
    public String getDisableSessionRenewalEnable() {
        return this.disableSessionRenewalEnable;
    }

    public CreateWaitingRoomShrinkRequest setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public CreateWaitingRoomShrinkRequest setHostNameAndPathShrink(String hostNameAndPathShrink) {
        this.hostNameAndPathShrink = hostNameAndPathShrink;
        return this;
    }
    public String getHostNameAndPathShrink() {
        return this.hostNameAndPathShrink;
    }

    public CreateWaitingRoomShrinkRequest setJsonResponseEnable(String jsonResponseEnable) {
        this.jsonResponseEnable = jsonResponseEnable;
        return this;
    }
    public String getJsonResponseEnable() {
        return this.jsonResponseEnable;
    }

    public CreateWaitingRoomShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CreateWaitingRoomShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateWaitingRoomShrinkRequest setNewUsersPerMinute(String newUsersPerMinute) {
        this.newUsersPerMinute = newUsersPerMinute;
        return this;
    }
    public String getNewUsersPerMinute() {
        return this.newUsersPerMinute;
    }

    public CreateWaitingRoomShrinkRequest setQueueAllEnable(String queueAllEnable) {
        this.queueAllEnable = queueAllEnable;
        return this;
    }
    public String getQueueAllEnable() {
        return this.queueAllEnable;
    }

    public CreateWaitingRoomShrinkRequest setQueuingMethod(String queuingMethod) {
        this.queuingMethod = queuingMethod;
        return this;
    }
    public String getQueuingMethod() {
        return this.queuingMethod;
    }

    public CreateWaitingRoomShrinkRequest setQueuingStatusCode(String queuingStatusCode) {
        this.queuingStatusCode = queuingStatusCode;
        return this;
    }
    public String getQueuingStatusCode() {
        return this.queuingStatusCode;
    }

    public CreateWaitingRoomShrinkRequest setSessionDuration(String sessionDuration) {
        this.sessionDuration = sessionDuration;
        return this;
    }
    public String getSessionDuration() {
        return this.sessionDuration;
    }

    public CreateWaitingRoomShrinkRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateWaitingRoomShrinkRequest setTotalActiveUsers(String totalActiveUsers) {
        this.totalActiveUsers = totalActiveUsers;
        return this;
    }
    public String getTotalActiveUsers() {
        return this.totalActiveUsers;
    }

    public CreateWaitingRoomShrinkRequest setWaitingRoomType(String waitingRoomType) {
        this.waitingRoomType = waitingRoomType;
        return this;
    }
    public String getWaitingRoomType() {
        return this.waitingRoomType;
    }

}
