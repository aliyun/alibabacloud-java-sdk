// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeCustomEventCountRequest extends TeaModel {
    /**
     * <p>The end of the time range to query.</p>
     * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1552220485596</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the custom event.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The ID of the application group.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The name of the custom event.</p>
     * 
     * <strong>example:</strong>
     * <p>BABEL_BUY</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The keywords that are contained in the content of the custom event to query. You can use a logical operator between keywords.</p>
     * <ul>
     * <li>If you need to query the custom event whose content contains a and b, set the value to a and b.</li>
     * <li>If you need to query the custom event whose content contains a or b, set the value to a or b.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cms</p>
     */
    @NameInMap("SearchKeywords")
    public String searchKeywords;

    /**
     * <p>The beginning of the time range to query.</p>
     * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1552209685596</p>
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
