// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSystemEventHistogramRequest extends TeaModel {
    /**
     * <p>The end of the time range to query.</p>
     * <br>
     * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The type of the system event.</p>
     * <br>
     * <p>>  You can call the [DescribeSystemEventMetaList](~~114972~~) operation to view the types of system events.</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The ID of the application group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The level of the system event. Valid values:</p>
     * <br>
     * <p>*   CRITICAL</p>
     * <p>*   WARN</p>
     * <p>*   INFO</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The name of the system event.</p>
     * <br>
     * <p>>  You can call the [DescribeSystemEventMetaList](~~114972~~) operation to view the names of system events.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The abbreviation of the service name.</p>
     * <br>
     * <p>>  You can call the [DescribeSystemEventMetaList](~~114972~~) operation to view the abbreviations of service names.</p>
     */
    @NameInMap("Product")
    public String product;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The keywords contained in the content of the system event to query. You can use a logical operator between keywords. Examples:</p>
     * <br>
     * <p>*   If you need to query the system event whose content contains a and b, set the value to `a and b`.</p>
     * <p>*   If you need to query the system event whose content contains a or b, set the value to `a or b`.</p>
     */
    @NameInMap("SearchKeywords")
    public String searchKeywords;

    /**
     * <p>The beginning of the time range to query.</p>
     * <br>
     * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the system event.</p>
     * <br>
     * <p>>  You can call the [DescribeSystemEventMetaList](~~114972~~) operation to view the statuses of system events.</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeSystemEventHistogramRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemEventHistogramRequest self = new DescribeSystemEventHistogramRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSystemEventHistogramRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSystemEventHistogramRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public DescribeSystemEventHistogramRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeSystemEventHistogramRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public DescribeSystemEventHistogramRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeSystemEventHistogramRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public DescribeSystemEventHistogramRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSystemEventHistogramRequest setSearchKeywords(String searchKeywords) {
        this.searchKeywords = searchKeywords;
        return this;
    }
    public String getSearchKeywords() {
        return this.searchKeywords;
    }

    public DescribeSystemEventHistogramRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSystemEventHistogramRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
