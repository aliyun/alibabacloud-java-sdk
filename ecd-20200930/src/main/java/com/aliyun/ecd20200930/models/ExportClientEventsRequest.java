// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ExportClientEventsRequest extends TeaModel {
    /**
     * <p>The ID of the cloud desktop.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-gx2x1dhsmucyy****</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The name of the cloud desktop.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("DesktopName")
    public String desktopName;

    /**
     * <p>The end of the time range to query. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</p>
     * <p>If you do not specify a value for this parameter, the current time is used.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-03-23T07:11:01Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the endpoint user.</p>
     * 
     * <strong>example:</strong>
     * <p>user01</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The type of event that you want to query. Valid values:</p>
     * <ul>
     * <li>DESKTOP_CONNECT: The desktop session is established.</li>
     * <li>DESKTOP_DISCONNECT: The desktop session is disconnected.</li>
     * <li>DESKTOP_REBOOT: The cloud desktop is restarted.</li>
     * <li>CLIENT_AD_LOGIN: The AD user logs on to the client.</li>
     * <li>GET_CONNECTION_TICKET: The request to connect to the cloud desktop is sent.</li>
     * <li>DESKTOP_START: The cloud desktop is started.</li>
     * <li>DESKTOP_STOP: The cloud desktop is stopped.</li>
     * </ul>
     * <p>If you do not specify a value for this parameter, events of all types are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>CLIENT_LOGIN</p>
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
     * <ul>
     * <li><code>zh-CN</code>: Simplified Chinese</li>
     * <li><code>en-GB</code>: English (United Kingdom)</li>
     * </ul>
     * <p>Default value: <code>zh-CN</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("LangType")
    public String langType;

    /**
     * <p>The number of entries to return on each page.</p>
     * <ul>
     * <li>Maximum value: 5000.</li>
     * <li>Default value: 5000.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The ID of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-363353****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The name of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("OfficeSiteName")
    public String officeSiteName;

    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</p>
     * <p>If you do not specify a value for this parameter, all events that occurred before the point in time that you specify for <code>EndTime</code> are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-03-23T04:10:21Z</p>
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
