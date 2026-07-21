// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeClientEventsRequest extends TeaModel {
    /**
     * <p>The cloud computer ID. If you do not specify this parameter, all cloud computers in the region are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-8fupvkhg0aayu****</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The IP address of the cloud computer. If you do not specify this parameter, events of all cloud computers in the region are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>10.10.<em>.</em></p>
     */
    @NameInMap("DesktopIp")
    public String desktopIp;

    /**
     * <p>The name of the cloud computer.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DesktopName")
    public String desktopName;

    /**
     * <blockquote>
     * <p>This parameter is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>To be hidden.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The end time. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC+0. If you do not specify this parameter, the current time is used.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-31T06:32:31Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The logon user information, which is a Resource Access Management (RAM) user ID or AD username. If you do not specify this parameter, events of all users in the region are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>28961708130834****</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("EndUserIds")
    public java.util.List<String> endUserIds;

    /**
     * <p>The event type to query. If EventTypes is not empty, the EventTypes combination is used as the query filter condition. If both EventTypes and EventType are empty, all events are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>DESKTOP_DISCONNECT</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The combination of event types to query. You can specify multiple event types. The query results include events of all specified types.</p>
     */
    @NameInMap("EventTypes")
    public java.util.List<String> eventTypes;

    @NameInMap("FillHardwareInfo")
    public Boolean fillHardwareInfo;

    @NameInMap("Language")
    public String language;

    /**
     * <p>The number of entries per page for a paged query. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Set this parameter to the value of NextToken returned in the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nmB7qrRFJ8vmttjxPL****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the office network to which the cloud computer belongs. If you do not specify this parameter, user events in all office networks in the region are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-bh77qa8nmjot4****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The name of the office network.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("OfficeSiteName")
    public String officeSiteName;

    /**
     * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start time. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC+0. If you do not specify this parameter, events are queried backward from the time specified by <code>EndTime</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-30T06:32:31Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeClientEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientEventsRequest self = new DescribeClientEventsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClientEventsRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public DescribeClientEventsRequest setDesktopIp(String desktopIp) {
        this.desktopIp = desktopIp;
        return this;
    }
    public String getDesktopIp() {
        return this.desktopIp;
    }

    public DescribeClientEventsRequest setDesktopName(String desktopName) {
        this.desktopName = desktopName;
        return this;
    }
    public String getDesktopName() {
        return this.desktopName;
    }

    public DescribeClientEventsRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public DescribeClientEventsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeClientEventsRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public DescribeClientEventsRequest setEndUserIds(java.util.List<String> endUserIds) {
        this.endUserIds = endUserIds;
        return this;
    }
    public java.util.List<String> getEndUserIds() {
        return this.endUserIds;
    }

    public DescribeClientEventsRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public DescribeClientEventsRequest setEventTypes(java.util.List<String> eventTypes) {
        this.eventTypes = eventTypes;
        return this;
    }
    public java.util.List<String> getEventTypes() {
        return this.eventTypes;
    }

    public DescribeClientEventsRequest setFillHardwareInfo(Boolean fillHardwareInfo) {
        this.fillHardwareInfo = fillHardwareInfo;
        return this;
    }
    public Boolean getFillHardwareInfo() {
        return this.fillHardwareInfo;
    }

    public DescribeClientEventsRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public DescribeClientEventsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeClientEventsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeClientEventsRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public DescribeClientEventsRequest setOfficeSiteName(String officeSiteName) {
        this.officeSiteName = officeSiteName;
        return this;
    }
    public String getOfficeSiteName() {
        return this.officeSiteName;
    }

    public DescribeClientEventsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeClientEventsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
