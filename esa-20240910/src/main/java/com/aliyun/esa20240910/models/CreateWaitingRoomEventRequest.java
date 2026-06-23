// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateWaitingRoomEventRequest extends TeaModel {
    /**
     * <p>The custom waiting room page content. This parameter is required when the waiting room type is set to custom. The content must use Base64 encoding.</p>
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
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to disable session renewal. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: enabled.</li>
     * <li><strong>off</strong>: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("DisableSessionRenewalEnable")
    public String disableSessionRenewalEnable;

    /**
     * <p>The waiting room switch. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: enabled.</li>
     * <li><strong>off</strong>: disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <p>The event end timestamp, such as 1705044735.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1719849600</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Specifies whether to enable JSON response. When enabled, requests with an Accept header containing &quot;application/json&quot; return JSON data. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: enabled.</li>
     * <li><strong>off</strong>: disabled.</li>
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
     * <p>The name of the waiting room event.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waitingroom_example</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of new users per minute.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("NewUsersPerMinute")
    public String newUsersPerMinute;

    /**
     * <p>Specifies whether to enable pre-queuing. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: enabled.</li>
     * <li><strong>off</strong>: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("PreQueueEnable")
    public String preQueueEnable;

    /**
     * <p>The pre-queuing start timestamp, which must be at least 5 minutes earlier than the event start timestamp, such as 1705044735.</p>
     * 
     * <strong>example:</strong>
     * <p>1719763200</p>
     */
    @NameInMap("PreQueueStartTime")
    public String preQueueStartTime;

    /**
     * <p>The queuing method. Valid values:</p>
     * <ul>
     * <li><strong>random</strong>: random.</li>
     * <li><strong>fifo</strong>: first-in, first-out.</li>
     * <li><strong>passthrough</strong>: passthrough.</li>
     * <li><strong>reject-all</strong>: reject all.</li>
     * </ul>
     * <p>This parameter is required.</p>
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
     * <li><strong>429</strong>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>202</p>
     */
    @NameInMap("QueuingStatusCode")
    public String queuingStatusCode;

    /**
     * <p>Specifies whether to enable random pre-queuing. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: enabled.</li>
     * <li><strong>off</strong>: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RandomPreQueueEnable")
    public String randomPreQueueEnable;

    /**
     * <p>The session duration, in minutes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("SessionDuration")
    public String sessionDuration;

    /**
     * <p>The site ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The event start timestamp, such as 1705044735.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1719763200</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The total number of active users.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalActiveUsers")
    public String totalActiveUsers;

    /**
     * <p>The waiting room ID. You can call the <a href="https://help.aliyun.com/document_detail/2850279.html">ListWaitingRooms</a> operation to obtain the waiting room ID. The waiting room must belong to the site specified by SiteId.</p>
     * 
     * <strong>example:</strong>
     * <p>6a51d5bc6460887abd1291dc7d4db28b</p>
     */
    @NameInMap("WaitingRoomId")
    public String waitingRoomId;

    /**
     * <p>The type of the waiting room. Valid values:</p>
     * <ul>
     * <li><strong>default</strong>: default type.</li>
     * <li><strong>custom</strong>: custom type.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("WaitingRoomType")
    public String waitingRoomType;

    public static CreateWaitingRoomEventRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWaitingRoomEventRequest self = new CreateWaitingRoomEventRequest();
        return TeaModel.build(map, self);
    }

    public CreateWaitingRoomEventRequest setCustomPageHtml(String customPageHtml) {
        this.customPageHtml = customPageHtml;
        return this;
    }
    public String getCustomPageHtml() {
        return this.customPageHtml;
    }

    public CreateWaitingRoomEventRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateWaitingRoomEventRequest setDisableSessionRenewalEnable(String disableSessionRenewalEnable) {
        this.disableSessionRenewalEnable = disableSessionRenewalEnable;
        return this;
    }
    public String getDisableSessionRenewalEnable() {
        return this.disableSessionRenewalEnable;
    }

    public CreateWaitingRoomEventRequest setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public CreateWaitingRoomEventRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateWaitingRoomEventRequest setJsonResponseEnable(String jsonResponseEnable) {
        this.jsonResponseEnable = jsonResponseEnable;
        return this;
    }
    public String getJsonResponseEnable() {
        return this.jsonResponseEnable;
    }

    public CreateWaitingRoomEventRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CreateWaitingRoomEventRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateWaitingRoomEventRequest setNewUsersPerMinute(String newUsersPerMinute) {
        this.newUsersPerMinute = newUsersPerMinute;
        return this;
    }
    public String getNewUsersPerMinute() {
        return this.newUsersPerMinute;
    }

    public CreateWaitingRoomEventRequest setPreQueueEnable(String preQueueEnable) {
        this.preQueueEnable = preQueueEnable;
        return this;
    }
    public String getPreQueueEnable() {
        return this.preQueueEnable;
    }

    public CreateWaitingRoomEventRequest setPreQueueStartTime(String preQueueStartTime) {
        this.preQueueStartTime = preQueueStartTime;
        return this;
    }
    public String getPreQueueStartTime() {
        return this.preQueueStartTime;
    }

    public CreateWaitingRoomEventRequest setQueuingMethod(String queuingMethod) {
        this.queuingMethod = queuingMethod;
        return this;
    }
    public String getQueuingMethod() {
        return this.queuingMethod;
    }

    public CreateWaitingRoomEventRequest setQueuingStatusCode(String queuingStatusCode) {
        this.queuingStatusCode = queuingStatusCode;
        return this;
    }
    public String getQueuingStatusCode() {
        return this.queuingStatusCode;
    }

    public CreateWaitingRoomEventRequest setRandomPreQueueEnable(String randomPreQueueEnable) {
        this.randomPreQueueEnable = randomPreQueueEnable;
        return this;
    }
    public String getRandomPreQueueEnable() {
        return this.randomPreQueueEnable;
    }

    public CreateWaitingRoomEventRequest setSessionDuration(String sessionDuration) {
        this.sessionDuration = sessionDuration;
        return this;
    }
    public String getSessionDuration() {
        return this.sessionDuration;
    }

    public CreateWaitingRoomEventRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateWaitingRoomEventRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateWaitingRoomEventRequest setTotalActiveUsers(String totalActiveUsers) {
        this.totalActiveUsers = totalActiveUsers;
        return this;
    }
    public String getTotalActiveUsers() {
        return this.totalActiveUsers;
    }

    public CreateWaitingRoomEventRequest setWaitingRoomId(String waitingRoomId) {
        this.waitingRoomId = waitingRoomId;
        return this;
    }
    public String getWaitingRoomId() {
        return this.waitingRoomId;
    }

    public CreateWaitingRoomEventRequest setWaitingRoomType(String waitingRoomType) {
        this.waitingRoomType = waitingRoomType;
        return this;
    }
    public String getWaitingRoomType() {
        return this.waitingRoomType;
    }

}
