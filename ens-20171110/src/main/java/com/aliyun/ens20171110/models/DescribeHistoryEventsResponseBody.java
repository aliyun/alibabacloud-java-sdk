// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeHistoryEventsResponseBody extends TeaModel {
    /**
     * <p>The queried events.</p>
     */
    @NameInMap("Events")
    public java.util.List<DescribeHistoryEventsResponseBodyEvents> events;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5359599C-F656-57BD-8A0D-329A2FD511A6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeHistoryEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHistoryEventsResponseBody self = new DescribeHistoryEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHistoryEventsResponseBody setEvents(java.util.List<DescribeHistoryEventsResponseBodyEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<DescribeHistoryEventsResponseBodyEvents> getEvents() {
        return this.events;
    }

    public DescribeHistoryEventsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHistoryEventsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHistoryEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHistoryEventsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeHistoryEventsResponseBodyEvents extends TeaModel {
        /**
         * <p>The ID of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>e-d71ff150945b9c02eb6ebc0016328468</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>The level of the specific event. Valid values:</p>
         * <ul>
         * <li>CRITICAL</li>
         * <li>WARN</li>
         * <li>INFO</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WARN</p>
         */
        @NameInMap("EventLevel")
        public String eventLevel;

        /**
         * <p>The status of the event. Valid values:</p>
         * <ul>
         * <li>Inquiring</li>
         * <li>Scheduled</li>
         * <li>Executing</li>
         * <li>Executed</li>
         * <li>Failed</li>
         * <li>Canceled</li>
         * <li>Avoided</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Inquiring</p>
         */
        @NameInMap("EventStatus")
        public String eventStatus;

        /**
         * <p>The type of the event. Description:</p>
         * <ul>
         * <li>Instance:SystemFailure.Redeploy: The instance is redeployed due to system issues.</li>
         * <li>Instance:SystemFailure.Reboot: The instance is restarted due to a system error.</li>
         * <li>Instance:RegionNetworkDown: The node network is interrupted.</li>
         * <li>Disk:Stalled: The disk performance is impaired.</li>
         * <li>EnsRegion:NetworkMigration: The instance is migrated due to a system error.</li>
         * <li>IP:SafeRisk: IP alerts.</li>
         * <li>IP:SafeBan: IP blocking.</li>
         * <li>Instance:SystemUpgrade.Migrate: The instance needs to be migrated due to underlying upgrades.</li>
         * <li>Instance:SystemMaintenance.Redeploy: The instance is redeployed due to system maintenance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Instance:SystemFailure.Reboot</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The extended attributes.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ExtendedAttribute")
        public String extendedAttribute;

        /**
         * <p>The scheduled execution time of the event in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1715578245000</p>
         */
        @NameInMap("NotBefore")
        public Long notBefore;

        /**
         * <p>The release time in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1715578245000</p>
         */
        @NameInMap("PublishTime")
        public Long publishTime;

        /**
         * <p>The event cause.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The ID of the associated resources.</p>
         * 
         * <strong>example:</strong>
         * <p>i-55qi8m11rr53c4i964md8a00l</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        public static DescribeHistoryEventsResponseBodyEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeHistoryEventsResponseBodyEvents self = new DescribeHistoryEventsResponseBodyEvents();
            return TeaModel.build(map, self);
        }

        public DescribeHistoryEventsResponseBodyEvents setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public DescribeHistoryEventsResponseBodyEvents setEventLevel(String eventLevel) {
            this.eventLevel = eventLevel;
            return this;
        }
        public String getEventLevel() {
            return this.eventLevel;
        }

        public DescribeHistoryEventsResponseBodyEvents setEventStatus(String eventStatus) {
            this.eventStatus = eventStatus;
            return this;
        }
        public String getEventStatus() {
            return this.eventStatus;
        }

        public DescribeHistoryEventsResponseBodyEvents setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeHistoryEventsResponseBodyEvents setExtendedAttribute(String extendedAttribute) {
            this.extendedAttribute = extendedAttribute;
            return this;
        }
        public String getExtendedAttribute() {
            return this.extendedAttribute;
        }

        public DescribeHistoryEventsResponseBodyEvents setNotBefore(Long notBefore) {
            this.notBefore = notBefore;
            return this;
        }
        public Long getNotBefore() {
            return this.notBefore;
        }

        public DescribeHistoryEventsResponseBodyEvents setPublishTime(Long publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public Long getPublishTime() {
            return this.publishTime;
        }

        public DescribeHistoryEventsResponseBodyEvents setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeHistoryEventsResponseBodyEvents setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

}
