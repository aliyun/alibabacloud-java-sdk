// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeEventsResponseBody extends TeaModel {
    /**
     * <p>The token for the next query. If NextToken is empty, no more results exist.</p>
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
     * <p>The list of events.</p>
     */
    @NameInMap("ResourceEvents")
    public java.util.List<DescribeEventsResponseBodyResourceEvents> resourceEvents;

    /**
     * <p>The total number of entries returned for the paged query.</p>
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
         * <p>The event description.</p>
         * 
         * <strong>example:</strong>
         * <p>You can purchase 4296 provisioned IOPS for cost optimization. Based on your usage over the past 7 days, costs are estimated to decrease by 16%</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The end time of the event. This value is a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1679538083000</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The event level. Valid values:</p>
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
         * <p>The event name. Valid values:</p>
         * <ul>
         * <li>NoSnapshot: data protection</li>
         * <li>BurstIOTriggered: burst I/O</li>
         * <li>CostOptimizationNeeded: cost optimization</li>
         * <li>DiskSpecNotMatchedWithInstance: instance and disk specification mismatch</li>
         * <li>DiskIONo4kAligned: non-4K aligned read/write</li>
         * <li>DiskIOHang: disk IOHang occurred</li>
         * <li>InstanceIOPSExceedInstanceMaxLimit: instance IOPS reached the upper limit</li>
         * <li>InstanceBPSExceedInstanceMaxLimit: instance BPS reached the upper limit</li>
         * <li>DiskIOPSExceedInstanceMaxLimit: disk IOPS reached the instance upper limit</li>
         * <li>DiskBPSExceedInstanceMaxLimit: disk BPS reached the instance upper limit</li>
         * <li>DiskIOPSExceedDiskMaxLimit: disk IOPS reached the disk upper limit</li>
         * <li>DiskBPSExceedDiskMaxLimit: disk BPS reached the disk upper limit</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DiskIOHang</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The event type. Valid values:</p>
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
         * <p>The additional properties. Possible fields:</p>
         * <ul>
         * <li>EcsInstanceId: the ID of the ECS instance to which the cloud disk is attached.</li>
         * <li>Adapter: the mount point of the cloud disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;EcsInstanceId\&quot;:\&quot;i-uf6dkn9qpcw6y94g7ag7\&quot;,\&quot;Adapter\&quot;:\&quot;hda\&quot;}</p>
         */
        @NameInMap("ExtraAttributes")
        public String extraAttributes;

        /**
         * <p>The recommended action after the event occurs. Valid values:</p>
         * <ul>
         * <li>ModifyDiskSpec: change disk specifications</li>
         * <li>CreateSnapshot: create a snapshot</li>
         * <li>ResizeDisk: expand disk capacity</li>
         * <li>AdjustProvision: adjust provisioned performance</li>
         * <li>ModifyInstanceSpec: change instance specifications</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AdjustProvision</p>
         */
        @NameInMap("RecommendAction")
        public String recommendAction;

        /**
         * <p>The parameters for the recommended action after the event occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>4296</p>
         */
        @NameInMap("RecommendParams")
        public String recommendParams;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-bp67acfmxazb4p****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>disk</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The start time of the event. This value is a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1684204822000</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The event status. Valid values:</p>
         * <ol>
         * <li>WillExecute: pending</li>
         * <li>Executing: processing</li>
         * <li>Executed: processed</li>
         * <li>Ignore: ignored</li>
         * <li>Expired: expired</li>
         * <li>Deleted: deleted</li>
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

        public DescribeEventsResponseBodyResourceEvents setExtraAttributes(String extraAttributes) {
            this.extraAttributes = extraAttributes;
            return this;
        }
        public String getExtraAttributes() {
            return this.extraAttributes;
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
