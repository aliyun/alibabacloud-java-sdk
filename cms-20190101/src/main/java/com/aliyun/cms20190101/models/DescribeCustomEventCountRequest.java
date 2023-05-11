// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeCustomEventCountRequest extends TeaModel {
    /**
     * <p>The returned message. If the call was successful, the value success is returned. If the call failed, an error message is returned.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The keywords that are contained in the content of the custom event to query. You can use a logical operator between keywords.</p>
     * <br>
     * <p>*   If you need to query the custom event whose content contains a and b, set the value to a and b.</p>
     * <p>*   If you need to query the custom event whose content contains a or b, set the value to a or b.</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The beginning of the time range to query.</p>
     * <br>
     * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the application group.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The end of the time range to query.</p>
     * <br>
     * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("SearchKeywords")
    public String searchKeywords;

    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call was successful.</p>
     */
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
