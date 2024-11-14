// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeEventsResponseBody extends TeaModel {
    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The events.</p>
     */
    @NameInMap("ResourceEvents")
    public java.util.List<DescribeEventsResponseBodyResourceEvents> resourceEvents;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventsResponseBody self = new DescribeEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEventsResponseBody setResourceEvents(java.util.List<DescribeEventsResponseBodyResourceEvents> resourceEvents) {
        this.resourceEvents = resourceEvents;
        return this;
    }
    public java.util.List<DescribeEventsResponseBodyResourceEvents> getResourceEvents() {
        return this.resourceEvents;
    }

    public DescribeEventsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeEventsResponseBodyResourceEvents extends TeaModel {
        /**
         * <p>The description of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>need snapshot</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The end time of the event, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1679538083000</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The level of the event. Valid values:</p>
         * <ol>
         * <li>INFO</li>
         * <li>WARN</li>
         * <li>CRITICAL</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        @NameInMap("EventLevel")
        public String eventLevel;

        /**
         * <p>The name of the event. Valid values:</p>
         * <ul>
         * <li>NoSnapshot: indicates the event that is triggered because no snapshot is created for a disk to protect data on the disk.</li>
         * <li>BurstIOTriggered: indicates the event that is triggered when a burst I/O operation is performed on a disk.</li>
         * <li>CostOptimizationNeeded: indicates the event that is triggered when cost optimization is required.</li>
         * <li>DiskSpecNotMatchedWithInstance: indicates the event that is triggered because the specifications of a disk do not match the instance to which the disk is attached.</li>
         * <li>DiskIONo4kAligned: indicates the event that is triggered because the physical and logical sectors involved in a read or write operation are not 4K aligned.</li>
         * <li>DiskIOHang: indicates the event that is triggered when an I/O hang occurs on a disk.</li>
         * <li>InstanceIOPSExceedInstanceMaxLimit: indicates the event that is triggered when the number of IOPS on an instance reaches the upper limit.</li>
         * <li>InstanceBPSExceedInstanceMaxLimit: indicates the event that is triggered when the number of BPS on an instance reaches the upper limit.</li>
         * <li>DiskIOPSExceedInstanceMaxLimit: indicates the event that is triggered when the number of IOPS on a disk reaches the upper limit for the associated instance.</li>
         * <li>DiskBPSExceedInstanceMaxLimit: indicates the event that is triggered when the number of BPS on a disk reaches the upper limit for the associated instance.</li>
         * <li>DiskIOPSExceedDiskMaxLimit: indicates the event that is triggered when the number of IOPS on a disk reaches the upper limit for the disk.</li>
         * <li>DiskBPSExceedDiskMaxLimit: indicates the event that is triggered when the number of BPS on a disk reaches the upper limit for the disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DiskIOHang</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The type of the event. Valid values:</p>
         * <ol>
         * <li>Notification</li>
         * <li>SystemException</li>
         * <li>Alert</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>Alert</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The recommended action after the event occurred. Valid values:</p>
         * <ul>
         * <li>ModifyDiskSpec</li>
         * <li>CreateSnapshot</li>
         * <li>ResizeDisk</li>
         * <li>AdjustProvision</li>
         * <li>ModifyInstanceSpec</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AdjustProvision</p>
         */
        @NameInMap("RecommendAction")
        public String recommendAction;

        /**
         * <p>The codes of the parameters for the recommended action after the event occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>4296</p>
         */
        @NameInMap("RecommendParams")
        public String recommendParams;

        /**
         * <p>The ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>d-bp67acfmxazb4p****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>disk</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The start time of the event, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1684204822000</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the event. Valid values:</p>
         * <ol>
         * <li>WillExecute</li>
         * <li>Executing</li>
         * <li>Executed</li>
         * <li>Ignore</li>
         * <li>Expired</li>
         * <li>Deleted</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>WillExecute</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeEventsResponseBodyResourceEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventsResponseBodyResourceEvents self = new DescribeEventsResponseBodyResourceEvents();
            return TeaModel.build(map, self);
        }

        public DescribeEventsResponseBodyResourceEvents setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEventsResponseBodyResourceEvents setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeEventsResponseBodyResourceEvents setEventLevel(String eventLevel) {
            this.eventLevel = eventLevel;
            return this;
        }
        public String getEventLevel() {
            return this.eventLevel;
        }

        public DescribeEventsResponseBodyResourceEvents setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeEventsResponseBodyResourceEvents setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeEventsResponseBodyResourceEvents setRecommendAction(String recommendAction) {
            this.recommendAction = recommendAction;
            return this;
        }
        public String getRecommendAction() {
            return this.recommendAction;
        }

        public DescribeEventsResponseBodyResourceEvents setRecommendParams(String recommendParams) {
            this.recommendParams = recommendParams;
            return this;
        }
        public String getRecommendParams() {
            return this.recommendParams;
        }

        public DescribeEventsResponseBodyResourceEvents setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeEventsResponseBodyResourceEvents setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeEventsResponseBodyResourceEvents setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeEventsResponseBodyResourceEvents setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
