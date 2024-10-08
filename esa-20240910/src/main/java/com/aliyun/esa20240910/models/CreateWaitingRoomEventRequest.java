// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateWaitingRoomEventRequest extends TeaModel {
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1719849600</p>
     */
    @NameInMap("EndTime")
    public String endTime;

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

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waitingroom_example</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("NewUsersPerMinute")
    public String newUsersPerMinute;

    /**
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("PreQueueEnable")
    public String preQueueEnable;

    /**
     * <strong>example:</strong>
     * <p>1719763200</p>
     */
    @NameInMap("PreQueueStartTime")
    public String preQueueStartTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>random</p>
     */
    @NameInMap("QueuingMethod")
    public String queuingMethod;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>202</p>
     */
    @NameInMap("QueuingStatusCode")
    public String queuingStatusCode;

    /**
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RandomPreQueueEnable")
    public String randomPreQueueEnable;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("SessionDuration")
    public String sessionDuration;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1719763200</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalActiveUsers")
    public String totalActiveUsers;

    /**
     * <strong>example:</strong>
     * <p>6a51d5bc6460887abd1291dc7d4db28b</p>
     */
    @NameInMap("WaitingRoomId")
    public String waitingRoomId;

    /**
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
