// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ExportClientEventsRequest extends TeaModel {
    /**
     * <p>The cloud computer ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-gx2x1dhsmucyy****</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The cloud computer name.</p>
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
     * <p>The type of the event that you want to query. If you provide multiple values for EventTypes, the response will include events of all the specified types. If you provide no values for EventTypes and EventType, the response will include all events in the designated region.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>DESKTOP_STOP: the shutdown event.</li>
     * <li>GET_LITE_CONNECTION_TICKET: the event of retrieving the connection ticket.</li>
     * <li>DESKTOP_DISCONNECT: the session disconnection event.</li>
     * <li>CLIENT_LOGIN: the user logon event.</li>
     * <li>GET_CONNECTION_TICKET: the connection credential retrieval event.</li>
     * <li>DESKTOP_REBOOT: the restart event.</li>
     * <li>DESKTOP_CONNECT: the session establishment event.</li>
     * <li>DESKTOP_START: the start event.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CLIENT_LOGIN</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The types of the events that you want to query. You can include multiple event types, and the response will return events matching the specified types or all events if none are specified.</p>
     */
    @NameInMap("EventTypes")
    public java.util.List<String> eventTypes;

    /**
     * <p>The language displayed on the frontend page. The backend uses this setting to define the language of exported files.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>zh-CN: Simplified Chinese.</li>
     * <li>en-GB: British English.</li>
     * </ul>
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
     * <p>The office network ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-363353****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The office network name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("OfficeSiteName")
    public String officeSiteName;

    /**
     * <p>The region ID. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the list of regions where Elastic Desktop Service (EDS) Enterprise is available.</p>
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
