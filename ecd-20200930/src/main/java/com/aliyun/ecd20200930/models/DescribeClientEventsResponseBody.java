// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeClientEventsResponseBody extends TeaModel {
    /**
     * <p>The information about the events of an end user.</p>
     */
    @NameInMap("Events")
    public java.util.List<DescribeClientEventsResponseBodyEvents> events;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nmB7qrRFJ8vmttjxPL****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>28A40F12-F340-442B-A35F-46EF6A03227B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClientEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientEventsResponseBody self = new DescribeClientEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClientEventsResponseBody setEvents(java.util.List<DescribeClientEventsResponseBodyEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<DescribeClientEventsResponseBodyEvents> getEvents() {
        return this.events;
    }

    public DescribeClientEventsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeClientEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClientEventsResponseBodyEvents extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account with which the event is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>112259558861****</p>
         */
        @NameInMap("AliUid")
        public String aliUid;

        /**
         * <p>The number of bytes that are received.</p>
         * 
         * <strong>example:</strong>
         * <p>8665</p>
         */
        @NameInMap("BytesReceived")
        public String bytesReceived;

        /**
         * <p>The number of bytes that are sent.</p>
         * 
         * <strong>example:</strong>
         * <p>2345</p>
         */
        @NameInMap("BytesSend")
        public String bytesSend;

        /**
         * <p>The IP address of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>100.68.<em>.</em></p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <p>The OS that the client runs.</p>
         * 
         * <strong>example:</strong>
         * <p>Darwin 17.7.0 x64</p>
         */
        @NameInMap("ClientOS")
        public String clientOS;

        /**
         * <p>The client version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.4 202012021700</p>
         */
        @NameInMap("ClientVersion")
        public String clientVersion;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The desktop group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dg-kadkdfaf****</p>
         */
        @NameInMap("DesktopGroupId")
        public String desktopGroupId;

        /**
         * <p>The desktop group name.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        @NameInMap("DesktopGroupName")
        public String desktopGroupName;

        /**
         * <p>The cloud desktop ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-8fupvkhg0aayu****</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The IP address of the cloud desktop.</p>
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
         * <p>The ID of the directory to which the cloud desktop belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-bh77qa8nmjot4****</p>
         */
        @NameInMap("DirectoryId")
        public String directoryId;

        /**
         * <p>The directory type.</p>
         * 
         * <strong>example:</strong>
         * <p>RAM</p>
         */
        @NameInMap("DirectoryType")
        public String directoryType;

        /**
         * <p>The information about the end user that connects to the cloud desktop from the EDS client. The information can be a RAM user ID or an AD username.</p>
         * 
         * <strong>example:</strong>
         * <p>28961708130834****</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5651188b-3070-d1cc-5311-75753d59****</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>The time when the event occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-30T06:32:31Z</p>
         */
        @NameInMap("EventTime")
        public String eventTime;

        /**
         * <p>The event type. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>DESKTOP_DISCONNECT</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The ID of the workspace to which the cloud desktop belongs.</p>
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
         * <p>The account type of the workspace.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>SIMPLE: convenience account</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>AD_CONNECTOR: enterprise AD account</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SIMPLE</p>
         */
        @NameInMap("OfficeSiteType")
        public String officeSiteType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the event. If you set the EventType parameter to <code>DESKTOP_DISCONNECT</code> or <code>GET_CONNECTION_TICKET</code>, this parameter is returned. Valid values:</p>
         * <ul>
         * <li>200\. The value indicates that the request is successful.</li>
         * <li>An error message. The value indicates that the request failed. Example: FailedToGetConnectionTicket.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeClientEventsResponseBodyEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeClientEventsResponseBodyEvents self = new DescribeClientEventsResponseBodyEvents();
            return TeaModel.build(map, self);
        }

        public DescribeClientEventsResponseBodyEvents setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public DescribeClientEventsResponseBodyEvents setBytesReceived(String bytesReceived) {
            this.bytesReceived = bytesReceived;
            return this;
        }
        public String getBytesReceived() {
            return this.bytesReceived;
        }

        public DescribeClientEventsResponseBodyEvents setBytesSend(String bytesSend) {
            this.bytesSend = bytesSend;
            return this;
        }
        public String getBytesSend() {
            return this.bytesSend;
        }

        public DescribeClientEventsResponseBodyEvents setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeClientEventsResponseBodyEvents setClientOS(String clientOS) {
            this.clientOS = clientOS;
            return this;
        }
        public String getClientOS() {
            return this.clientOS;
        }

        public DescribeClientEventsResponseBodyEvents setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

        public DescribeClientEventsResponseBodyEvents setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeClientEventsResponseBodyEvents setDesktopGroupId(String desktopGroupId) {
            this.desktopGroupId = desktopGroupId;
            return this;
        }
        public String getDesktopGroupId() {
            return this.desktopGroupId;
        }

        public DescribeClientEventsResponseBodyEvents setDesktopGroupName(String desktopGroupName) {
            this.desktopGroupName = desktopGroupName;
            return this;
        }
        public String getDesktopGroupName() {
            return this.desktopGroupName;
        }

        public DescribeClientEventsResponseBodyEvents setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeClientEventsResponseBodyEvents setDesktopIp(String desktopIp) {
            this.desktopIp = desktopIp;
            return this;
        }
        public String getDesktopIp() {
            return this.desktopIp;
        }

        public DescribeClientEventsResponseBodyEvents setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public DescribeClientEventsResponseBodyEvents setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public DescribeClientEventsResponseBodyEvents setDirectoryType(String directoryType) {
            this.directoryType = directoryType;
            return this;
        }
        public String getDirectoryType() {
            return this.directoryType;
        }

        public DescribeClientEventsResponseBodyEvents setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public DescribeClientEventsResponseBodyEvents setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public DescribeClientEventsResponseBodyEvents setEventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public String getEventTime() {
            return this.eventTime;
        }

        public DescribeClientEventsResponseBodyEvents setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeClientEventsResponseBodyEvents setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeClientEventsResponseBodyEvents setOfficeSiteName(String officeSiteName) {
            this.officeSiteName = officeSiteName;
            return this;
        }
        public String getOfficeSiteName() {
            return this.officeSiteName;
        }

        public DescribeClientEventsResponseBodyEvents setOfficeSiteType(String officeSiteType) {
            this.officeSiteType = officeSiteType;
            return this;
        }
        public String getOfficeSiteType() {
            return this.officeSiteType;
        }

        public DescribeClientEventsResponseBodyEvents setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeClientEventsResponseBodyEvents setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
