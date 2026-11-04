// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DescribeEventsResponseBody extends TeaModel {
    /**
     * <p>The list of events on the current page, returned in descending order of the event log time.</p>
     */
    @NameInMap("EventList")
    public java.util.List<DescribeEventsResponseBodyEventList> eventList;

    /**
     * <p>The compatibility field. The current version does not set this field. Do not rely on its value.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The compatibility field. The current version does not generate a next page token. Do not use this field for pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>unused</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number corresponding to the current response.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of events per page used in the current response.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The unique identifier of the request, which can be used to troubleshoot the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of events that meet all filter conditions within the retrievable window of the last 30 days. Unit: events.</p>
     * 
     * <strong>example:</strong>
     * <p>36</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventsResponseBody self = new DescribeEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventsResponseBody setEventList(java.util.List<DescribeEventsResponseBodyEventList> eventList) {
        this.eventList = eventList;
        return this;
    }
    public java.util.List<DescribeEventsResponseBodyEventList> getEventList() {
        return this.eventList;
    }

    public DescribeEventsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeEventsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeEventsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEventsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEventsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeEventsResponseBodyEventList extends TeaModel {
        /**
         * <p>The ID of the delivery group associated with the event. This parameter may be empty if the event is not associated with a delivery group.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-9ciijz60n4xsv****</p>
         */
        @NameInMap("AppInstanceGroupId")
        public String appInstanceGroupId;

        /**
         * <p>The name of the delivery group associated with the event. This parameter may be empty if the event is not associated with a delivery group.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D workstation group</p>
         */
        @NameInMap("AppInstanceGroupName")
        public String appInstanceGroupName;

        /**
         * <p>The event detail text. The content varies with <code>EventType</code> and may be empty. For example, a session release event can return JSON text to describe the release reason.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Reason&quot;:&quot;ByUser&quot;}</p>
         */
        @NameInMap("DetailInfo")
        public String detailInfo;

        /**
         * <p>The unique identifier of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>evt-9ciijz60n4xsv****</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>The event type identifier. Different products may return different values. You can use this value for subsequent accurate filtering.</p>
         * 
         * <strong>example:</strong>
         * <p>SessionDisconnected</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The private IP address of the member ENI of the cloud resource associated with the event. This parameter may be empty if it is not applicable.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.10</p>
         */
        @NameInMap("MemberEniIp")
        public String memberEniIp;

        /**
         * <p>The time when the event occurred. Format: <code>yyyy-MM-dd HH:mm:ss</code>. Time zone: UTC+8 (Asia/Shanghai).</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-29 14:17:33</p>
         */
        @NameInMap("OccurredTime")
        public String occurredTime;

        /**
         * <p>The ID of the office network associated with the event. This parameter may be empty if it is not applicable.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai+dir-123456****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The product type to which the event belongs. This field is an open string and may be extended as supported event sources increase. Callers should not limit the value to the products currently listed in the <code>ProductType</code> request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudApp</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The ID of the end user who generated the event. This parameter may be empty if the event is not associated with an end user.</p>
         * 
         * <strong>example:</strong>
         * <p>user01</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static DescribeEventsResponseBodyEventList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventsResponseBodyEventList self = new DescribeEventsResponseBodyEventList();
            return TeaModel.build(map, self);
        }

        public DescribeEventsResponseBodyEventList setAppInstanceGroupId(String appInstanceGroupId) {
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        public DescribeEventsResponseBodyEventList setAppInstanceGroupName(String appInstanceGroupName) {
            this.appInstanceGroupName = appInstanceGroupName;
            return this;
        }
        public String getAppInstanceGroupName() {
            return this.appInstanceGroupName;
        }

        public DescribeEventsResponseBodyEventList setDetailInfo(String detailInfo) {
            this.detailInfo = detailInfo;
            return this;
        }
        public String getDetailInfo() {
            return this.detailInfo;
        }

        public DescribeEventsResponseBodyEventList setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public DescribeEventsResponseBodyEventList setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeEventsResponseBodyEventList setMemberEniIp(String memberEniIp) {
            this.memberEniIp = memberEniIp;
            return this;
        }
        public String getMemberEniIp() {
            return this.memberEniIp;
        }

        public DescribeEventsResponseBodyEventList setOccurredTime(String occurredTime) {
            this.occurredTime = occurredTime;
            return this;
        }
        public String getOccurredTime() {
            return this.occurredTime;
        }

        public DescribeEventsResponseBodyEventList setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeEventsResponseBodyEventList setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public DescribeEventsResponseBodyEventList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
