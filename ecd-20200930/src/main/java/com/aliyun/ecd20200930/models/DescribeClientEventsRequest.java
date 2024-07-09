// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeClientEventsRequest extends TeaModel {
    /**
     * <p>The cloud desktop ID. If you do not specify a value for this parameter, events of all cloud desktops in the specified region are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-8fupvkhg0aayu****</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The IP address of the cloud desktop. If you do not specify a value for this parameter, the events of all cloud desktops in the specified region are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>10.10.<em>.</em></p>
     */
    @NameInMap("DesktopIp")
    public String desktopIp;

    /**
     * <p>The cloud desktop name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DesktopName")
    public String desktopName;

    /**
     * <p>This parameter is not available to the public.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-bh77qa8nmjot4****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The end of the time range to query. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.\
     * If you do not specify a value for this parameter, the current time is used.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-31T06:32:31Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The information about the end user that connects to the cloud desktop from the Elastic Desktop Service (EDS) client. The information can be a Resource Access Management (RAM) user ID or an Active Directory (AD) username. If you do not specify a value for this parameter, the events of all end users in the specified region are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>28961708130834****</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The type of the events that you want to query. If you specify multiple values for the EventTypes parameter, the events of all specified types are returned. If you do not specify values for the EventTypes and EventType parameters, all events of end users in the specified region are returned.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>DESKTOP_STOP: End users stop the cloud desktop.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>GET_LITE_CONNECTION_TICKET: End users obtain the credential for reconnecting to the cloud desktop upon disconnection.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>DESKTOP_DISCONNECT: End users disconnect desktop sessions.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>GET_CONNECTION_TICKET: End users request to connect to the cloud desktop.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>CLIENT_LOGIN: End users log on to the cloud desktop.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>DESKTOP_REBOOT: End users restart the cloud desktop.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>DESKTOP_CONNECT: End users establish desktop sessions.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>DESKTOP_START: End users start the cloud desktop.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DESKTOP_DISCONNECT</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The array of event types that you want to query. You can specify multiple event types. The response contains all or specified types of events.</p>
     */
    @NameInMap("EventTypes")
    public java.util.List<String> eventTypes;

    /**
     * <p>The number of entries per page.\
     * Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nmB7qrRFJ8vmttjxPL****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the workspace to which the cloud desktop belongs. If you do not specify a value for this parameter, the events of all workspaces in the specified region are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-bh77qa8nmjot4****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The workspace name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("OfficeSiteName")
    public String officeSiteName;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.\
     * If you do not specify a value for this parameter, all events that occurred before the point in time that you specify for <code>EndTime</code> are queried.</p>
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
