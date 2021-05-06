// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeClientEventsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("Events")
    @Validation(required = true)
    public java.util.List<DescribeClientEventsResponseEvents> events;

    public static DescribeClientEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientEventsResponse self = new DescribeClientEventsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClientEventsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClientEventsResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeClientEventsResponse setEvents(java.util.List<DescribeClientEventsResponseEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<DescribeClientEventsResponseEvents> getEvents() {
        return this.events;
    }

    public static class DescribeClientEventsResponseEvents extends TeaModel {
        @NameInMap("EventId")
        @Validation(required = true)
        public String eventId;

        @NameInMap("EventType")
        @Validation(required = true)
        public String eventType;

        @NameInMap("EventTime")
        @Validation(required = true)
        public String eventTime;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("AliUid")
        @Validation(required = true)
        public String aliUid;

        @NameInMap("EndUserId")
        @Validation(required = true)
        public String endUserId;

        @NameInMap("DesktopId")
        @Validation(required = true)
        public String desktopId;

        @NameInMap("DesktopIp")
        @Validation(required = true)
        public String desktopIp;

        @NameInMap("DirectoryId")
        @Validation(required = true)
        public String directoryId;

        @NameInMap("OfficeSiteId")
        @Validation(required = true)
        public String officeSiteId;

        @NameInMap("DirectoryType")
        @Validation(required = true)
        public String directoryType;

        @NameInMap("OfficeSiteType")
        @Validation(required = true)
        public String officeSiteType;

        @NameInMap("ClientOS")
        @Validation(required = true)
        public String clientOS;

        @NameInMap("ClientVersion")
        @Validation(required = true)
        public String clientVersion;

        @NameInMap("ClientIp")
        @Validation(required = true)
        public String clientIp;

        @NameInMap("BytesSend")
        @Validation(required = true)
        public String bytesSend;

        @NameInMap("BytesReceived")
        @Validation(required = true)
        public String bytesReceived;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static DescribeClientEventsResponseEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeClientEventsResponseEvents self = new DescribeClientEventsResponseEvents();
            return TeaModel.build(map, self);
        }

        public DescribeClientEventsResponseEvents setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public DescribeClientEventsResponseEvents setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeClientEventsResponseEvents setEventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public String getEventTime() {
            return this.eventTime;
        }

        public DescribeClientEventsResponseEvents setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeClientEventsResponseEvents setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public DescribeClientEventsResponseEvents setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public DescribeClientEventsResponseEvents setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeClientEventsResponseEvents setDesktopIp(String desktopIp) {
            this.desktopIp = desktopIp;
            return this;
        }
        public String getDesktopIp() {
            return this.desktopIp;
        }

        public DescribeClientEventsResponseEvents setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public DescribeClientEventsResponseEvents setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeClientEventsResponseEvents setDirectoryType(String directoryType) {
            this.directoryType = directoryType;
            return this;
        }
        public String getDirectoryType() {
            return this.directoryType;
        }

        public DescribeClientEventsResponseEvents setOfficeSiteType(String officeSiteType) {
            this.officeSiteType = officeSiteType;
            return this;
        }
        public String getOfficeSiteType() {
            return this.officeSiteType;
        }

        public DescribeClientEventsResponseEvents setClientOS(String clientOS) {
            this.clientOS = clientOS;
            return this;
        }
        public String getClientOS() {
            return this.clientOS;
        }

        public DescribeClientEventsResponseEvents setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

        public DescribeClientEventsResponseEvents setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeClientEventsResponseEvents setBytesSend(String bytesSend) {
            this.bytesSend = bytesSend;
            return this;
        }
        public String getBytesSend() {
            return this.bytesSend;
        }

        public DescribeClientEventsResponseEvents setBytesReceived(String bytesReceived) {
            this.bytesReceived = bytesReceived;
            return this;
        }
        public String getBytesReceived() {
            return this.bytesReceived;
        }

        public DescribeClientEventsResponseEvents setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
