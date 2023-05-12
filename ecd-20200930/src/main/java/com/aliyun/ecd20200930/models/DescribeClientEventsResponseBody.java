// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeClientEventsResponseBody extends TeaModel {
    /**
     * <p>The information about the regular user that connects to the cloud desktop from the EDS client. The information can be the RAM user ID or AD username.</p>
     */
    @NameInMap("Events")
    public java.util.List<DescribeClientEventsResponseBodyEvents> events;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The type of the directory.</p>
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
         * <p>The name of the cloud desktop.</p>
         */
        @NameInMap("AliUid")
        public String aliUid;

        /**
         * <p>The name of the cloud desktop.</p>
         */
        @NameInMap("BytesReceived")
        public String bytesReceived;

        /**
         * <p>The information about the regular user that connects to the cloud desktop from the EDS client. The information can be the RAM user ID or Active Directory (AD) username. If you do not specify a value for this parameter, events of all regular users in the specified region are queried.</p>
         */
        @NameInMap("BytesSend")
        public String bytesSend;

        /**
         * <p>The IP address of the cloud desktop. If you do not specify a value for this parameter, events of all cloud desktops in the specified region are queried.</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <p>The ID of the cloud desktop.</p>
         */
        @NameInMap("ClientOS")
        public String clientOS;

        /**
         * <p>DescribeClientEvents</p>
         */
        @NameInMap("ClientVersion")
        public String clientVersion;

        @NameInMap("DesktopGroupId")
        public String desktopGroupId;

        @NameInMap("DesktopGroupName")
        public String desktopGroupName;

        /**
         * <p>The name of the desktop group.</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The name of the workspace.</p>
         */
        @NameInMap("DesktopIp")
        public String desktopIp;

        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <p>The type of the event.</p>
         */
        @NameInMap("DirectoryId")
        public String directoryId;

        /**
         * <p>The type of event.</p>
         */
        @NameInMap("DirectoryType")
        public String directoryType;

        /**
         * <p>The end of the time range to query. Specify the time in the [ISO 8601](~~25696~~) standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</p>
         * <br>
         * <p>If you do not specify a value for this parameter, the current time is used.</p>
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
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>The beginning of the time range to query. Specify the time in the [ISO 8601](~~25696~~) standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</p>
         * <br>
         * <p>If you do not specify a value for this parameter, all events that occurred before the point in time that you specify for `EndTime` are queried.</p>
         */
        @NameInMap("EventTime")
        public String eventTime;

        /**
         * <p>The query token. Set the value to the NextToken value that is returned from the last call to the DescribeClientEvents operation.</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The ID of the event.</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        @NameInMap("OfficeSiteName")
        public String officeSiteName;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("OfficeSiteType")
        public String officeSiteType;

        /**
         * <p>The ID of the cloud desktop. If you do not specify a value for this parameter, events of all cloud desktops in the specified region are queried.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The number of bytes that are sent.</p>
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
