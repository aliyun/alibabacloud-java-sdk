// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeCustomEventCountRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("EventId")
    public String eventId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SearchKeywords")
    public String searchKeywords;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeCustomEventCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomEventCountRequest self = new DescribeCustomEventCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomEventCountRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeCustomEventCountRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public DescribeCustomEventCountRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeCustomEventCountRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeCustomEventCountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCustomEventCountRequest setSearchKeywords(String searchKeywords) {
        this.searchKeywords = searchKeywords;
        return this;
    }
    public String getSearchKeywords() {
        return this.searchKeywords;
    }

    public DescribeCustomEventCountRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
