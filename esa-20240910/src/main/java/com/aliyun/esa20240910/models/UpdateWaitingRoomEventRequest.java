// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateWaitingRoomEventRequest extends TeaModel {
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
     * <p><a href="http://yywyyw.com">http://yywyyw.com</a></p>
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
     * <p>off</p>
     */
    @NameInMap("DisableSessionRenewalEnable")
    public String disableSessionRenewalEnable;

    /**
     * <p>The enabling status. Valid values:</p>
     * <ul>
     * <li><p><strong>on</strong>: Enables the waiting room event.</p>
     * </li>
     * <li><p><strong>off</strong>: Disables the waiting room event.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <p>The timestamp of the event end time.</p>
     * 
     * <strong>example:</strong>
     * <p>1719849600</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Specifies whether to enable JSON response. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: Enabled.</li>
     * <li><strong>off</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("JsonResponseEnable")
    public String jsonResponseEnable;

    /**
     * <p>The default language setting. Valid values:</p>
     * <ul>
     * <li><strong>enus</strong>: English.</li>
     * <li><strong>zhcn</strong>: Simplified Chinese.</li>
     * <li><strong>zhhk</strong>: Traditional Chinese.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enus</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The name of the waiting room event.</p>
     * 
     * <strong>example:</strong>
     * <p>测试事件2</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of new users per minute.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("NewUsersPerMinute")
    public String newUsersPerMinute;

    /**
     * <p>Specifies whether to enable pre-queuing. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: Enabled.</li>
     * <li><strong>off</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("PreQueueEnable")
    public String preQueueEnable;

    /**
     * <p>The timestamp of the pre-queuing start time.</p>
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
     * 
     * <strong>example:</strong>
     * <p>fifo</p>
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
     * <p>Specifies whether to enable random pre-queuing. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: Enabled.</li>
     * <li><strong>off</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RandomPreQueueEnable")
    public String randomPreQueueEnable;

    /**
     * <p>The user session duration, in minutes.</p>
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
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The timestamp of the event start time.</p>
     * 
     * <strong>example:</strong>
     * <p>1719763200</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The total number of active users.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("TotalActiveUsers")
    public String totalActiveUsers;

    /**
     * <p>The waiting room event ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850279.html">ListWaitingRoomEvents</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>89677721098****</p>
     */
    @NameInMap("WaitingRoomEventId")
    public Long waitingRoomEventId;

    /**
     * <p>The type of the waiting room. Valid values:</p>
     * <ul>
     * <li><strong>default</strong>: default type.</li>
     * <li><strong>custom</strong>: custom type.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("WaitingRoomType")
    public String waitingRoomType;

    public static UpdateWaitingRoomEventRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWaitingRoomEventRequest self = new UpdateWaitingRoomEventRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWaitingRoomEventRequest setCustomPageHtml(String customPageHtml) {
        this.customPageHtml = customPageHtml;
        return this;
    }
    public String getCustomPageHtml() {
        return this.customPageHtml;
    }

    public UpdateWaitingRoomEventRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateWaitingRoomEventRequest setDisableSessionRenewalEnable(String disableSessionRenewalEnable) {
        this.disableSessionRenewalEnable = disableSessionRenewalEnable;
        return this;
    }
    public String getDisableSessionRenewalEnable() {
        return this.disableSessionRenewalEnable;
    }

    public UpdateWaitingRoomEventRequest setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public UpdateWaitingRoomEventRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public UpdateWaitingRoomEventRequest setJsonResponseEnable(String jsonResponseEnable) {
        this.jsonResponseEnable = jsonResponseEnable;
        return this;
    }
    public String getJsonResponseEnable() {
        return this.jsonResponseEnable;
    }

    public UpdateWaitingRoomEventRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public UpdateWaitingRoomEventRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateWaitingRoomEventRequest setNewUsersPerMinute(String newUsersPerMinute) {
        this.newUsersPerMinute = newUsersPerMinute;
        return this;
    }
    public String getNewUsersPerMinute() {
        return this.newUsersPerMinute;
    }

    public UpdateWaitingRoomEventRequest setPreQueueEnable(String preQueueEnable) {
        this.preQueueEnable = preQueueEnable;
        return this;
    }
    public String getPreQueueEnable() {
        return this.preQueueEnable;
    }

    public UpdateWaitingRoomEventRequest setPreQueueStartTime(String preQueueStartTime) {
        this.preQueueStartTime = preQueueStartTime;
        return this;
    }
    public String getPreQueueStartTime() {
        return this.preQueueStartTime;
    }

    public UpdateWaitingRoomEventRequest setQueuingMethod(String queuingMethod) {
        this.queuingMethod = queuingMethod;
        return this;
    }
    public String getQueuingMethod() {
        return this.queuingMethod;
    }

    public UpdateWaitingRoomEventRequest setQueuingStatusCode(String queuingStatusCode) {
        this.queuingStatusCode = queuingStatusCode;
        return this;
    }
    public String getQueuingStatusCode() {
        return this.queuingStatusCode;
    }

    public UpdateWaitingRoomEventRequest setRandomPreQueueEnable(String randomPreQueueEnable) {
        this.randomPreQueueEnable = randomPreQueueEnable;
        return this;
    }
    public String getRandomPreQueueEnable() {
        return this.randomPreQueueEnable;
    }

    public UpdateWaitingRoomEventRequest setSessionDuration(String sessionDuration) {
        this.sessionDuration = sessionDuration;
        return this;
    }
    public String getSessionDuration() {
        return this.sessionDuration;
    }

    public UpdateWaitingRoomEventRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public UpdateWaitingRoomEventRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public UpdateWaitingRoomEventRequest setTotalActiveUsers(String totalActiveUsers) {
        this.totalActiveUsers = totalActiveUsers;
        return this;
    }
    public String getTotalActiveUsers() {
        return this.totalActiveUsers;
    }

    public UpdateWaitingRoomEventRequest setWaitingRoomEventId(Long waitingRoomEventId) {
        this.waitingRoomEventId = waitingRoomEventId;
        return this;
    }
    public Long getWaitingRoomEventId() {
        return this.waitingRoomEventId;
    }

    public UpdateWaitingRoomEventRequest setWaitingRoomType(String waitingRoomType) {
        this.waitingRoomType = waitingRoomType;
        return this;
    }
    public String getWaitingRoomType() {
        return this.waitingRoomType;
    }

}
