// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeClientEventsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Events")
    public java.util.List<DescribeClientEventsResponseBodyEvents> events;

    public static DescribeClientEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientEventsResponseBody self = new DescribeClientEventsResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeClientEventsResponseBody setEvents(java.util.List<DescribeClientEventsResponseBodyEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<DescribeClientEventsResponseBodyEvents> getEvents() {
        return this.events;
    }

    public static class DescribeClientEventsResponseBodyEvents extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("BytesReceived")
        public String bytesReceived;

        @NameInMap("DesktopIp")
        public String desktopIp;

        @NameInMap("EventTime")
        public String eventTime;

        @NameInMap("BytesSend")
        public String bytesSend;

        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        @NameInMap("AliUid")
        public String aliUid;

        @NameInMap("DesktopId")
        public String desktopId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("EventId")
        public String eventId;

        @NameInMap("DirectoryType")
        public String directoryType;

        @NameInMap("EventType")
        public String eventType;

        @NameInMap("EndUserId")
        public String endUserId;

        @NameInMap("ClientIp")
        public String clientIp;

        @NameInMap("ClientOS")
        public String clientOS;

        @NameInMap("OfficeSiteType")
        public String officeSiteType;

        @NameInMap("DirectoryId")
        public String directoryId;

        @NameInMap("ClientVersion")
        public String clientVersion;

        public static DescribeClientEventsResponseBodyEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeClientEventsResponseBodyEvents self = new DescribeClientEventsResponseBodyEvents();
            return TeaModel.build(map, self);
        }

        public DescribeClientEventsResponseBodyEvents setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeClientEventsResponseBodyEvents setBytesReceived(String bytesReceived) {
            this.bytesReceived = bytesReceived;
            return this;
        }
        public String getBytesReceived() {
            return this.bytesReceived;
        }

        public DescribeClientEventsResponseBodyEvents setDesktopIp(String desktopIp) {
            this.desktopIp = desktopIp;
            return this;
        }
        public String getDesktopIp() {
            return this.desktopIp;
        }

        public DescribeClientEventsResponseBodyEvents setEventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public String getEventTime() {
            return this.eventTime;
        }

        public DescribeClientEventsResponseBodyEvents setBytesSend(String bytesSend) {
            this.bytesSend = bytesSend;
            return this;
        }
        public String getBytesSend() {
            return this.bytesSend;
        }

        public DescribeClientEventsResponseBodyEvents setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeClientEventsResponseBodyEvents setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public DescribeClientEventsResponseBodyEvents setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeClientEventsResponseBodyEvents setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeClientEventsResponseBodyEvents setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public DescribeClientEventsResponseBodyEvents setDirectoryType(String directoryType) {
            this.directoryType = directoryType;
            return this;
        }
        public String getDirectoryType() {
            return this.directoryType;
        }

        public DescribeClientEventsResponseBodyEvents setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeClientEventsResponseBodyEvents setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
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

        public DescribeClientEventsResponseBodyEvents setOfficeSiteType(String officeSiteType) {
            this.officeSiteType = officeSiteType;
            return this;
        }
        public String getOfficeSiteType() {
            return this.officeSiteType;
        }

        public DescribeClientEventsResponseBodyEvents setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public DescribeClientEventsResponseBodyEvents setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

    }

}
