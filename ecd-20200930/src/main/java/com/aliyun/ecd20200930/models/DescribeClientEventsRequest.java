// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeClientEventsRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account with which the event is associated.</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The account type of the workspace. Valid values:</p>
     * <br>
     * <p>*   SIMPLE: convenience account</p>
     * <p>*   AD_CONNECTOR: enterprise AD account</p>
     */
    @NameInMap("DesktopIp")
    public String desktopIp;

    /**
     * <p>The types of event.</p>
     */
    @NameInMap("DesktopName")
    public String desktopName;

    /**
     * <p>The ID of the desktop group.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The ID of the region where the cloud desktop resides.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the directory to which the cloud desktop belongs.</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The ID of the workspace to which the cloud desktop belongs. If you do not specify a value for this parameter, events of all workspaces in the specified region are queried.</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>Details about the events.</p>
     */
    @NameInMap("EventTypes")
    public java.util.List<String> eventTypes;

    /**
     * <p>The status of the event. This parameter is returned if you set the EventType parameter to DESKTOP_DISCONNECT or GET_CONNECTION_TICKET. Valid values:</p>
     * <br>
     * <p>*   200\. The value indicates that the request is successful.</p>
     * <p>*   An error message. The value indicates that the request failed. Example: FailedToGetConnectionTicket.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The IP address of the client.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the workspace to which the cloud desktop belongs.</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The OS that the client runs.</p>
     */
    @NameInMap("OfficeSiteName")
    public String officeSiteName;

    /**
     * <p>The number of bytes that are received.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IP address of the cloud desktop.</p>
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
