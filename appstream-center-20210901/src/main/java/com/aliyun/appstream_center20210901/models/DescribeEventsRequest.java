// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DescribeEventsRequest extends TeaModel {
    /**
     * <p>The delivery group ID, used to filter events of a specific delivery group. If you do not specify this parameter, events are not filtered by delivery group. You can call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The delivery group name. If the name contains only letters, digits, underscores, or hyphens, events are filtered by name prefix. If the name contains spaces or other special characters, events are filtered by the exact name. If you do not specify this parameter, events are not filtered by name.</p>
     * 
     * <strong>example:</strong>
     * <p>R&amp;D workstation group</p>
     */
    @NameInMap("AppInstanceGroupName")
    public String appInstanceGroupName;

    /**
     * <p>The application instance ID, used to filter events associated with a specific instance. If you do not specify this parameter, events are not filtered by application instance. To obtain this value, first call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the delivery group ID, and then use the ID as <code>AppInstanceGroupId</code> to call the <a href="~~ListAppInstances~~">ListAppInstances</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>ai-azn3kmwruh1vl****</p>
     */
    @NameInMap("AppInstanceId")
    public String appInstanceId;

    /**
     * <p>The business region ID of the event, used for exact filtering. If you do not specify this parameter, events are not filtered by business region. You can call the <a href="~~ListRegions~~">ListRegions</a> operation to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The end time of the query. <strong>Required</strong>. The format is the same as that of <code>StartTime</code>. We recommend that you always include the time zone offset. The query includes this time, and the end time cannot be earlier than the <code>StartTime</code>. A time range later than the call time does not generate future events.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-29T15:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The event ID, used to query a specific event. If you do not specify this parameter, events are not filtered by event ID.</p>
     * 
     * <strong>example:</strong>
     * <p>evt-9ciijz60n4xsv****</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The event type identifier, used to filter events. Different products may generate different event types. This operation does not restrict the value to a fixed enumeration. You should use the EventType values retrieved from EventList as filter values.</p>
     * 
     * <strong>example:</strong>
     * <p>SessionDisconnected</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>A compatibility field. The current version does not read this parameter. Use <code>PageSize</code> to control the number of records on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The private IP address of the member elastic network interface (ENI) of the cloud resource, used to filter related events. If you do not specify this parameter, events are not filtered by IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.1.10</p>
     */
    @NameInMap("MemberEniIp")
    public String memberEniIp;

    /**
     * <p>A compatibility field. The current version does not read this parameter and does not support token-based pagination. Use <code>PageNumber</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>unused</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The office network ID, used to filter events generated within a specific office network. If you do not specify this parameter, events are not filtered by office network.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai+dir-123456****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The page number to query. Pages start from 1. Default value: 1. This parameter is used together with <code>PageSize</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of events to return on each page. Default value: 10. This operation does not declare a fixed upper limit. We recommend that you set this parameter to a reasonable positive integer based on your actual needs.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product type. The value is case-insensitive. If you specify an invalid value, the request fails. If you do not specify this parameter, events are not filtered by product type. Only the following public product values are supported:</p>
     * <ul>
     * <li><code>CloudApp</code>: Wuying Cloud Application.</li>
     * <li><code>CloudBrowser</code>: Cloud Browser.</li>
     * <li><code>WuyingServer</code>: Enterprise Edition Workstation.</li>
     * <li><code>WuyingWorkstation</code>: Personal Edition Linggou Container Workstation.</li>
     * <li><code>WuyingWorkstationTeam</code>: Linggou Team Edition Container Workstation.</li>
     * <li><code>WuyingWorkstationBusiness</code>: Linggou Dedicated Edition Container Workstation.</li>
     * <li><code>AndroidCloud</code>: Cloud Phone.</li>
     * <li><code>AIAgent</code>: AgentBay (AI agent).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The start time of the query. <strong>Required</strong>. Use the ISO 8601 format: <code>yyyy-MM-dd\\&quot;T\\&quot;HH:mm:ss</code>. You can include three-digit milliseconds and use <code>Z</code> or <code>±HH:mm</code> to specify the time zone. We recommend that you always include the time zone offset. The query includes this time, and the start time must be earlier than or equal to the <code>EndTime</code>. The service only retains and retrieves events that occurred within 30 days before the call time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-28T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The end user ID, used to filter events generated by a specific user. If you do not specify this parameter, events are not filtered by user.</p>
     * 
     * <strong>example:</strong>
     * <p>user01</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static DescribeEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventsRequest self = new DescribeEventsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventsRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public DescribeEventsRequest setAppInstanceGroupName(String appInstanceGroupName) {
        this.appInstanceGroupName = appInstanceGroupName;
        return this;
    }
    public String getAppInstanceGroupName() {
        return this.appInstanceGroupName;
    }

    public DescribeEventsRequest setAppInstanceId(String appInstanceId) {
        this.appInstanceId = appInstanceId;
        return this;
    }
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    public DescribeEventsRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public DescribeEventsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeEventsRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public DescribeEventsRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public DescribeEventsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeEventsRequest setMemberEniIp(String memberEniIp) {
        this.memberEniIp = memberEniIp;
        return this;
    }
    public String getMemberEniIp() {
        return this.memberEniIp;
    }

    public DescribeEventsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeEventsRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public DescribeEventsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEventsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEventsRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public DescribeEventsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeEventsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
