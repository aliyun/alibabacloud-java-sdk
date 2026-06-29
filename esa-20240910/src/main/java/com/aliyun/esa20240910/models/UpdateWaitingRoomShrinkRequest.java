// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateWaitingRoomShrinkRequest extends TeaModel {
    /**
     * <p>The custom cookie name.</p>
     * 
     * <strong>example:</strong>
     * <p>__aliwaitingroom_example</p>
     */
    @NameInMap("CookieName")
    public String cookieName;

    /**
     * <p>The custom waiting room page content. This parameter is required when the waiting room type is set to custom. The content must be in Base64 encoding.</p>
     * 
     * <strong>example:</strong>
     * <p>SGVsbG8gd29ybGQ=</p>
     */
    @NameInMap("CustomPageHtml")
    public String customPageHtml;

    /**
     * <p>The description of the waiting room.</p>
     * 
     * <strong>example:</strong>
     * <p>特别活动排队页面</p>
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
     * <p>The status of the waiting room. Valid values:</p>
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
    public String hostNameAndPathShrink;

    /**
     * <p>Specifies whether to enable JSON response. If enabled, requests with an Accept header containing &quot;application/json&quot; return JSON data. Valid values:</p>
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
     * <p>The language of the waiting room page. This parameter is required when the waiting room type is set to default. Valid values:</p>
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
     * <p>The name of the waiting room.</p>
     * 
     * <strong>example:</strong>
     * <p>节假日促销等候室</p>
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
     * <li><strong>random</strong>: random.</li>
     * <li><strong>fifo</strong>: first-in, first-out.</li>
     * <li><strong>passthrough</strong>: passthrough.</li>
     * <li><strong>reject-all</strong>: reject all.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>random</p>
     */
    @NameInMap("QueuingMethod")
    public String queuingMethod;

    /**
     * <p>The HTTP status code returned by the waiting room. Valid values:</p>
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
     * <p>The session duration in minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("SessionDuration")
    public String sessionDuration;

    /**
     * <p>The site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7096621098****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The total number of active users.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("TotalActiveUsers")
    public String totalActiveUsers;

    /**
     * <p>The waiting room ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850279.html">ListWaitingRooms</a> operation.</p>
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
     * <li><strong>default</strong>: default type.</li>
     * <li><strong>custom</strong>: custom type.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("WaitingRoomType")
    public String waitingRoomType;

    public static UpdateWaitingRoomShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWaitingRoomShrinkRequest self = new UpdateWaitingRoomShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWaitingRoomShrinkRequest setCookieName(String cookieName) {
        this.cookieName = cookieName;
        return this;
    }
    public String getCookieName() {
        return this.cookieName;
    }

    public UpdateWaitingRoomShrinkRequest setCustomPageHtml(String customPageHtml) {
        this.customPageHtml = customPageHtml;
        return this;
    }
    public String getCustomPageHtml() {
        return this.customPageHtml;
    }

    public UpdateWaitingRoomShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateWaitingRoomShrinkRequest setDisableSessionRenewalEnable(String disableSessionRenewalEnable) {
        this.disableSessionRenewalEnable = disableSessionRenewalEnable;
        return this;
    }
    public String getDisableSessionRenewalEnable() {
        return this.disableSessionRenewalEnable;
    }

    public UpdateWaitingRoomShrinkRequest setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public UpdateWaitingRoomShrinkRequest setHostNameAndPathShrink(String hostNameAndPathShrink) {
        this.hostNameAndPathShrink = hostNameAndPathShrink;
        return this;
    }
    public String getHostNameAndPathShrink() {
        return this.hostNameAndPathShrink;
    }

    public UpdateWaitingRoomShrinkRequest setJsonResponseEnable(String jsonResponseEnable) {
        this.jsonResponseEnable = jsonResponseEnable;
        return this;
    }
    public String getJsonResponseEnable() {
        return this.jsonResponseEnable;
    }

    public UpdateWaitingRoomShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public UpdateWaitingRoomShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateWaitingRoomShrinkRequest setNewUsersPerMinute(String newUsersPerMinute) {
        this.newUsersPerMinute = newUsersPerMinute;
        return this;
    }
    public String getNewUsersPerMinute() {
        return this.newUsersPerMinute;
    }

    public UpdateWaitingRoomShrinkRequest setQueueAllEnable(String queueAllEnable) {
        this.queueAllEnable = queueAllEnable;
        return this;
    }
    public String getQueueAllEnable() {
        return this.queueAllEnable;
    }

    public UpdateWaitingRoomShrinkRequest setQueuingMethod(String queuingMethod) {
        this.queuingMethod = queuingMethod;
        return this;
    }
    public String getQueuingMethod() {
        return this.queuingMethod;
    }

    public UpdateWaitingRoomShrinkRequest setQueuingStatusCode(String queuingStatusCode) {
        this.queuingStatusCode = queuingStatusCode;
        return this;
    }
    public String getQueuingStatusCode() {
        return this.queuingStatusCode;
    }

    public UpdateWaitingRoomShrinkRequest setSessionDuration(String sessionDuration) {
        this.sessionDuration = sessionDuration;
        return this;
    }
    public String getSessionDuration() {
        return this.sessionDuration;
    }

    public UpdateWaitingRoomShrinkRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public UpdateWaitingRoomShrinkRequest setTotalActiveUsers(String totalActiveUsers) {
        this.totalActiveUsers = totalActiveUsers;
        return this;
    }
    public String getTotalActiveUsers() {
        return this.totalActiveUsers;
    }

    public UpdateWaitingRoomShrinkRequest setWaitingRoomId(String waitingRoomId) {
        this.waitingRoomId = waitingRoomId;
        return this;
    }
    public String getWaitingRoomId() {
        return this.waitingRoomId;
    }

    public UpdateWaitingRoomShrinkRequest setWaitingRoomType(String waitingRoomType) {
        this.waitingRoomType = waitingRoomType;
        return this;
    }
    public String getWaitingRoomType() {
        return this.waitingRoomType;
    }

}
