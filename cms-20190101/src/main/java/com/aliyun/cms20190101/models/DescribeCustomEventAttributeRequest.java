// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeCustomEventAttributeRequest extends TeaModel {
    /**
     * <p>The end time.</p>
     * <p>The value is a UNIX timestamp that indicates the number of milliseconds that have elapsed since January 1, 1970.</p>
     * 
     * <strong>example:</strong>
     * <p>1552227965971</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The event ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123****</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The application group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The event name.</p>
     * 
     * <strong>example:</strong>
     * <p>test123</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number.</p>
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
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The keywords used to search event content.</p>
     * <ul>
     * <li>If the event content contains both A and B, you can search for A and B.</li>
     * <li>If the event content contains either A or B, you can search for A or B.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cms</p>
     */
    @NameInMap("SearchKeywords")
    public String searchKeywords;

    /**
     * <p>The start time.</p>
     * <p>The value is a UNIX timestamp that indicates the number of milliseconds that have elapsed since January 1, 1970.</p>
     * 
     * <strong>example:</strong>
     * <p>1552224365971</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeCustomEventAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomEventAttributeRequest self = new DescribeCustomEventAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomEventAttributeRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeCustomEventAttributeRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public DescribeCustomEventAttributeRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeCustomEventAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeCustomEventAttributeRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCustomEventAttributeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCustomEventAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCustomEventAttributeRequest setSearchKeywords(String searchKeywords) {
        this.searchKeywords = searchKeywords;
        return this;
    }
    public String getSearchKeywords() {
        return this.searchKeywords;
    }

    public DescribeCustomEventAttributeRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
