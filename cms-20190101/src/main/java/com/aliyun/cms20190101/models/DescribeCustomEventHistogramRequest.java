// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeCustomEventHistogramRequest extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call was successful.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the application group.</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The keywords that are contained in the content of the custom event to query. You can use a logical operator between keywords.</p>
     * <br>
     * <p>*   If you need to query the custom event whose content contains a and b, set the value to a and b.</p>
     * <p>*   If you need to query the custom event whose content contains a or b, set the value to a or b.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the custom event.</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The level of the custom event. Valid values:</p>
     * <br>
     * <p>*   CRITICAL</p>
     * <p>*   WARN</p>
     * <p>*   INFO</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query.</p>
     * <br>
     * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("SearchKeywords")
    public String searchKeywords;

    /**
     * <p>The end of the time range to query.</p>
     * <br>
     * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeCustomEventHistogramRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomEventHistogramRequest self = new DescribeCustomEventHistogramRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomEventHistogramRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeCustomEventHistogramRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public DescribeCustomEventHistogramRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeCustomEventHistogramRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public DescribeCustomEventHistogramRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeCustomEventHistogramRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCustomEventHistogramRequest setSearchKeywords(String searchKeywords) {
        this.searchKeywords = searchKeywords;
        return this;
    }
    public String getSearchKeywords() {
        return this.searchKeywords;
    }

    public DescribeCustomEventHistogramRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
