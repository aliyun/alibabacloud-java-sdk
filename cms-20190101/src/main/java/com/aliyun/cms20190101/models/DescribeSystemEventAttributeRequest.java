// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSystemEventAttributeRequest extends TeaModel {
    /**
     * <p>The end of the time range to query.</p>
     * <br>
     * <p>The value must be a UNIX timestamp. It is the number of seconds that have elapsed since 00:00:00 UTC, January 1, 1970.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The type of the system event.</p>
     * <br>
     * <p>>  You can call the [DescribeSystemEventMetaList](~~114972~~) operation to query the types of system events.</p>
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
     * <p>*   CRITICAL: critical</p>
     * <p>*   WARN: warning</p>
     * <p>*   INFO: information</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The name of the system event.</p>
     * <br>
     * <p>>  You can call the [DescribeSystemEventMetaList](~~114972~~) operation to query the names of system events.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Valid values: 1 to 100000000.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Valid values: 1 to 100.</p>
     * <br>
     * <p>Default value: 10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The abbreviation of the service name.</p>
     * <br>
     * <p>>  You can call the [DescribeSystemEventMetaList](~~114972~~) operation to query the abbreviations of service names.</p>
     */
    @NameInMap("Product")
    public String product;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The keywords that are used to search for the system event. Valid values:</p>
     * <br>
     * <p>*   If you want to search for the system event whose content contains a and b, set the value to `a and b`.</p>
     * <p>*   If you want to search for the system event whose content contains a or b, set the value to `a or b`.</p>
     */
    @NameInMap("SearchKeywords")
    public String searchKeywords;

    /**
     * <p>The beginning of the time range to query.</p>
     * <br>
     * <p>The value must be a UNIX timestamp. It is the number of seconds that have elapsed since 00:00:00 UTC, January 1, 1970.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the system event.</p>
     * <br>
     * <p>>  You can call the [DescribeSystemEventMetaList](~~114972~~) operation to query the statuses of system events.</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeSystemEventAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemEventAttributeRequest self = new DescribeSystemEventAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSystemEventAttributeRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSystemEventAttributeRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public DescribeSystemEventAttributeRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeSystemEventAttributeRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public DescribeSystemEventAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeSystemEventAttributeRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSystemEventAttributeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSystemEventAttributeRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public DescribeSystemEventAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSystemEventAttributeRequest setSearchKeywords(String searchKeywords) {
        this.searchKeywords = searchKeywords;
        return this;
    }
    public String getSearchKeywords() {
        return this.searchKeywords;
    }

    public DescribeSystemEventAttributeRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSystemEventAttributeRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
