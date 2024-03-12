// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeClientEventsRequest extends TeaModel {
    /**
     * <p>The ID of the cloud desktop. If you do not specify a value for this parameter, events of all cloud desktops in the specified region are queried.</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The IP address of the cloud desktop. If you do not specify a value for this parameter, events of all cloud desktops in the specified region are queried.</p>
     */
    @NameInMap("DesktopIp")
    public String desktopIp;

    /**
     * <p>The name of the cloud desktop.</p>
     */
    @NameInMap("DesktopName")
    public String desktopName;

    /**
     * <p>The ID of the directory to which the cloud desktop belongs.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The end of the time range to query. Specify the time in the [ISO 8601](~~25696~~) standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>If you do not specify a value for this parameter, the current time is used.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The information about the regular user that connects to the cloud desktop from the EDS client. The information can be the RAM user ID or Active Directory (AD) username. If you do not specify a value for this parameter, events of all regular users in the specified region are queried.</p>
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
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Default value: 100.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The query token. Set the value to the NextToken value that is returned from the last call to the DescribeClientEvents operation.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the workspace to which the cloud desktop belongs. If you do not specify a value for this parameter, events of all workspaces in the specified region are queried.</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The name of the workspace.</p>
     */
    @NameInMap("OfficeSiteName")
    public String officeSiteName;

    /**
     * <p>The ID of the region where the cloud desktop resides.</p>
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
