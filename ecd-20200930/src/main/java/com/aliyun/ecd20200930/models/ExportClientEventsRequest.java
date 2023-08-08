// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ExportClientEventsRequest extends TeaModel {
    /**
     * <p>The ID of the cloud desktop.</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The name of the cloud desktop.</p>
     */
    @NameInMap("DesktopName")
    public String desktopName;

    /**
     * <p>The end of the time range to query. Specify the time in the [ISO 8601](~~25696~~) standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>If you do not specify a value for this parameter, the current time is used.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the endpoint user.</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The type of event that you want to query. Valid values:</p>
     * <br>
     * <p>*   DESKTOP_CONNECT: The desktop session is established.</p>
     * <p>*   DESKTOP_DISCONNECT: The desktop session is disconnected.</p>
     * <p>*   DESKTOP_REBOOT: The cloud desktop is restarted.</p>
     * <p>*   CLIENT_AD_LOGIN: The AD user logs on to the client.</p>
     * <p>*   GET_CONNECTION_TICKET: The request to connect to the cloud desktop is sent.</p>
     * <p>*   DESKTOP_START: The cloud desktop is started.</p>
     * <p>*   DESKTOP_STOP: The cloud desktop is stopped.</p>
     * <br>
     * <p>If you do not specify a value for this parameter, events of all types are queried.</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The types of event.</p>
     */
    @NameInMap("EventTypes")
    public java.util.List<String> eventTypes;

    /**
     * <p>The language in which the cloud desktop is displayed in the console UI. You can export the list of cloud desktops in the specified language. Valid values:</p>
     * <br>
     * <p>*   `zh-CN`: Simplified Chinese</p>
     * <p>*   `en-GB`: English (United Kingdom)</p>
     * <br>
     * <p>Default value: `zh-CN`.</p>
     */
    @NameInMap("LangType")
    public String langType;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>*   Maximum value: 5000.</p>
     * <p>*   Default value: 5000.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The ID of the workspace.</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The name of the workspace.</p>
     */
    @NameInMap("OfficeSiteName")
    public String officeSiteName;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the [ISO 8601](~~25696~~) standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>If you do not specify a value for this parameter, all events that occurred before the point in time that you specify for `EndTime` are queried.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static ExportClientEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportClientEventsRequest self = new ExportClientEventsRequest();
        return TeaModel.build(map, self);
    }

    public ExportClientEventsRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public ExportClientEventsRequest setDesktopName(String desktopName) {
        this.desktopName = desktopName;
        return this;
    }
    public String getDesktopName() {
        return this.desktopName;
    }

    public ExportClientEventsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ExportClientEventsRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public ExportClientEventsRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public ExportClientEventsRequest setEventTypes(java.util.List<String> eventTypes) {
        this.eventTypes = eventTypes;
        return this;
    }
    public java.util.List<String> getEventTypes() {
        return this.eventTypes;
    }

    public ExportClientEventsRequest setLangType(String langType) {
        this.langType = langType;
        return this;
    }
    public String getLangType() {
        return this.langType;
    }

    public ExportClientEventsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ExportClientEventsRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public ExportClientEventsRequest setOfficeSiteName(String officeSiteName) {
        this.officeSiteName = officeSiteName;
        return this;
    }
    public String getOfficeSiteName() {
        return this.officeSiteName;
    }

    public ExportClientEventsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ExportClientEventsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
