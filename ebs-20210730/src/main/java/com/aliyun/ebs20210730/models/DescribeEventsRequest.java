// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeEventsRequest extends TeaModel {
    /**
     * <p>The end time of the event. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-01T04:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The event level. Valid values:</p>
     * <ul>
     * <li><strong>INFO</strong>: Notification.</li>
     * <li><strong>WARN</strong>: Warning.</li>
     * <li><strong>CRITICAL</strong>: Critical.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>WARN</p>
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
     * <p>The maximum number of entries per page for a paged query. If you specify this parameter, the <code>MaxResults</code> and <code>NextToken</code> parameters are used together for the query.</p>
     * <p>Valid values: 1 to 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Set this parameter to the NextToken value returned in the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID. You can call DescribeRegions to query the list of regions supported by EBS Lens.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li>disk: cloud disk</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>disk</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The start time of the event. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-01T03:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The event status. Valid values:</p>
     * <ul>
     * <li>WillExecute: pending </li>
     * <li>Executing: processing</li>
     * <li>Executed: processed</li>
     * <li>Ignore: ignored</li>
     * <li>Expired: expired</li>
     * <li>Deleted: deleted</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>WillExecute</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventsRequest self = new DescribeEventsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeEventsRequest setEventLevel(String eventLevel) {
        this.eventLevel = eventLevel;
        return this;
    }
    public String getEventLevel() {
        return this.eventLevel;
    }

    public DescribeEventsRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public DescribeEventsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeEventsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeEventsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeEventsRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DescribeEventsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeEventsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeEventsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
